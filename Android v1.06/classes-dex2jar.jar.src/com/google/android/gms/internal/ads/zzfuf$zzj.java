package com.google.android.gms.internal.ads;

import java.security.PrivilegedExceptionAction;
import javax.annotation.CheckForNull;
import sun.misc.Unsafe;

final class zzfuf$zzj
  extends zzfuf.zza
{
  static final Unsafe zza;
  static final long zzb;
  static final long zzc;
  static final long zzd;
  static final long zze;
  static final long zzf;
  
  /* Error */
  static
  {
    // Byte code:
    //   0: invokestatic 30	sun/misc/Unsafe:getUnsafe	()Lsun/misc/Unsafe;
    //   3: astore_0
    //   4: goto +20 -> 24
    //   7: astore_0
    //   8: new 6	com/google/android/gms/internal/ads/zzfuf$zzj$1
    //   11: astore_0
    //   12: aload_0
    //   13: invokespecial 33	com/google/android/gms/internal/ads/zzfuf$zzj$1:<init>	()V
    //   16: aload_0
    //   17: invokestatic 39	java/security/AccessController:doPrivileged	(Ljava/security/PrivilegedExceptionAction;)Ljava/lang/Object;
    //   20: checkcast 26	sun/misc/Unsafe
    //   23: astore_0
    //   24: aload_0
    //   25: ldc 41
    //   27: ldc 43
    //   29: invokevirtual 49	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   32: invokevirtual 53	sun/misc/Unsafe:objectFieldOffset	(Ljava/lang/reflect/Field;)J
    //   35: putstatic 55	com/google/android/gms/internal/ads/zzfuf$zzj:zzc	J
    //   38: aload_0
    //   39: ldc 41
    //   41: ldc 57
    //   43: invokevirtual 49	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   46: invokevirtual 53	sun/misc/Unsafe:objectFieldOffset	(Ljava/lang/reflect/Field;)J
    //   49: putstatic 59	com/google/android/gms/internal/ads/zzfuf$zzj:zzb	J
    //   52: aload_0
    //   53: ldc 41
    //   55: ldc 61
    //   57: invokevirtual 49	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   60: invokevirtual 53	sun/misc/Unsafe:objectFieldOffset	(Ljava/lang/reflect/Field;)J
    //   63: putstatic 63	com/google/android/gms/internal/ads/zzfuf$zzj:zzd	J
    //   66: aload_0
    //   67: ldc 65
    //   69: ldc 67
    //   71: invokevirtual 49	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   74: invokevirtual 53	sun/misc/Unsafe:objectFieldOffset	(Ljava/lang/reflect/Field;)J
    //   77: putstatic 69	com/google/android/gms/internal/ads/zzfuf$zzj:zze	J
    //   80: aload_0
    //   81: ldc 65
    //   83: ldc 71
    //   85: invokevirtual 49	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   88: invokevirtual 53	sun/misc/Unsafe:objectFieldOffset	(Ljava/lang/reflect/Field;)J
    //   91: putstatic 73	com/google/android/gms/internal/ads/zzfuf$zzj:zzf	J
    //   94: aload_0
    //   95: putstatic 75	com/google/android/gms/internal/ads/zzfuf$zzj:zza	Lsun/misc/Unsafe;
    //   98: return
    //   99: astore_0
    //   100: aload_0
    //   101: athrow
    //   102: astore_0
    //   103: new 24	java/lang/RuntimeException
    //   106: dup
    //   107: aload_0
    //   108: invokespecial 78	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   111: athrow
    //   112: astore_0
    //   113: new 24	java/lang/RuntimeException
    //   116: dup
    //   117: ldc 80
    //   119: aload_0
    //   120: invokevirtual 84	java/security/PrivilegedActionException:getCause	()Ljava/lang/Throwable;
    //   123: invokespecial 87	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   126: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   3	1	0	localUnsafe	Unsafe
    //   7	1	0	localSecurityException	SecurityException
    //   11	84	0	localObject	Object
    //   99	2	0	localRuntimeException	RuntimeException
    //   102	6	0	localNoSuchFieldException	NoSuchFieldException
    //   112	8	0	localPrivilegedActionException	java.security.PrivilegedActionException
    // Exception table:
    //   from	to	target	type
    //   0	4	7	java/lang/SecurityException
    //   24	98	99	java/lang/RuntimeException
    //   24	98	102	java/lang/NoSuchFieldException
    //   8	24	112	java/security/PrivilegedActionException
  }
  
  private zzfuf$zzj()
  {
    super(null);
  }
  
  final zzfuf.zzd zza(zzfuf paramzzfuf, zzfuf.zzd paramzzd)
  {
    zzfuf.zzd localzzd;
    do
    {
      localzzd = zzfuf.zzi(paramzzfuf);
      if (paramzzd == localzzd) {
        return localzzd;
      }
    } while (!zze(paramzzfuf, localzzd, paramzzd));
    return localzzd;
  }
  
  final zzfuf.zzk zzb(zzfuf paramzzfuf, zzfuf.zzk paramzzk)
  {
    zzfuf.zzk localzzk;
    do
    {
      localzzk = zzfuf.zzj(paramzzfuf);
      if (paramzzk == localzzk) {
        return localzzk;
      }
    } while (!zzg(paramzzfuf, localzzk, paramzzk));
    return localzzk;
  }
  
  final void zzc(zzfuf.zzk paramzzk1, @CheckForNull zzfuf.zzk paramzzk2)
  {
    zza.putObject(paramzzk1, zzf, paramzzk2);
  }
  
  final void zzd(zzfuf.zzk paramzzk, Thread paramThread)
  {
    zza.putObject(paramzzk, zze, paramThread);
  }
  
  final boolean zze(zzfuf paramzzfuf, @CheckForNull zzfuf.zzd paramzzd1, zzfuf.zzd paramzzd2)
  {
    return zzfui.zza(zza, paramzzfuf, zzb, paramzzd1, paramzzd2);
  }
  
  final boolean zzf(zzfuf paramzzfuf, @CheckForNull Object paramObject1, Object paramObject2)
  {
    return zzfui.zza(zza, paramzzfuf, zzd, paramObject1, paramObject2);
  }
  
  final boolean zzg(zzfuf paramzzfuf, @CheckForNull zzfuf.zzk paramzzk1, @CheckForNull zzfuf.zzk paramzzk2)
  {
    return zzfui.zza(zza, paramzzfuf, zzc, paramzzk1, paramzzk2);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfuf$zzj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */