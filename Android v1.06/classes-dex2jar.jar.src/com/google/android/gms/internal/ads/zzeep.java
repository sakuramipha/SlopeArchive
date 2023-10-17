package com.google.android.gms.internal.ads;

import org.json.JSONObject;

public final class zzeep
  implements zzeej
{
  private final zzdfm zza;
  private final zzfwc zzb;
  private final zzdjq zzc;
  private final zzfaw zzd;
  private final zzdmf zze;
  
  public zzeep(zzdfm paramzzdfm, zzfwc paramzzfwc, zzdjq paramzzdjq, zzfaw paramzzfaw, zzdmf paramzzdmf)
  {
    this.zza = paramzzdfm;
    this.zzb = paramzzfwc;
    this.zzc = paramzzdjq;
    this.zzd = paramzzfaw;
    this.zze = paramzzdmf;
  }
  
  private final zzfwb zzg(zzezr paramzzezr, zzezf paramzzezf, JSONObject paramJSONObject)
  {
    zzfwb localzzfwb2 = this.zzd.zza();
    zzfwb localzzfwb1 = this.zzc.zza(paramzzezr, paramzzezf, paramJSONObject);
    return zzfvr.zzc(new zzfwb[] { localzzfwb2, localzzfwb1 }).zza(new zzeek(this, localzzfwb1, localzzfwb2, paramzzezr, paramzzezf, paramJSONObject), this.zzb);
  }
  
  public final zzfwb zza(zzezr paramzzezr, zzezf paramzzezf)
  {
    return zzfvr.zzm(zzfvr.zzm(this.zzd.zza(), new zzeem(this, paramzzezf), this.zzb), new zzeen(this, paramzzezr, paramzzezf), this.zzb);
  }
  
  public final boolean zzb(zzezr paramzzezr, zzezf paramzzezf)
  {
    paramzzezr = paramzzezf.zzt;
    return (paramzzezr != null) && (paramzzezr.zzc != null);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzeep.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */