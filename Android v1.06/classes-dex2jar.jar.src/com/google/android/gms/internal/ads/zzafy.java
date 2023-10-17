package com.google.android.gms.internal.ads;

final class zzafy
  implements zzafx
{
  private final long[] zza;
  private final long[] zzb;
  private final long zzc;
  private final long zzd;
  
  private zzafy(long[] paramArrayOfLong1, long[] paramArrayOfLong2, long paramLong1, long paramLong2)
  {
    this.zza = paramArrayOfLong1;
    this.zzb = paramArrayOfLong2;
    this.zzc = paramLong1;
    this.zzd = paramLong2;
  }
  
  public static zzafy zza(long paramLong1, long paramLong2, zzabh paramzzabh, zzfd paramzzfd)
  {
    paramzzfd.zzG(10);
    int k = paramzzfd.zze();
    if (k <= 0) {
      return null;
    }
    int j = paramzzabh.zzd;
    int i;
    if (j >= 32000) {
      i = 1152;
    } else {
      i = 576;
    }
    long l1 = i;
    long l2 = j;
    l2 = zzfn.zzp(k, l1 * 1000000L, l2);
    k = paramzzfd.zzo();
    j = paramzzfd.zzo();
    int n = paramzzfd.zzo();
    paramzzfd.zzG(2);
    l1 = paramLong2 + paramzzabh.zzc;
    long[] arrayOfLong = new long[k];
    paramzzabh = new long[k];
    for (int m = 0; m < k; m++)
    {
      arrayOfLong[m] = (m * l2 / k);
      paramzzabh[m] = Math.max(paramLong2, l1);
      if (n != 1)
      {
        if (n != 2)
        {
          if (n != 3)
          {
            if (n != 4) {
              return null;
            }
            i = paramzzfd.zzn();
          }
          else
          {
            i = paramzzfd.zzm();
          }
        }
        else {
          i = paramzzfd.zzo();
        }
      }
      else {
        i = paramzzfd.zzk();
      }
      long l3 = j;
      paramLong2 += i * l3;
    }
    if ((paramLong1 != -1L) && (paramLong1 != paramLong2))
    {
      paramzzfd = new StringBuilder();
      paramzzfd.append("VBRI data size mismatch: ");
      paramzzfd.append(paramLong1);
      paramzzfd.append(", ");
      paramzzfd.append(paramLong2);
      zzer.zze("VbriSeeker", paramzzfd.toString());
    }
    return new zzafy(arrayOfLong, paramzzabh, l2, paramLong2);
  }
  
  public final long zzb()
  {
    return this.zzd;
  }
  
  public final long zzc(long paramLong)
  {
    return this.zza[zzfn.zzc(this.zzb, paramLong, true, true)];
  }
  
  public final long zze()
  {
    return this.zzc;
  }
  
  public final zzabl zzg(long paramLong)
  {
    int i = zzfn.zzc(this.zza, paramLong, true, true);
    zzabo localzzabo = new zzabo(this.zza[i], this.zzb[i]);
    if (localzzabo.zzb < paramLong)
    {
      long[] arrayOfLong = this.zza;
      if (i != arrayOfLong.length - 1)
      {
        i++;
        return new zzabl(localzzabo, new zzabo(arrayOfLong[i], this.zzb[i]));
      }
    }
    return new zzabl(localzzabo, localzzabo);
  }
  
  public final boolean zzh()
  {
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzafy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */