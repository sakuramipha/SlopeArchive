package com.google.android.gms.internal.nearby;

import android.content.ContentResolver;
import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

public final class zzhw
{
  public static final Uri zza = Uri.parse("content://com.google.android.gsf.gservices");
  public static final Uri zzb = Uri.parse("content://com.google.android.gsf.gservices/prefix");
  public static final Pattern zzc = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
  public static final Pattern zzd = Pattern.compile("^(0|false|f|off|no|n)$", 2);
  static HashMap<String, String> zze;
  static final HashMap<String, Boolean> zzf = new HashMap();
  static final HashMap<String, Integer> zzg = new HashMap();
  static final HashMap<String, Long> zzh = new HashMap();
  static final HashMap<String, Float> zzi = new HashMap();
  static final String[] zzj = new String[0];
  private static final AtomicBoolean zzk = new AtomicBoolean();
  private static Object zzl;
  private static boolean zzm;
  
  /* Error */
  public static boolean zza(ContentResolver paramContentResolver, String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: aload_0
    //   4: invokestatic 87	com/google/android/gms/internal/nearby/zzhw:zzc	(Landroid/content/ContentResolver;)V
    //   7: getstatic 89	com/google/android/gms/internal/nearby/zzhw:zzl	Ljava/lang/Object;
    //   10: astore 10
    //   12: ldc 2
    //   14: monitorexit
    //   15: getstatic 71	com/google/android/gms/internal/nearby/zzhw:zzf	Ljava/util/HashMap;
    //   18: astore 11
    //   20: iconst_1
    //   21: istore_2
    //   22: iconst_1
    //   23: invokestatic 95	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   26: astore 5
    //   28: ldc 2
    //   30: monitorenter
    //   31: aload 11
    //   33: ldc 97
    //   35: invokevirtual 101	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   38: istore 4
    //   40: aconst_null
    //   41: astore 6
    //   43: aconst_null
    //   44: astore 7
    //   46: aconst_null
    //   47: astore 8
    //   49: iload 4
    //   51: ifeq +29 -> 80
    //   54: aload 11
    //   56: ldc 97
    //   58: invokevirtual 105	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   61: astore 9
    //   63: aload 9
    //   65: astore_1
    //   66: aload 9
    //   68: ifnonnull +6 -> 74
    //   71: aload 5
    //   73: astore_1
    //   74: ldc 2
    //   76: monitorexit
    //   77: goto +8 -> 85
    //   80: ldc 2
    //   82: monitorexit
    //   83: aconst_null
    //   84: astore_1
    //   85: aload_1
    //   86: checkcast 91	java/lang/Boolean
    //   89: astore_1
    //   90: aload_1
    //   91: ifnull +8 -> 99
    //   94: aload_1
    //   95: invokevirtual 109	java/lang/Boolean:booleanValue	()Z
    //   98: ireturn
    //   99: ldc 2
    //   101: monitorenter
    //   102: aload_0
    //   103: invokestatic 87	com/google/android/gms/internal/nearby/zzhw:zzc	(Landroid/content/ContentResolver;)V
    //   106: getstatic 89	com/google/android/gms/internal/nearby/zzhw:zzl	Ljava/lang/Object;
    //   109: astore 9
    //   111: getstatic 111	com/google/android/gms/internal/nearby/zzhw:zze	Ljava/util/HashMap;
    //   114: ldc 97
    //   116: invokevirtual 101	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   119: ifeq +31 -> 150
    //   122: getstatic 111	com/google/android/gms/internal/nearby/zzhw:zze	Ljava/util/HashMap;
    //   125: ldc 97
    //   127: invokevirtual 105	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   130: checkcast 79	java/lang/String
    //   133: astore_0
    //   134: aload_0
    //   135: ifnonnull +9 -> 144
    //   138: aload 8
    //   140: astore_0
    //   141: goto +3 -> 144
    //   144: ldc 2
    //   146: monitorexit
    //   147: goto +127 -> 274
    //   150: getstatic 81	com/google/android/gms/internal/nearby/zzhw:zzj	[Ljava/lang/String;
    //   153: arraylength
    //   154: istore_3
    //   155: ldc 2
    //   157: monitorexit
    //   158: aload_0
    //   159: getstatic 41	com/google/android/gms/internal/nearby/zzhw:zza	Landroid/net/Uri;
    //   162: aconst_null
    //   163: aconst_null
    //   164: iconst_1
    //   165: anewarray 79	java/lang/String
    //   168: dup
    //   169: iconst_0
    //   170: ldc 97
    //   172: aastore
    //   173: aconst_null
    //   174: invokevirtual 117	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   177: astore 8
    //   179: aload 8
    //   181: ifnonnull +9 -> 190
    //   184: aload 7
    //   186: astore_0
    //   187: goto +87 -> 274
    //   190: aload 8
    //   192: invokeinterface 122 1 0
    //   197: ifne +24 -> 221
    //   200: aload 9
    //   202: ldc 97
    //   204: aconst_null
    //   205: invokestatic 125	com/google/android/gms/internal/nearby/zzhw:zzd	(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V
    //   208: aload 6
    //   210: astore_0
    //   211: aload 8
    //   213: invokeinterface 128 1 0
    //   218: goto +56 -> 274
    //   221: aload 8
    //   223: iconst_1
    //   224: invokeinterface 132 2 0
    //   229: astore 7
    //   231: aload 7
    //   233: astore_0
    //   234: aload 7
    //   236: ifnull +17 -> 253
    //   239: aload 7
    //   241: astore_0
    //   242: aload 7
    //   244: aconst_null
    //   245: invokevirtual 135	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   248: ifeq +5 -> 253
    //   251: aconst_null
    //   252: astore_0
    //   253: aload 9
    //   255: ldc 97
    //   257: aload_0
    //   258: invokestatic 125	com/google/android/gms/internal/nearby/zzhw:zzd	(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V
    //   261: aload_0
    //   262: ifnonnull +9 -> 271
    //   265: aload 6
    //   267: astore_0
    //   268: goto -57 -> 211
    //   271: goto -60 -> 211
    //   274: aload_0
    //   275: ifnull +100 -> 375
    //   278: aload_0
    //   279: ldc -119
    //   281: invokevirtual 135	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   284: ifeq +6 -> 290
    //   287: goto +88 -> 375
    //   290: getstatic 55	com/google/android/gms/internal/nearby/zzhw:zzc	Ljava/util/regex/Pattern;
    //   293: aload_0
    //   294: invokevirtual 141	java/util/regex/Pattern:matcher	(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   297: invokevirtual 146	java/util/regex/Matcher:matches	()Z
    //   300: ifeq +9 -> 309
    //   303: aload 5
    //   305: astore_0
    //   306: goto +71 -> 377
    //   309: getstatic 59	com/google/android/gms/internal/nearby/zzhw:zzd	Ljava/util/regex/Pattern;
    //   312: aload_0
    //   313: invokevirtual 141	java/util/regex/Pattern:matcher	(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   316: invokevirtual 146	java/util/regex/Matcher:matches	()Z
    //   319: ifeq +13 -> 332
    //   322: iconst_0
    //   323: invokestatic 95	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   326: astore_0
    //   327: iconst_0
    //   328: istore_2
    //   329: goto +48 -> 377
    //   332: new 148	java/lang/StringBuilder
    //   335: dup
    //   336: invokespecial 149	java/lang/StringBuilder:<init>	()V
    //   339: astore 5
    //   341: aload 5
    //   343: ldc -105
    //   345: invokevirtual 155	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   348: pop
    //   349: aload 5
    //   351: aload_0
    //   352: invokevirtual 155	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   355: pop
    //   356: aload 5
    //   358: ldc -99
    //   360: invokevirtual 155	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   363: pop
    //   364: ldc -97
    //   366: aload 5
    //   368: invokevirtual 163	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   371: invokestatic 169	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   374: pop
    //   375: aload_1
    //   376: astore_0
    //   377: ldc 2
    //   379: monitorenter
    //   380: aload 10
    //   382: getstatic 89	com/google/android/gms/internal/nearby/zzhw:zzl	Ljava/lang/Object;
    //   385: if_acmpne +21 -> 406
    //   388: aload 11
    //   390: ldc 97
    //   392: aload_0
    //   393: invokevirtual 173	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   396: pop
    //   397: getstatic 111	com/google/android/gms/internal/nearby/zzhw:zze	Ljava/util/HashMap;
    //   400: ldc 97
    //   402: invokevirtual 176	java/util/HashMap:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   405: pop
    //   406: ldc 2
    //   408: monitorexit
    //   409: iload_2
    //   410: ireturn
    //   411: astore_0
    //   412: ldc 2
    //   414: monitorexit
    //   415: aload_0
    //   416: athrow
    //   417: astore_0
    //   418: aload 8
    //   420: invokeinterface 128 1 0
    //   425: aload_0
    //   426: athrow
    //   427: astore_0
    //   428: ldc 2
    //   430: monitorexit
    //   431: aload_0
    //   432: athrow
    //   433: astore_0
    //   434: ldc 2
    //   436: monitorexit
    //   437: aload_0
    //   438: athrow
    //   439: astore_0
    //   440: ldc 2
    //   442: monitorexit
    //   443: aload_0
    //   444: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	445	0	paramContentResolver	ContentResolver
    //   0	445	1	paramString	String
    //   0	445	2	paramBoolean	boolean
    //   154	1	3	i	int
    //   38	12	4	bool	boolean
    //   26	341	5	localObject1	Object
    //   41	225	6	localObject2	Object
    //   44	199	7	str	String
    //   47	372	8	localCursor	android.database.Cursor
    //   61	193	9	localObject3	Object
    //   10	371	10	localObject4	Object
    //   18	371	11	localHashMap	HashMap
    // Exception table:
    //   from	to	target	type
    //   380	406	411	finally
    //   406	409	411	finally
    //   412	415	411	finally
    //   190	208	417	finally
    //   221	231	417	finally
    //   242	251	417	finally
    //   253	261	417	finally
    //   102	134	427	finally
    //   144	147	427	finally
    //   150	158	427	finally
    //   428	431	427	finally
    //   31	40	433	finally
    //   54	63	433	finally
    //   74	77	433	finally
    //   80	83	433	finally
    //   434	437	433	finally
    //   3	15	439	finally
    //   440	443	439	finally
  }
  
  private static void zzc(ContentResolver paramContentResolver)
  {
    if (zze == null)
    {
      zzk.set(false);
      zze = new HashMap();
      zzl = new Object();
      zzm = false;
      paramContentResolver.registerContentObserver(zza, true, new zzhv(null));
      return;
    }
    if (zzk.getAndSet(false))
    {
      zze.clear();
      zzf.clear();
      zzg.clear();
      zzh.clear();
      zzi.clear();
      zzl = new Object();
      zzm = false;
    }
  }
  
  private static void zzd(Object paramObject, String paramString1, String paramString2)
  {
    try
    {
      if (paramObject == zzl) {
        zze.put("gms:nearby:requires_gms_check", paramString2);
      }
      return;
    }
    finally {}
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzhw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */