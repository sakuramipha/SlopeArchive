package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzg;
import java.util.Map;

public final class zzcmn
  implements zzcml
{
  private final zzg zza;
  
  public zzcmn(zzg paramzzg)
  {
    this.zza = paramzzg;
  }
  
  public final void zza(Map paramMap)
  {
    this.zza.zzx(Boolean.parseBoolean((String)paramMap.get("content_url_opted_out")));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcmn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */