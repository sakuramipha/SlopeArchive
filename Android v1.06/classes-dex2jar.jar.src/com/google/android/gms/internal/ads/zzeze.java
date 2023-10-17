package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.util.Clock;

public final class zzeze
{
  private final Clock zza;
  private final Object zzb = new Object();
  private volatile long zzc = 0L;
  private volatile int zzd = 1;
  
  public zzeze(Clock paramClock)
  {
    this.zza = paramClock;
  }
  
  private final void zze()
  {
    long l1 = this.zza.currentTimeMillis();
    synchronized (this.zzb)
    {
      if (this.zzd == 3)
      {
        long l2 = this.zzc;
        zzbbc localzzbbc = zzbbk.zzfI;
        if (l2 + ((Long)zzba.zzc().zzb(localzzbbc)).longValue() <= l1) {
          this.zzd = 1;
        }
      }
      return;
    }
  }
  
  private final void zzf(int paramInt1, int paramInt2)
  {
    zze();
    long l = this.zza.currentTimeMillis();
    synchronized (this.zzb)
    {
      if (this.zzd != paramInt1) {
        return;
      }
      this.zzd = paramInt2;
      if (this.zzd == 3) {
        this.zzc = l;
      }
      return;
    }
  }
  
  public final void zza()
  {
    zzf(2, 3);
  }
  
  public final void zzb(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      zzf(1, 2);
      return;
    }
    zzf(2, 1);
  }
  
  public final boolean zzc()
  {
    synchronized (this.zzb)
    {
      zze();
      boolean bool;
      if (this.zzd == 3) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
  
  public final boolean zzd()
  {
    synchronized (this.zzb)
    {
      zze();
      boolean bool;
      if (this.zzd == 2) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzeze.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */