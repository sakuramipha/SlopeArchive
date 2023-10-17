package com.google.android.gms.internal.measurement;

import java.lang.reflect.Constructor;

final class zzlp
{
  private static final zzlo zza;
  private static final zzlo zzb = new zzlo();
  
  static
  {
    zzlo localzzlo2;
    try
    {
      zzlo localzzlo1 = (zzlo)Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
    }
    catch (Exception localException)
    {
      localzzlo2 = null;
    }
    zza = localzzlo2;
  }
  
  static zzlo zza()
  {
    return zza;
  }
  
  static zzlo zzb()
  {
    return zzb;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzlp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */