package com.unity3d.player;

class G
  implements Thread.UncaughtExceptionHandler
{
  private volatile Thread.UncaughtExceptionHandler a;
  private String b;
  
  static void a(String paramString)
  {
    Object localObject = Thread.getDefaultUncaughtExceptionHandler();
    if ((localObject instanceof G))
    {
      localObject = (G)localObject;
      int i = -1;
      int j = -1;
      for (;;)
      {
        int k = paramString.indexOf('/', i + 1);
        if (k == -1)
        {
          if (j < 0) {
            paramString = "Unknown";
          } else {
            paramString = paramString.substring(j + 1);
          }
          ((G)localObject).b = paramString;
          break;
        }
        j = i;
        i = k;
      }
    }
  }
  
  /* Error */
  boolean a()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic 22	java/lang/Thread:getDefaultUncaughtExceptionHandler	()Ljava/lang/Thread$UncaughtExceptionHandler;
    //   5: astore_2
    //   6: aload_2
    //   7: aload_0
    //   8: if_acmpne +9 -> 17
    //   11: iconst_0
    //   12: istore_1
    //   13: aload_0
    //   14: monitorexit
    //   15: iload_1
    //   16: ireturn
    //   17: aload_0
    //   18: aload_2
    //   19: putfield 39	com/unity3d/player/G:a	Ljava/lang/Thread$UncaughtExceptionHandler;
    //   22: aload_0
    //   23: ldc 30
    //   25: putfield 36	com/unity3d/player/G:b	Ljava/lang/String;
    //   28: aload_0
    //   29: invokestatic 43	java/lang/Thread:setDefaultUncaughtExceptionHandler	(Ljava/lang/Thread$UncaughtExceptionHandler;)V
    //   32: iconst_1
    //   33: istore_1
    //   34: goto -21 -> 13
    //   37: astore_2
    //   38: aload_0
    //   39: monitorexit
    //   40: aload_2
    //   41: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	42	0	this	G
    //   12	22	1	bool	boolean
    //   5	14	2	localUncaughtExceptionHandler	Thread.UncaughtExceptionHandler
    //   37	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	6	37	finally
    //   17	32	37	finally
  }
  
  /* Error */
  public void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new 47	java/lang/Error
    //   5: astore 4
    //   7: new 49	java/lang/StringBuilder
    //   10: astore_3
    //   11: aload_3
    //   12: invokespecial 50	java/lang/StringBuilder:<init>	()V
    //   15: aload_3
    //   16: ldc 52
    //   18: iconst_1
    //   19: anewarray 4	java/lang/Object
    //   22: dup
    //   23: iconst_0
    //   24: aload_1
    //   25: invokevirtual 56	java/lang/Thread:getName	()Ljava/lang/String;
    //   28: aastore
    //   29: invokestatic 60	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   32: invokevirtual 64	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   35: pop
    //   36: aload_3
    //   37: ldc 66
    //   39: iconst_1
    //   40: anewarray 4	java/lang/Object
    //   43: dup
    //   44: iconst_0
    //   45: ldc 68
    //   47: aastore
    //   48: invokestatic 60	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   51: invokevirtual 64	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   54: pop
    //   55: aload_3
    //   56: ldc 70
    //   58: iconst_2
    //   59: anewarray 4	java/lang/Object
    //   62: dup
    //   63: iconst_0
    //   64: getstatic 75	android/os/Build:MANUFACTURER	Ljava/lang/String;
    //   67: aastore
    //   68: dup
    //   69: iconst_1
    //   70: getstatic 78	android/os/Build:MODEL	Ljava/lang/String;
    //   73: aastore
    //   74: invokestatic 60	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   77: invokevirtual 64	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   80: pop
    //   81: aload_3
    //   82: ldc 80
    //   84: iconst_1
    //   85: anewarray 4	java/lang/Object
    //   88: dup
    //   89: iconst_0
    //   90: getstatic 83	android/os/Build:FINGERPRINT	Ljava/lang/String;
    //   93: aastore
    //   94: invokestatic 60	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   97: invokevirtual 64	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   100: pop
    //   101: aload_3
    //   102: ldc 85
    //   104: iconst_1
    //   105: anewarray 4	java/lang/Object
    //   108: dup
    //   109: iconst_0
    //   110: getstatic 89	android/os/Build:SUPPORTED_ABIS	[Ljava/lang/String;
    //   113: invokestatic 95	java/util/Arrays:toString	([Ljava/lang/Object;)Ljava/lang/String;
    //   116: aastore
    //   117: invokestatic 60	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   120: invokevirtual 64	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   123: pop
    //   124: aload_3
    //   125: ldc 97
    //   127: iconst_1
    //   128: anewarray 4	java/lang/Object
    //   131: dup
    //   132: iconst_0
    //   133: ldc 99
    //   135: aastore
    //   136: invokestatic 60	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   139: invokevirtual 64	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   142: pop
    //   143: aload_3
    //   144: ldc 101
    //   146: iconst_1
    //   147: anewarray 4	java/lang/Object
    //   150: dup
    //   151: iconst_0
    //   152: ldc 103
    //   154: aastore
    //   155: invokestatic 60	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   158: invokevirtual 64	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   161: pop
    //   162: aload_3
    //   163: ldc 105
    //   165: iconst_1
    //   166: anewarray 4	java/lang/Object
    //   169: dup
    //   170: iconst_0
    //   171: aload_0
    //   172: getfield 36	com/unity3d/player/G:b	Ljava/lang/String;
    //   175: aastore
    //   176: invokestatic 60	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   179: invokevirtual 64	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   182: pop
    //   183: aload_3
    //   184: ldc 107
    //   186: iconst_1
    //   187: anewarray 4	java/lang/Object
    //   190: dup
    //   191: iconst_0
    //   192: getstatic 113	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   195: aastore
    //   196: invokestatic 60	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   199: invokevirtual 64	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   202: pop
    //   203: aload 4
    //   205: aload_3
    //   206: invokevirtual 115	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   209: invokespecial 117	java/lang/Error:<init>	(Ljava/lang/String;)V
    //   212: aload 4
    //   214: iconst_0
    //   215: anewarray 119	java/lang/StackTraceElement
    //   218: invokevirtual 123	java/lang/Error:setStackTrace	([Ljava/lang/StackTraceElement;)V
    //   221: aload 4
    //   223: aload_2
    //   224: invokevirtual 127	java/lang/Error:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   227: pop
    //   228: aload_0
    //   229: getfield 39	com/unity3d/player/G:a	Ljava/lang/Thread$UncaughtExceptionHandler;
    //   232: aload_1
    //   233: aload 4
    //   235: invokeinterface 129 3 0
    //   240: goto +15 -> 255
    //   243: astore_3
    //   244: aload_0
    //   245: getfield 39	com/unity3d/player/G:a	Ljava/lang/Thread$UncaughtExceptionHandler;
    //   248: aload_1
    //   249: aload_2
    //   250: invokeinterface 129 3 0
    //   255: aload_0
    //   256: monitorexit
    //   257: return
    //   258: astore_1
    //   259: aload_0
    //   260: monitorexit
    //   261: aload_1
    //   262: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	263	0	this	G
    //   0	263	1	paramThread	Thread
    //   0	263	2	paramThrowable	Throwable
    //   10	196	3	localStringBuilder	StringBuilder
    //   243	1	3	localObject	Object
    //   5	229	4	localError	Error
    // Exception table:
    //   from	to	target	type
    //   2	240	243	finally
    //   244	255	258	finally
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\co\\unity3d\player\G.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */