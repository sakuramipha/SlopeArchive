package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import android.view.View;
import java.util.Collection;
import java.util.Iterator;

public final class zzfhe
  implements Application.ActivityLifecycleCallbacks
{
  private static final zzfhe zza = new zzfhe();
  private boolean zzb;
  private boolean zzc;
  private zzfhj zzd;
  
  public static zzfhe zza()
  {
    return zza;
  }
  
  private final void zze()
  {
    boolean bool = this.zzc;
    Iterator localIterator = zzfhd.zza().zzc().iterator();
    while (localIterator.hasNext())
    {
      zzfhp localzzfhp = ((zzfgs)localIterator.next()).zzg();
      if (localzzfhp.zzk())
      {
        String str;
        if (true != bool) {
          str = "foregrounded";
        } else {
          str = "backgrounded";
        }
        zzfhi.zza().zzb(localzzfhp.zza(), "setState", new Object[] { str });
      }
    }
  }
  
  private final void zzf(boolean paramBoolean)
  {
    if (this.zzc != paramBoolean)
    {
      this.zzc = paramBoolean;
      if (this.zzb)
      {
        zze();
        if (this.zzd != null)
        {
          if ((paramBoolean ^ true))
          {
            zzfif.zzd().zzi();
            return;
          }
          zzfif.zzd().zzh();
        }
      }
    }
  }
  
  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle) {}
  
  public final void onActivityDestroyed(Activity paramActivity) {}
  
  public final void onActivityPaused(Activity paramActivity) {}
  
  public final void onActivityResumed(Activity paramActivity) {}
  
  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
  
  public final void onActivityStarted(Activity paramActivity)
  {
    zzf(false);
  }
  
  public final void onActivityStopped(Activity paramActivity)
  {
    paramActivity = new ActivityManager.RunningAppProcessInfo();
    ActivityManager.getMyMemoryState(paramActivity);
    int j = paramActivity.importance;
    paramActivity = zzfhd.zza().zzb().iterator();
    boolean bool = true;
    int i = 1;
    while (paramActivity.hasNext())
    {
      Object localObject = (zzfgs)paramActivity.next();
      if (((zzfgs)localObject).zzj())
      {
        localObject = ((zzfgs)localObject).zzf();
        if ((localObject != null) && (((View)localObject).hasWindowFocus())) {
          i = 0;
        }
      }
    }
    if ((j == 100) || (i == 0)) {
      bool = false;
    }
    zzf(bool);
  }
  
  public final void zzb()
  {
    this.zzb = true;
    this.zzc = false;
    zze();
  }
  
  public final void zzc()
  {
    this.zzb = false;
    this.zzc = false;
    this.zzd = null;
  }
  
  public final void zzd(zzfhj paramzzfhj)
  {
    this.zzd = paramzzfhj;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfhe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */