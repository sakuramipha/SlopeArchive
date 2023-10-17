package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;

final class zzgol
{
  private static final zzgoj zza = new zzgok();
  private static final zzgoj zzb;
  
  static
  {
    zzgoj localzzgoj2;
    try
    {
      zzgoj localzzgoj1 = (zzgoj)Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
    }
    catch (Exception localException)
    {
      localzzgoj2 = null;
    }
    zzb = localzzgoj2;
  }
  
  static zzgoj zza()
  {
    zzgoj localzzgoj = zzb;
    if (localzzgoj != null) {
      return localzzgoj;
    }
    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
  }
  
  static zzgoj zzb()
  {
    return zza;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgol.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */