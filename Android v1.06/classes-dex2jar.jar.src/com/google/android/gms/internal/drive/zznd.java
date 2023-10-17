package com.google.android.gms.internal.drive;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

final class zznd
{
  private static final Logger logger = Logger.getLogger(zznd.class.getName());
  private static final Class<?> zzni;
  private static final boolean zzog;
  private static final Unsafe zzuc;
  private static final boolean zzvy;
  private static final boolean zzvz;
  private static final zzd zzwa;
  private static final boolean zzwb;
  private static final long zzwc;
  private static final long zzwd;
  private static final long zzwe;
  private static final long zzwf;
  private static final long zzwg;
  private static final long zzwh;
  private static final long zzwi;
  private static final long zzwj;
  private static final long zzwk;
  private static final long zzwl;
  private static final long zzwm;
  private static final long zzwn;
  private static final long zzwo;
  private static final long zzwp;
  private static final int zzwq;
  static final boolean zzwr;
  
  static
  {
    Object localObject2 = zzff();
    zzuc = (Unsafe)localObject2;
    zzni = zzix.zzbs();
    boolean bool1 = zzk(Long.TYPE);
    zzvy = bool1;
    boolean bool2 = zzk(Integer.TYPE);
    zzvz = bool2;
    Object localObject1 = null;
    if (localObject2 != null) {
      if (zzix.zzbr())
      {
        if (bool1) {
          localObject1 = new zzb((Unsafe)localObject2);
        } else if (bool2) {
          localObject1 = new zza((Unsafe)localObject2);
        }
      }
      else {
        localObject1 = new zzc((Unsafe)localObject2);
      }
    }
    zzwa = (zzd)localObject1;
    zzwb = zzfh();
    zzog = zzfg();
    long l2 = zzi(byte[].class);
    zzwc = l2;
    zzwd = zzi(boolean[].class);
    zzwe = zzj(boolean[].class);
    zzwf = zzi(int[].class);
    zzwg = zzj(int[].class);
    zzwh = zzi(long[].class);
    zzwi = zzj(long[].class);
    zzwj = zzi(float[].class);
    zzwk = zzj(float[].class);
    zzwl = zzi(double[].class);
    zzwm = zzj(double[].class);
    zzwn = zzi(Object[].class);
    zzwo = zzj(Object[].class);
    localObject2 = zzfi();
    long l1;
    if ((localObject2 != null) && (localObject1 != null)) {
      l1 = ((zzd)localObject1).zzws.objectFieldOffset((Field)localObject2);
    } else {
      l1 = -1L;
    }
    zzwp = l1;
    zzwq = (int)(0x7 & l2);
    if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    zzwr = bool1;
  }
  
  static byte zza(byte[] paramArrayOfByte, long paramLong)
  {
    return zzwa.zzx(paramArrayOfByte, zzwc + paramLong);
  }
  
  private static void zza(Object paramObject, long paramLong, byte paramByte)
  {
    long l = 0xFFFFFFFFFFFFFFFC & paramLong;
    int i = zzj(paramObject, l);
    int j = (((int)paramLong ^ 0xFFFFFFFF) & 0x3) << 3;
    zza(paramObject, l, (0xFF & paramByte) << j | i & (255 << j ^ 0xFFFFFFFF));
  }
  
  static void zza(Object paramObject, long paramLong, double paramDouble)
  {
    zzwa.zza(paramObject, paramLong, paramDouble);
  }
  
  static void zza(Object paramObject, long paramLong, float paramFloat)
  {
    zzwa.zza(paramObject, paramLong, paramFloat);
  }
  
  static void zza(Object paramObject, long paramLong, int paramInt)
  {
    zzwa.zza(paramObject, paramLong, paramInt);
  }
  
  static void zza(Object paramObject, long paramLong1, long paramLong2)
  {
    zzwa.zza(paramObject, paramLong1, paramLong2);
  }
  
  static void zza(Object paramObject1, long paramLong, Object paramObject2)
  {
    zzwa.zzws.putObject(paramObject1, paramLong, paramObject2);
  }
  
  static void zza(Object paramObject, long paramLong, boolean paramBoolean)
  {
    zzwa.zza(paramObject, paramLong, paramBoolean);
  }
  
  static void zza(byte[] paramArrayOfByte, long paramLong, byte paramByte)
  {
    zzwa.zze(paramArrayOfByte, zzwc + paramLong, paramByte);
  }
  
  /* Error */
  private static Field zzb(Class<?> paramClass, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual 240	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   5: astore_0
    //   6: goto +6 -> 12
    //   9: astore_0
    //   10: aconst_null
    //   11: astore_0
    //   12: aload_0
    //   13: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	14	0	paramClass	Class<?>
    //   0	14	1	paramString	String
    // Exception table:
    //   from	to	target	type
    //   0	6	9	finally
  }
  
  private static void zzb(Object paramObject, long paramLong, byte paramByte)
  {
    long l = 0xFFFFFFFFFFFFFFFC & paramLong;
    int i = zzj(paramObject, l);
    int j = ((int)paramLong & 0x3) << 3;
    zza(paramObject, l, (0xFF & paramByte) << j | i & (255 << j ^ 0xFFFFFFFF));
  }
  
  private static void zzb(Object paramObject, long paramLong, boolean paramBoolean)
  {
    zza(paramObject, paramLong, (byte)paramBoolean);
  }
  
  private static void zzc(Object paramObject, long paramLong, boolean paramBoolean)
  {
    zzb(paramObject, paramLong, (byte)paramBoolean);
  }
  
  static boolean zzfd()
  {
    return zzog;
  }
  
  static boolean zzfe()
  {
    return zzwb;
  }
  
  /* Error */
  static Unsafe zzff()
  {
    // Byte code:
    //   0: new 253	com/google/android/gms/internal/drive/zzne
    //   3: astore_0
    //   4: aload_0
    //   5: invokespecial 254	com/google/android/gms/internal/drive/zzne:<init>	()V
    //   8: aload_0
    //   9: invokestatic 260	java/security/AccessController:doPrivileged	(Ljava/security/PrivilegedExceptionAction;)Ljava/lang/Object;
    //   12: checkcast 172	sun/misc/Unsafe
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
  
  private static boolean zzfg()
  {
    Object localObject1 = zzuc;
    if (localObject1 == null) {
      return false;
    }
    try
    {
      localObject1 = localObject1.getClass();
      ((Class)localObject1).getMethod("objectFieldOffset", new Class[] { Field.class });
      ((Class)localObject1).getMethod("arrayBaseOffset", new Class[] { Class.class });
      ((Class)localObject1).getMethod("arrayIndexScale", new Class[] { Class.class });
      ((Class)localObject1).getMethod("getInt", new Class[] { Object.class, Long.TYPE });
      ((Class)localObject1).getMethod("putInt", new Class[] { Object.class, Long.TYPE, Integer.TYPE });
      ((Class)localObject1).getMethod("getLong", new Class[] { Object.class, Long.TYPE });
      ((Class)localObject1).getMethod("putLong", new Class[] { Object.class, Long.TYPE, Long.TYPE });
      ((Class)localObject1).getMethod("getObject", new Class[] { Object.class, Long.TYPE });
      ((Class)localObject1).getMethod("putObject", new Class[] { Object.class, Long.TYPE, Object.class });
      if (zzix.zzbr()) {
        return true;
      }
      ((Class)localObject1).getMethod("getByte", new Class[] { Object.class, Long.TYPE });
      ((Class)localObject1).getMethod("putByte", new Class[] { Object.class, Long.TYPE, Byte.TYPE });
      ((Class)localObject1).getMethod("getBoolean", new Class[] { Object.class, Long.TYPE });
      ((Class)localObject1).getMethod("putBoolean", new Class[] { Object.class, Long.TYPE, Boolean.TYPE });
      ((Class)localObject1).getMethod("getFloat", new Class[] { Object.class, Long.TYPE });
      ((Class)localObject1).getMethod("putFloat", new Class[] { Object.class, Long.TYPE, Float.TYPE });
      ((Class)localObject1).getMethod("getDouble", new Class[] { Object.class, Long.TYPE });
      ((Class)localObject1).getMethod("putDouble", new Class[] { Object.class, Long.TYPE, Double.TYPE });
      return true;
    }
    finally
    {
      Logger localLogger = logger;
      localObject1 = Level.WARNING;
      String str = String.valueOf(localObject2);
      StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 71);
      localStringBuilder.append("platform method missing - proto runtime falling back to safer methods: ");
      localStringBuilder.append(str);
      localLogger.logp((Level)localObject1, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", localStringBuilder.toString());
    }
    return false;
  }
  
  private static boolean zzfh()
  {
    Object localObject1 = zzuc;
    if (localObject1 == null) {
      return false;
    }
    try
    {
      localObject1 = localObject1.getClass();
      ((Class)localObject1).getMethod("objectFieldOffset", new Class[] { Field.class });
      ((Class)localObject1).getMethod("getLong", new Class[] { Object.class, Long.TYPE });
      if (zzfi() == null) {
        return false;
      }
      if (zzix.zzbr()) {
        return true;
      }
      ((Class)localObject1).getMethod("getByte", new Class[] { Long.TYPE });
      ((Class)localObject1).getMethod("putByte", new Class[] { Long.TYPE, Byte.TYPE });
      ((Class)localObject1).getMethod("getInt", new Class[] { Long.TYPE });
      ((Class)localObject1).getMethod("putInt", new Class[] { Long.TYPE, Integer.TYPE });
      ((Class)localObject1).getMethod("getLong", new Class[] { Long.TYPE });
      ((Class)localObject1).getMethod("putLong", new Class[] { Long.TYPE, Long.TYPE });
      ((Class)localObject1).getMethod("copyMemory", new Class[] { Long.TYPE, Long.TYPE, Long.TYPE });
      ((Class)localObject1).getMethod("copyMemory", new Class[] { Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE });
      return true;
    }
    finally
    {
      localObject1 = logger;
      Level localLevel = Level.WARNING;
      String str = String.valueOf(localObject2);
      StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 71);
      localStringBuilder.append("platform method missing - proto runtime falling back to safer methods: ");
      localStringBuilder.append(str);
      ((Logger)localObject1).logp(localLevel, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", localStringBuilder.toString());
    }
    return false;
  }
  
  private static Field zzfi()
  {
    if (zzix.zzbr())
    {
      localField = zzb(Buffer.class, "effectiveDirectAddress");
      if (localField != null) {
        return localField;
      }
    }
    Field localField = zzb(Buffer.class, "address");
    if ((localField != null) && (localField.getType() == Long.TYPE)) {
      return localField;
    }
    return null;
  }
  
  static <T> T zzh(Class<T> paramClass)
  {
    try
    {
      paramClass = zzuc.allocateInstance(paramClass);
      return paramClass;
    }
    catch (InstantiationException paramClass)
    {
      throw new IllegalStateException(paramClass);
    }
  }
  
  private static int zzi(Class<?> paramClass)
  {
    if (zzog) {
      return zzwa.zzws.arrayBaseOffset(paramClass);
    }
    return -1;
  }
  
  private static int zzj(Class<?> paramClass)
  {
    if (zzog) {
      return zzwa.zzws.arrayIndexScale(paramClass);
    }
    return -1;
  }
  
  static int zzj(Object paramObject, long paramLong)
  {
    return zzwa.zzj(paramObject, paramLong);
  }
  
  static long zzk(Object paramObject, long paramLong)
  {
    return zzwa.zzk(paramObject, paramLong);
  }
  
  private static boolean zzk(Class<?> paramClass)
  {
    if (!zzix.zzbr()) {
      return false;
    }
    try
    {
      Class localClass = zzni;
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
  
  static boolean zzl(Object paramObject, long paramLong)
  {
    return zzwa.zzl(paramObject, paramLong);
  }
  
  static float zzm(Object paramObject, long paramLong)
  {
    return zzwa.zzm(paramObject, paramLong);
  }
  
  static double zzn(Object paramObject, long paramLong)
  {
    return zzwa.zzn(paramObject, paramLong);
  }
  
  static Object zzo(Object paramObject, long paramLong)
  {
    return zzwa.zzws.getObject(paramObject, paramLong);
  }
  
  private static byte zzp(Object paramObject, long paramLong)
  {
    return (byte)(zzj(paramObject, 0xFFFFFFFFFFFFFFFC & paramLong) >>> (int)(((paramLong ^ 0xFFFFFFFFFFFFFFFF) & 0x3) << 3));
  }
  
  private static byte zzq(Object paramObject, long paramLong)
  {
    return (byte)(zzj(paramObject, 0xFFFFFFFFFFFFFFFC & paramLong) >>> (int)((paramLong & 0x3) << 3));
  }
  
  private static boolean zzr(Object paramObject, long paramLong)
  {
    return zzp(paramObject, paramLong) != 0;
  }
  
  private static boolean zzs(Object paramObject, long paramLong)
  {
    return zzq(paramObject, paramLong) != 0;
  }
  
  static final class zza
    extends zznd.zzd
  {
    zza(Unsafe paramUnsafe)
    {
      super();
    }
    
    public final void zza(Object paramObject, long paramLong, double paramDouble)
    {
      zza(paramObject, paramLong, Double.doubleToLongBits(paramDouble));
    }
    
    public final void zza(Object paramObject, long paramLong, float paramFloat)
    {
      zza(paramObject, paramLong, Float.floatToIntBits(paramFloat));
    }
    
    public final void zza(Object paramObject, long paramLong, boolean paramBoolean)
    {
      if (zznd.zzwr)
      {
        zznd.zzd(paramObject, paramLong, paramBoolean);
        return;
      }
      zznd.zze(paramObject, paramLong, paramBoolean);
    }
    
    public final void zze(Object paramObject, long paramLong, byte paramByte)
    {
      if (zznd.zzwr)
      {
        zznd.zzc(paramObject, paramLong, paramByte);
        return;
      }
      zznd.zzd(paramObject, paramLong, paramByte);
    }
    
    public final boolean zzl(Object paramObject, long paramLong)
    {
      if (zznd.zzwr) {
        return zznd.zzv(paramObject, paramLong);
      }
      return zznd.zzw(paramObject, paramLong);
    }
    
    public final float zzm(Object paramObject, long paramLong)
    {
      return Float.intBitsToFloat(zzj(paramObject, paramLong));
    }
    
    public final double zzn(Object paramObject, long paramLong)
    {
      return Double.longBitsToDouble(zzk(paramObject, paramLong));
    }
    
    public final byte zzx(Object paramObject, long paramLong)
    {
      if (zznd.zzwr) {
        return zznd.zzt(paramObject, paramLong);
      }
      return zznd.zzu(paramObject, paramLong);
    }
  }
  
  static final class zzb
    extends zznd.zzd
  {
    zzb(Unsafe paramUnsafe)
    {
      super();
    }
    
    public final void zza(Object paramObject, long paramLong, double paramDouble)
    {
      zza(paramObject, paramLong, Double.doubleToLongBits(paramDouble));
    }
    
    public final void zza(Object paramObject, long paramLong, float paramFloat)
    {
      zza(paramObject, paramLong, Float.floatToIntBits(paramFloat));
    }
    
    public final void zza(Object paramObject, long paramLong, boolean paramBoolean)
    {
      if (zznd.zzwr)
      {
        zznd.zzd(paramObject, paramLong, paramBoolean);
        return;
      }
      zznd.zze(paramObject, paramLong, paramBoolean);
    }
    
    public final void zze(Object paramObject, long paramLong, byte paramByte)
    {
      if (zznd.zzwr)
      {
        zznd.zzc(paramObject, paramLong, paramByte);
        return;
      }
      zznd.zzd(paramObject, paramLong, paramByte);
    }
    
    public final boolean zzl(Object paramObject, long paramLong)
    {
      if (zznd.zzwr) {
        return zznd.zzv(paramObject, paramLong);
      }
      return zznd.zzw(paramObject, paramLong);
    }
    
    public final float zzm(Object paramObject, long paramLong)
    {
      return Float.intBitsToFloat(zzj(paramObject, paramLong));
    }
    
    public final double zzn(Object paramObject, long paramLong)
    {
      return Double.longBitsToDouble(zzk(paramObject, paramLong));
    }
    
    public final byte zzx(Object paramObject, long paramLong)
    {
      if (zznd.zzwr) {
        return zznd.zzt(paramObject, paramLong);
      }
      return zznd.zzu(paramObject, paramLong);
    }
  }
  
  static final class zzc
    extends zznd.zzd
  {
    zzc(Unsafe paramUnsafe)
    {
      super();
    }
    
    public final void zza(Object paramObject, long paramLong, double paramDouble)
    {
      this.zzws.putDouble(paramObject, paramLong, paramDouble);
    }
    
    public final void zza(Object paramObject, long paramLong, float paramFloat)
    {
      this.zzws.putFloat(paramObject, paramLong, paramFloat);
    }
    
    public final void zza(Object paramObject, long paramLong, boolean paramBoolean)
    {
      this.zzws.putBoolean(paramObject, paramLong, paramBoolean);
    }
    
    public final void zze(Object paramObject, long paramLong, byte paramByte)
    {
      this.zzws.putByte(paramObject, paramLong, paramByte);
    }
    
    public final boolean zzl(Object paramObject, long paramLong)
    {
      return this.zzws.getBoolean(paramObject, paramLong);
    }
    
    public final float zzm(Object paramObject, long paramLong)
    {
      return this.zzws.getFloat(paramObject, paramLong);
    }
    
    public final double zzn(Object paramObject, long paramLong)
    {
      return this.zzws.getDouble(paramObject, paramLong);
    }
    
    public final byte zzx(Object paramObject, long paramLong)
    {
      return this.zzws.getByte(paramObject, paramLong);
    }
  }
  
  static abstract class zzd
  {
    Unsafe zzws;
    
    zzd(Unsafe paramUnsafe)
    {
      this.zzws = paramUnsafe;
    }
    
    public abstract void zza(Object paramObject, long paramLong, double paramDouble);
    
    public abstract void zza(Object paramObject, long paramLong, float paramFloat);
    
    public final void zza(Object paramObject, long paramLong, int paramInt)
    {
      this.zzws.putInt(paramObject, paramLong, paramInt);
    }
    
    public final void zza(Object paramObject, long paramLong1, long paramLong2)
    {
      this.zzws.putLong(paramObject, paramLong1, paramLong2);
    }
    
    public abstract void zza(Object paramObject, long paramLong, boolean paramBoolean);
    
    public abstract void zze(Object paramObject, long paramLong, byte paramByte);
    
    public final int zzj(Object paramObject, long paramLong)
    {
      return this.zzws.getInt(paramObject, paramLong);
    }
    
    public final long zzk(Object paramObject, long paramLong)
    {
      return this.zzws.getLong(paramObject, paramLong);
    }
    
    public abstract boolean zzl(Object paramObject, long paramLong);
    
    public abstract float zzm(Object paramObject, long paramLong);
    
    public abstract double zzn(Object paramObject, long paramLong);
    
    public abstract byte zzx(Object paramObject, long paramLong);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zznd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */