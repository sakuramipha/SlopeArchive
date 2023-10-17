package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;

final class zzavb
{
  ByteArrayOutputStream zza = new ByteArrayOutputStream(4096);
  Base64OutputStream zzb = new Base64OutputStream(this.zza, 10);
  
  /* Error */
  public final String toString()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 26	com/google/android/gms/internal/ads/zzavb:zzb	Landroid/util/Base64OutputStream;
    //   4: invokevirtual 34	android/util/Base64OutputStream:close	()V
    //   7: goto +10 -> 17
    //   10: astore_1
    //   11: ldc 36
    //   13: aload_1
    //   14: invokestatic 42	com/google/android/gms/internal/ads/zzbzt:zzh	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   17: aload_0
    //   18: getfield 19	com/google/android/gms/internal/ads/zzavb:zza	Ljava/io/ByteArrayOutputStream;
    //   21: invokevirtual 43	java/io/ByteArrayOutputStream:close	()V
    //   24: aload_0
    //   25: getfield 19	com/google/android/gms/internal/ads/zzavb:zza	Ljava/io/ByteArrayOutputStream;
    //   28: invokevirtual 45	java/io/ByteArrayOutputStream:toString	()Ljava/lang/String;
    //   31: astore_1
    //   32: aload_0
    //   33: aconst_null
    //   34: putfield 19	com/google/android/gms/internal/ads/zzavb:zza	Ljava/io/ByteArrayOutputStream;
    //   37: aload_0
    //   38: aconst_null
    //   39: putfield 26	com/google/android/gms/internal/ads/zzavb:zzb	Landroid/util/Base64OutputStream;
    //   42: aload_1
    //   43: areturn
    //   44: astore_1
    //   45: goto +23 -> 68
    //   48: astore_1
    //   49: ldc 36
    //   51: aload_1
    //   52: invokestatic 42	com/google/android/gms/internal/ads/zzbzt:zzh	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   55: aload_0
    //   56: aconst_null
    //   57: putfield 19	com/google/android/gms/internal/ads/zzavb:zza	Ljava/io/ByteArrayOutputStream;
    //   60: aload_0
    //   61: aconst_null
    //   62: putfield 26	com/google/android/gms/internal/ads/zzavb:zzb	Landroid/util/Base64OutputStream;
    //   65: ldc 47
    //   67: areturn
    //   68: aload_0
    //   69: aconst_null
    //   70: putfield 19	com/google/android/gms/internal/ads/zzavb:zza	Ljava/io/ByteArrayOutputStream;
    //   73: aload_0
    //   74: aconst_null
    //   75: putfield 26	com/google/android/gms/internal/ads/zzavb:zzb	Landroid/util/Base64OutputStream;
    //   78: aload_1
    //   79: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	80	0	this	zzavb
    //   10	4	1	localIOException1	java.io.IOException
    //   31	12	1	str	String
    //   44	1	1	localObject	Object
    //   48	31	1	localIOException2	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   0	7	10	java/io/IOException
    //   17	32	44	finally
    //   49	55	44	finally
    //   17	32	48	java/io/IOException
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzavb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */