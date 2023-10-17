package com.google.android.gms.internal.nearby;

import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;

public final class zzfz
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzfz> CREATOR = new zzfy();
  private byte[] zza = new byte[0];
  private ParcelFileDescriptor zzb;
  
  private zzfz() {}
  
  zzfz(ParcelFileDescriptor paramParcelFileDescriptor)
  {
    this.zzb = paramParcelFileDescriptor;
  }
  
  /* Error */
  static byte[] zzb(ParcelFileDescriptor paramParcelFileDescriptor)
  {
    // Byte code:
    //   0: new 32	java/io/DataInputStream
    //   3: dup
    //   4: new 34	android/os/ParcelFileDescriptor$AutoCloseInputStream
    //   7: dup
    //   8: aload_0
    //   9: invokespecial 36	android/os/ParcelFileDescriptor$AutoCloseInputStream:<init>	(Landroid/os/ParcelFileDescriptor;)V
    //   12: invokespecial 39	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   15: astore_0
    //   16: aload_0
    //   17: invokevirtual 43	java/io/DataInputStream:readInt	()I
    //   20: newarray <illegal type>
    //   22: astore_1
    //   23: aload_0
    //   24: aload_1
    //   25: invokevirtual 47	java/io/DataInputStream:read	([B)I
    //   28: pop
    //   29: aload_0
    //   30: invokestatic 51	com/google/android/gms/internal/nearby/zzfz:zze	(Ljava/io/Closeable;)V
    //   33: aload_1
    //   34: areturn
    //   35: astore_1
    //   36: goto +17 -> 53
    //   39: astore_1
    //   40: new 53	java/lang/IllegalStateException
    //   43: astore_2
    //   44: aload_2
    //   45: ldc 55
    //   47: aload_1
    //   48: invokespecial 58	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   51: aload_2
    //   52: athrow
    //   53: aload_0
    //   54: invokestatic 51	com/google/android/gms/internal/nearby/zzfz:zze	(Ljava/io/Closeable;)V
    //   57: aload_1
    //   58: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	59	0	paramParcelFileDescriptor	ParcelFileDescriptor
    //   22	12	1	arrayOfByte	byte[]
    //   35	1	1	localObject	Object
    //   39	19	1	localIOException	IOException
    //   43	9	2	localIllegalStateException	IllegalStateException
    // Exception table:
    //   from	to	target	type
    //   16	29	35	finally
    //   40	53	35	finally
    //   16	29	39	java/io/IOException
  }
  
  private static void zze(Closeable paramCloseable)
  {
    try
    {
      paramCloseable.close();
      return;
    }
    catch (IOException paramCloseable)
    {
      Log.w("ParcelByteArray", "Could not close stream", paramCloseable);
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject instanceof zzfz))
    {
      paramObject = (zzfz)paramObject;
      return Arrays.equals(this.zza, ((zzfz)paramObject).zza);
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(this.zza);
  }
  
  /* Error */
  public final void writeToParcel(android.os.Parcel paramParcel, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 24	com/google/android/gms/internal/nearby/zzfz:zza	[B
    //   4: astore 6
    //   6: aconst_null
    //   7: astore 4
    //   9: aload 6
    //   11: ifnull +460 -> 471
    //   14: aload_0
    //   15: getfield 27	com/google/android/gms/internal/nearby/zzfz:zzb	Landroid/os/ParcelFileDescriptor;
    //   18: ifnonnull +453 -> 471
    //   21: invokestatic 96	com/google/android/gms/internal/nearby/zzgf:zzc	()Ljava/io/File;
    //   24: astore 5
    //   26: aload 5
    //   28: ifnull +201 -> 229
    //   31: new 98	java/lang/StringBuilder
    //   34: astore 7
    //   36: aload 7
    //   38: ldc 100
    //   40: invokespecial 103	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   43: aload 7
    //   45: invokestatic 109	android/os/SystemClock:elapsedRealtime	()J
    //   48: invokevirtual 113	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   51: pop
    //   52: aload 7
    //   54: invokevirtual 117	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   57: ldc 119
    //   59: aload 5
    //   61: invokestatic 125	java/io/File:createTempFile	(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;
    //   64: astore 7
    //   66: new 127	java/io/FileOutputStream
    //   69: astore 8
    //   71: aload 8
    //   73: aload 7
    //   75: invokespecial 130	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   78: aload 7
    //   80: ldc -125
    //   82: invokestatic 137	android/os/ParcelFileDescriptor:open	(Ljava/io/File;I)Landroid/os/ParcelFileDescriptor;
    //   85: astore 5
    //   87: aload 7
    //   89: invokevirtual 141	java/io/File:delete	()Z
    //   92: pop
    //   93: aload 8
    //   95: aload 5
    //   97: invokestatic 147	android/util/Pair:create	(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;
    //   100: astore 7
    //   102: new 149	java/io/BufferedOutputStream
    //   105: astore 8
    //   107: aload 8
    //   109: aload 7
    //   111: getfield 153	android/util/Pair:first	Ljava/lang/Object;
    //   114: checkcast 155	java/io/OutputStream
    //   117: invokespecial 158	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   120: new 160	java/io/DataOutputStream
    //   123: astore 5
    //   125: aload 5
    //   127: aload 8
    //   129: invokespecial 161	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   132: aload 5
    //   134: astore 4
    //   136: aload 5
    //   138: aload 6
    //   140: arraylength
    //   141: invokevirtual 165	java/io/DataOutputStream:writeInt	(I)V
    //   144: aload 5
    //   146: astore 4
    //   148: aload 5
    //   150: aload 6
    //   152: invokevirtual 169	java/io/DataOutputStream:write	([B)V
    //   155: aload 5
    //   157: astore 4
    //   159: aload 7
    //   161: getfield 172	android/util/Pair:second	Ljava/lang/Object;
    //   164: checkcast 133	android/os/ParcelFileDescriptor
    //   167: astore 6
    //   169: aload 5
    //   171: invokestatic 51	com/google/android/gms/internal/nearby/zzfz:zze	(Ljava/io/Closeable;)V
    //   174: aload 6
    //   176: astore 4
    //   178: goto +271 -> 449
    //   181: astore 6
    //   183: goto +70 -> 253
    //   186: astore 6
    //   188: goto +163 -> 351
    //   191: astore 6
    //   193: new 53	java/lang/IllegalStateException
    //   196: astore 5
    //   198: aload 5
    //   200: ldc -82
    //   202: aload 6
    //   204: invokespecial 58	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   207: aload 5
    //   209: athrow
    //   210: astore 6
    //   212: new 53	java/lang/IllegalStateException
    //   215: astore 5
    //   217: aload 5
    //   219: ldc -80
    //   221: aload 6
    //   223: invokespecial 58	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   226: aload 5
    //   228: athrow
    //   229: new 53	java/lang/IllegalStateException
    //   232: astore 5
    //   234: aload 5
    //   236: ldc -78
    //   238: invokespecial 179	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   241: aload 5
    //   243: athrow
    //   244: astore_1
    //   245: goto +214 -> 459
    //   248: astore 6
    //   250: aconst_null
    //   251: astore 5
    //   253: aload 5
    //   255: astore 4
    //   257: aload 6
    //   259: invokestatic 185	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   262: astore 7
    //   264: aload 5
    //   266: astore 4
    //   268: aload 7
    //   270: invokestatic 185	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   273: invokevirtual 188	java/lang/String:length	()I
    //   276: istore_3
    //   277: aload 5
    //   279: astore 4
    //   281: new 98	java/lang/StringBuilder
    //   284: astore 6
    //   286: aload 5
    //   288: astore 4
    //   290: aload 6
    //   292: iload_3
    //   293: bipush 36
    //   295: iadd
    //   296: invokespecial 190	java/lang/StringBuilder:<init>	(I)V
    //   299: aload 5
    //   301: astore 4
    //   303: aload 6
    //   305: ldc -64
    //   307: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   310: pop
    //   311: aload 5
    //   313: astore 4
    //   315: aload 6
    //   317: aload 7
    //   319: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   322: pop
    //   323: aload 5
    //   325: astore 4
    //   327: ldc 69
    //   329: aload 6
    //   331: invokevirtual 117	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   334: invokestatic 199	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   337: pop
    //   338: aload 5
    //   340: ifnull +106 -> 446
    //   343: goto +98 -> 441
    //   346: astore 6
    //   348: aconst_null
    //   349: astore 5
    //   351: aload 5
    //   353: astore 4
    //   355: aload 6
    //   357: invokestatic 185	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   360: astore 6
    //   362: aload 5
    //   364: astore 4
    //   366: aload 6
    //   368: invokestatic 185	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   371: invokevirtual 188	java/lang/String:length	()I
    //   374: istore_3
    //   375: aload 5
    //   377: astore 4
    //   379: new 98	java/lang/StringBuilder
    //   382: astore 7
    //   384: aload 5
    //   386: astore 4
    //   388: aload 7
    //   390: iload_3
    //   391: bipush 32
    //   393: iadd
    //   394: invokespecial 190	java/lang/StringBuilder:<init>	(I)V
    //   397: aload 5
    //   399: astore 4
    //   401: aload 7
    //   403: ldc -55
    //   405: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   408: pop
    //   409: aload 5
    //   411: astore 4
    //   413: aload 7
    //   415: aload 6
    //   417: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   420: pop
    //   421: aload 5
    //   423: astore 4
    //   425: ldc 69
    //   427: aload 7
    //   429: invokevirtual 117	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   432: invokestatic 199	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   435: pop
    //   436: aload 5
    //   438: ifnull +8 -> 446
    //   441: aload 5
    //   443: invokestatic 51	com/google/android/gms/internal/nearby/zzfz:zze	(Ljava/io/Closeable;)V
    //   446: aconst_null
    //   447: astore 4
    //   449: aload_0
    //   450: aload 4
    //   452: putfield 27	com/google/android/gms/internal/nearby/zzfz:zzb	Landroid/os/ParcelFileDescriptor;
    //   455: goto +16 -> 471
    //   458: astore_1
    //   459: aload 4
    //   461: ifnull +8 -> 469
    //   464: aload 4
    //   466: invokestatic 51	com/google/android/gms/internal/nearby/zzfz:zze	(Ljava/io/Closeable;)V
    //   469: aload_1
    //   470: athrow
    //   471: aload_1
    //   472: invokestatic 207	com/google/android/gms/common/internal/safeparcel/SafeParcelWriter:beginObjectHeader	(Landroid/os/Parcel;)I
    //   475: istore_3
    //   476: aload_1
    //   477: iconst_1
    //   478: aload_0
    //   479: getfield 27	com/google/android/gms/internal/nearby/zzfz:zzb	Landroid/os/ParcelFileDescriptor;
    //   482: iload_2
    //   483: iconst_1
    //   484: ior
    //   485: iconst_0
    //   486: invokestatic 211	com/google/android/gms/common/internal/safeparcel/SafeParcelWriter:writeParcelable	(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V
    //   489: aload_1
    //   490: iload_3
    //   491: invokestatic 214	com/google/android/gms/common/internal/safeparcel/SafeParcelWriter:finishObjectHeader	(Landroid/os/Parcel;I)V
    //   494: aload_0
    //   495: aconst_null
    //   496: putfield 27	com/google/android/gms/internal/nearby/zzfz:zzb	Landroid/os/ParcelFileDescriptor;
    //   499: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	500	0	this	zzfz
    //   0	500	1	paramParcel	android.os.Parcel
    //   0	500	2	paramInt	int
    //   276	215	3	i	int
    //   7	458	4	localObject1	Object
    //   24	418	5	localObject2	Object
    //   4	171	6	localObject3	Object
    //   181	1	6	localIOException1	IOException
    //   186	1	6	localIllegalStateException1	IllegalStateException
    //   191	12	6	localFileNotFoundException	java.io.FileNotFoundException
    //   210	12	6	localIOException2	IOException
    //   248	10	6	localIOException3	IOException
    //   284	46	6	localStringBuilder	StringBuilder
    //   346	10	6	localIllegalStateException2	IllegalStateException
    //   360	56	6	str	String
    //   34	394	7	localObject4	Object
    //   69	59	8	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   136	144	181	java/io/IOException
    //   148	155	181	java/io/IOException
    //   159	169	181	java/io/IOException
    //   136	144	186	java/lang/IllegalStateException
    //   148	155	186	java/lang/IllegalStateException
    //   159	169	186	java/lang/IllegalStateException
    //   66	87	191	java/io/FileNotFoundException
    //   31	66	210	java/io/IOException
    //   21	26	244	finally
    //   31	66	244	finally
    //   66	87	244	finally
    //   87	132	244	finally
    //   193	210	244	finally
    //   212	229	244	finally
    //   229	244	244	finally
    //   21	26	248	java/io/IOException
    //   66	87	248	java/io/IOException
    //   87	132	248	java/io/IOException
    //   193	210	248	java/io/IOException
    //   212	229	248	java/io/IOException
    //   229	244	248	java/io/IOException
    //   21	26	346	java/lang/IllegalStateException
    //   31	66	346	java/lang/IllegalStateException
    //   66	87	346	java/lang/IllegalStateException
    //   87	132	346	java/lang/IllegalStateException
    //   193	210	346	java/lang/IllegalStateException
    //   212	229	346	java/lang/IllegalStateException
    //   229	244	346	java/lang/IllegalStateException
    //   136	144	458	finally
    //   148	155	458	finally
    //   159	169	458	finally
    //   257	264	458	finally
    //   268	277	458	finally
    //   281	286	458	finally
    //   290	299	458	finally
    //   303	311	458	finally
    //   315	323	458	finally
    //   327	338	458	finally
    //   355	362	458	finally
    //   366	375	458	finally
    //   379	384	458	finally
    //   388	397	458	finally
    //   401	409	458	finally
    //   413	421	458	finally
    //   425	436	458	finally
  }
  
  public final byte[] zza()
  {
    return this.zza;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzfz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */