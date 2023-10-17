package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class zzauq
  implements Application.ActivityLifecycleCallbacks
{
  private Activity zza;
  private Context zzb;
  private final Object zzc = new Object();
  private boolean zzd = true;
  private boolean zze = false;
  private final List zzf = new ArrayList();
  private final List zzg = new ArrayList();
  private Runnable zzh;
  private boolean zzi = false;
  private long zzj;
  
  private final void zzk(Activity paramActivity)
  {
    synchronized (this.zzc)
    {
      if (!paramActivity.getClass().getName().startsWith("com.google.android.gms.ads")) {
        this.zza = paramActivity;
      }
      return;
    }
  }
  
  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle) {}
  
  public final void onActivityDestroyed(Activity paramActivity)
  {
    synchronized (this.zzc)
    {
      Object localObject2 = this.zza;
      if (localObject2 != null)
      {
        if (localObject2.equals(paramActivity)) {
          this.zza = null;
        }
        paramActivity = this.zzg.iterator();
        while (paramActivity.hasNext())
        {
          localObject2 = (zzavf)paramActivity.next();
          try
          {
            if (((zzavf)localObject2).zza()) {
              paramActivity.remove();
            }
          }
          catch (Exception localException)
          {
            zzt.zzo().zzu(localException, "AppActivityTracker.ActivityListener.onActivityDestroyed");
            zzbzt.zzh("", localException);
          }
        }
        return;
      }
      return;
    }
  }
  
  public final void onActivityPaused(Activity arg1)
  {
    zzk(???);
    synchronized (this.zzc)
    {
      Object localObject1 = this.zzg.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        zzavf localzzavf = (zzavf)((Iterator)localObject1).next();
        try
        {
          localzzavf.zzb();
        }
        catch (Exception localException)
        {
          zzt.zzo().zzu(localException, "AppActivityTracker.ActivityListener.onActivityPaused");
          zzbzt.zzh("", localException);
        }
      }
      this.zze = true;
      if (this.zzh != null) {
        zzs.zza.removeCallbacks(this.zzh);
      }
      localObject1 = zzs.zza;
      ??? = new zzaup(this);
      this.zzh = ???;
      ((zzflv)localObject1).postDelayed(???, this.zzj);
      return;
    }
  }
  
  public final void onActivityResumed(Activity arg1)
  {
    zzk(???);
    this.zze = false;
    boolean bool = this.zzd;
    this.zzd = true;
    if (this.zzh != null) {
      zzs.zza.removeCallbacks(this.zzh);
    }
    synchronized (this.zzc)
    {
      Iterator localIterator = this.zzg.iterator();
      while (localIterator.hasNext())
      {
        zzavf localzzavf = (zzavf)localIterator.next();
        try
        {
          localzzavf.zzc();
        }
        catch (Exception localException1)
        {
          zzt.zzo().zzu(localException1, "AppActivityTracker.ActivityListener.onActivityResumed");
          zzbzt.zzh("", localException1);
        }
      }
      if ((bool ^ true))
      {
        localIterator = this.zzf.iterator();
        while (localIterator.hasNext())
        {
          zzaur localzzaur = (zzaur)localIterator.next();
          try
          {
            localzzaur.zza(true);
          }
          catch (Exception localException2)
          {
            zzbzt.zzh("", localException2);
          }
        }
      }
      zzbzt.zze("App is still foreground.");
      return;
    }
  }
  
  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
  
  public final void onActivityStarted(Activity paramActivity)
  {
    zzk(paramActivity);
  }
  
  public final void onActivityStopped(Activity paramActivity) {}
  
  public final Activity zza()
  {
    return this.zza;
  }
  
  public final Context zzb()
  {
    return this.zzb;
  }
  
  public final void zzf(zzaur paramzzaur)
  {
    synchronized (this.zzc)
    {
      this.zzf.add(paramzzaur);
      return;
    }
  }
  
  public final void zzg(Application paramApplication, Context paramContext)
  {
    if (!this.zzi)
    {
      paramApplication.registerActivityLifecycleCallbacks(this);
      if ((paramContext instanceof Activity)) {
        zzk((Activity)paramContext);
      }
      this.zzb = paramApplication;
      paramApplication = zzbbk.zzaP;
      this.zzj = ((Long)zzba.zzc().zzb(paramApplication)).longValue();
      this.zzi = true;
    }
  }
  
  public final void zzh(zzaur paramzzaur)
  {
    synchronized (this.zzc)
    {
      this.zzf.remove(paramzzaur);
      return;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzauq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */