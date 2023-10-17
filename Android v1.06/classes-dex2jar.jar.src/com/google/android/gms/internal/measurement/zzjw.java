package com.google.android.gms.internal.measurement;

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

abstract class zzjw
{
  private static final Logger zza = Logger.getLogger(zzjj.class.getName());
  private static final String zzb = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
  
  static zzjo zzb(Class paramClass)
  {
    Object localObject2 = zzjw.class.getClassLoader();
    Object localObject1;
    if (paramClass.equals(zzjo.class))
    {
      localObject1 = zzb;
    }
    else
    {
      if (!paramClass.getPackage().equals(zzjw.class.getPackage())) {
        break label321;
      }
      localObject1 = String.format("%s.BlazeGenerated%sLoader", new Object[] { paramClass.getPackage().getName(), paramClass.getSimpleName() });
    }
    try
    {
      localObject1 = Class.forName((String)localObject1, true, (ClassLoader)localObject2);
      try
      {
        localObject1 = (zzjw)((Class)localObject1).getConstructor(new Class[0]).newInstance(new Object[0]);
        return (zzjo)paramClass.cast(((zzjw)localObject1).zza());
      }
      catch (InvocationTargetException localInvocationTargetException)
      {
        localObject1 = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject1).<init>(localInvocationTargetException);
        throw ((Throwable)localObject1);
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        localObject1 = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject1).<init>(localIllegalAccessException);
        throw ((Throwable)localObject1);
      }
      catch (InstantiationException localInstantiationException)
      {
        IllegalStateException localIllegalStateException2 = new java/lang/IllegalStateException;
        localIllegalStateException2.<init>(localInstantiationException);
        throw localIllegalStateException2;
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        IllegalStateException localIllegalStateException1 = new java/lang/IllegalStateException;
        localIllegalStateException1.<init>(localNoSuchMethodException);
        throw localIllegalStateException1;
      }
      ArrayList localArrayList;
      throw new IllegalArgumentException(paramClass.getName());
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      localObject2 = ServiceLoader.load(zzjw.class, (ClassLoader)localObject2).iterator();
      localArrayList = new ArrayList();
      while (((Iterator)localObject2).hasNext()) {
        try
        {
          localArrayList.add(paramClass.cast(((zzjw)((Iterator)localObject2).next()).zza()));
        }
        catch (ServiceConfigurationError localServiceConfigurationError)
        {
          zza.logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(String.valueOf(paramClass.getSimpleName())), localServiceConfigurationError);
        }
      }
      if (localArrayList.size() == 1) {
        return (zzjo)localArrayList.get(0);
      }
      if (localArrayList.size() == 0) {
        return null;
      }
      try
      {
        paramClass = (zzjo)paramClass.getMethod("combine", new Class[] { Collection.class }).invoke(null, new Object[] { localArrayList });
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
  
  protected abstract zzjo zza();
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzjw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */