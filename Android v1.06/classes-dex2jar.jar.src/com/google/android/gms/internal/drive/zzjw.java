package com.google.android.gms.internal.drive;

import java.lang.reflect.Method;

final class zzjw
{
  private static final Class<?> zzok = ;
  
  private static Class<?> zzce()
  {
    try
    {
      Class localClass = Class.forName("com.google.protobuf.ExtensionRegistry");
      return localClass;
    }
    catch (ClassNotFoundException localClassNotFoundException) {}
    return null;
  }
  
  public static zzjx zzcf()
  {
    if (zzok != null) {}
    try
    {
      zzjx localzzjx = zzn("getEmptyRegistry");
      return localzzjx;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    return zzjx.zzoo;
  }
  
  static zzjx zzcg()
  {
    if (zzok != null) {}
    try
    {
      localObject2 = zzn("loadGeneratedRegistry");
    }
    catch (Exception localException)
    {
      Object localObject2;
      Object localObject1;
      for (;;) {}
    }
    localObject2 = null;
    localObject1 = localObject2;
    if (localObject2 == null) {
      localObject1 = zzjx.zzcg();
    }
    localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = zzcf();
    }
    return (zzjx)localObject2;
  }
  
  private static final zzjx zzn(String paramString)
    throws Exception
  {
    return (zzjx)zzok.getDeclaredMethod(paramString, new Class[0]).invoke(null, new Object[0]);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzjw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */