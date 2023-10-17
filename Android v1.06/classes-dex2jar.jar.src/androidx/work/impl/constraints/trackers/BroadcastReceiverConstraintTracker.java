package androidx.work.impl.constraints.trackers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.Logger;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;

public abstract class BroadcastReceiverConstraintTracker<T>
  extends ConstraintTracker<T>
{
  private static final String TAG = Logger.tagWithPrefix("BrdcstRcvrCnstrntTrckr");
  private final BroadcastReceiver mBroadcastReceiver = new BroadcastReceiver()
  {
    public void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
    {
      if (paramAnonymousIntent != null) {
        BroadcastReceiverConstraintTracker.this.onBroadcastReceive(paramAnonymousContext, paramAnonymousIntent);
      }
    }
  };
  
  public BroadcastReceiverConstraintTracker(Context paramContext, TaskExecutor paramTaskExecutor)
  {
    super(paramContext, paramTaskExecutor);
  }
  
  public abstract IntentFilter getIntentFilter();
  
  public abstract void onBroadcastReceive(Context paramContext, Intent paramIntent);
  
  public void startTracking()
  {
    Logger.get().debug(TAG, String.format("%s: registering receiver", new Object[] { getClass().getSimpleName() }), new Throwable[0]);
    this.mAppContext.registerReceiver(this.mBroadcastReceiver, getIntentFilter());
  }
  
  public void stopTracking()
  {
    Logger.get().debug(TAG, String.format("%s: unregistering receiver", new Object[] { getClass().getSimpleName() }), new Throwable[0]);
    this.mAppContext.unregisterReceiver(this.mBroadcastReceiver);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\impl\constraints\trackers\BroadcastReceiverConstraintTracker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */