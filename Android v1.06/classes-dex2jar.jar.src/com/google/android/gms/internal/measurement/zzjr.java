package com.google.android.gms.internal.measurement;

import java.lang.reflect.Constructor;

final class zzjr
{
  private static final zzjp zza = new zzjq();
  private static final zzjp zzb;
  
  static
  {
    zzjp localzzjp2;
    try
    {
      zzjp localzzjp1 = (zzjp)Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
    }
    catch (Exception localException)
    {
      localzzjp2 = null;
    }
    zzb = localzzjp2;
  }
  
  static zzjp zza()
  {
    zzjp localzzjp = zzb;
    if (localzzjp != null) {
      return localzzjp;
    }
    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
  }
  
  static zzjp zzb()
  {
    return zza;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzjr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */