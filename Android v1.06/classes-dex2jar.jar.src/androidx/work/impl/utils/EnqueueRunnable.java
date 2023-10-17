package androidx.work.impl.utils;

import android.os.Build.VERSION;
import android.text.TextUtils;
import androidx.work.Constraints;
import androidx.work.Data.Builder;
import androidx.work.ExistingWorkPolicy;
import androidx.work.Logger;
import androidx.work.Operation;
import androidx.work.Operation.State.FAILURE;
import androidx.work.WorkInfo.State;
import androidx.work.WorkRequest;
import androidx.work.impl.OperationImpl;
import androidx.work.impl.Scheduler;
import androidx.work.impl.Schedulers;
import androidx.work.impl.WorkContinuationImpl;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.model.Dependency;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.WorkName;
import androidx.work.impl.model.WorkNameDao;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpec.IdAndState;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkTag;
import androidx.work.impl.model.WorkTagDao;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class EnqueueRunnable
  implements Runnable
{
  private static final String TAG = Logger.tagWithPrefix("EnqueueRunnable");
  private final OperationImpl mOperation;
  private final WorkContinuationImpl mWorkContinuation;
  
  public EnqueueRunnable(WorkContinuationImpl paramWorkContinuationImpl)
  {
    this.mWorkContinuation = paramWorkContinuationImpl;
    this.mOperation = new OperationImpl();
  }
  
  private static boolean enqueueContinuation(WorkContinuationImpl paramWorkContinuationImpl)
  {
    Set localSet = WorkContinuationImpl.prerequisitesFor(paramWorkContinuationImpl);
    boolean bool = enqueueWorkWithPrerequisites(paramWorkContinuationImpl.getWorkManagerImpl(), paramWorkContinuationImpl.getWork(), (String[])localSet.toArray(new String[0]), paramWorkContinuationImpl.getName(), paramWorkContinuationImpl.getExistingWorkPolicy());
    paramWorkContinuationImpl.markEnqueued();
    return bool;
  }
  
  private static boolean enqueueWorkWithPrerequisites(WorkManagerImpl paramWorkManagerImpl, List<? extends WorkRequest> paramList, String[] paramArrayOfString, String paramString, ExistingWorkPolicy paramExistingWorkPolicy)
  {
    long l = System.currentTimeMillis();
    WorkDatabase localWorkDatabase = paramWorkManagerImpl.getWorkDatabase();
    if ((paramArrayOfString != null) && (paramArrayOfString.length > 0)) {
      m = 1;
    } else {
      m = 0;
    }
    int i4;
    Object localObject2;
    if (m != 0)
    {
      i4 = paramArrayOfString.length;
      i3 = 0;
      i2 = 1;
      i1 = 0;
      for (n = 0;; n = i)
      {
        k = i2;
        j = i1;
        i = n;
        if (i3 >= i4) {
          break;
        }
        localObject2 = paramArrayOfString[i3];
        localObject1 = localWorkDatabase.workSpecDao().getWorkSpec((String)localObject2);
        if (localObject1 == null)
        {
          Logger.get().error(TAG, String.format("Prerequisite %s doesn't exist; not enqueuing", new Object[] { localObject2 }), new Throwable[0]);
          return false;
        }
        localObject1 = ((WorkSpec)localObject1).state;
        if (localObject1 == WorkInfo.State.SUCCEEDED) {
          i = 1;
        } else {
          i = 0;
        }
        i2 &= i;
        if (localObject1 == WorkInfo.State.FAILED)
        {
          i = 1;
        }
        else
        {
          i = n;
          if (localObject1 == WorkInfo.State.CANCELLED)
          {
            i1 = 1;
            i = n;
          }
        }
        i3++;
      }
    }
    int k = 1;
    int j = 0;
    int i = 0;
    boolean bool1 = TextUtils.isEmpty(paramString) ^ true;
    if ((bool1) && (m == 0)) {
      i4 = 1;
    } else {
      i4 = 0;
    }
    Object localObject1 = paramArrayOfString;
    int i1 = m;
    int i2 = k;
    int n = j;
    int i3 = i;
    if (i4 != 0)
    {
      Object localObject3 = localWorkDatabase.workSpecDao().getWorkSpecIdAndStatesForName(paramString);
      localObject1 = paramArrayOfString;
      i1 = m;
      i2 = k;
      n = j;
      i3 = i;
      if (!((List)localObject3).isEmpty())
      {
        if ((paramExistingWorkPolicy != ExistingWorkPolicy.APPEND) && (paramExistingWorkPolicy != ExistingWorkPolicy.APPEND_OR_REPLACE))
        {
          if (paramExistingWorkPolicy == ExistingWorkPolicy.KEEP)
          {
            localObject1 = ((List)localObject3).iterator();
            while (((Iterator)localObject1).hasNext())
            {
              paramExistingWorkPolicy = (WorkSpec.IdAndState)((Iterator)localObject1).next();
              if ((paramExistingWorkPolicy.state != WorkInfo.State.ENQUEUED) && (paramExistingWorkPolicy.state != WorkInfo.State.RUNNING)) {}
              return false;
            }
          }
          CancelWorkRunnable.forName(paramString, paramWorkManagerImpl, false).run();
          paramExistingWorkPolicy = localWorkDatabase.workSpecDao();
          localObject1 = ((List)localObject3).iterator();
          while (((Iterator)localObject1).hasNext()) {
            paramExistingWorkPolicy.delete(((WorkSpec.IdAndState)((Iterator)localObject1).next()).id);
          }
          bool2 = true;
          break label775;
        }
        localObject1 = localWorkDatabase.dependencyDao();
        localObject2 = new ArrayList();
        localObject3 = ((List)localObject3).iterator();
        while (((Iterator)localObject3).hasNext())
        {
          WorkSpec.IdAndState localIdAndState = (WorkSpec.IdAndState)((Iterator)localObject3).next();
          if (!((DependencyDao)localObject1).hasDependents(localIdAndState.id))
          {
            if (localIdAndState.state == WorkInfo.State.SUCCEEDED) {
              n = 1;
            } else {
              n = 0;
            }
            if (localIdAndState.state == WorkInfo.State.FAILED)
            {
              i = 1;
              m = j;
              j = i;
            }
            else
            {
              m = j;
              j = i;
              if (localIdAndState.state == WorkInfo.State.CANCELLED)
              {
                m = 1;
                j = i;
              }
            }
            ((List)localObject2).add(localIdAndState.id);
            k = n & k;
            i = j;
          }
          else
          {
            m = j;
          }
          j = m;
        }
        if ((paramExistingWorkPolicy == ExistingWorkPolicy.APPEND_OR_REPLACE) && ((j != 0) || (i != 0)))
        {
          paramExistingWorkPolicy = localWorkDatabase.workSpecDao();
          localObject1 = paramExistingWorkPolicy.getWorkSpecIdAndStatesForName(paramString).iterator();
          while (((Iterator)localObject1).hasNext()) {
            paramExistingWorkPolicy.delete(((WorkSpec.IdAndState)((Iterator)localObject1).next()).id);
          }
          paramExistingWorkPolicy = Collections.emptyList();
          i = 0;
          j = 0;
        }
        else
        {
          paramExistingWorkPolicy = (ExistingWorkPolicy)localObject2;
        }
        localObject1 = (String[])paramExistingWorkPolicy.toArray(paramArrayOfString);
        if (localObject1.length > 0) {
          i1 = 1;
        } else {
          i1 = 0;
        }
        i3 = i;
        n = j;
        i2 = k;
      }
    }
    boolean bool2 = false;
    i = i3;
    j = n;
    k = i2;
    int m = i1;
    paramArrayOfString = (String[])localObject1;
    label775:
    paramExistingWorkPolicy = paramList.iterator();
    while (paramExistingWorkPolicy.hasNext())
    {
      paramList = (WorkRequest)paramExistingWorkPolicy.next();
      localObject1 = paramList.getWorkSpec();
      if ((m != 0) && (k == 0))
      {
        if (i != 0) {
          ((WorkSpec)localObject1).state = WorkInfo.State.FAILED;
        } else if (j != 0) {
          ((WorkSpec)localObject1).state = WorkInfo.State.CANCELLED;
        } else {
          ((WorkSpec)localObject1).state = WorkInfo.State.BLOCKED;
        }
      }
      else
      {
        if (((WorkSpec)localObject1).isPeriodic()) {
          break label881;
        }
        ((WorkSpec)localObject1).periodStartTime = l;
      }
      break label887;
      label881:
      ((WorkSpec)localObject1).periodStartTime = 0L;
      label887:
      if ((Build.VERSION.SDK_INT >= 23) && (Build.VERSION.SDK_INT <= 25)) {
        tryDelegateConstrainedWorkSpec((WorkSpec)localObject1);
      } else if ((Build.VERSION.SDK_INT <= 22) && (usesScheduler(paramWorkManagerImpl, "androidx.work.impl.background.gcm.GcmScheduler"))) {
        tryDelegateConstrainedWorkSpec((WorkSpec)localObject1);
      }
      if (((WorkSpec)localObject1).state == WorkInfo.State.ENQUEUED) {
        bool2 = true;
      }
      localWorkDatabase.workSpecDao().insertWorkSpec((WorkSpec)localObject1);
      if (m != 0)
      {
        i1 = paramArrayOfString.length;
        for (n = 0; n < i1; n++)
        {
          localObject1 = paramArrayOfString[n];
          localObject1 = new Dependency(paramList.getStringId(), (String)localObject1);
          localWorkDatabase.dependencyDao().insertDependency((Dependency)localObject1);
        }
      }
      localObject2 = paramList.getTags().iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject1 = (String)((Iterator)localObject2).next();
        localWorkDatabase.workTagDao().insert(new WorkTag((String)localObject1, paramList.getStringId()));
      }
      if (bool1) {
        localWorkDatabase.workNameDao().insert(new WorkName(paramString, paramList.getStringId()));
      }
    }
    return bool2;
  }
  
  private static boolean processContinuation(WorkContinuationImpl paramWorkContinuationImpl)
  {
    Object localObject = paramWorkContinuationImpl.getParents();
    boolean bool = false;
    if (localObject != null)
    {
      localObject = ((List)localObject).iterator();
      bool = false;
      while (((Iterator)localObject).hasNext())
      {
        WorkContinuationImpl localWorkContinuationImpl = (WorkContinuationImpl)((Iterator)localObject).next();
        if (!localWorkContinuationImpl.isEnqueued()) {
          bool |= processContinuation(localWorkContinuationImpl);
        } else {
          Logger.get().warning(TAG, String.format("Already enqueued work ids (%s).", new Object[] { TextUtils.join(", ", localWorkContinuationImpl.getIds()) }), new Throwable[0]);
        }
      }
    }
    return enqueueContinuation(paramWorkContinuationImpl) | bool;
  }
  
  private static void tryDelegateConstrainedWorkSpec(WorkSpec paramWorkSpec)
  {
    Object localObject = paramWorkSpec.constraints;
    String str = paramWorkSpec.workerClassName;
    if ((!str.equals(ConstraintTrackingWorker.class.getName())) && ((((Constraints)localObject).requiresBatteryNotLow()) || (((Constraints)localObject).requiresStorageNotLow())))
    {
      localObject = new Data.Builder();
      ((Data.Builder)localObject).putAll(paramWorkSpec.input).putString("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
      paramWorkSpec.workerClassName = ConstraintTrackingWorker.class.getName();
      paramWorkSpec.input = ((Data.Builder)localObject).build();
    }
  }
  
  private static boolean usesScheduler(WorkManagerImpl paramWorkManagerImpl, String paramString)
  {
    try
    {
      paramString = Class.forName(paramString);
      paramWorkManagerImpl = paramWorkManagerImpl.getSchedulers().iterator();
      while (paramWorkManagerImpl.hasNext())
      {
        boolean bool = paramString.isAssignableFrom(((Scheduler)paramWorkManagerImpl.next()).getClass());
        if (bool) {
          return true;
        }
      }
    }
    catch (ClassNotFoundException paramWorkManagerImpl)
    {
      for (;;) {}
    }
    return false;
  }
  
  public boolean addToDatabase()
  {
    WorkDatabase localWorkDatabase = this.mWorkContinuation.getWorkManagerImpl().getWorkDatabase();
    localWorkDatabase.beginTransaction();
    try
    {
      boolean bool = processContinuation(this.mWorkContinuation);
      localWorkDatabase.setTransactionSuccessful();
      return bool;
    }
    finally
    {
      localWorkDatabase.endTransaction();
    }
  }
  
  public Operation getOperation()
  {
    return this.mOperation;
  }
  
  public void run()
  {
    try
    {
      if (!this.mWorkContinuation.hasCycles())
      {
        if (addToDatabase())
        {
          PackageManagerHelper.setComponentEnabled(this.mWorkContinuation.getWorkManagerImpl().getApplicationContext(), RescheduleReceiver.class, true);
          scheduleWorkInBackground();
        }
        this.mOperation.setState(Operation.SUCCESS);
      }
      else
      {
        IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
        localIllegalStateException.<init>(String.format("WorkContinuation has cycles (%s)", new Object[] { this.mWorkContinuation }));
        throw localIllegalStateException;
      }
    }
    finally
    {
      this.mOperation.setState(new Operation.State.FAILURE(localThrowable));
    }
  }
  
  public void scheduleWorkInBackground()
  {
    WorkManagerImpl localWorkManagerImpl = this.mWorkContinuation.getWorkManagerImpl();
    Schedulers.schedule(localWorkManagerImpl.getConfiguration(), localWorkManagerImpl.getWorkDatabase(), localWorkManagerImpl.getSchedulers());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\imp\\utils\EnqueueRunnable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */