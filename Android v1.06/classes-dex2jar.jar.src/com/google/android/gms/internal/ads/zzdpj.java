package com.google.android.gms.internal.ads;

import java.util.Map;

public final class zzdpj
  implements zzfee
{
  private final Map zza;
  private final zzawx zzb;
  
  zzdpj(zzawx paramzzawx, Map paramMap)
  {
    this.zza = paramMap;
    this.zzb = paramzzawx;
  }
  
  public final void zzbB(zzfdx paramzzfdx, String paramString) {}
  
  public final void zzbC(zzfdx paramzzfdx, String paramString, Throwable paramThrowable)
  {
    if (this.zza.containsKey(paramzzfdx)) {
      this.zzb.zzc(((zzdpi)this.zza.get(paramzzfdx)).zzc);
    }
  }
  
  public final void zzc(zzfdx paramzzfdx, String paramString)
  {
    if (this.zza.containsKey(paramzzfdx)) {
      this.zzb.zzc(((zzdpi)this.zza.get(paramzzfdx)).zza);
    }
  }
  
  public final void zzd(zzfdx paramzzfdx, String paramString)
  {
    if (this.zza.containsKey(paramzzfdx)) {
      this.zzb.zzc(((zzdpi)this.zza.get(paramzzfdx)).zzb);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdpj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */