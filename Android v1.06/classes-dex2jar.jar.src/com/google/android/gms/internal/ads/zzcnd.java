package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

public final class zzcnd
  implements zzcml
{
  private final zzdsz zza;
  
  zzcnd(zzdsz paramzzdsz)
  {
    this.zza = paramzzdsz;
  }
  
  public final void zza(Map paramMap)
  {
    paramMap = (String)paramMap.get("test_mode_enabled");
    if (TextUtils.isEmpty(paramMap)) {
      return;
    }
    this.zza.zzm(paramMap.equals("true"));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcnd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */