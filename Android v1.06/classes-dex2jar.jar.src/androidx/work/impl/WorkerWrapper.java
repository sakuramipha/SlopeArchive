package androidx.work.impl;

import android.content.Context;
import androidx.work.Configuration;
import androidx.work.Data;
import androidx.work.InputMerger;
import androidx.work.InputMergerFactory;
import androidx.work.ListenableWorker;
import androidx.work.ListenableWorker.Result;
import androidx.work.ListenableWorker.Result.Failure;
import androidx.work.ListenableWorker.Result.Retry;
import androidx.work.ListenableWorker.Result.Success;
import androidx.work.Logger;
import androidx.work.WorkInfo.State;
import androidx.work.WorkerFactory;
import androidx.work.WorkerParameters;
import androidx.work.WorkerParameters.RuntimeExtras;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.foreground.ForegroundProcessor;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.WorkProgressDao;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkTagDao;
import androidx.work.impl.utils.PackageManagerHelper;
import androidx.work.impl.utils.WorkForegroundRunnable;
import androidx.work.impl.utils.WorkForegroundUpdater;
import androidx.work.impl.utils.WorkProgressUpdater;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;

public class WorkerWrapper
  implements Runnable
{
  static final String TAG = Logger.tagWithPrefix("WorkerWrapper");
  Context mAppContext;
  private Configuration mConfiguration;
  private DependencyDao mDependencyDao;
  private ForegroundProcessor mForegroundProcessor;
  SettableFuture<Boolean> mFuture = SettableFuture.create();
  ListenableFuture<ListenableWorker.Result> mInnerFuture = null;
  private volatile boolean mInterrupted;
  ListenableWorker.Result mResult = ListenableWorker.Result.failure();
  private WorkerParameters.RuntimeExtras mRuntimeExtras;
  private List<Scheduler> mSchedulers;
  private List<String> mTags;
  private WorkDatabase mWorkDatabase;
  private String mWorkDescription;
  WorkSpec mWorkSpec;
  private WorkSpecDao mWorkSpecDao;
  private String mWorkSpecId;
  private WorkTagDao mWorkTagDao;
  TaskExecutor mWorkTaskExecutor;
  ListenableWorker mWorker;
  
  WorkerWrapper(Builder paramBuilder)
  {
    this.mAppContext = paramBuilder.mAppContext;
    this.mWorkTaskExecutor = paramBuilder.mWorkTaskExecutor;
    this.mForegroundProcessor = paramBuilder.mForegroundProcessor;
    this.mWorkSpecId = paramBuilder.mWorkSpecId;
    this.mSchedulers = paramBuilder.mSchedulers;
    this.mRuntimeExtras = paramBuilder.mRuntimeExtras;
    this.mWorker = paramBuilder.mWorker;
    this.mConfiguration = paramBuilder.mConfiguration;
    paramBuilder = paramBuilder.mWorkDatabase;
    this.mWorkDatabase = paramBuilder;
    this.mWorkSpecDao = paramBuilder.workSpecDao();
    this.mDependencyDao = this.mWorkDatabase.dependencyDao();
    this.mWorkTagDao = this.mWorkDatabase.workTagDao();
  }
  
  private String createWorkDescription(List<String> paramList)
  {
    StringBuilder localStringBuilder = new StringBuilder("Work [ id=");
    localStringBuilder.append(this.mWorkSpecId);
    localStringBuilder.append(", tags={ ");
    paramList = paramList.iterator();
    int i = 1;
    while (paramList.hasNext())
    {
      String str = (String)paramList.next();
      if (i != 0) {
        i = 0;
      } else {
        localStringBuilder.append(", ");
      }
      localStringBuilder.append(str);
    }
    localStringBuilder.append(" } ]");
    return localStringBuilder.toString();
  }
  
  private void handleResult(ListenableWorker.Result paramResult)
  {
    if ((paramResult instanceof ListenableWorker.Result.Success))
    {
      Logger.get().info(TAG, String.format("Worker result SUCCESS for %s", new Object[] { this.mWorkDescription }), new Throwable[0]);
      if (this.mWorkSpec.isPeriodic()) {
        resetPeriodicAndResolve();
      } else {
        setSucceededAndResolve();
      }
    }
    else if ((paramResult instanceof ListenableWorker.Result.Retry))
    {
      Logger.get().info(TAG, String.format("Worker result RETRY for %s", new Object[] { this.mWorkDescription }), new Throwable[0]);
      rescheduleAndResolve();
    }
    else
    {
      Logger.get().info(TAG, String.format("Worker result FAILURE for %s", new Object[] { this.mWorkDescription }), new Throwable[0]);
      if (this.mWorkSpec.isPeriodic()) {
        resetPeriodicAndResolve();
      } else {
        setFailedAndResolve();
      }
    }
  }
  
  private void iterativelyFailWorkAndDependents(String paramString)
  {
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.add(paramString);
    while (!localLinkedList.isEmpty())
    {
      paramString = (String)localLinkedList.remove();
      if (this.mWorkSpecDao.getState(paramString) != WorkInfo.State.CANCELLED) {
        this.mWorkSpecDao.setState(WorkInfo.State.FAILED, new String[] { paramString });
      }
      localLinkedList.addAll(this.mDependencyDao.getDependentWorkIds(paramString));
    }
  }
  
  private void rescheduleAndResolve()
  {
    this.mWorkDatabase.beginTransaction();
    try
    {
      this.mWorkSpecDao.setState(WorkInfo.State.ENQUEUED, new String[] { this.mWorkSpecId });
      this.mWorkSpecDao.setPeriodStartTime(this.mWorkSpecId, System.currentTimeMillis());
      this.mWorkSpecDao.markWorkSpecScheduled(this.mWorkSpecId, -1L);
      this.mWorkDatabase.setTransactionSuccessful();
      return;
    }
    finally
    {
      this.mWorkDatabase.endTransaction();
      resolve(true);
    }
  }
  
  private void resetPeriodicAndResolve()
  {
    this.mWorkDatabase.beginTransaction();
    try
    {
      this.mWorkSpecDao.setPeriodStartTime(this.mWorkSpecId, System.currentTimeMillis());
      this.mWorkSpecDao.setState(WorkInfo.State.ENQUEUED, new String[] { this.mWorkSpecId });
      this.mWorkSpecDao.resetWorkSpecRunAttemptCount(this.mWorkSpecId);
      this.mWorkSpecDao.markWorkSpecScheduled(this.mWorkSpecId, -1L);
      this.mWorkDatabase.setTransactionSuccessful();
      return;
    }
    finally
    {
      this.mWorkDatabase.endTransaction();
      resolve(false);
    }
  }
  
  private void resolve(boolean paramBoolean)
  {
    this.mWorkDatabase.beginTransaction();
    try
    {
      if (!this.mWorkDatabase.workSpecDao().hasUnfinishedWork()) {
        PackageManagerHelper.setComponentEnabled(this.mAppContext, RescheduleReceiver.class, false);
      }
      if (paramBoolean)
      {
        this.mWorkSpecDao.setState(WorkInfo.State.ENQUEUED, new String[] { this.mWorkSpecId });
        this.mWorkSpecDao.markWorkSpecScheduled(this.mWorkSpecId, -1L);
      }
      if (this.mWorkSpec != null)
      {
        ListenableWorker localListenableWorker = this.mWorker;
        if ((localListenableWorker != null) && (localListenableWorker.isRunInForeground())) {
          this.mForegroundProcessor.stopForeground(this.mWorkSpecId);
        }
      }
      this.mWorkDatabase.setTransactionSuccessful();
      this.mWorkDatabase.endTransaction();
      this.mFuture.set(Boolean.valueOf(paramBoolean));
      return;
    }
    finally
    {
      this.mWorkDatabase.endTransaction();
    }
  }
  
  private void resolveIncorrectStatus()
  {
    WorkInfo.State localState = this.mWorkSpecDao.getState(this.mWorkSpecId);
    if (localState == WorkInfo.State.RUNNING)
    {
      Logger.get().debug(TAG, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", new Object[] { this.mWorkSpecId }), new Throwable[0]);
      resolve(true);
    }
    else
    {
      Logger.get().debug(TAG, String.format("Status for %s is %s; not doing any work", new Object[] { this.mWorkSpecId, localState }), new Throwable[0]);
      resolve(false);
    }
  }
  
  private void runWorker()
  {
    if (tryCheckForInterruptionAndResolve()) {
      return;
    }
    this.mWorkDatabase.beginTransaction();
    try
    {
      final Object localObject1 = this.mWorkSpecDao.getWorkSpec(this.mWorkSpecId);
      this.mWorkSpec = ((WorkSpec)localObject1);
      if (localObject1 == null)
      {
        Logger.get().error(TAG, String.format("Didn't find WorkSpec for id %s", new Object[] { this.mWorkSpecId }), new Throwable[0]);
        resolve(false);
        this.mWorkDatabase.setTransactionSuccessful();
        return;
      }
      if (((WorkSpec)localObject1).state != WorkInfo.State.ENQUEUED)
      {
        resolveIncorrectStatus();
        this.mWorkDatabase.setTransactionSuccessful();
        Logger.get().debug(TAG, String.format("%s is not in ENQUEUED state. Nothing more to do.", new Object[] { this.mWorkSpec.workerClassName }), new Throwable[0]);
        return;
      }
      if ((this.mWorkSpec.isPeriodic()) || (this.mWorkSpec.isBackedOff()))
      {
        long l = System.currentTimeMillis();
        int i;
        if (this.mWorkSpec.periodStartTime == 0L) {
          i = 1;
        } else {
          i = 0;
        }
        if ((i == 0) && (l < this.mWorkSpec.calculateNextRunTime()))
        {
          Logger.get().debug(TAG, String.format("Delaying execution for %s because it is being executed before schedule.", new Object[] { this.mWorkSpec.workerClassName }), new Throwable[0]);
          resolve(true);
          this.mWorkDatabase.setTransactionSuccessful();
          return;
        }
      }
      this.mWorkDatabase.setTransactionSuccessful();
      this.mWorkDatabase.endTransaction();
      if (this.mWorkSpec.isPeriodic()) {}
      for (localObject1 = this.mWorkSpec.input;; localObject1 = ((InputMerger)localObject3).merge((List)localObject1))
      {
        break;
        localObject3 = this.mConfiguration.getInputMergerFactory().createInputMergerWithDefaultFallback(this.mWorkSpec.inputMergerClassName);
        if (localObject3 == null)
        {
          Logger.get().error(TAG, String.format("Could not create Input Merger %s", new Object[] { this.mWorkSpec.inputMergerClassName }), new Throwable[0]);
          setFailedAndResolve();
          return;
        }
        localObject1 = new ArrayList();
        ((List)localObject1).add(this.mWorkSpec.input);
        ((List)localObject1).addAll(this.mWorkSpecDao.getInputsFromPrerequisites(this.mWorkSpecId));
      }
      final Object localObject3 = new WorkerParameters(UUID.fromString(this.mWorkSpecId), (Data)localObject1, this.mTags, this.mRuntimeExtras, this.mWorkSpec.runAttemptCount, this.mConfiguration.getExecutor(), this.mWorkTaskExecutor, this.mConfiguration.getWorkerFactory(), new WorkProgressUpdater(this.mWorkDatabase, this.mWorkTaskExecutor), new WorkForegroundUpdater(this.mWorkDatabase, this.mForegroundProcessor, this.mWorkTaskExecutor));
      if (this.mWorker == null) {
        this.mWorker = this.mConfiguration.getWorkerFactory().createWorkerWithDefaultFallback(this.mAppContext, this.mWorkSpec.workerClassName, (WorkerParameters)localObject3);
      }
      localObject1 = this.mWorker;
      if (localObject1 == null)
      {
        Logger.get().error(TAG, String.format("Could not create Worker %s", new Object[] { this.mWorkSpec.workerClassName }), new Throwable[0]);
        setFailedAndResolve();
        return;
      }
      if (((ListenableWorker)localObject1).isUsed())
      {
        Logger.get().error(TAG, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", new Object[] { this.mWorkSpec.workerClassName }), new Throwable[0]);
        setFailedAndResolve();
        return;
      }
      this.mWorker.setUsed();
      if (trySetRunning())
      {
        if (tryCheckForInterruptionAndResolve()) {
          return;
        }
        localObject1 = SettableFuture.create();
        localObject3 = new WorkForegroundRunnable(this.mAppContext, this.mWorkSpec, this.mWorker, ((WorkerParameters)localObject3).getForegroundUpdater(), this.mWorkTaskExecutor);
        this.mWorkTaskExecutor.getMainThreadExecutor().execute((Runnable)localObject3);
        localObject3 = ((WorkForegroundRunnable)localObject3).getFuture();
        ((ListenableFuture)localObject3).addListener(new Runnable()
        {
          /* Error */
          public void run()
          {
            // Byte code:
            //   0: aload_0
            //   1: getfield 23	androidx/work/impl/WorkerWrapper$1:val$runExpedited	Lcom/google/common/util/concurrent/ListenableFuture;
            //   4: invokeinterface 35 1 0
            //   9: pop
            //   10: invokestatic 40	androidx/work/Logger:get	()Landroidx/work/Logger;
            //   13: getstatic 44	androidx/work/impl/WorkerWrapper:TAG	Ljava/lang/String;
            //   16: ldc 46
            //   18: iconst_1
            //   19: anewarray 4	java/lang/Object
            //   22: dup
            //   23: iconst_0
            //   24: aload_0
            //   25: getfield 21	androidx/work/impl/WorkerWrapper$1:this$0	Landroidx/work/impl/WorkerWrapper;
            //   28: getfield 50	androidx/work/impl/WorkerWrapper:mWorkSpec	Landroidx/work/impl/model/WorkSpec;
            //   31: getfield 55	androidx/work/impl/model/WorkSpec:workerClassName	Ljava/lang/String;
            //   34: aastore
            //   35: invokestatic 61	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
            //   38: iconst_0
            //   39: anewarray 63	java/lang/Throwable
            //   42: invokevirtual 67	androidx/work/Logger:debug	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
            //   45: aload_0
            //   46: getfield 21	androidx/work/impl/WorkerWrapper$1:this$0	Landroidx/work/impl/WorkerWrapper;
            //   49: astore_1
            //   50: aload_1
            //   51: aload_1
            //   52: getfield 71	androidx/work/impl/WorkerWrapper:mWorker	Landroidx/work/ListenableWorker;
            //   55: invokevirtual 77	androidx/work/ListenableWorker:startWork	()Lcom/google/common/util/concurrent/ListenableFuture;
            //   58: putfield 80	androidx/work/impl/WorkerWrapper:mInnerFuture	Lcom/google/common/util/concurrent/ListenableFuture;
            //   61: aload_0
            //   62: getfield 25	androidx/work/impl/WorkerWrapper$1:val$future	Landroidx/work/impl/utils/futures/SettableFuture;
            //   65: aload_0
            //   66: getfield 21	androidx/work/impl/WorkerWrapper$1:this$0	Landroidx/work/impl/WorkerWrapper;
            //   69: getfield 80	androidx/work/impl/WorkerWrapper:mInnerFuture	Lcom/google/common/util/concurrent/ListenableFuture;
            //   72: invokevirtual 86	androidx/work/impl/utils/futures/SettableFuture:setFuture	(Lcom/google/common/util/concurrent/ListenableFuture;)Z
            //   75: pop
            //   76: goto +13 -> 89
            //   79: astore_1
            //   80: aload_0
            //   81: getfield 25	androidx/work/impl/WorkerWrapper$1:val$future	Landroidx/work/impl/utils/futures/SettableFuture;
            //   84: aload_1
            //   85: invokevirtual 90	androidx/work/impl/utils/futures/SettableFuture:setException	(Ljava/lang/Throwable;)Z
            //   88: pop
            //   89: return
            // Local variable table:
            //   start	length	slot	name	signature
            //   0	90	0	this	1
            //   49	3	1	localWorkerWrapper	WorkerWrapper
            //   79	6	1	localThrowable	Throwable
            // Exception table:
            //   from	to	target	type
            //   0	76	79	finally
          }
        }, this.mWorkTaskExecutor.getMainThreadExecutor());
        ((SettableFuture)localObject1).addListener(new Runnable()
        {
          /* Error */
          public void run()
          {
            // Byte code:
            //   0: aload_0
            //   1: getfield 23	androidx/work/impl/WorkerWrapper$2:val$future	Landroidx/work/impl/utils/futures/SettableFuture;
            //   4: invokevirtual 41	androidx/work/impl/utils/futures/SettableFuture:get	()Ljava/lang/Object;
            //   7: checkcast 43	androidx/work/ListenableWorker$Result
            //   10: astore_1
            //   11: aload_1
            //   12: ifnonnull +41 -> 53
            //   15: invokestatic 48	androidx/work/Logger:get	()Landroidx/work/Logger;
            //   18: getstatic 51	androidx/work/impl/WorkerWrapper:TAG	Ljava/lang/String;
            //   21: ldc 53
            //   23: iconst_1
            //   24: anewarray 4	java/lang/Object
            //   27: dup
            //   28: iconst_0
            //   29: aload_0
            //   30: getfield 21	androidx/work/impl/WorkerWrapper$2:this$0	Landroidx/work/impl/WorkerWrapper;
            //   33: getfield 57	androidx/work/impl/WorkerWrapper:mWorkSpec	Landroidx/work/impl/model/WorkSpec;
            //   36: getfield 62	androidx/work/impl/model/WorkSpec:workerClassName	Ljava/lang/String;
            //   39: aastore
            //   40: invokestatic 68	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
            //   43: iconst_0
            //   44: anewarray 70	java/lang/Throwable
            //   47: invokevirtual 74	androidx/work/Logger:error	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
            //   50: goto +132 -> 182
            //   53: invokestatic 48	androidx/work/Logger:get	()Landroidx/work/Logger;
            //   56: getstatic 51	androidx/work/impl/WorkerWrapper:TAG	Ljava/lang/String;
            //   59: ldc 76
            //   61: iconst_2
            //   62: anewarray 4	java/lang/Object
            //   65: dup
            //   66: iconst_0
            //   67: aload_0
            //   68: getfield 21	androidx/work/impl/WorkerWrapper$2:this$0	Landroidx/work/impl/WorkerWrapper;
            //   71: getfield 57	androidx/work/impl/WorkerWrapper:mWorkSpec	Landroidx/work/impl/model/WorkSpec;
            //   74: getfield 62	androidx/work/impl/model/WorkSpec:workerClassName	Ljava/lang/String;
            //   77: aastore
            //   78: dup
            //   79: iconst_1
            //   80: aload_1
            //   81: aastore
            //   82: invokestatic 68	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
            //   85: iconst_0
            //   86: anewarray 70	java/lang/Throwable
            //   89: invokevirtual 79	androidx/work/Logger:debug	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
            //   92: aload_0
            //   93: getfield 21	androidx/work/impl/WorkerWrapper$2:this$0	Landroidx/work/impl/WorkerWrapper;
            //   96: aload_1
            //   97: putfield 83	androidx/work/impl/WorkerWrapper:mResult	Landroidx/work/ListenableWorker$Result;
            //   100: goto +82 -> 182
            //   103: astore_1
            //   104: goto +86 -> 190
            //   107: astore_1
            //   108: goto +4 -> 112
            //   111: astore_1
            //   112: invokestatic 48	androidx/work/Logger:get	()Landroidx/work/Logger;
            //   115: getstatic 51	androidx/work/impl/WorkerWrapper:TAG	Ljava/lang/String;
            //   118: ldc 85
            //   120: iconst_1
            //   121: anewarray 4	java/lang/Object
            //   124: dup
            //   125: iconst_0
            //   126: aload_0
            //   127: getfield 25	androidx/work/impl/WorkerWrapper$2:val$workDescription	Ljava/lang/String;
            //   130: aastore
            //   131: invokestatic 68	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
            //   134: iconst_1
            //   135: anewarray 70	java/lang/Throwable
            //   138: dup
            //   139: iconst_0
            //   140: aload_1
            //   141: aastore
            //   142: invokevirtual 74	androidx/work/Logger:error	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
            //   145: goto +37 -> 182
            //   148: astore_1
            //   149: invokestatic 48	androidx/work/Logger:get	()Landroidx/work/Logger;
            //   152: getstatic 51	androidx/work/impl/WorkerWrapper:TAG	Ljava/lang/String;
            //   155: ldc 87
            //   157: iconst_1
            //   158: anewarray 4	java/lang/Object
            //   161: dup
            //   162: iconst_0
            //   163: aload_0
            //   164: getfield 25	androidx/work/impl/WorkerWrapper$2:val$workDescription	Ljava/lang/String;
            //   167: aastore
            //   168: invokestatic 68	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
            //   171: iconst_1
            //   172: anewarray 70	java/lang/Throwable
            //   175: dup
            //   176: iconst_0
            //   177: aload_1
            //   178: aastore
            //   179: invokevirtual 90	androidx/work/Logger:info	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
            //   182: aload_0
            //   183: getfield 21	androidx/work/impl/WorkerWrapper$2:this$0	Landroidx/work/impl/WorkerWrapper;
            //   186: invokevirtual 93	androidx/work/impl/WorkerWrapper:onWorkFinished	()V
            //   189: return
            //   190: aload_0
            //   191: getfield 21	androidx/work/impl/WorkerWrapper$2:this$0	Landroidx/work/impl/WorkerWrapper;
            //   194: invokevirtual 93	androidx/work/impl/WorkerWrapper:onWorkFinished	()V
            //   197: aload_1
            //   198: athrow
            // Local variable table:
            //   start	length	slot	name	signature
            //   0	199	0	this	2
            //   10	87	1	localResult	ListenableWorker.Result
            //   103	1	1	localObject	Object
            //   107	1	1	localExecutionException	java.util.concurrent.ExecutionException
            //   111	30	1	localInterruptedException	InterruptedException
            //   148	50	1	localCancellationException	java.util.concurrent.CancellationException
            // Exception table:
            //   from	to	target	type
            //   0	11	103	finally
            //   15	50	103	finally
            //   53	100	103	finally
            //   112	145	103	finally
            //   149	182	103	finally
            //   0	11	107	java/util/concurrent/ExecutionException
            //   15	50	107	java/util/concurrent/ExecutionException
            //   53	100	107	java/util/concurrent/ExecutionException
            //   0	11	111	java/lang/InterruptedException
            //   15	50	111	java/lang/InterruptedException
            //   53	100	111	java/lang/InterruptedException
            //   0	11	148	java/util/concurrent/CancellationException
            //   15	50	148	java/util/concurrent/CancellationException
            //   53	100	148	java/util/concurrent/CancellationException
          }
        }, this.mWorkTaskExecutor.getBackgroundExecutor());
      }
      else
      {
        resolveIncorrectStatus();
      }
      return;
    }
    finally
    {
      this.mWorkDatabase.endTransaction();
    }
  }
  
  private void setSucceededAndResolve()
  {
    this.mWorkDatabase.beginTransaction();
    try
    {
      this.mWorkSpecDao.setState(WorkInfo.State.SUCCEEDED, new String[] { this.mWorkSpecId });
      Object localObject1 = ((ListenableWorker.Result.Success)this.mResult).getOutputData();
      this.mWorkSpecDao.setOutput(this.mWorkSpecId, (Data)localObject1);
      long l = System.currentTimeMillis();
      Iterator localIterator = this.mDependencyDao.getDependentWorkIds(this.mWorkSpecId).iterator();
      while (localIterator.hasNext())
      {
        localObject1 = (String)localIterator.next();
        if ((this.mWorkSpecDao.getState((String)localObject1) == WorkInfo.State.BLOCKED) && (this.mDependencyDao.hasCompletedAllPrerequisites((String)localObject1)))
        {
          Logger.get().info(TAG, String.format("Setting status to enqueued for %s", new Object[] { localObject1 }), new Throwable[0]);
          this.mWorkSpecDao.setState(WorkInfo.State.ENQUEUED, new String[] { localObject1 });
          this.mWorkSpecDao.setPeriodStartTime((String)localObject1, l);
        }
      }
      this.mWorkDatabase.setTransactionSuccessful();
      return;
    }
    finally
    {
      this.mWorkDatabase.endTransaction();
      resolve(false);
    }
  }
  
  private boolean tryCheckForInterruptionAndResolve()
  {
    if (this.mInterrupted)
    {
      Logger.get().debug(TAG, String.format("Work interrupted for %s", new Object[] { this.mWorkDescription }), new Throwable[0]);
      WorkInfo.State localState = this.mWorkSpecDao.getState(this.mWorkSpecId);
      if (localState == null) {
        resolve(false);
      } else {
        resolve(localState.isFinished() ^ true);
      }
      return true;
    }
    return false;
  }
  
  private boolean trySetRunning()
  {
    this.mWorkDatabase.beginTransaction();
    try
    {
      WorkInfo.State localState1 = this.mWorkSpecDao.getState(this.mWorkSpecId);
      WorkInfo.State localState2 = WorkInfo.State.ENQUEUED;
      boolean bool = true;
      if (localState1 == localState2)
      {
        this.mWorkSpecDao.setState(WorkInfo.State.RUNNING, new String[] { this.mWorkSpecId });
        this.mWorkSpecDao.incrementWorkSpecRunAttemptCount(this.mWorkSpecId);
      }
      else
      {
        bool = false;
      }
      this.mWorkDatabase.setTransactionSuccessful();
      return bool;
    }
    finally
    {
      this.mWorkDatabase.endTransaction();
    }
  }
  
  public ListenableFuture<Boolean> getFuture()
  {
    return this.mFuture;
  }
  
  public void interrupt()
  {
    this.mInterrupted = true;
    tryCheckForInterruptionAndResolve();
    Object localObject = this.mInnerFuture;
    boolean bool;
    if (localObject != null)
    {
      bool = ((ListenableFuture)localObject).isDone();
      this.mInnerFuture.cancel(true);
    }
    else
    {
      bool = false;
    }
    localObject = this.mWorker;
    if ((localObject != null) && (!bool))
    {
      ((ListenableWorker)localObject).stop();
    }
    else
    {
      localObject = String.format("WorkSpec %s is already done. Not interrupting.", new Object[] { this.mWorkSpec });
      Logger.get().debug(TAG, (String)localObject, new Throwable[0]);
    }
  }
  
  void onWorkFinished()
  {
    if (!tryCheckForInterruptionAndResolve())
    {
      this.mWorkDatabase.beginTransaction();
      try
      {
        WorkInfo.State localState = this.mWorkSpecDao.getState(this.mWorkSpecId);
        this.mWorkDatabase.workProgressDao().delete(this.mWorkSpecId);
        if (localState == null) {
          resolve(false);
        } else if (localState == WorkInfo.State.RUNNING) {
          handleResult(this.mResult);
        } else if (!localState.isFinished()) {
          rescheduleAndResolve();
        }
        this.mWorkDatabase.setTransactionSuccessful();
      }
      finally
      {
        this.mWorkDatabase.endTransaction();
      }
    }
    Object localObject2 = this.mSchedulers;
    if (localObject2 != null)
    {
      localObject2 = ((List)localObject2).iterator();
      while (((Iterator)localObject2).hasNext()) {
        ((Scheduler)((Iterator)localObject2).next()).cancel(this.mWorkSpecId);
      }
      Schedulers.schedule(this.mConfiguration, this.mWorkDatabase, this.mSchedulers);
    }
  }
  
  public void run()
  {
    List localList = this.mWorkTagDao.getTagsForWorkSpecId(this.mWorkSpecId);
    this.mTags = localList;
    this.mWorkDescription = createWorkDescription(localList);
    runWorker();
  }
  
  void setFailedAndResolve()
  {
    this.mWorkDatabase.beginTransaction();
    try
    {
      iterativelyFailWorkAndDependents(this.mWorkSpecId);
      Data localData = ((ListenableWorker.Result.Failure)this.mResult).getOutputData();
      this.mWorkSpecDao.setOutput(this.mWorkSpecId, localData);
      this.mWorkDatabase.setTransactionSuccessful();
      return;
    }
    finally
    {
      this.mWorkDatabase.endTransaction();
      resolve(false);
    }
  }
  
  public static class Builder
  {
    Context mAppContext;
    Configuration mConfiguration;
    ForegroundProcessor mForegroundProcessor;
    WorkerParameters.RuntimeExtras mRuntimeExtras = new WorkerParameters.RuntimeExtras();
    List<Scheduler> mSchedulers;
    WorkDatabase mWorkDatabase;
    String mWorkSpecId;
    TaskExecutor mWorkTaskExecutor;
    ListenableWorker mWorker;
    
    public Builder(Context paramContext, Configuration paramConfiguration, TaskExecutor paramTaskExecutor, ForegroundProcessor paramForegroundProcessor, WorkDatabase paramWorkDatabase, String paramString)
    {
      this.mAppContext = paramContext.getApplicationContext();
      this.mWorkTaskExecutor = paramTaskExecutor;
      this.mForegroundProcessor = paramForegroundProcessor;
      this.mConfiguration = paramConfiguration;
      this.mWorkDatabase = paramWorkDatabase;
      this.mWorkSpecId = paramString;
    }
    
    public WorkerWrapper build()
    {
      return new WorkerWrapper(this);
    }
    
    public Builder withRuntimeExtras(WorkerParameters.RuntimeExtras paramRuntimeExtras)
    {
      if (paramRuntimeExtras != null) {
        this.mRuntimeExtras = paramRuntimeExtras;
      }
      return this;
    }
    
    public Builder withSchedulers(List<Scheduler> paramList)
    {
      this.mSchedulers = paramList;
      return this;
    }
    
    public Builder withWorker(ListenableWorker paramListenableWorker)
    {
      this.mWorker = paramListenableWorker;
      return this;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\impl\WorkerWrapper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */