package androidx.work.impl.constraints.trackers;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import androidx.work.Logger;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;

public class BatteryChargingTracker
  extends BroadcastReceiverConstraintTracker<Boolean>
{
  private static final String TAG = Logger.tagWithPrefix("BatteryChrgTracker");
  
  public BatteryChargingTracker(Context paramContext, TaskExecutor paramTaskExecutor)
  {
    super(paramContext, paramTaskExecutor);
  }
  
  private boolean isBatteryChangedIntentCharging(Intent paramIntent)
  {
    int i = Build.VERSION.SDK_INT;
    boolean bool2 = true;
    if (i >= 23)
    {
      i = paramIntent.getIntExtra("status", -1);
      bool1 = bool2;
      if (i == 2) {
        return bool1;
      }
      if (i == 5) {
        return bool2;
      }
    }
    while (paramIntent.getIntExtra("plugged", 0) == 0)
    {
      bool1 = false;
      break;
    }
    boolean bool1 = bool2;
    return bool1;
  }
  
  public Boolean getInitialState()
  {
    Object localObject = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    localObject = this.mAppContext.registerReceiver(null, (IntentFilter)localObject);
    if (localObject == null)
    {
      Logger.get().error(TAG, "getInitialState - null intent received", new Throwable[0]);
      return null;
    }
    return Boolean.valueOf(isBatteryChangedIntentCharging((Intent)localObject));
  }
  
  public IntentFilter getIntentFilter()
  {
    IntentFilter localIntentFilter = new IntentFilter();
    if (Build.VERSION.SDK_INT >= 23)
    {
      localIntentFilter.addAction("android.os.action.CHARGING");
      localIntentFilter.addAction("android.os.action.DISCHARGING");
    }
    else
    {
      localIntentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
      localIntentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
    }
    return localIntentFilter;
  }
  
  public void onBroadcastReceive(Context paramContext, Intent paramIntent)
  {
    paramContext = paramIntent.getAction();
    if (paramContext == null) {
      return;
    }
    Logger.get().debug(TAG, String.format("Received %s", new Object[] { paramContext }), new Throwable[0]);
    paramContext.hashCode();
    int i = -1;
    switch (paramContext.hashCode())
    {
    default: 
      break;
    case 1019184907: 
      if (paramContext.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
        i = 3;
      }
      break;
    case 948344062: 
      if (paramContext.equals("android.os.action.CHARGING")) {
        i = 2;
      }
      break;
    case -54942926: 
      if (paramContext.equals("android.os.action.DISCHARGING")) {
        i = 1;
      }
      break;
    case -1886648615: 
      if (paramContext.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
        i = 0;
      }
      break;
    }
    switch (i)
    {
    default: 
      break;
    case 3: 
      setState(Boolean.valueOf(true));
      break;
    case 2: 
      setState(Boolean.valueOf(true));
      break;
    case 1: 
      setState(Boolean.valueOf(false));
      break;
    case 0: 
      setState(Boolean.valueOf(false));
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\impl\constraints\trackers\BatteryChargingTracker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */