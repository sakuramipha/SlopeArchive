package com.google.android.gms.nearby.messages.internal;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;

final class zzah
  implements Application.ActivityLifecycleCallbacks
{
  private final Activity zza;
  private final zzai zzb;
  
  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle) {}
  
  public final void onActivityDestroyed(Activity paramActivity)
  {
    if (paramActivity == this.zza)
    {
      if (Log.isLoggable("NearbyMessagesClient", 2)) {
        Log.v("NearbyMessagesClient", String.format("Unregistering ClientLifecycleSafetyNet's ActivityLifecycleCallbacks for %s", new Object[] { paramActivity.getPackageName() }));
      }
      paramActivity.getApplication().unregisterActivityLifecycleCallbacks(this);
    }
  }
  
  public final void onActivityPaused(Activity paramActivity) {}
  
  public final void onActivityResumed(Activity paramActivity) {}
  
  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
  
  public final void onActivityStarted(Activity paramActivity) {}
  
  public final void onActivityStopped(Activity paramActivity)
  {
    if (paramActivity == this.zza) {
      try
      {
        this.zzb.zzB(1);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        if (Log.isLoggable("NearbyMessagesClient", 2)) {
          Log.v("NearbyMessagesClient", String.format("Failed to emit ACTIVITY_STOPPED from ClientLifecycleSafetyNet for Activity %s: %s", new Object[] { paramActivity.getPackageName(), localRemoteException }));
        }
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\nearby\messages\internal\zzah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */