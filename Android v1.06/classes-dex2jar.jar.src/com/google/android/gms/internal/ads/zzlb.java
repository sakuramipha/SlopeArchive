package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

public final class zzlb
{
  private final zzla zza;
  private final zzkz zzb;
  private final zzdz zzc;
  private final zzcx zzd;
  private int zze;
  private Object zzf;
  private final Looper zzg;
  private final int zzh;
  private boolean zzi;
  private boolean zzj;
  private boolean zzk;
  
  public zzlb(zzkz paramzzkz, zzla paramzzla, zzcx paramzzcx, int paramInt, zzdz paramzzdz, Looper paramLooper)
  {
    this.zzb = paramzzkz;
    this.zza = paramzzla;
    this.zzd = paramzzcx;
    this.zzg = paramLooper;
    this.zzc = paramzzdz;
    this.zzh = paramInt;
  }
  
  public final int zza()
  {
    return this.zze;
  }
  
  public final Looper zzb()
  {
    return this.zzg;
  }
  
  public final zzla zzc()
  {
    return this.zza;
  }
  
  public final zzlb zzd()
  {
    zzdy.zzf(this.zzi ^ true);
    this.zzi = true;
    this.zzb.zzm(this);
    return this;
  }
  
  public final zzlb zze(Object paramObject)
  {
    zzdy.zzf(this.zzi ^ true);
    this.zzf = paramObject;
    return this;
  }
  
  public final zzlb zzf(int paramInt)
  {
    zzdy.zzf(this.zzi ^ true);
    this.zze = paramInt;
    return this;
  }
  
  public final Object zzg()
  {
    return this.zzf;
  }
  
  public final void zzh(boolean paramBoolean)
  {
    try
    {
      this.zzj = (paramBoolean | this.zzj);
      this.zzk = true;
      notifyAll();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final boolean zzi(long paramLong)
    throws InterruptedException, TimeoutException
  {
    try
    {
      zzdy.zzf(this.zzi);
      if (this.zzg.getThread() != Thread.currentThread()) {
        bool = true;
      } else {
        bool = false;
      }
      zzdy.zzf(bool);
      long l2 = SystemClock.elapsedRealtime();
      long l1 = paramLong;
      while (!this.zzk) {
        if (l1 > 0L)
        {
          wait(l1);
          l1 = l2 + paramLong - SystemClock.elapsedRealtime();
        }
        else
        {
          TimeoutException localTimeoutException = new java/util/concurrent/TimeoutException;
          localTimeoutException.<init>("Message delivery timed out.");
          throw localTimeoutException;
        }
      }
      boolean bool = this.zzj;
      return bool;
    }
    finally {}
  }
  
  public final boolean zzj()
  {
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzlb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */