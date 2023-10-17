package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

@Deprecated
public final class zzdqh
  extends zzdqj
{
  private final zzfev zzf;
  
  public zzdqh(Executor paramExecutor, zzbzy paramzzbzy, zzfev paramzzfev, zzfex paramzzfex)
  {
    super(paramExecutor, paramzzbzy, paramzzfex);
    this.zzf = paramzzfev;
    paramzzfev.zza(this.zzb);
  }
  
  public final Map zza()
  {
    return new HashMap(this.zzb);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdqh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */