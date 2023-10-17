package com.google.android.gms.internal.ads;

import java.util.List;

public final class zzaji
{
  private final List zza;
  private final zzabr[] zzb;
  
  public zzaji(List paramList)
  {
    this.zza = paramList;
    this.zzb = new zzabr[paramList.size()];
  }
  
  public final void zza(long paramLong, zzfd paramzzfd)
  {
    zzaab.zza(paramLong, paramzzfd, this.zzb);
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
      Object localObject2 = localzzam.zzb;
      Object localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = paramzzajt.zzb();
      }
      localObject2 = new zzak();
      ((zzak)localObject2).zzH((String)localObject1);
      ((zzak)localObject2).zzS(str);
      ((zzak)localObject2).zzU(localzzam.zze);
      ((zzak)localObject2).zzK(localzzam.zzd);
      ((zzak)localObject2).zzu(localzzam.zzE);
      ((zzak)localObject2).zzI(localzzam.zzo);
      localzzabr.zzk(((zzak)localObject2).zzY());
      this.zzb[i] = localzzabr;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaji.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */