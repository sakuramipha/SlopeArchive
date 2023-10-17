package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.annotation.CheckForNull;

public final class zzfpq
{
  @CheckForNull
  private static final Object zza;
  @CheckForNull
  private static final Method zzb;
  @CheckForNull
  private static final Method zzc;
  
  static
  {
    Object localObject3 = zza();
    zza = localObject3;
    Object localObject2 = null;
    Object localObject1;
    if (localObject3 == null) {
      localObject1 = null;
    } else {
      localObject1 = zzb("getStackTraceElement", new Class[] { Throwable.class, Integer.TYPE });
    }
    zzb = (Method)localObject1;
    if (localObject3 == null) {
      localObject1 = localObject2;
    } else {
      localObject1 = zzc(localObject3);
    }
    zzc = (Method)localObject1;
  }
  
  @CheckForNull
  private static Object zza()
  {
    Object localObject1 = null;
    try
    {
      Object localObject2 = Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
      localObject1 = localObject2;
    }
    catch (ThreadDeath localThreadDeath)
    {
      localThreadDeath = localThreadDeath;
      throw localThreadDeath;
    }
    finally
    {
      for (;;)
      {
        localObject3 = finally;
      }
    }
    return localObject1;
  }
  
  /* Error */
  @CheckForNull
  private static Method zzb(String paramString, Class... paramVarArgs)
    throws ThreadDeath
  {
    // Byte code:
    //   0: ldc 62
    //   2: iconst_0
    //   3: aconst_null
    //   4: invokestatic 48	java/lang/Class:forName	(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   7: aload_0
    //   8: aload_1
    //   9: invokevirtual 53	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   12: astore_0
    //   13: aload_0
    //   14: areturn
    //   15: astore_0
    //   16: aconst_null
    //   17: areturn
    //   18: astore_0
    //   19: aload_0
    //   20: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	21	0	paramString	String
    //   0	21	1	paramVarArgs	Class[]
    // Exception table:
    //   from	to	target	type
    //   0	13	15	finally
    //   0	13	18	java/lang/ThreadDeath
  }
  
  @CheckForNull
  private static Method zzc(Object paramObject)
  {
    try
    {
      Method localMethod = zzb("getStackTraceDepth", new Class[] { Throwable.class });
      if (localMethod == null) {
        return null;
      }
      Throwable localThrowable = new java/lang/Throwable;
      localThrowable.<init>();
      localMethod.invoke(paramObject, new Object[] { localThrowable });
      return localMethod;
    }
    catch (UnsupportedOperationException|IllegalAccessException|InvocationTargetException paramObject) {}
    return null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfpq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */