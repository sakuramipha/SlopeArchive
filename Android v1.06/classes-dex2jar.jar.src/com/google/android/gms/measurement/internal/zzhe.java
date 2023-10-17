package com.google.android.gms.measurement.internal;

import android.os.Bundle;

public final class zzhe
{
  public static Object zza(Bundle paramBundle, String paramString, Class paramClass, Object paramObject)
  {
    paramBundle = paramBundle.get(paramString);
    if (paramBundle == null) {
      return paramObject;
    }
    if (paramClass.isAssignableFrom(paramBundle.getClass())) {
      return paramBundle;
    }
    throw new IllegalStateException(String.format("Invalid conditional user property field type. '%s' expected [%s] but was [%s]", new Object[] { paramString, paramClass.getCanonicalName(), paramBundle.getClass().getCanonicalName() }));
  }
  
  public static void zzb(Bundle paramBundle, Object paramObject)
  {
    if ((paramObject instanceof Double))
    {
      paramBundle.putDouble("value", ((Double)paramObject).doubleValue());
      return;
    }
    if ((paramObject instanceof Long))
    {
      paramBundle.putLong("value", ((Long)paramObject).longValue());
      return;
    }
    paramBundle.putString("value", paramObject.toString());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\measurement\internal\zzhe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */