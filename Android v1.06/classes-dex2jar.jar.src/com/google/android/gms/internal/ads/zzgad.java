package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

final class zzgad
  extends zzgdg
{
  final zzgae zza;
  
  zzgad(zzgae paramzzgae, Class paramClass)
  {
    super(paramClass);
  }
  
  public final Map zzc()
    throws GeneralSecurityException
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("AES128_GCM", zzgae.zzg(16, 1));
    localHashMap.put("AES128_GCM_RAW", zzgae.zzg(16, 3));
    localHashMap.put("AES256_GCM", zzgae.zzg(32, 1));
    localHashMap.put("AES256_GCM_RAW", zzgae.zzg(32, 3));
    return Collections.unmodifiableMap(localHashMap);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */