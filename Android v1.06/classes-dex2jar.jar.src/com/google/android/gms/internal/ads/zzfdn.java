package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.Callable;

public final class zzfdn
{
  public static final zzfdu zza(Callable paramCallable, Object paramObject, zzfdv paramzzfdv)
  {
    return zzb(paramCallable, zzfdv.zze(paramzzfdv), paramObject, paramzzfdv);
  }
  
  public static final zzfdu zzb(Callable paramCallable, zzfwc paramzzfwc, Object paramObject, zzfdv paramzzfdv)
  {
    return new zzfdu(paramzzfdv, paramObject, null, zzfdv.zzd(), Collections.emptyList(), paramzzfwc.zzb(paramCallable), null);
  }
  
  public static final zzfdu zzc(zzfwb paramzzfwb, Object paramObject, zzfdv paramzzfdv)
  {
    return new zzfdu(paramzzfdv, paramObject, null, zzfdv.zzd(), Collections.emptyList(), paramzzfwb, null);
  }
  
  public static final zzfdu zzd(zzfdh paramzzfdh, zzfwc paramzzfwc, Object paramObject, zzfdv paramzzfdv)
  {
    return zzb(new zzfdm(paramzzfdh), paramzzfwc, paramObject, paramzzfdv);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfdn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */