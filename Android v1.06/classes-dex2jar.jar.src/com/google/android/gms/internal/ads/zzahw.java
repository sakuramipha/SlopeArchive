package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class zzahw
  implements zzaao
{
  public static final zzaav zza = zzahv.zza;
  private final zzahx zzb = new zzahx(null);
  private final zzfd zzc = new zzfd(2786);
  private boolean zzd;
  
  public final int zza(zzaap paramzzaap, zzabk paramzzabk)
    throws IOException
  {
    int i = paramzzaap.zza(this.zzc.zzH(), 0, 2786);
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
        j = i;
        int k = 0;
        for (;;)
        {
          localzzaae.zzm(localzzfd.zzH(), 0, 6, false);
          localzzfd.zzF(0);
          if (localzzfd.zzo() != 2935)
          {
            paramzzaap.zzj();
            j++;
            if (j - i < 8192)
            {
              localzzaae.zzl(j, false);
              break;
            }
            return false;
          }
          k++;
          if (k >= 4) {
            return true;
          }
          int m = zzzp.zzb(localzzfd.zzH());
          if (m == -1) {
            return false;
          }
          localzzaae.zzl(m - 6, false);
        }
      }
      localzzfd.zzG(3);
      int j = localzzfd.zzj();
      i += j + 10;
      localzzaae.zzl(j, false);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzahw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */