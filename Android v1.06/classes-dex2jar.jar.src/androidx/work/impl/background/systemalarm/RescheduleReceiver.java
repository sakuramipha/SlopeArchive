package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import androidx.work.Logger;
import androidx.work.impl.WorkManagerImpl;

public class RescheduleReceiver
  extends BroadcastReceiver
{
  private static final String TAG = Logger.tagWithPrefix("RescheduleReceiver");
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    Logger.get().debug(TAG, String.format("Received intent %s", new Object[] { paramIntent }), new Throwable[0]);
    if (Build.VERSION.SDK_INT >= 23) {
      try
      {
        WorkManagerImpl.getInstance(paramContext).setReschedulePendingResult(goAsync());
      }
      catch (IllegalStateException paramContext)
      {
        Logger.get().error(TAG, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", new Throwable[] { paramContext });
      }
    } else {
      paramContext.startService(CommandHandler.createRescheduleIntent(paramContext));
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\impl\background\systemalarm\RescheduleReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */