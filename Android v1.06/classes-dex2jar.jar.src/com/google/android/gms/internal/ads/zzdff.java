package com.google.android.gms.internal.ads;

import java.util.Map;

final class zzdff
  implements zzcri
{
  private final Map zza;
  private final Map zzb;
  private final Map zzc;
  private final zzgwb zzd;
  private final zzdhn zze;
  
  zzdff(Map paramMap1, Map paramMap2, Map paramMap3, zzgwb paramzzgwb, zzdhn paramzzdhn)
  {
    this.zza = paramMap1;
    this.zzb = paramMap2;
    this.zzc = paramMap3;
    this.zzd = paramzzgwb;
    this.zze = paramzzdhn;
  }
  
  public final zzebv zza(int paramInt, String paramString)
  {
    zzebv localzzebv = (zzebv)this.zza.get(paramString);
    if (localzzebv != null) {
      return localzzebv;
    }
    localzzebv = null;
    if (paramInt != 1)
    {
      if (paramInt != 4) {
        return null;
      }
      zzeej localzzeej = (zzeej)this.zzc.get(paramString);
      if (localzzeej != null)
      {
        paramString = new zzebw(localzzeej, zzcrk.zza);
      }
      else
      {
        paramString = (zzebv)this.zzb.get(paramString);
        if (paramString != null) {
          break label92;
        }
        paramString = localzzebv;
      }
      return paramString;
      label92:
      return zzcrm.zza(paramString);
    }
    if (this.zze.zze() != null)
    {
      paramString = ((zzcri)this.zzd.zzb()).zza(paramInt, paramString);
      if (paramString != null) {
        return zzcrm.zza(paramString);
      }
    }
    return null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdff.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */