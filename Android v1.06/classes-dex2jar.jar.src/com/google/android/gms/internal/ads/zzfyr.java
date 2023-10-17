package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

final class zzfyr
  extends zzgdg
{
  final zzfys zza;
  
  zzfyr(zzfys paramzzfys, Class paramClass)
  {
    super(paramClass);
  }
  
  public final Map zzc()
    throws GeneralSecurityException
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("AES128_CTR_HMAC_SHA256", zzfys.zzg(16, 16, 32, 16, 5, 1));
    localHashMap.put("AES128_CTR_HMAC_SHA256_RAW", zzfys.zzg(16, 16, 32, 16, 5, 3));
    localHashMap.put("AES256_CTR_HMAC_SHA256", zzfys.zzg(32, 16, 32, 32, 5, 1));
    localHashMap.put("AES256_CTR_HMAC_SHA256_RAW", zzfys.zzg(32, 16, 32, 32, 5, 3));
    return Collections.unmodifiableMap(localHashMap);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfyr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */