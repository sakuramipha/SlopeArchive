package com.google.android.gms.internal.ads;

import java.util.Map;

public final class zzbhc
  implements zzbii
{
  private final zzbhd zza;
  
  public zzbhc(zzbhd paramzzbhd)
  {
    this.zza = paramzzbhd;
  }
  
  public final void zza(Object paramObject, Map paramMap)
  {
    paramObject = (String)paramMap.get("name");
    if (paramObject == null)
    {
      zzbzt.zzj("App event with no name parameter.");
      return;
    }
    this.zza.zzbz((String)paramObject, (String)paramMap.get("info"));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbhc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */