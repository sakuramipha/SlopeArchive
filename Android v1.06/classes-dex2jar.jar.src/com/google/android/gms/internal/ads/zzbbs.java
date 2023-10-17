package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.ParametersAreNonnullByDefault;

@Deprecated
@ParametersAreNonnullByDefault
public final class zzbbs
{
  final BlockingQueue zza = new ArrayBlockingQueue(100);
  final LinkedHashMap zzb = new LinkedHashMap();
  final Map zzc = new HashMap();
  String zzd;
  Context zze;
  String zzf;
  private final HashSet zzg = new HashSet(Arrays.asList(new String[] { "noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged" }));
  private AtomicBoolean zzh;
  private File zzi;
  
  /* Error */
  private final void zzg(Map paramMap, zzbcb paramzzbcb)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 114	com/google/android/gms/internal/ads/zzbbs:zzd	Ljava/lang/String;
    //   4: invokestatic 120	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   7: invokevirtual 124	android/net/Uri:buildUpon	()Landroid/net/Uri$Builder;
    //   10: astore_3
    //   11: aload_1
    //   12: invokeinterface 130 1 0
    //   17: invokeinterface 136 1 0
    //   22: astore 4
    //   24: aload 4
    //   26: invokeinterface 142 1 0
    //   31: ifeq +40 -> 71
    //   34: aload 4
    //   36: invokeinterface 145 1 0
    //   41: checkcast 147	java/util/Map$Entry
    //   44: astore_1
    //   45: aload_3
    //   46: aload_1
    //   47: invokeinterface 150 1 0
    //   52: checkcast 48	java/lang/String
    //   55: aload_1
    //   56: invokeinterface 153 1 0
    //   61: checkcast 48	java/lang/String
    //   64: invokevirtual 159	android/net/Uri$Builder:appendQueryParameter	(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   67: pop
    //   68: goto -44 -> 24
    //   71: aload_3
    //   72: invokevirtual 163	android/net/Uri$Builder:build	()Landroid/net/Uri;
    //   75: invokevirtual 166	android/net/Uri:toString	()Ljava/lang/String;
    //   78: astore_1
    //   79: aload_1
    //   80: astore_3
    //   81: aload_2
    //   82: ifnull +69 -> 151
    //   85: new 168	java/lang/StringBuilder
    //   88: dup
    //   89: aload_1
    //   90: invokespecial 171	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   93: astore_1
    //   94: aload_2
    //   95: invokevirtual 87	com/google/android/gms/internal/ads/zzbcb:zzb	()Ljava/lang/String;
    //   98: invokestatic 93	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   101: ifne +19 -> 120
    //   104: aload_1
    //   105: ldc -83
    //   107: invokevirtual 177	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   110: pop
    //   111: aload_1
    //   112: aload_2
    //   113: invokevirtual 87	com/google/android/gms/internal/ads/zzbcb:zzb	()Ljava/lang/String;
    //   116: invokevirtual 177	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   119: pop
    //   120: aload_2
    //   121: invokevirtual 179	com/google/android/gms/internal/ads/zzbcb:zza	()Ljava/lang/String;
    //   124: invokestatic 93	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   127: ifne +19 -> 146
    //   130: aload_1
    //   131: ldc -75
    //   133: invokevirtual 177	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   136: pop
    //   137: aload_1
    //   138: aload_2
    //   139: invokevirtual 179	com/google/android/gms/internal/ads/zzbcb:zza	()Ljava/lang/String;
    //   142: invokevirtual 177	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   145: pop
    //   146: aload_1
    //   147: invokevirtual 182	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   150: astore_3
    //   151: aload_0
    //   152: getfield 184	com/google/android/gms/internal/ads/zzbbs:zzh	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   155: invokevirtual 189	java/util/concurrent/atomic/AtomicBoolean:get	()Z
    //   158: ifeq +137 -> 295
    //   161: aload_0
    //   162: getfield 191	com/google/android/gms/internal/ads/zzbbs:zzi	Ljava/io/File;
    //   165: astore 6
    //   167: aload 6
    //   169: ifnull +120 -> 289
    //   172: aconst_null
    //   173: astore 4
    //   175: aconst_null
    //   176: astore 5
    //   178: aload 5
    //   180: astore_1
    //   181: new 193	java/io/FileOutputStream
    //   184: astore_2
    //   185: aload 5
    //   187: astore_1
    //   188: aload_2
    //   189: aload 6
    //   191: iconst_1
    //   192: invokespecial 196	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   195: aload_2
    //   196: aload_3
    //   197: invokevirtual 200	java/lang/String:getBytes	()[B
    //   200: invokevirtual 204	java/io/FileOutputStream:write	([B)V
    //   203: aload_2
    //   204: bipush 10
    //   206: invokevirtual 206	java/io/FileOutputStream:write	(I)V
    //   209: aload_2
    //   210: invokevirtual 209	java/io/FileOutputStream:close	()V
    //   213: return
    //   214: astore_1
    //   215: ldc -45
    //   217: aload_1
    //   218: invokestatic 110	com/google/android/gms/internal/ads/zzbzt:zzk	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   221: return
    //   222: astore_1
    //   223: goto +46 -> 269
    //   226: astore_1
    //   227: aload_1
    //   228: astore_3
    //   229: goto +15 -> 244
    //   232: astore_3
    //   233: aload_1
    //   234: astore_2
    //   235: aload_3
    //   236: astore_1
    //   237: goto +32 -> 269
    //   240: astore_3
    //   241: aload 4
    //   243: astore_2
    //   244: aload_2
    //   245: astore_1
    //   246: ldc -43
    //   248: aload_3
    //   249: invokestatic 110	com/google/android/gms/internal/ads/zzbzt:zzk	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   252: aload_2
    //   253: ifnull +15 -> 268
    //   256: aload_2
    //   257: invokevirtual 209	java/io/FileOutputStream:close	()V
    //   260: return
    //   261: astore_1
    //   262: ldc -45
    //   264: aload_1
    //   265: invokestatic 110	com/google/android/gms/internal/ads/zzbzt:zzk	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   268: return
    //   269: aload_2
    //   270: ifnull +17 -> 287
    //   273: aload_2
    //   274: invokevirtual 209	java/io/FileOutputStream:close	()V
    //   277: goto +10 -> 287
    //   280: astore_2
    //   281: ldc -45
    //   283: aload_2
    //   284: invokestatic 110	com/google/android/gms/internal/ads/zzbzt:zzk	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   287: aload_1
    //   288: athrow
    //   289: ldc -41
    //   291: invokestatic 218	com/google/android/gms/internal/ads/zzbzt:zzj	(Ljava/lang/String;)V
    //   294: return
    //   295: invokestatic 224	com/google/android/gms/ads/internal/zzt:zzp	()Lcom/google/android/gms/ads/internal/util/zzs;
    //   298: pop
    //   299: aload_0
    //   300: getfield 226	com/google/android/gms/internal/ads/zzbbs:zze	Landroid/content/Context;
    //   303: aload_0
    //   304: getfield 228	com/google/android/gms/internal/ads/zzbbs:zzf	Ljava/lang/String;
    //   307: aload_3
    //   308: invokestatic 234	com/google/android/gms/ads/internal/util/zzs:zzH	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    //   311: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	312	0	this	zzbbs
    //   0	312	1	paramMap	Map
    //   0	312	2	paramzzbcb	zzbcb
    //   10	219	3	localObject1	Object
    //   232	4	3	localObject2	Object
    //   240	68	3	localIOException	java.io.IOException
    //   22	220	4	localIterator	Iterator
    //   176	10	5	localObject3	Object
    //   165	25	6	localFile	File
    // Exception table:
    //   from	to	target	type
    //   209	213	214	java/io/IOException
    //   195	209	222	finally
    //   195	209	226	java/io/IOException
    //   181	185	232	finally
    //   188	195	232	finally
    //   246	252	232	finally
    //   181	185	240	java/io/IOException
    //   188	195	240	java/io/IOException
    //   256	260	261	java/io/IOException
    //   273	277	280	java/io/IOException
  }
  
  public final zzbby zza(String paramString)
  {
    paramString = (zzbby)this.zzc.get(paramString);
    if (paramString != null) {
      return paramString;
    }
    return zzbby.zza;
  }
  
  final Map zzb(Map paramMap1, Map paramMap2)
  {
    paramMap1 = new LinkedHashMap(paramMap1);
    Iterator localIterator = paramMap2.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (Map.Entry)localIterator.next();
      paramMap2 = (String)((Map.Entry)localObject).getKey();
      localObject = (String)((Map.Entry)localObject).getValue();
      String str = (String)paramMap1.get(paramMap2);
      paramMap1.put(paramMap2, zza(paramMap2).zza(str, (String)localObject));
    }
    return paramMap1;
  }
  
  public final void zzd(Context paramContext, String paramString1, String paramString2, Map paramMap)
  {
    this.zze = paramContext;
    this.zzf = paramString1;
    this.zzd = paramString2;
    paramContext = new AtomicBoolean(false);
    this.zzh = paramContext;
    paramContext.set(((Boolean)zzbcy.zzc.zze()).booleanValue());
    if (this.zzh.get())
    {
      paramContext = Environment.getExternalStorageDirectory();
      if (paramContext != null) {
        this.zzi = new File(paramContext, "sdk_csi_data.txt");
      }
    }
    paramContext = paramMap.entrySet().iterator();
    while (paramContext.hasNext())
    {
      paramString1 = (Map.Entry)paramContext.next();
      this.zzb.put((String)paramString1.getKey(), (String)paramString1.getValue());
    }
    zzcag.zza.execute(new zzbbr(this));
    this.zzc.put("action", zzbby.zzb);
    this.zzc.put("ad_format", zzbby.zzb);
    this.zzc.put("e", zzbby.zzc);
  }
  
  public final void zze(String paramString)
  {
    if (this.zzg.contains(paramString)) {
      return;
    }
    LinkedHashMap localLinkedHashMap = new LinkedHashMap();
    localLinkedHashMap.put("sdkVersion", this.zzf);
    localLinkedHashMap.put("ue", paramString);
    zzg(zzb(this.zzb, localLinkedHashMap), null);
  }
  
  public final boolean zzf(zzbcc paramzzbcc)
  {
    return this.zza.offer(paramzzbcc);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbbs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */