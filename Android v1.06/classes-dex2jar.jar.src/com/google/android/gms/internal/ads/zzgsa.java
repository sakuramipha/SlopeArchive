package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import sun.misc.Unsafe;

final class zzgsa
{
  static final long zza;
  static final boolean zzb;
  private static final Unsafe zzc;
  private static final Class zzd;
  private static final boolean zze;
  private static final zzgrz zzf;
  private static final boolean zzg;
  private static final boolean zzh;
  private static final long zzi;
  
  /* Error */
  static
  {
    // Byte code:
    //   0: invokestatic 23	com/google/android/gms/internal/ads/zzgsa:zzi	()Lsun/misc/Unsafe;
    //   3: astore 8
    //   5: aload 8
    //   7: putstatic 25	com/google/android/gms/internal/ads/zzgsa:zzc	Lsun/misc/Unsafe;
    //   10: getstatic 30	com/google/android/gms/internal/ads/zzgmz:zza	I
    //   13: istore_0
    //   14: ldc 32
    //   16: putstatic 34	com/google/android/gms/internal/ads/zzgsa:zzd	Ljava/lang/Class;
    //   19: getstatic 39	java/lang/Long:TYPE	Ljava/lang/Class;
    //   22: invokestatic 43	com/google/android/gms/internal/ads/zzgsa:zzy	(Ljava/lang/Class;)Z
    //   25: istore_1
    //   26: iload_1
    //   27: putstatic 45	com/google/android/gms/internal/ads/zzgsa:zze	Z
    //   30: getstatic 48	java/lang/Integer:TYPE	Ljava/lang/Class;
    //   33: invokestatic 43	com/google/android/gms/internal/ads/zzgsa:zzy	(Ljava/lang/Class;)Z
    //   36: istore_2
    //   37: aconst_null
    //   38: astore 7
    //   40: aload 8
    //   42: ifnonnull +6 -> 48
    //   45: goto +36 -> 81
    //   48: iload_1
    //   49: ifeq +17 -> 66
    //   52: new 50	com/google/android/gms/internal/ads/zzgry
    //   55: dup
    //   56: aload 8
    //   58: invokespecial 54	com/google/android/gms/internal/ads/zzgry:<init>	(Lsun/misc/Unsafe;)V
    //   61: astore 7
    //   63: goto +18 -> 81
    //   66: iload_2
    //   67: ifeq +14 -> 81
    //   70: new 56	com/google/android/gms/internal/ads/zzgrx
    //   73: dup
    //   74: aload 8
    //   76: invokespecial 57	com/google/android/gms/internal/ads/zzgrx:<init>	(Lsun/misc/Unsafe;)V
    //   79: astore 7
    //   81: aload 7
    //   83: putstatic 59	com/google/android/gms/internal/ads/zzgsa:zzf	Lcom/google/android/gms/internal/ads/zzgrz;
    //   86: iconst_1
    //   87: istore_2
    //   88: aload 7
    //   90: ifnonnull +8 -> 98
    //   93: iconst_0
    //   94: istore_1
    //   95: goto +85 -> 180
    //   98: aload 7
    //   100: getfield 63	com/google/android/gms/internal/ads/zzgrz:zza	Lsun/misc/Unsafe;
    //   103: astore 7
    //   105: aload 7
    //   107: invokevirtual 67	java/lang/Object:getClass	()Ljava/lang/Class;
    //   110: astore 7
    //   112: aload 7
    //   114: ldc 69
    //   116: iconst_1
    //   117: anewarray 71	java/lang/Class
    //   120: dup
    //   121: iconst_0
    //   122: ldc 73
    //   124: aastore
    //   125: invokevirtual 77	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   128: pop
    //   129: aload 7
    //   131: ldc 79
    //   133: iconst_2
    //   134: anewarray 71	java/lang/Class
    //   137: dup
    //   138: iconst_0
    //   139: ldc 4
    //   141: aastore
    //   142: dup
    //   143: iconst_1
    //   144: getstatic 39	java/lang/Long:TYPE	Ljava/lang/Class;
    //   147: aastore
    //   148: invokevirtual 77	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   151: pop
    //   152: invokestatic 83	com/google/android/gms/internal/ads/zzgsa:zzE	()Ljava/lang/reflect/Field;
    //   155: astore 7
    //   157: aload 7
    //   159: ifnonnull +6 -> 165
    //   162: goto -69 -> 93
    //   165: iconst_1
    //   166: istore_1
    //   167: goto +13 -> 180
    //   170: astore 7
    //   172: aload 7
    //   174: invokestatic 87	com/google/android/gms/internal/ads/zzgsa:zzj	(Ljava/lang/Throwable;)V
    //   177: goto -84 -> 93
    //   180: iload_1
    //   181: putstatic 89	com/google/android/gms/internal/ads/zzgsa:zzg	Z
    //   184: getstatic 59	com/google/android/gms/internal/ads/zzgsa:zzf	Lcom/google/android/gms/internal/ads/zzgrz;
    //   187: astore 7
    //   189: aload 7
    //   191: ifnonnull +8 -> 199
    //   194: iconst_0
    //   195: istore_1
    //   196: goto +238 -> 434
    //   199: aload 7
    //   201: getfield 63	com/google/android/gms/internal/ads/zzgrz:zza	Lsun/misc/Unsafe;
    //   204: astore 7
    //   206: aload 7
    //   208: invokevirtual 67	java/lang/Object:getClass	()Ljava/lang/Class;
    //   211: astore 7
    //   213: aload 7
    //   215: ldc 69
    //   217: iconst_1
    //   218: anewarray 71	java/lang/Class
    //   221: dup
    //   222: iconst_0
    //   223: ldc 73
    //   225: aastore
    //   226: invokevirtual 77	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   229: pop
    //   230: aload 7
    //   232: ldc 91
    //   234: iconst_1
    //   235: anewarray 71	java/lang/Class
    //   238: dup
    //   239: iconst_0
    //   240: ldc 71
    //   242: aastore
    //   243: invokevirtual 77	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   246: pop
    //   247: aload 7
    //   249: ldc 93
    //   251: iconst_1
    //   252: anewarray 71	java/lang/Class
    //   255: dup
    //   256: iconst_0
    //   257: ldc 71
    //   259: aastore
    //   260: invokevirtual 77	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   263: pop
    //   264: aload 7
    //   266: ldc 95
    //   268: iconst_2
    //   269: anewarray 71	java/lang/Class
    //   272: dup
    //   273: iconst_0
    //   274: ldc 4
    //   276: aastore
    //   277: dup
    //   278: iconst_1
    //   279: getstatic 39	java/lang/Long:TYPE	Ljava/lang/Class;
    //   282: aastore
    //   283: invokevirtual 77	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   286: pop
    //   287: aload 7
    //   289: ldc 97
    //   291: iconst_3
    //   292: anewarray 71	java/lang/Class
    //   295: dup
    //   296: iconst_0
    //   297: ldc 4
    //   299: aastore
    //   300: dup
    //   301: iconst_1
    //   302: getstatic 39	java/lang/Long:TYPE	Ljava/lang/Class;
    //   305: aastore
    //   306: dup
    //   307: iconst_2
    //   308: getstatic 48	java/lang/Integer:TYPE	Ljava/lang/Class;
    //   311: aastore
    //   312: invokevirtual 77	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   315: pop
    //   316: aload 7
    //   318: ldc 79
    //   320: iconst_2
    //   321: anewarray 71	java/lang/Class
    //   324: dup
    //   325: iconst_0
    //   326: ldc 4
    //   328: aastore
    //   329: dup
    //   330: iconst_1
    //   331: getstatic 39	java/lang/Long:TYPE	Ljava/lang/Class;
    //   334: aastore
    //   335: invokevirtual 77	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   338: pop
    //   339: aload 7
    //   341: ldc 99
    //   343: iconst_3
    //   344: anewarray 71	java/lang/Class
    //   347: dup
    //   348: iconst_0
    //   349: ldc 4
    //   351: aastore
    //   352: dup
    //   353: iconst_1
    //   354: getstatic 39	java/lang/Long:TYPE	Ljava/lang/Class;
    //   357: aastore
    //   358: dup
    //   359: iconst_2
    //   360: getstatic 39	java/lang/Long:TYPE	Ljava/lang/Class;
    //   363: aastore
    //   364: invokevirtual 77	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   367: pop
    //   368: aload 7
    //   370: ldc 101
    //   372: iconst_2
    //   373: anewarray 71	java/lang/Class
    //   376: dup
    //   377: iconst_0
    //   378: ldc 4
    //   380: aastore
    //   381: dup
    //   382: iconst_1
    //   383: getstatic 39	java/lang/Long:TYPE	Ljava/lang/Class;
    //   386: aastore
    //   387: invokevirtual 77	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   390: pop
    //   391: aload 7
    //   393: ldc 103
    //   395: iconst_3
    //   396: anewarray 71	java/lang/Class
    //   399: dup
    //   400: iconst_0
    //   401: ldc 4
    //   403: aastore
    //   404: dup
    //   405: iconst_1
    //   406: getstatic 39	java/lang/Long:TYPE	Ljava/lang/Class;
    //   409: aastore
    //   410: dup
    //   411: iconst_2
    //   412: ldc 4
    //   414: aastore
    //   415: invokevirtual 77	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   418: pop
    //   419: iconst_1
    //   420: istore_1
    //   421: goto +13 -> 434
    //   424: astore 7
    //   426: aload 7
    //   428: invokestatic 87	com/google/android/gms/internal/ads/zzgsa:zzj	(Ljava/lang/Throwable;)V
    //   431: goto -237 -> 194
    //   434: iload_1
    //   435: putstatic 105	com/google/android/gms/internal/ads/zzgsa:zzh	Z
    //   438: ldc 107
    //   440: invokestatic 111	com/google/android/gms/internal/ads/zzgsa:zzC	(Ljava/lang/Class;)I
    //   443: i2l
    //   444: putstatic 113	com/google/android/gms/internal/ads/zzgsa:zza	J
    //   447: ldc 115
    //   449: invokestatic 111	com/google/android/gms/internal/ads/zzgsa:zzC	(Ljava/lang/Class;)I
    //   452: pop
    //   453: ldc 115
    //   455: invokestatic 118	com/google/android/gms/internal/ads/zzgsa:zzD	(Ljava/lang/Class;)I
    //   458: pop
    //   459: ldc 120
    //   461: invokestatic 111	com/google/android/gms/internal/ads/zzgsa:zzC	(Ljava/lang/Class;)I
    //   464: pop
    //   465: ldc 120
    //   467: invokestatic 118	com/google/android/gms/internal/ads/zzgsa:zzD	(Ljava/lang/Class;)I
    //   470: pop
    //   471: ldc 122
    //   473: invokestatic 111	com/google/android/gms/internal/ads/zzgsa:zzC	(Ljava/lang/Class;)I
    //   476: pop
    //   477: ldc 122
    //   479: invokestatic 118	com/google/android/gms/internal/ads/zzgsa:zzD	(Ljava/lang/Class;)I
    //   482: pop
    //   483: ldc 124
    //   485: invokestatic 111	com/google/android/gms/internal/ads/zzgsa:zzC	(Ljava/lang/Class;)I
    //   488: pop
    //   489: ldc 124
    //   491: invokestatic 118	com/google/android/gms/internal/ads/zzgsa:zzD	(Ljava/lang/Class;)I
    //   494: pop
    //   495: ldc 126
    //   497: invokestatic 111	com/google/android/gms/internal/ads/zzgsa:zzC	(Ljava/lang/Class;)I
    //   500: pop
    //   501: ldc 126
    //   503: invokestatic 118	com/google/android/gms/internal/ads/zzgsa:zzD	(Ljava/lang/Class;)I
    //   506: pop
    //   507: ldc -128
    //   509: invokestatic 111	com/google/android/gms/internal/ads/zzgsa:zzC	(Ljava/lang/Class;)I
    //   512: pop
    //   513: ldc -128
    //   515: invokestatic 118	com/google/android/gms/internal/ads/zzgsa:zzD	(Ljava/lang/Class;)I
    //   518: pop
    //   519: invokestatic 83	com/google/android/gms/internal/ads/zzgsa:zzE	()Ljava/lang/reflect/Field;
    //   522: astore 7
    //   524: ldc2_w 129
    //   527: lstore 5
    //   529: lload 5
    //   531: lstore_3
    //   532: aload 7
    //   534: ifnull +30 -> 564
    //   537: getstatic 59	com/google/android/gms/internal/ads/zzgsa:zzf	Lcom/google/android/gms/internal/ads/zzgrz;
    //   540: astore 8
    //   542: aload 8
    //   544: ifnonnull +9 -> 553
    //   547: lload 5
    //   549: lstore_3
    //   550: goto +14 -> 564
    //   553: aload 8
    //   555: getfield 63	com/google/android/gms/internal/ads/zzgrz:zza	Lsun/misc/Unsafe;
    //   558: aload 7
    //   560: invokevirtual 135	sun/misc/Unsafe:objectFieldOffset	(Ljava/lang/reflect/Field;)J
    //   563: lstore_3
    //   564: lload_3
    //   565: putstatic 137	com/google/android/gms/internal/ads/zzgsa:zzi	J
    //   568: invokestatic 143	java/nio/ByteOrder:nativeOrder	()Ljava/nio/ByteOrder;
    //   571: getstatic 147	java/nio/ByteOrder:BIG_ENDIAN	Ljava/nio/ByteOrder;
    //   574: if_acmpne +8 -> 582
    //   577: iload_2
    //   578: istore_1
    //   579: goto +5 -> 584
    //   582: iconst_0
    //   583: istore_1
    //   584: iload_1
    //   585: putstatic 149	com/google/android/gms/internal/ads/zzgsa:zzb	Z
    //   588: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   13	1	0	i	int
    //   25	560	1	bool1	boolean
    //   36	542	2	bool2	boolean
    //   531	34	3	l1	long
    //   527	21	5	l2	long
    //   38	120	7	localObject1	Object
    //   170	3	7	localThrowable1	Throwable
    //   187	205	7	localObject2	Object
    //   424	3	7	localThrowable2	Throwable
    //   522	37	7	localField	Field
    //   3	551	8	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   105	157	170	finally
    //   206	419	424	finally
  }
  
  static boolean zzA()
  {
    return zzh;
  }
  
  static boolean zzB()
  {
    return zzg;
  }
  
  private static int zzC(Class paramClass)
  {
    if (zzh) {
      return zzf.zza.arrayBaseOffset(paramClass);
    }
    return -1;
  }
  
  private static int zzD(Class paramClass)
  {
    if (zzh) {
      return zzf.zza.arrayIndexScale(paramClass);
    }
    return -1;
  }
  
  private static Field zzE()
  {
    int i = zzgmz.zza;
    Field localField2 = zzF(Buffer.class, "effectiveDirectAddress");
    Field localField1 = localField2;
    if (localField2 == null)
    {
      localField1 = zzF(Buffer.class, "address");
      if ((localField1 != null) && (localField1.getType() == Long.TYPE)) {
        return localField1;
      }
      localField1 = null;
    }
    return localField1;
  }
  
  /* Error */
  private static Field zzF(Class paramClass, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual 176	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   5: astore_0
    //   6: goto +6 -> 12
    //   9: astore_0
    //   10: aconst_null
    //   11: astore_0
    //   12: aload_0
    //   13: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	14	0	paramClass	Class
    //   0	14	1	paramString	String
    // Exception table:
    //   from	to	target	type
    //   0	6	9	finally
  }
  
  private static void zzG(Object paramObject, long paramLong, byte paramByte)
  {
    zzgrz localzzgrz = zzf;
    Unsafe localUnsafe = localzzgrz.zza;
    long l = 0xFFFFFFFFFFFFFFFC & paramLong;
    int i = localUnsafe.getInt(paramObject, l);
    int j = (((int)paramLong ^ 0xFFFFFFFF) & 0x3) << 3;
    localzzgrz.zza.putInt(paramObject, l, (0xFF & paramByte) << j | i & (255 << j ^ 0xFFFFFFFF));
  }
  
  private static void zzH(Object paramObject, long paramLong, byte paramByte)
  {
    zzgrz localzzgrz = zzf;
    Unsafe localUnsafe = localzzgrz.zza;
    long l = 0xFFFFFFFFFFFFFFFC & paramLong;
    int i = localUnsafe.getInt(paramObject, l);
    int j = ((int)paramLong & 0x3) << 3;
    localzzgrz.zza.putInt(paramObject, l, (0xFF & paramByte) << j | i & (255 << j ^ 0xFFFFFFFF));
  }
  
  static byte zza(long paramLong)
  {
    return zzf.zza(paramLong);
  }
  
  static double zzb(Object paramObject, long paramLong)
  {
    return zzf.zzb(paramObject, paramLong);
  }
  
  static float zzc(Object paramObject, long paramLong)
  {
    return zzf.zzc(paramObject, paramLong);
  }
  
  static int zzd(Object paramObject, long paramLong)
  {
    return zzf.zza.getInt(paramObject, paramLong);
  }
  
  static long zze(ByteBuffer paramByteBuffer)
  {
    zzgrz localzzgrz = zzf;
    long l = zzi;
    return localzzgrz.zza.getLong(paramByteBuffer, l);
  }
  
  static long zzf(Object paramObject, long paramLong)
  {
    return zzf.zza.getLong(paramObject, paramLong);
  }
  
  static Object zzg(Class paramClass)
  {
    try
    {
      paramClass = zzc.allocateInstance(paramClass);
      return paramClass;
    }
    catch (InstantiationException paramClass)
    {
      throw new IllegalStateException(paramClass);
    }
  }
  
  static Object zzh(Object paramObject, long paramLong)
  {
    return zzf.zza.getObject(paramObject, paramLong);
  }
  
  /* Error */
  static Unsafe zzi()
  {
    // Byte code:
    //   0: new 215	com/google/android/gms/internal/ads/zzgrw
    //   3: astore_0
    //   4: aload_0
    //   5: invokespecial 216	com/google/android/gms/internal/ads/zzgrw:<init>	()V
    //   8: aload_0
    //   9: invokestatic 222	java/security/AccessController:doPrivileged	(Ljava/security/PrivilegedExceptionAction;)Ljava/lang/Object;
    //   12: checkcast 132	sun/misc/Unsafe
    //   15: astore_0
    //   16: goto +6 -> 22
    //   19: astore_0
    //   20: aconst_null
    //   21: astore_0
    //   22: aload_0
    //   23: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   3	13	0	localObject1	Object
    //   19	1	0	localObject2	Object
    //   21	2	0	localUnsafe	Unsafe
    // Exception table:
    //   from	to	target	type
    //   0	16	19	finally
  }
  
  static void zzo(long paramLong1, byte[] paramArrayOfByte, long paramLong2, long paramLong3)
  {
    zzf.zzd(paramLong1, paramArrayOfByte, paramLong2, paramLong3);
  }
  
  static void zzp(Object paramObject, long paramLong, boolean paramBoolean)
  {
    zzf.zze(paramObject, paramLong, paramBoolean);
  }
  
  static void zzq(byte[] paramArrayOfByte, long paramLong, byte paramByte)
  {
    zzf.zzf(paramArrayOfByte, zza + paramLong, paramByte);
  }
  
  static void zzr(Object paramObject, long paramLong, double paramDouble)
  {
    zzf.zzg(paramObject, paramLong, paramDouble);
  }
  
  static void zzs(Object paramObject, long paramLong, float paramFloat)
  {
    zzf.zzh(paramObject, paramLong, paramFloat);
  }
  
  static void zzt(Object paramObject, long paramLong, int paramInt)
  {
    zzf.zza.putInt(paramObject, paramLong, paramInt);
  }
  
  static void zzu(Object paramObject, long paramLong1, long paramLong2)
  {
    zzf.zza.putLong(paramObject, paramLong1, paramLong2);
  }
  
  static void zzv(Object paramObject1, long paramLong, Object paramObject2)
  {
    zzf.zza.putObject(paramObject1, paramLong, paramObject2);
  }
  
  static boolean zzy(Class paramClass)
  {
    int i = zzgmz.zza;
    try
    {
      Class localClass = zzd;
      localClass.getMethod("peekLong", new Class[] { paramClass, Boolean.TYPE });
      localClass.getMethod("pokeLong", new Class[] { paramClass, Long.TYPE, Boolean.TYPE });
      localClass.getMethod("pokeInt", new Class[] { paramClass, Integer.TYPE, Boolean.TYPE });
      localClass.getMethod("peekInt", new Class[] { paramClass, Boolean.TYPE });
      localClass.getMethod("pokeByte", new Class[] { paramClass, Byte.TYPE });
      localClass.getMethod("peekByte", new Class[] { paramClass });
      localClass.getMethod("pokeByteArray", new Class[] { paramClass, byte[].class, Integer.TYPE, Integer.TYPE });
      localClass.getMethod("peekByteArray", new Class[] { paramClass, byte[].class, Integer.TYPE, Integer.TYPE });
      return true;
    }
    finally {}
    return false;
  }
  
  static boolean zzz(Object paramObject, long paramLong)
  {
    return zzf.zzi(paramObject, paramLong);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgsa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */