package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

final class zzemm
{
  public final zzfwb zza;
  private final long zzb;
  private final Clock zzc;
  
  public zzemm(zzfwb paramzzfwb, long paramLong, Clock paramClock)
  {
    this.zza = paramzzfwb;
    this.zzc = paramClock;
    this.zzb = (paramClock.elapsedRealtime() + paramLong);
  }
  
  public final boolean zza()
  {
    return this.zzb < this.zzc.elapsedRealtime();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzemm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */