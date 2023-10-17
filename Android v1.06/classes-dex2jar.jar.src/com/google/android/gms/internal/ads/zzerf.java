package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzerf
  implements zzeqq
{
  private final Context zza;
  private final ScheduledExecutorService zzb;
  private final Executor zzc;
  private final int zzd;
  private final boolean zze;
  private final boolean zzf;
  private final zzbyt zzg;
  
  zzerf(zzbyt paramzzbyt, Context paramContext, ScheduledExecutorService paramScheduledExecutorService, Executor paramExecutor, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.zzg = paramzzbyt;
    this.zza = paramContext;
    this.zzb = paramScheduledExecutorService;
    this.zzc = paramExecutor;
    this.zzd = paramInt;
    this.zze = paramBoolean1;
    this.zzf = paramBoolean2;
  }
  
  public final int zza()
  {
    return 40;
  }
  
  public final zzfwb zzb()
  {
    Object localObject = zzbbk.zzaR;
    if (((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue())
    {
      localObject = zzfvr.zzl(zzfvi.zzv(this.zzg.zza(this.zza, this.zzd)), new zzerd(this), this.zzc);
      zzbbc localzzbbc = zzbbk.zzaS;
      return zzfvr.zze((zzfvi)zzfvr.zzn((zzfwb)localObject, ((Long)zzba.zzc().zzb(localzzbbc)).longValue(), TimeUnit.MILLISECONDS, this.zzb), Throwable.class, new zzere(this), this.zzc);
    }
    return zzfvr.zzg(new Exception("Did not ad Ad ID into query param."));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzerf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */