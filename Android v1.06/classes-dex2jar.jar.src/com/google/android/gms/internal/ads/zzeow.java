package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzeow
  implements zzeqq
{
  private final zzeqq zza;
  private final long zzb;
  private final ScheduledExecutorService zzc;
  
  public zzeow(zzeqq paramzzeqq, long paramLong, ScheduledExecutorService paramScheduledExecutorService)
  {
    this.zza = paramzzeqq;
    this.zzb = paramLong;
    this.zzc = paramScheduledExecutorService;
  }
  
  public final int zza()
  {
    return this.zza.zza();
  }
  
  public final zzfwb zzb()
  {
    zzfwb localzzfwb2 = this.zza.zzb();
    long l = this.zzb;
    zzfwb localzzfwb1 = localzzfwb2;
    if (l > 0L) {
      localzzfwb1 = zzfvr.zzn(localzzfwb2, l, TimeUnit.MILLISECONDS, this.zzc);
    }
    return zzfvr.zzf(localzzfwb1, Throwable.class, zzeov.zza, zzcag.zzf);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzeow.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */