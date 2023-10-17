package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

public final class zzaig
  implements zzaih
{
  private final List zza;
  private final zzabr[] zzb;
  private boolean zzc;
  private int zzd;
  private int zze;
  private long zzf;
  
  public zzaig(List paramList)
  {
    this.zza = paramList;
    this.zzb = new zzabr[paramList.size()];
    this.zzf = -9223372036854775807L;
  }
  
  private final boolean zzf(zzfd paramzzfd, int paramInt)
  {
    if (paramzzfd.zza() == 0) {
      return false;
    }
    if (paramzzfd.zzk() != paramInt) {
      this.zzc = false;
    }
    this.zzd -= 1;
    return this.zzc;
  }
  
  public final void zza(zzfd paramzzfd)
  {
    if (this.zzc)
    {
      if ((this.zzd == 2) && (!zzf(paramzzfd, 32))) {
        return;
      }
      int j = this.zzd;
      int i = 0;
      if ((j == 1) && (!zzf(paramzzfd, 0))) {
        return;
      }
      j = paramzzfd.zzc();
      int m = paramzzfd.zza();
      zzabr[] arrayOfzzabr = this.zzb;
      int k = arrayOfzzabr.length;
      while (i < k)
      {
        zzabr localzzabr = arrayOfzzabr[i];
        paramzzfd.zzF(j);
        localzzabr.zzq(paramzzfd, m);
        i++;
      }
      this.zze += m;
    }
  }
  
  public final void zzb(zzaar paramzzaar, zzajt paramzzajt)
  {
    for (int i = 0; i < this.zzb.length; i++)
    {
      zzajq localzzajq = (zzajq)this.zza.get(i);
      paramzzajt.zzc();
      zzabr localzzabr = paramzzaar.zzv(paramzzajt.zza(), 3);
      zzak localzzak = new zzak();
      localzzak.zzH(paramzzajt.zzb());
      localzzak.zzS("application/dvbsubs");
      localzzak.zzI(Collections.singletonList(localzzajq.zzb));
      localzzak.zzK(localzzajq.zza);
      localzzabr.zzk(localzzak.zzY());
      this.zzb[i] = localzzabr;
    }
  }
  
  public final void zzc()
  {
    if (this.zzc)
    {
      if (this.zzf != -9223372036854775807L)
      {
        zzabr[] arrayOfzzabr = this.zzb;
        int j = arrayOfzzabr.length;
        for (int i = 0; i < j; i++) {
          arrayOfzzabr[i].zzs(this.zzf, 1, this.zze, 0, null);
        }
      }
      this.zzc = false;
    }
  }
  
  public final void zzd(long paramLong, int paramInt)
  {
    if ((paramInt & 0x4) == 0) {
      return;
    }
    this.zzc = true;
    if (paramLong != -9223372036854775807L) {
      this.zzf = paramLong;
    }
    this.zze = 0;
    this.zzd = 2;
  }
  
  public final void zze()
  {
    this.zzc = false;
    this.zzf = -9223372036854775807L;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */