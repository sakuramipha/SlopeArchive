package com.google.android.gms.common.config;

public abstract class GservicesValue<T>
{
  private static final Object zzc = new Object();
  protected final String zza;
  protected final T zzb;
  private T zzd = null;
  
  protected GservicesValue(String paramString, T paramT)
  {
    this.zza = paramString;
    this.zzb = paramT;
  }
  
  public static boolean isInitialized()
  {
    synchronized (zzc)
    {
      return false;
    }
  }
  
  public static GservicesValue<Float> value(String paramString, Float paramFloat)
  {
    return new zzd(paramString, paramFloat);
  }
  
  public static GservicesValue<Integer> value(String paramString, Integer paramInteger)
  {
    return new zzc(paramString, paramInteger);
  }
  
  public static GservicesValue<Long> value(String paramString, Long paramLong)
  {
    return new zzb(paramString, paramLong);
  }
  
  public static GservicesValue<String> value(String paramString1, String paramString2)
  {
    return new zze(paramString1, paramString2);
  }
  
  public static GservicesValue<Boolean> value(String paramString, boolean paramBoolean)
  {
    return new zza(paramString, Boolean.valueOf(paramBoolean));
  }
  
  /* Error */
  public final T get()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 24	com/google/android/gms/common/config/GservicesValue:zzd	Ljava/lang/Object;
    //   4: astore_3
    //   5: aload_3
    //   6: ifnull +5 -> 11
    //   9: aload_3
    //   10: areturn
    //   11: invokestatic 84	android/os/StrictMode:allowThreadDiskReads	()Landroid/os/StrictMode$ThreadPolicy;
    //   14: astore_3
    //   15: getstatic 19	com/google/android/gms/common/config/GservicesValue:zzc	Ljava/lang/Object;
    //   18: astore 4
    //   20: aload 4
    //   22: monitorenter
    //   23: aload 4
    //   25: monitorexit
    //   26: aload 4
    //   28: monitorenter
    //   29: aload 4
    //   31: monitorexit
    //   32: aload_0
    //   33: aload_0
    //   34: getfield 26	com/google/android/gms/common/config/GservicesValue:zza	Ljava/lang/String;
    //   37: invokevirtual 87	com/google/android/gms/common/config/GservicesValue:zza	(Ljava/lang/String;)Ljava/lang/Object;
    //   40: astore 4
    //   42: aload_3
    //   43: invokestatic 91	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   46: aload 4
    //   48: areturn
    //   49: astore 4
    //   51: goto +39 -> 90
    //   54: astore 4
    //   56: invokestatic 97	android/os/Binder:clearCallingIdentity	()J
    //   59: lstore_1
    //   60: aload_0
    //   61: aload_0
    //   62: getfield 26	com/google/android/gms/common/config/GservicesValue:zza	Ljava/lang/String;
    //   65: invokevirtual 87	com/google/android/gms/common/config/GservicesValue:zza	(Ljava/lang/String;)Ljava/lang/Object;
    //   68: astore 4
    //   70: lload_1
    //   71: invokestatic 101	android/os/Binder:restoreCallingIdentity	(J)V
    //   74: aload_3
    //   75: invokestatic 91	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   78: aload 4
    //   80: areturn
    //   81: astore 4
    //   83: lload_1
    //   84: invokestatic 101	android/os/Binder:restoreCallingIdentity	(J)V
    //   87: aload 4
    //   89: athrow
    //   90: aload_3
    //   91: invokestatic 91	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   94: aload 4
    //   96: athrow
    //   97: astore_3
    //   98: aload 4
    //   100: monitorexit
    //   101: aload_3
    //   102: athrow
    //   103: astore_3
    //   104: aload 4
    //   106: monitorexit
    //   107: aload_3
    //   108: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	109	0	this	GservicesValue
    //   59	25	1	l	long
    //   4	87	3	localObject1	Object
    //   97	5	3	localObject2	Object
    //   103	5	3	localObject3	Object
    //   18	29	4	localObject4	Object
    //   49	1	4	localObject5	Object
    //   54	1	4	localSecurityException	SecurityException
    //   68	11	4	localObject6	Object
    //   81	24	4	localObject7	Object
    // Exception table:
    //   from	to	target	type
    //   32	42	49	finally
    //   56	60	49	finally
    //   70	74	49	finally
    //   83	90	49	finally
    //   32	42	54	java/lang/SecurityException
    //   60	70	81	finally
    //   29	32	97	finally
    //   98	101	97	finally
    //   23	26	103	finally
    //   104	107	103	finally
  }
  
  @Deprecated
  public final T getBinderSafe()
  {
    return (T)get();
  }
  
  /* Error */
  public void override(T paramT)
  {
    // Byte code:
    //   0: ldc 111
    //   2: ldc 113
    //   4: invokestatic 119	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   7: pop
    //   8: aload_0
    //   9: aload_1
    //   10: putfield 24	com/google/android/gms/common/config/GservicesValue:zzd	Ljava/lang/Object;
    //   13: getstatic 19	com/google/android/gms/common/config/GservicesValue:zzc	Ljava/lang/Object;
    //   16: astore_1
    //   17: aload_1
    //   18: monitorenter
    //   19: aload_1
    //   20: monitorenter
    //   21: aload_1
    //   22: monitorexit
    //   23: aload_1
    //   24: monitorexit
    //   25: return
    //   26: astore_2
    //   27: aload_1
    //   28: monitorexit
    //   29: aload_2
    //   30: athrow
    //   31: astore_2
    //   32: aload_1
    //   33: monitorexit
    //   34: aload_2
    //   35: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	36	0	this	GservicesValue
    //   0	36	1	paramT	T
    //   26	4	2	localObject1	Object
    //   31	4	2	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   21	23	26	finally
    //   27	29	26	finally
    //   19	21	31	finally
    //   23	25	31	finally
    //   29	31	31	finally
    //   32	34	31	finally
  }
  
  public void resetOverride()
  {
    this.zzd = null;
  }
  
  protected abstract T zza(String paramString);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\config\GservicesValue.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */