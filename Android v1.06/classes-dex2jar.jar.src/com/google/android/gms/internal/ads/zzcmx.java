package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

public final class zzcmx
  implements zzcml
{
  private final zzeze zza;
  
  public zzcmx(zzeze paramzzeze)
  {
    this.zza = paramzzeze;
  }
  
  public final void zza(Map paramMap)
  {
    paramMap = (String)paramMap.get("render_in_browser");
    if (!TextUtils.isEmpty(paramMap)) {
      try
      {
        this.zza.zzb(Boolean.parseBoolean(paramMap));
        return;
      }
      catch (Exception paramMap)
      {
        throw new IllegalStateException("Invalid render_in_browser state", paramMap);
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcmx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */