package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.CheckForNull;
import org.json.JSONArray;
import org.json.JSONObject;

public final class zzdoc
{
  private final Map zza = new ConcurrentHashMap();
  private JSONObject zzb;
  private final Executor zzc;
  private boolean zzd;
  private JSONObject zze;
  
  public zzdoc(Executor paramExecutor)
  {
    this.zzc = paramExecutor;
  }
  
  private final void zzg()
  {
    try
    {
      this.zzd = true;
      Object localObject1 = zzt.zzo().zzh().zzh();
      if (localObject1 == null) {
        return;
      }
      Object localObject3 = ((zzbyw)localObject1).zzf();
      if (localObject3 == null) {
        return;
      }
      localObject1 = zzbbk.zzdJ;
      if (((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue()) {
        localObject1 = ((JSONObject)localObject3).optJSONObject("common_settings");
      } else {
        localObject1 = null;
      }
      this.zzb = ((JSONObject)localObject1);
      this.zze = ((JSONObject)localObject3).optJSONObject("ad_unit_patterns");
      JSONArray localJSONArray = ((JSONObject)localObject3).optJSONArray("ad_unit_id_settings");
      if (localJSONArray != null)
      {
        for (int i = 0; i < localJSONArray.length(); i++)
        {
          localObject1 = localJSONArray.optJSONObject(i);
          if (localObject1 != null)
          {
            localObject3 = ((JSONObject)localObject1).optString("ad_unit_id");
            String str = ((JSONObject)localObject1).optString("format");
            JSONObject localJSONObject = ((JSONObject)localObject1).optJSONObject("request_signals");
            if ((localObject3 != null) && (localJSONObject != null) && (str != null))
            {
              if (this.zza.containsKey(str))
              {
                localObject1 = (Map)this.zza.get(str);
              }
              else
              {
                localObject1 = new java/util/concurrent/ConcurrentHashMap;
                ((ConcurrentHashMap)localObject1).<init>();
                this.zza.put(str, localObject1);
              }
              ((Map)localObject1).put(localObject3, localJSONObject);
            }
          }
        }
        return;
      }
      return;
    }
    finally {}
  }
  
  @CheckForNull
  public final JSONObject zza()
  {
    zzbbc localzzbbc = zzbbk.zzdJ;
    if (!((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) {
      return null;
    }
    return this.zzb;
  }
  
  @CheckForNull
  public final JSONObject zzb(String paramString1, String paramString2)
  {
    Object localObject = zzbbk.zzdI;
    if (!((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue()) {
      return null;
    }
    if ((paramString1 != null) && (paramString2 != null))
    {
      if (!this.zzd) {
        zzg();
      }
      localObject = (Map)this.zza.get(paramString2);
      if (localObject == null) {
        return null;
      }
      JSONObject localJSONObject = (JSONObject)((Map)localObject).get(paramString1);
      if (localJSONObject != null) {
        return localJSONObject;
      }
      paramString1 = zzdoe.zza(this.zze, paramString1, paramString2);
      if (paramString1 == null) {
        return null;
      }
      return (JSONObject)((Map)localObject).get(paramString1);
    }
    return null;
  }
  
  public final void zzc()
  {
    zzt.zzo().zzh().zzq(new zzdnz(this));
    this.zzc.execute(new zzdoa(this));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdoc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */