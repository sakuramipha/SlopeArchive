package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class zzegd
  implements zzebx
{
  private final Map zza = new HashMap();
  private final zzdnx zzb;
  
  public zzegd(zzdnx paramzzdnx)
  {
    this.zzb = paramzzdnx;
  }
  
  public final zzeby zza(String paramString, JSONObject paramJSONObject)
    throws zzfaf
  {
    try
    {
      Object localObject2 = (zzeby)this.zza.get(paramString);
      Object localObject1 = localObject2;
      if (localObject2 == null)
      {
        localObject2 = this.zzb.zzc(paramString, paramJSONObject);
        localObject1 = new com/google/android/gms/internal/ads/zzeby;
        paramJSONObject = new com/google/android/gms/internal/ads/zzeds;
        paramJSONObject.<init>();
        ((zzeby)localObject1).<init>(localObject2, paramJSONObject, paramString);
        this.zza.put(paramString, localObject1);
      }
      return (zzeby)localObject1;
    }
    finally {}
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzegd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */