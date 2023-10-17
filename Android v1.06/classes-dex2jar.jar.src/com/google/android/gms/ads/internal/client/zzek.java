package com.google.android.gms.ads.internal.client;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

public final class zzek
  extends ContentProvider
{
  /* Error */
  public final void attachInfo(android.content.Context paramContext, android.content.pm.ProviderInfo paramProviderInfo)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: aload_1
    //   4: invokestatic 23	com/google/android/gms/common/wrappers/Wrappers:packageManager	(Landroid/content/Context;)Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;
    //   7: aload_1
    //   8: invokevirtual 29	android/content/Context:getPackageName	()Ljava/lang/String;
    //   11: sipush 128
    //   14: invokevirtual 35	com/google/android/gms/common/wrappers/PackageManagerWrapper:getApplicationInfo	(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    //   17: getfield 41	android/content/pm/ApplicationInfo:metaData	Landroid/os/Bundle;
    //   20: astore 6
    //   22: aload 6
    //   24: astore 5
    //   26: goto +24 -> 50
    //   29: astore 6
    //   31: ldc 43
    //   33: aload 6
    //   35: invokestatic 49	com/google/android/gms/internal/ads/zzbzt:zzh	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   38: goto +12 -> 50
    //   41: astore 6
    //   43: ldc 51
    //   45: aload 6
    //   47: invokestatic 49	com/google/android/gms/internal/ads/zzbzt:zzh	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   50: invokestatic 57	com/google/android/gms/internal/ads/zzbnr:zza	()Lcom/google/android/gms/internal/ads/zzbnr;
    //   53: astore 7
    //   55: aload 5
    //   57: ifnonnull +11 -> 68
    //   60: ldc 59
    //   62: invokestatic 63	com/google/android/gms/internal/ads/zzbzt:zzg	(Ljava/lang/String;)V
    //   65: goto +120 -> 185
    //   68: aload 5
    //   70: ldc 65
    //   72: invokevirtual 71	android/os/Bundle:get	(Ljava/lang/String;)Ljava/lang/Object;
    //   75: checkcast 73	java/lang/String
    //   78: astore 8
    //   80: aload 5
    //   82: ldc 75
    //   84: invokevirtual 71	android/os/Bundle:get	(Ljava/lang/String;)Ljava/lang/Object;
    //   87: checkcast 77	java/lang/Boolean
    //   90: astore 9
    //   92: aload 5
    //   94: ldc 79
    //   96: invokevirtual 71	android/os/Bundle:get	(Ljava/lang/String;)Ljava/lang/Object;
    //   99: checkcast 73	java/lang/String
    //   102: astore 6
    //   104: aload 8
    //   106: ifnull +58 -> 164
    //   109: aload 8
    //   111: ldc 81
    //   113: invokevirtual 85	java/lang/String:matches	(Ljava/lang/String;)Z
    //   116: ifeq +38 -> 154
    //   119: ldc 87
    //   121: aload 8
    //   123: invokevirtual 91	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   126: invokestatic 94	com/google/android/gms/internal/ads/zzbzt:zze	(Ljava/lang/String;)V
    //   129: aload 9
    //   131: ifnull +11 -> 142
    //   134: aload 9
    //   136: invokevirtual 98	java/lang/Boolean:booleanValue	()Z
    //   139: ifne +46 -> 185
    //   142: aload 7
    //   144: aload_1
    //   145: aload 8
    //   147: invokevirtual 102	com/google/android/gms/internal/ads/zzbnr:zzb	(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Thread;
    //   150: pop
    //   151: goto +34 -> 185
    //   154: new 104	java/lang/IllegalStateException
    //   157: dup
    //   158: ldc 106
    //   160: invokespecial 108	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   163: athrow
    //   164: aload 6
    //   166: invokestatic 114	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   169: ifne +69 -> 238
    //   172: ldc 116
    //   174: aload 6
    //   176: invokestatic 120	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   179: invokevirtual 91	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   182: invokestatic 94	com/google/android/gms/internal/ads/zzbzt:zze	(Ljava/lang/String;)V
    //   185: aload 5
    //   187: ifnonnull +6 -> 193
    //   190: goto +41 -> 231
    //   193: aload 5
    //   195: ldc 122
    //   197: iconst_0
    //   198: invokevirtual 126	android/os/Bundle:getBoolean	(Ljava/lang/String;Z)Z
    //   201: istore 4
    //   203: aload 5
    //   205: ldc -128
    //   207: iconst_0
    //   208: invokevirtual 126	android/os/Bundle:getBoolean	(Ljava/lang/String;Z)Z
    //   211: istore_3
    //   212: iload 4
    //   214: ifeq +8 -> 222
    //   217: ldc -126
    //   219: invokestatic 94	com/google/android/gms/internal/ads/zzbzt:zze	(Ljava/lang/String;)V
    //   222: iload_3
    //   223: ifeq +8 -> 231
    //   226: ldc -124
    //   228: invokestatic 94	com/google/android/gms/internal/ads/zzbzt:zze	(Ljava/lang/String;)V
    //   231: aload_0
    //   232: aload_1
    //   233: aload_2
    //   234: invokespecial 134	android/content/ContentProvider:attachInfo	(Landroid/content/Context;Landroid/content/pm/ProviderInfo;)V
    //   237: return
    //   238: new 104	java/lang/IllegalStateException
    //   241: dup
    //   242: ldc -120
    //   244: invokespecial 108	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   247: athrow
    //   248: astore_1
    //   249: new 104	java/lang/IllegalStateException
    //   252: dup
    //   253: ldc -118
    //   255: aload_1
    //   256: invokespecial 140	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   259: athrow
    //   260: astore_1
    //   261: new 104	java/lang/IllegalStateException
    //   264: dup
    //   265: ldc -114
    //   267: aload_1
    //   268: invokespecial 140	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   271: athrow
    //   272: astore_1
    //   273: new 104	java/lang/IllegalStateException
    //   276: dup
    //   277: ldc -112
    //   279: aload_1
    //   280: invokespecial 140	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   283: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	284	0	this	zzek
    //   0	284	1	paramContext	android.content.Context
    //   0	284	2	paramProviderInfo	android.content.pm.ProviderInfo
    //   211	12	3	bool1	boolean
    //   201	12	4	bool2	boolean
    //   1	203	5	localObject	Object
    //   20	3	6	localBundle	android.os.Bundle
    //   29	5	6	localNameNotFoundException	android.content.pm.PackageManager.NameNotFoundException
    //   41	5	6	localNullPointerException	NullPointerException
    //   102	73	6	str1	String
    //   53	90	7	localzzbnr	com.google.android.gms.internal.ads.zzbnr
    //   78	68	8	str2	String
    //   90	45	9	localBoolean	Boolean
    // Exception table:
    //   from	to	target	type
    //   3	22	29	android/content/pm/PackageManager$NameNotFoundException
    //   3	22	41	java/lang/NullPointerException
    //   92	104	248	java/lang/ClassCastException
    //   80	92	260	java/lang/ClassCastException
    //   68	80	272	java/lang/ClassCastException
  }
  
  public final int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }
  
  public final String getType(Uri paramUri)
  {
    return null;
  }
  
  public final Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    return null;
  }
  
  public final boolean onCreate()
  {
    return false;
  }
  
  public final Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    return null;
  }
  
  public final int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzek.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */