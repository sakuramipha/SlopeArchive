package com.google.android.gms.internal.ads;

import org.json.JSONObject;

public final class zzbsb
{
  public final boolean zza;
  public final String zzb;
  
  public zzbsb(boolean paramBoolean, String paramString)
  {
    this.zza = paramBoolean;
    this.zzb = paramString;
  }
  
  public static zzbsb zza(JSONObject paramJSONObject)
  {
    return new zzbsb(paramJSONObject.optBoolean("enable_prewarming", false), paramJSONObject.optString("prefetch_url", ""));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbsb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */