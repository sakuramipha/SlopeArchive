package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import java.lang.ref.WeakReference;

final class zzarg
  implements Application.ActivityLifecycleCallbacks
{
  private final Application zza;
  private final WeakReference zzb;
  private boolean zzc = false;
  
  public zzarg(Application paramApplication, Application.ActivityLifecycleCallbacks paramActivityLifecycleCallbacks)
  {
    this.zzb = new WeakReference(paramActivityLifecycleCallbacks);
    this.zza = paramApplication;
  }
  
  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    zza(new zzaqy(this, paramActivity, paramBundle));
  }
  
  public final void onActivityDestroyed(Activity paramActivity)
  {
    zza(new zzare(this, paramActivity));
  }
  
  public final void onActivityPaused(Activity paramActivity)
  {
    zza(new zzarb(this, paramActivity));
  }
  
  public final void onActivityResumed(Activity paramActivity)
  {
    zza(new zzara(this, paramActivity));
  }
  
  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle)
  {
    zza(new zzard(this, paramActivity, paramBundle));
  }
  
  public final void onActivityStarted(Activity paramActivity)
  {
    zza(new zzaqz(this, paramActivity));
  }
  
  public final void onActivityStopped(Activity paramActivity)
  {
    zza(new zzarc(this, paramActivity));
  }
  
  protected final void zza(zzarf paramzzarf)
  {
    try
    {
      Application.ActivityLifecycleCallbacks localActivityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks)this.zzb.get();
      if (localActivityLifecycleCallbacks != null)
      {
        paramzzarf.zza(localActivityLifecycleCallbacks);
        return;
      }
      if (!this.zzc)
      {
        this.zza.unregisterActivityLifecycleCallbacks(this);
        this.zzc = true;
      }
      return;
    }
    catch (Exception paramzzarf)
    {
      for (;;) {}
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzarg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */