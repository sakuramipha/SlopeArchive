package com.google.android.gms.common;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageInstaller.SessionInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.UidVerifier;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class GooglePlayServicesUtilLight
{
  static final int GMS_AVAILABILITY_NOTIFICATION_ID = 10436;
  static final int GMS_GENERAL_ERROR_NOTIFICATION_ID = 39789;
  public static final String GOOGLE_PLAY_GAMES_PACKAGE = "com.google.android.play.games";
  @Deprecated
  public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
  @Deprecated
  public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 12451000;
  public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
  static final AtomicBoolean sCanceledAvailabilityNotification = new AtomicBoolean();
  static boolean zza = false;
  private static boolean zzb = false;
  private static final AtomicBoolean zzc = new AtomicBoolean();
  
  @Deprecated
  public static void cancelAvailabilityErrorNotifications(Context paramContext)
  {
    if (sCanceledAvailabilityNotification.getAndSet(true)) {
      return;
    }
    try
    {
      paramContext = (NotificationManager)paramContext.getSystemService("notification");
      if (paramContext != null) {
        paramContext.cancel(10436);
      }
      return;
    }
    catch (SecurityException paramContext)
    {
      for (;;) {}
    }
  }
  
  public static void enableUsingApkIndependentContext()
  {
    zzc.set(true);
  }
  
  @Deprecated
  public static void ensurePlayServicesAvailable(Context paramContext, int paramInt)
    throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException
  {
    paramInt = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(paramContext, paramInt);
    if (paramInt != 0)
    {
      Intent localIntent = GoogleApiAvailabilityLight.getInstance().getErrorResolutionIntent(paramContext, paramInt, "e");
      paramContext = new StringBuilder(57);
      paramContext.append("GooglePlayServices not available due to error ");
      paramContext.append(paramInt);
      Log.e("GooglePlayServicesUtil", paramContext.toString());
      if (localIntent == null) {
        throw new GooglePlayServicesNotAvailableException(paramInt);
      }
      throw new GooglePlayServicesRepairableException(paramInt, "Google Play Services not available", localIntent);
    }
  }
  
  @Deprecated
  public static int getApkVersion(Context paramContext)
  {
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo("com.google.android.gms", 0);
      return paramContext.versionCode;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
    }
    return 0;
  }
  
  @Deprecated
  public static int getClientVersion(Context paramContext)
  {
    Preconditions.checkState(true);
    return ClientLibraryUtils.getClientVersion(paramContext, paramContext.getPackageName());
  }
  
  @Deprecated
  public static PendingIntent getErrorPendingIntent(int paramInt1, Context paramContext, int paramInt2)
  {
    return GoogleApiAvailabilityLight.getInstance().getErrorResolutionPendingIntent(paramContext, paramInt1, paramInt2);
  }
  
  @Deprecated
  public static String getErrorString(int paramInt)
  {
    return ConnectionResult.zza(paramInt);
  }
  
  @Deprecated
  public static Intent getGooglePlayServicesAvailabilityRecoveryIntent(int paramInt)
  {
    return GoogleApiAvailabilityLight.getInstance().getErrorResolutionIntent(null, paramInt, null);
  }
  
  public static Context getRemoteContext(Context paramContext)
  {
    try
    {
      paramContext = paramContext.createPackageContext("com.google.android.gms", 3);
      return paramContext;
    }
    catch (PackageManager.NameNotFoundException paramContext) {}
    return null;
  }
  
  public static Resources getRemoteResource(Context paramContext)
  {
    try
    {
      paramContext = paramContext.getPackageManager().getResourcesForApplication("com.google.android.gms");
      return paramContext;
    }
    catch (PackageManager.NameNotFoundException paramContext) {}
    return null;
  }
  
  /* Error */
  public static boolean honorsDebugCertificates(Context paramContext)
  {
    // Byte code:
    //   0: getstatic 191	com/google/android/gms/common/GooglePlayServicesUtilLight:zza	Z
    //   3: ifne +85 -> 88
    //   6: aload_0
    //   7: invokestatic 197	com/google/android/gms/common/wrappers/Wrappers:packageManager	(Landroid/content/Context;)Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;
    //   10: ldc 16
    //   12: bipush 64
    //   14: invokevirtual 200	com/google/android/gms/common/wrappers/PackageManagerWrapper:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   17: astore_1
    //   18: aload_0
    //   19: invokestatic 205	com/google/android/gms/common/GoogleSignatureVerifier:getInstance	(Landroid/content/Context;)Lcom/google/android/gms/common/GoogleSignatureVerifier;
    //   22: pop
    //   23: aload_1
    //   24: ifnull +26 -> 50
    //   27: aload_1
    //   28: iconst_0
    //   29: invokestatic 208	com/google/android/gms/common/GoogleSignatureVerifier:zzb	(Landroid/content/pm/PackageInfo;Z)Z
    //   32: ifne +18 -> 50
    //   35: aload_1
    //   36: iconst_1
    //   37: invokestatic 208	com/google/android/gms/common/GoogleSignatureVerifier:zzb	(Landroid/content/pm/PackageInfo;Z)Z
    //   40: ifeq +10 -> 50
    //   43: iconst_1
    //   44: putstatic 210	com/google/android/gms/common/GooglePlayServicesUtilLight:zzb	Z
    //   47: goto +7 -> 54
    //   50: iconst_0
    //   51: putstatic 210	com/google/android/gms/common/GooglePlayServicesUtilLight:zzb	Z
    //   54: iconst_1
    //   55: putstatic 191	com/google/android/gms/common/GooglePlayServicesUtilLight:zza	Z
    //   58: goto +30 -> 88
    //   61: astore_0
    //   62: goto +20 -> 82
    //   65: astore_0
    //   66: ldc 107
    //   68: ldc -44
    //   70: aload_0
    //   71: invokestatic 215	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   74: pop
    //   75: iconst_1
    //   76: putstatic 191	com/google/android/gms/common/GooglePlayServicesUtilLight:zza	Z
    //   79: goto +9 -> 88
    //   82: iconst_1
    //   83: putstatic 191	com/google/android/gms/common/GooglePlayServicesUtilLight:zza	Z
    //   86: aload_0
    //   87: athrow
    //   88: getstatic 210	com/google/android/gms/common/GooglePlayServicesUtilLight:zzb	Z
    //   91: ifne +14 -> 105
    //   94: invokestatic 221	com/google/android/gms/common/util/DeviceProperties:isUserBuild	()Z
    //   97: ifne +6 -> 103
    //   100: goto +5 -> 105
    //   103: iconst_0
    //   104: ireturn
    //   105: iconst_1
    //   106: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	107	0	paramContext	Context
    //   17	19	1	localPackageInfo	PackageInfo
    // Exception table:
    //   from	to	target	type
    //   6	23	61	finally
    //   27	47	61	finally
    //   50	54	61	finally
    //   66	75	61	finally
    //   6	23	65	android/content/pm/PackageManager$NameNotFoundException
    //   27	47	65	android/content/pm/PackageManager$NameNotFoundException
    //   50	54	65	android/content/pm/PackageManager$NameNotFoundException
  }
  
  @Deprecated
  public static int isGooglePlayServicesAvailable(Context paramContext)
  {
    return isGooglePlayServicesAvailable(paramContext, GOOGLE_PLAY_SERVICES_VERSION_CODE);
  }
  
  /* Error */
  @Deprecated
  public static int isGooglePlayServicesAvailable(Context paramContext, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 228	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   4: getstatic 233	com/google/android/gms/common/R$string:common_google_play_services_unknown_issue	I
    //   7: invokevirtual 238	android/content/res/Resources:getString	(I)Ljava/lang/String;
    //   10: pop
    //   11: goto +13 -> 24
    //   14: astore 5
    //   16: ldc 107
    //   18: ldc -16
    //   20: invokestatic 116	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   23: pop
    //   24: ldc 16
    //   26: aload_0
    //   27: invokevirtual 156	android/content/Context:getPackageName	()Ljava/lang/String;
    //   30: invokevirtual 246	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   33: ifne +51 -> 84
    //   36: getstatic 40	com/google/android/gms/common/GooglePlayServicesUtilLight:zzc	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   39: invokevirtual 249	java/util/concurrent/atomic/AtomicBoolean:get	()Z
    //   42: ifeq +6 -> 48
    //   45: goto +39 -> 84
    //   48: aload_0
    //   49: invokestatic 253	com/google/android/gms/common/internal/zzag:zza	(Landroid/content/Context;)I
    //   52: istore_2
    //   53: iload_2
    //   54: ifeq +22 -> 76
    //   57: iload_2
    //   58: getstatic 223	com/google/android/gms/common/GooglePlayServicesUtilLight:GOOGLE_PLAY_SERVICES_VERSION_CODE	I
    //   61: if_icmpne +6 -> 67
    //   64: goto +20 -> 84
    //   67: new 255	com/google/android/gms/common/GooglePlayServicesIncorrectManifestValueException
    //   70: dup
    //   71: iload_2
    //   72: invokespecial 256	com/google/android/gms/common/GooglePlayServicesIncorrectManifestValueException:<init>	(I)V
    //   75: athrow
    //   76: new 258	com/google/android/gms/common/GooglePlayServicesMissingManifestValueException
    //   79: dup
    //   80: invokespecial 259	com/google/android/gms/common/GooglePlayServicesMissingManifestValueException:<init>	()V
    //   83: athrow
    //   84: aload_0
    //   85: invokestatic 262	com/google/android/gms/common/util/DeviceProperties:isWearableWithoutPlayStore	(Landroid/content/Context;)Z
    //   88: istore 4
    //   90: iconst_1
    //   91: istore_3
    //   92: iload 4
    //   94: ifne +15 -> 109
    //   97: aload_0
    //   98: invokestatic 264	com/google/android/gms/common/util/DeviceProperties:zzb	(Landroid/content/Context;)Z
    //   101: ifne +8 -> 109
    //   104: iconst_1
    //   105: istore_2
    //   106: goto +5 -> 111
    //   109: iconst_0
    //   110: istore_2
    //   111: iload_1
    //   112: iflt +9 -> 121
    //   115: iconst_1
    //   116: istore 4
    //   118: goto +6 -> 124
    //   121: iconst_0
    //   122: istore 4
    //   124: iload 4
    //   126: invokestatic 267	com/google/android/gms/common/internal/Preconditions:checkArgument	(Z)V
    //   129: aload_0
    //   130: invokevirtual 156	android/content/Context:getPackageName	()Ljava/lang/String;
    //   133: astore 6
    //   135: aload_0
    //   136: invokevirtual 131	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   139: astore 7
    //   141: iload_2
    //   142: ifeq +42 -> 184
    //   145: aload 7
    //   147: ldc 22
    //   149: sipush 8256
    //   152: invokevirtual 137	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   155: astore 5
    //   157: goto +30 -> 187
    //   160: astore_0
    //   161: ldc 107
    //   163: aload 6
    //   165: invokestatic 271	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   168: ldc_w 273
    //   171: invokevirtual 277	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   174: invokestatic 147	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   177: pop
    //   178: bipush 9
    //   180: istore_1
    //   181: goto +322 -> 503
    //   184: aconst_null
    //   185: astore 5
    //   187: aload 7
    //   189: ldc 16
    //   191: bipush 64
    //   193: invokevirtual 137	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   196: astore 8
    //   198: aload_0
    //   199: invokestatic 205	com/google/android/gms/common/GoogleSignatureVerifier:getInstance	(Landroid/content/Context;)Lcom/google/android/gms/common/GoogleSignatureVerifier;
    //   202: pop
    //   203: aload 8
    //   205: iconst_1
    //   206: invokestatic 208	com/google/android/gms/common/GoogleSignatureVerifier:zzb	(Landroid/content/pm/PackageInfo;Z)Z
    //   209: ifne +23 -> 232
    //   212: ldc 107
    //   214: aload 6
    //   216: invokestatic 271	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   219: ldc_w 279
    //   222: invokevirtual 277	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   225: invokestatic 147	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   228: pop
    //   229: goto -51 -> 178
    //   232: iload_2
    //   233: ifeq +38 -> 271
    //   236: aload 5
    //   238: invokestatic 283	com/google/android/gms/common/internal/Preconditions:checkNotNull	(Ljava/lang/Object;)Ljava/lang/Object;
    //   241: pop
    //   242: aload 5
    //   244: iconst_1
    //   245: invokestatic 208	com/google/android/gms/common/GoogleSignatureVerifier:zzb	(Landroid/content/pm/PackageInfo;Z)Z
    //   248: ifne +23 -> 271
    //   251: ldc 107
    //   253: aload 6
    //   255: invokestatic 271	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   258: ldc_w 285
    //   261: invokevirtual 277	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   264: invokestatic 147	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   267: pop
    //   268: goto -90 -> 178
    //   271: iload_2
    //   272: ifeq +48 -> 320
    //   275: aload 5
    //   277: ifnull +43 -> 320
    //   280: aload 5
    //   282: getfield 289	android/content/pm/PackageInfo:signatures	[Landroid/content/pm/Signature;
    //   285: iconst_0
    //   286: aaload
    //   287: aload 8
    //   289: getfield 289	android/content/pm/PackageInfo:signatures	[Landroid/content/pm/Signature;
    //   292: iconst_0
    //   293: aaload
    //   294: invokevirtual 292	android/content/pm/Signature:equals	(Ljava/lang/Object;)Z
    //   297: ifne +23 -> 320
    //   300: ldc 107
    //   302: aload 6
    //   304: invokestatic 271	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   307: ldc_w 294
    //   310: invokevirtual 277	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   313: invokestatic 147	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   316: pop
    //   317: goto -139 -> 178
    //   320: aload 8
    //   322: getfield 142	android/content/pm/PackageInfo:versionCode	I
    //   325: invokestatic 299	com/google/android/gms/common/util/zza:zza	(I)I
    //   328: iload_1
    //   329: invokestatic 299	com/google/android/gms/common/util/zza:zza	(I)I
    //   332: if_icmpge +86 -> 418
    //   335: aload 8
    //   337: getfield 142	android/content/pm/PackageInfo:versionCode	I
    //   340: istore_2
    //   341: new 94	java/lang/StringBuilder
    //   344: dup
    //   345: aload 6
    //   347: invokestatic 271	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   350: invokevirtual 303	java/lang/String:length	()I
    //   353: bipush 82
    //   355: iadd
    //   356: invokespecial 96	java/lang/StringBuilder:<init>	(I)V
    //   359: astore_0
    //   360: aload_0
    //   361: ldc_w 305
    //   364: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   367: pop
    //   368: aload_0
    //   369: aload 6
    //   371: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   374: pop
    //   375: aload_0
    //   376: ldc_w 307
    //   379: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   382: pop
    //   383: aload_0
    //   384: iload_1
    //   385: invokevirtual 105	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   388: pop
    //   389: aload_0
    //   390: ldc_w 309
    //   393: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   396: pop
    //   397: aload_0
    //   398: iload_2
    //   399: invokevirtual 105	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   402: pop
    //   403: ldc 107
    //   405: aload_0
    //   406: invokevirtual 111	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   409: invokestatic 147	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   412: pop
    //   413: iconst_2
    //   414: istore_1
    //   415: goto +88 -> 503
    //   418: aload 8
    //   420: getfield 313	android/content/pm/PackageInfo:applicationInfo	Landroid/content/pm/ApplicationInfo;
    //   423: astore 5
    //   425: aload 5
    //   427: astore_0
    //   428: aload 5
    //   430: ifnonnull +39 -> 469
    //   433: aload 7
    //   435: ldc 16
    //   437: iconst_0
    //   438: invokevirtual 317	android/content/pm/PackageManager:getApplicationInfo	(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    //   441: astore_0
    //   442: goto +27 -> 469
    //   445: astore_0
    //   446: ldc 107
    //   448: aload 6
    //   450: invokestatic 271	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   453: ldc_w 319
    //   456: invokevirtual 277	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   459: aload_0
    //   460: invokestatic 322	android/util/Log:wtf	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   463: pop
    //   464: iload_3
    //   465: istore_1
    //   466: goto +37 -> 503
    //   469: aload_0
    //   470: getfield 327	android/content/pm/ApplicationInfo:enabled	Z
    //   473: ifne +8 -> 481
    //   476: iconst_3
    //   477: istore_1
    //   478: goto +25 -> 503
    //   481: iconst_0
    //   482: ireturn
    //   483: astore_0
    //   484: ldc 107
    //   486: aload 6
    //   488: invokestatic 271	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   491: ldc_w 329
    //   494: invokevirtual 277	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   497: invokestatic 147	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   500: pop
    //   501: iload_3
    //   502: istore_1
    //   503: iload_1
    //   504: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	505	0	paramContext	Context
    //   0	505	1	paramInt	int
    //   52	347	2	i	int
    //   91	411	3	j	int
    //   88	37	4	bool	boolean
    //   14	1	5	localObject1	Object
    //   155	274	5	localObject2	Object
    //   133	354	6	str	String
    //   139	295	7	localPackageManager	PackageManager
    //   196	223	8	localPackageInfo	PackageInfo
    // Exception table:
    //   from	to	target	type
    //   0	11	14	finally
    //   145	157	160	android/content/pm/PackageManager$NameNotFoundException
    //   433	442	445	android/content/pm/PackageManager$NameNotFoundException
    //   187	198	483	android/content/pm/PackageManager$NameNotFoundException
  }
  
  @Deprecated
  public static boolean isGooglePlayServicesUid(Context paramContext, int paramInt)
  {
    return UidVerifier.isGooglePlayServicesUid(paramContext, paramInt);
  }
  
  @Deprecated
  public static boolean isPlayServicesPossiblyUpdating(Context paramContext, int paramInt)
  {
    if (paramInt == 18) {
      return true;
    }
    if (paramInt == 1) {
      return zza(paramContext, "com.google.android.gms");
    }
    return false;
  }
  
  @Deprecated
  public static boolean isPlayStorePossiblyUpdating(Context paramContext, int paramInt)
  {
    if (paramInt == 9) {
      return zza(paramContext, "com.android.vending");
    }
    return false;
  }
  
  public static boolean isRestrictedUserProfile(Context paramContext)
  {
    if (PlatformVersion.isAtLeastJellyBeanMR2())
    {
      Object localObject = paramContext.getSystemService("user");
      Preconditions.checkNotNull(localObject);
      paramContext = ((UserManager)localObject).getApplicationRestrictions(paramContext.getPackageName());
      if ((paramContext != null) && ("true".equals(paramContext.getString("restricted_profile")))) {
        return true;
      }
    }
    return false;
  }
  
  @Deprecated
  public static boolean isSidewinderDevice(Context paramContext)
  {
    return DeviceProperties.isSidewinder(paramContext);
  }
  
  @Deprecated
  public static boolean isUserRecoverableError(int paramInt)
  {
    return (paramInt == 1) || (paramInt == 2) || (paramInt == 3) || (paramInt == 9);
  }
  
  @Deprecated
  public static boolean uidHasPackageName(Context paramContext, int paramInt, String paramString)
  {
    return UidVerifier.uidHasPackageName(paramContext, paramInt, paramString);
  }
  
  static boolean zza(Context paramContext, String paramString)
  {
    boolean bool = paramString.equals("com.google.android.gms");
    if (PlatformVersion.isAtLeastLollipop()) {
      try
      {
        localObject = paramContext.getPackageManager().getPackageInstaller().getAllSessions();
        localObject = ((List)localObject).iterator();
        while (((Iterator)localObject).hasNext()) {
          if (paramString.equals(((PackageInstaller.SessionInfo)((Iterator)localObject).next()).getAppPackageName())) {
            return true;
          }
        }
      }
      catch (Exception paramContext)
      {
        return false;
      }
    }
    Object localObject = paramContext.getPackageManager();
    try
    {
      paramString = ((PackageManager)localObject).getApplicationInfo(paramString, 8192);
      if (bool) {
        return paramString.enabled;
      }
      if (paramString.enabled)
      {
        bool = isRestrictedUserProfile(paramContext);
        if (!bool) {
          return true;
        }
      }
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;) {}
    }
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\GooglePlayServicesUtilLight.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */