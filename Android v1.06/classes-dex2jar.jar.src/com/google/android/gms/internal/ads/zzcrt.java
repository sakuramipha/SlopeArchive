package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

public final class zzcrt
{
  private final Executor zza;
  private final ScheduledExecutorService zzb;
  private final zzfwb zzc;
  private volatile boolean zzd = true;
  
  public zzcrt(Executor paramExecutor, ScheduledExecutorService paramScheduledExecutorService, zzfwb paramzzfwb)
  {
    this.zza = paramExecutor;
    this.zzb = paramScheduledExecutorService;
    this.zzc = paramzzfwb;
  }
  
  public final void zze(zzfvn paramzzfvn)
  {
    zzfvr.zzq(this.zzc, new zzcrr(this, paramzzfvn), this.zza);
  }
  
  public final boolean zzf()
  {
    return this.zzd;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcrt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */