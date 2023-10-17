package com.google.android.gms.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.internal.ads.zzbzm;
import com.google.android.gms.internal.ads.zzbzt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class ResponseInfo
{
  private final zzdn zza;
  private final List zzb;
  private AdapterResponseInfo zzc;
  
  private ResponseInfo(zzdn paramzzdn)
  {
    this.zza = paramzzdn;
    this.zzb = new ArrayList();
    if (paramzzdn != null) {
      try
      {
        paramzzdn = paramzzdn.zzj();
        if (paramzzdn != null)
        {
          paramzzdn = paramzzdn.iterator();
          while (paramzzdn.hasNext())
          {
            AdapterResponseInfo localAdapterResponseInfo = AdapterResponseInfo.zza((zzu)paramzzdn.next());
            if (localAdapterResponseInfo != null) {
              this.zzb.add(localAdapterResponseInfo);
            }
          }
        }
        paramzzdn = this.zza;
      }
      catch (RemoteException paramzzdn)
      {
        zzbzt.zzh("Could not forward getAdapterResponseInfo to ResponseInfo.", paramzzdn);
      }
    }
    if (paramzzdn != null) {}
    try
    {
      paramzzdn = paramzzdn.zzf();
      if (paramzzdn != null) {
        this.zzc = AdapterResponseInfo.zza(paramzzdn);
      }
      return;
    }
    catch (RemoteException paramzzdn)
    {
      zzbzt.zzh("Could not forward getLoadedAdapterResponse to ResponseInfo.", paramzzdn);
    }
  }
  
  public static ResponseInfo zza(zzdn paramzzdn)
  {
    if (paramzzdn != null) {
      return new ResponseInfo(paramzzdn);
    }
    return null;
  }
  
  public static ResponseInfo zzb(zzdn paramzzdn)
  {
    return new ResponseInfo(paramzzdn);
  }
  
  public List<AdapterResponseInfo> getAdapterResponses()
  {
    return this.zzb;
  }
  
  public AdapterResponseInfo getLoadedAdapterResponseInfo()
  {
    return this.zzc;
  }
  
  public String getMediationAdapterClassName()
  {
    try
    {
      Object localObject = this.zza;
      if (localObject != null)
      {
        localObject = ((zzdn)localObject).zzg();
        return (String)localObject;
      }
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzh("Could not forward getMediationAdapterClassName to ResponseInfo.", localRemoteException);
    }
    return null;
  }
  
  public Bundle getResponseExtras()
  {
    try
    {
      Object localObject = this.zza;
      if (localObject != null)
      {
        localObject = ((zzdn)localObject).zze();
        return (Bundle)localObject;
      }
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzh("Could not forward getResponseExtras to ResponseInfo.", localRemoteException);
    }
    return new Bundle();
  }
  
  public String getResponseId()
  {
    try
    {
      Object localObject = this.zza;
      if (localObject != null)
      {
        localObject = ((zzdn)localObject).zzi();
        return (String)localObject;
      }
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzh("Could not forward getResponseId to ResponseInfo.", localRemoteException);
    }
    return null;
  }
  
  public String toString()
  {
    String str2;
    try
    {
      String str1 = zzd().toString(2);
    }
    catch (JSONException localJSONException)
    {
      str2 = "Error forming toString output.";
    }
    return str2;
  }
  
  public final zzdn zzc()
  {
    return this.zza;
  }
  
  public final JSONObject zzd()
    throws JSONException
  {
    JSONObject localJSONObject = new JSONObject();
    Object localObject = getResponseId();
    if (localObject == null) {
      localJSONObject.put("Response ID", "null");
    } else {
      localJSONObject.put("Response ID", localObject);
    }
    localObject = getMediationAdapterClassName();
    if (localObject == null) {
      localJSONObject.put("Mediation Adapter Class Name", "null");
    } else {
      localJSONObject.put("Mediation Adapter Class Name", localObject);
    }
    JSONArray localJSONArray = new JSONArray();
    localObject = this.zzb.iterator();
    while (((Iterator)localObject).hasNext()) {
      localJSONArray.put(((AdapterResponseInfo)((Iterator)localObject).next()).zzb());
    }
    localJSONObject.put("Adapter Responses", localJSONArray);
    localObject = this.zzc;
    if (localObject != null) {
      localJSONObject.put("Loaded Adapter Response", ((AdapterResponseInfo)localObject).zzb());
    }
    localObject = getResponseExtras();
    if (localObject != null) {
      localJSONObject.put("Response Extras", zzay.zzb().zzh((Bundle)localObject));
    }
    return localJSONObject;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\ResponseInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */