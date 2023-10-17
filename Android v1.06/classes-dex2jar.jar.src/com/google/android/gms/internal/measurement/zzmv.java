package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import sun.misc.Unsafe;

final class zzmv
{
  static final long zza;
  static final boolean zzb;
  private static final Unsafe zzc;
  private static final Class zzd;
  private static final boolean zze;
  private static final zzmu zzf;
  private static final boolean zzg;
  private static final boolean zzh;
  
  /* Error */
  static
  {
    // Byte code:
    //   0: invokestatic 22	com/google/android/gms/internal/measurement/zzmv:zzg	()Lsun/misc/Unsafe;
    //   3: astore_3
    //   4: aload_3
    //   5: putstatic 24	com/google/android/gms/internal/measurement/zzmv:zzc	Lsun/misc/Unsafe;
    //   8: invokestatic 29	com/google/android/gms/internal/measurement/zzin:zza	()Ljava/lang/Class;
    //   11: putstatic 31	com/google/android/gms/internal/measurement/zzmv:zzd	Ljava/lang/Class;
    //   14: getstatic 36	java/lang/Long:TYPE	Ljava/lang/Class;
    //   17: invokestatic 40	com/google/android/gms/internal/measurement/zzmv:zzv	(Ljava/lang/Class;)Z
    //   20: istore_0
    //   21: iload_0
    //   22: putstatic 42	com/google/android/gms/internal/measurement/zzmv:zze	Z
    //   25: getstatic 45	java/lang/Integer:TYPE	Ljava/lang/Class;
    //   28: invokestatic 40	com/google/android/gms/internal/measurement/zzmv:zzv	(Ljava/lang/Class;)Z
    //   31: istore_1
    //   32: aconst_null
    //   33: astore_2
    //   34: aload_3
    //   35: ifnonnull +6 -> 41
    //   38: goto +32 -> 70
    //   41: iload_0
    //   42: ifeq +15 -> 57
    //   45: new 47	com/google/android/gms/internal/measurement/zzmt
    //   48: dup
    //   49: aload_3
    //   50: invokespecial 51	com/google/android/gms/internal/measurement/zzmt:<init>	(Lsun/misc/Unsafe;)V
    //   53: astore_2
    //   54: goto +16 -> 70
    //   57: iload_1
    //   58: ifeq +12 -> 70
    //   61: new 53	com/google/android/gms/internal/measurement/zzms
    //   64: dup
    //   65: aload_3
    //   66: invokespecial 54	com/google/android/gms/internal/measurement/zzms:<init>	(Lsun/misc/Unsafe;)V
    //   69: astore_2
    //   70: aload_2
    //   71: putstatic 56	com/google/android/gms/internal/measurement/zzmv:zzf	Lcom/google/android/gms/internal/measurement/zzmu;
    //   74: iconst_1
    //   75: istore_1
    //   76: aload_2
    //   77: ifnonnull +8 -> 85
    //   80: iconst_0
    //   81: istore_0
    //   82: goto +75 -> 157
    //   85: aload_2
    //   86: getfield 60	com/google/android/gms/internal/measurement/zzmu:zza	Lsun/misc/Unsafe;
    //   89: astore_2
    //   90: aload_2
    //   91: invokevirtual 63	java/lang/Object:getClass	()Ljava/lang/Class;
    //   94: astore_2
    //   95: aload_2
    //   96: ldc 65
    //   98: iconst_1
    //   99: anewarray 67	java/lang/Class
    //   102: dup
    //   103: iconst_0
    //   104: ldc 69
    //   106: aastore
    //   107: invokevirtual 73	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   110: pop
    //   111: aload_2
    //   112: ldc 75
    //   114: iconst_2
    //   115: anewarray 67	java/lang/Class
    //   118: dup
    //   119: iconst_0
    //   120: ldc 4
    //   122: aastore
    //   123: dup
    //   124: iconst_1
    //   125: getstatic 36	java/lang/Long:TYPE	Ljava/lang/Class;
    //   128: aastore
    //   129: invokevirtual 73	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   132: pop
    //   133: invokestatic 79	com/google/android/gms/internal/measurement/zzmv:zzB	()Ljava/lang/reflect/Field;
    //   136: astore_2
    //   137: aload_2
    //   138: ifnonnull +6 -> 144
    //   141: goto -61 -> 80
    //   144: iconst_1
    //   145: istore_0
    //   146: goto +11 -> 157
    //   149: astore_2
    //   150: aload_2
    //   151: invokestatic 82	com/google/android/gms/internal/measurement/zzmv:zzh	(Ljava/lang/Throwable;)V
    //   154: goto -74 -> 80
    //   157: iload_0
    //   158: putstatic 84	com/google/android/gms/internal/measurement/zzmv:zzg	Z
    //   161: getstatic 56	com/google/android/gms/internal/measurement/zzmv:zzf	Lcom/google/android/gms/internal/measurement/zzmu;
    //   164: astore_2
    //   165: aload_2
    //   166: ifnonnull +8 -> 174
    //   169: iconst_0
    //   170: istore_0
    //   171: goto +223 -> 394
    //   174: aload_2
    //   175: getfield 60	com/google/android/gms/internal/measurement/zzmu:zza	Lsun/misc/Unsafe;
    //   178: astore_2
    //   179: aload_2
    //   180: invokevirtual 63	java/lang/Object:getClass	()Ljava/lang/Class;
    //   183: astore_2
    //   184: aload_2
    //   185: ldc 65
    //   187: iconst_1
    //   188: anewarray 67	java/lang/Class
    //   191: dup
    //   192: iconst_0
    //   193: ldc 69
    //   195: aastore
    //   196: invokevirtual 73	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   199: pop
    //   200: aload_2
    //   201: ldc 86
    //   203: iconst_1
    //   204: anewarray 67	java/lang/Class
    //   207: dup
    //   208: iconst_0
    //   209: ldc 67
    //   211: aastore
    //   212: invokevirtual 73	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   215: pop
    //   216: aload_2
    //   217: ldc 88
    //   219: iconst_1
    //   220: anewarray 67	java/lang/Class
    //   223: dup
    //   224: iconst_0
    //   225: ldc 67
    //   227: aastore
    //   228: invokevirtual 73	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   231: pop
    //   232: aload_2
    //   233: ldc 90
    //   235: iconst_2
    //   236: anewarray 67	java/lang/Class
    //   239: dup
    //   240: iconst_0
    //   241: ldc 4
    //   243: aastore
    //   244: dup
    //   245: iconst_1
    //   246: getstatic 36	java/lang/Long:TYPE	Ljava/lang/Class;
    //   249: aastore
    //   250: invokevirtual 73	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   253: pop
    //   254: aload_2
    //   255: ldc 92
    //   257: iconst_3
    //   258: anewarray 67	java/lang/Class
    //   261: dup
    //   262: iconst_0
    //   263: ldc 4
    //   265: aastore
    //   266: dup
    //   267: iconst_1
    //   268: getstatic 36	java/lang/Long:TYPE	Ljava/lang/Class;
    //   271: aastore
    //   272: dup
    //   273: iconst_2
    //   274: getstatic 45	java/lang/Integer:TYPE	Ljava/lang/Class;
    //   277: aastore
    //   278: invokevirtual 73	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   281: pop
    //   282: aload_2
    //   283: ldc 75
    //   285: iconst_2
    //   286: anewarray 67	java/lang/Class
    //   289: dup
    //   290: iconst_0
    //   291: ldc 4
    //   293: aastore
    //   294: dup
    //   295: iconst_1
    //   296: getstatic 36	java/lang/Long:TYPE	Ljava/lang/Class;
    //   299: aastore
    //   300: invokevirtual 73	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   303: pop
    //   304: aload_2
    //   305: ldc 94
    //   307: iconst_3
    //   308: anewarray 67	java/lang/Class
    //   311: dup
    //   312: iconst_0
    //   313: ldc 4
    //   315: aastore
    //   316: dup
    //   317: iconst_1
    //   318: getstatic 36	java/lang/Long:TYPE	Ljava/lang/Class;
    //   321: aastore
    //   322: dup
    //   323: iconst_2
    //   324: getstatic 36	java/lang/Long:TYPE	Ljava/lang/Class;
    //   327: aastore
    //   328: invokevirtual 73	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   331: pop
    //   332: aload_2
    //   333: ldc 96
    //   335: iconst_2
    //   336: anewarray 67	java/lang/Class
    //   339: dup
    //   340: iconst_0
    //   341: ldc 4
    //   343: aastore
    //   344: dup
    //   345: iconst_1
    //   346: getstatic 36	java/lang/Long:TYPE	Ljava/lang/Class;
    //   349: aastore
    //   350: invokevirtual 73	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   353: pop
    //   354: aload_2
    //   355: ldc 98
    //   357: iconst_3
    //   358: anewarray 67	java/lang/Class
    //   361: dup
    //   362: iconst_0
    //   363: ldc 4
    //   365: aastore
    //   366: dup
    //   367: iconst_1
    //   368: getstatic 36	java/lang/Long:TYPE	Ljava/lang/Class;
    //   371: aastore
    //   372: dup
    //   373: iconst_2
    //   374: ldc 4
    //   376: aastore
    //   377: invokevirtual 73	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   380: pop
    //   381: iconst_1
    //   382: istore_0
    //   383: goto +11 -> 394
    //   386: astore_2
    //   387: aload_2
    //   388: invokestatic 82	com/google/android/gms/internal/measurement/zzmv:zzh	(Ljava/lang/Throwable;)V
    //   391: goto -222 -> 169
    //   394: iload_0
    //   395: putstatic 100	com/google/android/gms/internal/measurement/zzmv:zzh	Z
    //   398: ldc 102
    //   400: invokestatic 106	com/google/android/gms/internal/measurement/zzmv:zzz	(Ljava/lang/Class;)I
    //   403: i2l
    //   404: putstatic 108	com/google/android/gms/internal/measurement/zzmv:zza	J
    //   407: ldc 110
    //   409: invokestatic 106	com/google/android/gms/internal/measurement/zzmv:zzz	(Ljava/lang/Class;)I
    //   412: pop
    //   413: ldc 110
    //   415: invokestatic 113	com/google/android/gms/internal/measurement/zzmv:zzA	(Ljava/lang/Class;)I
    //   418: pop
    //   419: ldc 115
    //   421: invokestatic 106	com/google/android/gms/internal/measurement/zzmv:zzz	(Ljava/lang/Class;)I
    //   424: pop
    //   425: ldc 115
    //   427: invokestatic 113	com/google/android/gms/internal/measurement/zzmv:zzA	(Ljava/lang/Class;)I
    //   430: pop
    //   431: ldc 117
    //   433: invokestatic 106	com/google/android/gms/internal/measurement/zzmv:zzz	(Ljava/lang/Class;)I
    //   436: pop
    //   437: ldc 117
    //   439: invokestatic 113	com/google/android/gms/internal/measurement/zzmv:zzA	(Ljava/lang/Class;)I
    //   442: pop
    //   443: ldc 119
    //   445: invokestatic 106	com/google/android/gms/internal/measurement/zzmv:zzz	(Ljava/lang/Class;)I
    //   448: pop
    //   449: ldc 119
    //   451: invokestatic 113	com/google/android/gms/internal/measurement/zzmv:zzA	(Ljava/lang/Class;)I
    //   454: pop
    //   455: ldc 121
    //   457: invokestatic 106	com/google/android/gms/internal/measurement/zzmv:zzz	(Ljava/lang/Class;)I
    //   460: pop
    //   461: ldc 121
    //   463: invokestatic 113	com/google/android/gms/internal/measurement/zzmv:zzA	(Ljava/lang/Class;)I
    //   466: pop
    //   467: ldc 123
    //   469: invokestatic 106	com/google/android/gms/internal/measurement/zzmv:zzz	(Ljava/lang/Class;)I
    //   472: pop
    //   473: ldc 123
    //   475: invokestatic 113	com/google/android/gms/internal/measurement/zzmv:zzA	(Ljava/lang/Class;)I
    //   478: pop
    //   479: invokestatic 79	com/google/android/gms/internal/measurement/zzmv:zzB	()Ljava/lang/reflect/Field;
    //   482: astore_2
    //   483: aload_2
    //   484: ifnull +17 -> 501
    //   487: getstatic 56	com/google/android/gms/internal/measurement/zzmv:zzf	Lcom/google/android/gms/internal/measurement/zzmu;
    //   490: astore_3
    //   491: aload_3
    //   492: ifnull +9 -> 501
    //   495: aload_3
    //   496: aload_2
    //   497: invokevirtual 127	com/google/android/gms/internal/measurement/zzmu:zzl	(Ljava/lang/reflect/Field;)J
    //   500: pop2
    //   501: invokestatic 133	java/nio/ByteOrder:nativeOrder	()Ljava/nio/ByteOrder;
    //   504: getstatic 137	java/nio/ByteOrder:BIG_ENDIAN	Ljava/nio/ByteOrder;
    //   507: if_acmpne +8 -> 515
    //   510: iload_1
    //   511: istore_0
    //   512: goto +5 -> 517
    //   515: iconst_0
    //   516: istore_0
    //   517: iload_0
    //   518: putstatic 139	com/google/android/gms/internal/measurement/zzmv:zzb	Z
    //   521: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   20	498	0	bool1	boolean
    //   31	480	1	bool2	boolean
    //   33	105	2	localObject1	Object
    //   149	2	2	localThrowable1	Throwable
    //   164	191	2	localObject2	Object
    //   386	2	2	localThrowable2	Throwable
    //   482	15	2	localField	Field
    //   3	493	3	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   90	137	149	finally
    //   179	381	386	finally
  }
  
  private static int zzA(Class paramClass)
  {
    if (zzh) {
      return zzf.zzi(paramClass);
    }
    return -1;
  }
  
  private static Field zzB()
  {
    int i = zzin.zza;
    Field localField2 = zzC(Buffer.class, "effectiveDirectAddress");
    Field localField1 = localField2;
    if (localField2 == null)
    {
      localField1 = zzC(Buffer.class, "address");
      if ((localField1 != null) && (localField1.getType() == Long.TYPE)) {
        return localField1;
      }
      localField1 = null;
    }
    return localField1;
  }
  
  /* Error */
  private static Field zzC(Class paramClass, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual 165	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
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
  
  private static void zzD(Object paramObject, long paramLong, byte paramByte)
  {
    long l = 0xFFFFFFFFFFFFFFFC & paramLong;
    zzmu localzzmu = zzf;
    int i = localzzmu.zzj(paramObject, l);
    int j = (((int)paramLong ^ 0xFFFFFFFF) & 0x3) << 3;
    localzzmu.zzn(paramObject, l, (0xFF & paramByte) << j | i & (255 << j ^ 0xFFFFFFFF));
  }
  
  private static void zzE(Object paramObject, long paramLong, byte paramByte)
  {
    long l = 0xFFFFFFFFFFFFFFFC & paramLong;
    zzmu localzzmu = zzf;
    int j = localzzmu.zzj(paramObject, l);
    int i = ((int)paramLong & 0x3) << 3;
    localzzmu.zzn(paramObject, l, (0xFF & paramByte) << i | j & (255 << i ^ 0xFFFFFFFF));
  }
  
  static double zza(Object paramObject, long paramLong)
  {
    return zzf.zza(paramObject, paramLong);
  }
  
  static float zzb(Object paramObject, long paramLong)
  {
    return zzf.zzb(paramObject, paramLong);
  }
  
  static int zzc(Object paramObject, long paramLong)
  {
    return zzf.zzj(paramObject, paramLong);
  }
  
  static long zzd(Object paramObject, long paramLong)
  {
    return zzf.zzk(paramObject, paramLong);
  }
  
  static Object zze(Class paramClass)
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
  
  static Object zzf(Object paramObject, long paramLong)
  {
    return zzf.zzm(paramObject, paramLong);
  }
  
  /* Error */
  static Unsafe zzg()
  {
    // Byte code:
    //   0: new 206	com/google/android/gms/internal/measurement/zzmr
    //   3: astore_0
    //   4: aload_0
    //   5: invokespecial 207	com/google/android/gms/internal/measurement/zzmr:<init>	()V
    //   8: aload_0
    //   9: invokestatic 213	java/security/AccessController:doPrivileged	(Ljava/security/PrivilegedExceptionAction;)Ljava/lang/Object;
    //   12: checkcast 193	sun/misc/Unsafe
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
  
  static void zzm(Object paramObject, long paramLong, boolean paramBoolean)
  {
    zzf.zzc(paramObject, paramLong, paramBoolean);
  }
  
  static void zzn(byte[] paramArrayOfByte, long paramLong, byte paramByte)
  {
    zzf.zzd(paramArrayOfByte, zza + paramLong, paramByte);
  }
  
  static void zzo(Object paramObject, long paramLong, double paramDouble)
  {
    zzf.zze(paramObject, paramLong, paramDouble);
  }
  
  static void zzp(Object paramObject, long paramLong, float paramFloat)
  {
    zzf.zzf(paramObject, paramLong, paramFloat);
  }
  
  static void zzq(Object paramObject, long paramLong, int paramInt)
  {
    zzf.zzn(paramObject, paramLong, paramInt);
  }
  
  static void zzr(Object paramObject, long paramLong1, long paramLong2)
  {
    zzf.zzo(paramObject, paramLong1, paramLong2);
  }
  
  static void zzs(Object paramObject1, long paramLong, Object paramObject2)
  {
    zzf.zzp(paramObject1, paramLong, paramObject2);
  }
  
  static boolean zzv(Class paramClass)
  {
    int i = zzin.zza;
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
  
  static boolean zzw(Object paramObject, long paramLong)
  {
    return zzf.zzg(paramObject, paramLong);
  }
  
  static boolean zzx()
  {
    return zzh;
  }
  
  static boolean zzy()
  {
    return zzg;
  }
  
  private static int zzz(Class paramClass)
  {
    if (zzh) {
      return zzf.zzh(paramClass);
    }
    return -1;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzmv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */