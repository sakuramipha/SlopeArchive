package androidx.work;

import android.content.Context;

public abstract class WorkerFactory
{
  private static final String TAG = Logger.tagWithPrefix("WorkerFactory");
  
  public static WorkerFactory getDefaultWorkerFactory()
  {
    new WorkerFactory()
    {
      public ListenableWorker createWorker(Context paramAnonymousContext, String paramAnonymousString, WorkerParameters paramAnonymousWorkerParameters)
      {
        return null;
      }
    };
  }
  
  public abstract ListenableWorker createWorker(Context paramContext, String paramString, WorkerParameters paramWorkerParameters);
  
  /* Error */
  public final ListenableWorker createWorkerWithDefaultFallback(Context paramContext, String paramString, WorkerParameters paramWorkerParameters)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: aload_3
    //   4: invokevirtual 32	androidx/work/WorkerFactory:createWorker	(Landroid/content/Context;Ljava/lang/String;Landroidx/work/WorkerParameters;)Landroidx/work/ListenableWorker;
    //   7: astore 6
    //   9: aload 6
    //   11: astore 5
    //   13: aload 6
    //   15: ifnonnull +189 -> 204
    //   18: aconst_null
    //   19: astore 4
    //   21: aload_2
    //   22: invokestatic 38	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   25: ldc 40
    //   27: invokevirtual 44	java/lang/Class:asSubclass	(Ljava/lang/Class;)Ljava/lang/Class;
    //   30: astore 5
    //   32: aload 5
    //   34: astore 4
    //   36: goto +60 -> 96
    //   39: astore 7
    //   41: invokestatic 48	androidx/work/Logger:get	()Landroidx/work/Logger;
    //   44: astore 9
    //   46: getstatic 20	androidx/work/WorkerFactory:TAG	Ljava/lang/String;
    //   49: astore 5
    //   51: new 50	java/lang/StringBuilder
    //   54: dup
    //   55: invokespecial 51	java/lang/StringBuilder:<init>	()V
    //   58: astore 8
    //   60: aload 8
    //   62: ldc 53
    //   64: invokevirtual 57	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   67: pop
    //   68: aload 8
    //   70: aload_2
    //   71: invokevirtual 57	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   74: pop
    //   75: aload 9
    //   77: aload 5
    //   79: aload 8
    //   81: invokevirtual 61	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   84: iconst_1
    //   85: anewarray 63	java/lang/Throwable
    //   88: dup
    //   89: iconst_0
    //   90: aload 7
    //   92: aastore
    //   93: invokevirtual 67	androidx/work/Logger:error	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
    //   96: aload 6
    //   98: astore 5
    //   100: aload 4
    //   102: ifnull +102 -> 204
    //   105: aload 4
    //   107: iconst_2
    //   108: anewarray 34	java/lang/Class
    //   111: dup
    //   112: iconst_0
    //   113: ldc 69
    //   115: aastore
    //   116: dup
    //   117: iconst_1
    //   118: ldc 71
    //   120: aastore
    //   121: invokevirtual 75	java/lang/Class:getDeclaredConstructor	([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   124: iconst_2
    //   125: anewarray 4	java/lang/Object
    //   128: dup
    //   129: iconst_0
    //   130: aload_1
    //   131: aastore
    //   132: dup
    //   133: iconst_1
    //   134: aload_3
    //   135: aastore
    //   136: invokevirtual 81	java/lang/reflect/Constructor:newInstance	([Ljava/lang/Object;)Ljava/lang/Object;
    //   139: checkcast 40	androidx/work/ListenableWorker
    //   142: astore 5
    //   144: goto +60 -> 204
    //   147: astore 4
    //   149: invokestatic 48	androidx/work/Logger:get	()Landroidx/work/Logger;
    //   152: astore_3
    //   153: getstatic 20	androidx/work/WorkerFactory:TAG	Ljava/lang/String;
    //   156: astore_1
    //   157: new 50	java/lang/StringBuilder
    //   160: dup
    //   161: invokespecial 51	java/lang/StringBuilder:<init>	()V
    //   164: astore 5
    //   166: aload 5
    //   168: ldc 83
    //   170: invokevirtual 57	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   173: pop
    //   174: aload 5
    //   176: aload_2
    //   177: invokevirtual 57	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   180: pop
    //   181: aload_3
    //   182: aload_1
    //   183: aload 5
    //   185: invokevirtual 61	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   188: iconst_1
    //   189: anewarray 63	java/lang/Throwable
    //   192: dup
    //   193: iconst_0
    //   194: aload 4
    //   196: aastore
    //   197: invokevirtual 67	androidx/work/Logger:error	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
    //   200: aload 6
    //   202: astore 5
    //   204: aload 5
    //   206: ifnull +45 -> 251
    //   209: aload 5
    //   211: invokevirtual 87	androidx/work/ListenableWorker:isUsed	()Z
    //   214: ifne +6 -> 220
    //   217: goto +34 -> 251
    //   220: new 89	java/lang/IllegalStateException
    //   223: dup
    //   224: ldc 91
    //   226: iconst_2
    //   227: anewarray 4	java/lang/Object
    //   230: dup
    //   231: iconst_0
    //   232: aload_0
    //   233: invokevirtual 95	java/lang/Object:getClass	()Ljava/lang/Class;
    //   236: invokevirtual 98	java/lang/Class:getName	()Ljava/lang/String;
    //   239: aastore
    //   240: dup
    //   241: iconst_1
    //   242: aload_2
    //   243: aastore
    //   244: invokestatic 104	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   247: invokespecial 107	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   250: athrow
    //   251: aload 5
    //   253: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	254	0	this	WorkerFactory
    //   0	254	1	paramContext	Context
    //   0	254	2	paramString	String
    //   0	254	3	paramWorkerParameters	WorkerParameters
    //   19	87	4	localObject1	Object
    //   147	48	4	localObject2	Object
    //   11	241	5	localObject3	Object
    //   7	194	6	localListenableWorker	ListenableWorker
    //   39	52	7	localObject4	Object
    //   58	22	8	localStringBuilder	StringBuilder
    //   44	32	9	localLogger	Logger
    // Exception table:
    //   from	to	target	type
    //   21	32	39	finally
    //   105	144	147	finally
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\WorkerFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */