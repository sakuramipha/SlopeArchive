package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class zzdkv
{
  private final zzfaa zza;
  private final Executor zzb;
  private final zzdnk zzc;
  private final zzdmf zzd;
  private final Context zze;
  private final zzdqc zzf;
  private final zzfen zzg;
  private final zzfgj zzh;
  private final zzebc zzi;
  
  public zzdkv(zzfaa paramzzfaa, Executor paramExecutor, zzdnk paramzzdnk, Context paramContext, zzdqc paramzzdqc, zzfen paramzzfen, zzfgj paramzzfgj, zzebc paramzzebc, zzdmf paramzzdmf)
  {
    this.zza = paramzzfaa;
    this.zzb = paramExecutor;
    this.zzc = paramzzdnk;
    this.zze = paramContext;
    this.zzf = paramzzdqc;
    this.zzg = paramzzfen;
    this.zzh = paramzzfgj;
    this.zzi = paramzzebc;
    this.zzd = paramzzdmf;
  }
  
  private final void zzh(zzcfb paramzzcfb)
  {
    zzi(paramzzcfb);
    paramzzcfb.zzad("/video", zzbih.zzl);
    paramzzcfb.zzad("/videoMeta", zzbih.zzm);
    paramzzcfb.zzad("/precache", new zzcdo());
    paramzzcfb.zzad("/delayPageLoaded", zzbih.zzp);
    paramzzcfb.zzad("/instrument", zzbih.zzn);
    paramzzcfb.zzad("/log", zzbih.zzg);
    paramzzcfb.zzad("/click", new zzbhj(null));
    if (this.zza.zzb != null)
    {
      paramzzcfb.zzN().zzD(true);
      paramzzcfb.zzad("/open", new zzbis(null, null, null, null, null));
    }
    else
    {
      paramzzcfb.zzN().zzD(false);
    }
    if (zzt.zzn().zzu(paramzzcfb.getContext())) {
      paramzzcfb.zzad("/logScionEvent", new zzbin(paramzzcfb.getContext()));
    }
  }
  
  private static final void zzi(zzcfb paramzzcfb)
  {
    paramzzcfb.zzad("/videoClicked", zzbih.zzh);
    paramzzcfb.zzN().zzF(true);
    zzbbc localzzbbc = zzbbk.zzdw;
    if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) {
      paramzzcfb.zzad("/getNativeAdViewSignals", zzbih.zzs);
    }
    paramzzcfb.zzad("/getNativeClickMeta", zzbih.zzt);
  }
  
  public final zzfwb zza(JSONObject paramJSONObject)
  {
    return zzfvr.zzm(zzfvr.zzm(zzfvr.zzh(null), new zzdkl(this), this.zzb), new zzdkm(this, paramJSONObject), this.zzb);
  }
  
  public final zzfwb zzb(String paramString1, String paramString2, zzezf paramzzezf, zzezi paramzzezi, zzq paramzzq)
  {
    return zzfvr.zzm(zzfvr.zzh(null), new zzdko(this, paramzzq, paramzzezf, paramzzezi, paramString1, paramString2), this.zzb);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdkv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */