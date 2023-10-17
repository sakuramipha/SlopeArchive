package com.google.android.gms.internal.ads;

import java.io.IOException;

final class zzaka
  implements zzajz
{
  private final zzaar zza;
  private final zzabr zzb;
  private final zzakc zzc;
  private final zzam zzd;
  private final int zze;
  private long zzf;
  private int zzg;
  private long zzh;
  
  public zzaka(zzaar paramzzaar, zzabr paramzzabr, zzakc paramzzakc, String paramString, int paramInt)
    throws zzce
  {
    this.zza = paramzzaar;
    this.zzb = paramzzabr;
    this.zzc = paramzzakc;
    int k = paramzzakc.zzb;
    int j = paramzzakc.zze;
    int i = paramzzakc.zzd;
    j = k * j / 8;
    if (i == j)
    {
      k = paramzzakc.zzc * j;
      i = k * 8;
      j = Math.max(j, k / 10);
      this.zze = j;
      paramzzaar = new zzak();
      paramzzaar.zzS(paramString);
      paramzzaar.zzv(i);
      paramzzaar.zzO(i);
      paramzzaar.zzL(j);
      paramzzaar.zzw(paramzzakc.zzb);
      paramzzaar.zzT(paramzzakc.zzc);
      paramzzaar.zzN(paramInt);
      this.zzd = paramzzaar.zzY();
      return;
    }
    paramzzaar = new StringBuilder();
    paramzzaar.append("Expected block size: ");
    paramzzaar.append(j);
    paramzzaar.append("; got: ");
    paramzzaar.append(i);
    throw zzce.zza(paramzzaar.toString(), null);
  }
  
  public final void zza(int paramInt, long paramLong)
  {
    long l = paramInt;
    this.zza.zzN(new zzakf(this.zzc, 1, l, paramLong));
    this.zzb.zzk(this.zzd);
  }
  
  public final void zzb(long paramLong)
  {
    this.zzf = paramLong;
    this.zzg = 0;
    this.zzh = 0L;
  }
  
  public final boolean zzc(zzaap paramzzaap, long paramLong)
    throws IOException
  {
    int i;
    for (;;)
    {
      boolean bool = paramLong < 0L;
      if (!bool) {
        break;
      }
      j = this.zzg;
      k = this.zze;
      if (j >= k) {
        break;
      }
      i = (int)Math.min(k - j, paramLong);
      i = zzabp.zza(this.zzb, paramzzaap, i, true);
      if (i == -1)
      {
        paramLong = 0L;
      }
      else
      {
        this.zzg += i;
        paramLong -= i;
      }
    }
    paramzzaap = this.zzc;
    int k = paramzzaap.zzd;
    int j = this.zzg / k;
    if (j > 0)
    {
      paramLong = this.zzf;
      long l = zzfn.zzp(this.zzh, 1000000L, paramzzaap.zzc);
      k = j * k;
      int m = this.zzg - k;
      this.zzb.zzs(paramLong + l, 1, k, m, null);
      this.zzh += j;
      this.zzg = m;
    }
    return i <= 0;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaka.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */