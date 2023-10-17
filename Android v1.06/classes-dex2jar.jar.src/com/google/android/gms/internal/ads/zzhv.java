package com.google.android.gms.internal.ads;

import android.os.SystemClock;

public final class zzhv
{
  private final long zza;
  private final long zzb;
  private long zzc;
  private long zzd;
  private long zze;
  private long zzf;
  private long zzg;
  private long zzh;
  private float zzi;
  private float zzj;
  private float zzk;
  private long zzl;
  private long zzm;
  private long zzn;
  
  private static long zzf(long paramLong1, long paramLong2, float paramFloat)
  {
    return ((float)paramLong1 * 0.999F + (float)paramLong2 * 9.999871E-4F);
  }
  
  private final void zzg()
  {
    long l2 = this.zzc;
    if (l2 != -9223372036854775807L)
    {
      long l1 = this.zzd;
      if (l1 != -9223372036854775807L) {
        l2 = l1;
      }
      long l3 = this.zzf;
      l1 = l2;
      if (l3 != -9223372036854775807L)
      {
        l1 = l2;
        if (l2 < l3) {
          l1 = l3;
        }
      }
      l3 = this.zzg;
      l2 = l1;
      if (l3 != -9223372036854775807L)
      {
        l2 = l1;
        if (l1 > l3) {
          l2 = l3;
        }
      }
    }
    else
    {
      l2 = -9223372036854775807L;
    }
    if (this.zze == l2) {
      return;
    }
    this.zze = l2;
    this.zzh = l2;
    this.zzm = -9223372036854775807L;
    this.zzn = -9223372036854775807L;
    this.zzl = -9223372036854775807L;
  }
  
  public final float zza(long paramLong1, long paramLong2)
  {
    long l1 = this.zzc;
    float f2 = 1.0F;
    float f1 = f2;
    if (l1 != -9223372036854775807L)
    {
      paramLong2 = paramLong1 - paramLong2;
      l1 = this.zzm;
      if (l1 == -9223372036854775807L)
      {
        this.zzm = paramLong2;
        this.zzn = 0L;
      }
      else
      {
        l1 = Math.max(paramLong2, zzf(l1, paramLong2, 0.999F));
        this.zzm = l1;
        paramLong2 = Math.abs(paramLong2 - l1);
        this.zzn = zzf(this.zzn, paramLong2, 0.999F);
      }
      if ((this.zzl != -9223372036854775807L) && (SystemClock.elapsedRealtime() - this.zzl < 1000L)) {
        return this.zzk;
      }
      this.zzl = SystemClock.elapsedRealtime();
      l1 = this.zzm + this.zzn * 3L;
      if (this.zzh > l1)
      {
        paramLong2 = zzfn.zzo(1000L);
        float f4 = this.zzk;
        f1 = this.zzi;
        long[] arrayOfLong = new long[3];
        arrayOfLong[0] = l1;
        l1 = this.zze;
        int i = 1;
        arrayOfLong[1] = l1;
        l1 = this.zzh;
        float f3 = (float)paramLong2;
        arrayOfLong[2] = (l1 - (((f4 - 1.0F) * f3) + ((f1 - 1.0F) * f3)));
        paramLong2 = arrayOfLong[0];
        while (i < 3)
        {
          l1 = arrayOfLong[i];
          if (l1 > paramLong2) {
            paramLong2 = l1;
          }
          i++;
        }
        this.zzh = paramLong2;
      }
      else
      {
        paramLong2 = (Math.max(0.0F, this.zzk - 1.0F) / 1.0E-7F);
        l1 = Math.max(this.zzh, Math.min(paramLong1 - paramLong2, l1));
        this.zzh = l1;
        long l2 = this.zzg;
        paramLong2 = l1;
        if (l2 != -9223372036854775807L)
        {
          paramLong2 = l1;
          if (l1 > l2)
          {
            this.zzh = l2;
            paramLong2 = l2;
          }
        }
      }
      paramLong1 -= paramLong2;
      if (Math.abs(paramLong1) < this.zza)
      {
        this.zzk = 1.0F;
        f1 = f2;
      }
      else
      {
        f1 = (float)paramLong1;
        f1 = Math.max(this.zzj, Math.min(f1 * 1.0E-7F + 1.0F, this.zzi));
        this.zzk = f1;
      }
    }
    return f1;
  }
  
  public final long zzb()
  {
    return this.zzh;
  }
  
  public final void zzc()
  {
    long l1 = this.zzh;
    if (l1 == -9223372036854775807L) {
      return;
    }
    long l2 = l1 + this.zzb;
    this.zzh = l2;
    l1 = this.zzg;
    if ((l1 != -9223372036854775807L) && (l2 > l1)) {
      this.zzh = l1;
    }
    this.zzl = -9223372036854775807L;
  }
  
  public final void zzd(zzbg paramzzbg)
  {
    long l = paramzzbg.zzc;
    this.zzc = zzfn.zzo(-9223372036854775807L);
    l = paramzzbg.zzd;
    this.zzf = zzfn.zzo(-9223372036854775807L);
    l = paramzzbg.zze;
    this.zzg = zzfn.zzo(-9223372036854775807L);
    float f = paramzzbg.zzf;
    this.zzj = 0.97F;
    f = paramzzbg.zzg;
    this.zzi = 1.03F;
    zzg();
  }
  
  public final void zze(long paramLong)
  {
    this.zzd = paramLong;
    zzg();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzhv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */