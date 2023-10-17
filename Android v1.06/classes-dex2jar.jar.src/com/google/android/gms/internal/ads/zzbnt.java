package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzbnt
{
  public final List zza;
  public final List zzb;
  public final List zzc;
  public final List zzd;
  public final List zze;
  public final List zzf;
  public final String zzg;
  public final String zzh;
  
  public zzbnt(JSONObject paramJSONObject)
    throws JSONException
  {
    if (zze.zzm(2)) {
      zze.zza("Mediation Response JSON: ".concat(String.valueOf(paramJSONObject.toString(2))));
    }
    Object localObject1 = paramJSONObject.getJSONArray("ad_networks");
    ArrayList localArrayList = new ArrayList(((JSONArray)localObject1).length());
    int i = 0;
    for (k = -1; i < ((JSONArray)localObject1).length(); k = j) {
      try
      {
        Object localObject2 = new com/google/android/gms/internal/ads/zzbns;
        ((zzbns)localObject2).<init>(((JSONArray)localObject1).getJSONObject(i));
        "banner".equalsIgnoreCase(((zzbns)localObject2).zzv);
        localArrayList.add(localObject2);
        j = k;
        if (k < 0)
        {
          localObject2 = ((zzbns)localObject2).zzc.iterator();
          do
          {
            j = k;
            if (!((Iterator)localObject2).hasNext()) {
              break;
            }
          } while (!((String)((Iterator)localObject2).next()).equals("com.google.ads.mediation.admob.AdMobAdapter"));
          j = i;
        }
        i++;
      }
      catch (JSONException localJSONException)
      {
        for (;;)
        {
          int j = k;
        }
      }
    }
    ((JSONArray)localObject1).length();
    this.zza = Collections.unmodifiableList(localArrayList);
    this.zzg = paramJSONObject.optString("qdata");
    paramJSONObject.optInt("fs_model_type", -1);
    paramJSONObject.optLong("timeout_ms", -1L);
    localObject1 = paramJSONObject.optJSONObject("settings");
    if (localObject1 != null)
    {
      ((JSONObject)localObject1).optLong("ad_network_timeout_millis", -1L);
      zzt.zzg();
      this.zzb = zzbnu.zza((JSONObject)localObject1, "click_urls");
      zzt.zzg();
      this.zzc = zzbnu.zza((JSONObject)localObject1, "imp_urls");
      zzt.zzg();
      this.zzd = zzbnu.zza((JSONObject)localObject1, "downloaded_imp_urls");
      zzt.zzg();
      this.zze = zzbnu.zza((JSONObject)localObject1, "nofill_urls");
      zzt.zzg();
      this.zzf = zzbnu.zza((JSONObject)localObject1, "remote_ping_urls");
      ((JSONObject)localObject1).optBoolean("render_in_browser", false);
      ((JSONObject)localObject1).optLong("refresh", -1L);
      paramJSONObject = zzbvi.zza(((JSONObject)localObject1).optJSONArray("rewards"));
      if (paramJSONObject == null) {
        this.zzh = null;
      } else {
        this.zzh = paramJSONObject.zza;
      }
      ((JSONObject)localObject1).optBoolean("use_displayed_impression", false);
      ((JSONObject)localObject1).optBoolean("allow_pub_rendered_attribution", false);
      ((JSONObject)localObject1).optBoolean("allow_pub_owned_ad_view", false);
      ((JSONObject)localObject1).optBoolean("allow_custom_click_gesture", false);
      return;
    }
    this.zzb = null;
    this.zzc = null;
    this.zzd = null;
    this.zze = null;
    this.zzf = null;
    this.zzh = null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbnt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */