package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.util.zzbu;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzbha
  implements zzbii
{
  private final zzbhb zza;
  
  public zzbha(zzbhb paramzzbhb)
  {
    this.zza = paramzzbhb;
  }
  
  public final void zza(Object paramObject, Map paramMap)
  {
    if (this.zza == null) {
      return;
    }
    Object localObject1 = (String)paramMap.get("name");
    paramObject = localObject1;
    if (localObject1 == null)
    {
      zzbzt.zzi("Ad metadata with no name parameter.");
      paramObject = "";
    }
    boolean bool = paramMap.containsKey("info");
    Object localObject2 = null;
    localObject1 = localObject2;
    if (bool) {
      try
      {
        localObject1 = new org/json/JSONObject;
        ((JSONObject)localObject1).<init>((String)paramMap.get("info"));
        localObject1 = zzbu.zza((JSONObject)localObject1);
      }
      catch (JSONException paramMap)
      {
        zzbzt.zzh("Failed to convert ad metadata to JSON.", paramMap);
        localObject1 = localObject2;
      }
    }
    if (localObject1 == null)
    {
      zzbzt.zzg("Failed to convert ad metadata to Bundle.");
      return;
    }
    this.zza.zza((String)paramObject, (Bundle)localObject1);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbha.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */