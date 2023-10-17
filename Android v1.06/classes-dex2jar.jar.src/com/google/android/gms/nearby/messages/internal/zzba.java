package com.google.android.gms.nearby.messages.internal;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import android.util.Log;

final class zzba
  implements Application.ActivityLifecycleCallbacks
{
  private final Activity zza;
  private final zzbg zzb;
  
  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle) {}
  
  public final void onActivityDestroyed(Activity paramActivity)
  {
    if (paramActivity == this.zza)
    {
      Log.v("NearbyMessages", String.format("Unregistering ClientLifecycleSafetyNet's ActivityLifecycleCallbacks for %s", new Object[] { paramActivity.getPackageName() }));
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
      zzbg.zzg(this.zzb, 1);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\nearby\messages\internal\zzba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */