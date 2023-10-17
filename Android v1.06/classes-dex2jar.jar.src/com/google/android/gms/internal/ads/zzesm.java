package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzesm
  implements zzeqq
{
  private final Context zza;
  private final zzbzc zzb;
  private final ScheduledExecutorService zzc;
  private final Executor zzd;
  private final String zze;
  private final zzbyt zzf;
  
  public zzesm(zzbyt paramzzbyt, int paramInt, Context paramContext, zzbzc paramzzbzc, ScheduledExecutorService paramScheduledExecutorService, Executor paramExecutor, String paramString)
  {
    this.zzf = paramzzbyt;
    this.zza = paramContext;
    this.zzb = paramzzbzc;
    this.zzc = paramScheduledExecutorService;
    this.zzd = paramExecutor;
    this.zze = paramString;
  }
  
  public final int zza()
  {
    return 44;
  }
  
  public final zzfwb zzb()
  {
    zzfwb localzzfwb = zzfvr.zzl(zzfvi.zzv(zzfvr.zzk(new zzesj(this), this.zzd)), zzesk.zza, this.zzd);
    zzbbc localzzbbc = zzbbk.zzaS;
    return zzfvr.zze((zzfvi)zzfvr.zzn(localzzfwb, ((Long)zzba.zzc().zzb(localzzbbc)).longValue(), TimeUnit.MILLISECONDS, this.zzc), Exception.class, new zzesl(this), zzfwi.zzb());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzesm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */