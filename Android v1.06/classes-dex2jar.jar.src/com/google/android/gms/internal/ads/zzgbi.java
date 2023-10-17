package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

final class zzgbi
  extends zzgdg
{
  final zzgbj zza;
  
  zzgbi(zzgbj paramzzgbj, Class paramClass)
  {
    super(paramClass);
  }
  
  public final Map zzc()
    throws GeneralSecurityException
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("CHACHA20_POLY1305", new zzgdf(zzgje.zzc(), 1));
    localHashMap.put("CHACHA20_POLY1305_RAW", new zzgdf(zzgje.zzc(), 3));
    return Collections.unmodifiableMap(localHashMap);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgbi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */