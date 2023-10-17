package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;

final class zzgqc
{
  private static final zzgqb zza;
  private static final zzgqb zzb = new zzgqb();
  
  static
  {
    zzgqb localzzgqb2;
    try
    {
      zzgqb localzzgqb1 = (zzgqb)Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
    }
    catch (Exception localException)
    {
      localzzgqb2 = null;
    }
    zza = localzzgqb2;
  }
  
  static zzgqb zza()
  {
    return zza;
  }
  
  static zzgqb zzb()
  {
    return zzb;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgqc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */