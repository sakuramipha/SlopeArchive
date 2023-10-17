package com.google.android.gms.internal.ads;

import java.util.List;

final class zzajw
{
  private final List zza;
  private final zzabr[] zzb;
  
  public zzajw(List paramList)
  {
    this.zza = paramList;
    this.zzb = new zzabr[paramList.size()];
  }
  
  public final void zza(long paramLong, zzfd paramzzfd)
  {
    if (paramzzfd.zza() < 9) {
      return;
    }
    int k = paramzzfd.zze();
    int j = paramzzfd.zze();
    int i = paramzzfd.zzk();
    if ((k == 434) && (j == 1195456820) && (i == 3)) {
      zzaab.zzb(paramLong, paramzzfd, this.zzb);
    }
  }
  
  public final void zzb(zzaar paramzzaar, zzajt paramzzajt)
  {
    for (int i = 0; i < this.zzb.length; i++)
    {
      paramzzajt.zzc();
      zzabr localzzabr = paramzzaar.zzv(paramzzajt.zza(), 3);
      zzam localzzam = (zzam)this.zza.get(i);
      String str = localzzam.zzm;
      boolean bool3 = "application/cea-608".equals(str);
      boolean bool2 = true;
      boolean bool1 = bool2;
      if (!bool3) {
        if ("application/cea-708".equals(str)) {
          bool1 = bool2;
        } else {
          bool1 = false;
        }
      }
      zzdy.zze(bool1, "Invalid closed caption mime type provided: ".concat(String.valueOf(str)));
      zzak localzzak = new zzak();
      localzzak.zzH(paramzzajt.zzb());
      localzzak.zzS(str);
      localzzak.zzU(localzzam.zze);
      localzzak.zzK(localzzam.zzd);
      localzzak.zzu(localzzam.zzE);
      localzzak.zzI(localzzam.zzo);
      localzzabr.zzk(localzzak.zzY());
      this.zzb[i] = localzzabr;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzajw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */