package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

public final class zzcmr
  implements zzcml
{
  private final zzdsz zza;
  
  zzcmr(zzdsz paramzzdsz)
  {
    this.zza = paramzzdsz;
  }
  
  public final void zza(Map paramMap)
  {
    paramMap = (String)paramMap.get("gesture");
    if (TextUtils.isEmpty(paramMap)) {
      return;
    }
    int i = paramMap.hashCode();
    if (i != 97520651)
    {
      if ((i == 109399814) && (paramMap.equals("shake")))
      {
        i = 0;
        break label70;
      }
    }
    else if (paramMap.equals("flick"))
    {
      i = 1;
      break label70;
    }
    i = -1;
    label70:
    if (i != 0)
    {
      if (i != 1)
      {
        this.zza.zzk(zzdsv.zza);
        return;
      }
      this.zza.zzk(zzdsv.zzc);
      return;
    }
    this.zza.zzk(zzdsv.zzb);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcmr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */