package androidx.work.impl.background.greedy;

import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import androidx.work.Configuration;
import androidx.work.Constraints;
import androidx.work.Logger;
import androidx.work.WorkInfo.State;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.Processor;
import androidx.work.impl.Scheduler;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.constraints.WorkConstraintsCallback;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.ProcessUtils;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class GreedyScheduler
  implements Scheduler, WorkConstraintsCallback, ExecutionListener
{
  private static final String TAG = Logger.tagWithPrefix("GreedyScheduler");
  private final Set<WorkSpec> mConstrainedWorkSpecs = new HashSet();
  private final Context mContext;
  private DelayedWorkTracker mDelayedWorkTracker;
  Boolean mInDefaultProcess;
  private final Object mLock;
  private boolean mRegisteredExecutionListener;
  private final WorkConstraintsTracker mWorkConstraintsTracker;
  private final WorkManagerImpl mWorkManagerImpl;
  
  public GreedyScheduler(Context paramContext, Configuration paramConfiguration, TaskExecutor paramTaskExecutor, WorkManagerImpl paramWorkManagerImpl)
  {
    this.mContext = paramContext;
    this.mWorkManagerImpl = paramWorkManagerImpl;
    this.mWorkConstraintsTracker = new WorkConstraintsTracker(paramContext, paramTaskExecutor, this);
    this.mDelayedWorkTracker = new DelayedWorkTracker(this, paramConfiguration.getRunnableScheduler());
    this.mLock = new Object();
  }
  
  public GreedyScheduler(Context paramContext, WorkManagerImpl paramWorkManagerImpl, WorkConstraintsTracker paramWorkConstraintsTracker)
  {
    this.mContext = paramContext;
    this.mWorkManagerImpl = paramWorkManagerImpl;
    this.mWorkConstraintsTracker = paramWorkConstraintsTracker;
    this.mLock = new Object();
  }
  
  private void checkDefaultProcess()
  {
    Configuration localConfiguration = this.mWorkManagerImpl.getConfiguration();
    this.mInDefaultProcess = Boolean.valueOf(ProcessUtils.isDefaultProcess(this.mContext, localConfiguration));
  }
  
  private void registerExecutionListenerIfNeeded()
  {
    if (!this.mRegisteredExecutionListener)
    {
      this.mWorkManagerImpl.getProcessor().addExecutionListener(this);
      this.mRegisteredExecutionListener = true;
    }
  }
  
  private void removeConstraintTrackingFor(String paramString)
  {
    synchronized (this.mLock)
    {
      Iterator localIterator = this.mConstrainedWorkSpecs.iterator();
      while (localIterator.hasNext())
      {
        WorkSpec localWorkSpec = (WorkSpec)localIterator.next();
        if (localWorkSpec.id.equals(paramString))
        {
          Logger.get().debug(TAG, String.format("Stopping tracking for %s", new Object[] { paramString }), new Throwable[0]);
          this.mConstrainedWorkSpecs.remove(localWorkSpec);
          this.mWorkConstraintsTracker.replace(this.mConstrainedWorkSpecs);
        }
      }
      return;
    }
  }
  
  public void cancel(String paramString)
  {
    if (this.mInDefaultProcess == null) {
      checkDefaultProcess();
    }
    if (!this.mInDefaultProcess.booleanValue())
    {
      Logger.get().info(TAG, "Ignoring schedule request in non-main process", new Throwable[0]);
      return;
    }
    registerExecutionListenerIfNeeded();
    Logger.get().debug(TAG, String.format("Cancelling work ID %s", new Object[] { paramString }), new Throwable[0]);
    DelayedWorkTracker localDelayedWorkTracker = this.mDelayedWorkTracker;
    if (localDelayedWorkTracker != null) {
      localDelayedWorkTracker.unschedule(paramString);
    }
    this.mWorkManagerImpl.stopWork(paramString);
  }
  
  public boolean hasLimitedSchedulingSlots()
  {
    return false;
  }
  
  public void onAllConstraintsMet(List<String> paramList)
  {
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      paramList = (String)localIterator.next();
      Logger.get().debug(TAG, String.format("Constraints met: Scheduling work ID %s", new Object[] { paramList }), new Throwable[0]);
      this.mWorkManagerImpl.startWork(paramList);
    }
  }
  
  public void onAllConstraintsNotMet(List<String> paramList)
  {
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      paramList = (String)localIterator.next();
      Logger.get().debug(TAG, String.format("Constraints not met: Cancelling work ID %s", new Object[] { paramList }), new Throwable[0]);
      this.mWorkManagerImpl.stopWork(paramList);
    }
  }
  
  public void onExecuted(String paramString, boolean paramBoolean)
  {
    removeConstraintTrackingFor(paramString);
  }
  
  public void schedule(WorkSpec... arg1)
  {
    if (this.mInDefaultProcess == null) {
      checkDefaultProcess();
    }
    if (!this.mInDefaultProcess.booleanValue())
    {
      Logger.get().info(TAG, "Ignoring schedule request in a secondary process", new Throwable[0]);
      return;
    }
    registerExecutionListenerIfNeeded();
    HashSet localHashSet2 = new HashSet();
    HashSet localHashSet1 = new HashSet();
    int j = ???.length;
    for (int i = 0; i < j; i++)
    {
      WorkSpec localWorkSpec = ???[i];
      long l2 = localWorkSpec.calculateNextRunTime();
      long l1 = System.currentTimeMillis();
      if (localWorkSpec.state == WorkInfo.State.ENQUEUED) {
        if (l1 < l2)
        {
          DelayedWorkTracker localDelayedWorkTracker = this.mDelayedWorkTracker;
          if (localDelayedWorkTracker != null) {
            localDelayedWorkTracker.schedule(localWorkSpec);
          }
        }
        else if (localWorkSpec.hasConstraints())
        {
          if ((Build.VERSION.SDK_INT >= 23) && (localWorkSpec.constraints.requiresDeviceIdle()))
          {
            Logger.get().debug(TAG, String.format("Ignoring WorkSpec %s, Requires device idle.", new Object[] { localWorkSpec }), new Throwable[0]);
          }
          else if ((Build.VERSION.SDK_INT >= 24) && (localWorkSpec.constraints.hasContentUriTriggers()))
          {
            Logger.get().debug(TAG, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", new Object[] { localWorkSpec }), new Throwable[0]);
          }
          else
          {
            localHashSet2.add(localWorkSpec);
            localHashSet1.add(localWorkSpec.id);
          }
        }
        else
        {
          Logger.get().debug(TAG, String.format("Starting work for %s", new Object[] { localWorkSpec.id }), new Throwable[0]);
          this.mWorkManagerImpl.startWork(localWorkSpec.id);
        }
      }
    }
    synchronized (this.mLock)
    {
      if (!localHashSet2.isEmpty())
      {
        Logger.get().debug(TAG, String.format("Starting tracking for [%s]", new Object[] { TextUtils.join(",", localHashSet1) }), new Throwable[0]);
        this.mConstrainedWorkSpecs.addAll(localHashSet2);
        this.mWorkConstraintsTracker.replace(this.mConstrainedWorkSpecs);
      }
      return;
    }
  }
  
  public void setDelayedWorkTracker(DelayedWorkTracker paramDelayedWorkTracker)
  {
    this.mDelayedWorkTracker = paramDelayedWorkTracker;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\impl\background\greedy\GreedyScheduler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */