package androidx.work.impl.utils;

import androidx.work.Operation;
import androidx.work.WorkInfo.State;
import androidx.work.impl.OperationImpl;
import androidx.work.impl.Processor;
import androidx.work.impl.Scheduler;
import androidx.work.impl.Schedulers;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.WorkSpecDao;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public abstract class CancelWorkRunnable
  implements Runnable
{
  private final OperationImpl mOperation = new OperationImpl();
  
  public static CancelWorkRunnable forAll(WorkManagerImpl paramWorkManagerImpl)
  {
    new CancelWorkRunnable()
    {
      void runInternal()
      {
        WorkDatabase localWorkDatabase = CancelWorkRunnable.this.getWorkDatabase();
        localWorkDatabase.beginTransaction();
        try
        {
          Object localObject1 = localWorkDatabase.workSpecDao().getAllUnfinishedWork().iterator();
          while (((Iterator)localObject1).hasNext())
          {
            String str = (String)((Iterator)localObject1).next();
            cancel(CancelWorkRunnable.this, str);
          }
          localObject1 = new androidx/work/impl/utils/PreferenceUtils;
          ((PreferenceUtils)localObject1).<init>(CancelWorkRunnable.this.getWorkDatabase());
          ((PreferenceUtils)localObject1).setLastCancelAllTimeMillis(System.currentTimeMillis());
          localWorkDatabase.setTransactionSuccessful();
          return;
        }
        finally
        {
          localWorkDatabase.endTransaction();
        }
      }
    };
  }
  
  public static CancelWorkRunnable forId(final UUID paramUUID, WorkManagerImpl paramWorkManagerImpl)
  {
    new CancelWorkRunnable()
    {
      void runInternal()
      {
        WorkDatabase localWorkDatabase = CancelWorkRunnable.this.getWorkDatabase();
        localWorkDatabase.beginTransaction();
        try
        {
          cancel(CancelWorkRunnable.this, paramUUID.toString());
          localWorkDatabase.setTransactionSuccessful();
          localWorkDatabase.endTransaction();
          reschedulePendingWorkers(CancelWorkRunnable.this);
          return;
        }
        finally
        {
          localWorkDatabase.endTransaction();
        }
      }
    };
  }
  
  public static CancelWorkRunnable forName(final String paramString, WorkManagerImpl paramWorkManagerImpl, final boolean paramBoolean)
  {
    new CancelWorkRunnable()
    {
      void runInternal()
      {
        WorkDatabase localWorkDatabase = CancelWorkRunnable.this.getWorkDatabase();
        localWorkDatabase.beginTransaction();
        try
        {
          Iterator localIterator = localWorkDatabase.workSpecDao().getUnfinishedWorkWithName(paramString).iterator();
          while (localIterator.hasNext())
          {
            String str = (String)localIterator.next();
            cancel(CancelWorkRunnable.this, str);
          }
          localWorkDatabase.setTransactionSuccessful();
          localWorkDatabase.endTransaction();
          if (paramBoolean) {
            reschedulePendingWorkers(CancelWorkRunnable.this);
          }
          return;
        }
        finally
        {
          localWorkDatabase.endTransaction();
        }
      }
    };
  }
  
  public static CancelWorkRunnable forTag(final String paramString, WorkManagerImpl paramWorkManagerImpl)
  {
    new CancelWorkRunnable()
    {
      void runInternal()
      {
        WorkDatabase localWorkDatabase = CancelWorkRunnable.this.getWorkDatabase();
        localWorkDatabase.beginTransaction();
        try
        {
          Iterator localIterator = localWorkDatabase.workSpecDao().getUnfinishedWorkWithTag(paramString).iterator();
          while (localIterator.hasNext())
          {
            String str = (String)localIterator.next();
            cancel(CancelWorkRunnable.this, str);
          }
          localWorkDatabase.setTransactionSuccessful();
          localWorkDatabase.endTransaction();
          reschedulePendingWorkers(CancelWorkRunnable.this);
          return;
        }
        finally
        {
          localWorkDatabase.endTransaction();
        }
      }
    };
  }
  
  private void iterativelyCancelWorkAndDependents(WorkDatabase paramWorkDatabase, String paramString)
  {
    WorkSpecDao localWorkSpecDao = paramWorkDatabase.workSpecDao();
    paramWorkDatabase = paramWorkDatabase.dependencyDao();
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.add(paramString);
    while (!localLinkedList.isEmpty())
    {
      paramString = (String)localLinkedList.remove();
      WorkInfo.State localState = localWorkSpecDao.getState(paramString);
      if ((localState != WorkInfo.State.SUCCEEDED) && (localState != WorkInfo.State.FAILED)) {
        localWorkSpecDao.setState(WorkInfo.State.CANCELLED, new String[] { paramString });
      }
      localLinkedList.addAll(paramWorkDatabase.getDependentWorkIds(paramString));
    }
  }
  
  void cancel(WorkManagerImpl paramWorkManagerImpl, String paramString)
  {
    iterativelyCancelWorkAndDependents(paramWorkManagerImpl.getWorkDatabase(), paramString);
    paramWorkManagerImpl.getProcessor().stopAndCancelWork(paramString);
    paramWorkManagerImpl = paramWorkManagerImpl.getSchedulers().iterator();
    while (paramWorkManagerImpl.hasNext()) {
      ((Scheduler)paramWorkManagerImpl.next()).cancel(paramString);
    }
  }
  
  public Operation getOperation()
  {
    return this.mOperation;
  }
  
  void reschedulePendingWorkers(WorkManagerImpl paramWorkManagerImpl)
  {
    Schedulers.schedule(paramWorkManagerImpl.getConfiguration(), paramWorkManagerImpl.getWorkDatabase(), paramWorkManagerImpl.getSchedulers());
  }
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 166	androidx/work/impl/utils/CancelWorkRunnable:runInternal	()V
    //   4: aload_0
    //   5: getfield 25	androidx/work/impl/utils/CancelWorkRunnable:mOperation	Landroidx/work/impl/OperationImpl;
    //   8: getstatic 172	androidx/work/Operation:SUCCESS	Landroidx/work/Operation$State$SUCCESS;
    //   11: invokevirtual 175	androidx/work/impl/OperationImpl:setState	(Landroidx/work/Operation$State;)V
    //   14: goto +19 -> 33
    //   17: astore_1
    //   18: aload_0
    //   19: getfield 25	androidx/work/impl/utils/CancelWorkRunnable:mOperation	Landroidx/work/impl/OperationImpl;
    //   22: new 177	androidx/work/Operation$State$FAILURE
    //   25: dup
    //   26: aload_1
    //   27: invokespecial 180	androidx/work/Operation$State$FAILURE:<init>	(Ljava/lang/Throwable;)V
    //   30: invokevirtual 175	androidx/work/impl/OperationImpl:setState	(Landroidx/work/Operation$State;)V
    //   33: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	34	0	this	CancelWorkRunnable
    //   17	10	1	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   0	14	17	finally
  }
  
  abstract void runInternal();
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\imp\\utils\CancelWorkRunnable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */