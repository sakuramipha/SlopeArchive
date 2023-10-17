package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

public final class zzbuj
{
  private final List zza;
  private final String zzb;
  private final String zzc;
  private final String zzd;
  private final boolean zze;
  private final boolean zzf;
  private final String zzg;
  private final String zzh;
  private final String zzi;
  private final int zzj;
  private final JSONObject zzk;
  private final String zzl;
  private final String zzm;
  
  public zzbuj(JSONObject paramJSONObject)
  {
    this.zzi = paramJSONObject.optString("url");
    this.zzb = paramJSONObject.optString("base_uri");
    this.zzc = paramJSONObject.optString("post_parameters");
    this.zze = zzj(paramJSONObject.optString("drt_include"));
    this.zzf = zzj(paramJSONObject.optString("cookies_include", "true"));
    this.zzg = paramJSONObject.optString("request_id");
    this.zzd = paramJSONObject.optString("type");
    Object localObject = paramJSONObject.optString("errors");
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = Arrays.asList(((String)localObject).split(","));
    }
    this.zza = ((List)localObject);
    int j = paramJSONObject.optInt("valid", 0);
    int i = 1;
    if (j == 1) {
      i = -2;
    }
    this.zzj = i;
    this.zzh = paramJSONObject.optString("fetched_ad");
    paramJSONObject.optBoolean("render_test_ad_label");
    JSONObject localJSONObject = paramJSONObject.optJSONObject("preprocessor_flags");
    localObject = localJSONObject;
    if (localJSONObject == null) {
      localObject = new JSONObject();
    }
    this.zzk = ((JSONObject)localObject);
    this.zzl = paramJSONObject.optString("analytics_query_ad_event_id");
    paramJSONObject.optBoolean("is_analytics_logging_enabled");
    this.zzm = paramJSONObject.optString("pool_key");
  }
  
  private static boolean zzj(String paramString)
  {
    boolean bool = true;
    if (paramString != null)
    {
      if (paramString.equals("1")) {
        return bool;
      }
      if (paramString.equals("true")) {
        return true;
      }
    }
    bool = false;
    return bool;
  }
  
  public final int zza()
  {
    return this.zzj;
  }
  
  public final String zzb()
  {
    return this.zzb;
  }
  
  public final String zzc()
  {
    return this.zzm;
  }
  
  public final String zzd()
  {
    return this.zzc;
  }
  
  public final String zze()
  {
    return this.zzi;
  }
  
  public final List zzf()
  {
    return this.zza;
  }
  
  public final JSONObject zzg()
  {
    return this.zzk;
  }
  
  public final boolean zzh()
  {
    return this.zzf;
  }
  
  public final boolean zzi()
  {
    return this.zze;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbuj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */