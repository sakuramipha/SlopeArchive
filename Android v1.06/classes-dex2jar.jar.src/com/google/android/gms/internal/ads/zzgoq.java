package com.google.android.gms.internal.ads;

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

abstract class zzgoq
{
  private static final Logger zza = Logger.getLogger(zzgod.class.getName());
  private static final String zzb = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
  
  static zzgoi zzb(Class paramClass)
  {
    Object localObject2 = zzgoq.class.getClassLoader();
    Object localObject1;
    if (paramClass.equals(zzgoi.class))
    {
      localObject1 = zzb;
    }
    else
    {
      if (!paramClass.getPackage().equals(zzgoq.class.getPackage())) {
        break label324;
      }
      localObject1 = String.format("%s.BlazeGenerated%sLoader", new Object[] { paramClass.getPackage().getName(), paramClass.getSimpleName() });
    }
    try
    {
      localObject1 = Class.forName((String)localObject1, true, (ClassLoader)localObject2);
      try
      {
        localObject1 = (zzgoq)((Class)localObject1).getConstructor(new Class[0]).newInstance(new Object[0]);
        return (zzgoi)paramClass.cast(((zzgoq)localObject1).zza());
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
      Iterator localIterator;
      throw new IllegalArgumentException(paramClass.getName());
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      localIterator = ServiceLoader.load(zzgoq.class, (ClassLoader)localObject2).iterator();
      localObject2 = new ArrayList();
      while (localIterator.hasNext()) {
        try
        {
          ((ArrayList)localObject2).add((zzgoi)paramClass.cast(((zzgoq)localIterator.next()).zza()));
        }
        catch (ServiceConfigurationError localServiceConfigurationError)
        {
          zza.logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(String.valueOf(paramClass.getSimpleName())), localServiceConfigurationError);
        }
      }
      if (((ArrayList)localObject2).size() == 1) {
        return (zzgoi)((ArrayList)localObject2).get(0);
      }
      if (((ArrayList)localObject2).size() == 0) {
        return null;
      }
      try
      {
        paramClass = (zzgoi)paramClass.getMethod("combine", new Class[] { Collection.class }).invoke(null, new Object[] { localObject2 });
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
  
  protected abstract zzgoi zza();
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgoq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */