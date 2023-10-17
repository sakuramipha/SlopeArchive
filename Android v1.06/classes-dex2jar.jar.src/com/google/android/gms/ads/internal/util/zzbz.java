package com.google.android.gms.ads.internal.util;

import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Clock;

public final class zzbz
{
  private long zza;
  private long zzb = Long.MIN_VALUE;
  private final Object zzc = new Object();
  
  public zzbz(long paramLong)
  {
    this.zza = paramLong;
  }
  
  public final void zza(long paramLong)
  {
    synchronized (this.zzc)
    {
      this.zza = paramLong;
      return;
    }
  }
  
  public final boolean zzb()
  {
    synchronized (this.zzc)
    {
      long l = zzt.zzB().elapsedRealtime();
      if (this.zzb + this.zza > l) {
        return false;
      }
      this.zzb = l;
      return true;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\interna\\util\zzbz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */