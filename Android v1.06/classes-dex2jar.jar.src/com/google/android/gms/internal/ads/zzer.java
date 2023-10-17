package com.google.android.gms.internal.ads;

import android.util.Log;
import org.checkerframework.dataflow.qual.Pure;

public final class zzer
{
  private static final Object zza = new Object();
  private static final zzeq zzb = zzeq.zza;
  
  @Pure
  public static void zza(String paramString1, String paramString2)
  {
    synchronized (zza)
    {
      Log.d(paramString1, paramString2);
      return;
    }
  }
  
  @Pure
  public static void zzb(String paramString1, String paramString2)
  {
    synchronized (zza)
    {
      Log.e(paramString1, paramString2);
      return;
    }
  }
  
  @Pure
  public static void zzc(String paramString1, String paramString2, Throwable paramThrowable)
  {
    zzb(paramString1, zzg(paramString2, paramThrowable));
  }
  
  @Pure
  public static void zzd(String paramString1, String paramString2)
  {
    synchronized (zza)
    {
      Log.i(paramString1, paramString2);
      return;
    }
  }
  
  @Pure
  public static void zze(String paramString1, String paramString2)
  {
    synchronized (zza)
    {
      Log.w(paramString1, paramString2);
      return;
    }
  }
  
  @Pure
  public static void zzf(String paramString1, String paramString2, Throwable paramThrowable)
  {
    zze(paramString1, zzg(paramString2, paramThrowable));
  }
  
  /* Error */
  @Pure
  private static String zzg(String paramString, Throwable paramThrowable)
  {
    // Byte code:
    //   0: getstatic 15	com/google/android/gms/internal/ads/zzer:zza	Ljava/lang/Object;
    //   3: astore_3
    //   4: aload_3
    //   5: monitorenter
    //   6: aload_1
    //   7: ifnonnull +14 -> 21
    //   10: aload_3
    //   11: monitorexit
    //   12: aconst_null
    //   13: astore_1
    //   14: goto +53 -> 67
    //   17: astore_0
    //   18: goto +108 -> 126
    //   21: aload_1
    //   22: astore_2
    //   23: aload_2
    //   24: ifnull +26 -> 50
    //   27: aload_2
    //   28: instanceof 55
    //   31: ifeq +11 -> 42
    //   34: ldc 57
    //   36: astore_1
    //   37: aload_3
    //   38: monitorexit
    //   39: goto +28 -> 67
    //   42: aload_2
    //   43: invokevirtual 63	java/lang/Throwable:getCause	()Ljava/lang/Throwable;
    //   46: astore_2
    //   47: goto -24 -> 23
    //   50: aload_1
    //   51: invokestatic 67	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   54: invokevirtual 73	java/lang/String:trim	()Ljava/lang/String;
    //   57: ldc 75
    //   59: ldc 77
    //   61: invokevirtual 81	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   64: astore_1
    //   65: aload_3
    //   66: monitorexit
    //   67: aload_0
    //   68: astore_2
    //   69: aload_1
    //   70: invokestatic 87	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   73: ifne +51 -> 124
    //   76: aload_1
    //   77: ldc 89
    //   79: ldc 91
    //   81: invokevirtual 81	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   84: astore_1
    //   85: new 93	java/lang/StringBuilder
    //   88: dup
    //   89: invokespecial 94	java/lang/StringBuilder:<init>	()V
    //   92: astore_2
    //   93: aload_2
    //   94: aload_0
    //   95: invokevirtual 98	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   98: pop
    //   99: aload_2
    //   100: ldc 91
    //   102: invokevirtual 98	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   105: pop
    //   106: aload_2
    //   107: aload_1
    //   108: invokevirtual 98	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   111: pop
    //   112: aload_2
    //   113: ldc 89
    //   115: invokevirtual 98	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   118: pop
    //   119: aload_2
    //   120: invokevirtual 101	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   123: astore_2
    //   124: aload_2
    //   125: areturn
    //   126: aload_3
    //   127: monitorexit
    //   128: aload_0
    //   129: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	130	0	paramString	String
    //   0	130	1	paramThrowable	Throwable
    //   22	103	2	localObject1	Object
    //   3	124	3	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   10	12	17	finally
    //   27	34	17	finally
    //   37	39	17	finally
    //   42	47	17	finally
    //   50	67	17	finally
    //   126	128	17	finally
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */