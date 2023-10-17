package com.google.android.gms.internal.ads;

import java.io.File;

public final class zzfkh
{
  private final zzatn zza;
  private final File zzb;
  private final File zzc;
  private final File zzd;
  private byte[] zze;
  
  public zzfkh(zzatn paramzzatn, File paramFile1, File paramFile2, File paramFile3)
  {
    this.zza = paramzzatn;
    this.zzb = paramFile1;
    this.zzc = paramFile3;
    this.zzd = paramFile2;
  }
  
  public final zzatn zza()
  {
    return this.zza;
  }
  
  public final File zzb()
  {
    return this.zzc;
  }
  
  public final File zzc()
  {
    return this.zzb;
  }
  
  public final boolean zzd(long paramLong)
  {
    return this.zza.zzc() - System.currentTimeMillis() / 1000L < 3600L;
  }
  
  /* Error */
  public final byte[] zze()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 48	com/google/android/gms/internal/ads/zzfkh:zze	[B
    //   4: astore 4
    //   6: aconst_null
    //   7: astore 5
    //   9: aload 4
    //   11: ifnonnull +185 -> 196
    //   14: aload_0
    //   15: getfield 25	com/google/android/gms/internal/ads/zzfkh:zzd	Ljava/io/File;
    //   18: astore 6
    //   20: new 50	java/io/FileInputStream
    //   23: astore 4
    //   25: aload 4
    //   27: aload 6
    //   29: invokespecial 53	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   32: new 55	java/util/ArrayList
    //   35: astore 6
    //   37: aload 6
    //   39: invokespecial 56	java/util/ArrayList:<init>	()V
    //   42: sipush 256
    //   45: istore_1
    //   46: iload_1
    //   47: newarray <illegal type>
    //   49: astore 5
    //   51: iconst_0
    //   52: istore_2
    //   53: iload_2
    //   54: iload_1
    //   55: if_icmpge +30 -> 85
    //   58: aload 4
    //   60: aload 5
    //   62: iload_2
    //   63: iload_1
    //   64: iload_2
    //   65: isub
    //   66: invokevirtual 62	java/io/InputStream:read	([BII)I
    //   69: istore_3
    //   70: iload_3
    //   71: iconst_m1
    //   72: if_icmpne +6 -> 78
    //   75: goto +10 -> 85
    //   78: iload_2
    //   79: iload_3
    //   80: iadd
    //   81: istore_2
    //   82: goto -29 -> 53
    //   85: iload_2
    //   86: ifne +9 -> 95
    //   89: aconst_null
    //   90: astore 5
    //   92: goto +12 -> 104
    //   95: aload 5
    //   97: iconst_0
    //   98: iload_2
    //   99: invokestatic 68	com/google/android/gms/internal/ads/zzgno:zzv	([BII)Lcom/google/android/gms/internal/ads/zzgno;
    //   102: astore 5
    //   104: aload 5
    //   106: ifnonnull +25 -> 131
    //   109: aload 6
    //   111: invokestatic 72	com/google/android/gms/internal/ads/zzgno:zzu	(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/ads/zzgno;
    //   114: invokevirtual 75	com/google/android/gms/internal/ads/zzgno:zzA	()[B
    //   117: astore 5
    //   119: aload 4
    //   121: invokestatic 81	com/google/android/gms/common/util/IOUtils:closeQuietly	(Ljava/io/Closeable;)V
    //   124: aload 5
    //   126: astore 4
    //   128: goto +62 -> 190
    //   131: aload 6
    //   133: aload 5
    //   135: invokeinterface 87 2 0
    //   140: pop
    //   141: iload_1
    //   142: iload_1
    //   143: iadd
    //   144: sipush 8192
    //   147: invokestatic 93	java/lang/Math:min	(II)I
    //   150: istore_1
    //   151: goto -105 -> 46
    //   154: astore 6
    //   156: aload 4
    //   158: astore 5
    //   160: aload 6
    //   162: astore 4
    //   164: goto +5 -> 169
    //   167: astore 4
    //   169: aload 5
    //   171: invokestatic 81	com/google/android/gms/common/util/IOUtils:closeQuietly	(Ljava/io/Closeable;)V
    //   174: aload 4
    //   176: athrow
    //   177: astore 4
    //   179: aconst_null
    //   180: astore 4
    //   182: aload 4
    //   184: invokestatic 81	com/google/android/gms/common/util/IOUtils:closeQuietly	(Ljava/io/Closeable;)V
    //   187: aconst_null
    //   188: astore 4
    //   190: aload_0
    //   191: aload 4
    //   193: putfield 48	com/google/android/gms/internal/ads/zzfkh:zze	[B
    //   196: aload_0
    //   197: getfield 48	com/google/android/gms/internal/ads/zzfkh:zze	[B
    //   200: astore 4
    //   202: aload 4
    //   204: ifnonnull +5 -> 209
    //   207: aconst_null
    //   208: areturn
    //   209: aload 4
    //   211: aload 4
    //   213: arraylength
    //   214: invokestatic 99	java/util/Arrays:copyOf	([BI)[B
    //   217: areturn
    //   218: astore 5
    //   220: goto -38 -> 182
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	223	0	this	zzfkh
    //   45	106	1	i	int
    //   52	47	2	j	int
    //   69	12	3	k	int
    //   4	159	4	localObject1	Object
    //   167	8	4	localObject2	Object
    //   177	1	4	localIOException1	java.io.IOException
    //   180	32	4	localObject3	Object
    //   7	163	5	localObject4	Object
    //   218	1	5	localIOException2	java.io.IOException
    //   18	114	6	localObject5	Object
    //   154	7	6	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   32	42	154	finally
    //   46	51	154	finally
    //   58	70	154	finally
    //   95	104	154	finally
    //   109	119	154	finally
    //   131	151	154	finally
    //   20	32	167	finally
    //   20	32	177	java/io/IOException
    //   32	42	218	java/io/IOException
    //   46	51	218	java/io/IOException
    //   58	70	218	java/io/IOException
    //   95	104	218	java/io/IOException
    //   109	119	218	java/io/IOException
    //   131	151	218	java/io/IOException
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfkh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */