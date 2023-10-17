package com.google.android.gms.internal.ads;

import java.io.IOException;

final class zzajj
  implements zzzz
{
  private final zzfl zza;
  private final zzfd zzb;
  private final int zzc;
  
  public zzajj(int paramInt1, zzfl paramzzfl, int paramInt2)
  {
    this.zzc = paramInt1;
    this.zza = paramzzfl;
    this.zzb = new zzfd();
  }
  
  public final zzzy zza(zzaap paramzzaap, long paramLong)
    throws IOException
  {
    long l6 = paramzzaap.zzf();
    int i = (int)Math.min(112800L, paramzzaap.zzd() - l6);
    this.zzb.zzC(i);
    byte[] arrayOfByte = this.zzb.zzH();
    ((zzaae)paramzzaap).zzm(arrayOfByte, 0, i, false);
    paramzzaap = this.zzb;
    i = paramzzaap.zzd();
    long l5 = -1L;
    long l1 = -9223372036854775807L;
    long l3 = -1L;
    while (paramzzaap.zza() >= 188)
    {
      int j = zzajv.zza(paramzzaap.zzH(), paramzzaap.zzc(), i);
      int k = j + 188;
      if (k > i) {
        break;
      }
      l5 = zzajv.zzb(paramzzaap, j, this.zzc);
      long l4 = l3;
      long l2 = l1;
      if (l5 != -9223372036854775807L)
      {
        l2 = this.zza.zzb(l5);
        if (l2 > paramLong)
        {
          if (l1 == -9223372036854775807L) {
            return zzzy.zzd(l2, l6);
          }
          paramLong = l6 + l3;
        }
        else
        {
          if (100000L + l2 <= paramLong) {
            break label229;
          }
          paramLong = l6 + j;
        }
        return zzzy.zze(paramLong);
        label229:
        l4 = j;
      }
      paramzzaap.zzF(k);
      l5 = k;
      l3 = l4;
      l1 = l2;
    }
    if (l1 != -9223372036854775807L) {
      paramzzaap = zzzy.zzf(l1, l6 + l5);
    } else {
      paramzzaap = zzzy.zza;
    }
    return paramzzaap;
  }
  
  public final void zzb()
  {
    zzfd localzzfd = this.zzb;
    byte[] arrayOfByte = zzfn.zzf;
    int i = arrayOfByte.length;
    localzzfd.zzD(arrayOfByte, 0);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzajj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */