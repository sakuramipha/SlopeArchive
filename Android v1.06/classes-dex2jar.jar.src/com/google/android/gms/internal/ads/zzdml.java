package com.google.android.gms.internal.ads;

import javax.annotation.ParametersAreNonnullByDefault;

public final class zzdml
  implements zzbix
{
  private final zzcwp zza;
  private final zzbvi zzb;
  private final String zzc;
  private final String zzd;
  
  public zzdml(zzcwp paramzzcwp, zzezf paramzzezf)
  {
    this.zza = paramzzcwp;
    this.zzb = paramzzezf.zzm;
    this.zzc = paramzzezf.zzk;
    this.zzd = paramzzezf.zzl;
  }
  
  @ParametersAreNonnullByDefault
  public final void zza(zzbvi paramzzbvi)
  {
    Object localObject = this.zzb;
    if (localObject != null) {
      paramzzbvi = (zzbvi)localObject;
    }
    int i;
    if (paramzzbvi != null)
    {
      localObject = paramzzbvi.zza;
      i = paramzzbvi.zzb;
      paramzzbvi = (zzbvi)localObject;
    }
    else
    {
      i = 1;
      paramzzbvi = "";
    }
    paramzzbvi = new zzbut(paramzzbvi, i);
    this.zza.zzd(paramzzbvi, this.zzc, this.zzd);
  }
  
  public final void zzb()
  {
    this.zza.zze();
  }
  
  public final void zzc()
  {
    this.zza.zzf();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdml.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */