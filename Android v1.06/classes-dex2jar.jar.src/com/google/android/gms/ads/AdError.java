package com.google.android.gms.ads;

import com.google.android.gms.ads.internal.client.zze;
import org.json.JSONException;
import org.json.JSONObject;

public class AdError
{
  public static final String UNDEFINED_DOMAIN = "undefined";
  private final int zza;
  private final String zzb;
  private final String zzc;
  private final AdError zzd;
  
  public AdError(int paramInt, String paramString1, String paramString2)
  {
    this(paramInt, paramString1, paramString2, null);
  }
  
  public AdError(int paramInt, String paramString1, String paramString2, AdError paramAdError)
  {
    this.zza = paramInt;
    this.zzb = paramString1;
    this.zzc = paramString2;
    this.zzd = paramAdError;
  }
  
  public AdError getCause()
  {
    return this.zzd;
  }
  
  public int getCode()
  {
    return this.zza;
  }
  
  public String getDomain()
  {
    return this.zzc;
  }
  
  public String getMessage()
  {
    return this.zzb;
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
  
  public final zze zza()
  {
    Object localObject;
    if (this.zzd == null)
    {
      localObject = null;
    }
    else
    {
      localObject = this.zzd;
      localObject = new zze(((AdError)localObject).zza, ((AdError)localObject).zzb, ((AdError)localObject).zzc, null, null);
    }
    return new zze(this.zza, this.zzb, this.zzc, (zze)localObject, null);
  }
  
  public JSONObject zzb()
    throws JSONException
  {
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("Code", this.zza);
    localJSONObject.put("Message", this.zzb);
    localJSONObject.put("Domain", this.zzc);
    AdError localAdError = this.zzd;
    if (localAdError == null) {
      localJSONObject.put("Cause", "null");
    } else {
      localJSONObject.put("Cause", localAdError.zzb());
    }
    return localJSONObject;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\AdError.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */