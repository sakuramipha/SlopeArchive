package androidx.work.impl.constraints.controllers;

import android.content.Context;
import android.os.Build.VERSION;
import androidx.work.Constraints;
import androidx.work.Logger;
import androidx.work.NetworkType;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;

public class NetworkNotRoamingController
  extends ConstraintController<NetworkState>
{
  private static final String TAG = Logger.tagWithPrefix("NetworkNotRoamingCtrlr");
  
  public NetworkNotRoamingController(Context paramContext, TaskExecutor paramTaskExecutor)
  {
    super(Trackers.getInstance(paramContext, paramTaskExecutor).getNetworkStateTracker());
  }
  
  boolean hasConstraint(WorkSpec paramWorkSpec)
  {
    boolean bool;
    if (paramWorkSpec.constraints.getRequiredNetworkType() == NetworkType.NOT_ROAMING) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  boolean isConstrained(NetworkState paramNetworkState)
  {
    int i = Build.VERSION.SDK_INT;
    boolean bool2 = true;
    if (i < 24)
    {
      Logger.get().debug(TAG, "Not-roaming network constraint is not supported before API 24, only checking for connected state.", new Throwable[0]);
      return paramNetworkState.isConnected() ^ true;
    }
    boolean bool1 = bool2;
    if (paramNetworkState.isConnected()) {
      if (!paramNetworkState.isNotRoaming()) {
        bool1 = bool2;
      } else {
        bool1 = false;
      }
    }
    return bool1;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\impl\constraints\controllers\NetworkNotRoamingController.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */