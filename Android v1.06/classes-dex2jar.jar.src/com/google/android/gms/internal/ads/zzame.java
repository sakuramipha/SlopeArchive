package com.google.android.gms.internal.ads;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.LinkedHashMap;
import java.util.Map;

public final class zzame
  implements zzaks
{
  private final Map zza = new LinkedHashMap(16, 0.75F, true);
  private long zzb = 0L;
  private final zzamd zzc;
  private final int zzd;
  
  public zzame(zzamd paramzzamd, int paramInt)
  {
    this.zzc = paramzzamd;
    this.zzd = 5242880;
  }
  
  public zzame(File paramFile, int paramInt)
  {
    this.zzc = new zzama(this, paramFile);
    this.zzd = 20971520;
  }
  
  static int zze(InputStream paramInputStream)
    throws IOException
  {
    int j = zzn(paramInputStream);
    int k = zzn(paramInputStream);
    int i = zzn(paramInputStream);
    return zzn(paramInputStream) << 24 | j | k << 8 | i << 16;
  }
  
  static long zzf(InputStream paramInputStream)
    throws IOException
  {
    return zzn(paramInputStream) & 0xFF | (zzn(paramInputStream) & 0xFF) << 8 | (zzn(paramInputStream) & 0xFF) << 16 | (zzn(paramInputStream) & 0xFF) << 24 | (zzn(paramInputStream) & 0xFF) << 32 | (zzn(paramInputStream) & 0xFF) << 40 | (zzn(paramInputStream) & 0xFF) << 48 | (zzn(paramInputStream) & 0xFF) << 56;
  }
  
  static String zzh(zzamc paramzzamc)
    throws IOException
  {
    return new String(zzm(paramzzamc, zzf(paramzzamc)), "UTF-8");
  }
  
  static void zzj(OutputStream paramOutputStream, int paramInt)
    throws IOException
  {
    paramOutputStream.write(paramInt & 0xFF);
    paramOutputStream.write(paramInt >> 8 & 0xFF);
    paramOutputStream.write(paramInt >> 16 & 0xFF);
    paramOutputStream.write(paramInt >> 24 & 0xFF);
  }
  
  static void zzk(OutputStream paramOutputStream, long paramLong)
    throws IOException
  {
    paramOutputStream.write((byte)(int)paramLong);
    paramOutputStream.write((byte)(int)(paramLong >>> 8));
    paramOutputStream.write((byte)(int)(paramLong >>> 16));
    paramOutputStream.write((byte)(int)(paramLong >>> 24));
    paramOutputStream.write((byte)(int)(paramLong >>> 32));
    paramOutputStream.write((byte)(int)(paramLong >>> 40));
    paramOutputStream.write((byte)(int)(paramLong >>> 48));
    paramOutputStream.write((byte)(int)(paramLong >>> 56));
  }
  
  static void zzl(OutputStream paramOutputStream, String paramString)
    throws IOException
  {
    paramString = paramString.getBytes("UTF-8");
    int i = paramString.length;
    zzk(paramOutputStream, i);
    paramOutputStream.write(paramString, 0, i);
  }
  
  static byte[] zzm(zzamc paramzzamc, long paramLong)
    throws IOException
  {
    long l = paramzzamc.zza();
    if ((paramLong >= 0L) && (paramLong <= l))
    {
      int i = (int)paramLong;
      if (i == paramLong)
      {
        byte[] arrayOfByte = new byte[i];
        new DataInputStream(paramzzamc).readFully(arrayOfByte);
        return arrayOfByte;
      }
    }
    paramzzamc = new StringBuilder();
    paramzzamc.append("streamToBytes length=");
    paramzzamc.append(paramLong);
    paramzzamc.append(", maxLength=");
    paramzzamc.append(l);
    throw new IOException(paramzzamc.toString());
  }
  
  private static int zzn(InputStream paramInputStream)
    throws IOException
  {
    int i = paramInputStream.read();
    if (i != -1) {
      return i;
    }
    throw new EOFException();
  }
  
  private final void zzo(String paramString, zzamb paramzzamb)
  {
    if (!this.zza.containsKey(paramString))
    {
      this.zzb += paramzzamb.zza;
    }
    else
    {
      zzamb localzzamb = (zzamb)this.zza.get(paramString);
      this.zzb += paramzzamb.zza - localzzamb.zza;
    }
    this.zza.put(paramString, paramzzamb);
  }
  
  private final void zzp(String paramString)
  {
    paramString = (zzamb)this.zza.remove(paramString);
    if (paramString != null) {
      this.zzb -= paramString.zza;
    }
  }
  
  private static final String zzq(String paramString)
  {
    int j = paramString.length() / 2;
    int i = paramString.substring(0, j).hashCode();
    j = paramString.substring(j).hashCode();
    return String.valueOf(String.valueOf(i)).concat(String.valueOf(String.valueOf(j)));
  }
  
  /* Error */
  public final zzakr zza(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 27	com/google/android/gms/internal/ads/zzame:zza	Ljava/util/Map;
    //   6: aload_1
    //   7: invokeinterface 150 2 0
    //   12: checkcast 144	com/google/android/gms/internal/ads/zzamb
    //   15: astore 4
    //   17: aload 4
    //   19: ifnonnull +7 -> 26
    //   22: aload_0
    //   23: monitorexit
    //   24: aconst_null
    //   25: areturn
    //   26: aload_0
    //   27: aload_1
    //   28: invokevirtual 187	com/google/android/gms/internal/ads/zzame:zzg	(Ljava/lang/String;)Ljava/io/File;
    //   31: astore_2
    //   32: new 92	com/google/android/gms/internal/ads/zzamc
    //   35: astore_3
    //   36: new 189	java/io/BufferedInputStream
    //   39: astore 5
    //   41: new 191	java/io/FileInputStream
    //   44: astore 6
    //   46: aload 6
    //   48: aload_2
    //   49: invokespecial 194	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   52: aload 5
    //   54: aload 6
    //   56: invokespecial 195	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   59: aload_3
    //   60: aload 5
    //   62: aload_2
    //   63: invokevirtual 199	java/io/File:length	()J
    //   66: invokespecial 202	com/google/android/gms/internal/ads/zzamc:<init>	(Ljava/io/InputStream;J)V
    //   69: aload_3
    //   70: invokestatic 205	com/google/android/gms/internal/ads/zzamb:zza	(Lcom/google/android/gms/internal/ads/zzamc;)Lcom/google/android/gms/internal/ads/zzamb;
    //   73: astore 5
    //   75: aload_1
    //   76: aload 5
    //   78: getfield 208	com/google/android/gms/internal/ads/zzamb:zzb	Ljava/lang/String;
    //   81: invokestatic 214	android/text/TextUtils:equals	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    //   84: ifne +44 -> 128
    //   87: ldc -40
    //   89: iconst_3
    //   90: anewarray 4	java/lang/Object
    //   93: dup
    //   94: iconst_0
    //   95: aload_2
    //   96: invokevirtual 219	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   99: aastore
    //   100: dup
    //   101: iconst_1
    //   102: aload_1
    //   103: aastore
    //   104: dup
    //   105: iconst_2
    //   106: aload 5
    //   108: getfield 208	com/google/android/gms/internal/ads/zzamb:zzb	Ljava/lang/String;
    //   111: aastore
    //   112: invokestatic 224	com/google/android/gms/internal/ads/zzalu:zza	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   115: aload_0
    //   116: aload_1
    //   117: invokespecial 226	com/google/android/gms/internal/ads/zzame:zzp	(Ljava/lang/String;)V
    //   120: aload_3
    //   121: invokevirtual 229	com/google/android/gms/internal/ads/zzamc:close	()V
    //   124: aload_0
    //   125: monitorexit
    //   126: aconst_null
    //   127: areturn
    //   128: aload_3
    //   129: aload_3
    //   130: invokevirtual 95	com/google/android/gms/internal/ads/zzamc:zza	()J
    //   133: invokestatic 64	com/google/android/gms/internal/ads/zzame:zzm	(Lcom/google/android/gms/internal/ads/zzamc;J)[B
    //   136: astore 6
    //   138: new 231	com/google/android/gms/internal/ads/zzakr
    //   141: astore 5
    //   143: aload 5
    //   145: invokespecial 232	com/google/android/gms/internal/ads/zzakr:<init>	()V
    //   148: aload 5
    //   150: aload 6
    //   152: putfield 235	com/google/android/gms/internal/ads/zzakr:zza	[B
    //   155: aload 5
    //   157: aload 4
    //   159: getfield 237	com/google/android/gms/internal/ads/zzamb:zzc	Ljava/lang/String;
    //   162: putfield 238	com/google/android/gms/internal/ads/zzakr:zzb	Ljava/lang/String;
    //   165: aload 5
    //   167: aload 4
    //   169: getfield 240	com/google/android/gms/internal/ads/zzamb:zzd	J
    //   172: putfield 242	com/google/android/gms/internal/ads/zzakr:zzc	J
    //   175: aload 5
    //   177: aload 4
    //   179: getfield 244	com/google/android/gms/internal/ads/zzamb:zze	J
    //   182: putfield 245	com/google/android/gms/internal/ads/zzakr:zzd	J
    //   185: aload 5
    //   187: aload 4
    //   189: getfield 247	com/google/android/gms/internal/ads/zzamb:zzf	J
    //   192: putfield 248	com/google/android/gms/internal/ads/zzakr:zze	J
    //   195: aload 5
    //   197: aload 4
    //   199: getfield 250	com/google/android/gms/internal/ads/zzamb:zzg	J
    //   202: putfield 251	com/google/android/gms/internal/ads/zzakr:zzf	J
    //   205: aload 4
    //   207: getfield 254	com/google/android/gms/internal/ads/zzamb:zzh	Ljava/util/List;
    //   210: astore 7
    //   212: new 256	java/util/TreeMap
    //   215: astore 6
    //   217: aload 6
    //   219: getstatic 260	java/lang/String:CASE_INSENSITIVE_ORDER	Ljava/util/Comparator;
    //   222: invokespecial 263	java/util/TreeMap:<init>	(Ljava/util/Comparator;)V
    //   225: aload 7
    //   227: invokeinterface 269 1 0
    //   232: astore 8
    //   234: aload 8
    //   236: invokeinterface 275 1 0
    //   241: ifeq +36 -> 277
    //   244: aload 8
    //   246: invokeinterface 279 1 0
    //   251: checkcast 281	com/google/android/gms/internal/ads/zzala
    //   254: astore 7
    //   256: aload 6
    //   258: aload 7
    //   260: invokevirtual 283	com/google/android/gms/internal/ads/zzala:zza	()Ljava/lang/String;
    //   263: aload 7
    //   265: invokevirtual 285	com/google/android/gms/internal/ads/zzala:zzb	()Ljava/lang/String;
    //   268: invokeinterface 154 3 0
    //   273: pop
    //   274: goto -40 -> 234
    //   277: aload 5
    //   279: aload 6
    //   281: putfield 287	com/google/android/gms/internal/ads/zzakr:zzg	Ljava/util/Map;
    //   284: aload 5
    //   286: aload 4
    //   288: getfield 254	com/google/android/gms/internal/ads/zzamb:zzh	Ljava/util/List;
    //   291: invokestatic 293	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   294: putfield 294	com/google/android/gms/internal/ads/zzakr:zzh	Ljava/util/List;
    //   297: aload_3
    //   298: invokevirtual 229	com/google/android/gms/internal/ads/zzamc:close	()V
    //   301: aload_0
    //   302: monitorexit
    //   303: aload 5
    //   305: areturn
    //   306: astore 4
    //   308: aload_3
    //   309: invokevirtual 229	com/google/android/gms/internal/ads/zzamc:close	()V
    //   312: aload 4
    //   314: athrow
    //   315: astore_3
    //   316: ldc_w 296
    //   319: iconst_2
    //   320: anewarray 4	java/lang/Object
    //   323: dup
    //   324: iconst_0
    //   325: aload_2
    //   326: invokevirtual 219	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   329: aastore
    //   330: dup
    //   331: iconst_1
    //   332: aload_3
    //   333: invokevirtual 297	java/io/IOException:toString	()Ljava/lang/String;
    //   336: aastore
    //   337: invokestatic 224	com/google/android/gms/internal/ads/zzalu:zza	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   340: aload_0
    //   341: aload_1
    //   342: invokevirtual 300	com/google/android/gms/internal/ads/zzame:zzi	(Ljava/lang/String;)V
    //   345: aload_0
    //   346: monitorexit
    //   347: aconst_null
    //   348: areturn
    //   349: astore_1
    //   350: aload_0
    //   351: monitorexit
    //   352: aload_1
    //   353: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	354	0	this	zzame
    //   0	354	1	paramString	String
    //   31	295	2	localFile	File
    //   35	274	3	localzzamc	zzamc
    //   315	18	3	localIOException	IOException
    //   15	272	4	localzzamb	zzamb
    //   306	7	4	localObject1	Object
    //   39	265	5	localObject2	Object
    //   44	236	6	localObject3	Object
    //   210	54	7	localObject4	Object
    //   232	13	8	localIterator	java.util.Iterator
    // Exception table:
    //   from	to	target	type
    //   69	120	306	finally
    //   128	234	306	finally
    //   234	274	306	finally
    //   277	297	306	finally
    //   32	69	315	java/io/IOException
    //   120	124	315	java/io/IOException
    //   297	301	315	java/io/IOException
    //   308	315	315	java/io/IOException
    //   2	17	349	finally
    //   26	32	349	finally
    //   32	69	349	finally
    //   120	124	349	finally
    //   297	301	349	finally
    //   308	315	349	finally
    //   316	345	349	finally
  }
  
  /* Error */
  public final void zzb()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 31	com/google/android/gms/internal/ads/zzame:zzc	Lcom/google/android/gms/internal/ads/zzamd;
    //   6: invokeinterface 305 1 0
    //   11: astore 5
    //   13: aload 5
    //   15: invokevirtual 308	java/io/File:exists	()Z
    //   18: istore 4
    //   20: iconst_0
    //   21: istore_1
    //   22: iload 4
    //   24: ifne +35 -> 59
    //   27: aload 5
    //   29: invokevirtual 311	java/io/File:mkdirs	()Z
    //   32: ifne +24 -> 56
    //   35: ldc_w 313
    //   38: iconst_1
    //   39: anewarray 4	java/lang/Object
    //   42: dup
    //   43: iconst_0
    //   44: aload 5
    //   46: invokevirtual 219	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   49: aastore
    //   50: invokestatic 315	com/google/android/gms/internal/ads/zzalu:zzb	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   53: aload_0
    //   54: monitorexit
    //   55: return
    //   56: aload_0
    //   57: monitorexit
    //   58: return
    //   59: aload 5
    //   61: invokevirtual 319	java/io/File:listFiles	()[Ljava/io/File;
    //   64: astore 5
    //   66: aload 5
    //   68: ifnull +118 -> 186
    //   71: iload_1
    //   72: aload 5
    //   74: arraylength
    //   75: if_icmpge +108 -> 183
    //   78: aload 5
    //   80: iload_1
    //   81: aaload
    //   82: astore 6
    //   84: aload 6
    //   86: invokevirtual 199	java/io/File:length	()J
    //   89: lstore_2
    //   90: new 92	com/google/android/gms/internal/ads/zzamc
    //   93: astore 7
    //   95: new 189	java/io/BufferedInputStream
    //   98: astore 8
    //   100: new 191	java/io/FileInputStream
    //   103: astore 9
    //   105: aload 9
    //   107: aload 6
    //   109: invokespecial 194	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   112: aload 8
    //   114: aload 9
    //   116: invokespecial 195	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   119: aload 7
    //   121: aload 8
    //   123: lload_2
    //   124: invokespecial 202	com/google/android/gms/internal/ads/zzamc:<init>	(Ljava/io/InputStream;J)V
    //   127: aload 7
    //   129: invokestatic 205	com/google/android/gms/internal/ads/zzamb:zza	(Lcom/google/android/gms/internal/ads/zzamc;)Lcom/google/android/gms/internal/ads/zzamb;
    //   132: astore 8
    //   134: aload 8
    //   136: lload_2
    //   137: putfield 146	com/google/android/gms/internal/ads/zzamb:zza	J
    //   140: aload_0
    //   141: aload 8
    //   143: getfield 208	com/google/android/gms/internal/ads/zzamb:zzb	Ljava/lang/String;
    //   146: aload 8
    //   148: invokespecial 321	com/google/android/gms/internal/ads/zzame:zzo	(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzamb;)V
    //   151: aload 7
    //   153: invokevirtual 229	com/google/android/gms/internal/ads/zzamc:close	()V
    //   156: goto +21 -> 177
    //   159: astore 8
    //   161: aload 7
    //   163: invokevirtual 229	com/google/android/gms/internal/ads/zzamc:close	()V
    //   166: aload 8
    //   168: athrow
    //   169: astore 7
    //   171: aload 6
    //   173: invokevirtual 324	java/io/File:delete	()Z
    //   176: pop
    //   177: iinc 1 1
    //   180: goto -109 -> 71
    //   183: aload_0
    //   184: monitorexit
    //   185: return
    //   186: aload_0
    //   187: monitorexit
    //   188: return
    //   189: astore 5
    //   191: aload_0
    //   192: monitorexit
    //   193: aload 5
    //   195: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	196	0	this	zzame
    //   21	157	1	i	int
    //   89	48	2	l	long
    //   18	5	4	bool	boolean
    //   11	68	5	localObject1	Object
    //   189	5	5	localObject2	Object
    //   82	90	6	localFile	File
    //   93	69	7	localzzamc	zzamc
    //   169	1	7	localIOException	IOException
    //   98	49	8	localObject3	Object
    //   159	8	8	localObject4	Object
    //   103	12	9	localFileInputStream	java.io.FileInputStream
    // Exception table:
    //   from	to	target	type
    //   127	151	159	finally
    //   84	127	169	java/io/IOException
    //   151	156	169	java/io/IOException
    //   161	169	169	java/io/IOException
    //   2	20	189	finally
    //   27	53	189	finally
    //   59	66	189	finally
    //   71	78	189	finally
    //   84	127	189	finally
    //   151	156	189	finally
    //   161	169	189	finally
    //   171	177	189	finally
  }
  
  public final void zzc(String paramString, boolean paramBoolean)
  {
    try
    {
      zzakr localzzakr = zza(paramString);
      if (localzzakr != null)
      {
        localzzakr.zzf = 0L;
        localzzakr.zze = 0L;
        zzd(paramString, localzzakr);
        return;
      }
      return;
    }
    finally {}
  }
  
  /* Error */
  public final void zzd(String paramString, zzakr paramzzakr)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 29	com/google/android/gms/internal/ads/zzame:zzb	J
    //   6: lstore 7
    //   8: aload_2
    //   9: getfield 235	com/google/android/gms/internal/ads/zzakr:zza	[B
    //   12: arraylength
    //   13: istore 4
    //   15: iload 4
    //   17: i2l
    //   18: lstore 5
    //   20: aload_0
    //   21: getfield 34	com/google/android/gms/internal/ads/zzame:zzd	I
    //   24: istore_3
    //   25: lload 7
    //   27: lload 5
    //   29: ladd
    //   30: iload_3
    //   31: i2l
    //   32: lcmp
    //   33: ifle +22 -> 55
    //   36: iload 4
    //   38: i2f
    //   39: iload_3
    //   40: i2f
    //   41: ldc_w 331
    //   44: fmul
    //   45: fcmpl
    //   46: ifgt +6 -> 52
    //   49: goto +6 -> 55
    //   52: aload_0
    //   53: monitorexit
    //   54: return
    //   55: aload_0
    //   56: aload_1
    //   57: invokevirtual 187	com/google/android/gms/internal/ads/zzame:zzg	(Ljava/lang/String;)Ljava/io/File;
    //   60: astore 11
    //   62: new 333	java/io/BufferedOutputStream
    //   65: astore 12
    //   67: new 335	java/io/FileOutputStream
    //   70: astore 9
    //   72: aload 9
    //   74: aload 11
    //   76: invokespecial 336	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   79: aload 12
    //   81: aload 9
    //   83: invokespecial 339	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   86: new 144	com/google/android/gms/internal/ads/zzamb
    //   89: astore 13
    //   91: aload 13
    //   93: aload_1
    //   94: aload_2
    //   95: invokespecial 341	com/google/android/gms/internal/ads/zzamb:<init>	(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzakr;)V
    //   98: aload 12
    //   100: ldc_w 342
    //   103: invokestatic 344	com/google/android/gms/internal/ads/zzame:zzj	(Ljava/io/OutputStream;I)V
    //   106: aload 12
    //   108: aload 13
    //   110: getfield 208	com/google/android/gms/internal/ads/zzamb:zzb	Ljava/lang/String;
    //   113: invokestatic 346	com/google/android/gms/internal/ads/zzame:zzl	(Ljava/io/OutputStream;Ljava/lang/String;)V
    //   116: aload 13
    //   118: getfield 237	com/google/android/gms/internal/ads/zzamb:zzc	Ljava/lang/String;
    //   121: astore 10
    //   123: aload 10
    //   125: astore 9
    //   127: aload 10
    //   129: ifnonnull +8 -> 137
    //   132: ldc_w 348
    //   135: astore 9
    //   137: aload 12
    //   139: aload 9
    //   141: invokestatic 346	com/google/android/gms/internal/ads/zzame:zzl	(Ljava/io/OutputStream;Ljava/lang/String;)V
    //   144: aload 12
    //   146: aload 13
    //   148: getfield 240	com/google/android/gms/internal/ads/zzamb:zzd	J
    //   151: invokestatic 87	com/google/android/gms/internal/ads/zzame:zzk	(Ljava/io/OutputStream;J)V
    //   154: aload 12
    //   156: aload 13
    //   158: getfield 244	com/google/android/gms/internal/ads/zzamb:zze	J
    //   161: invokestatic 87	com/google/android/gms/internal/ads/zzame:zzk	(Ljava/io/OutputStream;J)V
    //   164: aload 12
    //   166: aload 13
    //   168: getfield 247	com/google/android/gms/internal/ads/zzamb:zzf	J
    //   171: invokestatic 87	com/google/android/gms/internal/ads/zzame:zzk	(Ljava/io/OutputStream;J)V
    //   174: aload 12
    //   176: aload 13
    //   178: getfield 250	com/google/android/gms/internal/ads/zzamb:zzg	J
    //   181: invokestatic 87	com/google/android/gms/internal/ads/zzame:zzk	(Ljava/io/OutputStream;J)V
    //   184: aload 13
    //   186: getfield 254	com/google/android/gms/internal/ads/zzamb:zzh	Ljava/util/List;
    //   189: astore 9
    //   191: aload 9
    //   193: ifnull +69 -> 262
    //   196: aload 12
    //   198: aload 9
    //   200: invokeinterface 351 1 0
    //   205: invokestatic 344	com/google/android/gms/internal/ads/zzame:zzj	(Ljava/io/OutputStream;I)V
    //   208: aload 9
    //   210: invokeinterface 269 1 0
    //   215: astore 10
    //   217: aload 10
    //   219: invokeinterface 275 1 0
    //   224: ifeq +44 -> 268
    //   227: aload 10
    //   229: invokeinterface 279 1 0
    //   234: checkcast 281	com/google/android/gms/internal/ads/zzala
    //   237: astore 9
    //   239: aload 12
    //   241: aload 9
    //   243: invokevirtual 283	com/google/android/gms/internal/ads/zzala:zza	()Ljava/lang/String;
    //   246: invokestatic 346	com/google/android/gms/internal/ads/zzame:zzl	(Ljava/io/OutputStream;Ljava/lang/String;)V
    //   249: aload 12
    //   251: aload 9
    //   253: invokevirtual 285	com/google/android/gms/internal/ads/zzala:zzb	()Ljava/lang/String;
    //   256: invokestatic 346	com/google/android/gms/internal/ads/zzame:zzl	(Ljava/io/OutputStream;Ljava/lang/String;)V
    //   259: goto -42 -> 217
    //   262: aload 12
    //   264: iconst_0
    //   265: invokestatic 344	com/google/android/gms/internal/ads/zzame:zzj	(Ljava/io/OutputStream;I)V
    //   268: aload 12
    //   270: invokevirtual 354	java/io/OutputStream:flush	()V
    //   273: aload 12
    //   275: aload_2
    //   276: getfield 235	com/google/android/gms/internal/ads/zzakr:zza	[B
    //   279: invokevirtual 356	java/io/BufferedOutputStream:write	([B)V
    //   282: aload 12
    //   284: invokevirtual 357	java/io/BufferedOutputStream:close	()V
    //   287: aload 13
    //   289: aload 11
    //   291: invokevirtual 199	java/io/File:length	()J
    //   294: putfield 146	com/google/android/gms/internal/ads/zzamb:zza	J
    //   297: aload_0
    //   298: aload_1
    //   299: aload 13
    //   301: invokespecial 321	com/google/android/gms/internal/ads/zzame:zzo	(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzamb;)V
    //   304: aload_0
    //   305: getfield 29	com/google/android/gms/internal/ads/zzame:zzb	J
    //   308: aload_0
    //   309: getfield 34	com/google/android/gms/internal/ads/zzame:zzd	I
    //   312: i2l
    //   313: lcmp
    //   314: ifge +6 -> 320
    //   317: goto +338 -> 655
    //   320: getstatic 360	com/google/android/gms/internal/ads/zzalu:zzb	Z
    //   323: ifeq +13 -> 336
    //   326: ldc_w 362
    //   329: iconst_0
    //   330: anewarray 4	java/lang/Object
    //   333: invokestatic 364	com/google/android/gms/internal/ads/zzalu:zzd	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   336: aload_0
    //   337: getfield 29	com/google/android/gms/internal/ads/zzame:zzb	J
    //   340: lstore 7
    //   342: invokestatic 369	android/os/SystemClock:elapsedRealtime	()J
    //   345: lstore 5
    //   347: aload_0
    //   348: getfield 27	com/google/android/gms/internal/ads/zzame:zza	Ljava/util/Map;
    //   351: invokeinterface 373 1 0
    //   356: invokeinterface 376 1 0
    //   361: astore_1
    //   362: iconst_0
    //   363: istore_3
    //   364: aload_1
    //   365: invokeinterface 275 1 0
    //   370: ifeq +110 -> 480
    //   373: aload_1
    //   374: invokeinterface 279 1 0
    //   379: checkcast 378	java/util/Map$Entry
    //   382: invokeinterface 381 1 0
    //   387: checkcast 144	com/google/android/gms/internal/ads/zzamb
    //   390: astore_2
    //   391: aload_0
    //   392: aload_2
    //   393: getfield 208	com/google/android/gms/internal/ads/zzamb:zzb	Ljava/lang/String;
    //   396: invokevirtual 187	com/google/android/gms/internal/ads/zzame:zzg	(Ljava/lang/String;)Ljava/io/File;
    //   399: invokevirtual 324	java/io/File:delete	()Z
    //   402: ifeq +19 -> 421
    //   405: aload_0
    //   406: aload_0
    //   407: getfield 29	com/google/android/gms/internal/ads/zzame:zzb	J
    //   410: aload_2
    //   411: getfield 146	com/google/android/gms/internal/ads/zzamb:zza	J
    //   414: lsub
    //   415: putfield 29	com/google/android/gms/internal/ads/zzame:zzb	J
    //   418: goto +29 -> 447
    //   421: aload_2
    //   422: getfield 208	com/google/android/gms/internal/ads/zzamb:zzb	Ljava/lang/String;
    //   425: astore_2
    //   426: ldc_w 383
    //   429: iconst_2
    //   430: anewarray 4	java/lang/Object
    //   433: dup
    //   434: iconst_0
    //   435: aload_2
    //   436: aastore
    //   437: dup
    //   438: iconst_1
    //   439: aload_2
    //   440: invokestatic 385	com/google/android/gms/internal/ads/zzame:zzq	(Ljava/lang/String;)Ljava/lang/String;
    //   443: aastore
    //   444: invokestatic 224	com/google/android/gms/internal/ads/zzalu:zza	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   447: aload_1
    //   448: invokeinterface 387 1 0
    //   453: iinc 3 1
    //   456: aload_0
    //   457: getfield 29	com/google/android/gms/internal/ads/zzame:zzb	J
    //   460: l2f
    //   461: aload_0
    //   462: getfield 34	com/google/android/gms/internal/ads/zzame:zzd	I
    //   465: i2f
    //   466: ldc_w 331
    //   469: fmul
    //   470: fcmpg
    //   471: ifge +6 -> 477
    //   474: goto +6 -> 480
    //   477: goto -113 -> 364
    //   480: getstatic 360	com/google/android/gms/internal/ads/zzalu:zzb	Z
    //   483: ifeq +172 -> 655
    //   486: ldc_w 389
    //   489: iconst_3
    //   490: anewarray 4	java/lang/Object
    //   493: dup
    //   494: iconst_0
    //   495: iload_3
    //   496: invokestatic 394	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   499: aastore
    //   500: dup
    //   501: iconst_1
    //   502: aload_0
    //   503: getfield 29	com/google/android/gms/internal/ads/zzame:zzb	J
    //   506: lload 7
    //   508: lsub
    //   509: invokestatic 399	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   512: aastore
    //   513: dup
    //   514: iconst_2
    //   515: invokestatic 369	android/os/SystemClock:elapsedRealtime	()J
    //   518: lload 5
    //   520: lsub
    //   521: invokestatic 399	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   524: aastore
    //   525: invokestatic 364	com/google/android/gms/internal/ads/zzalu:zzd	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   528: aload_0
    //   529: monitorexit
    //   530: return
    //   531: astore_1
    //   532: ldc_w 401
    //   535: iconst_1
    //   536: anewarray 4	java/lang/Object
    //   539: dup
    //   540: iconst_0
    //   541: aload_1
    //   542: invokevirtual 297	java/io/IOException:toString	()Ljava/lang/String;
    //   545: aastore
    //   546: invokestatic 224	com/google/android/gms/internal/ads/zzalu:zza	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   549: aload 12
    //   551: invokevirtual 357	java/io/BufferedOutputStream:close	()V
    //   554: ldc_w 403
    //   557: iconst_1
    //   558: anewarray 4	java/lang/Object
    //   561: dup
    //   562: iconst_0
    //   563: aload 11
    //   565: invokevirtual 219	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   568: aastore
    //   569: invokestatic 224	com/google/android/gms/internal/ads/zzalu:zza	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   572: new 46	java/io/IOException
    //   575: astore_1
    //   576: aload_1
    //   577: invokespecial 404	java/io/IOException:<init>	()V
    //   580: aload_1
    //   581: athrow
    //   582: astore_1
    //   583: aload 11
    //   585: invokevirtual 324	java/io/File:delete	()Z
    //   588: ifne +21 -> 609
    //   591: ldc_w 406
    //   594: iconst_1
    //   595: anewarray 4	java/lang/Object
    //   598: dup
    //   599: iconst_0
    //   600: aload 11
    //   602: invokevirtual 219	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   605: aastore
    //   606: invokestatic 224	com/google/android/gms/internal/ads/zzalu:zza	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   609: aload_0
    //   610: getfield 31	com/google/android/gms/internal/ads/zzame:zzc	Lcom/google/android/gms/internal/ads/zzamd;
    //   613: invokeinterface 305 1 0
    //   618: invokevirtual 308	java/io/File:exists	()Z
    //   621: ifne +34 -> 655
    //   624: ldc_w 408
    //   627: iconst_0
    //   628: anewarray 4	java/lang/Object
    //   631: invokestatic 224	com/google/android/gms/internal/ads/zzalu:zza	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   634: aload_0
    //   635: getfield 27	com/google/android/gms/internal/ads/zzame:zza	Ljava/util/Map;
    //   638: invokeinterface 411 1 0
    //   643: aload_0
    //   644: lconst_0
    //   645: putfield 29	com/google/android/gms/internal/ads/zzame:zzb	J
    //   648: aload_0
    //   649: invokevirtual 413	com/google/android/gms/internal/ads/zzame:zzb	()V
    //   652: aload_0
    //   653: monitorexit
    //   654: return
    //   655: aload_0
    //   656: monitorexit
    //   657: return
    //   658: astore_1
    //   659: aload_0
    //   660: monitorexit
    //   661: aload_1
    //   662: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	663	0	this	zzame
    //   0	663	1	paramString	String
    //   0	663	2	paramzzakr	zzakr
    //   24	472	3	i	int
    //   13	24	4	j	int
    //   18	501	5	l1	long
    //   6	501	7	l2	long
    //   70	182	9	localObject1	Object
    //   121	107	10	localObject2	Object
    //   60	541	11	localFile	File
    //   65	485	12	localBufferedOutputStream	java.io.BufferedOutputStream
    //   89	211	13	localzzamb	zzamb
    // Exception table:
    //   from	to	target	type
    //   98	123	531	java/io/IOException
    //   137	191	531	java/io/IOException
    //   196	217	531	java/io/IOException
    //   217	259	531	java/io/IOException
    //   262	268	531	java/io/IOException
    //   268	273	531	java/io/IOException
    //   62	98	582	java/io/IOException
    //   273	317	582	java/io/IOException
    //   320	336	582	java/io/IOException
    //   336	362	582	java/io/IOException
    //   364	418	582	java/io/IOException
    //   421	447	582	java/io/IOException
    //   447	453	582	java/io/IOException
    //   456	474	582	java/io/IOException
    //   480	528	582	java/io/IOException
    //   532	582	582	java/io/IOException
    //   2	15	658	finally
    //   20	25	658	finally
    //   55	62	658	finally
    //   62	98	658	finally
    //   98	123	658	finally
    //   137	191	658	finally
    //   196	217	658	finally
    //   217	259	658	finally
    //   262	268	658	finally
    //   268	273	658	finally
    //   273	317	658	finally
    //   320	336	658	finally
    //   336	362	658	finally
    //   364	418	658	finally
    //   421	447	658	finally
    //   447	453	658	finally
    //   456	474	658	finally
    //   480	528	658	finally
    //   532	582	658	finally
    //   583	609	658	finally
    //   609	652	658	finally
  }
  
  public final File zzg(String paramString)
  {
    return new File(this.zzc.zza(), zzq(paramString));
  }
  
  public final void zzi(String paramString)
  {
    try
    {
      boolean bool = zzg(paramString).delete();
      zzp(paramString);
      if (!bool)
      {
        zzalu.zza("Could not delete cache entry for key=%s, filename=%s", new Object[] { paramString, zzq(paramString) });
        return;
      }
      return;
    }
    finally {}
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzame.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */