package com.google.android.gms.internal.ads;

final class zzafz
  implements zzafx
{
  private final long zza;
  private final int zzb;
  private final long zzc;
  private final long zzd;
  private final long zze;
  private final long[] zzf;
  
  private zzafz(long paramLong1, int paramInt, long paramLong2, long paramLong3, long[] paramArrayOfLong)
  {
    this.zza = paramLong1;
    this.zzb = paramInt;
    this.zzc = paramLong2;
    this.zzf = paramArrayOfLong;
    this.zzd = paramLong3;
    paramLong2 = -1L;
    if (paramLong3 == -1L) {
      paramLong1 = paramLong2;
    } else {
      paramLong1 += paramLong3;
    }
    this.zze = paramLong1;
  }
  
  public static zzafz zza(long paramLong1, long paramLong2, zzabh paramzzabh, zzfd paramzzfd)
  {
    int k = paramzzabh.zzg;
    int i = paramzzabh.zzd;
    int j = paramzzfd.zze();
    if ((j & 0x1) == 1)
    {
      int m = paramzzfd.zzn();
      if (m != 0)
      {
        long l2 = k;
        long l1 = i;
        l2 = zzfn.zzp(m, l2 * 1000000L, l1);
        if ((j & 0x6) != 6) {
          return new zzafz(paramLong2, paramzzabh.zzc, l2, -1L, null);
        }
        long l3 = paramzzfd.zzs();
        long[] arrayOfLong = new long[100];
        for (i = 0; i < 100; i++) {
          arrayOfLong[i] = paramzzfd.zzk();
        }
        if (paramLong1 != -1L)
        {
          l1 = paramLong2 + l3;
          if (paramLong1 != l1)
          {
            paramzzfd = new StringBuilder();
            paramzzfd.append("XING data size mismatch: ");
            paramzzfd.append(paramLong1);
            paramzzfd.append(", ");
            paramzzfd.append(l1);
            zzer.zze("XingSeeker", paramzzfd.toString());
          }
        }
        return new zzafz(paramLong2, paramzzabh.zzc, l2, l3, arrayOfLong);
      }
    }
    return null;
  }
  
  private final long zzd(int paramInt)
  {
    return this.zzc * paramInt / 100L;
  }
  
  public final long zzb()
  {
    return this.zze;
  }
  
  public final long zzc(long paramLong)
  {
    paramLong -= this.zza;
    if ((zzh()) && (paramLong > this.zzb))
    {
      long[] arrayOfLong = this.zzf;
      zzdy.zzb(arrayOfLong);
      double d = paramLong * 256.0D / this.zzd;
      int i = zzfn.zzc(arrayOfLong, d, true, true);
      long l3 = zzd(i);
      long l1 = arrayOfLong[i];
      int j = i + 1;
      long l2 = zzd(j);
      if (i == 99) {
        paramLong = 256L;
      } else {
        paramLong = arrayOfLong[j];
      }
      if (l1 == paramLong) {
        d = 0.0D;
      } else {
        d = (d - l1) / (paramLong - l1);
      }
      return l3 + Math.round(d * (l2 - l3));
    }
    return 0L;
  }
  
  public final long zze()
  {
    return this.zzc;
  }
  
  public final zzabl zzg(long paramLong)
  {
    if (!zzh())
    {
      localObject = new zzabo(0L, this.zza + this.zzb);
      return new zzabl((zzabo)localObject, (zzabo)localObject);
    }
    paramLong = Math.max(0L, Math.min(paramLong, this.zzc));
    double d2 = paramLong * 100.0D / this.zzc;
    double d1 = 0.0D;
    if (d2 > 0.0D) {
      if (d2 >= 100.0D)
      {
        d1 = 256.0D;
      }
      else
      {
        int i = (int)d2;
        localObject = this.zzf;
        zzdy.zzb(localObject);
        double d3 = localObject[i];
        if (i == 99) {
          d1 = 256.0D;
        } else {
          d1 = localObject[(i + 1)];
        }
        d1 = d3 + (d2 - i) * (d1 - d3);
      }
    }
    long l = Math.round(d1 / 256.0D * this.zzd);
    l = Math.max(this.zzb, Math.min(l, this.zzd - 1L));
    Object localObject = new zzabo(paramLong, this.zza + l);
    return new zzabl((zzabo)localObject, (zzabo)localObject);
  }
  
  public final boolean zzh()
  {
    return this.zzf != null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzafz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */