package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class zzlr
{
  private static final zzlr zza = new zzlr();
  private final zzlv zzb = new zzlb();
  private final ConcurrentMap zzc = new ConcurrentHashMap();
  
  public static zzlr zza()
  {
    return zza;
  }
  
  public final zzlu zzb(Class paramClass)
  {
    zzkk.zzf(paramClass, "messageType");
    zzlu localzzlu2 = (zzlu)this.zzc.get(paramClass);
    zzlu localzzlu1 = localzzlu2;
    if (localzzlu2 == null)
    {
      localzzlu1 = this.zzb.zza(paramClass);
      zzkk.zzf(paramClass, "messageType");
      zzkk.zzf(localzzlu1, "schema");
      paramClass = (zzlu)this.zzc.putIfAbsent(paramClass, localzzlu1);
      if (paramClass != null) {
        return paramClass;
      }
    }
    return localzzlu1;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzlr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */