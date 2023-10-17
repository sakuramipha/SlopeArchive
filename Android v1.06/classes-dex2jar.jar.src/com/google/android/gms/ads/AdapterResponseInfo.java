package com.google.android.gms.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzu;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public final class AdapterResponseInfo
{
  private final zzu zza;
  private final AdError zzb;
  
  private AdapterResponseInfo(zzu paramzzu)
  {
    this.zza = paramzzu;
    paramzzu = paramzzu.zzc;
    if (paramzzu == null) {
      paramzzu = null;
    } else {
      paramzzu = paramzzu.zza();
    }
    this.zzb = paramzzu;
  }
  
  public static AdapterResponseInfo zza(zzu paramzzu)
  {
    if (paramzzu != null) {
      return new AdapterResponseInfo(paramzzu);
    }
    return null;
  }
  
  public AdError getAdError()
  {
    return this.zzb;
  }
  
  public String getAdSourceId()
  {
    return this.zza.zzf;
  }
  
  public String getAdSourceInstanceId()
  {
    return this.zza.zzh;
  }
  
  public String getAdSourceInstanceName()
  {
    return this.zza.zzg;
  }
  
  public String getAdSourceName()
  {
    return this.zza.zze;
  }
  
  public String getAdapterClassName()
  {
    return this.zza.zza;
  }
  
  public Bundle getCredentials()
  {
    return this.zza.zzd;
  }
  
  public long getLatencyMillis()
  {
    return this.zza.zzb;
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
    JSONObject localJSONObject1 = new JSONObject();
    localJSONObject1.put("Adapter", this.zza.zza);
    localJSONObject1.put("Latency", this.zza.zzb);
    Object localObject = getAdSourceName();
    if (localObject == null) {
      localJSONObject1.put("Ad Source Name", "null");
    } else {
      localJSONObject1.put("Ad Source Name", localObject);
    }
    localObject = getAdSourceId();
    if (localObject == null) {
      localJSONObject1.put("Ad Source ID", "null");
    } else {
      localJSONObject1.put("Ad Source ID", localObject);
    }
    localObject = getAdSourceInstanceName();
    if (localObject == null) {
      localJSONObject1.put("Ad Source Instance Name", "null");
    } else {
      localJSONObject1.put("Ad Source Instance Name", localObject);
    }
    localObject = getAdSourceInstanceId();
    if (localObject == null) {
      localJSONObject1.put("Ad Source Instance ID", "null");
    } else {
      localJSONObject1.put("Ad Source Instance ID", localObject);
    }
    JSONObject localJSONObject2 = new JSONObject();
    Iterator localIterator = this.zza.zzd.keySet().iterator();
    while (localIterator.hasNext())
    {
      localObject = (String)localIterator.next();
      localJSONObject2.put((String)localObject, this.zza.zzd.get((String)localObject));
    }
    localJSONObject1.put("Credentials", localJSONObject2);
    localObject = this.zzb;
    if (localObject == null) {
      localJSONObject1.put("Ad Error", "null");
    } else {
      localJSONObject1.put("Ad Error", ((AdError)localObject).zzb());
    }
    return localJSONObject1;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\AdapterResponseInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */