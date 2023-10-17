package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.PlatformVersion;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class zzaux
  extends Thread
{
  private boolean zza = false;
  private boolean zzb = false;
  private final Object zzc;
  private final zzauo zzd;
  private final int zze;
  private final int zzf;
  private final int zzg;
  private final int zzh;
  private final int zzi;
  private final int zzj;
  private final int zzk;
  private final int zzl;
  private final String zzm;
  private final boolean zzn;
  private final boolean zzo;
  private final boolean zzp;
  
  public zzaux()
  {
    this.zzd = ((zzauo)localObject);
    this.zzc = new Object();
    this.zzf = ((Long)zzbcv.zzd.zze()).intValue();
    this.zzg = ((Long)zzbcv.zza.zze()).intValue();
    this.zzh = ((Long)zzbcv.zze.zze()).intValue();
    this.zzi = ((Long)zzbcv.zzc.zze()).intValue();
    localObject = zzbbk.zzT;
    this.zzj = ((Integer)zzba.zzc().zzb((zzbbc)localObject)).intValue();
    localObject = zzbbk.zzU;
    this.zzk = ((Integer)zzba.zzc().zzb((zzbbc)localObject)).intValue();
    localObject = zzbbk.zzV;
    this.zzl = ((Integer)zzba.zzc().zzb((zzbbc)localObject)).intValue();
    this.zze = ((Long)zzbcv.zzf.zze()).intValue();
    localObject = zzbbk.zzX;
    this.zzm = ((String)zzba.zzc().zzb((zzbbc)localObject));
    localObject = zzbbk.zzY;
    this.zzn = ((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue();
    localObject = zzbbk.zzZ;
    this.zzo = ((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue();
    localObject = zzbbk.zzaa;
    this.zzp = ((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue();
    setName("ContentFetchTask");
  }
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: invokestatic 154	com/google/android/gms/ads/internal/zzt:zzb	()Lcom/google/android/gms/internal/ads/zzaus;
    //   3: invokevirtual 159	com/google/android/gms/internal/ads/zzaus:zzb	()Landroid/content/Context;
    //   6: astore_3
    //   7: aload_3
    //   8: ifnonnull +6 -> 14
    //   11: goto +246 -> 257
    //   14: aload_3
    //   15: ldc -95
    //   17: invokevirtual 167	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   20: checkcast 169	android/app/ActivityManager
    //   23: astore 4
    //   25: aload_3
    //   26: ldc -85
    //   28: invokevirtual 167	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   31: checkcast 173	android/app/KeyguardManager
    //   34: astore_2
    //   35: aload 4
    //   37: ifnull +220 -> 257
    //   40: aload_2
    //   41: ifnull +216 -> 257
    //   44: aload 4
    //   46: invokevirtual 177	android/app/ActivityManager:getRunningAppProcesses	()Ljava/util/List;
    //   49: astore 4
    //   51: aload 4
    //   53: ifnull +204 -> 257
    //   56: aload 4
    //   58: invokeinterface 183 1 0
    //   63: astore 5
    //   65: aload 5
    //   67: invokeinterface 188 1 0
    //   72: ifeq +185 -> 257
    //   75: aload 5
    //   77: invokeinterface 191 1 0
    //   82: checkcast 193	android/app/ActivityManager$RunningAppProcessInfo
    //   85: astore 4
    //   87: invokestatic 198	android/os/Process:myPid	()I
    //   90: aload 4
    //   92: getfield 201	android/app/ActivityManager$RunningAppProcessInfo:pid	I
    //   95: if_icmpne -30 -> 65
    //   98: aload 4
    //   100: getfield 204	android/app/ActivityManager$RunningAppProcessInfo:importance	I
    //   103: bipush 100
    //   105: if_icmpne +152 -> 257
    //   108: aload_2
    //   109: invokevirtual 207	android/app/KeyguardManager:inKeyguardRestrictedInputMode	()Z
    //   112: ifne +145 -> 257
    //   115: aload_3
    //   116: ldc -47
    //   118: invokevirtual 167	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   121: checkcast 211	android/os/PowerManager
    //   124: astore_2
    //   125: aload_2
    //   126: ifnull +131 -> 257
    //   129: aload_2
    //   130: invokevirtual 214	android/os/PowerManager:isScreenOn	()Z
    //   133: istore_1
    //   134: iload_1
    //   135: ifeq +122 -> 257
    //   138: invokestatic 154	com/google/android/gms/ads/internal/zzt:zzb	()Lcom/google/android/gms/internal/ads/zzaus;
    //   141: invokevirtual 217	com/google/android/gms/internal/ads/zzaus:zza	()Landroid/app/Activity;
    //   144: astore 4
    //   146: aload 4
    //   148: ifnonnull +15 -> 163
    //   151: ldc -37
    //   153: invokestatic 223	com/google/android/gms/internal/ads/zzbzt:zze	(Ljava/lang/String;)V
    //   156: aload_0
    //   157: invokevirtual 225	com/google/android/gms/internal/ads/zzaux:zzf	()V
    //   160: goto +107 -> 267
    //   163: aconst_null
    //   164: astore_3
    //   165: aload_3
    //   166: astore_2
    //   167: aload 4
    //   169: invokevirtual 231	android/app/Activity:getWindow	()Landroid/view/Window;
    //   172: ifnull +51 -> 223
    //   175: aload_3
    //   176: astore_2
    //   177: aload 4
    //   179: invokevirtual 231	android/app/Activity:getWindow	()Landroid/view/Window;
    //   182: invokevirtual 237	android/view/Window:getDecorView	()Landroid/view/View;
    //   185: ifnull +38 -> 223
    //   188: aload 4
    //   190: invokevirtual 231	android/app/Activity:getWindow	()Landroid/view/Window;
    //   193: invokevirtual 237	android/view/Window:getDecorView	()Landroid/view/View;
    //   196: ldc -18
    //   198: invokevirtual 244	android/view/View:findViewById	(I)Landroid/view/View;
    //   201: astore_2
    //   202: goto +21 -> 223
    //   205: astore_2
    //   206: invokestatic 247	com/google/android/gms/ads/internal/zzt:zzo	()Lcom/google/android/gms/internal/ads/zzbzc;
    //   209: aload_2
    //   210: ldc -7
    //   212: invokevirtual 255	com/google/android/gms/internal/ads/zzbzc:zzu	(Ljava/lang/Throwable;Ljava/lang/String;)V
    //   215: ldc_w 257
    //   218: invokestatic 223	com/google/android/gms/internal/ads/zzbzt:zze	(Ljava/lang/String;)V
    //   221: aload_3
    //   222: astore_2
    //   223: aload_2
    //   224: ifnull +43 -> 267
    //   227: new 259	com/google/android/gms/internal/ads/zzaut
    //   230: astore_3
    //   231: aload_3
    //   232: aload_0
    //   233: aload_2
    //   234: invokespecial 262	com/google/android/gms/internal/ads/zzaut:<init>	(Lcom/google/android/gms/internal/ads/zzaux;Landroid/view/View;)V
    //   237: aload_2
    //   238: aload_3
    //   239: invokevirtual 266	android/view/View:post	(Ljava/lang/Runnable;)Z
    //   242: pop
    //   243: goto +24 -> 267
    //   246: astore_2
    //   247: invokestatic 247	com/google/android/gms/ads/internal/zzt:zzo	()Lcom/google/android/gms/internal/ads/zzbzc;
    //   250: aload_2
    //   251: ldc_w 268
    //   254: invokevirtual 255	com/google/android/gms/internal/ads/zzbzc:zzu	(Ljava/lang/Throwable;Ljava/lang/String;)V
    //   257: ldc_w 270
    //   260: invokestatic 223	com/google/android/gms/internal/ads/zzbzt:zze	(Ljava/lang/String;)V
    //   263: aload_0
    //   264: invokevirtual 225	com/google/android/gms/internal/ads/zzaux:zzf	()V
    //   267: aload_0
    //   268: getfield 109	com/google/android/gms/internal/ads/zzaux:zze	I
    //   271: sipush 1000
    //   274: imul
    //   275: i2l
    //   276: invokestatic 274	java/lang/Thread:sleep	(J)V
    //   279: goto +32 -> 311
    //   282: astore_2
    //   283: ldc_w 276
    //   286: aload_2
    //   287: invokestatic 279	com/google/android/gms/internal/ads/zzbzt:zzh	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   290: invokestatic 247	com/google/android/gms/ads/internal/zzt:zzo	()Lcom/google/android/gms/internal/ads/zzbzc;
    //   293: aload_2
    //   294: ldc_w 281
    //   297: invokevirtual 255	com/google/android/gms/internal/ads/zzbzc:zzu	(Ljava/lang/Throwable;Ljava/lang/String;)V
    //   300: goto +11 -> 311
    //   303: astore_2
    //   304: ldc_w 276
    //   307: aload_2
    //   308: invokestatic 279	com/google/android/gms/internal/ads/zzbzt:zzh	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   311: aload_0
    //   312: getfield 44	com/google/android/gms/internal/ads/zzaux:zzc	Ljava/lang/Object;
    //   315: astore_2
    //   316: aload_2
    //   317: monitorenter
    //   318: aload_0
    //   319: getfield 37	com/google/android/gms/internal/ads/zzaux:zzb	Z
    //   322: istore_1
    //   323: iload_1
    //   324: ifeq +19 -> 343
    //   327: ldc_w 283
    //   330: invokestatic 223	com/google/android/gms/internal/ads/zzbzt:zze	(Ljava/lang/String;)V
    //   333: aload_0
    //   334: getfield 44	com/google/android/gms/internal/ads/zzaux:zzc	Ljava/lang/Object;
    //   337: invokevirtual 286	java/lang/Object:wait	()V
    //   340: goto -22 -> 318
    //   343: aload_2
    //   344: monitorexit
    //   345: goto -345 -> 0
    //   348: astore_3
    //   349: aload_2
    //   350: monitorexit
    //   351: aload_3
    //   352: athrow
    //   353: astore_3
    //   354: goto -36 -> 318
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	357	0	this	zzaux
    //   133	191	1	bool	boolean
    //   34	168	2	localObject1	Object
    //   205	5	2	localException1	Exception
    //   222	16	2	localObject2	Object
    //   246	5	2	localThrowable	Throwable
    //   282	12	2	localException2	Exception
    //   303	5	2	localInterruptedException1	InterruptedException
    //   6	233	3	localObject4	Object
    //   348	4	3	localObject5	Object
    //   353	1	3	localInterruptedException2	InterruptedException
    //   23	166	4	localObject6	Object
    //   63	13	5	localIterator	java.util.Iterator
    // Exception table:
    //   from	to	target	type
    //   167	175	205	java/lang/Exception
    //   177	202	205	java/lang/Exception
    //   0	7	246	finally
    //   14	35	246	finally
    //   44	51	246	finally
    //   56	65	246	finally
    //   65	125	246	finally
    //   129	134	246	finally
    //   138	146	282	java/lang/Exception
    //   151	160	282	java/lang/Exception
    //   206	221	282	java/lang/Exception
    //   227	243	282	java/lang/Exception
    //   247	257	282	java/lang/Exception
    //   257	267	282	java/lang/Exception
    //   267	279	282	java/lang/Exception
    //   138	146	303	java/lang/InterruptedException
    //   151	160	303	java/lang/InterruptedException
    //   206	221	303	java/lang/InterruptedException
    //   227	243	303	java/lang/InterruptedException
    //   247	257	303	java/lang/InterruptedException
    //   257	267	303	java/lang/InterruptedException
    //   267	279	303	java/lang/InterruptedException
    //   318	323	348	finally
    //   327	340	348	finally
    //   343	345	348	finally
    //   349	351	348	finally
    //   327	340	353	java/lang/InterruptedException
  }
  
  public final zzaun zza()
  {
    return this.zzd.zza(this.zzp);
  }
  
  final zzauw zzb(View paramView, zzaun paramzzaun)
  {
    int k = 0;
    if (paramView == null) {
      return new zzauw(this, 0, 0);
    }
    boolean bool = paramView.getGlobalVisibleRect(new Rect());
    Object localObject;
    if (((paramView instanceof TextView)) && (!(paramView instanceof EditText)))
    {
      localObject = ((TextView)paramView).getText();
      if (!TextUtils.isEmpty((CharSequence)localObject))
      {
        paramzzaun.zzk(localObject.toString(), bool, paramView.getX(), paramView.getY(), paramView.getWidth(), paramView.getHeight());
        return new zzauw(this, 1, 0);
      }
      return new zzauw(this, 0, 0);
    }
    if (((paramView instanceof WebView)) && (!(paramView instanceof zzcfb)))
    {
      paramView = (WebView)paramView;
      if (!PlatformVersion.isAtLeastKitKat()) {
        return new zzauw(this, 0, 0);
      }
      paramzzaun.zzh();
      paramView.post(new zzauv(this, paramzzaun, paramView, bool));
      return new zzauw(this, 0, 1);
    }
    if ((paramView instanceof ViewGroup))
    {
      localObject = (ViewGroup)paramView;
      int j = 0;
      int i = 0;
      while (k < ((ViewGroup)localObject).getChildCount())
      {
        paramView = zzb(((ViewGroup)localObject).getChildAt(k), paramzzaun);
        j += paramView.zza;
        i += paramView.zzb;
        k++;
      }
      return new zzauw(this, j, i);
    }
    return new zzauw(this, 0, 0);
  }
  
  final void zzc(View paramView)
  {
    try
    {
      zzaun localzzaun = new com/google/android/gms/internal/ads/zzaun;
      localzzaun.<init>(this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzo);
      Context localContext = zzt.zzb().zzb();
      if ((localContext != null) && (!TextUtils.isEmpty(this.zzm)))
      {
        Object localObject = localContext.getResources();
        zzbbc localzzbbc = zzbbk.zzW;
        localObject = (String)paramView.getTag(((Resources)localObject).getIdentifier((String)zzba.zzc().zzb(localzzbbc), "id", localContext.getPackageName()));
        if ((localObject != null) && (((String)localObject).equals(this.zzm))) {
          return;
        }
      }
      paramView = zzb(paramView, localzzaun);
      localzzaun.zzm();
      if ((paramView.zza == 0) && (paramView.zzb == 0)) {
        return;
      }
      int i = paramView.zzb;
      if (i == 0)
      {
        if (localzzaun.zzc() != 0) {}
      }
      else {
        if (i != 0) {
          break label197;
        }
      }
      if (this.zzd.zzd(localzzaun)) {
        return;
      }
      label197:
      this.zzd.zzb(localzzaun);
      return;
    }
    catch (Exception paramView)
    {
      zzbzt.zzh("Exception in fetchContentOnUIThread", paramView);
      zzt.zzo().zzu(paramView, "ContentFetchTask.fetchContent");
    }
  }
  
  /* Error */
  final void zzd(zzaun paramzzaun, WebView paramWebView, String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 419	com/google/android/gms/internal/ads/zzaun:zzg	()V
    //   4: aload_3
    //   5: invokestatic 317	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   8: ifne +137 -> 145
    //   11: new 421	org/json/JSONObject
    //   14: astore 5
    //   16: aload 5
    //   18: aload_3
    //   19: invokespecial 423	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   22: aload 5
    //   24: ldc_w 425
    //   27: invokevirtual 429	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   30: astore_3
    //   31: aload_0
    //   32: getfield 127	com/google/android/gms/internal/ads/zzaux:zzn	Z
    //   35: ifne +85 -> 120
    //   38: aload_2
    //   39: invokevirtual 432	android/webkit/WebView:getTitle	()Ljava/lang/String;
    //   42: invokestatic 317	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   45: ifne +75 -> 120
    //   48: aload_2
    //   49: invokevirtual 432	android/webkit/WebView:getTitle	()Ljava/lang/String;
    //   52: astore 5
    //   54: new 434	java/lang/StringBuilder
    //   57: astore 6
    //   59: aload 6
    //   61: invokespecial 435	java/lang/StringBuilder:<init>	()V
    //   64: aload 6
    //   66: aload 5
    //   68: invokevirtual 439	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   71: pop
    //   72: aload 6
    //   74: ldc_w 441
    //   77: invokevirtual 439	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   80: pop
    //   81: aload 6
    //   83: aload_3
    //   84: invokevirtual 439	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   87: pop
    //   88: aload_1
    //   89: aload 6
    //   91: invokevirtual 442	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   94: iload 4
    //   96: aload_2
    //   97: invokevirtual 443	android/webkit/WebView:getX	()F
    //   100: aload_2
    //   101: invokevirtual 444	android/webkit/WebView:getY	()F
    //   104: aload_2
    //   105: invokevirtual 445	android/webkit/WebView:getWidth	()I
    //   108: i2f
    //   109: aload_2
    //   110: invokevirtual 446	android/webkit/WebView:getHeight	()I
    //   113: i2f
    //   114: invokevirtual 448	com/google/android/gms/internal/ads/zzaun:zzl	(Ljava/lang/String;ZFFFF)V
    //   117: goto +28 -> 145
    //   120: aload_1
    //   121: aload_3
    //   122: iload 4
    //   124: aload_2
    //   125: invokevirtual 443	android/webkit/WebView:getX	()F
    //   128: aload_2
    //   129: invokevirtual 444	android/webkit/WebView:getY	()F
    //   132: aload_2
    //   133: invokevirtual 445	android/webkit/WebView:getWidth	()I
    //   136: i2f
    //   137: aload_2
    //   138: invokevirtual 446	android/webkit/WebView:getHeight	()I
    //   141: i2f
    //   142: invokevirtual 448	com/google/android/gms/internal/ads/zzaun:zzl	(Ljava/lang/String;ZFFFF)V
    //   145: aload_1
    //   146: invokevirtual 450	com/google/android/gms/internal/ads/zzaun:zzo	()Z
    //   149: ifeq +12 -> 161
    //   152: aload_0
    //   153: getfield 39	com/google/android/gms/internal/ads/zzaux:zzd	Lcom/google/android/gms/internal/ads/zzauo;
    //   156: aload_1
    //   157: invokevirtual 452	com/google/android/gms/internal/ads/zzauo:zzc	(Lcom/google/android/gms/internal/ads/zzaun;)Z
    //   160: pop
    //   161: return
    //   162: astore_1
    //   163: ldc_w 454
    //   166: aload_1
    //   167: invokestatic 456	com/google/android/gms/internal/ads/zzbzt:zzf	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   170: invokestatic 247	com/google/android/gms/ads/internal/zzt:zzo	()Lcom/google/android/gms/internal/ads/zzbzc;
    //   173: aload_1
    //   174: ldc_w 458
    //   177: invokevirtual 255	com/google/android/gms/internal/ads/zzbzc:zzu	(Ljava/lang/Throwable;Ljava/lang/String;)V
    //   180: return
    //   181: astore_1
    //   182: ldc_w 460
    //   185: invokestatic 223	com/google/android/gms/internal/ads/zzbzt:zze	(Ljava/lang/String;)V
    //   188: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	189	0	this	zzaux
    //   0	189	1	paramzzaun	zzaun
    //   0	189	2	paramWebView	WebView
    //   0	189	3	paramString	String
    //   0	189	4	paramBoolean	boolean
    //   14	53	5	localObject	Object
    //   57	33	6	localStringBuilder	StringBuilder
    // Exception table:
    //   from	to	target	type
    //   4	117	162	finally
    //   120	145	162	finally
    //   145	161	162	finally
    //   4	117	181	org/json/JSONException
    //   120	145	181	org/json/JSONException
    //   145	161	181	org/json/JSONException
  }
  
  public final void zze()
  {
    synchronized (this.zzc)
    {
      if (this.zza)
      {
        zzbzt.zze("Content hash thread already started, quitting...");
        return;
      }
      this.zza = true;
      start();
      return;
    }
  }
  
  public final void zzf()
  {
    synchronized (this.zzc)
    {
      this.zzb = true;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append("ContentFetchThread: paused, pause = ");
      localStringBuilder.append(true);
      zzbzt.zze(localStringBuilder.toString());
      return;
    }
  }
  
  public final void zzg()
  {
    synchronized (this.zzc)
    {
      this.zzb = false;
      this.zzc.notifyAll();
      zzbzt.zze("ContentFetchThread: wakeup");
      return;
    }
  }
  
  public final boolean zzh()
  {
    return this.zzb;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaux.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */