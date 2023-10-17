package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class zzaic
  implements zzaao
{
  public static final zzaav zza = zzaib.zza;
  private final zzaid zzb = new zzaid(true, null);
  private final zzfd zzc = new zzfd(2048);
  private final zzfd zzd;
  private final zzfc zze;
  private zzaar zzf;
  private long zzg;
  private long zzh = -1L;
  private boolean zzi;
  private boolean zzj;
  
  public zzaic()
  {
    this(0);
  }
  
  public zzaic(int paramInt)
  {
    Object localObject = new zzfd(10);
    this.zzd = ((zzfd)localObject);
    localObject = ((zzfd)localObject).zzH();
    this.zze = new zzfc((byte[])localObject, localObject.length);
  }
  
  public final int zza(zzaap paramzzaap, zzabk paramzzabk)
    throws IOException
  {
    zzdy.zzb(this.zzf);
    int i = paramzzaap.zza(this.zzc.zzH(), 0, 2048);
    if (!this.zzj)
    {
      this.zzf.zzN(new zzabm(-9223372036854775807L, 0L));
      this.zzj = true;
    }
    if (i == -1) {
      return -1;
    }
    this.zzc.zzF(0);
    this.zzc.zzE(i);
    if (!this.zzi)
    {
      this.zzb.zzd(this.zzg, 4);
      this.zzi = true;
    }
    this.zzb.zza(this.zzc);
    return 0;
  }
  
  public final void zzb(zzaar paramzzaar)
  {
    this.zzf = paramzzaar;
    this.zzb.zzb(paramzzaar, new zzajt(Integer.MIN_VALUE, 0, 1));
    paramzzaar.zzC();
  }
  
  public final void zzc(long paramLong1, long paramLong2)
  {
    this.zzi = false;
    this.zzb.zze();
    this.zzg = paramLong2;
  }
  
  public final boolean zzd(zzaap paramzzaap)
    throws IOException
  {
    int i = 0;
    for (;;)
    {
      byte[] arrayOfByte = this.zzd.zzH();
      zzaae localzzaae = (zzaae)paramzzaap;
      localzzaae.zzm(arrayOfByte, 0, 10, false);
      this.zzd.zzF(0);
      if (this.zzd.zzm() != 4801587)
      {
        paramzzaap.zzj();
        localzzaae.zzl(i, false);
        if (this.zzh == -1L) {
          this.zzh = i;
        }
        int k = i;
        int n = 0;
        j = 0;
        int m;
        label270:
        do
        {
          localzzaae.zzm(this.zzd.zzH(), 0, 2, false);
          this.zzd.zzF(0);
          if (!zzaid.zzf(this.zzd.zzo()))
          {
            j = k + 1;
            paramzzaap.zzj();
            localzzaae.zzl(j, false);
          }
          for (;;)
          {
            k = 0;
            n = 0;
            m = j;
            j = n;
            break label270;
            n++;
            if ((n >= 4) && (j > 188)) {
              return true;
            }
            localzzaae.zzm(this.zzd.zzH(), 0, 4, false);
            this.zze.zzj(14);
            m = this.zze.zzd(13);
            if (m > 6) {
              break;
            }
            j = k + 1;
            paramzzaap.zzj();
            localzzaae.zzl(j, false);
          }
          localzzaae.zzl(m - 6, false);
          j += m;
          m = k;
          k = n;
          n = k;
          k = m;
        } while (m - i < 8192);
        return false;
      }
      this.zzd.zzG(3);
      int j = this.zzd.zzj();
      i += j + 10;
      localzzaae.zzl(j, false);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaic.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */