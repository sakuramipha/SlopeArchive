package com.google.android.gms.internal.ads;

import java.util.Objects;

public final class zzgvw
{
  public static Object zza(Object paramObject, String paramString)
  {
    Objects.requireNonNull(paramObject, paramString);
    return paramObject;
  }
  
  public static Object zzb(Object paramObject)
  {
    Objects.requireNonNull(paramObject, "Cannot return null from a non-@Nullable @Provides method");
    return paramObject;
  }
  
  public static void zzc(Object paramObject, Class paramClass)
  {
    if (paramObject != null) {
      return;
    }
    throw new IllegalStateException(String.valueOf(paramClass.getCanonicalName()).concat(" must be set"));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgvw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */