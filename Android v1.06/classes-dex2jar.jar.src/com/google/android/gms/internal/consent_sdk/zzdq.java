package com.google.android.gms.internal.consent_sdk;

import java.util.Objects;

public final class zzdq
{
  public static Object zza(Object paramObject)
  {
    Objects.requireNonNull(paramObject, "Cannot return null from a non-@Nullable @Provides method");
    return paramObject;
  }
  
  public static void zzb(Object paramObject, Class paramClass)
  {
    if (paramObject != null) {
      return;
    }
    throw new IllegalStateException(String.valueOf(paramClass.getCanonicalName()).concat(" must be set"));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\consent_sdk\zzdq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */