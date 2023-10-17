package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

final class zzgfz
  extends zzgdg
{
  final zzgga zza;
  
  zzgfz(zzgga paramzzgga, Class paramClass)
  {
    super(paramClass);
  }
  
  public final Map zzc()
    throws GeneralSecurityException
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("HMAC_SHA256_128BITTAG", zzgga.zzn(32, 16, 5, 1));
    localHashMap.put("HMAC_SHA256_128BITTAG_RAW", zzgga.zzn(32, 16, 5, 3));
    localHashMap.put("HMAC_SHA256_256BITTAG", zzgga.zzn(32, 32, 5, 1));
    localHashMap.put("HMAC_SHA256_256BITTAG_RAW", zzgga.zzn(32, 32, 5, 3));
    localHashMap.put("HMAC_SHA512_128BITTAG", zzgga.zzn(64, 16, 6, 1));
    localHashMap.put("HMAC_SHA512_128BITTAG_RAW", zzgga.zzn(64, 16, 6, 3));
    localHashMap.put("HMAC_SHA512_256BITTAG", zzgga.zzn(64, 32, 6, 1));
    localHashMap.put("HMAC_SHA512_256BITTAG_RAW", zzgga.zzn(64, 32, 6, 3));
    localHashMap.put("HMAC_SHA512_512BITTAG", zzgga.zzn(64, 64, 6, 1));
    localHashMap.put("HMAC_SHA512_512BITTAG_RAW", zzgga.zzn(64, 64, 6, 3));
    return Collections.unmodifiableMap(localHashMap);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgfz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */