package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class zzaus
{
  private final Object zza = new Object();
  private zzauq zzb = null;
  private boolean zzc = false;
  
  public final Activity zza()
  {
    synchronized (this.zza)
    {
      Object localObject2 = this.zzb;
      if (localObject2 != null)
      {
        localObject2 = ((zzauq)localObject2).zza();
        return (Activity)localObject2;
      }
      return null;
    }
  }
  
  public final Context zzb()
  {
    synchronized (this.zza)
    {
      Object localObject2 = this.zzb;
      if (localObject2 != null)
      {
        localObject2 = ((zzauq)localObject2).zzb();
        return (Context)localObject2;
      }
      return null;
    }
  }
  
  public final void zzc(zzaur paramzzaur)
  {
    synchronized (this.zza)
    {
      if (this.zzb == null)
      {
        zzauq localzzauq = new com/google/android/gms/internal/ads/zzauq;
        localzzauq.<init>();
        this.zzb = localzzauq;
      }
      this.zzb.zzf(paramzzaur);
      return;
    }
  }
  
  public final void zzd(Context paramContext)
  {
    synchronized (this.zza)
    {
      if (!this.zzc)
      {
        Object localObject2 = paramContext.getApplicationContext();
        Object localObject1 = localObject2;
        if (localObject2 == null) {
          localObject1 = paramContext;
        }
        if ((localObject1 instanceof Application)) {
          localObject1 = (Application)localObject1;
        } else {
          localObject1 = null;
        }
        if (localObject1 == null)
        {
          zzbzt.zzj("Can not cast Context to Application");
          return;
        }
        if (this.zzb == null)
        {
          localObject2 = new com/google/android/gms/internal/ads/zzauq;
          ((zzauq)localObject2).<init>();
          this.zzb = ((zzauq)localObject2);
        }
        this.zzb.zzg((Application)localObject1, paramContext);
        this.zzc = true;
      }
      return;
    }
  }
  
  public final void zze(zzaur paramzzaur)
  {
    synchronized (this.zza)
    {
      zzauq localzzauq = this.zzb;
      if (localzzauq == null) {
        return;
      }
      localzzauq.zzh(paramzzaur);
      return;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaus.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */