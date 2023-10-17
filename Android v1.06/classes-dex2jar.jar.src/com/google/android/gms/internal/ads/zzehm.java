package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzf;

public final class zzehm
  implements zzebv
{
  private final zzbci zza;
  private final zzfwc zzb;
  private final zzfed zzc;
  private final zzehv zzd;
  
  public zzehm(zzfed paramzzfed, zzfwc paramzzfwc, zzbci paramzzbci, zzehv paramzzehv)
  {
    this.zzc = paramzzfed;
    this.zzb = paramzzfwc;
    this.zza = paramzzbci;
    this.zzd = paramzzehv;
  }
  
  public final zzfwb zza(zzezr paramzzezr, zzezf paramzzezf)
  {
    zzcal localzzcal = new zzcal();
    Object localObject = new zzehr();
    ((zzehr)localObject).zzd(new zzehl(this, localzzcal, paramzzezr, paramzzezf, (zzehr)localObject));
    paramzzezr = paramzzezf.zzt;
    localObject = new zzbcd((zzf)localObject, paramzzezr.zzb, paramzzezr.zza);
    paramzzezr = this.zzc;
    paramzzezf = zzfdx.zzs;
    return zzfdn.zzd(new zzehk(this, (zzbcd)localObject), this.zzb, paramzzezf, paramzzezr).zzb(zzfdx.zzt).zzd(localzzcal).zza();
  }
  
  public final boolean zzb(zzezr paramzzezr, zzezf paramzzezf)
  {
    if (this.zza != null)
    {
      paramzzezr = paramzzezf.zzt;
      if ((paramzzezr != null) && (paramzzezr.zza != null)) {
        return true;
      }
    }
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzehm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */