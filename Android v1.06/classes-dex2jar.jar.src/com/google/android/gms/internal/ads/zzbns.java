package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
public final class zzbns
{
  public final String zza;
  public final String zzb;
  public final List zzc;
  public final String zzd;
  public final String zze;
  public final List zzf;
  public final List zzg;
  public final List zzh;
  public final List zzi;
  public final List zzj;
  public final String zzk;
  public final List zzl;
  public final List zzm;
  public final List zzn;
  public final String zzo;
  public final String zzp;
  public final String zzq;
  public final String zzr;
  public final String zzs;
  public final List zzt;
  public final String zzu;
  public final String zzv;
  
  public zzbns(JSONObject paramJSONObject)
    throws JSONException
  {
    this.zzb = paramJSONObject.optString("id");
    Object localObject2 = paramJSONObject.getJSONArray("adapters");
    Object localObject1 = new ArrayList(((JSONArray)localObject2).length());
    for (int i = 0; i < ((JSONArray)localObject2).length(); i++) {
      ((List)localObject1).add(((JSONArray)localObject2).getString(i));
    }
    this.zzc = Collections.unmodifiableList((List)localObject1);
    this.zzd = paramJSONObject.optString("allocation_id", null);
    zzt.zzg();
    this.zzf = zzbnu.zza(paramJSONObject, "clickurl");
    zzt.zzg();
    this.zzg = zzbnu.zza(paramJSONObject, "imp_urls");
    zzt.zzg();
    this.zzh = zzbnu.zza(paramJSONObject, "downloaded_imp_urls");
    zzt.zzg();
    this.zzj = zzbnu.zza(paramJSONObject, "fill_urls");
    zzt.zzg();
    this.zzl = zzbnu.zza(paramJSONObject, "video_start_urls");
    zzt.zzg();
    this.zzn = zzbnu.zza(paramJSONObject, "video_complete_urls");
    zzt.zzg();
    this.zzm = zzbnu.zza(paramJSONObject, "video_reward_urls");
    this.zzo = paramJSONObject.optString("transaction_id");
    this.zzp = paramJSONObject.optString("valid_from_timestamp");
    localObject2 = paramJSONObject.optJSONObject("ad");
    if (localObject2 != null)
    {
      zzt.zzg();
      localObject1 = zzbnu.zza((JSONObject)localObject2, "manual_impression_urls");
    }
    else
    {
      localObject1 = null;
    }
    this.zzi = ((List)localObject1);
    if (localObject2 != null) {
      localObject1 = ((JSONObject)localObject2).toString();
    } else {
      localObject1 = null;
    }
    this.zza = ((String)localObject1);
    localObject2 = paramJSONObject.optJSONObject("data");
    if (localObject2 != null) {
      localObject1 = ((JSONObject)localObject2).toString();
    } else {
      localObject1 = null;
    }
    this.zzk = ((String)localObject1);
    if (localObject2 != null) {
      localObject1 = ((JSONObject)localObject2).optString("class_name");
    } else {
      localObject1 = null;
    }
    this.zze = ((String)localObject1);
    this.zzq = paramJSONObject.optString("html_template", null);
    this.zzr = paramJSONObject.optString("ad_base_url", null);
    localObject1 = paramJSONObject.optJSONObject("assets");
    if (localObject1 != null) {
      localObject1 = ((JSONObject)localObject1).toString();
    } else {
      localObject1 = null;
    }
    this.zzs = ((String)localObject1);
    zzt.zzg();
    this.zzt = zzbnu.zza(paramJSONObject, "template_ids");
    localObject1 = paramJSONObject.optJSONObject("ad_loader_options");
    if (localObject1 != null) {
      localObject1 = ((JSONObject)localObject1).toString();
    } else {
      localObject1 = null;
    }
    this.zzu = ((String)localObject1);
    this.zzv = paramJSONObject.optString("response_type", null);
    paramJSONObject.optLong("ad_network_timeout_millis", -1L);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbns.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */