package com.google.android.gms.dynamite;

import android.util.Log;

public final class zzb
{
  private static volatile ClassLoader zza;
  private static volatile Thread zzb;
  
  public static ClassLoader zza()
  {
    try
    {
      if (zza == null) {
        zza = zzb();
      }
      ClassLoader localClassLoader = zza;
      return localClassLoader;
    }
    finally {}
  }
  
  private static ClassLoader zzb()
  {
    try
    {
      Object localObject1 = zzb;
      Object localObject5 = null;
      if (localObject1 == null)
      {
        zzb = zzc();
        localObject1 = zzb;
        if (localObject1 == null) {
          return null;
        }
      }
      Object localObject3;
      try
      {
        synchronized (zzb)
        {
          localObject1 = zzb.getContextClassLoader();
        }
      }
      catch (SecurityException localSecurityException)
      {
        localObject3 = String.valueOf(localSecurityException.getMessage());
        if (((String)localObject3).length() != 0) {
          localObject3 = "Failed to get thread context classloader ".concat((String)localObject3);
        } else {
          localObject3 = new String("Failed to get thread context classloader ");
        }
        Log.w("DynamiteLoaderV2CL", (String)localObject3);
        localObject3 = localObject5;
        return (ClassLoader)localObject3;
      }
      throw ((Throwable)localObject3);
    }
    finally {}
  }
  
  /* Error */
  private static Thread zzc()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: invokestatic 67	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   6: invokevirtual 70	android/os/Looper:getThread	()Ljava/lang/Thread;
    //   9: invokevirtual 74	java/lang/Thread:getThreadGroup	()Ljava/lang/ThreadGroup;
    //   12: astore 6
    //   14: aload 6
    //   16: ifnonnull +8 -> 24
    //   19: ldc 2
    //   21: monitorexit
    //   22: aconst_null
    //   23: areturn
    //   24: ldc 76
    //   26: monitorenter
    //   27: aload 6
    //   29: invokevirtual 81	java/lang/ThreadGroup:activeGroupCount	()I
    //   32: istore_2
    //   33: iload_2
    //   34: anewarray 78	java/lang/ThreadGroup
    //   37: astore 5
    //   39: aload 6
    //   41: aload 5
    //   43: invokevirtual 85	java/lang/ThreadGroup:enumerate	([Ljava/lang/ThreadGroup;)I
    //   46: pop
    //   47: iconst_0
    //   48: istore_1
    //   49: iconst_0
    //   50: istore_0
    //   51: iload_0
    //   52: iload_2
    //   53: if_icmpge +31 -> 84
    //   56: aload 5
    //   58: iload_0
    //   59: aaload
    //   60: astore 4
    //   62: ldc 87
    //   64: aload 4
    //   66: invokevirtual 90	java/lang/ThreadGroup:getName	()Ljava/lang/String;
    //   69: invokevirtual 94	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   72: ifeq +6 -> 78
    //   75: goto +12 -> 87
    //   78: iinc 0 1
    //   81: goto -30 -> 51
    //   84: aconst_null
    //   85: astore 4
    //   87: aload 4
    //   89: astore 5
    //   91: aload 4
    //   93: ifnonnull +17 -> 110
    //   96: new 78	java/lang/ThreadGroup
    //   99: astore 5
    //   101: aload 5
    //   103: aload 6
    //   105: ldc 87
    //   107: invokespecial 97	java/lang/ThreadGroup:<init>	(Ljava/lang/ThreadGroup;Ljava/lang/String;)V
    //   110: aload 5
    //   112: invokevirtual 100	java/lang/ThreadGroup:activeCount	()I
    //   115: istore_2
    //   116: iload_2
    //   117: anewarray 26	java/lang/Thread
    //   120: astore 6
    //   122: aload 5
    //   124: aload 6
    //   126: invokevirtual 103	java/lang/ThreadGroup:enumerate	([Ljava/lang/Thread;)I
    //   129: pop
    //   130: iload_1
    //   131: istore_0
    //   132: iload_0
    //   133: iload_2
    //   134: if_icmpge +33 -> 167
    //   137: aload 6
    //   139: iload_0
    //   140: aaload
    //   141: astore 4
    //   143: ldc 105
    //   145: aload 4
    //   147: invokevirtual 106	java/lang/Thread:getName	()Ljava/lang/String;
    //   150: invokevirtual 94	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   153: istore_3
    //   154: iload_3
    //   155: ifeq +6 -> 161
    //   158: goto +12 -> 170
    //   161: iinc 0 1
    //   164: goto -32 -> 132
    //   167: aconst_null
    //   168: astore 4
    //   170: aload 4
    //   172: astore 6
    //   174: aload 4
    //   176: ifnonnull +112 -> 288
    //   179: new 108	com/google/android/gms/dynamite/zza
    //   182: astore 6
    //   184: aload 6
    //   186: aload 5
    //   188: ldc 105
    //   190: invokespecial 109	com/google/android/gms/dynamite/zza:<init>	(Ljava/lang/ThreadGroup;Ljava/lang/String;)V
    //   193: aload 6
    //   195: aconst_null
    //   196: invokevirtual 113	java/lang/Thread:setContextClassLoader	(Ljava/lang/ClassLoader;)V
    //   199: aload 6
    //   201: invokevirtual 116	java/lang/Thread:start	()V
    //   204: aload 6
    //   206: astore 4
    //   208: goto +76 -> 284
    //   211: astore 5
    //   213: aload 6
    //   215: astore 4
    //   217: goto +18 -> 235
    //   220: astore 5
    //   222: goto +13 -> 235
    //   225: astore 4
    //   227: goto +70 -> 297
    //   230: astore 5
    //   232: aconst_null
    //   233: astore 4
    //   235: aload 5
    //   237: invokevirtual 33	java/lang/SecurityException:getMessage	()Ljava/lang/String;
    //   240: invokestatic 39	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   243: astore 5
    //   245: aload 5
    //   247: invokevirtual 43	java/lang/String:length	()I
    //   250: ifeq +15 -> 265
    //   253: ldc 118
    //   255: aload 5
    //   257: invokevirtual 49	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   260: astore 5
    //   262: goto +14 -> 276
    //   265: new 35	java/lang/String
    //   268: dup
    //   269: ldc 118
    //   271: invokespecial 53	java/lang/String:<init>	(Ljava/lang/String;)V
    //   274: astore 5
    //   276: ldc 55
    //   278: aload 5
    //   280: invokestatic 61	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   283: pop
    //   284: aload 4
    //   286: astore 6
    //   288: ldc 76
    //   290: monitorexit
    //   291: ldc 2
    //   293: monitorexit
    //   294: aload 6
    //   296: areturn
    //   297: ldc 76
    //   299: monitorexit
    //   300: aload 4
    //   302: athrow
    //   303: astore 4
    //   305: ldc 2
    //   307: monitorexit
    //   308: aload 4
    //   310: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   50	112	0	i	int
    //   48	83	1	j	int
    //   32	103	2	k	int
    //   153	2	3	bool	boolean
    //   60	156	4	localObject1	Object
    //   225	1	4	localObject2	Object
    //   233	68	4	localObject3	Object
    //   303	6	4	localObject4	Object
    //   37	150	5	localObject5	Object
    //   211	1	5	localSecurityException1	SecurityException
    //   220	1	5	localSecurityException2	SecurityException
    //   230	6	5	localSecurityException3	SecurityException
    //   243	36	5	str	String
    //   12	283	6	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   193	204	211	java/lang/SecurityException
    //   179	193	220	java/lang/SecurityException
    //   27	47	225	finally
    //   62	75	225	finally
    //   96	110	225	finally
    //   110	130	225	finally
    //   143	154	225	finally
    //   179	193	225	finally
    //   193	204	225	finally
    //   235	262	225	finally
    //   265	276	225	finally
    //   276	284	225	finally
    //   288	291	225	finally
    //   297	300	225	finally
    //   27	47	230	java/lang/SecurityException
    //   62	75	230	java/lang/SecurityException
    //   96	110	230	java/lang/SecurityException
    //   110	130	230	java/lang/SecurityException
    //   143	154	230	java/lang/SecurityException
    //   3	14	303	finally
    //   24	27	303	finally
    //   300	303	303	finally
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\dynamite\zzb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */