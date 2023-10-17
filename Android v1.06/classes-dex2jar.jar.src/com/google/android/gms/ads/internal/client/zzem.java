package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzem
{
  private final String zza;
  private final Bundle zzb;
  private final String zzc;
  
  public zzem(String paramString1, Bundle paramBundle, String paramString2)
  {
    this.zza = paramString1;
    this.zzb = paramBundle;
    this.zzc = paramString2;
  }
  
  public final Bundle zza()
  {
    return this.zzb;
  }
  
  public final String zzb()
  {
    return this.zza;
  }
  
  public final String zzc()
  {
    if (TextUtils.isEmpty(this.zzc)) {
      return "";
    }
    try
    {
      Object localObject = new org/json/JSONObject;
      ((JSONObject)localObject).<init>(this.zzc);
      localObject = ((JSONObject)localObject).optString("request_id", "");
      return (String)localObject;
    }
    catch (JSONException localJSONException) {}
    return "";
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */