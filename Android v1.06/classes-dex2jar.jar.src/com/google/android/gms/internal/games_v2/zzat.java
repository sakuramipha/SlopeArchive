package com.google.android.gms.internal.games_v2;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

final class zzat
  implements Application.ActivityLifecycleCallbacks
{
  final zzau zza;
  private final Application zzb;
  private boolean zzc;
  
  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    this.zzb.unregisterActivityLifecycleCallbacks(this);
    if (!this.zzc) {
      return;
    }
    this.zzc = false;
    zzez.zza("AutomaticGamesAuthenticator", "Automatic connection attempt triggered");
    zzau.zzb(this.zza).zza();
  }
  
  public final void onActivityDestroyed(Activity paramActivity) {}
  
  public final void onActivityPaused(Activity paramActivity) {}
  
  public final void onActivityResumed(Activity paramActivity) {}
  
  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
  
  public final void onActivityStarted(Activity paramActivity) {}
  
  public final void onActivityStopped(Activity paramActivity) {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\games_v2\zzat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */