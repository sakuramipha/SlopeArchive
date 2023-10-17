package androidx.work.impl.constraints.trackers;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.Logger;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;

public class BatteryNotLowTracker
  extends BroadcastReceiverConstraintTracker<Boolean>
{
  static final float BATTERY_LOW_THRESHOLD = 0.15F;
  private static final String TAG = Logger.tagWithPrefix("BatteryNotLowTracker");
  
  public BatteryNotLowTracker(Context paramContext, TaskExecutor paramTaskExecutor)
  {
    super(paramContext, paramTaskExecutor);
  }
  
  public Boolean getInitialState()
  {
    Object localObject = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    localObject = this.mAppContext.registerReceiver(null, (IntentFilter)localObject);
    boolean bool = false;
    if (localObject == null)
    {
      Logger.get().error(TAG, "getInitialState - null intent received", new Throwable[0]);
      return null;
    }
    int j = ((Intent)localObject).getIntExtra("status", -1);
    int i = ((Intent)localObject).getIntExtra("level", -1);
    int k = ((Intent)localObject).getIntExtra("scale", -1);
    float f = i / k;
    if ((j == 1) || (f > 0.15F)) {
      bool = true;
    }
    return Boolean.valueOf(bool);
  }
  
  public IntentFilter getIntentFilter()
  {
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.intent.action.BATTERY_OKAY");
    localIntentFilter.addAction("android.intent.action.BATTERY_LOW");
    return localIntentFilter;
  }
  
  public void onBroadcastReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent.getAction() == null) {
      return;
    }
    Logger.get().debug(TAG, String.format("Received %s", new Object[] { paramIntent.getAction() }), new Throwable[0]);
    paramContext = paramIntent.getAction();
    paramContext.hashCode();
    if (!paramContext.equals("android.intent.action.BATTERY_OKAY"))
    {
      if (paramContext.equals("android.intent.action.BATTERY_LOW")) {
        setState(Boolean.valueOf(false));
      }
    }
    else {
      setState(Boolean.valueOf(true));
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\impl\constraints\trackers\BatteryNotLowTracker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */