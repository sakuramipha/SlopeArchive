package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

final class zzgfd
  extends zzgdg
{
  zzgfd(zzgfe paramzzgfe, Class paramClass)
  {
    super(paramClass);
  }
  
  public final Map zzc()
    throws GeneralSecurityException
  {
    HashMap localHashMap = new HashMap();
    Object localObject2 = zzghl.zzc();
    ((zzghk)localObject2).zza(32);
    Object localObject1 = zzgho.zzc();
    ((zzghn)localObject1).zza(16);
    ((zzghk)localObject2).zzb((zzgho)((zzgos)localObject1).zzal());
    localHashMap.put("AES_CMAC", new zzgdf((zzghl)((zzgos)localObject2).zzal(), 1));
    localObject2 = zzghl.zzc();
    ((zzghk)localObject2).zza(32);
    localObject1 = zzgho.zzc();
    ((zzghn)localObject1).zza(16);
    ((zzghk)localObject2).zzb((zzgho)((zzgos)localObject1).zzal());
    localHashMap.put("AES256_CMAC", new zzgdf((zzghl)((zzgos)localObject2).zzal(), 1));
    localObject1 = zzghl.zzc();
    ((zzghk)localObject1).zza(32);
    localObject2 = zzgho.zzc();
    ((zzghn)localObject2).zza(16);
    ((zzghk)localObject1).zzb((zzgho)((zzgos)localObject2).zzal());
    localHashMap.put("AES256_CMAC_RAW", new zzgdf((zzghl)((zzgos)localObject1).zzal(), 3));
    return Collections.unmodifiableMap(localHashMap);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgfd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */