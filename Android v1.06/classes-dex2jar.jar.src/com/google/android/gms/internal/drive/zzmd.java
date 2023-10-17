package com.google.android.gms.internal.drive;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class zzmd
{
  private static final zzmd zzuw = new zzmd();
  private final zzmg zzux = new zzlf();
  private final ConcurrentMap<Class<?>, zzmf<?>> zzuy = new ConcurrentHashMap();
  
  public static zzmd zzej()
  {
    return zzuw;
  }
  
  public final <T> zzmf<T> zzf(Class<T> paramClass)
  {
    zzkm.zza(paramClass, "messageType");
    zzmf localzzmf = (zzmf)this.zzuy.get(paramClass);
    Object localObject = localzzmf;
    if (localzzmf == null)
    {
      localObject = this.zzux.zze(paramClass);
      zzkm.zza(paramClass, "messageType");
      zzkm.zza(localObject, "schema");
      paramClass = (zzmf)this.zzuy.putIfAbsent(paramClass, localObject);
      if (paramClass != null) {
        localObject = paramClass;
      }
    }
    return (zzmf<T>)localObject;
  }
  
  public final <T> zzmf<T> zzq(T paramT)
  {
    return zzf(paramT.getClass());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzmd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */