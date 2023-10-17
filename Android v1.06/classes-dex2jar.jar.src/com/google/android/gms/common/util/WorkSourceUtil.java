package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class WorkSourceUtil
{
  private static final int zza = ;
  private static final Method zzb;
  private static final Method zzc;
  private static final Method zzd;
  private static final Method zze;
  private static final Method zzf;
  private static final Method zzg;
  private static final Method zzh;
  private static final Method zzi;
  
  static
  {
    Method localMethod6 = null;
    Object localObject2 = null;
    try
    {
      Method localMethod1 = WorkSource.class.getMethod("add", new Class[] { Integer.TYPE });
    }
    catch (Exception localException1)
    {
      localMethod2 = null;
    }
    zzb = localMethod2;
    if (PlatformVersion.isAtLeastJellyBeanMR2()) {}
    try
    {
      localMethod2 = WorkSource.class.getMethod("add", new Class[] { Integer.TYPE, String.class });
    }
    catch (Exception localException6)
    {
      Method localMethod3;
      Method localMethod4;
      for (;;) {}
    }
    Method localMethod2 = null;
    zzc = localMethod2;
    try
    {
      localMethod2 = WorkSource.class.getMethod("size", new Class[0]);
    }
    catch (Exception localException2)
    {
      localMethod3 = null;
    }
    zzd = localMethod3;
    try
    {
      localMethod3 = WorkSource.class.getMethod("get", new Class[] { Integer.TYPE });
    }
    catch (Exception localException3)
    {
      localMethod4 = null;
    }
    zze = localMethod4;
    if (PlatformVersion.isAtLeastJellyBeanMR2()) {}
    try
    {
      localMethod4 = WorkSource.class.getMethod("getName", new Class[] { Integer.TYPE });
    }
    catch (Exception localException7)
    {
      Method localMethod5;
      Object localObject1;
      for (;;) {}
    }
    localMethod4 = null;
    zzf = localMethod4;
    if (PlatformVersion.isAtLeastP()) {
      try
      {
        localMethod4 = WorkSource.class.getMethod("createWorkChain", new Class[0]);
      }
      catch (Exception localException4)
      {
        Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", localException4);
      }
    } else {
      localMethod5 = null;
    }
    zzg = localMethod5;
    if (PlatformVersion.isAtLeastP()) {
      try
      {
        localMethod5 = Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", new Class[] { Integer.TYPE, String.class });
      }
      catch (Exception localException5)
      {
        Log.w("WorkSourceUtil", "Missing WorkChain class", localException5);
      }
    } else {
      localObject1 = null;
    }
    zzh = (Method)localObject1;
    localObject1 = localObject2;
    if (PlatformVersion.isAtLeastP()) {
      localObject1 = localMethod6;
    }
    try
    {
      localMethod6 = WorkSource.class.getMethod("isEmpty", new Class[0]);
      localObject1 = localMethod6;
      localMethod6.setAccessible(true);
      localObject1 = localMethod6;
    }
    catch (Exception localException8)
    {
      for (;;) {}
    }
    zzi = (Method)localObject1;
  }
  
  public static void add(WorkSource paramWorkSource, int paramInt, String paramString)
  {
    Method localMethod = zzc;
    if (localMethod != null)
    {
      String str = paramString;
      if (paramString == null) {
        str = "";
      }
      try
      {
        localMethod.invoke(paramWorkSource, new Object[] { Integer.valueOf(paramInt), str });
        return;
      }
      catch (Exception paramWorkSource)
      {
        Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", paramWorkSource);
        return;
      }
    }
    paramString = zzb;
    if (paramString != null) {
      try
      {
        paramString.invoke(paramWorkSource, new Object[] { Integer.valueOf(paramInt) });
        return;
      }
      catch (Exception paramWorkSource)
      {
        Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", paramWorkSource);
      }
    }
  }
  
  public static WorkSource fromPackage(Context paramContext, String paramString)
  {
    if ((paramContext != null) && (paramContext.getPackageManager() != null) && (paramString != null)) {
      try
      {
        paramContext = Wrappers.packageManager(paramContext).getApplicationInfo(paramString, 0);
        if (paramContext == null)
        {
          if (paramString.length() != 0) {
            paramContext = "Could not get applicationInfo from package: ".concat(paramString);
          } else {
            paramContext = new String("Could not get applicationInfo from package: ");
          }
          Log.e("WorkSourceUtil", paramContext);
          return null;
        }
        int i = paramContext.uid;
        paramContext = new WorkSource();
        add(paramContext, i, paramString);
        return paramContext;
      }
      catch (PackageManager.NameNotFoundException paramContext)
      {
        if (paramString.length() != 0) {
          paramContext = "Could not find package: ".concat(paramString);
        } else {
          paramContext = new String("Could not find package: ");
        }
        Log.e("WorkSourceUtil", paramContext);
      }
    }
    return null;
  }
  
  public static WorkSource fromPackageAndModuleExperimentalPi(Context paramContext, String paramString1, String paramString2)
  {
    if ((paramContext != null) && (paramContext.getPackageManager() != null) && (paramString2 != null) && (paramString1 != null))
    {
      int i = -1;
      try
      {
        paramContext = Wrappers.packageManager(paramContext).getApplicationInfo(paramString1, 0);
        if (paramContext == null)
        {
          if (paramString1.length() != 0) {
            paramContext = "Could not get applicationInfo from package: ".concat(paramString1);
          } else {
            paramContext = new String("Could not get applicationInfo from package: ");
          }
          Log.e("WorkSourceUtil", paramContext);
        }
        else
        {
          i = paramContext.uid;
        }
      }
      catch (PackageManager.NameNotFoundException paramContext)
      {
        if (paramString1.length() != 0) {
          paramContext = "Could not find package: ".concat(paramString1);
        } else {
          paramContext = new String("Could not find package: ");
        }
        Log.e("WorkSourceUtil", paramContext);
      }
      if (i < 0) {
        return null;
      }
      paramContext = new WorkSource();
      Object localObject = zzg;
      if (localObject != null)
      {
        Method localMethod = zzh;
        if (localMethod != null) {
          try
          {
            localObject = ((Method)localObject).invoke(paramContext, new Object[0]);
            int j = zza;
            if (i != j) {
              localMethod.invoke(localObject, new Object[] { Integer.valueOf(i), paramString1 });
            }
            localMethod.invoke(localObject, new Object[] { Integer.valueOf(j), paramString2 });
          }
          catch (Exception paramString1)
          {
            Log.w("WorkSourceUtil", "Unable to assign chained blame through WorkSource", paramString1);
          }
        }
      }
      add(paramContext, i, paramString1);
      return paramContext;
    }
    Log.w("WorkSourceUtil", "Unexpected null arguments");
    return null;
  }
  
  public static List<String> getNames(WorkSource paramWorkSource)
  {
    ArrayList localArrayList = new ArrayList();
    int i;
    if (paramWorkSource == null) {
      i = 0;
    } else {
      i = zza(paramWorkSource);
    }
    if (i != 0) {
      for (int j = 0; j < i; j++)
      {
        Method localMethod = zzf;
        Object localObject3 = null;
        Object localObject1 = localObject3;
        Object localObject2;
        if (localMethod != null) {
          try
          {
            localObject1 = (String)localMethod.invoke(paramWorkSource, new Object[] { Integer.valueOf(j) });
          }
          catch (Exception localException)
          {
            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", localException);
            localObject2 = localObject3;
          }
        }
        if (!Strings.isEmptyOrWhitespace((String)localObject2))
        {
          Preconditions.checkNotNull(localObject2);
          localArrayList.add(localObject2);
        }
      }
    }
    return localArrayList;
  }
  
  public static boolean hasWorkSourcePermission(Context paramContext)
  {
    if (paramContext == null) {
      return false;
    }
    if (paramContext.getPackageManager() == null) {
      return false;
    }
    return Wrappers.packageManager(paramContext).checkPermission("android.permission.UPDATE_DEVICE_STATS", paramContext.getPackageName()) == 0;
  }
  
  public static boolean isEmpty(WorkSource paramWorkSource)
  {
    Object localObject = zzi;
    if (localObject != null) {
      try
      {
        localObject = ((Method)localObject).invoke(paramWorkSource, new Object[0]);
        Preconditions.checkNotNull(localObject);
        boolean bool = ((Boolean)localObject).booleanValue();
        return bool;
      }
      catch (Exception localException)
      {
        Log.e("WorkSourceUtil", "Unable to check WorkSource emptiness", localException);
      }
    }
    return zza(paramWorkSource) == 0;
  }
  
  public static int zza(WorkSource paramWorkSource)
  {
    Method localMethod = zzd;
    if (localMethod != null) {
      try
      {
        paramWorkSource = localMethod.invoke(paramWorkSource, new Object[0]);
        Preconditions.checkNotNull(paramWorkSource);
        int i = ((Integer)paramWorkSource).intValue();
        return i;
      }
      catch (Exception paramWorkSource)
      {
        Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", paramWorkSource);
      }
    }
    return 0;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\commo\\util\WorkSourceUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */