package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzduy
{
  private final ScheduledExecutorService zza;
  private final zzfwc zzb;
  private final zzfwc zzc;
  private final zzdvp zzd;
  private final zzgvi zze;
  
  public zzduy(ScheduledExecutorService paramScheduledExecutorService, zzfwc paramzzfwc1, zzfwc paramzzfwc2, zzdvp paramzzdvp, zzgvi paramzzgvi)
  {
    this.zza = paramScheduledExecutorService;
    this.zzb = paramzzfwc1;
    this.zzc = paramzzfwc2;
    this.zzd = paramzzdvp;
    this.zze = paramzzgvi;
  }
  
  public final zzfwb zzb(zzbug paramzzbug)
  {
    Object localObject = paramzzbug.zzd;
    zzt.zzp();
    if (zzs.zzy((String)localObject))
    {
      localObject = zzfvr.zzg(new zzdwc(1));
    }
    else
    {
      localObject = zzbbk.zzhl;
      if (((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue()) {
        localObject = this.zzc.zzb(new zzduw(this, paramzzbug));
      } else {
        localObject = this.zzd.zzb(paramzzbug);
      }
    }
    int i = Binder.getCallingUid();
    zzfvi localzzfvi = zzfvi.zzv((zzfwb)localObject);
    localObject = zzbbk.zzfk;
    return zzfvr.zzf((zzfvi)zzfvr.zzn(localzzfvi, ((Integer)zzba.zzc().zzb((zzbbc)localObject)).intValue(), TimeUnit.SECONDS, this.zza), Throwable.class, new zzdux(this, paramzzbug, i), this.zzb);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzduy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */