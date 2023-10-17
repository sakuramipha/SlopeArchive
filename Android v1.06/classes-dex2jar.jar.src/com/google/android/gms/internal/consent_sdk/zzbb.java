package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

final class zzbb
  implements Application.ActivityLifecycleCallbacks
{
  final zzbe zza;
  private final Activity zzb;
  
  public zzbb(zzbe paramzzbe, Activity paramActivity)
  {
    this.zzb = paramActivity;
  }
  
  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle) {}
  
  public final void onActivityDestroyed(Activity paramActivity)
  {
    if (paramActivity != this.zzb) {
      return;
    }
    this.zza.zzd(new zzi(3, "Activity is destroyed."));
  }
  
  public final void onActivityPaused(Activity paramActivity) {}
  
  public final void onActivityResumed(Activity paramActivity) {}
  
  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
  
  public final void onActivityStarted(Activity paramActivity) {}
  
  public final void onActivityStopped(Activity paramActivity) {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\consent_sdk\zzbb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */