package com.google.android.gms.internal.ads;

import android.util.Pair;

final class zzafs
  implements zzafx
{
  private final long[] zza;
  private final long[] zzb;
  private final long zzc;
  
  private zzafs(long[] paramArrayOfLong1, long[] paramArrayOfLong2, long paramLong)
  {
    this.zza = paramArrayOfLong1;
    this.zzb = paramArrayOfLong2;
    if (paramLong == -9223372036854775807L) {
      paramLong = zzfn.zzo(paramArrayOfLong2[(paramArrayOfLong2.length - 1)]);
    }
    this.zzc = paramLong;
  }
  
  public static zzafs zza(long paramLong1, zzaej paramzzaej, long paramLong2)
  {
    int j = paramzzaej.zzd.length;
    int i = j + 1;
    long[] arrayOfLong2 = new long[i];
    long[] arrayOfLong1 = new long[i];
    arrayOfLong2[0] = paramLong1;
    long l2 = 0L;
    arrayOfLong1[0] = 0L;
    i = 1;
    long l1 = paramLong1;
    paramLong1 = l2;
    while (i <= j)
    {
      int k = paramzzaej.zzb;
      int[] arrayOfInt = paramzzaej.zzd;
      int m = i - 1;
      l1 += k + arrayOfInt[m];
      paramLong1 += paramzzaej.zzc + paramzzaej.zze[m];
      arrayOfLong2[i] = l1;
      arrayOfLong1[i] = paramLong1;
      i++;
    }
    return new zzafs(arrayOfLong2, arrayOfLong1, paramLong2);
  }
  
  private static Pair zzd(long paramLong, long[] paramArrayOfLong1, long[] paramArrayOfLong2)
  {
    int i = zzfn.zzc(paramArrayOfLong1, paramLong, true, true);
    long l1 = paramArrayOfLong1[i];
    long l4 = paramArrayOfLong2[i];
    i++;
    if (i == paramArrayOfLong1.length) {
      return Pair.create(Long.valueOf(l1), Long.valueOf(l4));
    }
    long l2 = paramArrayOfLong1[i];
    long l3 = paramArrayOfLong2[i];
    double d;
    if (l2 == l1) {
      d = 0.0D;
    } else {
      d = (paramLong - l1) / (l2 - l1);
    }
    return Pair.create(Long.valueOf(paramLong), Long.valueOf((d * (l3 - l4)) + l4));
  }
  
  public final long zzb()
  {
    return -1L;
  }
  
  public final long zzc(long paramLong)
  {
    return zzfn.zzo(((Long)zzd(paramLong, this.zza, this.zzb).second).longValue());
  }
  
  public final long zze()
  {
    return this.zzc;
  }
  
  public final zzabl zzg(long paramLong)
  {
    Object localObject = zzd(zzfn.zzq(Math.max(0L, Math.min(paramLong, this.zzc))), this.zzb, this.zza);
    localObject = new zzabo(zzfn.zzo(((Long)((Pair)localObject).first).longValue()), ((Long)((Pair)localObject).second).longValue());
    return new zzabl((zzabo)localObject, (zzabo)localObject);
  }
  
  public final boolean zzh()
  {
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzafs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */