package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.ListenableWorker.Result;
import androidx.work.Logger;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.constraints.WorkConstraintsCallback;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Executor;

public class ConstraintTrackingWorker
  extends ListenableWorker
  implements WorkConstraintsCallback
{
  public static final String ARGUMENT_CLASS_NAME = "androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME";
  private static final String TAG = Logger.tagWithPrefix("ConstraintTrkngWrkr");
  volatile boolean mAreConstraintsUnmet;
  private ListenableWorker mDelegate;
  SettableFuture<ListenableWorker.Result> mFuture;
  final Object mLock;
  private WorkerParameters mWorkerParameters;
  
  public ConstraintTrackingWorker(Context paramContext, WorkerParameters paramWorkerParameters)
  {
    super(paramContext, paramWorkerParameters);
    this.mWorkerParameters = paramWorkerParameters;
    this.mLock = new Object();
    this.mAreConstraintsUnmet = false;
    this.mFuture = SettableFuture.create();
  }
  
  public ListenableWorker getDelegate()
  {
    return this.mDelegate;
  }
  
  public TaskExecutor getTaskExecutor()
  {
    return WorkManagerImpl.getInstance(getApplicationContext()).getWorkTaskExecutor();
  }
  
  public WorkDatabase getWorkDatabase()
  {
    return WorkManagerImpl.getInstance(getApplicationContext()).getWorkDatabase();
  }
  
  public boolean isRunInForeground()
  {
    ListenableWorker localListenableWorker = this.mDelegate;
    boolean bool;
    if ((localListenableWorker != null) && (localListenableWorker.isRunInForeground())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void onAllConstraintsMet(List<String> paramList) {}
  
  public void onAllConstraintsNotMet(List<String> arg1)
  {
    Logger.get().debug(TAG, String.format("Constraints changed for %s", new Object[] { ??? }), new Throwable[0]);
    synchronized (this.mLock)
    {
      this.mAreConstraintsUnmet = true;
      return;
    }
  }
  
  public void onStopped()
  {
    super.onStopped();
    ListenableWorker localListenableWorker = this.mDelegate;
    if ((localListenableWorker != null) && (!localListenableWorker.isStopped())) {
      this.mDelegate.stop();
    }
  }
  
  void setFutureFailed()
  {
    this.mFuture.set(ListenableWorker.Result.failure());
  }
  
  void setFutureRetry()
  {
    this.mFuture.set(ListenableWorker.Result.retry());
  }
  
  /* Error */
  void setupAndRunConstraintTrackingWork()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 140	androidx/work/impl/workers/ConstraintTrackingWorker:getInputData	()Landroidx/work/Data;
    //   4: ldc 14
    //   6: invokevirtual 145	androidx/work/Data:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   9: astore_1
    //   10: aload_1
    //   11: invokestatic 151	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   14: ifeq +23 -> 37
    //   17: invokestatic 97	androidx/work/Logger:get	()Landroidx/work/Logger;
    //   20: getstatic 38	androidx/work/impl/workers/ConstraintTrackingWorker:TAG	Ljava/lang/String;
    //   23: ldc -103
    //   25: iconst_0
    //   26: anewarray 107	java/lang/Throwable
    //   29: invokevirtual 156	androidx/work/Logger:error	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
    //   32: aload_0
    //   33: invokevirtual 158	androidx/work/impl/workers/ConstraintTrackingWorker:setFutureFailed	()V
    //   36: return
    //   37: aload_0
    //   38: invokevirtual 162	androidx/work/impl/workers/ConstraintTrackingWorker:getWorkerFactory	()Landroidx/work/WorkerFactory;
    //   41: aload_0
    //   42: invokevirtual 71	androidx/work/impl/workers/ConstraintTrackingWorker:getApplicationContext	()Landroid/content/Context;
    //   45: aload_1
    //   46: aload_0
    //   47: getfield 45	androidx/work/impl/workers/ConstraintTrackingWorker:mWorkerParameters	Landroidx/work/WorkerParameters;
    //   50: invokevirtual 168	androidx/work/WorkerFactory:createWorkerWithDefaultFallback	(Landroid/content/Context;Ljava/lang/String;Landroidx/work/WorkerParameters;)Landroidx/work/ListenableWorker;
    //   53: astore_2
    //   54: aload_0
    //   55: aload_2
    //   56: putfield 65	androidx/work/impl/workers/ConstraintTrackingWorker:mDelegate	Landroidx/work/ListenableWorker;
    //   59: aload_2
    //   60: ifnonnull +23 -> 83
    //   63: invokestatic 97	androidx/work/Logger:get	()Landroidx/work/Logger;
    //   66: getstatic 38	androidx/work/impl/workers/ConstraintTrackingWorker:TAG	Ljava/lang/String;
    //   69: ldc -103
    //   71: iconst_0
    //   72: anewarray 107	java/lang/Throwable
    //   75: invokevirtual 111	androidx/work/Logger:debug	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
    //   78: aload_0
    //   79: invokevirtual 158	androidx/work/impl/workers/ConstraintTrackingWorker:setFutureFailed	()V
    //   82: return
    //   83: aload_0
    //   84: invokevirtual 169	androidx/work/impl/workers/ConstraintTrackingWorker:getWorkDatabase	()Landroidx/work/impl/WorkDatabase;
    //   87: invokevirtual 175	androidx/work/impl/WorkDatabase:workSpecDao	()Landroidx/work/impl/model/WorkSpecDao;
    //   90: aload_0
    //   91: invokevirtual 179	androidx/work/impl/workers/ConstraintTrackingWorker:getId	()Ljava/util/UUID;
    //   94: invokevirtual 185	java/util/UUID:toString	()Ljava/lang/String;
    //   97: invokeinterface 191 2 0
    //   102: astore_3
    //   103: aload_3
    //   104: ifnonnull +8 -> 112
    //   107: aload_0
    //   108: invokevirtual 158	androidx/work/impl/workers/ConstraintTrackingWorker:setFutureFailed	()V
    //   111: return
    //   112: new 193	androidx/work/impl/constraints/WorkConstraintsTracker
    //   115: dup
    //   116: aload_0
    //   117: invokevirtual 71	androidx/work/impl/workers/ConstraintTrackingWorker:getApplicationContext	()Landroid/content/Context;
    //   120: aload_0
    //   121: invokevirtual 195	androidx/work/impl/workers/ConstraintTrackingWorker:getTaskExecutor	()Landroidx/work/impl/utils/taskexecutor/TaskExecutor;
    //   124: aload_0
    //   125: invokespecial 198	androidx/work/impl/constraints/WorkConstraintsTracker:<init>	(Landroid/content/Context;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/constraints/WorkConstraintsCallback;)V
    //   128: astore_2
    //   129: aload_2
    //   130: aload_3
    //   131: invokestatic 204	java/util/Collections:singletonList	(Ljava/lang/Object;)Ljava/util/List;
    //   134: invokevirtual 208	androidx/work/impl/constraints/WorkConstraintsTracker:replace	(Ljava/lang/Iterable;)V
    //   137: aload_2
    //   138: aload_0
    //   139: invokevirtual 179	androidx/work/impl/workers/ConstraintTrackingWorker:getId	()Ljava/util/UUID;
    //   142: invokevirtual 185	java/util/UUID:toString	()Ljava/lang/String;
    //   145: invokevirtual 212	androidx/work/impl/constraints/WorkConstraintsTracker:areAllConstraintsMet	(Ljava/lang/String;)Z
    //   148: ifeq +146 -> 294
    //   151: invokestatic 97	androidx/work/Logger:get	()Landroidx/work/Logger;
    //   154: getstatic 38	androidx/work/impl/workers/ConstraintTrackingWorker:TAG	Ljava/lang/String;
    //   157: ldc -42
    //   159: iconst_1
    //   160: anewarray 47	java/lang/Object
    //   163: dup
    //   164: iconst_0
    //   165: aload_1
    //   166: aastore
    //   167: invokestatic 105	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   170: iconst_0
    //   171: anewarray 107	java/lang/Throwable
    //   174: invokevirtual 111	androidx/work/Logger:debug	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
    //   177: aload_0
    //   178: getfield 65	androidx/work/impl/workers/ConstraintTrackingWorker:mDelegate	Landroidx/work/ListenableWorker;
    //   181: invokevirtual 218	androidx/work/ListenableWorker:startWork	()Lcom/google/common/util/concurrent/ListenableFuture;
    //   184: astore_2
    //   185: new 10	androidx/work/impl/workers/ConstraintTrackingWorker$2
    //   188: astore_3
    //   189: aload_3
    //   190: aload_0
    //   191: aload_2
    //   192: invokespecial 221	androidx/work/impl/workers/ConstraintTrackingWorker$2:<init>	(Landroidx/work/impl/workers/ConstraintTrackingWorker;Lcom/google/common/util/concurrent/ListenableFuture;)V
    //   195: aload_2
    //   196: aload_3
    //   197: aload_0
    //   198: invokevirtual 225	androidx/work/impl/workers/ConstraintTrackingWorker:getBackgroundExecutor	()Ljava/util/concurrent/Executor;
    //   201: invokeinterface 231 3 0
    //   206: goto +118 -> 324
    //   209: astore 4
    //   211: invokestatic 97	androidx/work/Logger:get	()Landroidx/work/Logger;
    //   214: astore_3
    //   215: getstatic 38	androidx/work/impl/workers/ConstraintTrackingWorker:TAG	Ljava/lang/String;
    //   218: astore_2
    //   219: aload_3
    //   220: aload_2
    //   221: ldc -23
    //   223: iconst_1
    //   224: anewarray 47	java/lang/Object
    //   227: dup
    //   228: iconst_0
    //   229: aload_1
    //   230: aastore
    //   231: invokestatic 105	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   234: iconst_1
    //   235: anewarray 107	java/lang/Throwable
    //   238: dup
    //   239: iconst_0
    //   240: aload 4
    //   242: aastore
    //   243: invokevirtual 111	androidx/work/Logger:debug	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
    //   246: aload_0
    //   247: getfield 51	androidx/work/impl/workers/ConstraintTrackingWorker:mLock	Ljava/lang/Object;
    //   250: astore_1
    //   251: aload_1
    //   252: monitorenter
    //   253: aload_0
    //   254: getfield 53	androidx/work/impl/workers/ConstraintTrackingWorker:mAreConstraintsUnmet	Z
    //   257: ifeq +23 -> 280
    //   260: invokestatic 97	androidx/work/Logger:get	()Landroidx/work/Logger;
    //   263: aload_2
    //   264: ldc -21
    //   266: iconst_0
    //   267: anewarray 107	java/lang/Throwable
    //   270: invokevirtual 111	androidx/work/Logger:debug	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
    //   273: aload_0
    //   274: invokevirtual 237	androidx/work/impl/workers/ConstraintTrackingWorker:setFutureRetry	()V
    //   277: goto +7 -> 284
    //   280: aload_0
    //   281: invokevirtual 158	androidx/work/impl/workers/ConstraintTrackingWorker:setFutureFailed	()V
    //   284: aload_1
    //   285: monitorexit
    //   286: goto +38 -> 324
    //   289: astore_2
    //   290: aload_1
    //   291: monitorexit
    //   292: aload_2
    //   293: athrow
    //   294: invokestatic 97	androidx/work/Logger:get	()Landroidx/work/Logger;
    //   297: getstatic 38	androidx/work/impl/workers/ConstraintTrackingWorker:TAG	Ljava/lang/String;
    //   300: ldc -17
    //   302: iconst_1
    //   303: anewarray 47	java/lang/Object
    //   306: dup
    //   307: iconst_0
    //   308: aload_1
    //   309: aastore
    //   310: invokestatic 105	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   313: iconst_0
    //   314: anewarray 107	java/lang/Throwable
    //   317: invokevirtual 111	androidx/work/Logger:debug	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
    //   320: aload_0
    //   321: invokevirtual 237	androidx/work/impl/workers/ConstraintTrackingWorker:setFutureRetry	()V
    //   324: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	325	0	this	ConstraintTrackingWorker
    //   53	211	2	localObject2	Object
    //   289	4	2	localObject3	Object
    //   102	118	3	localObject4	Object
    //   209	32	4	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   177	206	209	finally
    //   253	277	289	finally
    //   280	284	289	finally
    //   284	286	289	finally
    //   290	292	289	finally
  }
  
  public ListenableFuture<ListenableWorker.Result> startWork()
  {
    getBackgroundExecutor().execute(new Runnable()
    {
      public void run()
      {
        ConstraintTrackingWorker.this.setupAndRunConstraintTrackingWork();
      }
    });
    return this.mFuture;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\impl\workers\ConstraintTrackingWorker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */