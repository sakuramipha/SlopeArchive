package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.Map;

public final class zzbit
  implements zzbii
{
  private final zzdtt zza;
  
  public zzbit(zzdtt paramzzdtt)
  {
    this.zza = paramzzdtt;
  }
  
  public final void zza(Object paramObject, Map paramMap)
  {
    paramObject = zzbbk.zziN;
    if (!((Boolean)zzba.zzc().zzb((zzbbc)paramObject)).booleanValue()) {
      return;
    }
    paramObject = (String)paramMap.get("action");
    String str1 = (String)paramMap.get("adUnitId");
    String str2 = (String)paramMap.get("redirectUrl");
    if ((!TextUtils.isEmpty((CharSequence)paramObject)) && (!TextUtils.isEmpty(str1)) && (!TextUtils.isEmpty(str2)))
    {
      paramMap = (String)paramMap.get("format");
      if ((((String)paramObject).equals("load")) && (!TextUtils.isEmpty(paramMap)))
      {
        this.zza.zzh(str1, paramMap, str2);
        return;
      }
      if (((String)paramObject).equals("show")) {
        this.zza.zzi(str1, str2);
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbit.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */