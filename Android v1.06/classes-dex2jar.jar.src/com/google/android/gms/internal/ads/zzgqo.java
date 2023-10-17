package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class zzgqo
{
  private static final zzgqo zza = new zzgqo();
  private final zzgra zzb = new zzgpy();
  private final ConcurrentMap zzc = new ConcurrentHashMap();
  
  public static zzgqo zza()
  {
    return zza;
  }
  
  public final zzgqz zzb(Class paramClass)
  {
    zzgpg.zzc(paramClass, "messageType");
    zzgqz localzzgqz2 = (zzgqz)this.zzc.get(paramClass);
    zzgqz localzzgqz1 = localzzgqz2;
    if (localzzgqz2 == null)
    {
      localzzgqz1 = this.zzb.zza(paramClass);
      zzgpg.zzc(paramClass, "messageType");
      zzgpg.zzc(localzzgqz1, "schema");
      paramClass = (zzgqz)this.zzc.putIfAbsent(paramClass, localzzgqz1);
      if (paramClass != null) {
        return paramClass;
      }
    }
    return localzzgqz1;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgqo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */