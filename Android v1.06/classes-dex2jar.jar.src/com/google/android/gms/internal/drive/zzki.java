package com.google.android.gms.internal.drive;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

abstract class zzki<T extends zzjx>
{
  private static final Logger logger = Logger.getLogger(zzjr.class.getName());
  private static String zzro = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
  
  static <T extends zzjx> T zza(Class<T> paramClass)
  {
    Object localObject2 = zzki.class.getClassLoader();
    Object localObject1;
    if (paramClass.equals(zzjx.class))
    {
      localObject1 = zzro;
    }
    else
    {
      if (!paramClass.getPackage().equals(zzki.class.getPackage())) {
        break label362;
      }
      localObject1 = String.format("%s.BlazeGenerated%sLoader", new Object[] { paramClass.getPackage().getName(), paramClass.getSimpleName() });
    }
    try
    {
      localObject1 = Class.forName((String)localObject1, true, (ClassLoader)localObject2);
      try
      {
        localObject1 = (zzki)((Class)localObject1).getConstructor(new Class[0]).newInstance(new Object[0]);
        return (zzjx)paramClass.cast(((zzki)localObject1).zzcu());
      }
      catch (InvocationTargetException localInvocationTargetException)
      {
        localIllegalStateException2 = new java/lang/IllegalStateException;
        localIllegalStateException2.<init>(localInvocationTargetException);
        throw localIllegalStateException2;
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        IllegalStateException localIllegalStateException2 = new java/lang/IllegalStateException;
        localIllegalStateException2.<init>(localIllegalAccessException);
        throw localIllegalStateException2;
      }
      catch (InstantiationException localInstantiationException)
      {
        localIllegalStateException1 = new java/lang/IllegalStateException;
        localIllegalStateException1.<init>(localInstantiationException);
        throw localIllegalStateException1;
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        IllegalStateException localIllegalStateException1 = new java/lang/IllegalStateException;
        localIllegalStateException1.<init>(localNoSuchMethodException);
        throw localIllegalStateException1;
      }
      ArrayList localArrayList;
      Logger localLogger;
      Level localLevel;
      String str;
      throw new IllegalArgumentException(paramClass.getName());
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      localObject2 = ServiceLoader.load(zzki.class, (ClassLoader)localObject2).iterator();
      localArrayList = new ArrayList();
      while (((Iterator)localObject2).hasNext()) {
        try
        {
          localArrayList.add((zzjx)paramClass.cast(((zzki)((Iterator)localObject2).next()).zzcu()));
        }
        catch (ServiceConfigurationError localServiceConfigurationError)
        {
          localLogger = logger;
          localLevel = Level.SEVERE;
          str = String.valueOf(paramClass.getSimpleName());
          if (str.length() != 0) {
            str = "Unable to load ".concat(str);
          } else {
            str = new String("Unable to load ");
          }
          localLogger.logp(localLevel, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", str, localServiceConfigurationError);
        }
      }
      if (localArrayList.size() == 1) {
        return (zzjx)localArrayList.get(0);
      }
      if (localArrayList.size() == 0) {
        return null;
      }
      try
      {
        paramClass = (zzjx)paramClass.getMethod("combine", new Class[] { Collection.class }).invoke(null, new Object[] { localArrayList });
        return paramClass;
      }
      catch (InvocationTargetException paramClass)
      {
        throw new IllegalStateException(paramClass);
      }
      catch (IllegalAccessException paramClass)
      {
        throw new IllegalStateException(paramClass);
      }
      catch (NoSuchMethodException paramClass)
      {
        throw new IllegalStateException(paramClass);
      }
    }
  }
  
  protected abstract T zzcu();
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzki.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */