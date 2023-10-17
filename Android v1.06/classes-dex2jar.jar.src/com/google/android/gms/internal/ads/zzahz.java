package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class zzahz
  implements zzaao
{
  public static final zzaav zza = zzahy.zza;
  private final zzaia zzb = new zzaia(null);
  private final zzfd zzc = new zzfd(16384);
  private boolean zzd;
  
  public final int zza(zzaap paramzzaap, zzabk paramzzabk)
    throws IOException
  {
    int i = paramzzaap.zza(this.zzc.zzH(), 0, 16384);
    if (i == -1) {
      return -1;
    }
    this.zzc.zzF(0);
    this.zzc.zzE(i);
    if (!this.zzd)
    {
      this.zzb.zzd(0L, 4);
      this.zzd = true;
    }
    this.zzb.zza(this.zzc);
    return 0;
  }
  
  public final void zzb(zzaar paramzzaar)
  {
    this.zzb.zzb(paramzzaar, new zzajt(Integer.MIN_VALUE, 0, 1));
    paramzzaar.zzC();
    paramzzaar.zzN(new zzabm(-9223372036854775807L, 0L));
  }
  
  public final void zzc(long paramLong1, long paramLong2)
  {
    this.zzd = false;
    this.zzb.zze();
  }
  
  public final boolean zzd(zzaap paramzzaap)
    throws IOException
  {
    zzfd localzzfd = new zzfd(10);
    int i = 0;
    for (;;)
    {
      byte[] arrayOfByte = localzzfd.zzH();
      zzaae localzzaae = (zzaae)paramzzaap;
      localzzaae.zzm(arrayOfByte, 0, 10, false);
      localzzfd.zzF(0);
      if (localzzfd.zzm() != 4801587)
      {
        paramzzaap.zzj();
        localzzaae.zzl(i, false);
        int k = i;
        int i1;
        for (j = 0;; j = i1)
        {
          arrayOfByte = localzzfd.zzH();
          int m = 7;
          localzzaae.zzm(arrayOfByte, 0, 7, false);
          localzzfd.zzF(0);
          int i2 = localzzfd.zzo();
          if ((i2 != 44096) && (i2 != 44097))
          {
            paramzzaap.zzj();
            k++;
            if (k - i < 8192)
            {
              localzzaae.zzl(k, false);
              break;
            }
            return false;
          }
          i1 = j + 1;
          if (i1 >= 4) {
            return true;
          }
          arrayOfByte = localzzfd.zzH();
          j = zzzs.zza;
          if (arrayOfByte.length < 7)
          {
            j = -1;
          }
          else
          {
            j = (arrayOfByte[2] & 0xFF) << 8 | arrayOfByte[3] & 0xFF;
            if (j == 65535)
            {
              n = (arrayOfByte[4] & 0xFF) << 16 | (arrayOfByte[5] & 0xFF) << 8 | arrayOfByte[6] & 0xFF;
              j = m;
              m = n;
            }
            else
            {
              n = 4;
              m = j;
              j = n;
            }
            int n = j;
            if (i2 == 44097) {
              n = j + 2;
            }
            j = m + n;
          }
          if (j == -1) {
            return false;
          }
          localzzaae.zzl(j - 7, false);
        }
      }
      localzzfd.zzG(3);
      int j = localzzfd.zzj();
      i += j + 10;
      localzzaae.zzl(j, false);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzahz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */