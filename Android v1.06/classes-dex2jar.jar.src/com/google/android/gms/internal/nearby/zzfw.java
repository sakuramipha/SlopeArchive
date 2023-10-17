package com.google.android.gms.internal.nearby;

import java.io.InputStream;
import java.io.OutputStream;

final class zzfw
  implements Runnable
{
  final zzfx zze;
  
  zzfw(zzfx paramzzfx, InputStream paramInputStream, OutputStream paramOutputStream1, long paramLong, OutputStream paramOutputStream2) {}
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 19	com/google/android/gms/internal/nearby/zzfw:zze	Lcom/google/android/gms/internal/nearby/zzfx;
    //   4: aload_0
    //   5: getfield 21	com/google/android/gms/internal/nearby/zzfw:zza	Ljava/io/InputStream;
    //   8: invokestatic 39	com/google/android/gms/internal/nearby/zzfx:zzd	(Lcom/google/android/gms/internal/nearby/zzfx;Ljava/io/InputStream;)Ljava/io/InputStream;
    //   11: pop
    //   12: iconst_1
    //   13: istore_1
    //   14: aload_0
    //   15: getfield 21	com/google/android/gms/internal/nearby/zzfw:zza	Ljava/io/InputStream;
    //   18: aload_0
    //   19: getfield 23	com/google/android/gms/internal/nearby/zzfw:zzb	Ljava/io/OutputStream;
    //   22: iconst_0
    //   23: ldc 40
    //   25: invokestatic 46	com/google/android/gms/common/util/IOUtils:copyStream	(Ljava/io/InputStream;Ljava/io/OutputStream;ZI)J
    //   28: pop2
    //   29: aload_0
    //   30: getfield 21	com/google/android/gms/internal/nearby/zzfw:zza	Ljava/io/InputStream;
    //   33: invokestatic 50	com/google/android/gms/common/util/IOUtils:closeQuietly	(Ljava/io/Closeable;)V
    //   36: aload_0
    //   37: getfield 19	com/google/android/gms/internal/nearby/zzfw:zze	Lcom/google/android/gms/internal/nearby/zzfx;
    //   40: aload_0
    //   41: getfield 27	com/google/android/gms/internal/nearby/zzfw:zzd	Ljava/io/OutputStream;
    //   44: iconst_0
    //   45: aload_0
    //   46: getfield 25	com/google/android/gms/internal/nearby/zzfw:zzc	J
    //   49: invokestatic 54	com/google/android/gms/internal/nearby/zzfx:zzf	(Lcom/google/android/gms/internal/nearby/zzfx;Ljava/io/OutputStream;ZJ)V
    //   52: aload_0
    //   53: getfield 23	com/google/android/gms/internal/nearby/zzfw:zzb	Ljava/io/OutputStream;
    //   56: invokestatic 50	com/google/android/gms/common/util/IOUtils:closeQuietly	(Ljava/io/Closeable;)V
    //   59: aload_0
    //   60: getfield 19	com/google/android/gms/internal/nearby/zzfw:zze	Lcom/google/android/gms/internal/nearby/zzfx;
    //   63: aconst_null
    //   64: invokestatic 39	com/google/android/gms/internal/nearby/zzfx:zzd	(Lcom/google/android/gms/internal/nearby/zzfx;Ljava/io/InputStream;)Ljava/io/InputStream;
    //   67: pop
    //   68: return
    //   69: astore_3
    //   70: iconst_0
    //   71: istore_1
    //   72: goto +97 -> 169
    //   75: astore_3
    //   76: aload_0
    //   77: getfield 19	com/google/android/gms/internal/nearby/zzfw:zze	Lcom/google/android/gms/internal/nearby/zzfx;
    //   80: invokestatic 57	com/google/android/gms/internal/nearby/zzfx:zze	(Lcom/google/android/gms/internal/nearby/zzfx;)Z
    //   83: istore_2
    //   84: iload_2
    //   85: ifne +32 -> 117
    //   88: ldc 59
    //   90: ldc 61
    //   92: iconst_1
    //   93: anewarray 4	java/lang/Object
    //   96: dup
    //   97: iconst_0
    //   98: aload_0
    //   99: getfield 25	com/google/android/gms/internal/nearby/zzfw:zzc	J
    //   102: invokestatic 67	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   105: aastore
    //   106: invokestatic 73	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   109: aload_3
    //   110: invokestatic 79	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   113: pop
    //   114: goto +28 -> 142
    //   117: ldc 59
    //   119: ldc 81
    //   121: iconst_1
    //   122: anewarray 4	java/lang/Object
    //   125: dup
    //   126: iconst_0
    //   127: aload_0
    //   128: getfield 25	com/google/android/gms/internal/nearby/zzfw:zzc	J
    //   131: invokestatic 67	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   134: aastore
    //   135: invokestatic 73	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   138: invokestatic 85	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   141: pop
    //   142: aload_0
    //   143: getfield 21	com/google/android/gms/internal/nearby/zzfw:zza	Ljava/io/InputStream;
    //   146: invokestatic 50	com/google/android/gms/common/util/IOUtils:closeQuietly	(Ljava/io/Closeable;)V
    //   149: aload_0
    //   150: getfield 19	com/google/android/gms/internal/nearby/zzfw:zze	Lcom/google/android/gms/internal/nearby/zzfx;
    //   153: aload_0
    //   154: getfield 27	com/google/android/gms/internal/nearby/zzfw:zzd	Ljava/io/OutputStream;
    //   157: iconst_1
    //   158: aload_0
    //   159: getfield 25	com/google/android/gms/internal/nearby/zzfw:zzc	J
    //   162: invokestatic 54	com/google/android/gms/internal/nearby/zzfx:zzf	(Lcom/google/android/gms/internal/nearby/zzfx;Ljava/io/OutputStream;ZJ)V
    //   165: goto -113 -> 52
    //   168: astore_3
    //   169: aload_0
    //   170: getfield 21	com/google/android/gms/internal/nearby/zzfw:zza	Ljava/io/InputStream;
    //   173: invokestatic 50	com/google/android/gms/common/util/IOUtils:closeQuietly	(Ljava/io/Closeable;)V
    //   176: aload_0
    //   177: getfield 19	com/google/android/gms/internal/nearby/zzfw:zze	Lcom/google/android/gms/internal/nearby/zzfx;
    //   180: aload_0
    //   181: getfield 27	com/google/android/gms/internal/nearby/zzfw:zzd	Ljava/io/OutputStream;
    //   184: iload_1
    //   185: aload_0
    //   186: getfield 25	com/google/android/gms/internal/nearby/zzfw:zzc	J
    //   189: invokestatic 54	com/google/android/gms/internal/nearby/zzfx:zzf	(Lcom/google/android/gms/internal/nearby/zzfx;Ljava/io/OutputStream;ZJ)V
    //   192: aload_0
    //   193: getfield 23	com/google/android/gms/internal/nearby/zzfw:zzb	Ljava/io/OutputStream;
    //   196: invokestatic 50	com/google/android/gms/common/util/IOUtils:closeQuietly	(Ljava/io/Closeable;)V
    //   199: aload_0
    //   200: getfield 19	com/google/android/gms/internal/nearby/zzfw:zze	Lcom/google/android/gms/internal/nearby/zzfx;
    //   203: aconst_null
    //   204: invokestatic 39	com/google/android/gms/internal/nearby/zzfx:zzd	(Lcom/google/android/gms/internal/nearby/zzfx;Ljava/io/InputStream;)Ljava/io/InputStream;
    //   207: pop
    //   208: aload_3
    //   209: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	210	0	this	zzfw
    //   13	172	1	bool1	boolean
    //   83	2	2	bool2	boolean
    //   69	1	3	localObject1	Object
    //   75	35	3	localIOException	java.io.IOException
    //   168	41	3	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   14	29	69	finally
    //   14	29	75	java/io/IOException
    //   76	84	168	finally
    //   88	114	168	finally
    //   117	142	168	finally
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzfw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */