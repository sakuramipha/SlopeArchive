package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.ExecutionException;
import org.json.JSONObject;

public final class zzdwn
{
  private final zzfwc zza;
  private final zzdvt zzb;
  private final zzgvi zzc;
  private final zzfft zzd;
  private final Context zze;
  private final zzbzz zzf;
  
  public zzdwn(zzfwc paramzzfwc, zzdvt paramzzdvt, zzgvi paramzzgvi, zzfft paramzzfft, Context paramContext, zzbzz paramzzbzz)
  {
    this.zza = paramzzfwc;
    this.zzb = paramzzdvt;
    this.zzc = paramzzgvi;
    this.zzd = paramzzfft;
    this.zze = paramContext;
    this.zzf = paramzzbzz;
  }
  
  private final zzfwb zzh(zzbug paramzzbug, zzdwm paramzzdwm1, zzdwm paramzzdwm2, zzfuy paramzzfuy)
  {
    String str = paramzzbug.zzd;
    zzt.zzp();
    if (zzs.zzy(str)) {
      paramzzdwm1 = zzfvr.zzg(new zzdwc(1));
    } else {
      paramzzdwm1 = zzfvr.zzf(paramzzdwm1.zza(paramzzbug), ExecutionException.class, zzdwd.zza, this.zza);
    }
    return zzfvr.zzf(zzfvr.zzm(zzfvi.zzv(paramzzdwm1), paramzzfuy, this.zza), zzdwc.class, new zzdwl(this, paramzzdwm2, paramzzbug, paramzzfuy), this.zza);
  }
  
  public final zzfwb zza(zzbug paramzzbug)
  {
    zzdwi localzzdwi = new zzdwi(paramzzbug);
    return zzh(paramzzbug, new zzdwj(this.zzb), new zzdwk(this), localzzdwi);
  }
  
  public final zzfwb zzb(JSONObject paramJSONObject)
  {
    zzbmo localzzbmo = zzt.zzf().zza(this.zze, this.zzf, this.zzd).zza("AFMA_getAdDictionary", zzbmv.zza, zzdwh.zza);
    return zzfvr.zzm(zzfvi.zzv(zzfvr.zzh(paramJSONObject)), localzzbmo, this.zza);
  }
  
  public final zzfwb zzg(zzbug paramzzbug)
  {
    zzdwe localzzdwe = zzdwe.zza;
    return zzh(paramzzbug, new zzdwf(this), new zzdwg(this), localzzdwe);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdwn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */