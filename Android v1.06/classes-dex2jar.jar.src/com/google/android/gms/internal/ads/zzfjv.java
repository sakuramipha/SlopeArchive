package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public final class zzfjv
{
  public static boolean zza(int paramInt)
  {
    paramInt--;
    return (paramInt == 2) || (paramInt == 4) || (paramInt == 5) || (paramInt == 6);
  }
  
  /* Error */
  public static final int zzb(Context paramContext, zzfit paramzzfit)
  {
    // Byte code:
    //   0: new 15	java/io/File
    //   3: dup
    //   4: new 15	java/io/File
    //   7: dup
    //   8: aload_0
    //   9: invokevirtual 21	android/content/Context:getApplicationInfo	()Landroid/content/pm/ApplicationInfo;
    //   12: getfield 27	android/content/pm/ApplicationInfo:dataDir	Ljava/lang/String;
    //   15: invokespecial 31	java/io/File:<init>	(Ljava/lang/String;)V
    //   18: ldc 33
    //   20: invokespecial 36	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   23: astore 4
    //   25: aload 4
    //   27: invokevirtual 40	java/io/File:exists	()Z
    //   30: ifne +20 -> 50
    //   33: aload_1
    //   34: sipush 5017
    //   37: ldc 42
    //   39: invokevirtual 47	com/google/android/gms/internal/ads/zzfit:zzb	(ILjava/lang/String;)Lcom/google/android/gms/tasks/Task;
    //   42: pop
    //   43: sipush 1000
    //   46: istore_2
    //   47: goto +289 -> 336
    //   50: aload 4
    //   52: new 49	com/google/android/gms/internal/ads/zzftv
    //   55: dup
    //   56: ldc 51
    //   58: iconst_2
    //   59: invokestatic 57	java/util/regex/Pattern:compile	(Ljava/lang/String;I)Ljava/util/regex/Pattern;
    //   62: invokespecial 60	com/google/android/gms/internal/ads/zzftv:<init>	(Ljava/util/regex/Pattern;)V
    //   65: invokevirtual 64	java/io/File:listFiles	(Ljava/io/FilenameFilter;)[Ljava/io/File;
    //   68: astore 5
    //   70: aload 5
    //   72: ifnull +251 -> 323
    //   75: aload 5
    //   77: arraylength
    //   78: ifne +6 -> 84
    //   81: goto +242 -> 323
    //   84: new 66	java/io/FileInputStream
    //   87: astore 4
    //   89: aload 4
    //   91: aload 5
    //   93: iconst_0
    //   94: aaload
    //   95: invokespecial 69	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   98: bipush 20
    //   100: newarray <illegal type>
    //   102: astore 5
    //   104: aload 4
    //   106: aload 5
    //   108: invokevirtual 73	java/io/FileInputStream:read	([B)I
    //   111: bipush 20
    //   113: if_icmpne +34 -> 147
    //   116: iconst_2
    //   117: newarray <illegal type>
    //   119: astore 6
    //   121: aload 6
    //   123: iconst_0
    //   124: iconst_0
    //   125: bastore
    //   126: aload 6
    //   128: iconst_1
    //   129: iconst_0
    //   130: bastore
    //   131: aload 5
    //   133: iconst_5
    //   134: baload
    //   135: iconst_2
    //   136: if_icmpne +19 -> 155
    //   139: aload 5
    //   141: aconst_null
    //   142: aload_0
    //   143: aload_1
    //   144: invokestatic 77	com/google/android/gms/internal/ads/zzfjv:zzd	([BLjava/lang/String;Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzfit;)V
    //   147: aload 4
    //   149: invokevirtual 81	java/io/FileInputStream:close	()V
    //   152: goto +166 -> 318
    //   155: aload 6
    //   157: iconst_0
    //   158: aload 5
    //   160: bipush 19
    //   162: baload
    //   163: bastore
    //   164: aload 6
    //   166: iconst_1
    //   167: aload 5
    //   169: bipush 18
    //   171: baload
    //   172: bastore
    //   173: aload 6
    //   175: invokestatic 87	java/nio/ByteBuffer:wrap	([B)Ljava/nio/ByteBuffer;
    //   178: invokevirtual 91	java/nio/ByteBuffer:getShort	()S
    //   181: istore_2
    //   182: iload_2
    //   183: iconst_3
    //   184: if_icmpeq +65 -> 249
    //   187: iload_2
    //   188: bipush 40
    //   190: if_icmpeq +49 -> 239
    //   193: iload_2
    //   194: bipush 62
    //   196: if_icmpeq +32 -> 228
    //   199: iload_2
    //   200: sipush 183
    //   203: if_icmpeq +14 -> 217
    //   206: aload 5
    //   208: aconst_null
    //   209: aload_0
    //   210: aload_1
    //   211: invokestatic 77	com/google/android/gms/internal/ads/zzfjv:zzd	([BLjava/lang/String;Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzfit;)V
    //   214: goto -67 -> 147
    //   217: aload 4
    //   219: invokevirtual 81	java/io/FileInputStream:close	()V
    //   222: bipush 6
    //   224: istore_2
    //   225: goto +111 -> 336
    //   228: aload 4
    //   230: invokevirtual 81	java/io/FileInputStream:close	()V
    //   233: bipush 7
    //   235: istore_2
    //   236: goto +100 -> 336
    //   239: aload 4
    //   241: invokevirtual 81	java/io/FileInputStream:close	()V
    //   244: iconst_3
    //   245: istore_2
    //   246: goto +90 -> 336
    //   249: aload 4
    //   251: invokevirtual 81	java/io/FileInputStream:close	()V
    //   254: iconst_5
    //   255: istore_2
    //   256: goto +80 -> 336
    //   259: astore 5
    //   261: aload 4
    //   263: invokevirtual 81	java/io/FileInputStream:close	()V
    //   266: goto +36 -> 302
    //   269: astore 4
    //   271: ldc 93
    //   273: ldc 95
    //   275: iconst_1
    //   276: anewarray 97	java/lang/Class
    //   279: dup
    //   280: iconst_0
    //   281: ldc 93
    //   283: aastore
    //   284: invokevirtual 101	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   287: aload 5
    //   289: iconst_1
    //   290: anewarray 4	java/lang/Object
    //   293: dup
    //   294: iconst_0
    //   295: aload 4
    //   297: aastore
    //   298: invokevirtual 107	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   301: pop
    //   302: aload 5
    //   304: athrow
    //   305: astore 4
    //   307: aconst_null
    //   308: aload 4
    //   310: invokevirtual 111	java/io/IOException:toString	()Ljava/lang/String;
    //   313: aload_0
    //   314: aload_1
    //   315: invokestatic 77	com/google/android/gms/internal/ads/zzfjv:zzd	([BLjava/lang/String;Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzfit;)V
    //   318: iconst_1
    //   319: istore_2
    //   320: goto +16 -> 336
    //   323: aload_1
    //   324: sipush 5017
    //   327: ldc 113
    //   329: invokevirtual 47	com/google/android/gms/internal/ads/zzfit:zzb	(ILjava/lang/String;)Lcom/google/android/gms/tasks/Task;
    //   332: pop
    //   333: goto -290 -> 43
    //   336: iload_2
    //   337: istore_3
    //   338: iload_2
    //   339: sipush 1000
    //   342: if_icmpne +127 -> 469
    //   345: aload_0
    //   346: aload_1
    //   347: invokestatic 117	com/google/android/gms/internal/ads/zzfjv:zzc	(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzfit;)Ljava/lang/String;
    //   350: astore 4
    //   352: aload 4
    //   354: invokestatic 123	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   357: ifeq +16 -> 373
    //   360: aconst_null
    //   361: ldc 125
    //   363: aload_0
    //   364: aload_1
    //   365: invokestatic 77	com/google/android/gms/internal/ads/zzfjv:zzd	([BLjava/lang/String;Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzfit;)V
    //   368: iconst_1
    //   369: istore_3
    //   370: goto +99 -> 469
    //   373: aload 4
    //   375: ldc 127
    //   377: invokevirtual 133	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   380: ifne +87 -> 467
    //   383: aload 4
    //   385: ldc -121
    //   387: invokevirtual 133	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   390: ifeq +6 -> 396
    //   393: goto +74 -> 467
    //   396: aload 4
    //   398: ldc -119
    //   400: invokevirtual 133	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   403: ifeq +9 -> 412
    //   406: bipush 7
    //   408: istore_3
    //   409: goto +60 -> 469
    //   412: aload 4
    //   414: ldc -117
    //   416: invokevirtual 133	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   419: ifeq +9 -> 428
    //   422: bipush 6
    //   424: istore_3
    //   425: goto +44 -> 469
    //   428: aload 4
    //   430: ldc -115
    //   432: invokevirtual 133	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   435: ifne +27 -> 462
    //   438: aload 4
    //   440: ldc -113
    //   442: invokevirtual 133	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   445: ifeq +6 -> 451
    //   448: goto +14 -> 462
    //   451: aconst_null
    //   452: aload 4
    //   454: aload_0
    //   455: aload_1
    //   456: invokestatic 77	com/google/android/gms/internal/ads/zzfjv:zzd	([BLjava/lang/String;Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzfit;)V
    //   459: goto -91 -> 368
    //   462: iconst_3
    //   463: istore_3
    //   464: goto +5 -> 469
    //   467: iconst_5
    //   468: istore_3
    //   469: iload_3
    //   470: iconst_1
    //   471: if_icmpeq +55 -> 526
    //   474: iload_3
    //   475: iconst_3
    //   476: if_icmpeq +44 -> 520
    //   479: iload_3
    //   480: iconst_5
    //   481: if_icmpeq +33 -> 514
    //   484: iload_3
    //   485: bipush 6
    //   487: if_icmpeq +21 -> 508
    //   490: iload_3
    //   491: bipush 7
    //   493: if_icmpeq +9 -> 502
    //   496: ldc -111
    //   498: astore_0
    //   499: goto +30 -> 529
    //   502: ldc -109
    //   504: astore_0
    //   505: goto +24 -> 529
    //   508: ldc -107
    //   510: astore_0
    //   511: goto +18 -> 529
    //   514: ldc -105
    //   516: astore_0
    //   517: goto +12 -> 529
    //   520: ldc -103
    //   522: astore_0
    //   523: goto +6 -> 529
    //   526: ldc -101
    //   528: astore_0
    //   529: aload_1
    //   530: sipush 5018
    //   533: aload_0
    //   534: invokevirtual 47	com/google/android/gms/internal/ads/zzfit:zzb	(ILjava/lang/String;)Lcom/google/android/gms/tasks/Task;
    //   537: pop
    //   538: iload_3
    //   539: ireturn
    //   540: astore 4
    //   542: goto -240 -> 302
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	545	0	paramContext	Context
    //   0	545	1	paramzzfit	zzfit
    //   46	297	2	i	int
    //   337	202	3	j	int
    //   23	239	4	localObject1	Object
    //   269	27	4	localObject2	Object
    //   305	4	4	localIOException	java.io.IOException
    //   350	103	4	str	String
    //   540	1	4	localException	Exception
    //   68	139	5	localObject3	Object
    //   259	44	5	localObject4	Object
    //   119	55	6	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   98	121	259	finally
    //   139	147	259	finally
    //   173	182	259	finally
    //   206	214	259	finally
    //   261	266	269	finally
    //   84	98	305	java/io/IOException
    //   147	152	305	java/io/IOException
    //   217	222	305	java/io/IOException
    //   228	233	305	java/io/IOException
    //   239	244	305	java/io/IOException
    //   249	254	305	java/io/IOException
    //   302	305	305	java/io/IOException
    //   271	302	540	java/lang/Exception
  }
  
  private static final String zzc(Context paramContext, zzfit paramzzfit)
  {
    HashSet localHashSet = new HashSet(Arrays.asList(new String[] { "i686", "armv71" }));
    paramContext = zzfpn.zzu.zza();
    if ((!TextUtils.isEmpty(paramContext)) && (localHashSet.contains(paramContext))) {
      return paramContext;
    }
    try
    {
      paramContext = (String[])Build.class.getField("SUPPORTED_ABIS").get(null);
      if ((paramContext != null) && (paramContext.length > 0))
      {
        paramContext = paramContext[0];
        return paramContext;
      }
    }
    catch (IllegalAccessException paramContext)
    {
      paramzzfit.zzc(2024, 0L, paramContext);
    }
    catch (NoSuchFieldException paramContext)
    {
      paramzzfit.zzc(2024, 0L, paramContext);
    }
    if (Build.CPU_ABI != null) {
      return Build.CPU_ABI;
    }
    return Build.CPU_ABI2;
  }
  
  private static final void zzd(byte[] paramArrayOfByte, String paramString, Context paramContext, zzfit paramzzfit)
  {
    paramContext = new StringBuilder();
    paramContext.append("os.arch:");
    paramContext.append(zzfpn.zzu.zza());
    paramContext.append(";");
    try
    {
      String[] arrayOfString = (String[])Build.class.getField("SUPPORTED_ABIS").get(null);
      if (arrayOfString != null)
      {
        paramContext.append("supported_abis:");
        paramContext.append(Arrays.toString(arrayOfString));
        paramContext.append(";");
      }
    }
    catch (NoSuchFieldException|IllegalAccessException localNoSuchFieldException) {}
    paramContext.append("CPU_ABI:");
    paramContext.append(Build.CPU_ABI);
    paramContext.append(";CPU_ABI2:");
    paramContext.append(Build.CPU_ABI2);
    paramContext.append(";");
    if (paramArrayOfByte != null)
    {
      paramContext.append("ELF:");
      paramContext.append(Arrays.toString(paramArrayOfByte));
      paramContext.append(";");
    }
    if (paramString != null)
    {
      paramContext.append("dbg:");
      paramContext.append(paramString);
      paramContext.append(";");
    }
    paramzzfit.zzb(4007, paramContext.toString());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfjv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */