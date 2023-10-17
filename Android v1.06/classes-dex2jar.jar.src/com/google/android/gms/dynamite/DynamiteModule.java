package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public final class DynamiteModule
{
  public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = new zzi();
  public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new zzj();
  public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = new zzk();
  public static final VersionPolicy PREFER_LOCAL;
  public static final VersionPolicy PREFER_REMOTE;
  public static final VersionPolicy PREFER_REMOTE_VERSION_NO_FORCE_STAGING;
  public static final VersionPolicy zza = new zzl();
  private static Boolean zzb;
  private static String zzc;
  private static boolean zzd = false;
  private static int zze = -1;
  private static final ThreadLocal<zzn> zzf = new ThreadLocal();
  private static final ThreadLocal<Long> zzg = new zzd();
  private static final DynamiteModule.VersionPolicy.IVersions zzh = new zze();
  private static zzq zzj;
  private static zzr zzk;
  private final Context zzi;
  
  static
  {
    PREFER_REMOTE = new zzf();
    PREFER_LOCAL = new zzg();
    PREFER_REMOTE_VERSION_NO_FORCE_STAGING = new zzh();
  }
  
  private DynamiteModule(Context paramContext)
  {
    Preconditions.checkNotNull(paramContext);
    this.zzi = paramContext;
  }
  
  public static int getLocalVersion(Context paramContext, String paramString)
  {
    try
    {
      paramContext = paramContext.getApplicationContext().getClassLoader();
      int i = String.valueOf(paramString).length();
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>(i + 61);
      ((StringBuilder)localObject).append("com.google.android.gms.dynamite.descriptors.");
      ((StringBuilder)localObject).append(paramString);
      ((StringBuilder)localObject).append(".");
      ((StringBuilder)localObject).append("ModuleDescriptor");
      localObject = paramContext.loadClass(((StringBuilder)localObject).toString());
      paramContext = ((Class)localObject).getDeclaredField("MODULE_ID");
      localObject = ((Class)localObject).getDeclaredField("MODULE_VERSION");
      if (!Objects.equal(paramContext.get(null), paramString))
      {
        paramContext = String.valueOf(paramContext.get(null));
        int j = String.valueOf(paramContext).length();
        i = String.valueOf(paramString).length();
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>(j + 51 + i);
        ((StringBuilder)localObject).append("Module descriptor id '");
        ((StringBuilder)localObject).append(paramContext);
        ((StringBuilder)localObject).append("' didn't match expected id '");
        ((StringBuilder)localObject).append(paramString);
        ((StringBuilder)localObject).append("'");
        Log.e("DynamiteModule", ((StringBuilder)localObject).toString());
        return 0;
      }
      i = ((Field)localObject).getInt(null);
      return i;
    }
    catch (Exception paramContext)
    {
      paramContext = String.valueOf(paramContext.getMessage());
      if (paramContext.length() != 0) {
        paramContext = "Failed to load module descriptor class: ".concat(paramContext);
      } else {
        paramContext = new String("Failed to load module descriptor class: ");
      }
      Log.e("DynamiteModule", paramContext);
    }
    catch (ClassNotFoundException paramContext)
    {
      paramContext = new StringBuilder(String.valueOf(paramString).length() + 45);
      paramContext.append("Local module descriptor class for ");
      paramContext.append(paramString);
      paramContext.append(" not found.");
      Log.w("DynamiteModule", paramContext.toString());
    }
    return 0;
  }
  
  public static int getRemoteVersion(Context paramContext, String paramString)
  {
    return zza(paramContext, paramString, false);
  }
  
  /* Error */
  public static DynamiteModule load(Context paramContext, VersionPolicy paramVersionPolicy, String paramString)
    throws DynamiteModule.LoadingException
  {
    // Byte code:
    //   0: getstatic 59	com/google/android/gms/dynamite/DynamiteModule:zzf	Ljava/lang/ThreadLocal;
    //   3: astore 14
    //   5: aload 14
    //   7: invokevirtual 235	java/lang/ThreadLocal:get	()Ljava/lang/Object;
    //   10: checkcast 237	com/google/android/gms/dynamite/zzn
    //   13: astore 11
    //   15: new 237	com/google/android/gms/dynamite/zzn
    //   18: dup
    //   19: aconst_null
    //   20: invokespecial 240	com/google/android/gms/dynamite/zzn:<init>	(Lcom/google/android/gms/dynamite/zzm;)V
    //   23: astore 12
    //   25: aload 14
    //   27: aload 12
    //   29: invokevirtual 244	java/lang/ThreadLocal:set	(Ljava/lang/Object;)V
    //   32: getstatic 64	com/google/android/gms/dynamite/DynamiteModule:zzg	Ljava/lang/ThreadLocal;
    //   35: astore 15
    //   37: aload 15
    //   39: invokevirtual 235	java/lang/ThreadLocal:get	()Ljava/lang/Object;
    //   42: checkcast 246	java/lang/Long
    //   45: invokevirtual 250	java/lang/Long:longValue	()J
    //   48: lstore 8
    //   50: aload 15
    //   52: invokestatic 255	android/os/SystemClock:elapsedRealtime	()J
    //   55: invokestatic 258	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   58: invokevirtual 244	java/lang/ThreadLocal:set	(Ljava/lang/Object;)V
    //   61: aload_1
    //   62: aload_0
    //   63: aload_2
    //   64: getstatic 69	com/google/android/gms/dynamite/DynamiteModule:zzh	Lcom/google/android/gms/dynamite/DynamiteModule$VersionPolicy$IVersions;
    //   67: invokeinterface 262 4 0
    //   72: astore 13
    //   74: aload 13
    //   76: getfield 265	com/google/android/gms/dynamite/DynamiteModule$VersionPolicy$SelectionResult:localVersion	I
    //   79: istore 5
    //   81: aload 13
    //   83: getfield 268	com/google/android/gms/dynamite/DynamiteModule$VersionPolicy$SelectionResult:remoteVersion	I
    //   86: istore 6
    //   88: aload_2
    //   89: invokestatic 137	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   92: invokevirtual 141	java/lang/String:length	()I
    //   95: istore_3
    //   96: aload_2
    //   97: invokestatic 137	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   100: invokevirtual 141	java/lang/String:length	()I
    //   103: istore 4
    //   105: new 143	java/lang/StringBuilder
    //   108: astore 10
    //   110: aload 10
    //   112: iload_3
    //   113: bipush 68
    //   115: iadd
    //   116: iload 4
    //   118: iadd
    //   119: invokespecial 146	java/lang/StringBuilder:<init>	(I)V
    //   122: aload 10
    //   124: ldc_w 270
    //   127: invokevirtual 152	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   130: pop
    //   131: aload 10
    //   133: aload_2
    //   134: invokevirtual 152	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   137: pop
    //   138: aload 10
    //   140: ldc_w 272
    //   143: invokevirtual 152	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   146: pop
    //   147: aload 10
    //   149: iload 5
    //   151: invokevirtual 275	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   154: pop
    //   155: aload 10
    //   157: ldc_w 277
    //   160: invokevirtual 152	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   163: pop
    //   164: aload 10
    //   166: aload_2
    //   167: invokevirtual 152	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   170: pop
    //   171: aload 10
    //   173: ldc_w 272
    //   176: invokevirtual 152	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   179: pop
    //   180: aload 10
    //   182: iload 6
    //   184: invokevirtual 275	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   187: pop
    //   188: ldc -61
    //   190: aload 10
    //   192: invokevirtual 160	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   195: invokestatic 280	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;)I
    //   198: pop
    //   199: aload 13
    //   201: getfield 283	com/google/android/gms/dynamite/DynamiteModule$VersionPolicy$SelectionResult:selection	I
    //   204: istore 4
    //   206: iload 4
    //   208: ifeq +1043 -> 1251
    //   211: iload 4
    //   213: istore_3
    //   214: iload 4
    //   216: iconst_m1
    //   217: if_icmpne +13 -> 230
    //   220: aload 13
    //   222: getfield 265	com/google/android/gms/dynamite/DynamiteModule$VersionPolicy$SelectionResult:localVersion	I
    //   225: ifeq +1026 -> 1251
    //   228: iconst_m1
    //   229: istore_3
    //   230: iload_3
    //   231: iconst_1
    //   232: if_icmpne +11 -> 243
    //   235: aload 13
    //   237: getfield 268	com/google/android/gms/dynamite/DynamiteModule$VersionPolicy$SelectionResult:remoteVersion	I
    //   240: ifeq +1011 -> 1251
    //   243: iload_3
    //   244: iconst_m1
    //   245: if_icmpne +59 -> 304
    //   248: aload_0
    //   249: aload_2
    //   250: invokestatic 286	com/google/android/gms/dynamite/DynamiteModule:zzc	(Landroid/content/Context;Ljava/lang/String;)Lcom/google/android/gms/dynamite/DynamiteModule;
    //   253: astore_0
    //   254: lload 8
    //   256: lconst_0
    //   257: lcmp
    //   258: ifne +11 -> 269
    //   261: aload 15
    //   263: invokevirtual 289	java/lang/ThreadLocal:remove	()V
    //   266: goto +13 -> 279
    //   269: aload 15
    //   271: lload 8
    //   273: invokestatic 258	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   276: invokevirtual 244	java/lang/ThreadLocal:set	(Ljava/lang/Object;)V
    //   279: aload 12
    //   281: getfield 292	com/google/android/gms/dynamite/zzn:zza	Landroid/database/Cursor;
    //   284: astore_1
    //   285: aload_1
    //   286: ifnull +9 -> 295
    //   289: aload_1
    //   290: invokeinterface 297 1 0
    //   295: aload 14
    //   297: aload 11
    //   299: invokevirtual 244	java/lang/ThreadLocal:set	(Ljava/lang/Object;)V
    //   302: aload_0
    //   303: areturn
    //   304: iload_3
    //   305: iconst_1
    //   306: if_icmpne +906 -> 1212
    //   309: aload 13
    //   311: getfield 268	com/google/android/gms/dynamite/DynamiteModule$VersionPolicy$SelectionResult:remoteVersion	I
    //   314: istore_3
    //   315: ldc 2
    //   317: monitorenter
    //   318: getstatic 299	com/google/android/gms/dynamite/DynamiteModule:zzb	Ljava/lang/Boolean;
    //   321: astore 10
    //   323: ldc 2
    //   325: monitorexit
    //   326: aload 10
    //   328: ifnull +638 -> 966
    //   331: aload 10
    //   333: invokevirtual 305	java/lang/Boolean:booleanValue	()Z
    //   336: ifeq +318 -> 654
    //   339: aload_2
    //   340: invokestatic 137	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   343: invokevirtual 141	java/lang/String:length	()I
    //   346: istore 4
    //   348: new 143	java/lang/StringBuilder
    //   351: astore 10
    //   353: aload 10
    //   355: iload 4
    //   357: bipush 51
    //   359: iadd
    //   360: invokespecial 146	java/lang/StringBuilder:<init>	(I)V
    //   363: aload 10
    //   365: ldc_w 307
    //   368: invokevirtual 152	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   371: pop
    //   372: aload 10
    //   374: aload_2
    //   375: invokevirtual 152	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   378: pop
    //   379: aload 10
    //   381: ldc_w 309
    //   384: invokevirtual 152	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   387: pop
    //   388: aload 10
    //   390: iload_3
    //   391: invokevirtual 275	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   394: pop
    //   395: ldc -61
    //   397: aload 10
    //   399: invokevirtual 160	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   402: invokestatic 280	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;)I
    //   405: pop
    //   406: ldc 2
    //   408: monitorenter
    //   409: getstatic 311	com/google/android/gms/dynamite/DynamiteModule:zzk	Lcom/google/android/gms/dynamite/zzr;
    //   412: astore 10
    //   414: ldc 2
    //   416: monitorexit
    //   417: aload 10
    //   419: ifnull +210 -> 629
    //   422: aload 14
    //   424: invokevirtual 235	java/lang/ThreadLocal:get	()Ljava/lang/Object;
    //   427: checkcast 237	com/google/android/gms/dynamite/zzn
    //   430: astore 17
    //   432: aload 17
    //   434: ifnull +178 -> 612
    //   437: aload 17
    //   439: getfield 292	com/google/android/gms/dynamite/zzn:zza	Landroid/database/Cursor;
    //   442: ifnull +170 -> 612
    //   445: aload_0
    //   446: invokevirtual 127	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   449: astore 16
    //   451: aload 17
    //   453: getfield 292	com/google/android/gms/dynamite/zzn:zza	Landroid/database/Cursor;
    //   456: astore 17
    //   458: aconst_null
    //   459: invokestatic 317	com/google/android/gms/dynamic/ObjectWrapper:wrap	(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/IObjectWrapper;
    //   462: pop
    //   463: ldc 2
    //   465: monitorenter
    //   466: getstatic 319	com/google/android/gms/dynamite/DynamiteModule:zze	I
    //   469: iconst_2
    //   470: if_icmplt +9 -> 479
    //   473: iconst_1
    //   474: istore 7
    //   476: goto +6 -> 482
    //   479: iconst_0
    //   480: istore 7
    //   482: ldc 2
    //   484: monitorexit
    //   485: iload 7
    //   487: invokestatic 322	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   490: invokevirtual 305	java/lang/Boolean:booleanValue	()Z
    //   493: ifeq +34 -> 527
    //   496: ldc -61
    //   498: ldc_w 324
    //   501: invokestatic 327	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   504: pop
    //   505: aload 10
    //   507: aload 16
    //   509: invokestatic 317	com/google/android/gms/dynamic/ObjectWrapper:wrap	(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/IObjectWrapper;
    //   512: aload_2
    //   513: iload_3
    //   514: aload 17
    //   516: invokestatic 317	com/google/android/gms/dynamic/ObjectWrapper:wrap	(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/IObjectWrapper;
    //   519: invokevirtual 332	com/google/android/gms/dynamite/zzr:zzf	(Lcom/google/android/gms/dynamic/IObjectWrapper;Ljava/lang/String;ILcom/google/android/gms/dynamic/IObjectWrapper;)Lcom/google/android/gms/dynamic/IObjectWrapper;
    //   522: astore 10
    //   524: goto +31 -> 555
    //   527: ldc -61
    //   529: ldc_w 334
    //   532: invokestatic 224	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   535: pop
    //   536: aload 10
    //   538: aload 16
    //   540: invokestatic 317	com/google/android/gms/dynamic/ObjectWrapper:wrap	(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/IObjectWrapper;
    //   543: aload_2
    //   544: iload_3
    //   545: aload 17
    //   547: invokestatic 317	com/google/android/gms/dynamic/ObjectWrapper:wrap	(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/IObjectWrapper;
    //   550: invokevirtual 336	com/google/android/gms/dynamite/zzr:zze	(Lcom/google/android/gms/dynamic/IObjectWrapper;Ljava/lang/String;ILcom/google/android/gms/dynamic/IObjectWrapper;)Lcom/google/android/gms/dynamic/IObjectWrapper;
    //   553: astore 10
    //   555: aload 10
    //   557: invokestatic 340	com/google/android/gms/dynamic/ObjectWrapper:unwrap	(Lcom/google/android/gms/dynamic/IObjectWrapper;)Ljava/lang/Object;
    //   560: checkcast 123	android/content/Context
    //   563: astore 10
    //   565: aload 10
    //   567: ifnull +20 -> 587
    //   570: new 2	com/google/android/gms/dynamite/DynamiteModule
    //   573: dup
    //   574: aload 10
    //   576: invokespecial 342	com/google/android/gms/dynamite/DynamiteModule:<init>	(Landroid/content/Context;)V
    //   579: astore 10
    //   581: aload 10
    //   583: astore_0
    //   584: goto +298 -> 882
    //   587: new 9	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   590: astore 10
    //   592: aload 10
    //   594: ldc_w 344
    //   597: aconst_null
    //   598: invokespecial 347	com/google/android/gms/dynamite/DynamiteModule$LoadingException:<init>	(Ljava/lang/String;Lcom/google/android/gms/dynamite/zzp;)V
    //   601: aload 10
    //   603: athrow
    //   604: astore 10
    //   606: ldc 2
    //   608: monitorexit
    //   609: aload 10
    //   611: athrow
    //   612: new 9	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   615: astore 10
    //   617: aload 10
    //   619: ldc_w 349
    //   622: aconst_null
    //   623: invokespecial 347	com/google/android/gms/dynamite/DynamiteModule$LoadingException:<init>	(Ljava/lang/String;Lcom/google/android/gms/dynamite/zzp;)V
    //   626: aload 10
    //   628: athrow
    //   629: new 9	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   632: astore 10
    //   634: aload 10
    //   636: ldc_w 351
    //   639: aconst_null
    //   640: invokespecial 347	com/google/android/gms/dynamite/DynamiteModule$LoadingException:<init>	(Ljava/lang/String;Lcom/google/android/gms/dynamite/zzp;)V
    //   643: aload 10
    //   645: athrow
    //   646: astore 10
    //   648: ldc 2
    //   650: monitorexit
    //   651: aload 10
    //   653: athrow
    //   654: aload_2
    //   655: invokestatic 137	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   658: invokevirtual 141	java/lang/String:length	()I
    //   661: istore 4
    //   663: new 143	java/lang/StringBuilder
    //   666: astore 10
    //   668: aload 10
    //   670: iload 4
    //   672: bipush 51
    //   674: iadd
    //   675: invokespecial 146	java/lang/StringBuilder:<init>	(I)V
    //   678: aload 10
    //   680: ldc_w 307
    //   683: invokevirtual 152	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   686: pop
    //   687: aload 10
    //   689: aload_2
    //   690: invokevirtual 152	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   693: pop
    //   694: aload 10
    //   696: ldc_w 309
    //   699: invokevirtual 152	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   702: pop
    //   703: aload 10
    //   705: iload_3
    //   706: invokevirtual 275	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   709: pop
    //   710: ldc -61
    //   712: aload 10
    //   714: invokevirtual 160	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   717: invokestatic 280	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;)I
    //   720: pop
    //   721: aload_0
    //   722: invokestatic 354	com/google/android/gms/dynamite/DynamiteModule:zzf	(Landroid/content/Context;)Lcom/google/android/gms/dynamite/zzq;
    //   725: astore 10
    //   727: aload 10
    //   729: ifnull +220 -> 949
    //   732: aload 10
    //   734: invokevirtual 358	com/google/android/gms/dynamite/zzq:zze	()I
    //   737: istore 4
    //   739: iload 4
    //   741: iconst_3
    //   742: if_icmplt +59 -> 801
    //   745: aload 14
    //   747: invokevirtual 235	java/lang/ThreadLocal:get	()Ljava/lang/Object;
    //   750: checkcast 237	com/google/android/gms/dynamite/zzn
    //   753: astore 16
    //   755: aload 16
    //   757: ifnull +27 -> 784
    //   760: aload 10
    //   762: aload_0
    //   763: invokestatic 317	com/google/android/gms/dynamic/ObjectWrapper:wrap	(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/IObjectWrapper;
    //   766: aload_2
    //   767: iload_3
    //   768: aload 16
    //   770: getfield 292	com/google/android/gms/dynamite/zzn:zza	Landroid/database/Cursor;
    //   773: invokestatic 317	com/google/android/gms/dynamic/ObjectWrapper:wrap	(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/IObjectWrapper;
    //   776: invokevirtual 360	com/google/android/gms/dynamite/zzq:zzi	(Lcom/google/android/gms/dynamic/IObjectWrapper;Ljava/lang/String;ILcom/google/android/gms/dynamic/IObjectWrapper;)Lcom/google/android/gms/dynamic/IObjectWrapper;
    //   779: astore 10
    //   781: goto +73 -> 854
    //   784: new 9	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   787: astore 10
    //   789: aload 10
    //   791: ldc_w 362
    //   794: aconst_null
    //   795: invokespecial 347	com/google/android/gms/dynamite/DynamiteModule$LoadingException:<init>	(Ljava/lang/String;Lcom/google/android/gms/dynamite/zzp;)V
    //   798: aload 10
    //   800: athrow
    //   801: iload 4
    //   803: iconst_2
    //   804: if_icmpne +28 -> 832
    //   807: ldc -61
    //   809: ldc_w 364
    //   812: invokestatic 224	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   815: pop
    //   816: aload 10
    //   818: aload_0
    //   819: invokestatic 317	com/google/android/gms/dynamic/ObjectWrapper:wrap	(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/IObjectWrapper;
    //   822: aload_2
    //   823: iload_3
    //   824: invokevirtual 367	com/google/android/gms/dynamite/zzq:zzj	(Lcom/google/android/gms/dynamic/IObjectWrapper;Ljava/lang/String;I)Lcom/google/android/gms/dynamic/IObjectWrapper;
    //   827: astore 10
    //   829: goto +25 -> 854
    //   832: ldc -61
    //   834: ldc_w 369
    //   837: invokestatic 224	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   840: pop
    //   841: aload 10
    //   843: aload_0
    //   844: invokestatic 317	com/google/android/gms/dynamic/ObjectWrapper:wrap	(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/IObjectWrapper;
    //   847: aload_2
    //   848: iload_3
    //   849: invokevirtual 371	com/google/android/gms/dynamite/zzq:zzh	(Lcom/google/android/gms/dynamic/IObjectWrapper;Ljava/lang/String;I)Lcom/google/android/gms/dynamic/IObjectWrapper;
    //   852: astore 10
    //   854: aload 10
    //   856: invokestatic 340	com/google/android/gms/dynamic/ObjectWrapper:unwrap	(Lcom/google/android/gms/dynamic/IObjectWrapper;)Ljava/lang/Object;
    //   859: ifnull +73 -> 932
    //   862: new 2	com/google/android/gms/dynamite/DynamiteModule
    //   865: dup
    //   866: aload 10
    //   868: invokestatic 340	com/google/android/gms/dynamic/ObjectWrapper:unwrap	(Lcom/google/android/gms/dynamic/IObjectWrapper;)Ljava/lang/Object;
    //   871: checkcast 123	android/content/Context
    //   874: invokespecial 342	com/google/android/gms/dynamite/DynamiteModule:<init>	(Landroid/content/Context;)V
    //   877: astore 10
    //   879: aload 10
    //   881: astore_0
    //   882: lload 8
    //   884: lconst_0
    //   885: lcmp
    //   886: ifne +11 -> 897
    //   889: aload 15
    //   891: invokevirtual 289	java/lang/ThreadLocal:remove	()V
    //   894: goto +13 -> 907
    //   897: aload 15
    //   899: lload 8
    //   901: invokestatic 258	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   904: invokevirtual 244	java/lang/ThreadLocal:set	(Ljava/lang/Object;)V
    //   907: aload 12
    //   909: getfield 292	com/google/android/gms/dynamite/zzn:zza	Landroid/database/Cursor;
    //   912: astore_1
    //   913: aload_1
    //   914: ifnull +9 -> 923
    //   917: aload_1
    //   918: invokeinterface 297 1 0
    //   923: aload 14
    //   925: aload 11
    //   927: invokevirtual 244	java/lang/ThreadLocal:set	(Ljava/lang/Object;)V
    //   930: aload_0
    //   931: areturn
    //   932: new 9	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   935: astore 10
    //   937: aload 10
    //   939: ldc_w 373
    //   942: aconst_null
    //   943: invokespecial 347	com/google/android/gms/dynamite/DynamiteModule$LoadingException:<init>	(Ljava/lang/String;Lcom/google/android/gms/dynamite/zzp;)V
    //   946: aload 10
    //   948: athrow
    //   949: new 9	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   952: astore 10
    //   954: aload 10
    //   956: ldc_w 375
    //   959: aconst_null
    //   960: invokespecial 347	com/google/android/gms/dynamite/DynamiteModule$LoadingException:<init>	(Ljava/lang/String;Lcom/google/android/gms/dynamite/zzp;)V
    //   963: aload 10
    //   965: athrow
    //   966: new 9	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   969: astore 10
    //   971: aload 10
    //   973: ldc_w 377
    //   976: aconst_null
    //   977: invokespecial 347	com/google/android/gms/dynamite/DynamiteModule$LoadingException:<init>	(Ljava/lang/String;Lcom/google/android/gms/dynamite/zzp;)V
    //   980: aload 10
    //   982: athrow
    //   983: astore 10
    //   985: ldc 2
    //   987: monitorexit
    //   988: aload 10
    //   990: athrow
    //   991: astore 10
    //   993: aload_0
    //   994: aload 10
    //   996: invokestatic 383	com/google/android/gms/common/util/CrashUtils:addDynamiteErrorToDropBox	(Landroid/content/Context;Ljava/lang/Throwable;)Z
    //   999: pop
    //   1000: new 9	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   1003: astore 14
    //   1005: aload 14
    //   1007: ldc_w 373
    //   1010: aload 10
    //   1012: aconst_null
    //   1013: invokespecial 386	com/google/android/gms/dynamite/DynamiteModule$LoadingException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;Lcom/google/android/gms/dynamite/zzp;)V
    //   1016: aload 14
    //   1018: athrow
    //   1019: astore 10
    //   1021: aload 10
    //   1023: athrow
    //   1024: astore 10
    //   1026: new 9	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   1029: astore 14
    //   1031: aload 14
    //   1033: ldc_w 373
    //   1036: aload 10
    //   1038: aconst_null
    //   1039: invokespecial 386	com/google/android/gms/dynamite/DynamiteModule$LoadingException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;Lcom/google/android/gms/dynamite/zzp;)V
    //   1042: aload 14
    //   1044: athrow
    //   1045: astore 14
    //   1047: aload 14
    //   1049: invokevirtual 387	com/google/android/gms/dynamite/DynamiteModule$LoadingException:getMessage	()Ljava/lang/String;
    //   1052: invokestatic 137	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   1055: astore 10
    //   1057: aload 10
    //   1059: invokevirtual 141	java/lang/String:length	()I
    //   1062: ifeq +16 -> 1078
    //   1065: ldc_w 389
    //   1068: aload 10
    //   1070: invokevirtual 214	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   1073: astore 10
    //   1075: goto +15 -> 1090
    //   1078: new 133	java/lang/String
    //   1081: dup
    //   1082: ldc_w 389
    //   1085: invokespecial 217	java/lang/String:<init>	(Ljava/lang/String;)V
    //   1088: astore 10
    //   1090: ldc -61
    //   1092: aload 10
    //   1094: invokestatic 224	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   1097: pop
    //   1098: aload 13
    //   1100: getfield 265	com/google/android/gms/dynamite/DynamiteModule$VersionPolicy$SelectionResult:localVersion	I
    //   1103: istore_3
    //   1104: iload_3
    //   1105: ifeq +91 -> 1196
    //   1108: new 391	com/google/android/gms/dynamite/zzo
    //   1111: astore 10
    //   1113: aload 10
    //   1115: iload_3
    //   1116: iconst_0
    //   1117: invokespecial 394	com/google/android/gms/dynamite/zzo:<init>	(II)V
    //   1120: aload_1
    //   1121: aload_0
    //   1122: aload_2
    //   1123: aload 10
    //   1125: invokeinterface 262 4 0
    //   1130: getfield 283	com/google/android/gms/dynamite/DynamiteModule$VersionPolicy$SelectionResult:selection	I
    //   1133: iconst_m1
    //   1134: if_icmpne +62 -> 1196
    //   1137: aload_0
    //   1138: aload_2
    //   1139: invokestatic 286	com/google/android/gms/dynamite/DynamiteModule:zzc	(Landroid/content/Context;Ljava/lang/String;)Lcom/google/android/gms/dynamite/DynamiteModule;
    //   1142: astore_0
    //   1143: lload 8
    //   1145: lconst_0
    //   1146: lcmp
    //   1147: ifne +12 -> 1159
    //   1150: getstatic 64	com/google/android/gms/dynamite/DynamiteModule:zzg	Ljava/lang/ThreadLocal;
    //   1153: invokevirtual 289	java/lang/ThreadLocal:remove	()V
    //   1156: goto +14 -> 1170
    //   1159: getstatic 64	com/google/android/gms/dynamite/DynamiteModule:zzg	Ljava/lang/ThreadLocal;
    //   1162: lload 8
    //   1164: invokestatic 258	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1167: invokevirtual 244	java/lang/ThreadLocal:set	(Ljava/lang/Object;)V
    //   1170: aload 12
    //   1172: getfield 292	com/google/android/gms/dynamite/zzn:zza	Landroid/database/Cursor;
    //   1175: astore_1
    //   1176: aload_1
    //   1177: ifnull +9 -> 1186
    //   1180: aload_1
    //   1181: invokeinterface 297 1 0
    //   1186: getstatic 59	com/google/android/gms/dynamite/DynamiteModule:zzf	Ljava/lang/ThreadLocal;
    //   1189: aload 11
    //   1191: invokevirtual 244	java/lang/ThreadLocal:set	(Ljava/lang/Object;)V
    //   1194: aload_0
    //   1195: areturn
    //   1196: new 9	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   1199: astore_0
    //   1200: aload_0
    //   1201: ldc_w 396
    //   1204: aload 14
    //   1206: aconst_null
    //   1207: invokespecial 386	com/google/android/gms/dynamite/DynamiteModule$LoadingException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;Lcom/google/android/gms/dynamite/zzp;)V
    //   1210: aload_0
    //   1211: athrow
    //   1212: new 9	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   1215: astore_0
    //   1216: new 143	java/lang/StringBuilder
    //   1219: astore_1
    //   1220: aload_1
    //   1221: bipush 47
    //   1223: invokespecial 146	java/lang/StringBuilder:<init>	(I)V
    //   1226: aload_1
    //   1227: ldc_w 398
    //   1230: invokevirtual 152	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1233: pop
    //   1234: aload_1
    //   1235: iload_3
    //   1236: invokevirtual 275	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1239: pop
    //   1240: aload_0
    //   1241: aload_1
    //   1242: invokevirtual 160	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1245: aconst_null
    //   1246: invokespecial 347	com/google/android/gms/dynamite/DynamiteModule$LoadingException:<init>	(Ljava/lang/String;Lcom/google/android/gms/dynamite/zzp;)V
    //   1249: aload_0
    //   1250: athrow
    //   1251: new 9	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   1254: astore_0
    //   1255: aload 13
    //   1257: getfield 265	com/google/android/gms/dynamite/DynamiteModule$VersionPolicy$SelectionResult:localVersion	I
    //   1260: istore_3
    //   1261: aload 13
    //   1263: getfield 268	com/google/android/gms/dynamite/DynamiteModule$VersionPolicy$SelectionResult:remoteVersion	I
    //   1266: istore 4
    //   1268: aload_2
    //   1269: invokestatic 137	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   1272: invokevirtual 141	java/lang/String:length	()I
    //   1275: istore 5
    //   1277: new 143	java/lang/StringBuilder
    //   1280: astore_1
    //   1281: aload_1
    //   1282: iload 5
    //   1284: bipush 92
    //   1286: iadd
    //   1287: invokespecial 146	java/lang/StringBuilder:<init>	(I)V
    //   1290: aload_1
    //   1291: ldc_w 400
    //   1294: invokevirtual 152	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1297: pop
    //   1298: aload_1
    //   1299: aload_2
    //   1300: invokevirtual 152	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1303: pop
    //   1304: aload_1
    //   1305: ldc_w 402
    //   1308: invokevirtual 152	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1311: pop
    //   1312: aload_1
    //   1313: iload_3
    //   1314: invokevirtual 275	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1317: pop
    //   1318: aload_1
    //   1319: ldc_w 404
    //   1322: invokevirtual 152	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1325: pop
    //   1326: aload_1
    //   1327: iload 4
    //   1329: invokevirtual 275	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1332: pop
    //   1333: aload_1
    //   1334: ldc -102
    //   1336: invokevirtual 152	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1339: pop
    //   1340: aload_0
    //   1341: aload_1
    //   1342: invokevirtual 160	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1345: aconst_null
    //   1346: invokespecial 347	com/google/android/gms/dynamite/DynamiteModule$LoadingException:<init>	(Ljava/lang/String;Lcom/google/android/gms/dynamite/zzp;)V
    //   1349: aload_0
    //   1350: athrow
    //   1351: astore_0
    //   1352: lload 8
    //   1354: lconst_0
    //   1355: lcmp
    //   1356: ifne +12 -> 1368
    //   1359: getstatic 64	com/google/android/gms/dynamite/DynamiteModule:zzg	Ljava/lang/ThreadLocal;
    //   1362: invokevirtual 289	java/lang/ThreadLocal:remove	()V
    //   1365: goto +14 -> 1379
    //   1368: getstatic 64	com/google/android/gms/dynamite/DynamiteModule:zzg	Ljava/lang/ThreadLocal;
    //   1371: lload 8
    //   1373: invokestatic 258	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1376: invokevirtual 244	java/lang/ThreadLocal:set	(Ljava/lang/Object;)V
    //   1379: aload 12
    //   1381: getfield 292	com/google/android/gms/dynamite/zzn:zza	Landroid/database/Cursor;
    //   1384: astore_1
    //   1385: aload_1
    //   1386: ifnull +9 -> 1395
    //   1389: aload_1
    //   1390: invokeinterface 297 1 0
    //   1395: getstatic 59	com/google/android/gms/dynamite/DynamiteModule:zzf	Ljava/lang/ThreadLocal;
    //   1398: aload 11
    //   1400: invokevirtual 244	java/lang/ThreadLocal:set	(Ljava/lang/Object;)V
    //   1403: aload_0
    //   1404: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1405	0	paramContext	Context
    //   0	1405	1	paramVersionPolicy	VersionPolicy
    //   0	1405	2	paramString	String
    //   95	1219	3	i	int
    //   103	1225	4	j	int
    //   79	1208	5	k	int
    //   86	97	6	m	int
    //   474	12	7	bool	boolean
    //   48	1324	8	l	long
    //   108	494	10	localObject1	Object
    //   604	6	10	localObject2	Object
    //   615	29	10	localLoadingException1	LoadingException
    //   646	6	10	localObject3	Object
    //   666	315	10	localObject4	Object
    //   983	6	10	localObject5	Object
    //   991	20	10	localThrowable	Throwable
    //   1019	3	10	localLoadingException2	LoadingException
    //   1024	13	10	localRemoteException	android.os.RemoteException
    //   1055	69	10	localObject6	Object
    //   13	1386	11	localzzn1	zzn
    //   23	1357	12	localzzn2	zzn
    //   72	1190	13	localSelectionResult	DynamiteModule.VersionPolicy.SelectionResult
    //   3	1040	14	localObject7	Object
    //   1045	160	14	localLoadingException3	LoadingException
    //   35	863	15	localThreadLocal	ThreadLocal
    //   449	320	16	localObject8	Object
    //   430	116	17	localObject9	Object
    // Exception table:
    //   from	to	target	type
    //   466	473	604	finally
    //   482	485	604	finally
    //   606	609	604	finally
    //   409	417	646	finally
    //   648	651	646	finally
    //   318	326	983	finally
    //   985	988	983	finally
    //   315	318	991	finally
    //   331	409	991	finally
    //   422	432	991	finally
    //   437	466	991	finally
    //   485	524	991	finally
    //   527	555	991	finally
    //   555	565	991	finally
    //   570	581	991	finally
    //   587	604	991	finally
    //   609	612	991	finally
    //   612	629	991	finally
    //   629	646	991	finally
    //   651	654	991	finally
    //   654	727	991	finally
    //   732	739	991	finally
    //   745	755	991	finally
    //   760	781	991	finally
    //   784	801	991	finally
    //   807	829	991	finally
    //   832	854	991	finally
    //   854	879	991	finally
    //   932	949	991	finally
    //   949	966	991	finally
    //   966	983	991	finally
    //   988	991	991	finally
    //   315	318	1019	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   331	409	1019	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   422	432	1019	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   437	466	1019	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   485	524	1019	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   527	555	1019	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   555	565	1019	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   570	581	1019	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   587	604	1019	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   609	612	1019	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   612	629	1019	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   629	646	1019	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   651	654	1019	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   654	727	1019	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   732	739	1019	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   745	755	1019	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   760	781	1019	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   784	801	1019	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   807	829	1019	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   832	854	1019	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   854	879	1019	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   932	949	1019	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   949	966	1019	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   966	983	1019	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   988	991	1019	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   315	318	1024	android/os/RemoteException
    //   331	409	1024	android/os/RemoteException
    //   422	432	1024	android/os/RemoteException
    //   437	466	1024	android/os/RemoteException
    //   485	524	1024	android/os/RemoteException
    //   527	555	1024	android/os/RemoteException
    //   555	565	1024	android/os/RemoteException
    //   570	581	1024	android/os/RemoteException
    //   587	604	1024	android/os/RemoteException
    //   609	612	1024	android/os/RemoteException
    //   612	629	1024	android/os/RemoteException
    //   629	646	1024	android/os/RemoteException
    //   651	654	1024	android/os/RemoteException
    //   654	727	1024	android/os/RemoteException
    //   732	739	1024	android/os/RemoteException
    //   745	755	1024	android/os/RemoteException
    //   760	781	1024	android/os/RemoteException
    //   784	801	1024	android/os/RemoteException
    //   807	829	1024	android/os/RemoteException
    //   832	854	1024	android/os/RemoteException
    //   854	879	1024	android/os/RemoteException
    //   932	949	1024	android/os/RemoteException
    //   949	966	1024	android/os/RemoteException
    //   966	983	1024	android/os/RemoteException
    //   988	991	1024	android/os/RemoteException
    //   309	315	1045	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   993	1019	1045	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   1021	1024	1045	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   1026	1045	1045	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   50	206	1351	finally
    //   220	228	1351	finally
    //   235	243	1351	finally
    //   248	254	1351	finally
    //   309	315	1351	finally
    //   993	1019	1351	finally
    //   1021	1024	1351	finally
    //   1026	1045	1351	finally
    //   1047	1075	1351	finally
    //   1078	1090	1351	finally
    //   1090	1104	1351	finally
    //   1108	1143	1351	finally
    //   1196	1212	1351	finally
    //   1212	1251	1351	finally
    //   1251	1351	1351	finally
  }
  
  /* Error */
  public static int zza(Context paramContext, String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 299	com/google/android/gms/dynamite/DynamiteModule:zzb	Ljava/lang/Boolean;
    //   6: astore 10
    //   8: aconst_null
    //   9: astore 8
    //   11: aconst_null
    //   12: astore 9
    //   14: aconst_null
    //   15: astore 7
    //   17: aload 10
    //   19: astore 6
    //   21: aload 10
    //   23: ifnonnull +365 -> 388
    //   26: aload_0
    //   27: invokevirtual 127	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   30: invokevirtual 131	android/content/Context:getClassLoader	()Ljava/lang/ClassLoader;
    //   33: ldc 6
    //   35: invokevirtual 412	java/lang/Class:getName	()Ljava/lang/String;
    //   38: invokevirtual 166	java/lang/ClassLoader:loadClass	(Ljava/lang/String;)Ljava/lang/Class;
    //   41: ldc_w 414
    //   44: invokevirtual 174	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   47: astore 11
    //   49: aload 11
    //   51: invokevirtual 418	java/lang/reflect/Field:getDeclaringClass	()Ljava/lang/Class;
    //   54: astore 10
    //   56: aload 10
    //   58: monitorenter
    //   59: aload 11
    //   61: aconst_null
    //   62: invokevirtual 181	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   65: checkcast 162	java/lang/ClassLoader
    //   68: astore 6
    //   70: aload 6
    //   72: ifnull +32 -> 104
    //   75: aload 6
    //   77: invokestatic 421	java/lang/ClassLoader:getSystemClassLoader	()Ljava/lang/ClassLoader;
    //   80: if_acmpne +11 -> 91
    //   83: getstatic 424	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   86: astore 6
    //   88: goto +209 -> 297
    //   91: aload 6
    //   93: invokestatic 427	com/google/android/gms/dynamite/DynamiteModule:zzd	(Ljava/lang/ClassLoader;)V
    //   96: getstatic 430	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   99: astore 6
    //   101: goto +196 -> 297
    //   104: getstatic 432	com/google/android/gms/dynamite/DynamiteModule:zzd	Z
    //   107: ifne +176 -> 283
    //   110: getstatic 430	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   113: aconst_null
    //   114: invokevirtual 436	java/lang/Boolean:equals	(Ljava/lang/Object;)Z
    //   117: istore 5
    //   119: iload 5
    //   121: ifeq +6 -> 127
    //   124: goto +159 -> 283
    //   127: aload_0
    //   128: aload_1
    //   129: iload_2
    //   130: invokestatic 438	com/google/android/gms/dynamite/DynamiteModule:zzb	(Landroid/content/Context;Ljava/lang/String;Z)I
    //   133: istore_3
    //   134: getstatic 440	com/google/android/gms/dynamite/DynamiteModule:zzc	Ljava/lang/String;
    //   137: astore 6
    //   139: aload 6
    //   141: ifnull +115 -> 256
    //   144: aload 6
    //   146: invokevirtual 443	java/lang/String:isEmpty	()Z
    //   149: ifeq +6 -> 155
    //   152: goto +104 -> 256
    //   155: invokestatic 447	com/google/android/gms/dynamite/zzb:zza	()Ljava/lang/ClassLoader;
    //   158: astore 6
    //   160: aload 6
    //   162: ifnull +6 -> 168
    //   165: goto +64 -> 229
    //   168: getstatic 452	android/os/Build$VERSION:SDK_INT	I
    //   171: bipush 29
    //   173: if_icmplt +31 -> 204
    //   176: getstatic 440	com/google/android/gms/dynamite/DynamiteModule:zzc	Ljava/lang/String;
    //   179: astore 6
    //   181: aload 6
    //   183: invokestatic 113	com/google/android/gms/common/internal/Preconditions:checkNotNull	(Ljava/lang/Object;)Ljava/lang/Object;
    //   186: pop
    //   187: new 454	dalvik/system/DelegateLastClassLoader
    //   190: dup
    //   191: aload 6
    //   193: invokestatic 421	java/lang/ClassLoader:getSystemClassLoader	()Ljava/lang/ClassLoader;
    //   196: invokespecial 457	dalvik/system/DelegateLastClassLoader:<init>	(Ljava/lang/String;Ljava/lang/ClassLoader;)V
    //   199: astore 6
    //   201: goto +28 -> 229
    //   204: getstatic 440	com/google/android/gms/dynamite/DynamiteModule:zzc	Ljava/lang/String;
    //   207: astore 6
    //   209: aload 6
    //   211: invokestatic 113	com/google/android/gms/common/internal/Preconditions:checkNotNull	(Ljava/lang/Object;)Ljava/lang/Object;
    //   214: pop
    //   215: new 459	com/google/android/gms/dynamite/zzc
    //   218: dup
    //   219: aload 6
    //   221: invokestatic 421	java/lang/ClassLoader:getSystemClassLoader	()Ljava/lang/ClassLoader;
    //   224: invokespecial 460	com/google/android/gms/dynamite/zzc:<init>	(Ljava/lang/String;Ljava/lang/ClassLoader;)V
    //   227: astore 6
    //   229: aload 6
    //   231: invokestatic 427	com/google/android/gms/dynamite/DynamiteModule:zzd	(Ljava/lang/ClassLoader;)V
    //   234: aload 11
    //   236: aconst_null
    //   237: aload 6
    //   239: invokevirtual 463	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   242: getstatic 430	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   245: putstatic 299	com/google/android/gms/dynamite/DynamiteModule:zzb	Ljava/lang/Boolean;
    //   248: aload 10
    //   250: monitorexit
    //   251: ldc 2
    //   253: monitorexit
    //   254: iload_3
    //   255: ireturn
    //   256: aload 10
    //   258: monitorexit
    //   259: ldc 2
    //   261: monitorexit
    //   262: iload_3
    //   263: ireturn
    //   264: astore 6
    //   266: aload 11
    //   268: aconst_null
    //   269: invokestatic 421	java/lang/ClassLoader:getSystemClassLoader	()Ljava/lang/ClassLoader;
    //   272: invokevirtual 463	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   275: getstatic 424	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   278: astore 6
    //   280: goto +17 -> 297
    //   283: aload 11
    //   285: aconst_null
    //   286: invokestatic 421	java/lang/ClassLoader:getSystemClassLoader	()Ljava/lang/ClassLoader;
    //   289: invokevirtual 463	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   292: getstatic 424	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   295: astore 6
    //   297: aload 10
    //   299: monitorexit
    //   300: goto +83 -> 383
    //   303: astore 6
    //   305: aload 10
    //   307: monitorexit
    //   308: aload 6
    //   310: athrow
    //   311: astore 6
    //   313: goto +10 -> 323
    //   316: astore 6
    //   318: goto +5 -> 323
    //   321: astore 6
    //   323: aload 6
    //   325: invokevirtual 464	java/lang/Object:toString	()Ljava/lang/String;
    //   328: astore 10
    //   330: aload 10
    //   332: invokevirtual 141	java/lang/String:length	()I
    //   335: istore_3
    //   336: new 143	java/lang/StringBuilder
    //   339: astore 6
    //   341: aload 6
    //   343: iload_3
    //   344: bipush 30
    //   346: iadd
    //   347: invokespecial 146	java/lang/StringBuilder:<init>	(I)V
    //   350: aload 6
    //   352: ldc_w 466
    //   355: invokevirtual 152	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   358: pop
    //   359: aload 6
    //   361: aload 10
    //   363: invokevirtual 152	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   366: pop
    //   367: ldc -61
    //   369: aload 6
    //   371: invokevirtual 160	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   374: invokestatic 224	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   377: pop
    //   378: getstatic 424	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   381: astore 6
    //   383: aload 6
    //   385: putstatic 299	com/google/android/gms/dynamite/DynamiteModule:zzb	Ljava/lang/Boolean;
    //   388: ldc 2
    //   390: monitorexit
    //   391: aload 6
    //   393: invokevirtual 305	java/lang/Boolean:booleanValue	()Z
    //   396: istore 5
    //   398: iconst_0
    //   399: istore 4
    //   401: iload 5
    //   403: ifeq +59 -> 462
    //   406: aload_0
    //   407: aload_1
    //   408: iload_2
    //   409: invokestatic 438	com/google/android/gms/dynamite/DynamiteModule:zzb	(Landroid/content/Context;Ljava/lang/String;Z)I
    //   412: istore_3
    //   413: iload_3
    //   414: ireturn
    //   415: astore_1
    //   416: aload_1
    //   417: invokevirtual 387	com/google/android/gms/dynamite/DynamiteModule$LoadingException:getMessage	()Ljava/lang/String;
    //   420: invokestatic 137	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   423: astore_1
    //   424: aload_1
    //   425: invokevirtual 141	java/lang/String:length	()I
    //   428: ifeq +14 -> 442
    //   431: ldc_w 468
    //   434: aload_1
    //   435: invokevirtual 214	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   438: astore_1
    //   439: goto +14 -> 453
    //   442: new 133	java/lang/String
    //   445: dup
    //   446: ldc_w 468
    //   449: invokespecial 217	java/lang/String:<init>	(Ljava/lang/String;)V
    //   452: astore_1
    //   453: ldc -61
    //   455: aload_1
    //   456: invokestatic 224	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   459: pop
    //   460: iconst_0
    //   461: ireturn
    //   462: aload_0
    //   463: invokestatic 354	com/google/android/gms/dynamite/DynamiteModule:zzf	(Landroid/content/Context;)Lcom/google/android/gms/dynamite/zzq;
    //   466: astore 10
    //   468: aload 10
    //   470: ifnonnull +9 -> 479
    //   473: iload 4
    //   475: istore_3
    //   476: goto +364 -> 840
    //   479: aload 9
    //   481: astore 6
    //   483: aload 10
    //   485: invokevirtual 358	com/google/android/gms/dynamite/zzq:zze	()I
    //   488: istore_3
    //   489: iload_3
    //   490: iconst_3
    //   491: if_icmplt +183 -> 674
    //   494: aload 9
    //   496: astore 6
    //   498: getstatic 59	com/google/android/gms/dynamite/DynamiteModule:zzf	Ljava/lang/ThreadLocal;
    //   501: invokevirtual 235	java/lang/ThreadLocal:get	()Ljava/lang/Object;
    //   504: checkcast 237	com/google/android/gms/dynamite/zzn
    //   507: astore 11
    //   509: aload 11
    //   511: ifnull +35 -> 546
    //   514: aload 9
    //   516: astore 6
    //   518: aload 11
    //   520: getfield 292	com/google/android/gms/dynamite/zzn:zza	Landroid/database/Cursor;
    //   523: astore 11
    //   525: aload 11
    //   527: ifnull +19 -> 546
    //   530: aload 9
    //   532: astore 6
    //   534: aload 11
    //   536: iconst_0
    //   537: invokeinterface 471 2 0
    //   542: istore_3
    //   543: goto +297 -> 840
    //   546: aload 9
    //   548: astore 6
    //   550: aload 10
    //   552: aload_0
    //   553: invokestatic 317	com/google/android/gms/dynamic/ObjectWrapper:wrap	(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/IObjectWrapper;
    //   556: aload_1
    //   557: iload_2
    //   558: getstatic 64	com/google/android/gms/dynamite/DynamiteModule:zzg	Ljava/lang/ThreadLocal;
    //   561: invokevirtual 235	java/lang/ThreadLocal:get	()Ljava/lang/Object;
    //   564: checkcast 246	java/lang/Long
    //   567: invokevirtual 250	java/lang/Long:longValue	()J
    //   570: invokevirtual 474	com/google/android/gms/dynamite/zzq:zzk	(Lcom/google/android/gms/dynamic/IObjectWrapper;Ljava/lang/String;ZJ)Lcom/google/android/gms/dynamic/IObjectWrapper;
    //   573: invokestatic 340	com/google/android/gms/dynamic/ObjectWrapper:unwrap	(Lcom/google/android/gms/dynamic/IObjectWrapper;)Ljava/lang/Object;
    //   576: checkcast 294	android/database/Cursor
    //   579: astore_1
    //   580: aload_1
    //   581: ifnull +55 -> 636
    //   584: aload_1
    //   585: invokeinterface 477 1 0
    //   590: ifne +6 -> 596
    //   593: goto +43 -> 636
    //   596: aload_1
    //   597: iconst_0
    //   598: invokeinterface 471 2 0
    //   603: istore_3
    //   604: iload_3
    //   605: ifle +18 -> 623
    //   608: aload_1
    //   609: invokestatic 480	com/google/android/gms/dynamite/DynamiteModule:zze	(Landroid/database/Cursor;)Z
    //   612: istore_2
    //   613: iload_2
    //   614: ifeq +9 -> 623
    //   617: aload 7
    //   619: astore_1
    //   620: goto +3 -> 623
    //   623: aload_1
    //   624: ifnull +9 -> 633
    //   627: aload_1
    //   628: invokeinterface 297 1 0
    //   633: goto +207 -> 840
    //   636: ldc -61
    //   638: ldc_w 482
    //   641: invokestatic 224	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   644: pop
    //   645: iload 4
    //   647: istore_3
    //   648: aload_1
    //   649: ifnull +191 -> 840
    //   652: aload_1
    //   653: invokeinterface 297 1 0
    //   658: iload 4
    //   660: istore_3
    //   661: goto +179 -> 840
    //   664: astore 6
    //   666: goto +181 -> 847
    //   669: astore 7
    //   671: goto +87 -> 758
    //   674: iload_3
    //   675: iconst_2
    //   676: if_icmpne +35 -> 711
    //   679: aload 9
    //   681: astore 6
    //   683: ldc -61
    //   685: ldc_w 484
    //   688: invokestatic 224	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   691: pop
    //   692: aload 9
    //   694: astore 6
    //   696: aload 10
    //   698: aload_0
    //   699: invokestatic 317	com/google/android/gms/dynamic/ObjectWrapper:wrap	(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/IObjectWrapper;
    //   702: aload_1
    //   703: iload_2
    //   704: invokevirtual 487	com/google/android/gms/dynamite/zzq:zzg	(Lcom/google/android/gms/dynamic/IObjectWrapper;Ljava/lang/String;Z)I
    //   707: istore_3
    //   708: goto +132 -> 840
    //   711: aload 9
    //   713: astore 6
    //   715: ldc -61
    //   717: ldc_w 489
    //   720: invokestatic 224	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   723: pop
    //   724: aload 9
    //   726: astore 6
    //   728: aload 10
    //   730: aload_0
    //   731: invokestatic 317	com/google/android/gms/dynamic/ObjectWrapper:wrap	(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/IObjectWrapper;
    //   734: aload_1
    //   735: iload_2
    //   736: invokevirtual 491	com/google/android/gms/dynamite/zzq:zzf	(Lcom/google/android/gms/dynamic/IObjectWrapper;Ljava/lang/String;Z)I
    //   739: istore_3
    //   740: goto +100 -> 840
    //   743: aload 6
    //   745: astore_1
    //   746: aload 7
    //   748: astore 6
    //   750: goto +97 -> 847
    //   753: astore 7
    //   755: aload 8
    //   757: astore_1
    //   758: aload_1
    //   759: astore 6
    //   761: aload 7
    //   763: invokevirtual 492	android/os/RemoteException:getMessage	()Ljava/lang/String;
    //   766: invokestatic 137	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   769: astore 7
    //   771: aload_1
    //   772: astore 6
    //   774: aload 7
    //   776: invokevirtual 141	java/lang/String:length	()I
    //   779: ifeq +19 -> 798
    //   782: aload_1
    //   783: astore 6
    //   785: ldc_w 468
    //   788: aload 7
    //   790: invokevirtual 214	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   793: astore 7
    //   795: goto +18 -> 813
    //   798: aload_1
    //   799: astore 6
    //   801: new 133	java/lang/String
    //   804: dup
    //   805: ldc_w 468
    //   808: invokespecial 217	java/lang/String:<init>	(Ljava/lang/String;)V
    //   811: astore 7
    //   813: aload_1
    //   814: astore 6
    //   816: ldc -61
    //   818: aload 7
    //   820: invokestatic 224	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   823: pop
    //   824: iload 4
    //   826: istore_3
    //   827: aload_1
    //   828: ifnull +12 -> 840
    //   831: aload_1
    //   832: invokeinterface 297 1 0
    //   837: iload 4
    //   839: istore_3
    //   840: iload_3
    //   841: ireturn
    //   842: astore 7
    //   844: goto -101 -> 743
    //   847: aload_1
    //   848: ifnull +9 -> 857
    //   851: aload_1
    //   852: invokeinterface 297 1 0
    //   857: aload 6
    //   859: athrow
    //   860: astore_1
    //   861: ldc 2
    //   863: monitorexit
    //   864: aload_1
    //   865: athrow
    //   866: astore_1
    //   867: aload_0
    //   868: aload_1
    //   869: invokestatic 383	com/google/android/gms/common/util/CrashUtils:addDynamiteErrorToDropBox	(Landroid/content/Context;Ljava/lang/Throwable;)Z
    //   872: pop
    //   873: aload_1
    //   874: athrow
    //   875: astore 6
    //   877: goto -781 -> 96
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	880	0	paramContext	Context
    //   0	880	1	paramString	String
    //   0	880	2	paramBoolean	boolean
    //   133	708	3	i	int
    //   399	439	4	j	int
    //   117	285	5	bool	boolean
    //   19	219	6	localObject1	Object
    //   264	1	6	localLoadingException1	LoadingException
    //   278	18	6	localBoolean	Boolean
    //   303	6	6	localObject2	Object
    //   311	1	6	localNoSuchFieldException	NoSuchFieldException
    //   316	1	6	localIllegalAccessException	IllegalAccessException
    //   321	3	6	localClassNotFoundException	ClassNotFoundException
    //   339	210	6	localObject3	Object
    //   664	1	6	localObject4	Object
    //   681	177	6	localObject5	Object
    //   875	1	6	localLoadingException2	LoadingException
    //   15	603	7	localObject6	Object
    //   669	78	7	localRemoteException1	android.os.RemoteException
    //   753	9	7	localRemoteException2	android.os.RemoteException
    //   769	50	7	str	String
    //   842	1	7	localObject7	Object
    //   9	747	8	localObject8	Object
    //   12	713	9	localObject9	Object
    //   6	723	10	localObject10	Object
    //   47	488	11	localObject11	Object
    // Exception table:
    //   from	to	target	type
    //   127	139	264	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   144	152	264	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   155	160	264	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   168	201	264	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   204	229	264	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   229	248	264	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   59	70	303	finally
    //   75	88	303	finally
    //   91	96	303	finally
    //   96	101	303	finally
    //   104	119	303	finally
    //   127	139	303	finally
    //   144	152	303	finally
    //   155	160	303	finally
    //   168	201	303	finally
    //   204	229	303	finally
    //   229	248	303	finally
    //   248	251	303	finally
    //   256	259	303	finally
    //   266	280	303	finally
    //   283	297	303	finally
    //   297	300	303	finally
    //   305	308	303	finally
    //   26	59	311	java/lang/NoSuchFieldException
    //   308	311	311	java/lang/NoSuchFieldException
    //   26	59	316	java/lang/IllegalAccessException
    //   308	311	316	java/lang/IllegalAccessException
    //   26	59	321	java/lang/ClassNotFoundException
    //   308	311	321	java/lang/ClassNotFoundException
    //   406	413	415	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   584	593	664	finally
    //   596	604	664	finally
    //   608	613	664	finally
    //   636	645	664	finally
    //   584	593	669	android/os/RemoteException
    //   596	604	669	android/os/RemoteException
    //   608	613	669	android/os/RemoteException
    //   636	645	669	android/os/RemoteException
    //   483	489	753	android/os/RemoteException
    //   498	509	753	android/os/RemoteException
    //   518	525	753	android/os/RemoteException
    //   534	543	753	android/os/RemoteException
    //   550	580	753	android/os/RemoteException
    //   683	692	753	android/os/RemoteException
    //   696	708	753	android/os/RemoteException
    //   715	724	753	android/os/RemoteException
    //   728	740	753	android/os/RemoteException
    //   483	489	842	finally
    //   498	509	842	finally
    //   518	525	842	finally
    //   534	543	842	finally
    //   550	580	842	finally
    //   683	692	842	finally
    //   696	708	842	finally
    //   715	724	842	finally
    //   728	740	842	finally
    //   761	771	842	finally
    //   774	782	842	finally
    //   785	795	842	finally
    //   801	813	842	finally
    //   816	824	842	finally
    //   3	8	860	finally
    //   26	59	860	finally
    //   251	254	860	finally
    //   259	262	860	finally
    //   308	311	860	finally
    //   323	383	860	finally
    //   383	388	860	finally
    //   388	391	860	finally
    //   861	864	860	finally
    //   0	3	866	finally
    //   391	398	866	finally
    //   406	413	866	finally
    //   416	439	866	finally
    //   442	453	866	finally
    //   453	460	866	finally
    //   462	468	866	finally
    //   627	633	866	finally
    //   652	658	866	finally
    //   831	837	866	finally
    //   851	857	866	finally
    //   857	860	866	finally
    //   864	866	866	finally
    //   91	96	875	com/google/android/gms/dynamite/DynamiteModule$LoadingException
  }
  
  /* Error */
  private static int zzb(Context paramContext, String paramString, boolean paramBoolean)
    throws DynamiteModule.LoadingException
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 9
    //   3: getstatic 64	com/google/android/gms/dynamite/DynamiteModule:zzg	Ljava/lang/ThreadLocal;
    //   6: invokevirtual 235	java/lang/ThreadLocal:get	()Ljava/lang/Object;
    //   9: checkcast 246	java/lang/Long
    //   12: invokevirtual 250	java/lang/Long:longValue	()J
    //   15: lstore 7
    //   17: aload_0
    //   18: invokevirtual 496	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   21: astore 10
    //   23: ldc_w 498
    //   26: astore_0
    //   27: iconst_1
    //   28: istore 6
    //   30: iconst_1
    //   31: iload_2
    //   32: if_icmpeq +7 -> 39
    //   35: ldc_w 500
    //   38: astore_0
    //   39: new 502	android/net/Uri$Builder
    //   42: astore 11
    //   44: aload 11
    //   46: invokespecial 503	android/net/Uri$Builder:<init>	()V
    //   49: aload 10
    //   51: aload 11
    //   53: ldc_w 505
    //   56: invokevirtual 509	android/net/Uri$Builder:scheme	(Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   59: ldc_w 511
    //   62: invokevirtual 514	android/net/Uri$Builder:authority	(Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   65: aload_0
    //   66: invokevirtual 517	android/net/Uri$Builder:path	(Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   69: aload_1
    //   70: invokevirtual 520	android/net/Uri$Builder:appendPath	(Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   73: ldc_w 522
    //   76: lload 7
    //   78: invokestatic 525	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   81: invokevirtual 529	android/net/Uri$Builder:appendQueryParameter	(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   84: invokevirtual 533	android/net/Uri$Builder:build	()Landroid/net/Uri;
    //   87: aconst_null
    //   88: aconst_null
    //   89: aconst_null
    //   90: aconst_null
    //   91: invokevirtual 539	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   94: astore 10
    //   96: aload 10
    //   98: ifnull +241 -> 339
    //   101: aload 10
    //   103: astore 9
    //   105: aload 10
    //   107: astore_0
    //   108: aload 10
    //   110: invokeinterface 477 1 0
    //   115: ifeq +224 -> 339
    //   118: iconst_0
    //   119: istore 5
    //   121: iconst_0
    //   122: istore_2
    //   123: aload 10
    //   125: astore 9
    //   127: aload 10
    //   129: astore_0
    //   130: aload 10
    //   132: iconst_0
    //   133: invokeinterface 471 2 0
    //   138: istore_3
    //   139: aload 10
    //   141: astore_1
    //   142: iload_3
    //   143: ifle +143 -> 286
    //   146: aload 10
    //   148: astore 9
    //   150: aload 10
    //   152: astore_0
    //   153: ldc 2
    //   155: monitorenter
    //   156: aload 10
    //   158: iconst_2
    //   159: invokeinterface 543 2 0
    //   164: putstatic 440	com/google/android/gms/dynamite/DynamiteModule:zzc	Ljava/lang/String;
    //   167: aload 10
    //   169: ldc_w 545
    //   172: invokeinterface 549 2 0
    //   177: istore 4
    //   179: iload 4
    //   181: iflt +15 -> 196
    //   184: aload 10
    //   186: iload 4
    //   188: invokeinterface 471 2 0
    //   193: putstatic 319	com/google/android/gms/dynamite/DynamiteModule:zze	I
    //   196: aload 10
    //   198: ldc_w 551
    //   201: invokeinterface 549 2 0
    //   206: istore 4
    //   208: iload 4
    //   210: iflt +27 -> 237
    //   213: aload 10
    //   215: iload 4
    //   217: invokeinterface 471 2 0
    //   222: ifeq +9 -> 231
    //   225: iload 6
    //   227: istore_2
    //   228: goto +5 -> 233
    //   231: iconst_0
    //   232: istore_2
    //   233: iload_2
    //   234: putstatic 432	com/google/android/gms/dynamite/DynamiteModule:zzd	Z
    //   237: ldc 2
    //   239: monitorexit
    //   240: aload 10
    //   242: astore 9
    //   244: aload 10
    //   246: astore_0
    //   247: aload 10
    //   249: invokestatic 480	com/google/android/gms/dynamite/DynamiteModule:zze	(Landroid/database/Cursor;)Z
    //   252: istore 6
    //   254: aload 10
    //   256: astore_1
    //   257: iload_2
    //   258: istore 5
    //   260: iload 6
    //   262: ifeq +24 -> 286
    //   265: aconst_null
    //   266: astore_1
    //   267: iload_2
    //   268: istore 5
    //   270: goto +16 -> 286
    //   273: astore_1
    //   274: ldc 2
    //   276: monitorexit
    //   277: aload 10
    //   279: astore 9
    //   281: aload 10
    //   283: astore_0
    //   284: aload_1
    //   285: athrow
    //   286: iload 5
    //   288: ifne +15 -> 303
    //   291: aload_1
    //   292: ifnull +9 -> 301
    //   295: aload_1
    //   296: invokeinterface 297 1 0
    //   301: iload_3
    //   302: ireturn
    //   303: aload_1
    //   304: astore 9
    //   306: aload_1
    //   307: astore_0
    //   308: new 9	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   311: astore 10
    //   313: aload_1
    //   314: astore 9
    //   316: aload_1
    //   317: astore_0
    //   318: aload 10
    //   320: ldc_w 553
    //   323: aconst_null
    //   324: invokespecial 347	com/google/android/gms/dynamite/DynamiteModule$LoadingException:<init>	(Ljava/lang/String;Lcom/google/android/gms/dynamite/zzp;)V
    //   327: aload_1
    //   328: astore 9
    //   330: aload_1
    //   331: astore_0
    //   332: aload 10
    //   334: athrow
    //   335: astore_1
    //   336: goto +65 -> 401
    //   339: aload 10
    //   341: astore 9
    //   343: aload 10
    //   345: astore_0
    //   346: ldc -61
    //   348: ldc_w 482
    //   351: invokestatic 224	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   354: pop
    //   355: aload 10
    //   357: astore 9
    //   359: aload 10
    //   361: astore_0
    //   362: new 9	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   365: astore_1
    //   366: aload 10
    //   368: astore 9
    //   370: aload 10
    //   372: astore_0
    //   373: aload_1
    //   374: ldc_w 555
    //   377: aconst_null
    //   378: invokespecial 347	com/google/android/gms/dynamite/DynamiteModule$LoadingException:<init>	(Ljava/lang/String;Lcom/google/android/gms/dynamite/zzp;)V
    //   381: aload 10
    //   383: astore 9
    //   385: aload 10
    //   387: astore_0
    //   388: aload_1
    //   389: athrow
    //   390: astore_1
    //   391: aload 9
    //   393: astore_0
    //   394: goto +50 -> 444
    //   397: astore_1
    //   398: aconst_null
    //   399: astore 9
    //   401: aload 9
    //   403: astore_0
    //   404: aload_1
    //   405: instanceof 9
    //   408: ifeq +8 -> 416
    //   411: aload 9
    //   413: astore_0
    //   414: aload_1
    //   415: athrow
    //   416: aload 9
    //   418: astore_0
    //   419: new 9	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   422: astore 10
    //   424: aload 9
    //   426: astore_0
    //   427: aload 10
    //   429: ldc_w 557
    //   432: aload_1
    //   433: aconst_null
    //   434: invokespecial 386	com/google/android/gms/dynamite/DynamiteModule$LoadingException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;Lcom/google/android/gms/dynamite/zzp;)V
    //   437: aload 9
    //   439: astore_0
    //   440: aload 10
    //   442: athrow
    //   443: astore_1
    //   444: aload_0
    //   445: ifnull +9 -> 454
    //   448: aload_0
    //   449: invokeinterface 297 1 0
    //   454: aload_1
    //   455: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	456	0	paramContext	Context
    //   0	456	1	paramString	String
    //   0	456	2	paramBoolean	boolean
    //   138	164	3	i	int
    //   177	39	4	j	int
    //   119	168	5	bool1	boolean
    //   28	233	6	bool2	boolean
    //   15	62	7	l	long
    //   1	437	9	localObject1	Object
    //   21	420	10	localObject2	Object
    //   42	10	11	localBuilder	android.net.Uri.Builder
    // Exception table:
    //   from	to	target	type
    //   156	179	273	finally
    //   184	196	273	finally
    //   196	208	273	finally
    //   213	225	273	finally
    //   233	237	273	finally
    //   237	240	273	finally
    //   274	277	273	finally
    //   108	118	335	java/lang/Exception
    //   130	139	335	java/lang/Exception
    //   153	156	335	java/lang/Exception
    //   247	254	335	java/lang/Exception
    //   284	286	335	java/lang/Exception
    //   308	313	335	java/lang/Exception
    //   318	327	335	java/lang/Exception
    //   332	335	335	java/lang/Exception
    //   346	355	335	java/lang/Exception
    //   362	366	335	java/lang/Exception
    //   373	381	335	java/lang/Exception
    //   388	390	335	java/lang/Exception
    //   3	23	390	finally
    //   39	96	390	finally
    //   3	23	397	java/lang/Exception
    //   39	96	397	java/lang/Exception
    //   108	118	443	finally
    //   130	139	443	finally
    //   153	156	443	finally
    //   247	254	443	finally
    //   284	286	443	finally
    //   308	313	443	finally
    //   318	327	443	finally
    //   332	335	443	finally
    //   346	355	443	finally
    //   362	366	443	finally
    //   373	381	443	finally
    //   388	390	443	finally
    //   404	411	443	finally
    //   414	416	443	finally
    //   419	424	443	finally
    //   427	437	443	finally
    //   440	443	443	finally
  }
  
  private static DynamiteModule zzc(Context paramContext, String paramString)
  {
    paramString = String.valueOf(paramString);
    if (paramString.length() != 0) {
      paramString = "Selected local version of ".concat(paramString);
    } else {
      paramString = new String("Selected local version of ");
    }
    Log.i("DynamiteModule", paramString);
    return new DynamiteModule(paramContext.getApplicationContext());
  }
  
  private static void zzd(ClassLoader paramClassLoader)
    throws DynamiteModule.LoadingException
  {
    try
    {
      paramClassLoader = (IBinder)paramClassLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
      if (paramClassLoader == null)
      {
        paramClassLoader = null;
      }
      else
      {
        IInterface localIInterface = paramClassLoader.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
        if ((localIInterface instanceof zzr)) {
          paramClassLoader = (zzr)localIInterface;
        } else {
          paramClassLoader = new zzr(paramClassLoader);
        }
      }
      zzk = paramClassLoader;
      return;
    }
    catch (NoSuchMethodException paramClassLoader) {}catch (InvocationTargetException paramClassLoader) {}catch (InstantiationException paramClassLoader) {}catch (IllegalAccessException paramClassLoader) {}catch (ClassNotFoundException paramClassLoader) {}
    throw new LoadingException("Failed to instantiate dynamite loader", paramClassLoader, null);
  }
  
  private static boolean zze(Cursor paramCursor)
  {
    zzn localzzn = (zzn)zzf.get();
    if ((localzzn != null) && (localzzn.zza == null))
    {
      localzzn.zza = paramCursor;
      return true;
    }
    return false;
  }
  
  /* Error */
  private static zzq zzf(Context paramContext)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 592	com/google/android/gms/dynamite/DynamiteModule:zzj	Lcom/google/android/gms/dynamite/zzq;
    //   6: astore_1
    //   7: aload_1
    //   8: ifnull +8 -> 16
    //   11: ldc 2
    //   13: monitorexit
    //   14: aload_1
    //   15: areturn
    //   16: aload_0
    //   17: ldc_w 594
    //   20: iconst_3
    //   21: invokevirtual 598	android/content/Context:createPackageContext	(Ljava/lang/String;I)Landroid/content/Context;
    //   24: invokevirtual 131	android/content/Context:getClassLoader	()Ljava/lang/ClassLoader;
    //   27: ldc_w 600
    //   30: invokevirtual 166	java/lang/ClassLoader:loadClass	(Ljava/lang/String;)Ljava/lang/Class;
    //   33: invokevirtual 602	java/lang/Class:newInstance	()Ljava/lang/Object;
    //   36: checkcast 579	android/os/IBinder
    //   39: astore_1
    //   40: aload_1
    //   41: ifnonnull +8 -> 49
    //   44: aconst_null
    //   45: astore_0
    //   46: goto +37 -> 83
    //   49: aload_1
    //   50: ldc_w 604
    //   53: invokeinterface 585 2 0
    //   58: astore_0
    //   59: aload_0
    //   60: instanceof 356
    //   63: ifeq +11 -> 74
    //   66: aload_0
    //   67: checkcast 356	com/google/android/gms/dynamite/zzq
    //   70: astore_0
    //   71: goto +12 -> 83
    //   74: new 356	com/google/android/gms/dynamite/zzq
    //   77: dup
    //   78: aload_1
    //   79: invokespecial 605	com/google/android/gms/dynamite/zzq:<init>	(Landroid/os/IBinder;)V
    //   82: astore_0
    //   83: aload_0
    //   84: ifnull +57 -> 141
    //   87: aload_0
    //   88: putstatic 592	com/google/android/gms/dynamite/DynamiteModule:zzj	Lcom/google/android/gms/dynamite/zzq;
    //   91: ldc 2
    //   93: monitorexit
    //   94: aload_0
    //   95: areturn
    //   96: astore_0
    //   97: aload_0
    //   98: invokevirtual 208	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   101: invokestatic 137	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   104: astore_0
    //   105: aload_0
    //   106: invokevirtual 141	java/lang/String:length	()I
    //   109: ifeq +14 -> 123
    //   112: ldc_w 607
    //   115: aload_0
    //   116: invokevirtual 214	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   119: astore_0
    //   120: goto +14 -> 134
    //   123: new 133	java/lang/String
    //   126: dup
    //   127: ldc_w 607
    //   130: invokespecial 217	java/lang/String:<init>	(Ljava/lang/String;)V
    //   133: astore_0
    //   134: ldc -61
    //   136: aload_0
    //   137: invokestatic 201	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   140: pop
    //   141: ldc 2
    //   143: monitorexit
    //   144: aconst_null
    //   145: areturn
    //   146: astore_0
    //   147: ldc 2
    //   149: monitorexit
    //   150: aload_0
    //   151: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	152	0	paramContext	Context
    //   6	73	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   16	40	96	java/lang/Exception
    //   49	71	96	java/lang/Exception
    //   74	83	96	java/lang/Exception
    //   87	91	96	java/lang/Exception
    //   3	7	146	finally
    //   11	14	146	finally
    //   16	40	146	finally
    //   49	71	146	finally
    //   74	83	146	finally
    //   87	91	146	finally
    //   91	94	146	finally
    //   97	120	146	finally
    //   123	134	146	finally
    //   134	141	146	finally
    //   141	144	146	finally
    //   147	150	146	finally
  }
  
  public Context getModuleContext()
  {
    return this.zzi;
  }
  
  public IBinder instantiate(String paramString)
    throws DynamiteModule.LoadingException
  {
    try
    {
      IBinder localIBinder = (IBinder)this.zzi.getClassLoader().loadClass(paramString).newInstance();
      return localIBinder;
    }
    catch (IllegalAccessException localIllegalAccessException) {}catch (InstantiationException localInstantiationException) {}catch (ClassNotFoundException localClassNotFoundException) {}
    paramString = String.valueOf(paramString);
    if (paramString.length() != 0) {
      paramString = "Failed to instantiate module class: ".concat(paramString);
    } else {
      paramString = new String("Failed to instantiate module class: ");
    }
    throw new LoadingException(paramString, localClassNotFoundException, null);
  }
  
  public static class DynamiteLoaderClassLoader
  {
    public static ClassLoader sClassLoader;
  }
  
  public static class LoadingException
    extends Exception
  {}
  
  public static abstract interface VersionPolicy
  {
    public abstract SelectionResult selectModule(Context paramContext, String paramString, IVersions paramIVersions)
      throws DynamiteModule.LoadingException;
    
    public static abstract interface IVersions
    {
      public abstract int zza(Context paramContext, String paramString);
      
      public abstract int zzb(Context paramContext, String paramString, boolean paramBoolean)
        throws DynamiteModule.LoadingException;
    }
    
    public static class SelectionResult
    {
      public int localVersion = 0;
      public int remoteVersion = 0;
      public int selection = 0;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\dynamite\DynamiteModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */