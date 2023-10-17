package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Clock;

final class zzbzb
{
  private final Object zza = new Object();
  private volatile long zzb = 0L;
  private volatile int zzc = 1;
  
  public final void zza()
  {
    long l2 = zzt.zzB().currentTimeMillis();
    synchronized (this.zza)
    {
      if (this.zzc == 3)
      {
        l1 = this.zzb;
        zzbbc localzzbbc = zzbbk.zzfI;
        if (l1 + ((Long)zzba.zzc().zzb(localzzbbc)).longValue() <= l2) {
          this.zzc = 1;
        }
      }
      long l1 = zzt.zzB().currentTimeMillis();
      synchronized (this.zza)
      {
        if (this.zzc != 2) {
          return;
        }
        this.zzc = 3;
        if (this.zzc == 3) {
          this.zzb = l1;
        }
        return;
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbzb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */