package com.google.android.gms.internal.ads;

import java.io.IOException;

final class zzaja
  implements zzzz
{
  private final zzfl zza;
  private final zzfd zzb;
  
  public final zzzy zza(zzaap paramzzaap, long paramLong)
    throws IOException
  {
    long l3 = paramzzaap.zzf();
    int i = (int)Math.min(20000L, paramzzaap.zzd() - l3);
    this.zzb.zzC(i);
    byte[] arrayOfByte = this.zzb.zzH();
    ((zzaae)paramzzaap).zzm(arrayOfByte, 0, i, false);
    paramzzaap = this.zzb;
    int k = -1;
    long l1 = -9223372036854775807L;
    int j = -1;
    while (paramzzaap.zza() >= 4) {
      if (zzajb.zzh(paramzzaap.zzH(), paramzzaap.zzc()) != 442)
      {
        paramzzaap.zzG(1);
      }
      else
      {
        paramzzaap.zzG(4);
        long l4 = zzajc.zzc(paramzzaap);
        i = j;
        long l2 = l1;
        if (l4 != -9223372036854775807L)
        {
          l2 = this.zza.zzb(l4);
          if (l2 > paramLong)
          {
            if (l1 == -9223372036854775807L) {
              return zzzy.zzd(l2, l3);
            }
            paramLong = j;
          }
          else
          {
            if (100000L + l2 <= paramLong) {
              break label208;
            }
            paramLong = paramzzaap.zzc();
          }
          return zzzy.zze(l3 + paramLong);
          label208:
          i = paramzzaap.zzc();
        }
        j = paramzzaap.zzd();
        if (paramzzaap.zza() < 10)
        {
          paramzzaap.zzF(j);
        }
        else
        {
          paramzzaap.zzG(9);
          k = paramzzaap.zzk() & 0x7;
          if (paramzzaap.zza() < k)
          {
            paramzzaap.zzF(j);
          }
          else
          {
            paramzzaap.zzG(k);
            if (paramzzaap.zza() < 4)
            {
              paramzzaap.zzF(j);
            }
            else if (zzajb.zzh(paramzzaap.zzH(), paramzzaap.zzc()) == 443)
            {
              paramzzaap.zzG(4);
              k = paramzzaap.zzo();
              if (paramzzaap.zza() < k) {
                paramzzaap.zzF(j);
              } else {
                paramzzaap.zzG(k);
              }
            }
            else
            {
              while (paramzzaap.zza() >= 4)
              {
                k = zzajb.zzh(paramzzaap.zzH(), paramzzaap.zzc());
                if ((k == 442) || (k == 441) || (k >>> 8 != 1)) {
                  break;
                }
                paramzzaap.zzG(4);
                if (paramzzaap.zza() < 2)
                {
                  paramzzaap.zzF(j);
                  break;
                }
                k = paramzzaap.zzo();
                paramzzaap.zzF(Math.min(paramzzaap.zzd(), paramzzaap.zzc() + k));
              }
            }
          }
        }
        k = paramzzaap.zzc();
        j = i;
        l1 = l2;
      }
    }
    if (l1 != -9223372036854775807L) {
      paramzzaap = zzzy.zzf(l1, l3 + k);
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


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaja.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */