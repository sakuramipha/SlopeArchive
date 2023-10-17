package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Map;
import org.json.JSONObject;

public final class zzdzb
{
  private final zzbur zza;
  
  zzdzb(zzbur paramzzbur)
  {
    this.zza = paramzzbur;
  }
  
  public static void zza(Map paramMap, JSONObject paramJSONObject)
  {
    if (paramJSONObject == null) {
      return;
    }
    paramJSONObject = paramJSONObject.optJSONObject("pii");
    if (paramJSONObject != null)
    {
      if (!TextUtils.isEmpty(paramJSONObject.optString("doritos", ""))) {
        paramMap.put("x-afma-drt-cookie", paramJSONObject.optString("doritos", ""));
      }
      if (!TextUtils.isEmpty(paramJSONObject.optString("doritos_v2", ""))) {
        paramMap.put("x-afma-drt-v2-cookie", paramJSONObject.optString("doritos_v2", ""));
      }
      return;
    }
    zze.zza("DSID signal does not exist.");
  }
  
  public final void zzb()
  {
    zzcaj.zza(this.zza.zza(), "persistFlags");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdzb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */