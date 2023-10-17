package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class zzgn
  extends zzfr
{
  private RandomAccessFile zza;
  private Uri zzb;
  private long zzc;
  private boolean zzd;
  
  public zzgn()
  {
    super(false);
  }
  
  public final int zza(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws zzgm
  {
    if (paramInt2 == 0) {
      return 0;
    }
    if (this.zzc == 0L) {
      return -1;
    }
    try
    {
      RandomAccessFile localRandomAccessFile = this.zza;
      int i = zzfn.zza;
      paramInt1 = localRandomAccessFile.read(paramArrayOfByte, paramInt1, (int)Math.min(this.zzc, paramInt2));
      if (paramInt1 > 0)
      {
        this.zzc -= paramInt1;
        zzg(paramInt1);
      }
      return paramInt1;
    }
    catch (IOException paramArrayOfByte)
    {
      throw new zzgm(paramArrayOfByte, 2000);
    }
  }
  
  /* Error */
  public final long zzb(zzgc paramzzgc)
    throws zzgm
  {
    // Byte code:
    //   0: aload_1
    //   1: getfield 62	com/google/android/gms/internal/ads/zzgc:zza	Landroid/net/Uri;
    //   4: astore 7
    //   6: aload_0
    //   7: aload 7
    //   9: putfield 64	com/google/android/gms/internal/ads/zzgn:zzb	Landroid/net/Uri;
    //   12: aload_0
    //   13: aload_1
    //   14: invokevirtual 68	com/google/android/gms/internal/ads/zzfr:zzi	(Lcom/google/android/gms/internal/ads/zzgc;)V
    //   17: sipush 2006
    //   20: istore_2
    //   21: aload 7
    //   23: invokevirtual 74	android/net/Uri:getPath	()Ljava/lang/String;
    //   26: astore 8
    //   28: aload 8
    //   30: invokestatic 80	java/util/Objects:requireNonNull	(Ljava/lang/Object;)Ljava/lang/Object;
    //   33: pop
    //   34: new 40	java/io/RandomAccessFile
    //   37: dup
    //   38: aload 8
    //   40: ldc 82
    //   42: invokespecial 85	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   45: astore 8
    //   47: aload_0
    //   48: aload 8
    //   50: putfield 27	com/google/android/gms/internal/ads/zzgn:zza	Ljava/io/RandomAccessFile;
    //   53: aload 8
    //   55: aload_1
    //   56: getfield 88	com/google/android/gms/internal/ads/zzgc:zzf	J
    //   59: invokevirtual 92	java/io/RandomAccessFile:seek	(J)V
    //   62: aload_1
    //   63: getfield 94	com/google/android/gms/internal/ads/zzgc:zzg	J
    //   66: lstore 5
    //   68: lload 5
    //   70: lstore_3
    //   71: lload 5
    //   73: ldc2_w 95
    //   76: lcmp
    //   77: ifne +16 -> 93
    //   80: aload_0
    //   81: getfield 27	com/google/android/gms/internal/ads/zzgn:zza	Ljava/io/RandomAccessFile;
    //   84: invokevirtual 100	java/io/RandomAccessFile:length	()J
    //   87: aload_1
    //   88: getfield 88	com/google/android/gms/internal/ads/zzgc:zzf	J
    //   91: lsub
    //   92: lstore_3
    //   93: aload_0
    //   94: lload_3
    //   95: putfield 25	com/google/android/gms/internal/ads/zzgn:zzc	J
    //   98: lload_3
    //   99: lconst_0
    //   100: lcmp
    //   101: iflt +18 -> 119
    //   104: aload_0
    //   105: iconst_1
    //   106: putfield 102	com/google/android/gms/internal/ads/zzgn:zzd	Z
    //   109: aload_0
    //   110: aload_1
    //   111: invokevirtual 105	com/google/android/gms/internal/ads/zzfr:zzj	(Lcom/google/android/gms/internal/ads/zzgc;)V
    //   114: aload_0
    //   115: getfield 25	com/google/android/gms/internal/ads/zzgn:zzc	J
    //   118: lreturn
    //   119: new 21	com/google/android/gms/internal/ads/zzgm
    //   122: dup
    //   123: aconst_null
    //   124: aconst_null
    //   125: sipush 2008
    //   128: invokespecial 108	com/google/android/gms/internal/ads/zzgm:<init>	(Ljava/lang/String;Ljava/lang/Throwable;I)V
    //   131: athrow
    //   132: astore_1
    //   133: new 21	com/google/android/gms/internal/ads/zzgm
    //   136: dup
    //   137: aload_1
    //   138: sipush 2000
    //   141: invokespecial 50	com/google/android/gms/internal/ads/zzgm:<init>	(Ljava/lang/Throwable;I)V
    //   144: athrow
    //   145: astore_1
    //   146: new 21	com/google/android/gms/internal/ads/zzgm
    //   149: dup
    //   150: aload_1
    //   151: sipush 2000
    //   154: invokespecial 50	com/google/android/gms/internal/ads/zzgm:<init>	(Ljava/lang/Throwable;I)V
    //   157: athrow
    //   158: astore_1
    //   159: new 21	com/google/android/gms/internal/ads/zzgm
    //   162: dup
    //   163: aload_1
    //   164: sipush 2006
    //   167: invokespecial 50	com/google/android/gms/internal/ads/zzgm:<init>	(Ljava/lang/Throwable;I)V
    //   170: athrow
    //   171: astore_1
    //   172: aload 7
    //   174: invokevirtual 111	android/net/Uri:getQuery	()Ljava/lang/String;
    //   177: invokestatic 117	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   180: ifeq +49 -> 229
    //   183: aload 7
    //   185: invokevirtual 120	android/net/Uri:getFragment	()Ljava/lang/String;
    //   188: invokestatic 117	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   191: ifeq +38 -> 229
    //   194: getstatic 32	com/google/android/gms/internal/ads/zzfn:zza	I
    //   197: bipush 21
    //   199: if_icmplt +16 -> 215
    //   202: aload_1
    //   203: invokevirtual 124	java/io/FileNotFoundException:getCause	()Ljava/lang/Throwable;
    //   206: invokestatic 129	com/google/android/gms/internal/ads/zzgl:zza	(Ljava/lang/Throwable;)Z
    //   209: ifeq +6 -> 215
    //   212: goto +7 -> 219
    //   215: sipush 2005
    //   218: istore_2
    //   219: new 21	com/google/android/gms/internal/ads/zzgm
    //   222: dup
    //   223: aload_1
    //   224: iload_2
    //   225: invokespecial 50	com/google/android/gms/internal/ads/zzgm:<init>	(Ljava/lang/Throwable;I)V
    //   228: athrow
    //   229: new 21	com/google/android/gms/internal/ads/zzgm
    //   232: dup
    //   233: ldc -125
    //   235: iconst_3
    //   236: anewarray 133	java/lang/Object
    //   239: dup
    //   240: iconst_0
    //   241: aload 7
    //   243: invokevirtual 74	android/net/Uri:getPath	()Ljava/lang/String;
    //   246: aastore
    //   247: dup
    //   248: iconst_1
    //   249: aload 7
    //   251: invokevirtual 111	android/net/Uri:getQuery	()Ljava/lang/String;
    //   254: aastore
    //   255: dup
    //   256: iconst_2
    //   257: aload 7
    //   259: invokevirtual 120	android/net/Uri:getFragment	()Ljava/lang/String;
    //   262: aastore
    //   263: invokestatic 139	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   266: aload_1
    //   267: sipush 1004
    //   270: invokespecial 108	com/google/android/gms/internal/ads/zzgm:<init>	(Ljava/lang/String;Ljava/lang/Throwable;I)V
    //   273: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	274	0	this	zzgn
    //   0	274	1	paramzzgc	zzgc
    //   20	205	2	i	int
    //   70	29	3	l1	long
    //   66	6	5	l2	long
    //   4	254	7	localUri	Uri
    //   26	28	8	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   53	68	132	java/io/IOException
    //   80	93	132	java/io/IOException
    //   93	98	132	java/io/IOException
    //   21	28	145	java/lang/RuntimeException
    //   34	47	145	java/lang/RuntimeException
    //   21	28	158	java/lang/SecurityException
    //   34	47	158	java/lang/SecurityException
    //   21	28	171	java/io/FileNotFoundException
    //   34	47	171	java/io/FileNotFoundException
  }
  
  public final Uri zzc()
  {
    return this.zzb;
  }
  
  /* Error */
  public final void zzd()
    throws zzgm
  {
    // Byte code:
    //   0: aload_0
    //   1: aconst_null
    //   2: putfield 64	com/google/android/gms/internal/ads/zzgn:zzb	Landroid/net/Uri;
    //   5: aload_0
    //   6: getfield 27	com/google/android/gms/internal/ads/zzgn:zza	Ljava/io/RandomAccessFile;
    //   9: astore_1
    //   10: aload_1
    //   11: ifnull +7 -> 18
    //   14: aload_1
    //   15: invokevirtual 143	java/io/RandomAccessFile:close	()V
    //   18: aload_0
    //   19: aconst_null
    //   20: putfield 27	com/google/android/gms/internal/ads/zzgn:zza	Ljava/io/RandomAccessFile;
    //   23: aload_0
    //   24: getfield 102	com/google/android/gms/internal/ads/zzgn:zzd	Z
    //   27: ifeq +12 -> 39
    //   30: aload_0
    //   31: iconst_0
    //   32: putfield 102	com/google/android/gms/internal/ads/zzgn:zzd	Z
    //   35: aload_0
    //   36: invokevirtual 146	com/google/android/gms/internal/ads/zzfr:zzh	()V
    //   39: return
    //   40: astore_1
    //   41: goto +18 -> 59
    //   44: astore_1
    //   45: new 21	com/google/android/gms/internal/ads/zzgm
    //   48: astore_2
    //   49: aload_2
    //   50: aload_1
    //   51: sipush 2000
    //   54: invokespecial 50	com/google/android/gms/internal/ads/zzgm:<init>	(Ljava/lang/Throwable;I)V
    //   57: aload_2
    //   58: athrow
    //   59: aload_0
    //   60: aconst_null
    //   61: putfield 27	com/google/android/gms/internal/ads/zzgn:zza	Ljava/io/RandomAccessFile;
    //   64: aload_0
    //   65: getfield 102	com/google/android/gms/internal/ads/zzgn:zzd	Z
    //   68: ifne +6 -> 74
    //   71: goto +12 -> 83
    //   74: aload_0
    //   75: iconst_0
    //   76: putfield 102	com/google/android/gms/internal/ads/zzgn:zzd	Z
    //   79: aload_0
    //   80: invokevirtual 146	com/google/android/gms/internal/ads/zzfr:zzh	()V
    //   83: aload_1
    //   84: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	85	0	this	zzgn
    //   9	6	1	localRandomAccessFile	RandomAccessFile
    //   40	1	1	localObject	Object
    //   44	40	1	localIOException	IOException
    //   48	10	2	localzzgm	zzgm
    // Exception table:
    //   from	to	target	type
    //   5	10	40	finally
    //   14	18	40	finally
    //   45	59	40	finally
    //   5	10	44	java/io/IOException
    //   14	18	44	java/io/IOException
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */