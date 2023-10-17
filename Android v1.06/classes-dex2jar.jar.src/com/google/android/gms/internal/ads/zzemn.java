package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.atomic.AtomicReference;

public final class zzemn
  implements zzeqq
{
  private final AtomicReference zza = new AtomicReference();
  private final Clock zzb;
  private final zzeqq zzc;
  private final long zzd;
  
  public zzemn(zzeqq paramzzeqq, long paramLong, Clock paramClock)
  {
    this.zzb = paramClock;
    this.zzc = paramzzeqq;
    this.zzd = paramLong;
  }
  
  public final int zza()
  {
    return 16;
  }
  
  public final zzfwb zzb()
  {
    zzemm localzzemm2 = (zzemm)this.zza.get();
    zzemm localzzemm1;
    if (localzzemm2 != null)
    {
      localzzemm1 = localzzemm2;
      if (!localzzemm2.zza()) {}
    }
    else
    {
      localzzemm1 = new zzemm(this.zzc.zzb(), this.zzd, this.zzb);
      this.zza.set(localzzemm1);
    }
    return localzzemm1.zza;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzemn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */