package androidx.work.impl.constraints.controllers;

import android.content.Context;
import android.os.Build.VERSION;
import androidx.work.Constraints;
import androidx.work.NetworkType;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;

public class NetworkUnmeteredController
  extends ConstraintController<NetworkState>
{
  public NetworkUnmeteredController(Context paramContext, TaskExecutor paramTaskExecutor)
  {
    super(Trackers.getInstance(paramContext, paramTaskExecutor).getNetworkStateTracker());
  }
  
  boolean hasConstraint(WorkSpec paramWorkSpec)
  {
    boolean bool;
    if ((paramWorkSpec.constraints.getRequiredNetworkType() != NetworkType.UNMETERED) && ((Build.VERSION.SDK_INT < 30) || (paramWorkSpec.constraints.getRequiredNetworkType() != NetworkType.TEMPORARILY_UNMETERED))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  boolean isConstrained(NetworkState paramNetworkState)
  {
    boolean bool;
    if ((paramNetworkState.isConnected()) && (!paramNetworkState.isMetered())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\impl\constraints\controllers\NetworkUnmeteredController.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */