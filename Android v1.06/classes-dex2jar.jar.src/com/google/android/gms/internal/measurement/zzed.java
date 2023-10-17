package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

final class zzed
  implements Application.ActivityLifecycleCallbacks
{
  final zzee zza;
  
  zzed(zzee paramzzee) {}
  
  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    zzee.zzt(this.zza, new zzdw(this, paramBundle, paramActivity));
  }
  
  public final void onActivityDestroyed(Activity paramActivity)
  {
    zzee.zzt(this.zza, new zzec(this, paramActivity));
  }
  
  public final void onActivityPaused(Activity paramActivity)
  {
    zzee.zzt(this.zza, new zzdz(this, paramActivity));
  }
  
  public final void onActivityResumed(Activity paramActivity)
  {
    zzee.zzt(this.zza, new zzdy(this, paramActivity));
  }
  
  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle)
  {
    zzbz localzzbz = new zzbz();
    zzee.zzt(this.zza, new zzeb(this, paramActivity, localzzbz));
    paramActivity = localzzbz.zzb(50L);
    if (paramActivity != null) {
      paramBundle.putAll(paramActivity);
    }
  }
  
  public final void onActivityStarted(Activity paramActivity)
  {
    zzee.zzt(this.zza, new zzdx(this, paramActivity));
  }
  
  public final void onActivityStopped(Activity paramActivity)
  {
    zzee.zzt(this.zza, new zzea(this, paramActivity));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzed.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */