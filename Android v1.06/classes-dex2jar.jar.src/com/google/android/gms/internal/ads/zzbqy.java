package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

public class zzbqy
{
  private final zzcfb zza;
  private final String zzb;
  
  public zzbqy(zzcfb paramzzcfb, String paramString)
  {
    this.zza = paramzzcfb;
    this.zzb = paramString;
  }
  
  public final void zzf(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      localJSONObject = localJSONObject.put("x", paramInt1).put("y", paramInt2).put("width", paramInt3).put("height", paramInt4);
      this.zza.zze("onDefaultPositionReceived", localJSONObject);
      return;
    }
    catch (JSONException localJSONException)
    {
      zzbzt.zzh("Error occurred while dispatching default position.", localJSONException);
    }
  }
  
  public final void zzg(String paramString)
  {
    try
    {
      Object localObject = new org/json/JSONObject;
      ((JSONObject)localObject).<init>();
      paramString = ((JSONObject)localObject).put("message", paramString).put("action", this.zzb);
      localObject = this.zza;
      if (localObject != null) {
        ((zzcfb)localObject).zze("onError", paramString);
      }
      return;
    }
    catch (JSONException paramString)
    {
      zzbzt.zzh("Error occurred while dispatching error event.", paramString);
    }
  }
  
  public final void zzh(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      paramString = localJSONObject.put("js", paramString);
      this.zza.zze("onReadyEventReceived", paramString);
      return;
    }
    catch (JSONException paramString)
    {
      zzbzt.zzh("Error occurred while dispatching ready Event.", paramString);
    }
  }
  
  public final void zzi(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat, int paramInt5)
  {
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      localJSONObject = localJSONObject.put("width", paramInt1).put("height", paramInt2).put("maxSizeWidth", paramInt3).put("maxSizeHeight", paramInt4).put("density", paramFloat).put("rotation", paramInt5);
      this.zza.zze("onScreenInfoChanged", localJSONObject);
      return;
    }
    catch (JSONException localJSONException)
    {
      zzbzt.zzh("Error occurred while obtaining screen information.", localJSONException);
    }
  }
  
  public final void zzj(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      localJSONObject = localJSONObject.put("x", paramInt1).put("y", paramInt2).put("width", paramInt3).put("height", paramInt4);
      this.zza.zze("onSizeChanged", localJSONObject);
      return;
    }
    catch (JSONException localJSONException)
    {
      zzbzt.zzh("Error occurred while dispatching size change.", localJSONException);
    }
  }
  
  public final void zzk(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      paramString = localJSONObject.put("state", paramString);
      this.zza.zze("onStateChanged", paramString);
      return;
    }
    catch (JSONException paramString)
    {
      zzbzt.zzh("Error occurred while dispatching state change.", paramString);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbqy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */