package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

final class zzgca
  extends zzgdg
{
  final zzgcb zza;
  
  zzgca(zzgcb paramzzgcb, Class paramClass)
  {
    super(paramClass);
  }
  
  public final Map zzc()
    throws GeneralSecurityException
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("XCHACHA20_POLY1305", new zzgdf(zzglj.zzc(), 1));
    localHashMap.put("XCHACHA20_POLY1305_RAW", new zzgdf(zzglj.zzc(), 3));
    return Collections.unmodifiableMap(localHashMap);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */