package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class zzcer
  extends zzfr
  implements zzgu
{
  private static final Pattern zzb = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
  private final int zzc;
  private final int zzd;
  private final String zze;
  private final zzgt zzf;
  private zzgc zzg;
  private HttpURLConnection zzh;
  private final Queue zzi;
  private InputStream zzj;
  private boolean zzk;
  private int zzl;
  private long zzm;
  private long zzn;
  private long zzo;
  private long zzp;
  private long zzq;
  private final long zzr;
  private final long zzs;
  
  zzcer(String paramString, zzgz paramzzgz, int paramInt1, int paramInt2, long paramLong1, long paramLong2)
  {
    super(true);
    zzdy.zzc(paramString);
    this.zze = paramString;
    this.zzf = new zzgt();
    this.zzc = paramInt1;
    this.zzd = paramInt2;
    this.zzi = new ArrayDeque();
    this.zzr = paramLong1;
    this.zzs = paramLong2;
    if (paramzzgz != null) {
      zzf(paramzzgz);
    }
  }
  
  private final void zzl()
  {
    while (!this.zzi.isEmpty())
    {
      HttpURLConnection localHttpURLConnection = (HttpURLConnection)this.zzi.remove();
      try
      {
        localHttpURLConnection.disconnect();
      }
      catch (Exception localException)
      {
        zzbzt.zzh("Unexpected error while disconnecting", localException);
      }
    }
    this.zzh = null;
  }
  
  public final int zza(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws zzgq
  {
    int i = -1;
    if (paramInt2 == 0) {
      paramInt1 = 0;
    }
    try
    {
      long l1 = this.zzm;
      long l5 = this.zzn;
      if (l1 - l5 == 0L)
      {
        paramInt1 = i;
      }
      else
      {
        long l7 = this.zzo;
        long l3 = paramInt2;
        long l6 = this.zzs;
        long l2 = this.zzq;
        long l4 = l2 + 1L;
        l1 = l2;
        if (l7 + l5 + l3 + l6 > l4)
        {
          l5 = this.zzp;
          l1 = l2;
          if (l2 < l5)
          {
            l1 = Math.min(l5, Math.max(this.zzr + l4 - l6 - 1L, -1L + (l4 + l3)));
            zzk(l4, l1, 2);
            this.zzq = l1;
          }
        }
        paramInt2 = (int)Math.min(l3, l1 + 1L - this.zzo - this.zzn);
        paramInt1 = this.zzj.read(paramArrayOfByte, paramInt1, paramInt2);
        if (paramInt1 == -1) {
          break label209;
        }
        this.zzn += paramInt1;
        zzg(paramInt1);
      }
      return paramInt1;
      label209:
      paramArrayOfByte = new java/io/EOFException;
      paramArrayOfByte.<init>();
      throw paramArrayOfByte;
    }
    catch (IOException paramArrayOfByte)
    {
      throw new zzgq(paramArrayOfByte, this.zzg, 2000, 2);
    }
  }
  
  public final long zzb(zzgc paramzzgc)
    throws zzgq
  {
    this.zzg = paramzzgc;
    this.zzn = 0L;
    long l2 = paramzzgc.zzf;
    long l1 = paramzzgc.zzg;
    if (l1 == -1L) {
      l1 = this.zzr;
    } else {
      l1 = Math.min(this.zzr, l1);
    }
    this.zzo = l2;
    Object localObject = zzk(l2, l1 + l2 - 1L, 1);
    this.zzh = ((HttpURLConnection)localObject);
    localObject = ((HttpURLConnection)localObject).getHeaderField("Content-Range");
    if (!TextUtils.isEmpty((CharSequence)localObject))
    {
      Matcher localMatcher = zzb.matcher((CharSequence)localObject);
      if (localMatcher.find()) {
        try
        {
          Long.parseLong(localMatcher.group(1));
          long l3 = Long.parseLong(localMatcher.group(2));
          l2 = Long.parseLong(localMatcher.group(3));
          l1 = paramzzgc.zzg;
          if (l1 != -1L)
          {
            this.zzm = l1;
            this.zzp = Math.max(l3, this.zzo + l1 - 1L);
          }
          else
          {
            this.zzm = (l2 - this.zzo);
            this.zzp = (l2 - 1L);
          }
          this.zzq = l3;
          this.zzk = true;
          zzj(paramzzgc);
          return this.zzm;
        }
        catch (NumberFormatException localNumberFormatException)
        {
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("Unexpected Content-Range [");
          localStringBuilder.append((String)localObject);
          localStringBuilder.append("]");
          zzbzt.zzg(localStringBuilder.toString());
        }
      }
    }
    throw new zzcep((String)localObject, paramzzgc);
  }
  
  public final Uri zzc()
  {
    HttpURLConnection localHttpURLConnection = this.zzh;
    if (localHttpURLConnection == null) {
      return null;
    }
    return Uri.parse(localHttpURLConnection.getURL().toString());
  }
  
  public final void zzd()
    throws zzgq
  {
    try
    {
      Object localObject1 = this.zzj;
      if (localObject1 != null) {
        try
        {
          ((InputStream)localObject1).close();
        }
        catch (IOException localIOException)
        {
          localObject1 = new com/google/android/gms/internal/ads/zzgq;
          ((zzgq)localObject1).<init>(localIOException, this.zzg, 2000, 3);
          throw ((Throwable)localObject1);
        }
      }
      return;
    }
    finally
    {
      this.zzj = null;
      zzl();
      if (this.zzk)
      {
        this.zzk = false;
        zzh();
      }
    }
  }
  
  public final Map zze()
  {
    HttpURLConnection localHttpURLConnection = this.zzh;
    if (localHttpURLConnection == null) {
      return null;
    }
    return localHttpURLConnection.getHeaderFields();
  }
  
  /* Error */
  final HttpURLConnection zzk(long paramLong1, long paramLong2, int paramInt)
    throws zzgq
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 152	com/google/android/gms/internal/ads/zzcer:zzg	Lcom/google/android/gms/internal/ads/zzgc;
    //   4: getfield 250	com/google/android/gms/internal/ads/zzgc:zza	Landroid/net/Uri;
    //   7: invokevirtual 251	android/net/Uri:toString	()Ljava/lang/String;
    //   10: astore 7
    //   12: new 229	java/net/URL
    //   15: astore 8
    //   17: aload 8
    //   19: aload 7
    //   21: invokespecial 253	java/net/URL:<init>	(Ljava/lang/String;)V
    //   24: aload 8
    //   26: invokevirtual 257	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   29: checkcast 95	java/net/HttpURLConnection
    //   32: astore 9
    //   34: aload 9
    //   36: aload_0
    //   37: getfield 67	com/google/android/gms/internal/ads/zzcer:zzc	I
    //   40: invokevirtual 260	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   43: aload 9
    //   45: aload_0
    //   46: getfield 69	com/google/android/gms/internal/ads/zzcer:zzd	I
    //   49: invokevirtual 263	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   52: aload_0
    //   53: getfield 65	com/google/android/gms/internal/ads/zzcer:zzf	Lcom/google/android/gms/internal/ads/zzgt;
    //   56: invokevirtual 265	com/google/android/gms/internal/ads/zzgt:zza	()Ljava/util/Map;
    //   59: invokeinterface 271 1 0
    //   64: invokeinterface 277 1 0
    //   69: astore 10
    //   71: aload 10
    //   73: invokeinterface 282 1 0
    //   78: ifeq +43 -> 121
    //   81: aload 10
    //   83: invokeinterface 285 1 0
    //   88: checkcast 287	java/util/Map$Entry
    //   91: astore 8
    //   93: aload 9
    //   95: aload 8
    //   97: invokeinterface 290 1 0
    //   102: checkcast 292	java/lang/String
    //   105: aload 8
    //   107: invokeinterface 295 1 0
    //   112: checkcast 292	java/lang/String
    //   115: invokevirtual 299	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   118: goto -47 -> 71
    //   121: new 201	java/lang/StringBuilder
    //   124: astore 8
    //   126: aload 8
    //   128: invokespecial 202	java/lang/StringBuilder:<init>	()V
    //   131: aload 8
    //   133: ldc_w 301
    //   136: invokevirtual 208	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   139: pop
    //   140: aload 8
    //   142: lload_1
    //   143: invokevirtual 304	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   146: pop
    //   147: aload 8
    //   149: ldc_w 306
    //   152: invokevirtual 208	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   155: pop
    //   156: aload 8
    //   158: lload_3
    //   159: invokevirtual 304	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   162: pop
    //   163: aload 9
    //   165: ldc_w 308
    //   168: aload 8
    //   170: invokevirtual 214	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   173: invokevirtual 299	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   176: aload 9
    //   178: ldc_w 310
    //   181: aload_0
    //   182: getfield 59	com/google/android/gms/internal/ads/zzcer:zze	Ljava/lang/String;
    //   185: invokevirtual 299	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   188: aload 9
    //   190: ldc_w 312
    //   193: ldc_w 314
    //   196: invokevirtual 299	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   199: aload 9
    //   201: ldc_w 316
    //   204: invokevirtual 319	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   207: aload 9
    //   209: invokevirtual 322	java/net/HttpURLConnection:connect	()V
    //   212: aload_0
    //   213: getfield 74	com/google/android/gms/internal/ads/zzcer:zzi	Ljava/util/Queue;
    //   216: aload 9
    //   218: invokeinterface 326 2 0
    //   223: pop
    //   224: aload_0
    //   225: getfield 152	com/google/android/gms/internal/ads/zzcer:zzg	Lcom/google/android/gms/internal/ads/zzgc;
    //   228: getfield 250	com/google/android/gms/internal/ads/zzgc:zza	Landroid/net/Uri;
    //   231: invokevirtual 251	android/net/Uri:toString	()Ljava/lang/String;
    //   234: astore 8
    //   236: aload 9
    //   238: invokevirtual 330	java/net/HttpURLConnection:getResponseCode	()I
    //   241: istore 6
    //   243: aload_0
    //   244: iload 6
    //   246: putfield 332	com/google/android/gms/internal/ads/zzcer:zzl	I
    //   249: iload 6
    //   251: sipush 200
    //   254: if_icmplt +79 -> 333
    //   257: iload 6
    //   259: sipush 299
    //   262: if_icmpgt +71 -> 333
    //   265: aload 9
    //   267: invokevirtual 336	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   270: astore 8
    //   272: aload 8
    //   274: astore 7
    //   276: aload_0
    //   277: getfield 139	com/google/android/gms/internal/ads/zzcer:zzj	Ljava/io/InputStream;
    //   280: ifnull +19 -> 299
    //   283: new 338	java/io/SequenceInputStream
    //   286: astore 7
    //   288: aload 7
    //   290: aload_0
    //   291: getfield 139	com/google/android/gms/internal/ads/zzcer:zzj	Ljava/io/InputStream;
    //   294: aload 8
    //   296: invokespecial 341	java/io/SequenceInputStream:<init>	(Ljava/io/InputStream;Ljava/io/InputStream;)V
    //   299: aload_0
    //   300: aload 7
    //   302: putfield 139	com/google/android/gms/internal/ads/zzcer:zzj	Ljava/io/InputStream;
    //   305: aload 9
    //   307: areturn
    //   308: astore 7
    //   310: aload_0
    //   311: invokespecial 241	com/google/android/gms/internal/ads/zzcer:zzl	()V
    //   314: new 111	com/google/android/gms/internal/ads/zzgq
    //   317: dup
    //   318: aload 7
    //   320: aload_0
    //   321: getfield 152	com/google/android/gms/internal/ads/zzcer:zzg	Lcom/google/android/gms/internal/ads/zzgc;
    //   324: sipush 2000
    //   327: iload 5
    //   329: invokespecial 155	com/google/android/gms/internal/ads/zzgq:<init>	(Ljava/io/IOException;Lcom/google/android/gms/internal/ads/zzgc;II)V
    //   332: athrow
    //   333: aload 9
    //   335: invokevirtual 247	java/net/HttpURLConnection:getHeaderFields	()Ljava/util/Map;
    //   338: astore 7
    //   340: aload_0
    //   341: invokespecial 241	com/google/android/gms/internal/ads/zzcer:zzl	()V
    //   344: new 343	com/google/android/gms/internal/ads/zzceq
    //   347: dup
    //   348: aload_0
    //   349: getfield 332	com/google/android/gms/internal/ads/zzcer:zzl	I
    //   352: aload 7
    //   354: aload_0
    //   355: getfield 152	com/google/android/gms/internal/ads/zzcer:zzg	Lcom/google/android/gms/internal/ads/zzgc;
    //   358: iload 5
    //   360: invokespecial 346	com/google/android/gms/internal/ads/zzceq:<init>	(ILjava/util/Map;Lcom/google/android/gms/internal/ads/zzgc;I)V
    //   363: athrow
    //   364: astore 7
    //   366: aload_0
    //   367: invokespecial 241	com/google/android/gms/internal/ads/zzcer:zzl	()V
    //   370: aload 8
    //   372: invokestatic 350	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   375: astore 8
    //   377: aload_0
    //   378: getfield 152	com/google/android/gms/internal/ads/zzcer:zzg	Lcom/google/android/gms/internal/ads/zzgc;
    //   381: astore 9
    //   383: new 111	com/google/android/gms/internal/ads/zzgq
    //   386: dup
    //   387: ldc_w 352
    //   390: aload 8
    //   392: invokevirtual 355	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   395: aload 7
    //   397: aload 9
    //   399: sipush 2000
    //   402: iload 5
    //   404: invokespecial 358	com/google/android/gms/internal/ads/zzgq:<init>	(Ljava/lang/String;Ljava/io/IOException;Lcom/google/android/gms/internal/ads/zzgc;II)V
    //   407: athrow
    //   408: astore 8
    //   410: aload 7
    //   412: invokestatic 350	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   415: astore 9
    //   417: aload_0
    //   418: getfield 152	com/google/android/gms/internal/ads/zzcer:zzg	Lcom/google/android/gms/internal/ads/zzgc;
    //   421: astore 7
    //   423: new 111	com/google/android/gms/internal/ads/zzgq
    //   426: dup
    //   427: ldc_w 352
    //   430: aload 9
    //   432: invokevirtual 355	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   435: aload 8
    //   437: aload 7
    //   439: sipush 2000
    //   442: iload 5
    //   444: invokespecial 358	com/google/android/gms/internal/ads/zzgq:<init>	(Ljava/lang/String;Ljava/io/IOException;Lcom/google/android/gms/internal/ads/zzgc;II)V
    //   447: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	448	0	this	zzcer
    //   0	448	1	paramLong1	long
    //   0	448	3	paramLong2	long
    //   0	448	5	paramInt	int
    //   241	22	6	i	int
    //   10	291	7	localObject1	Object
    //   308	11	7	localIOException1	IOException
    //   338	15	7	localMap	Map
    //   364	47	7	localIOException2	IOException
    //   421	17	7	localzzgc	zzgc
    //   15	376	8	localObject2	Object
    //   408	28	8	localIOException3	IOException
    //   32	399	9	localObject3	Object
    //   69	13	10	localIterator	java.util.Iterator
    // Exception table:
    //   from	to	target	type
    //   265	272	308	java/io/IOException
    //   276	299	308	java/io/IOException
    //   299	305	308	java/io/IOException
    //   236	249	364	java/io/IOException
    //   12	71	408	java/io/IOException
    //   71	118	408	java/io/IOException
    //   121	224	408	java/io/IOException
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */