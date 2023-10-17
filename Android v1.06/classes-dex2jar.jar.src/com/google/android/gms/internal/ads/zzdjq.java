package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public final class zzdjq
{
  private final zzfwc zza;
  private final zzdkd zzb;
  private final zzdki zzc;
  
  public zzdjq(zzfwc paramzzfwc, zzdkd paramzzdkd, zzdki paramzzdki)
  {
    this.zza = paramzzfwc;
    this.zzb = paramzzdkd;
    this.zzc = paramzzdki;
  }
  
  public final zzfwb zza(zzezr paramzzezr, zzezf paramzzezf, JSONObject paramJSONObject)
  {
    zzfwb localzzfwb2 = this.zza.zzb(new zzdjo(this, paramzzezr, paramzzezf, paramJSONObject));
    zzfwb localzzfwb4 = this.zzb.zzf(paramJSONObject, "images");
    zzfwb localzzfwb3 = this.zzb.zzg(paramJSONObject, "images", paramzzezf, paramzzezr.zzb.zzb);
    zzfwb localzzfwb5 = this.zzb.zze(paramJSONObject, "secondary_image");
    zzfwb localzzfwb6 = this.zzb.zze(paramJSONObject, "app_icon");
    zzfwb localzzfwb1 = this.zzb.zzd(paramJSONObject, "attribution");
    zzfwb localzzfwb7 = this.zzb.zzh(paramJSONObject, paramzzezf, paramzzezr.zzb.zzb);
    paramzzezf = this.zzc.zza(paramJSONObject, "custom_assets");
    paramzzezr = this.zzb;
    if (!paramJSONObject.optBoolean("enable_omid")) {
      paramzzezr = zzfvr.zzh(null);
    }
    for (;;)
    {
      break;
      localObject = paramJSONObject.optJSONObject("omid_settings");
      if (localObject == null)
      {
        paramzzezr = zzfvr.zzh(null);
      }
      else
      {
        localObject = ((JSONObject)localObject).optString("omid_html");
        if (TextUtils.isEmpty((CharSequence)localObject)) {
          paramzzezr = zzfvr.zzh(null);
        } else {
          paramzzezr = zzfvr.zzm(zzfvr.zzh(null), new zzdjs(paramzzezr, (String)localObject), zzcag.zze);
        }
      }
    }
    Object localObject = new ArrayList();
    ((List)localObject).add(localzzfwb2);
    ((List)localObject).add(localzzfwb4);
    ((List)localObject).add(localzzfwb3);
    ((List)localObject).add(localzzfwb5);
    ((List)localObject).add(localzzfwb6);
    ((List)localObject).add(localzzfwb1);
    ((List)localObject).add(localzzfwb7);
    ((List)localObject).add(paramzzezf);
    zzbbc localzzbbc = zzbbk.zzeQ;
    if (!((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) {
      ((List)localObject).add(paramzzezr);
    }
    return zzfvr.zza((Iterable)localObject).zza(new zzdjp(this, localzzfwb2, localzzfwb4, localzzfwb6, localzzfwb5, localzzfwb1, paramJSONObject, localzzfwb7, localzzfwb3, paramzzezr, paramzzezf), this.zza);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdjq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */