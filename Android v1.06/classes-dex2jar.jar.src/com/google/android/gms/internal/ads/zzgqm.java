package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;

final class zzgqm
{
  private static final zzgql zza;
  private static final zzgql zzb = new zzgql();
  
  static
  {
    zzgql localzzgql2;
    try
    {
      zzgql localzzgql1 = (zzgql)Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
    }
    catch (Exception localException)
    {
      localzzgql2 = null;
    }
    zza = localzzgql2;
  }
  
  static zzgql zza()
  {
    return zza;
  }
  
  static zzgql zzb()
  {
    return zzb;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgqm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */