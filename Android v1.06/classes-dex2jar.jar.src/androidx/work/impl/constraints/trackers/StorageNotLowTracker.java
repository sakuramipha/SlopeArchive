package androidx.work.impl.constraints.trackers;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.Logger;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;

public class StorageNotLowTracker
  extends BroadcastReceiverConstraintTracker<Boolean>
{
  private static final String TAG = Logger.tagWithPrefix("StorageNotLowTracker");
  
  public StorageNotLowTracker(Context paramContext, TaskExecutor paramTaskExecutor)
  {
    super(paramContext, paramTaskExecutor);
  }
  
  public Boolean getInitialState()
  {
    Object localObject = this.mAppContext.registerReceiver(null, getIntentFilter());
    Boolean localBoolean = Boolean.valueOf(true);
    if ((localObject != null) && (((Intent)localObject).getAction() != null))
    {
      localObject = ((Intent)localObject).getAction();
      ((String)localObject).hashCode();
      if (!((String)localObject).equals("android.intent.action.DEVICE_STORAGE_LOW"))
      {
        if (!((String)localObject).equals("android.intent.action.DEVICE_STORAGE_OK")) {
          return null;
        }
        return localBoolean;
      }
      return Boolean.valueOf(false);
    }
    return localBoolean;
  }
  
  public IntentFilter getIntentFilter()
  {
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
    localIntentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
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
    if (!paramContext.equals("android.intent.action.DEVICE_STORAGE_LOW"))
    {
      if (paramContext.equals("android.intent.action.DEVICE_STORAGE_OK")) {
        setState(Boolean.valueOf(true));
      }
    }
    else {
      setState(Boolean.valueOf(false));
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\impl\constraints\trackers\StorageNotLowTracker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */