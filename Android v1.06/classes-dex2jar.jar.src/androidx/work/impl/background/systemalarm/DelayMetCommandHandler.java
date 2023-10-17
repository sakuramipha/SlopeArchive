package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager.WakeLock;
import androidx.work.Logger;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.Processor;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.constraints.WorkConstraintsCallback;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.utils.WakeLocks;
import androidx.work.impl.utils.WorkTimer;
import androidx.work.impl.utils.WorkTimer.TimeLimitExceededListener;
import java.util.Collections;
import java.util.List;

public class DelayMetCommandHandler
  implements WorkConstraintsCallback, ExecutionListener, WorkTimer.TimeLimitExceededListener
{
  private static final int STATE_INITIAL = 0;
  private static final int STATE_START_REQUESTED = 1;
  private static final int STATE_STOP_REQUESTED = 2;
  private static final String TAG = Logger.tagWithPrefix("DelayMetCommandHandler");
  private final Context mContext;
  private int mCurrentState;
  private final SystemAlarmDispatcher mDispatcher;
  private boolean mHasConstraints;
  private final Object mLock;
  private final int mStartId;
  private PowerManager.WakeLock mWakeLock;
  private final WorkConstraintsTracker mWorkConstraintsTracker;
  private final String mWorkSpecId;
  
  DelayMetCommandHandler(Context paramContext, int paramInt, String paramString, SystemAlarmDispatcher paramSystemAlarmDispatcher)
  {
    this.mContext = paramContext;
    this.mStartId = paramInt;
    this.mDispatcher = paramSystemAlarmDispatcher;
    this.mWorkSpecId = paramString;
    this.mWorkConstraintsTracker = new WorkConstraintsTracker(paramContext, paramSystemAlarmDispatcher.getTaskExecutor(), this);
    this.mHasConstraints = false;
    this.mCurrentState = 0;
    this.mLock = new Object();
  }
  
  private void cleanUp()
  {
    synchronized (this.mLock)
    {
      this.mWorkConstraintsTracker.reset();
      this.mDispatcher.getWorkTimer().stopTimer(this.mWorkSpecId);
      PowerManager.WakeLock localWakeLock = this.mWakeLock;
      if ((localWakeLock != null) && (localWakeLock.isHeld()))
      {
        Logger.get().debug(TAG, String.format("Releasing wakelock %s for WorkSpec %s", new Object[] { this.mWakeLock, this.mWorkSpecId }), new Throwable[0]);
        this.mWakeLock.release();
      }
      return;
    }
  }
  
  private void stopWork()
  {
    synchronized (this.mLock)
    {
      if (this.mCurrentState < 2)
      {
        this.mCurrentState = 2;
        Object localObject4 = Logger.get();
        Object localObject2 = TAG;
        ((Logger)localObject4).debug((String)localObject2, String.format("Stopping work for WorkSpec %s", new Object[] { this.mWorkSpecId }), new Throwable[0]);
        Object localObject5 = CommandHandler.createStopWorkIntent(this.mContext, this.mWorkSpecId);
        SystemAlarmDispatcher localSystemAlarmDispatcher = this.mDispatcher;
        localObject4 = new androidx/work/impl/background/systemalarm/SystemAlarmDispatcher$AddRunnable;
        ((SystemAlarmDispatcher.AddRunnable)localObject4).<init>(localSystemAlarmDispatcher, (Intent)localObject5, this.mStartId);
        localSystemAlarmDispatcher.postOnMainThread((Runnable)localObject4);
        if (this.mDispatcher.getProcessor().isEnqueued(this.mWorkSpecId))
        {
          Logger.get().debug((String)localObject2, String.format("WorkSpec %s needs to be rescheduled", new Object[] { this.mWorkSpecId }), new Throwable[0]);
          localObject2 = CommandHandler.createScheduleWorkIntent(this.mContext, this.mWorkSpecId);
          localObject5 = this.mDispatcher;
          localObject4 = new androidx/work/impl/background/systemalarm/SystemAlarmDispatcher$AddRunnable;
          ((SystemAlarmDispatcher.AddRunnable)localObject4).<init>((SystemAlarmDispatcher)localObject5, (Intent)localObject2, this.mStartId);
          ((SystemAlarmDispatcher)localObject5).postOnMainThread((Runnable)localObject4);
        }
        else
        {
          Logger.get().debug((String)localObject2, String.format("Processor does not have WorkSpec %s. No need to reschedule ", new Object[] { this.mWorkSpecId }), new Throwable[0]);
        }
      }
      else
      {
        Logger.get().debug(TAG, String.format("Already stopped work for %s", new Object[] { this.mWorkSpecId }), new Throwable[0]);
      }
      return;
    }
  }
  
  void handleProcessWork()
  {
    this.mWakeLock = WakeLocks.newWakeLock(this.mContext, String.format("%s (%s)", new Object[] { this.mWorkSpecId, Integer.valueOf(this.mStartId) }));
    Object localObject = Logger.get();
    String str = TAG;
    ((Logger)localObject).debug(str, String.format("Acquiring wakelock %s for WorkSpec %s", new Object[] { this.mWakeLock, this.mWorkSpecId }), new Throwable[0]);
    this.mWakeLock.acquire();
    localObject = this.mDispatcher.getWorkManager().getWorkDatabase().workSpecDao().getWorkSpec(this.mWorkSpecId);
    if (localObject == null)
    {
      stopWork();
      return;
    }
    boolean bool = ((WorkSpec)localObject).hasConstraints();
    this.mHasConstraints = bool;
    if (!bool)
    {
      Logger.get().debug(str, String.format("No constraints for %s", new Object[] { this.mWorkSpecId }), new Throwable[0]);
      onAllConstraintsMet(Collections.singletonList(this.mWorkSpecId));
    }
    else
    {
      this.mWorkConstraintsTracker.replace(Collections.singletonList(localObject));
    }
  }
  
  public void onAllConstraintsMet(List<String> paramList)
  {
    if (!paramList.contains(this.mWorkSpecId)) {
      return;
    }
    synchronized (this.mLock)
    {
      if (this.mCurrentState == 0)
      {
        this.mCurrentState = 1;
        Logger.get().debug(TAG, String.format("onAllConstraintsMet for %s", new Object[] { this.mWorkSpecId }), new Throwable[0]);
        if (this.mDispatcher.getProcessor().startWork(this.mWorkSpecId)) {
          this.mDispatcher.getWorkTimer().startTimer(this.mWorkSpecId, 600000L, this);
        } else {
          cleanUp();
        }
      }
      else
      {
        Logger.get().debug(TAG, String.format("Already started work for %s", new Object[] { this.mWorkSpecId }), new Throwable[0]);
      }
      return;
    }
  }
  
  public void onAllConstraintsNotMet(List<String> paramList)
  {
    stopWork();
  }
  
  public void onExecuted(String paramString, boolean paramBoolean)
  {
    Logger.get().debug(TAG, String.format("onExecuted %s, %s", new Object[] { paramString, Boolean.valueOf(paramBoolean) }), new Throwable[0]);
    cleanUp();
    Object localObject;
    if (paramBoolean)
    {
      localObject = CommandHandler.createScheduleWorkIntent(this.mContext, this.mWorkSpecId);
      paramString = this.mDispatcher;
      paramString.postOnMainThread(new SystemAlarmDispatcher.AddRunnable(paramString, (Intent)localObject, this.mStartId));
    }
    if (this.mHasConstraints)
    {
      paramString = CommandHandler.createConstraintsChangedIntent(this.mContext);
      localObject = this.mDispatcher;
      ((SystemAlarmDispatcher)localObject).postOnMainThread(new SystemAlarmDispatcher.AddRunnable((SystemAlarmDispatcher)localObject, paramString, this.mStartId));
    }
  }
  
  public void onTimeLimitExceeded(String paramString)
  {
    Logger.get().debug(TAG, String.format("Exceeded time limits on execution for %s", new Object[] { paramString }), new Throwable[0]);
    stopWork();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\impl\background\systemalarm\DelayMetCommandHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */