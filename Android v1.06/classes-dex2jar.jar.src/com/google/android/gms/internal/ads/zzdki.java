package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

public final class zzdki
{
  private final Executor zza;
  private final zzdkd zzb;
  
  public zzdki(Executor paramExecutor, zzdkd paramzzdkd)
  {
    this.zza = paramExecutor;
    this.zzb = paramzzdkd;
  }
  
  public final zzfwb zza(JSONObject paramJSONObject, String paramString)
  {
    paramString = paramJSONObject.optJSONArray("custom_assets");
    if (paramString == null) {
      return zzfvr.zzh(Collections.emptyList());
    }
    ArrayList localArrayList = new ArrayList();
    int j = paramString.length();
    for (int i = 0; i < j; i++)
    {
      JSONObject localJSONObject = paramString.optJSONObject(i);
      if (localJSONObject == null)
      {
        paramJSONObject = zzfvr.zzh(null);
      }
      else
      {
        paramJSONObject = localJSONObject.optString("name");
        if (paramJSONObject == null)
        {
          paramJSONObject = zzfvr.zzh(null);
        }
        else
        {
          String str = localJSONObject.optString("type");
          if ("string".equals(str)) {
            paramJSONObject = zzfvr.zzh(new zzdkh(paramJSONObject, localJSONObject.optString("string_value")));
          } else if ("image".equals(str)) {
            paramJSONObject = zzfvr.zzl(this.zzb.zze(localJSONObject, "image_value"), new zzdkf(paramJSONObject), this.zza);
          } else {
            paramJSONObject = zzfvr.zzh(null);
          }
        }
      }
      localArrayList.add(paramJSONObject);
    }
    return zzfvr.zzl(zzfvr.zzd(localArrayList), zzdkg.zza, this.zza);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdki.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */