package com.google.android.gms.internal.measurement;

import java.lang.reflect.Constructor;

final class zzlf
{
  private static final zzle zza;
  private static final zzle zzb = new zzle();
  
  static
  {
    zzle localzzle2;
    try
    {
      zzle localzzle1 = (zzle)Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
    }
    catch (Exception localException)
    {
      localzzle2 = null;
    }
    zza = localzzle2;
  }
  
  static zzle zza()
  {
    return zza;
  }
  
  static zzle zzb()
  {
    return zzb;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzlf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */