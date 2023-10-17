package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;

public final class zzcqi
  implements zzgvo
{
  private final zzgwb zza;
  
  public zzcqi(zzgwb paramzzgwb)
  {
    this.zza = paramzzgwb;
  }
  
  public final Boolean zza()
  {
    Object localObject = ((zzcuz)this.zza).zza().zza();
    boolean bool2 = true;
    boolean bool1 = bool2;
    if (localObject == null)
    {
      localObject = zzbbk.zzfl;
      if (((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue()) {
        bool1 = bool2;
      } else {
        bool1 = false;
      }
    }
    return Boolean.valueOf(bool1);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcqi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */