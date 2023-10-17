package com.google.android.gms.internal.nearby;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import android.util.Log;
import java.lang.ref.WeakReference;

final class zzes
  implements Application.ActivityLifecycleCallbacks
{
  final zzet zza;
  private final WeakReference<Activity> zzb;
  
  zzes(WeakReference<Activity> paramWeakReference)
  {
    WeakReference localWeakReference;
    this.zzb = localWeakReference;
  }
  
  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle) {}
  
  public final void onActivityDestroyed(Activity paramActivity) {}
  
  public final void onActivityPaused(Activity paramActivity) {}
  
  public final void onActivityResumed(Activity paramActivity) {}
  
  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
  
  public final void onActivityStarted(Activity paramActivity)
  {
    if (paramActivity == this.zzb.get())
    {
      zzet.zzd(this.zza, true);
      Log.d("NearbyConnections", "Activity is visible.");
      zzet.zze(this.zza);
    }
  }
  
  public final void onActivityStopped(Activity paramActivity)
  {
    if (paramActivity == this.zzb.get())
    {
      zzet.zzd(this.zza, false);
      Log.d("NearbyConnections", "Activity is hidden.");
      zzet.zze(this.zza);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzes.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */