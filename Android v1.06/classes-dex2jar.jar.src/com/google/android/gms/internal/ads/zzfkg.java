package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.View;
import java.util.Map;

final class zzfkg
  implements zzfiw
{
  private final Object zza;
  private final zzfkh zzb;
  private final zzfks zzc;
  private final zzfit zzd;
  
  zzfkg(Object paramObject, zzfkh paramzzfkh, zzfks paramzzfks, zzfit paramzzfit)
  {
    this.zza = paramObject;
    this.zzb = paramzzfkh;
    this.zzc = paramzzfks;
    this.zzd = paramzzfit;
  }
  
  private static String zzi(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    zzaox localzzaox = zzaoy.zza();
    localzzaox.zzc(5);
    localzzaox.zza(zzgno.zzv(paramArrayOfByte, 0, paramArrayOfByte.length));
    return Base64.encodeToString(((zzaoy)localzzaox.zzal()).zzax(), 11);
  }
  
  /* Error */
  private final byte[] zzj(Map paramMap1, Map paramMap2)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic 77	java/lang/System:currentTimeMillis	()J
    //   5: lstore_3
    //   6: aload_0
    //   7: getfield 21	com/google/android/gms/internal/ads/zzfkg:zza	Ljava/lang/Object;
    //   10: invokevirtual 81	java/lang/Object:getClass	()Ljava/lang/Class;
    //   13: ldc 83
    //   15: iconst_2
    //   16: anewarray 85	java/lang/Class
    //   19: dup
    //   20: iconst_0
    //   21: ldc 87
    //   23: aastore
    //   24: dup
    //   25: iconst_1
    //   26: ldc 87
    //   28: aastore
    //   29: invokevirtual 91	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   32: aload_0
    //   33: getfield 21	com/google/android/gms/internal/ads/zzfkg:zza	Ljava/lang/Object;
    //   36: iconst_2
    //   37: anewarray 4	java/lang/Object
    //   40: dup
    //   41: iconst_0
    //   42: aconst_null
    //   43: aastore
    //   44: dup
    //   45: iconst_1
    //   46: aload_2
    //   47: aastore
    //   48: invokevirtual 97	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   51: checkcast 99	[B
    //   54: astore_1
    //   55: aload_0
    //   56: monitorexit
    //   57: aload_1
    //   58: areturn
    //   59: astore_1
    //   60: aload_0
    //   61: getfield 27	com/google/android/gms/internal/ads/zzfkg:zzd	Lcom/google/android/gms/internal/ads/zzfit;
    //   64: sipush 2007
    //   67: invokestatic 77	java/lang/System:currentTimeMillis	()J
    //   70: lload_3
    //   71: lsub
    //   72: aload_1
    //   73: invokevirtual 104	com/google/android/gms/internal/ads/zzfit:zzc	(IJLjava/lang/Exception;)Lcom/google/android/gms/tasks/Task;
    //   76: pop
    //   77: aload_0
    //   78: monitorexit
    //   79: aconst_null
    //   80: areturn
    //   81: astore_1
    //   82: aload_0
    //   83: monitorexit
    //   84: aload_1
    //   85: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	86	0	this	zzfkg
    //   0	86	1	paramMap1	Map
    //   0	86	2	paramMap2	Map
    //   5	66	3	l	long
    // Exception table:
    //   from	to	target	type
    //   6	55	59	java/lang/Exception
    //   2	6	81	finally
    //   6	55	81	finally
    //   60	77	81	finally
  }
  
  public final String zza(Context paramContext, String paramString1, String paramString2, View paramView, Activity paramActivity)
  {
    try
    {
      paramString1 = this.zzc.zza();
      paramString1.put("f", "c");
      paramString1.put("ctx", paramContext);
      paramString1.put("cs", paramString2);
      paramString1.put("aid", null);
      paramString1.put("view", paramView);
      paramString1.put("act", paramActivity);
      paramContext = zzi(zzj(null, paramString1));
      return paramContext;
    }
    finally
    {
      paramContext = finally;
      throw paramContext;
    }
  }
  
  public final String zzb(Context paramContext, String paramString, View paramView, Activity paramActivity)
  {
    try
    {
      paramString = this.zzc.zzc();
      paramString.put("f", "v");
      paramString.put("ctx", paramContext);
      paramString.put("aid", null);
      paramString.put("view", paramView);
      paramString.put("act", paramActivity);
      paramContext = zzi(zzj(null, paramString));
      return paramContext;
    }
    finally
    {
      paramContext = finally;
      throw paramContext;
    }
  }
  
  public final String zzc(Context paramContext, String paramString)
  {
    try
    {
      paramString = this.zzc.zzb();
      paramString.put("f", "q");
      paramString.put("ctx", paramContext);
      paramString.put("aid", null);
      paramContext = zzi(zzj(null, paramString));
      return paramContext;
    }
    finally
    {
      paramContext = finally;
      throw paramContext;
    }
  }
  
  /* Error */
  public final void zzd(String paramString, android.view.MotionEvent paramMotionEvent)
    throws zzfkq
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic 77	java/lang/System:currentTimeMillis	()J
    //   5: lstore_3
    //   6: new 147	java/util/HashMap
    //   9: astore 5
    //   11: aload 5
    //   13: invokespecial 148	java/util/HashMap:<init>	()V
    //   16: new 150	java/lang/Throwable
    //   19: astore_1
    //   20: aload_1
    //   21: invokespecial 151	java/lang/Throwable:<init>	()V
    //   24: aload 5
    //   26: ldc -103
    //   28: aload_1
    //   29: invokeinterface 118 3 0
    //   34: pop
    //   35: aload 5
    //   37: ldc 124
    //   39: aconst_null
    //   40: invokeinterface 118 3 0
    //   45: pop
    //   46: aload 5
    //   48: ldc -101
    //   50: aload_2
    //   51: invokeinterface 118 3 0
    //   56: pop
    //   57: aload_0
    //   58: getfield 21	com/google/android/gms/internal/ads/zzfkg:zza	Ljava/lang/Object;
    //   61: invokevirtual 81	java/lang/Object:getClass	()Ljava/lang/Class;
    //   64: ldc -99
    //   66: iconst_1
    //   67: anewarray 85	java/lang/Class
    //   70: dup
    //   71: iconst_0
    //   72: ldc 87
    //   74: aastore
    //   75: invokevirtual 91	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   78: aload_0
    //   79: getfield 21	com/google/android/gms/internal/ads/zzfkg:zza	Ljava/lang/Object;
    //   82: iconst_1
    //   83: anewarray 4	java/lang/Object
    //   86: dup
    //   87: iconst_0
    //   88: aload 5
    //   90: aastore
    //   91: invokevirtual 97	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   94: pop
    //   95: aload_0
    //   96: getfield 27	com/google/android/gms/internal/ads/zzfkg:zzd	Lcom/google/android/gms/internal/ads/zzfit;
    //   99: sipush 3003
    //   102: invokestatic 77	java/lang/System:currentTimeMillis	()J
    //   105: lload_3
    //   106: lsub
    //   107: invokevirtual 160	com/google/android/gms/internal/ads/zzfit:zzd	(IJ)Lcom/google/android/gms/tasks/Task;
    //   110: pop
    //   111: aload_0
    //   112: monitorexit
    //   113: return
    //   114: astore_1
    //   115: goto +18 -> 133
    //   118: astore_2
    //   119: new 145	com/google/android/gms/internal/ads/zzfkq
    //   122: astore_1
    //   123: aload_1
    //   124: sipush 2005
    //   127: aload_2
    //   128: invokespecial 163	com/google/android/gms/internal/ads/zzfkq:<init>	(ILjava/lang/Throwable;)V
    //   131: aload_1
    //   132: athrow
    //   133: aload_0
    //   134: monitorexit
    //   135: aload_1
    //   136: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	137	0	this	zzfkg
    //   0	137	1	paramString	String
    //   0	137	2	paramMotionEvent	android.view.MotionEvent
    //   5	101	3	l	long
    //   9	80	5	localHashMap	java.util.HashMap
    // Exception table:
    //   from	to	target	type
    //   2	111	114	finally
    //   119	133	114	finally
    //   2	111	118	java/lang/Exception
  }
  
  /* Error */
  public final int zze()
    throws zzfkq
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 21	com/google/android/gms/internal/ads/zzfkg:zza	Ljava/lang/Object;
    //   6: invokevirtual 81	java/lang/Object:getClass	()Ljava/lang/Class;
    //   9: ldc -88
    //   11: iconst_0
    //   12: anewarray 85	java/lang/Class
    //   15: invokevirtual 91	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   18: aload_0
    //   19: getfield 21	com/google/android/gms/internal/ads/zzfkg:zza	Ljava/lang/Object;
    //   22: iconst_0
    //   23: anewarray 4	java/lang/Object
    //   26: invokevirtual 97	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   29: checkcast 170	java/lang/Integer
    //   32: invokevirtual 173	java/lang/Integer:intValue	()I
    //   35: istore_1
    //   36: aload_0
    //   37: monitorexit
    //   38: iload_1
    //   39: ireturn
    //   40: astore_2
    //   41: goto +18 -> 59
    //   44: astore_2
    //   45: new 145	com/google/android/gms/internal/ads/zzfkq
    //   48: astore_3
    //   49: aload_3
    //   50: sipush 2006
    //   53: aload_2
    //   54: invokespecial 163	com/google/android/gms/internal/ads/zzfkq:<init>	(ILjava/lang/Throwable;)V
    //   57: aload_3
    //   58: athrow
    //   59: aload_0
    //   60: monitorexit
    //   61: aload_2
    //   62: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	63	0	this	zzfkg
    //   35	4	1	i	int
    //   40	1	2	localObject	Object
    //   44	18	2	localException	Exception
    //   48	10	3	localzzfkq	zzfkq
    // Exception table:
    //   from	to	target	type
    //   2	36	40	finally
    //   45	59	40	finally
    //   2	36	44	java/lang/Exception
  }
  
  final zzfkh zzf()
  {
    return this.zzb;
  }
  
  /* Error */
  public final void zzg()
    throws zzfkq
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic 77	java/lang/System:currentTimeMillis	()J
    //   5: lstore_1
    //   6: aload_0
    //   7: getfield 21	com/google/android/gms/internal/ads/zzfkg:zza	Ljava/lang/Object;
    //   10: invokevirtual 81	java/lang/Object:getClass	()Ljava/lang/Class;
    //   13: ldc -78
    //   15: iconst_0
    //   16: anewarray 85	java/lang/Class
    //   19: invokevirtual 91	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   22: aload_0
    //   23: getfield 21	com/google/android/gms/internal/ads/zzfkg:zza	Ljava/lang/Object;
    //   26: iconst_0
    //   27: anewarray 4	java/lang/Object
    //   30: invokevirtual 97	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   33: pop
    //   34: aload_0
    //   35: getfield 27	com/google/android/gms/internal/ads/zzfkg:zzd	Lcom/google/android/gms/internal/ads/zzfit;
    //   38: sipush 3001
    //   41: invokestatic 77	java/lang/System:currentTimeMillis	()J
    //   44: lload_1
    //   45: lsub
    //   46: invokevirtual 160	com/google/android/gms/internal/ads/zzfit:zzd	(IJ)Lcom/google/android/gms/tasks/Task;
    //   49: pop
    //   50: aload_0
    //   51: monitorexit
    //   52: return
    //   53: astore_3
    //   54: goto +21 -> 75
    //   57: astore_3
    //   58: new 145	com/google/android/gms/internal/ads/zzfkq
    //   61: astore 4
    //   63: aload 4
    //   65: sipush 2003
    //   68: aload_3
    //   69: invokespecial 163	com/google/android/gms/internal/ads/zzfkq:<init>	(ILjava/lang/Throwable;)V
    //   72: aload 4
    //   74: athrow
    //   75: aload_0
    //   76: monitorexit
    //   77: aload_3
    //   78: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	79	0	this	zzfkg
    //   5	40	1	l	long
    //   53	1	3	localObject	Object
    //   57	21	3	localException	Exception
    //   61	12	4	localzzfkq	zzfkq
    // Exception table:
    //   from	to	target	type
    //   2	50	53	finally
    //   58	75	53	finally
    //   2	50	57	java/lang/Exception
  }
  
  /* Error */
  final boolean zzh()
    throws zzfkq
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 21	com/google/android/gms/internal/ads/zzfkg:zza	Ljava/lang/Object;
    //   6: invokevirtual 81	java/lang/Object:getClass	()Ljava/lang/Class;
    //   9: ldc -74
    //   11: iconst_0
    //   12: anewarray 85	java/lang/Class
    //   15: invokevirtual 91	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   18: aload_0
    //   19: getfield 21	com/google/android/gms/internal/ads/zzfkg:zza	Ljava/lang/Object;
    //   22: iconst_0
    //   23: anewarray 4	java/lang/Object
    //   26: invokevirtual 97	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   29: checkcast 184	java/lang/Boolean
    //   32: invokevirtual 187	java/lang/Boolean:booleanValue	()Z
    //   35: istore_1
    //   36: aload_0
    //   37: monitorexit
    //   38: iload_1
    //   39: ireturn
    //   40: astore_2
    //   41: goto +18 -> 59
    //   44: astore_2
    //   45: new 145	com/google/android/gms/internal/ads/zzfkq
    //   48: astore_3
    //   49: aload_3
    //   50: sipush 2001
    //   53: aload_2
    //   54: invokespecial 163	com/google/android/gms/internal/ads/zzfkq:<init>	(ILjava/lang/Throwable;)V
    //   57: aload_3
    //   58: athrow
    //   59: aload_0
    //   60: monitorexit
    //   61: aload_2
    //   62: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	63	0	this	zzfkg
    //   35	4	1	bool	boolean
    //   40	1	2	localObject	Object
    //   44	18	2	localException	Exception
    //   48	10	3	localzzfkq	zzfkq
    // Exception table:
    //   from	to	target	type
    //   2	36	40	finally
    //   45	59	40	finally
    //   2	36	44	java/lang/Exception
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfkg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */