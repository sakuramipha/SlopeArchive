package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

public final class zzbiy
  implements zzbii
{
  private final zzbix zza;
  
  public zzbiy(zzbix paramzzbix)
  {
    this.zza = paramzzbix;
  }
  
  public static void zzb(zzcfb paramzzcfb, zzbix paramzzbix)
  {
    paramzzcfb.zzad("/reward", new zzbiy(paramzzbix));
  }
  
  public final void zza(Object paramObject, Map paramMap)
  {
    paramObject = (String)paramMap.get("action");
    if ("grant".equals(paramObject))
    {
      Object localObject = null;
      try
      {
        int i = Integer.parseInt((String)paramMap.get("amount"));
        paramMap = (String)paramMap.get("type");
        paramObject = localObject;
        if (!TextUtils.isEmpty(paramMap))
        {
          paramObject = new com/google/android/gms/internal/ads/zzbvi;
          ((zzbvi)paramObject).<init>(paramMap, i);
        }
      }
      catch (NumberFormatException paramObject)
      {
        zzbzt.zzk("Unable to parse reward amount.", (Throwable)paramObject);
        paramObject = localObject;
      }
      this.zza.zza((zzbvi)paramObject);
      return;
    }
    if ("video_start".equals(paramObject))
    {
      this.zza.zzc();
      return;
    }
    if ("video_complete".equals(paramObject)) {
      this.zza.zzb();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbiy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */