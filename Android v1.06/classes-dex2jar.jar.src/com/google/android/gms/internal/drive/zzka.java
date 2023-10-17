package com.google.android.gms.internal.drive;

import java.lang.reflect.Constructor;

final class zzka
{
  private static final zzjy<?> zzoq = new zzjz();
  private static final zzjy<?> zzor = zzck();
  
  private static zzjy<?> zzck()
  {
    try
    {
      zzjy localzzjy = (zzjy)Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
      return localzzjy;
    }
    catch (Exception localException) {}
    return null;
  }
  
  static zzjy<?> zzcl()
  {
    return zzoq;
  }
  
  static zzjy<?> zzcm()
  {
    zzjy localzzjy = zzor;
    if (localzzjy != null) {
      return localzzjy;
    }
    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzka.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */