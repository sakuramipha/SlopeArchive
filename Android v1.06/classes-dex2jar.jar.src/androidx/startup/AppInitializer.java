package androidx.startup;

import android.content.Context;
import androidx.tracing.Trace;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class AppInitializer
{
  private static final String SECTION_NAME = "Startup";
  private static volatile AppInitializer sInstance;
  private static final Object sLock = new Object();
  final Context mContext;
  final Set<Class<? extends Initializer<?>>> mDiscovered;
  final Map<Class<?>, Object> mInitialized;
  
  AppInitializer(Context paramContext)
  {
    this.mContext = paramContext.getApplicationContext();
    this.mDiscovered = new HashSet();
    this.mInitialized = new HashMap();
  }
  
  public static AppInitializer getInstance(Context paramContext)
  {
    if (sInstance == null) {
      synchronized (sLock)
      {
        if (sInstance == null)
        {
          AppInitializer localAppInitializer = new androidx/startup/AppInitializer;
          localAppInitializer.<init>(paramContext);
          sInstance = localAppInitializer;
        }
      }
    }
    return sInstance;
  }
  
  /* Error */
  void discoverAndInitialize()
  {
    // Byte code:
    //   0: ldc 8
    //   2: invokestatic 64	androidx/tracing/Trace:beginSection	(Ljava/lang/String;)V
    //   5: new 66	android/content/ComponentName
    //   8: astore_1
    //   9: aload_1
    //   10: aload_0
    //   11: getfield 37	androidx/startup/AppInitializer:mContext	Landroid/content/Context;
    //   14: invokevirtual 70	android/content/Context:getPackageName	()Ljava/lang/String;
    //   17: ldc 72
    //   19: invokevirtual 77	java/lang/Class:getName	()Ljava/lang/String;
    //   22: invokespecial 80	android/content/ComponentName:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   25: aload_0
    //   26: getfield 37	androidx/startup/AppInitializer:mContext	Landroid/content/Context;
    //   29: invokevirtual 84	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   32: aload_1
    //   33: sipush 128
    //   36: invokevirtual 90	android/content/pm/PackageManager:getProviderInfo	(Landroid/content/ComponentName;I)Landroid/content/pm/ProviderInfo;
    //   39: getfield 96	android/content/pm/ProviderInfo:metaData	Landroid/os/Bundle;
    //   42: astore_2
    //   43: aload_0
    //   44: getfield 37	androidx/startup/AppInitializer:mContext	Landroid/content/Context;
    //   47: getstatic 102	androidx/startup/R$string:androidx_startup	I
    //   50: invokevirtual 106	android/content/Context:getString	(I)Ljava/lang/String;
    //   53: astore_1
    //   54: aload_2
    //   55: ifnull +98 -> 153
    //   58: new 39	java/util/HashSet
    //   61: astore 4
    //   63: aload 4
    //   65: invokespecial 40	java/util/HashSet:<init>	()V
    //   68: aload_2
    //   69: invokevirtual 112	android/os/Bundle:keySet	()Ljava/util/Set;
    //   72: invokeinterface 118 1 0
    //   77: astore_3
    //   78: aload_3
    //   79: invokeinterface 124 1 0
    //   84: ifeq +69 -> 153
    //   87: aload_3
    //   88: invokeinterface 128 1 0
    //   93: checkcast 130	java/lang/String
    //   96: astore 5
    //   98: aload_1
    //   99: aload_2
    //   100: aload 5
    //   102: aconst_null
    //   103: invokevirtual 133	android/os/Bundle:getString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   106: invokevirtual 137	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   109: ifeq -31 -> 78
    //   112: aload 5
    //   114: invokestatic 141	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   117: astore 5
    //   119: ldc -113
    //   121: aload 5
    //   123: invokevirtual 147	java/lang/Class:isAssignableFrom	(Ljava/lang/Class;)Z
    //   126: ifeq -48 -> 78
    //   129: aload_0
    //   130: getfield 42	androidx/startup/AppInitializer:mDiscovered	Ljava/util/Set;
    //   133: aload 5
    //   135: invokeinterface 150 2 0
    //   140: pop
    //   141: aload_0
    //   142: aload 5
    //   144: aload 4
    //   146: invokevirtual 154	androidx/startup/AppInitializer:doInitialize	(Ljava/lang/Class;Ljava/util/Set;)Ljava/lang/Object;
    //   149: pop
    //   150: goto -72 -> 78
    //   153: invokestatic 157	androidx/tracing/Trace:endSection	()V
    //   156: return
    //   157: astore_1
    //   158: goto +19 -> 177
    //   161: astore_1
    //   162: goto +4 -> 166
    //   165: astore_1
    //   166: new 159	androidx/startup/StartupException
    //   169: astore_2
    //   170: aload_2
    //   171: aload_1
    //   172: invokespecial 162	androidx/startup/StartupException:<init>	(Ljava/lang/Throwable;)V
    //   175: aload_2
    //   176: athrow
    //   177: invokestatic 157	androidx/tracing/Trace:endSection	()V
    //   180: aload_1
    //   181: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	182	0	this	AppInitializer
    //   8	91	1	localObject1	Object
    //   157	1	1	localObject2	Object
    //   161	1	1	localClassNotFoundException	ClassNotFoundException
    //   165	16	1	localNameNotFoundException	android.content.pm.PackageManager.NameNotFoundException
    //   42	134	2	localObject3	Object
    //   77	11	3	localIterator	Iterator
    //   61	84	4	localHashSet	HashSet
    //   96	47	5	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   0	54	157	finally
    //   58	78	157	finally
    //   78	150	157	finally
    //   166	177	157	finally
    //   0	54	161	java/lang/ClassNotFoundException
    //   58	78	161	java/lang/ClassNotFoundException
    //   78	150	161	java/lang/ClassNotFoundException
    //   0	54	165	android/content/pm/PackageManager$NameNotFoundException
    //   58	78	165	android/content/pm/PackageManager$NameNotFoundException
    //   78	150	165	android/content/pm/PackageManager$NameNotFoundException
  }
  
  <T> T doInitialize(Class<? extends Initializer<?>> paramClass, Set<Class<?>> paramSet)
  {
    synchronized (sLock)
    {
      boolean bool = Trace.isEnabled();
      if (bool) {}
      try
      {
        Trace.beginSection(paramClass.getSimpleName());
        if (!paramSet.contains(paramClass))
        {
          if (!this.mInitialized.containsKey(paramClass))
          {
            paramSet.add(paramClass);
            try
            {
              Object localObject1 = (Initializer)paramClass.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
              Object localObject3 = ((Initializer)localObject1).dependencies();
              if (!((List)localObject3).isEmpty())
              {
                localObject3 = ((List)localObject3).iterator();
                while (((Iterator)localObject3).hasNext())
                {
                  Class localClass = (Class)((Iterator)localObject3).next();
                  if (!this.mInitialized.containsKey(localClass)) {
                    doInitialize(localClass, paramSet);
                  }
                }
              }
              localObject1 = ((Initializer)localObject1).create(this.mContext);
              paramSet.remove(paramClass);
              this.mInitialized.put(paramClass, localObject1);
              paramClass = (Class<? extends Initializer<?>>)localObject1;
            }
            finally
            {
              paramSet = new androidx/startup/StartupException;
              paramSet.<init>(paramClass);
            }
          }
          paramClass = this.mInitialized.get(paramClass);
          Trace.endSection();
          return paramClass;
        }
        paramSet = String.format("Cannot initialize %s. Cycle detected.", new Object[] { paramClass.getName() });
        paramClass = new java/lang/IllegalStateException;
        paramClass.<init>(paramSet);
        throw paramClass;
      }
      finally
      {
        Trace.endSection();
      }
    }
  }
  
  public <T> T initializeComponent(Class<? extends Initializer<T>> paramClass)
  {
    return (T)doInitialize(paramClass, new HashSet());
  }
  
  public boolean isEagerlyInitialized(Class<? extends Initializer<?>> paramClass)
  {
    return this.mDiscovered.contains(paramClass);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\startup\AppInitializer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */