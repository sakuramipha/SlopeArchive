package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzbyw
{
  private final List zza = new ArrayList();
  private final List zzb = new ArrayList();
  private final Map zzc = new HashMap();
  private String zzd;
  private String zze;
  private long zzf;
  private JSONObject zzg;
  private boolean zzh = false;
  private final List zzi = new ArrayList();
  private boolean zzj = false;
  
  public zzbyw(String paramString, long paramLong)
  {
    this.zze = paramString;
    this.zzf = paramLong;
    if (!TextUtils.isEmpty(paramString)) {}
    try
    {
      Object localObject1 = new org/json/JSONObject;
      ((JSONObject)localObject1).<init>(paramString);
      this.zzg = ((JSONObject)localObject1);
      if (((JSONObject)localObject1).optInt("status", -1) != 1)
      {
        this.zzh = false;
        zzbzt.zzj("App settings could not be fetched successfully.");
        return;
      }
      this.zzh = true;
      this.zzd = this.zzg.optString("app_id");
      localObject1 = this.zzg.optJSONArray("ad_unit_id_settings");
      int i;
      if (localObject1 != null) {
        for (i = 0; i < ((JSONArray)localObject1).length(); i++)
        {
          JSONObject localJSONObject = ((JSONArray)localObject1).getJSONObject(i);
          Object localObject2 = localJSONObject.optString("format");
          paramString = localJSONObject.optString("ad_unit_id");
          if ((!TextUtils.isEmpty((CharSequence)localObject2)) && (!TextUtils.isEmpty(paramString))) {
            if ("interstitial".equalsIgnoreCase((String)localObject2))
            {
              this.zzb.add(paramString);
            }
            else if (("rewarded".equalsIgnoreCase((String)localObject2)) || ("rewarded_interstitial".equals(localObject2)))
            {
              localJSONObject = localJSONObject.optJSONObject("mediation_config");
              if (localJSONObject != null)
              {
                localObject2 = new com/google/android/gms/internal/ads/zzbnt;
                ((zzbnt)localObject2).<init>(localJSONObject);
                this.zzc.put(paramString, localObject2);
              }
            }
          }
        }
      }
      paramString = this.zzg.optJSONArray("persistable_banner_ad_unit_ids");
      if (paramString != null) {
        for (i = 0; i < paramString.length(); i++)
        {
          localObject1 = paramString.optString(i);
          this.zza.add(localObject1);
        }
      }
      paramString = zzbbk.zzgF;
      boolean bool = ((Boolean)zzba.zzc().zzb(paramString)).booleanValue();
      if (bool)
      {
        paramString = this.zzg.optJSONObject("common_settings");
        if (paramString != null)
        {
          paramString = paramString.optJSONArray("loeid");
          if (paramString != null) {
            for (i = 0; i < paramString.length(); i++) {
              this.zzi.add(paramString.get(i).toString());
            }
          }
        }
      }
      paramString = zzbbk.zzga;
      if (((Boolean)zzba.zzc().zzb(paramString)).booleanValue())
      {
        paramString = this.zzg.optJSONObject("common_settings");
        if (paramString != null) {
          this.zzj = paramString.optBoolean("is_prefetching_enabled", false);
        }
      }
      return;
    }
    catch (JSONException paramString)
    {
      zzbzt.zzk("Exception occurred while processing app setting json", paramString);
      zzt.zzo().zzu(paramString, "AppSettings.parseAppSettingsJson");
    }
  }
  
  public final long zza()
  {
    return this.zzf;
  }
  
  public final String zzb()
  {
    return this.zzd;
  }
  
  public final String zzc()
  {
    return this.zze;
  }
  
  public final List zzd()
  {
    return this.zzi;
  }
  
  public final Map zze()
  {
    return this.zzc;
  }
  
  public final JSONObject zzf()
  {
    return this.zzg;
  }
  
  public final void zzg(long paramLong)
  {
    this.zzf = paramLong;
  }
  
  public final boolean zzh()
  {
    return this.zzj;
  }
  
  public final boolean zzi()
  {
    return this.zzh;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbyw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */