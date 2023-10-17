package com.google.android.gms.internal.ads;

import java.util.Objects;

public final class zzfl
{
  private long zza;
  private long zzb;
  private long zzc;
  private final ThreadLocal zzd = new ThreadLocal();
  
  public zzfl(long paramLong)
  {
    zzf(0L);
  }
  
  public final long zza(long paramLong)
  {
    try
    {
      if (this.zzb == -9223372036854775807L)
      {
        long l2 = this.zza;
        l1 = l2;
        if (l2 == 9223372036854775806L)
        {
          Long localLong = (Long)this.zzd.get();
          Objects.requireNonNull(localLong);
          l1 = localLong.longValue();
        }
        this.zzb = (l1 - paramLong);
        notifyAll();
      }
      this.zzc = paramLong;
      long l1 = this.zzb;
      return paramLong + l1;
    }
    finally {}
  }
  
  public final long zzb(long paramLong)
  {
    if (paramLong == -9223372036854775807L) {
      return -9223372036854775807L;
    }
    try
    {
      long l2 = this.zzc;
      long l1 = paramLong;
      if (l2 != -9223372036854775807L)
      {
        long l3 = l2 * 90000L / 1000000L;
        l1 = (4294967296L + l3) / 8589934592L;
        l2 = (-1L + l1) * 8589934592L + paramLong;
        paramLong += l1 * 8589934592L;
        l1 = paramLong;
        if (Math.abs(l2 - l3) < Math.abs(paramLong - l3)) {
          l1 = l2;
        }
      }
      paramLong = zza(l1 * 1000000L / 90000L);
      return paramLong;
    }
    finally {}
  }
  
  public final long zzc()
  {
    try
    {
      long l = this.zza;
      if ((l != Long.MAX_VALUE) && (l != 9223372036854775806L)) {
        return l;
      }
      return -9223372036854775807L;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final long zzd()
  {
    try
    {
      long l = this.zzc;
      if (l != -9223372036854775807L) {
        l += this.zzb;
      } else {
        l = zzc();
      }
      return l;
    }
    finally {}
  }
  
  public final long zze()
  {
    try
    {
      long l = this.zzb;
      return l;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void zzf(long paramLong)
  {
    try
    {
      this.zza = paramLong;
      if (paramLong == Long.MAX_VALUE) {
        paramLong = 0L;
      } else {
        paramLong = -9223372036854775807L;
      }
      this.zzb = paramLong;
      this.zzc = -9223372036854775807L;
      return;
    }
    finally {}
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */