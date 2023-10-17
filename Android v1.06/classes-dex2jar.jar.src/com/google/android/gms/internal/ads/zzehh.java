package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.zzf;
import java.util.List;

public final class zzehh
  implements zzebv
{
  private final Context zza;
  private final zzcqa zzb;
  private final zzbci zzc;
  private final zzfwc zzd;
  private final zzfed zze;
  
  public zzehh(Context paramContext, zzcqa paramzzcqa, zzfed paramzzfed, zzfwc paramzzfwc, zzbci paramzzbci)
  {
    this.zza = paramContext;
    this.zzb = paramzzcqa;
    this.zze = paramzzfed;
    this.zzd = paramzzfwc;
    this.zzc = paramzzbci;
  }
  
  public final zzfwb zza(zzezr paramzzezr, zzezf paramzzezf)
  {
    Object localObject = new zzehf(this, new View(this.zza), null, zzehd.zza, (zzezg)paramzzezf.zzv.get(0));
    paramzzezr = this.zzb.zza(new zzcru(paramzzezr, paramzzezf, null), (zzcpk)localObject);
    localObject = paramzzezr.zzk();
    paramzzezf = paramzzezf.zzt;
    paramzzezf = new zzbcd((zzf)localObject, paramzzezf.zzb, paramzzezf.zza);
    zzfed localzzfed = this.zze;
    localObject = zzfdx.zzs;
    return zzfdn.zzd(new zzehe(this, paramzzezf), this.zzd, localObject, localzzfed).zzb(zzfdx.zzt).zzd(zzfvr.zzh(paramzzezr.zza())).zza();
  }
  
  public final boolean zzb(zzezr paramzzezr, zzezf paramzzezf)
  {
    if (this.zzc != null)
    {
      paramzzezr = paramzzezf.zzt;
      if ((paramzzezr != null) && (paramzzezr.zza != null)) {
        return true;
      }
    }
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzehh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */