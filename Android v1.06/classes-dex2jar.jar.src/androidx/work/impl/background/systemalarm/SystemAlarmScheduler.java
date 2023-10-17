package androidx.work.impl.background.systemalarm;

import android.content.Context;
import androidx.work.Logger;
import androidx.work.impl.Scheduler;
import androidx.work.impl.model.WorkSpec;

public class SystemAlarmScheduler
  implements Scheduler
{
  private static final String TAG = Logger.tagWithPrefix("SystemAlarmScheduler");
  private final Context mContext;
  
  public SystemAlarmScheduler(Context paramContext)
  {
    this.mContext = paramContext.getApplicationContext();
  }
  
  private void scheduleWorkSpec(WorkSpec paramWorkSpec)
  {
    Logger.get().debug(TAG, String.format("Scheduling work with workSpecId %s", new Object[] { paramWorkSpec.id }), new Throwable[0]);
    paramWorkSpec = CommandHandler.createScheduleWorkIntent(this.mContext, paramWorkSpec.id);
    this.mContext.startService(paramWorkSpec);
  }
  
  public void cancel(String paramString)
  {
    paramString = CommandHandler.createStopWorkIntent(this.mContext, paramString);
    this.mContext.startService(paramString);
  }
  
  public boolean hasLimitedSchedulingSlots()
  {
    return true;
  }
  
  public void schedule(WorkSpec... paramVarArgs)
  {
    int j = paramVarArgs.length;
    for (int i = 0; i < j; i++) {
      scheduleWorkSpec(paramVarArgs[i]);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\impl\background\systemalarm\SystemAlarmScheduler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */