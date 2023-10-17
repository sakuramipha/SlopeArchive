package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class zzgow<MessageType extends zzgow<MessageType, BuilderType>, BuilderType extends zzgos<MessageType, BuilderType>>
  extends zzgmx<MessageType, BuilderType>
{
  private static final Map zzb = new ConcurrentHashMap();
  protected zzgrr zzc = zzgrr.zzc();
  private int zzd = -1;
  
  private final int zza(zzgqz paramzzgqz)
  {
    if (paramzzgqz == null)
    {
      paramzzgqz = getClass();
      return zzgqo.zza().zzb(paramzzgqz).zza(this);
    }
    return paramzzgqz.zza(this);
  }
  
  static zzgow zzaC(Class paramClass)
  {
    Map localMap = zzb;
    Object localObject2 = (zzgow)localMap.get(paramClass);
    Object localObject1 = localObject2;
    if (localObject2 == null) {
      try
      {
        Class.forName(paramClass.getName(), true, paramClass.getClassLoader());
        localObject1 = (zzgow)localMap.get(paramClass);
      }
      catch (ClassNotFoundException paramClass)
      {
        throw new IllegalStateException("Class initialization cannot fail.", paramClass);
      }
    }
    localObject2 = localObject1;
    if (localObject1 == null)
    {
      localObject2 = (zzgow)((zzgow)zzgsa.zzg(paramClass)).zzb(6, null, null);
      if (localObject2 != null) {
        localMap.put(paramClass, localObject2);
      } else {
        throw new IllegalStateException();
      }
    }
    return (zzgow)localObject2;
  }
  
  /* Error */
  protected static zzgow zzaE(zzgow paramzzgow, zzgno paramzzgno)
    throws zzgpi
  {
    // Byte code:
    //   0: getstatic 112	com/google/android/gms/internal/ads/zzgoi:zza	Lcom/google/android/gms/internal/ads/zzgoi;
    //   3: astore_3
    //   4: aload_1
    //   5: invokevirtual 118	com/google/android/gms/internal/ads/zzgno:zzl	()Lcom/google/android/gms/internal/ads/zzgnw;
    //   8: astore_1
    //   9: aload_0
    //   10: invokevirtual 122	com/google/android/gms/internal/ads/zzgow:zzaD	()Lcom/google/android/gms/internal/ads/zzgow;
    //   13: astore_2
    //   14: invokestatic 44	com/google/android/gms/internal/ads/zzgqo:zza	()Lcom/google/android/gms/internal/ads/zzgqo;
    //   17: aload_2
    //   18: invokevirtual 39	java/lang/Object:getClass	()Ljava/lang/Class;
    //   21: invokevirtual 47	com/google/android/gms/internal/ads/zzgqo:zzb	(Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/zzgqz;
    //   24: astore_0
    //   25: aload_0
    //   26: aload_2
    //   27: aload_1
    //   28: invokestatic 128	com/google/android/gms/internal/ads/zzgnx:zzq	(Lcom/google/android/gms/internal/ads/zzgnw;)Lcom/google/android/gms/internal/ads/zzgnx;
    //   31: aload_3
    //   32: invokeinterface 132 4 0
    //   37: aload_0
    //   38: aload_2
    //   39: invokeinterface 136 2 0
    //   44: aload_1
    //   45: iconst_0
    //   46: invokevirtual 142	com/google/android/gms/internal/ads/zzgnw:zzz	(I)V
    //   49: aload_2
    //   50: invokestatic 145	com/google/android/gms/internal/ads/zzgow:zzc	(Lcom/google/android/gms/internal/ads/zzgow;)Lcom/google/android/gms/internal/ads/zzgow;
    //   53: pop
    //   54: aload_2
    //   55: invokestatic 145	com/google/android/gms/internal/ads/zzgow:zzc	(Lcom/google/android/gms/internal/ads/zzgow;)Lcom/google/android/gms/internal/ads/zzgow;
    //   58: pop
    //   59: aload_2
    //   60: areturn
    //   61: astore_0
    //   62: aload_0
    //   63: aload_2
    //   64: invokevirtual 148	com/google/android/gms/internal/ads/zzgpi:zzh	(Lcom/google/android/gms/internal/ads/zzgqg;)Lcom/google/android/gms/internal/ads/zzgpi;
    //   67: pop
    //   68: aload_0
    //   69: athrow
    //   70: astore_0
    //   71: aload_0
    //   72: invokevirtual 152	java/lang/RuntimeException:getCause	()Ljava/lang/Throwable;
    //   75: instanceof 101
    //   78: ifeq +11 -> 89
    //   81: aload_0
    //   82: invokevirtual 152	java/lang/RuntimeException:getCause	()Ljava/lang/Throwable;
    //   85: checkcast 101	com/google/android/gms/internal/ads/zzgpi
    //   88: athrow
    //   89: aload_0
    //   90: athrow
    //   91: astore_0
    //   92: aload_0
    //   93: invokevirtual 153	java/io/IOException:getCause	()Ljava/lang/Throwable;
    //   96: instanceof 101
    //   99: ifeq +11 -> 110
    //   102: aload_0
    //   103: invokevirtual 153	java/io/IOException:getCause	()Ljava/lang/Throwable;
    //   106: checkcast 101	com/google/android/gms/internal/ads/zzgpi
    //   109: athrow
    //   110: new 101	com/google/android/gms/internal/ads/zzgpi
    //   113: dup
    //   114: aload_0
    //   115: invokespecial 156	com/google/android/gms/internal/ads/zzgpi:<init>	(Ljava/io/IOException;)V
    //   118: astore_0
    //   119: aload_0
    //   120: aload_2
    //   121: invokevirtual 148	com/google/android/gms/internal/ads/zzgpi:zzh	(Lcom/google/android/gms/internal/ads/zzgqg;)Lcom/google/android/gms/internal/ads/zzgpi;
    //   124: pop
    //   125: aload_0
    //   126: athrow
    //   127: astore_0
    //   128: aload_0
    //   129: invokevirtual 159	com/google/android/gms/internal/ads/zzgrp:zza	()Lcom/google/android/gms/internal/ads/zzgpi;
    //   132: astore_0
    //   133: aload_0
    //   134: aload_2
    //   135: invokevirtual 148	com/google/android/gms/internal/ads/zzgpi:zzh	(Lcom/google/android/gms/internal/ads/zzgqg;)Lcom/google/android/gms/internal/ads/zzgpi;
    //   138: pop
    //   139: aload_0
    //   140: athrow
    //   141: astore_0
    //   142: aload_0
    //   143: astore_1
    //   144: aload_0
    //   145: invokevirtual 162	com/google/android/gms/internal/ads/zzgpi:zzl	()Z
    //   148: ifeq +12 -> 160
    //   151: new 101	com/google/android/gms/internal/ads/zzgpi
    //   154: dup
    //   155: aload_0
    //   156: invokespecial 156	com/google/android/gms/internal/ads/zzgpi:<init>	(Ljava/io/IOException;)V
    //   159: astore_1
    //   160: aload_1
    //   161: aload_2
    //   162: invokevirtual 148	com/google/android/gms/internal/ads/zzgpi:zzh	(Lcom/google/android/gms/internal/ads/zzgqg;)Lcom/google/android/gms/internal/ads/zzgpi;
    //   165: pop
    //   166: aload_1
    //   167: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	168	0	paramzzgow	zzgow
    //   0	168	1	paramzzgno	zzgno
    //   13	149	2	localzzgow	zzgow
    //   3	29	3	localzzgoi	zzgoi
    // Exception table:
    //   from	to	target	type
    //   44	49	61	com/google/android/gms/internal/ads/zzgpi
    //   14	44	70	java/lang/RuntimeException
    //   14	44	91	java/io/IOException
    //   14	44	127	com/google/android/gms/internal/ads/zzgrp
    //   14	44	141	com/google/android/gms/internal/ads/zzgpi
  }
  
  protected static zzgow zzaF(zzgow paramzzgow, byte[] paramArrayOfByte)
    throws zzgpi
  {
    paramzzgow = zzd(paramzzgow, paramArrayOfByte, 0, paramArrayOfByte.length, zzgoi.zza);
    zzc(paramzzgow);
    return paramzzgow;
  }
  
  /* Error */
  protected static zzgow zzaG(zzgow paramzzgow, zzgno paramzzgno, zzgoi paramzzgoi)
    throws zzgpi
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 118	com/google/android/gms/internal/ads/zzgno:zzl	()Lcom/google/android/gms/internal/ads/zzgnw;
    //   4: astore_1
    //   5: aload_0
    //   6: invokevirtual 122	com/google/android/gms/internal/ads/zzgow:zzaD	()Lcom/google/android/gms/internal/ads/zzgow;
    //   9: astore_3
    //   10: invokestatic 44	com/google/android/gms/internal/ads/zzgqo:zza	()Lcom/google/android/gms/internal/ads/zzgqo;
    //   13: aload_3
    //   14: invokevirtual 39	java/lang/Object:getClass	()Ljava/lang/Class;
    //   17: invokevirtual 47	com/google/android/gms/internal/ads/zzgqo:zzb	(Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/zzgqz;
    //   20: astore_0
    //   21: aload_0
    //   22: aload_3
    //   23: aload_1
    //   24: invokestatic 128	com/google/android/gms/internal/ads/zzgnx:zzq	(Lcom/google/android/gms/internal/ads/zzgnw;)Lcom/google/android/gms/internal/ads/zzgnx;
    //   27: aload_2
    //   28: invokeinterface 132 4 0
    //   33: aload_0
    //   34: aload_3
    //   35: invokeinterface 136 2 0
    //   40: aload_1
    //   41: iconst_0
    //   42: invokevirtual 142	com/google/android/gms/internal/ads/zzgnw:zzz	(I)V
    //   45: aload_3
    //   46: invokestatic 145	com/google/android/gms/internal/ads/zzgow:zzc	(Lcom/google/android/gms/internal/ads/zzgow;)Lcom/google/android/gms/internal/ads/zzgow;
    //   49: pop
    //   50: aload_3
    //   51: areturn
    //   52: astore_0
    //   53: aload_0
    //   54: aload_3
    //   55: invokevirtual 148	com/google/android/gms/internal/ads/zzgpi:zzh	(Lcom/google/android/gms/internal/ads/zzgqg;)Lcom/google/android/gms/internal/ads/zzgpi;
    //   58: pop
    //   59: aload_0
    //   60: athrow
    //   61: astore_0
    //   62: aload_0
    //   63: invokevirtual 152	java/lang/RuntimeException:getCause	()Ljava/lang/Throwable;
    //   66: instanceof 101
    //   69: ifeq +11 -> 80
    //   72: aload_0
    //   73: invokevirtual 152	java/lang/RuntimeException:getCause	()Ljava/lang/Throwable;
    //   76: checkcast 101	com/google/android/gms/internal/ads/zzgpi
    //   79: athrow
    //   80: aload_0
    //   81: athrow
    //   82: astore_0
    //   83: aload_0
    //   84: invokevirtual 153	java/io/IOException:getCause	()Ljava/lang/Throwable;
    //   87: instanceof 101
    //   90: ifeq +11 -> 101
    //   93: aload_0
    //   94: invokevirtual 153	java/io/IOException:getCause	()Ljava/lang/Throwable;
    //   97: checkcast 101	com/google/android/gms/internal/ads/zzgpi
    //   100: athrow
    //   101: new 101	com/google/android/gms/internal/ads/zzgpi
    //   104: dup
    //   105: aload_0
    //   106: invokespecial 156	com/google/android/gms/internal/ads/zzgpi:<init>	(Ljava/io/IOException;)V
    //   109: astore_0
    //   110: aload_0
    //   111: aload_3
    //   112: invokevirtual 148	com/google/android/gms/internal/ads/zzgpi:zzh	(Lcom/google/android/gms/internal/ads/zzgqg;)Lcom/google/android/gms/internal/ads/zzgpi;
    //   115: pop
    //   116: aload_0
    //   117: athrow
    //   118: astore_0
    //   119: aload_0
    //   120: invokevirtual 159	com/google/android/gms/internal/ads/zzgrp:zza	()Lcom/google/android/gms/internal/ads/zzgpi;
    //   123: astore_0
    //   124: aload_0
    //   125: aload_3
    //   126: invokevirtual 148	com/google/android/gms/internal/ads/zzgpi:zzh	(Lcom/google/android/gms/internal/ads/zzgqg;)Lcom/google/android/gms/internal/ads/zzgpi;
    //   129: pop
    //   130: aload_0
    //   131: athrow
    //   132: astore_1
    //   133: aload_1
    //   134: astore_0
    //   135: aload_1
    //   136: invokevirtual 162	com/google/android/gms/internal/ads/zzgpi:zzl	()Z
    //   139: ifeq +12 -> 151
    //   142: new 101	com/google/android/gms/internal/ads/zzgpi
    //   145: dup
    //   146: aload_1
    //   147: invokespecial 156	com/google/android/gms/internal/ads/zzgpi:<init>	(Ljava/io/IOException;)V
    //   150: astore_0
    //   151: aload_0
    //   152: aload_3
    //   153: invokevirtual 148	com/google/android/gms/internal/ads/zzgpi:zzh	(Lcom/google/android/gms/internal/ads/zzgqg;)Lcom/google/android/gms/internal/ads/zzgpi;
    //   156: pop
    //   157: aload_0
    //   158: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	159	0	paramzzgow	zzgow
    //   0	159	1	paramzzgno	zzgno
    //   0	159	2	paramzzgoi	zzgoi
    //   9	144	3	localzzgow	zzgow
    // Exception table:
    //   from	to	target	type
    //   40	45	52	com/google/android/gms/internal/ads/zzgpi
    //   10	40	61	java/lang/RuntimeException
    //   10	40	82	java/io/IOException
    //   10	40	118	com/google/android/gms/internal/ads/zzgrp
    //   10	40	132	com/google/android/gms/internal/ads/zzgpi
  }
  
  protected static zzgow zzaH(zzgow paramzzgow, InputStream paramInputStream, zzgoi paramzzgoi)
    throws zzgpi
  {
    paramInputStream = zzgnw.zzH(paramInputStream, 4096);
    zzgow localzzgow = paramzzgow.zzaD();
    try
    {
      paramzzgow = zzgqo.zza().zzb(localzzgow.getClass());
      paramzzgow.zzh(localzzgow, zzgnx.zzq(paramInputStream), paramzzgoi);
      paramzzgow.zzf(localzzgow);
      zzc(localzzgow);
      return localzzgow;
    }
    catch (RuntimeException paramzzgow)
    {
      if ((paramzzgow.getCause() instanceof zzgpi)) {
        throw ((zzgpi)paramzzgow.getCause());
      }
      throw paramzzgow;
    }
    catch (IOException paramzzgow)
    {
      if ((paramzzgow.getCause() instanceof zzgpi)) {
        throw ((zzgpi)paramzzgow.getCause());
      }
      paramzzgow = new zzgpi(paramzzgow);
      paramzzgow.zzh(localzzgow);
      throw paramzzgow;
    }
    catch (zzgrp paramzzgow)
    {
      paramzzgow = paramzzgow.zza();
      paramzzgow.zzh(localzzgow);
      throw paramzzgow;
    }
    catch (zzgpi paramzzgow)
    {
      paramInputStream = paramzzgow;
      if (paramzzgow.zzl()) {
        paramInputStream = new zzgpi(paramzzgow);
      }
      paramInputStream.zzh(localzzgow);
      throw paramInputStream;
    }
  }
  
  protected static zzgow zzaI(zzgow paramzzgow, byte[] paramArrayOfByte, zzgoi paramzzgoi)
    throws zzgpi
  {
    paramzzgow = zzd(paramzzgow, paramArrayOfByte, 0, paramArrayOfByte.length, paramzzgoi);
    zzc(paramzzgow);
    return paramzzgow;
  }
  
  protected static zzgpb zzaJ()
  {
    return zzgox.zzf();
  }
  
  protected static zzgpb zzaK(zzgpb paramzzgpb)
  {
    int i = paramzzgpb.size();
    if (i == 0) {
      i = 10;
    } else {
      i += i;
    }
    return paramzzgpb.zzg(i);
  }
  
  protected static zzgpe zzaL()
  {
    return zzgpv.zzf();
  }
  
  protected static zzgpe zzaM(zzgpe paramzzgpe)
  {
    int i = paramzzgpe.size();
    if (i == 0) {
      i = 10;
    } else {
      i += i;
    }
    return paramzzgpe.zza(i);
  }
  
  protected static zzgpf zzaN()
  {
    return zzgqp.zze();
  }
  
  protected static zzgpf zzaO(zzgpf paramzzgpf)
  {
    int i = paramzzgpf.size();
    if (i == 0) {
      i = 10;
    } else {
      i += i;
    }
    return paramzzgpf.zzd(i);
  }
  
  static Object zzaQ(Method paramMethod, Object paramObject, Object... paramVarArgs)
  {
    try
    {
      paramMethod = paramMethod.invoke(paramObject, paramVarArgs);
      return paramMethod;
    }
    catch (InvocationTargetException paramMethod)
    {
      paramMethod = paramMethod.getCause();
      if (!(paramMethod instanceof RuntimeException))
      {
        if ((paramMethod instanceof Error)) {
          throw ((Error)paramMethod);
        }
        throw new RuntimeException("Unexpected exception thrown by generated accessor method.", paramMethod);
      }
      throw ((RuntimeException)paramMethod);
    }
    catch (IllegalAccessException paramMethod)
    {
      throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", paramMethod);
    }
  }
  
  protected static Object zzaR(zzgqg paramzzgqg, String paramString, Object[] paramArrayOfObject)
  {
    return new zzgqq(paramzzgqg, paramString, paramArrayOfObject);
  }
  
  protected static void zzaU(Class paramClass, zzgow paramzzgow)
  {
    paramzzgow.zzaT();
    zzb.put(paramClass, paramzzgow);
  }
  
  private static zzgow zzc(zzgow paramzzgow)
    throws zzgpi
  {
    if ((paramzzgow != null) && (!paramzzgow.zzaX()))
    {
      zzgpi localzzgpi = new zzgrp(paramzzgow).zza();
      localzzgpi.zzh(paramzzgow);
      throw localzzgpi;
    }
    return paramzzgow;
  }
  
  private static zzgow zzd(zzgow paramzzgow, byte[] paramArrayOfByte, int paramInt1, int paramInt2, zzgoi paramzzgoi)
    throws zzgpi
  {
    zzgow localzzgow = paramzzgow.zzaD();
    try
    {
      zzgqz localzzgqz = zzgqo.zza().zzb(localzzgow.getClass());
      paramzzgow = new com/google/android/gms/internal/ads/zzgna;
      paramzzgow.<init>(paramzzgoi);
      localzzgqz.zzi(localzzgow, paramArrayOfByte, 0, paramInt2, paramzzgow);
      localzzgqz.zzf(localzzgow);
      return localzzgow;
    }
    catch (IndexOutOfBoundsException paramzzgow)
    {
      paramzzgow = zzgpi.zzj();
      paramzzgow.zzh(localzzgow);
      throw paramzzgow;
    }
    catch (IOException paramzzgow)
    {
      if ((paramzzgow.getCause() instanceof zzgpi)) {
        throw ((zzgpi)paramzzgow.getCause());
      }
      paramzzgow = new zzgpi(paramzzgow);
      paramzzgow.zzh(localzzgow);
      throw paramzzgow;
    }
    catch (zzgrp paramzzgow)
    {
      paramzzgow = paramzzgow.zza();
      paramzzgow.zzh(localzzgow);
      throw paramzzgow;
    }
    catch (zzgpi paramzzgow)
    {
      paramArrayOfByte = paramzzgow;
      if (paramzzgow.zzl()) {
        paramArrayOfByte = new zzgpi(paramzzgow);
      }
      paramArrayOfByte.zzh(localzzgow);
      throw paramArrayOfByte;
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (paramObject == null) {
      return false;
    }
    if (getClass() != paramObject.getClass()) {
      return false;
    }
    Class localClass = getClass();
    return zzgqo.zza().zzb(localClass).zzj(this, (zzgow)paramObject);
  }
  
  public final int hashCode()
  {
    if (!zzaY())
    {
      int j = this.zza;
      int i = j;
      if (j == 0)
      {
        i = zzay();
        this.zza = i;
      }
      return i;
    }
    return zzay();
  }
  
  public final String toString()
  {
    return zzgqi.zza(this, super.toString());
  }
  
  protected final zzgos zzaA()
  {
    return (zzgos)zzb(5, null, null);
  }
  
  public final zzgos zzaB()
  {
    zzgos localzzgos = (zzgos)zzb(5, null, null);
    localzzgos.zzaj(this);
    return localzzgos;
  }
  
  final zzgow zzaD()
  {
    return (zzgow)zzb(4, null, null);
  }
  
  protected final void zzaS()
  {
    zzgqo.zza().zzb(getClass()).zzf(this);
    zzaT();
  }
  
  final void zzaT()
  {
    this.zzd &= 0x7FFFFFFF;
  }
  
  final void zzaV(int paramInt)
  {
    this.zzd = (this.zzd & 0x80000000 | 0x7FFFFFFF);
  }
  
  public final void zzaW(zzgod paramzzgod)
    throws IOException
  {
    zzgqo.zza().zzb(getClass()).zzm(this, zzgoe.zza(paramzzgod));
  }
  
  public final boolean zzaX()
  {
    Object localObject = Boolean.TRUE;
    boolean bool = true;
    int i = ((Byte)zzb(1, null, null)).byteValue();
    if (i != 1)
    {
      if (i == 0) {
        bool = false;
      }
    }
    else {
      return bool;
    }
    localObject = getClass();
    bool = zzgqo.zza().zzb((Class)localObject).zzk(this);
    if (true != bool) {
      localObject = null;
    } else {
      localObject = this;
    }
    zzb(2, localObject, null);
    return bool;
  }
  
  final boolean zzaY()
  {
    return (this.zzd & 0x80000000) != 0;
  }
  
  final int zzat(zzgqz paramzzgqz)
  {
    if (zzaY())
    {
      i = zza(paramzzgqz);
      if (i >= 0) {
        return i;
      }
      paramzzgqz = new StringBuilder();
      paramzzgqz.append("serialized size must be non-negative, was ");
      paramzzgqz.append(i);
      throw new IllegalStateException(paramzzgqz.toString());
    }
    int i = this.zzd & 0x7FFFFFFF;
    if (i != Integer.MAX_VALUE) {
      return i;
    }
    i = zza(paramzzgqz);
    if (i >= 0)
    {
      this.zzd = (this.zzd & 0x80000000 | i);
      return i;
    }
    paramzzgqz = new StringBuilder();
    paramzzgqz.append("serialized size must be non-negative, was ");
    paramzzgqz.append(i);
    throw new IllegalStateException(paramzzgqz.toString());
  }
  
  final int zzay()
  {
    return zzgqo.zza().zzb(getClass()).zzb(this);
  }
  
  public final int zzaz()
  {
    int i;
    if (zzaY())
    {
      i = zza(null);
      if (i < 0)
      {
        localStringBuilder = new StringBuilder();
        localStringBuilder.append("serialized size must be non-negative, was ");
        localStringBuilder.append(i);
        throw new IllegalStateException(localStringBuilder.toString());
      }
    }
    else
    {
      i = this.zzd & 0x7FFFFFFF;
      if (i == Integer.MAX_VALUE)
      {
        i = zza(null);
        if (i < 0) {
          break label99;
        }
        this.zzd = (this.zzd & 0x80000000 | i);
      }
    }
    return i;
    label99:
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("serialized size must be non-negative, was ");
    localStringBuilder.append(i);
    throw new IllegalStateException(localStringBuilder.toString());
  }
  
  protected abstract Object zzb(int paramInt, Object paramObject1, Object paramObject2);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgow.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */