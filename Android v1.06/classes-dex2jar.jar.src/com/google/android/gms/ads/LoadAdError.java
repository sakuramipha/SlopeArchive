package com.google.android.gms.ads;

import org.json.JSONException;
import org.json.JSONObject;

public final class LoadAdError
  extends AdError
{
  private final ResponseInfo zza;
  
  public LoadAdError(int paramInt, String paramString1, String paramString2, AdError paramAdError, ResponseInfo paramResponseInfo)
  {
    super(paramInt, paramString1, paramString2, paramAdError);
    this.zza = paramResponseInfo;
  }
  
  public ResponseInfo getResponseInfo()
  {
    return this.zza;
  }
  
  public String toString()
  {
    String str2;
    try
    {
      String str1 = zzb().toString(2);
    }
    catch (JSONException localJSONException)
    {
      str2 = "Error forming toString output.";
    }
    return str2;
  }
  
  public final JSONObject zzb()
    throws JSONException
  {
    JSONObject localJSONObject = super.zzb();
    ResponseInfo localResponseInfo = getResponseInfo();
    if (localResponseInfo == null) {
      localJSONObject.put("Response Info", "null");
    } else {
      localJSONObject.put("Response Info", localResponseInfo.zzd());
    }
    return localJSONObject;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\LoadAdError.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */