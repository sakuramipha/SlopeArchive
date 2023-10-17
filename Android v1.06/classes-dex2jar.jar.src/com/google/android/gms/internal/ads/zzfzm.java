package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

final class zzfzm
  extends zzgdg
{
  final zzfzn zza;
  
  zzfzm(zzfzn paramzzfzn, Class paramClass)
  {
    super(paramClass);
  }
  
  public final Map zzc()
    throws GeneralSecurityException
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("AES128_EAX", zzfzn.zzg(16, 16, 1));
    localHashMap.put("AES128_EAX_RAW", zzfzn.zzg(16, 16, 3));
    localHashMap.put("AES256_EAX", zzfzn.zzg(32, 16, 1));
    localHashMap.put("AES256_EAX_RAW", zzfzn.zzg(32, 16, 3));
    return Collections.unmodifiableMap(localHashMap);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfzm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */