package com.google.android.gms.common.internal;

import java.util.concurrent.ConcurrentHashMap;

public class LibraryVersion
{
  private static final GmsLogger zza = new GmsLogger("LibraryVersion", "");
  private static LibraryVersion zzb = new LibraryVersion();
  private ConcurrentHashMap<String, String> zzc = new ConcurrentHashMap();
  
  public static LibraryVersion getInstance()
  {
    return zzb;
  }
  
  /* Error */
  public String getVersion(String paramString)
  {
    // Byte code:
    //   0: aload_1
    //   1: ldc 44
    //   3: invokestatic 50	com/google/android/gms/common/internal/Preconditions:checkNotEmpty	(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    //   6: pop
    //   7: aload_0
    //   8: getfield 36	com/google/android/gms/common/internal/LibraryVersion:zzc	Ljava/util/concurrent/ConcurrentHashMap;
    //   11: aload_1
    //   12: invokevirtual 54	java/util/concurrent/ConcurrentHashMap:containsKey	(Ljava/lang/Object;)Z
    //   15: ifeq +15 -> 30
    //   18: aload_0
    //   19: getfield 36	com/google/android/gms/common/internal/LibraryVersion:zzc	Ljava/util/concurrent/ConcurrentHashMap;
    //   22: aload_1
    //   23: invokevirtual 58	java/util/concurrent/ConcurrentHashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   26: checkcast 60	java/lang/String
    //   29: areturn
    //   30: new 62	java/util/Properties
    //   33: dup
    //   34: invokespecial 63	java/util/Properties:<init>	()V
    //   37: astore 9
    //   39: aconst_null
    //   40: astore 7
    //   42: aconst_null
    //   43: astore 4
    //   45: aconst_null
    //   46: astore 5
    //   48: aconst_null
    //   49: astore 8
    //   51: ldc 2
    //   53: ldc 65
    //   55: iconst_1
    //   56: anewarray 4	java/lang/Object
    //   59: dup
    //   60: iconst_0
    //   61: aload_1
    //   62: aastore
    //   63: invokestatic 69	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   66: invokevirtual 75	java/lang/Class:getResourceAsStream	(Ljava/lang/String;)Ljava/io/InputStream;
    //   69: astore 6
    //   71: aload 6
    //   73: ifnull +140 -> 213
    //   76: aload 7
    //   78: astore 4
    //   80: aload 9
    //   82: aload 6
    //   84: invokevirtual 79	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   87: aload 7
    //   89: astore 4
    //   91: aload 9
    //   93: ldc 81
    //   95: aconst_null
    //   96: invokevirtual 85	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   99: astore 5
    //   101: aload 5
    //   103: astore 4
    //   105: getstatic 25	com/google/android/gms/common/internal/LibraryVersion:zza	Lcom/google/android/gms/common/internal/GmsLogger;
    //   108: astore 7
    //   110: aload 5
    //   112: astore 4
    //   114: aload_1
    //   115: invokestatic 89	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   118: invokevirtual 93	java/lang/String:length	()I
    //   121: istore_2
    //   122: aload 5
    //   124: astore 4
    //   126: aload 5
    //   128: invokestatic 89	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   131: invokevirtual 93	java/lang/String:length	()I
    //   134: istore_3
    //   135: aload 5
    //   137: astore 4
    //   139: new 95	java/lang/StringBuilder
    //   142: astore 8
    //   144: aload 5
    //   146: astore 4
    //   148: aload 8
    //   150: iload_2
    //   151: bipush 12
    //   153: iadd
    //   154: iload_3
    //   155: iadd
    //   156: invokespecial 98	java/lang/StringBuilder:<init>	(I)V
    //   159: aload 5
    //   161: astore 4
    //   163: aload 8
    //   165: aload_1
    //   166: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   169: pop
    //   170: aload 5
    //   172: astore 4
    //   174: aload 8
    //   176: ldc 104
    //   178: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   181: pop
    //   182: aload 5
    //   184: astore 4
    //   186: aload 8
    //   188: aload 5
    //   190: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   193: pop
    //   194: aload 5
    //   196: astore 4
    //   198: aload 7
    //   200: ldc 17
    //   202: aload 8
    //   204: invokevirtual 108	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   207: invokevirtual 111	com/google/android/gms/common/internal/GmsLogger:v	(Ljava/lang/String;Ljava/lang/String;)V
    //   210: goto +82 -> 292
    //   213: aload 7
    //   215: astore 4
    //   217: getstatic 25	com/google/android/gms/common/internal/LibraryVersion:zza	Lcom/google/android/gms/common/internal/GmsLogger;
    //   220: astore 9
    //   222: aload 7
    //   224: astore 4
    //   226: aload_1
    //   227: invokestatic 89	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   230: astore 5
    //   232: aload 7
    //   234: astore 4
    //   236: aload 5
    //   238: invokevirtual 93	java/lang/String:length	()I
    //   241: ifeq +19 -> 260
    //   244: aload 7
    //   246: astore 4
    //   248: ldc 113
    //   250: aload 5
    //   252: invokevirtual 116	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   255: astore 5
    //   257: goto +18 -> 275
    //   260: aload 7
    //   262: astore 4
    //   264: new 60	java/lang/String
    //   267: dup
    //   268: ldc 113
    //   270: invokespecial 119	java/lang/String:<init>	(Ljava/lang/String;)V
    //   273: astore 5
    //   275: aload 7
    //   277: astore 4
    //   279: aload 9
    //   281: ldc 17
    //   283: aload 5
    //   285: invokevirtual 122	com/google/android/gms/common/internal/GmsLogger:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   288: aload 8
    //   290: astore 5
    //   292: aload 5
    //   294: astore 4
    //   296: aload 6
    //   298: ifnull +140 -> 438
    //   301: aload 6
    //   303: invokestatic 128	com/google/android/gms/common/util/IOUtils:closeQuietly	(Ljava/io/Closeable;)V
    //   306: aload 5
    //   308: astore 4
    //   310: goto +128 -> 438
    //   313: astore_1
    //   314: aload 6
    //   316: astore 4
    //   318: goto +157 -> 475
    //   321: astore 7
    //   323: aload 4
    //   325: astore 5
    //   327: goto +20 -> 347
    //   330: astore_1
    //   331: goto +144 -> 475
    //   334: astore 7
    //   336: aconst_null
    //   337: astore 4
    //   339: aload 5
    //   341: astore 6
    //   343: aload 4
    //   345: astore 5
    //   347: aload 6
    //   349: astore 4
    //   351: getstatic 25	com/google/android/gms/common/internal/LibraryVersion:zza	Lcom/google/android/gms/common/internal/GmsLogger;
    //   354: astore 9
    //   356: aload 6
    //   358: astore 4
    //   360: aload_1
    //   361: invokestatic 89	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   364: astore 8
    //   366: aload 6
    //   368: astore 4
    //   370: aload 8
    //   372: invokevirtual 93	java/lang/String:length	()I
    //   375: ifeq +19 -> 394
    //   378: aload 6
    //   380: astore 4
    //   382: ldc 113
    //   384: aload 8
    //   386: invokevirtual 116	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   389: astore 8
    //   391: goto +18 -> 409
    //   394: aload 6
    //   396: astore 4
    //   398: new 60	java/lang/String
    //   401: dup
    //   402: ldc 113
    //   404: invokespecial 119	java/lang/String:<init>	(Ljava/lang/String;)V
    //   407: astore 8
    //   409: aload 6
    //   411: astore 4
    //   413: aload 9
    //   415: ldc 17
    //   417: aload 8
    //   419: aload 7
    //   421: invokevirtual 132	com/google/android/gms/common/internal/GmsLogger:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   424: aload 6
    //   426: ifnull +8 -> 434
    //   429: aload 6
    //   431: invokestatic 128	com/google/android/gms/common/util/IOUtils:closeQuietly	(Ljava/io/Closeable;)V
    //   434: aload 5
    //   436: astore 4
    //   438: aload 4
    //   440: astore 5
    //   442: aload 4
    //   444: ifnonnull +17 -> 461
    //   447: getstatic 25	com/google/android/gms/common/internal/LibraryVersion:zza	Lcom/google/android/gms/common/internal/GmsLogger;
    //   450: ldc 17
    //   452: ldc -122
    //   454: invokevirtual 137	com/google/android/gms/common/internal/GmsLogger:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   457: ldc -117
    //   459: astore 5
    //   461: aload_0
    //   462: getfield 36	com/google/android/gms/common/internal/LibraryVersion:zzc	Ljava/util/concurrent/ConcurrentHashMap;
    //   465: aload_1
    //   466: aload 5
    //   468: invokevirtual 143	java/util/concurrent/ConcurrentHashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   471: pop
    //   472: aload 5
    //   474: areturn
    //   475: aload 4
    //   477: ifnull +8 -> 485
    //   480: aload 4
    //   482: invokestatic 128	com/google/android/gms/common/util/IOUtils:closeQuietly	(Ljava/io/Closeable;)V
    //   485: aload_1
    //   486: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	487	0	this	LibraryVersion
    //   0	487	1	paramString	String
    //   121	33	2	i	int
    //   134	22	3	j	int
    //   43	438	4	localObject1	Object
    //   46	427	5	localObject2	Object
    //   69	361	6	localObject3	Object
    //   40	236	7	localGmsLogger	GmsLogger
    //   321	1	7	localIOException1	java.io.IOException
    //   334	86	7	localIOException2	java.io.IOException
    //   49	369	8	localObject4	Object
    //   37	377	9	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   80	87	313	finally
    //   91	101	313	finally
    //   105	110	313	finally
    //   114	122	313	finally
    //   126	135	313	finally
    //   139	144	313	finally
    //   148	159	313	finally
    //   163	170	313	finally
    //   174	182	313	finally
    //   186	194	313	finally
    //   198	210	313	finally
    //   217	222	313	finally
    //   226	232	313	finally
    //   236	244	313	finally
    //   248	257	313	finally
    //   264	275	313	finally
    //   279	288	313	finally
    //   80	87	321	java/io/IOException
    //   91	101	321	java/io/IOException
    //   105	110	321	java/io/IOException
    //   114	122	321	java/io/IOException
    //   126	135	321	java/io/IOException
    //   139	144	321	java/io/IOException
    //   148	159	321	java/io/IOException
    //   163	170	321	java/io/IOException
    //   174	182	321	java/io/IOException
    //   186	194	321	java/io/IOException
    //   198	210	321	java/io/IOException
    //   217	222	321	java/io/IOException
    //   226	232	321	java/io/IOException
    //   236	244	321	java/io/IOException
    //   248	257	321	java/io/IOException
    //   264	275	321	java/io/IOException
    //   279	288	321	java/io/IOException
    //   51	71	330	finally
    //   351	356	330	finally
    //   360	366	330	finally
    //   370	378	330	finally
    //   382	391	330	finally
    //   398	409	330	finally
    //   413	424	330	finally
    //   51	71	334	java/io/IOException
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\LibraryVersion.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */