package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzg;
import java.util.Map;

public final class zzcmp
  implements zzcml
{
  private final zzg zza;
  
  public zzcmp(zzg paramzzg)
  {
    this.zza = paramzzg;
  }
  
  public final void zza(Map paramMap)
  {
    this.zza.zzz(Boolean.parseBoolean((String)paramMap.get("content_vertical_opted_out")));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcmp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */