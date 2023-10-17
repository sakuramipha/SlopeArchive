package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.ExecutionException;

public final class zzdwy
{
  private final zzfwc zza;
  private final zzfwc zzb;
  private final zzdxq zzc;
  
  zzdwy(zzfwc paramzzfwc1, zzfwc paramzzfwc2, zzdxq paramzzdxq)
  {
    this.zza = paramzzfwc1;
    this.zzb = paramzzfwc2;
    this.zzc = paramzzdxq;
  }
  
  public final zzfwb zzb(zzbtk paramzzbtk)
  {
    String str = paramzzbtk.zzb;
    zzt.zzp();
    if (zzs.zzy(str)) {
      paramzzbtk = zzfvr.zzg(new zzdwc(1, "Ads signal service force local"));
    } else {
      paramzzbtk = zzfvr.zzf(zzfvr.zzk(new zzdwu(this, paramzzbtk), this.zza), ExecutionException.class, zzdwv.zza, this.zzb);
    }
    return zzfvr.zzm(zzfvr.zzf(zzfvi.zzv(paramzzbtk), zzdwc.class, zzdww.zza, this.zzb), zzdwx.zza, this.zzb);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdwy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */