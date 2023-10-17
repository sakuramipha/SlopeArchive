package com.google.android.gms.internal.nearby;

import java.io.Serializable;
import java.util.Objects;

public abstract class zzhy<T>
  implements Serializable
{
  public static <T> zzhy<T> zzc()
  {
    return zzhx.zza;
  }
  
  public static <T> zzhy<T> zzd(T paramT)
  {
    Objects.requireNonNull(paramT);
    return new zzia(paramT);
  }
  
  public abstract boolean zza();
  
  public abstract T zzb();
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzhy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */