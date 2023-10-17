package com.google.android.gms.internal.ads;

import java.io.IOException;

final class zzacn
  implements zzzz
{
  private final zzabb zza;
  private final int zzb;
  private final zzaaw zzc;
  
  private final long zzc(zzaap paramzzaap)
    throws IOException
  {
    long l1;
    while (paramzzaap.zze() < paramzzaap.zzd() - 6L)
    {
      zzabb localzzabb = this.zza;
      int i = this.zzb;
      zzaaw localzzaaw = this.zzc;
      l1 = paramzzaap.zze();
      byte[] arrayOfByte = new byte[2];
      zzaae localzzaae = (zzaae)paramzzaap;
      localzzaae.zzm(arrayOfByte, 0, 2, false);
      if (((arrayOfByte[0] & 0xFF) << 8 | arrayOfByte[1] & 0xFF) != i)
      {
        paramzzaap.zzj();
        localzzaae.zzl((int)(l1 - paramzzaap.zzf()), false);
      }
      else
      {
        zzfd localzzfd = new zzfd(16);
        System.arraycopy(arrayOfByte, 0, localzzfd.zzH(), 0, 2);
        localzzfd.zzE(zzaas.zza(paramzzaap, localzzfd.zzH(), 2, 14));
        paramzzaap.zzj();
        localzzaae.zzl((int)(l1 - paramzzaap.zzf()), false);
        if (zzaax.zzc(localzzfd, localzzabb, i, localzzaaw)) {
          break;
        }
      }
      localzzaae.zzl(1, false);
    }
    if (paramzzaap.zze() >= paramzzaap.zzd() - 6L)
    {
      l1 = paramzzaap.zzd();
      long l2 = paramzzaap.zze();
      ((zzaae)paramzzaap).zzl((int)(l1 - l2), false);
      return this.zza.zzj;
    }
    return this.zzc.zza;
  }
  
  public final zzzy zza(zzaap paramzzaap, long paramLong)
    throws IOException
  {
    long l4 = paramzzaap.zzf();
    long l1 = zzc(paramzzaap);
    long l5 = paramzzaap.zze();
    int i = Math.max(6, this.zza.zzc);
    ((zzaae)paramzzaap).zzl(i, false);
    long l2 = zzc(paramzzaap);
    long l3 = paramzzaap.zze();
    if ((l1 <= paramLong) && (l2 > paramLong)) {
      return zzzy.zze(l5);
    }
    if (l2 <= paramLong) {
      return zzzy.zzf(l2, l3);
    }
    return zzzy.zzd(l1, l4);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzacn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */