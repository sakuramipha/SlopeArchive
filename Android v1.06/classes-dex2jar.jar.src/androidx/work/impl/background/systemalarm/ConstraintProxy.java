package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.Constraints;
import androidx.work.Logger;
import androidx.work.NetworkType;
import androidx.work.impl.model.WorkSpec;
import java.util.Iterator;
import java.util.List;

abstract class ConstraintProxy
  extends BroadcastReceiver
{
  private static final String TAG = Logger.tagWithPrefix("ConstraintProxy");
  
  static void updateAll(Context paramContext, List<WorkSpec> paramList)
  {
    paramList = paramList.iterator();
    boolean bool4 = false;
    boolean bool3 = false;
    boolean bool2 = false;
    boolean bool1 = false;
    boolean bool5;
    boolean bool8;
    boolean bool7;
    boolean bool6;
    do
    {
      do
      {
        do
        {
          do
          {
            bool5 = bool4;
            bool8 = bool3;
            bool7 = bool2;
            bool6 = bool1;
            if (!paramList.hasNext()) {
              break;
            }
            Constraints localConstraints = ((WorkSpec)paramList.next()).constraints;
            bool5 = bool4 | localConstraints.requiresBatteryNotLow();
            bool8 = bool3 | localConstraints.requiresCharging();
            bool7 = bool2 | localConstraints.requiresStorageNotLow();
            int i;
            if (localConstraints.getRequiredNetworkType() != NetworkType.NOT_REQUIRED) {
              i = 1;
            } else {
              i = 0;
            }
            bool6 = bool1 | i;
            bool4 = bool5;
            bool3 = bool8;
            bool2 = bool7;
            bool1 = bool6;
          } while (!bool5);
          bool4 = bool5;
          bool3 = bool8;
          bool2 = bool7;
          bool1 = bool6;
        } while (!bool8);
        bool4 = bool5;
        bool3 = bool8;
        bool2 = bool7;
        bool1 = bool6;
      } while (!bool7);
      bool4 = bool5;
      bool3 = bool8;
      bool2 = bool7;
      bool1 = bool6;
    } while (!bool6);
    paramContext.sendBroadcast(ConstraintProxyUpdateReceiver.newConstraintProxyUpdateIntent(paramContext, bool5, bool8, bool7, bool6));
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    Logger.get().debug(TAG, String.format("onReceive : %s", new Object[] { paramIntent }), new Throwable[0]);
    paramContext.startService(CommandHandler.createConstraintsChangedIntent(paramContext));
  }
  
  public static class BatteryChargingProxy
    extends ConstraintProxy
  {}
  
  public static class BatteryNotLowProxy
    extends ConstraintProxy
  {}
  
  public static class NetworkStateProxy
    extends ConstraintProxy
  {}
  
  public static class StorageNotLowProxy
    extends ConstraintProxy
  {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\impl\background\systemalarm\ConstraintProxy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */