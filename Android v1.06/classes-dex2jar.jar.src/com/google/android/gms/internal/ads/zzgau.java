package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

final class zzgau
  extends zzgdg
{
  final zzgav zza;
  
  zzgau(zzgav paramzzgav, Class paramClass)
  {
    super(paramClass);
  }
  
  public final Map zzc()
    throws GeneralSecurityException
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("AES128_GCM_SIV", zzgav.zzh(16, 1));
    localHashMap.put("AES128_GCM_SIV_RAW", zzgav.zzh(16, 3));
    localHashMap.put("AES256_GCM_SIV", zzgav.zzh(32, 1));
    localHashMap.put("AES256_GCM_SIV_RAW", zzgav.zzh(32, 3));
    return Collections.unmodifiableMap(localHashMap);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgau.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */