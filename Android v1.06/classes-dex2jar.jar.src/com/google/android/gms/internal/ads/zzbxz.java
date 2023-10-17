package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class zzbxz
{
  static zzbxz zza;
  
  public static zzbxz zzd(Context paramContext)
  {
    try
    {
      Object localObject1 = zza;
      if (localObject1 != null) {
        return (zzbxz)localObject1;
      }
      Object localObject2 = paramContext.getApplicationContext();
      zzbbk.zza((Context)localObject2);
      localObject1 = zzt.zzo().zzh();
      ((zzg)localObject1).zzr((Context)localObject2);
      paramContext = new com/google/android/gms/internal/ads/zzbxd;
      paramContext.<init>(null);
      paramContext.zzb((Context)localObject2);
      paramContext.zzc(zzt.zzB());
      paramContext.zza((zzg)localObject1);
      paramContext.zzd(zzt.zzn());
      paramContext = paramContext.zze();
      zza = paramContext;
      paramContext.zza().zza();
      zza.zzb().zzc();
      paramContext = zza.zzc();
      localObject1 = zzbbk.zzar;
      if (((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue())
      {
        localObject1 = new java/util/HashMap;
        ((HashMap)localObject1).<init>();
        try
        {
          localObject2 = new org/json/JSONObject;
          Object localObject3 = zzbbk.zzat;
          ((JSONObject)localObject2).<init>((String)zzba.zzc().zzb((zzbbc)localObject3));
          Iterator localIterator = ((JSONObject)localObject2).keys();
          while (localIterator.hasNext())
          {
            localObject3 = (String)localIterator.next();
            HashSet localHashSet = new java/util/HashSet;
            localHashSet.<init>();
            JSONArray localJSONArray = ((JSONObject)localObject2).optJSONArray((String)localObject3);
            if (localJSONArray != null)
            {
              for (int i = 0; i < localJSONArray.length(); i++)
              {
                String str = localJSONArray.optString(i);
                if (str != null) {
                  localHashSet.add(str);
                }
              }
              ((Map)localObject1).put(localObject3, localHashSet);
            }
          }
          localObject2 = ((Map)localObject1).keySet().iterator();
          while (((Iterator)localObject2).hasNext()) {
            paramContext.zzc((String)((Iterator)localObject2).next());
          }
          localObject2 = new com/google/android/gms/internal/ads/zzbyb;
          ((zzbyb)localObject2).<init>(paramContext, (Map)localObject1);
          paramContext.zzd((zzbyb)localObject2);
        }
        catch (JSONException paramContext)
        {
          zzbzt.zzf("Failed to parse listening list", paramContext);
        }
      }
      paramContext = zza;
      return paramContext;
    }
    finally {}
  }
  
  abstract zzbww zza();
  
  abstract zzbxa zzb();
  
  abstract zzbyd zzc();
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbxz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */