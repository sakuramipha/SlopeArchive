package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.AlertDialog.Builder;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsIntent.Builder;
import com.google.android.gms.ads.formats.zzg;
import com.google.android.gms.ads.impl.R.string;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbbc;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbcp;
import com.google.android.gms.internal.ads.zzbdm;
import com.google.android.gms.internal.ads.zzbuu;
import com.google.android.gms.internal.ads.zzbzc;
import com.google.android.gms.internal.ads.zzbzm;
import com.google.android.gms.internal.ads.zzbzs;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzces;
import com.google.android.gms.internal.ads.zzcfy;
import com.google.android.gms.internal.ads.zzdnn;
import com.google.android.gms.internal.ads.zzezf;
import com.google.android.gms.internal.ads.zzezi;
import com.google.android.gms.internal.ads.zzflv;
import com.google.android.gms.internal.ads.zzfok;
import com.google.android.gms.internal.ads.zzfpm;
import com.google.android.gms.internal.ads.zzfvr;
import com.google.android.gms.internal.ads.zzfwb;
import com.google.android.gms.internal.ads.zzgwc;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public final class zzs
{
  public static final zzflv zza = new zzf(Looper.getMainLooper());
  private final AtomicReference zzb = new AtomicReference(null);
  private final AtomicReference zzc = new AtomicReference(null);
  private boolean zzd = true;
  private final Object zze = new Object();
  private String zzf;
  private boolean zzg = false;
  private boolean zzh = false;
  private final Executor zzi = Executors.newSingleThreadExecutor();
  
  /* Error */
  public static final boolean zzA(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 73	android/content/Context:getClassLoader	()Ljava/lang/ClassLoader;
    //   4: ldc 75
    //   6: invokevirtual 81	java/lang/ClassLoader:loadClass	(Ljava/lang/String;)Ljava/lang/Class;
    //   9: pop
    //   10: iconst_0
    //   11: ireturn
    //   12: astore_0
    //   13: ldc 83
    //   15: aload_0
    //   16: invokestatic 88	com/google/android/gms/internal/ads/zzbzt:zzh	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   19: invokestatic 94	com/google/android/gms/ads/internal/zzt:zzo	()Lcom/google/android/gms/internal/ads/zzbzc;
    //   22: aload_0
    //   23: ldc 96
    //   25: invokevirtual 102	com/google/android/gms/internal/ads/zzbzc:zzu	(Ljava/lang/Throwable;Ljava/lang/String;)V
    //   28: iconst_0
    //   29: ireturn
    //   30: astore_0
    //   31: iconst_1
    //   32: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	33	0	paramContext	Context
    // Exception table:
    //   from	to	target	type
    //   0	10	12	finally
    //   0	10	30	java/lang/ClassNotFoundException
  }
  
  public static final boolean zzB()
  {
    int i = Process.myUid();
    return (i == 0) || (i == 1000);
  }
  
  public static final boolean zzC(Context paramContext)
  {
    try
    {
      Object localObject = (ActivityManager)paramContext.getSystemService("activity");
      KeyguardManager localKeyguardManager = (KeyguardManager)paramContext.getSystemService("keyguard");
      if ((localObject != null) && (localKeyguardManager != null))
      {
        localObject = ((ActivityManager)localObject).getRunningAppProcesses();
        if (localObject == null) {
          return false;
        }
        localObject = ((List)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)((Iterator)localObject).next();
          if (Process.myPid() == localRunningAppProcessInfo.pid) {
            if ((localRunningAppProcessInfo.importance == 100) && (!localKeyguardManager.inKeyguardRestrictedInputMode()))
            {
              paramContext = (PowerManager)paramContext.getSystemService("power");
              if (paramContext != null)
              {
                boolean bool = paramContext.isScreenOn();
                if (bool) {
                  return false;
                }
              }
            }
          }
        }
        return true;
      }
    }
    finally
    {
      for (;;) {}
    }
    return false;
  }
  
  public static final boolean zzD(Context paramContext)
  {
    Bundle localBundle = zzU(paramContext);
    paramContext = localBundle.getString("com.google.android.gms.ads.INTEGRATION_MANAGER");
    return (TextUtils.isEmpty(zzV(localBundle))) && (!TextUtils.isEmpty(paramContext));
  }
  
  public static final boolean zzE(Context paramContext)
  {
    if (!(paramContext instanceof Activity)) {
      return false;
    }
    Window localWindow = ((Activity)paramContext).getWindow();
    if ((localWindow != null) && (localWindow.getDecorView() != null))
    {
      paramContext = new Rect();
      Rect localRect = new Rect();
      localWindow.getDecorView().getGlobalVisibleRect(paramContext, null);
      localWindow.getDecorView().getWindowVisibleDisplayFrame(localRect);
      if ((paramContext.bottom != 0) && (localRect.bottom != 0) && (paramContext.top == localRect.top)) {
        return true;
      }
    }
    return false;
  }
  
  public static final void zzF(View paramView, int paramInt, MotionEvent paramMotionEvent)
  {
    Object localObject1 = paramView;
    Object localObject3 = new int[2];
    Object localObject2 = new Rect();
    try
    {
      String str2 = paramView.getContext().getPackageName();
      paramMotionEvent = (MotionEvent)localObject1;
      if ((localObject1 instanceof zzdnn)) {
        paramMotionEvent = ((zzdnn)localObject1).getChildAt(0);
      }
      if (!(paramMotionEvent instanceof zzg))
      {
        bool = paramMotionEvent instanceof NativeAdView;
        if (!bool)
        {
          paramView = "UNKNOWN";
          i = 0;
          break label81;
        }
      }
      paramView = "NATIVE";
      int i = 1;
      label81:
      int j;
      int k;
      if (paramMotionEvent.getLocalVisibleRect((Rect)localObject2))
      {
        j = ((Rect)localObject2).width();
        k = ((Rect)localObject2).height();
      }
      else
      {
        k = 0;
        j = 0;
      }
      zzt.zzp();
      long l = zzs(paramMotionEvent);
      paramMotionEvent.getLocationOnScreen((int[])localObject3);
      int n = localObject3[0];
      int i1 = localObject3[1];
      boolean bool = paramMotionEvent instanceof zzcfy;
      String str1 = "none";
      if (bool)
      {
        localObject1 = ((zzcfy)paramMotionEvent).zzP();
        if (localObject1 != null)
        {
          localObject1 = ((zzezi)localObject1).zzb;
          m = paramMotionEvent.hashCode();
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          ((StringBuilder)localObject2).append((String)localObject1);
          ((StringBuilder)localObject2).append(":");
          ((StringBuilder)localObject2).append(m);
          paramMotionEvent.setContentDescription(((StringBuilder)localObject2).toString());
          break label238;
        }
      }
      localObject1 = "none";
      label238:
      localObject3 = paramView;
      int m = i;
      localObject2 = str1;
      if ((paramMotionEvent instanceof zzces))
      {
        zzezf localzzezf = ((zzces)paramMotionEvent).zzD();
        localObject3 = paramView;
        m = i;
        localObject2 = str1;
        if (localzzezf != null)
        {
          localObject3 = zzezf.zza(localzzezf.zzb);
          m = localzzezf.zzf;
          localObject2 = localzzezf.zzF;
        }
      }
      zzbzt.zzi(String.format(Locale.US, "<Ad hashCode=%d, package=%s, adNetCls=%s, gwsQueryId=%s, format=%s, impType=%d, class=%s, x=%d, y=%d, width=%d, height=%d, vWidth=%d, vHeight=%d, alpha=%d, state=%s>", new Object[] { Integer.valueOf(paramMotionEvent.hashCode()), str2, localObject2, localObject1, localObject3, Integer.valueOf(m), paramMotionEvent.getClass().getName(), Integer.valueOf(n), Integer.valueOf(i1), Integer.valueOf(paramMotionEvent.getWidth()), Integer.valueOf(paramMotionEvent.getHeight()), Integer.valueOf(j), Integer.valueOf(k), Long.valueOf(l), Integer.toString(paramInt, 2) }));
      return;
    }
    catch (Exception paramView)
    {
      zzbzt.zzh("Failure getting view location.", paramView);
    }
  }
  
  public static final AlertDialog.Builder zzG(Context paramContext)
  {
    return new AlertDialog.Builder(paramContext, zzt.zzq().zza());
  }
  
  public static final void zzH(Context paramContext, String paramString1, String paramString2)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(paramString2);
    paramString2 = localArrayList.iterator();
    while (paramString2.hasNext()) {
      new zzby(paramContext, paramString1, (String)paramString2.next()).zzb();
    }
  }
  
  public static final void zzI(Context paramContext, Throwable paramThrowable)
  {
    if (paramContext != null) {}
    try
    {
      boolean bool = ((Boolean)zzbdm.zzb.zze()).booleanValue();
      if (bool) {
        CrashUtils.addDynamiteErrorToDropBox(paramContext, paramThrowable);
      }
      return;
    }
    catch (IllegalStateException paramContext)
    {
      for (;;) {}
    }
  }
  
  public static final String zzJ(InputStreamReader paramInputStreamReader)
    throws IOException
  {
    StringBuilder localStringBuilder = new StringBuilder(8192);
    char[] arrayOfChar = new char['ࠀ'];
    for (;;)
    {
      int i = paramInputStreamReader.read(arrayOfChar);
      if (i == -1) {
        break;
      }
      localStringBuilder.append(arrayOfChar, 0, i);
    }
    return localStringBuilder.toString();
  }
  
  public static final int zzK(String paramString)
  {
    try
    {
      int i = Integer.parseInt(paramString);
      return i;
    }
    catch (NumberFormatException paramString)
    {
      zzbzt.zzj("Could not parse value:".concat(paramString.toString()));
    }
    return 0;
  }
  
  public static final Map zzL(Uri paramUri)
  {
    if (paramUri == null) {
      return null;
    }
    HashMap localHashMap = new HashMap();
    Iterator localIterator = paramUri.getQueryParameterNames().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (!TextUtils.isEmpty(str)) {
        localHashMap.put(str, paramUri.getQueryParameter(str));
      }
    }
    return localHashMap;
  }
  
  public static final int[] zzM(Activity paramActivity)
  {
    paramActivity = paramActivity.getWindow();
    if (paramActivity != null)
    {
      paramActivity = paramActivity.findViewById(16908290);
      if (paramActivity != null) {
        return new int[] { paramActivity.getWidth(), paramActivity.getHeight() };
      }
    }
    return zzr();
  }
  
  public static final int[] zzN(Activity paramActivity)
  {
    Object localObject = paramActivity.getWindow();
    if (localObject != null)
    {
      View localView = ((Window)localObject).findViewById(16908290);
      if (localView != null)
      {
        localObject = new int[2];
        localObject[0] = localView.getTop();
        localObject[1] = localView.getBottom();
        break label46;
      }
    }
    localObject = zzr();
    label46:
    return new int[] { zzay.zzb().zzb(paramActivity, localObject[0]), zzay.zzb().zzb(paramActivity, localObject[1]) };
  }
  
  public static final boolean zzO(View paramView, PowerManager paramPowerManager, KeyguardManager paramKeyguardManager)
  {
    boolean bool2 = zzt.zzp().zzd;
    boolean bool1 = true;
    int i;
    if ((!bool2) && (paramKeyguardManager != null) && (paramKeyguardManager.inKeyguardRestrictedInputMode()) && (!zzl(paramView))) {
      i = 0;
    } else {
      i = 1;
    }
    long l = zzs(paramView);
    if ((paramView.getVisibility() == 0) && (paramView.isShown()) && ((paramPowerManager == null) || (paramPowerManager.isScreenOn())) && (i != 0))
    {
      paramPowerManager = zzbbk.zzbh;
      if ((!((Boolean)zzba.zzc().zzb(paramPowerManager)).booleanValue()) || (paramView.getLocalVisibleRect(new Rect())) || (paramView.getGlobalVisibleRect(new Rect())))
      {
        paramView = zzbbk.zzjg;
        if (!((Boolean)zzba.zzc().zzb(paramView)).booleanValue()) {
          break label182;
        }
        paramView = zzbbk.zzji;
        if (l >= ((Integer)zzba.zzc().zzb(paramView)).intValue()) {
          return true;
        }
      }
    }
    bool1 = false;
    label182:
    return bool1;
  }
  
  public static final void zzP(Context paramContext, Intent paramIntent)
  {
    zzbbc localzzbbc = zzbbk.zzjy;
    if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) {
      try
      {
        zzX(paramContext, paramIntent);
        return;
      }
      catch (SecurityException paramContext)
      {
        zzbzt.zzk("", paramContext);
        zzt.zzo().zzu(paramContext, "AdUtil.startActivityWithUnknownContext");
        return;
      }
    }
    zzX(paramContext, paramIntent);
  }
  
  public static final void zzQ(Context paramContext, Uri paramUri)
  {
    try
    {
      Intent localIntent = new android/content/Intent;
      localIntent.<init>("android.intent.action.VIEW", paramUri);
      Bundle localBundle = new android/os/Bundle;
      localBundle.<init>();
      localIntent.putExtras(localBundle);
      zzm(paramContext, localIntent);
      localBundle.putString("com.android.browser.application_id", paramContext.getPackageName());
      paramContext.startActivity(localIntent);
      paramUri = paramUri.toString();
      paramContext = new java/lang/StringBuilder;
      paramContext.<init>();
      paramContext.append("Opening ");
      paramContext.append(paramUri);
      paramContext.append(" in a new browser.");
      zzbzt.zze(paramContext.toString());
      return;
    }
    catch (ActivityNotFoundException paramContext)
    {
      zzbzt.zzh("No browser is found.", paramContext);
    }
  }
  
  public static final int[] zzR(Activity paramActivity)
  {
    int[] arrayOfInt = zzM(paramActivity);
    return new int[] { zzay.zzb().zzb(paramActivity, arrayOfInt[0]), zzay.zzb().zzb(paramActivity, arrayOfInt[1]) };
  }
  
  public static final boolean zzS(View paramView, Context paramContext)
  {
    Object localObject = paramContext.getApplicationContext();
    if (localObject != null) {
      localObject = (PowerManager)((Context)localObject).getSystemService("power");
    } else {
      localObject = null;
    }
    return zzO(paramView, (PowerManager)localObject, zzT(paramContext));
  }
  
  private static KeyguardManager zzT(Context paramContext)
  {
    paramContext = paramContext.getSystemService("keyguard");
    if ((paramContext != null) && ((paramContext instanceof KeyguardManager))) {
      return (KeyguardManager)paramContext;
    }
    return null;
  }
  
  private static Bundle zzU(Context paramContext)
  {
    try
    {
      paramContext = Wrappers.packageManager(paramContext).getApplicationInfo(paramContext.getPackageName(), 128).metaData;
      return paramContext;
    }
    catch (NullPointerException paramContext) {}catch (PackageManager.NameNotFoundException paramContext) {}
    zze.zzb("Error getting metadata", paramContext);
    return null;
  }
  
  private static String zzV(Bundle paramBundle)
  {
    if (paramBundle == null) {
      return "";
    }
    paramBundle = paramBundle.getString("com.google.android.gms.ads.APPLICATION_ID");
    if (TextUtils.isEmpty(paramBundle)) {
      return "";
    }
    if ((!paramBundle.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$")) && (!paramBundle.matches("^/\\d+~.+$"))) {
      return "";
    }
    return paramBundle;
  }
  
  private static boolean zzW(String paramString1, AtomicReference paramAtomicReference, String paramString2)
  {
    if (TextUtils.isEmpty(paramString1)) {
      return false;
    }
    try
    {
      Pattern localPattern2 = (Pattern)paramAtomicReference.get();
      Pattern localPattern1;
      if (localPattern2 != null)
      {
        localPattern1 = localPattern2;
        if (paramString2.equals(localPattern2.pattern())) {}
      }
      else
      {
        localPattern1 = Pattern.compile(paramString2);
        paramAtomicReference.set(localPattern1);
      }
      boolean bool = localPattern1.matcher(paramString1).matches();
      return bool;
    }
    catch (PatternSyntaxException paramString1) {}
    return false;
  }
  
  private static final void zzX(Context paramContext, Intent paramIntent)
  {
    try
    {
      paramContext.startActivity(paramIntent);
      return;
    }
    finally
    {
      paramIntent.addFlags(268435456);
      paramContext.startActivity(paramIntent);
    }
  }
  
  public static int zza(int paramInt)
  {
    if (paramInt >= 5000) {
      return paramInt;
    }
    if (paramInt > 0)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("HTTP timeout too low: ");
      localStringBuilder.append(paramInt);
      localStringBuilder.append(" milliseconds. Reverting to default timeout: 60000 milliseconds.");
      zzbzt.zzj(localStringBuilder.toString());
    }
    return 60000;
  }
  
  public static List zzd()
  {
    Object localObject1 = zzbbk.zza;
    Object localObject2 = zzba.zza().zzb();
    localObject1 = new ArrayList();
    localObject2 = ((List)localObject2).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      Object localObject3 = (String)((Iterator)localObject2).next();
      localObject3 = zzfpm.zzc(zzfok.zzc(',')).zzd((CharSequence)localObject3).iterator();
      while (((Iterator)localObject3).hasNext())
      {
        String str = (String)((Iterator)localObject3).next();
        try
        {
          ((List)localObject1).add(Long.valueOf(str));
        }
        catch (NumberFormatException localNumberFormatException)
        {
          zze.zza("Experiment ID is not a number");
        }
      }
    }
    return (List)localObject1;
  }
  
  public static final boolean zzl(View paramView)
  {
    paramView = paramView.getRootView();
    Object localObject = null;
    if (paramView == null) {}
    do
    {
      paramView = null;
      break;
      paramView = paramView.getContext();
    } while (!(paramView instanceof Activity));
    paramView = (Activity)paramView;
    if (paramView == null) {
      return false;
    }
    paramView = paramView.getWindow();
    if (paramView == null) {
      paramView = (View)localObject;
    } else {
      paramView = paramView.getAttributes();
    }
    return (paramView != null) && ((paramView.flags & 0x80000) != 0);
  }
  
  public static final void zzm(Context paramContext, Intent paramIntent)
  {
    if (paramIntent == null) {
      return;
    }
    Bundle localBundle;
    if (paramIntent.getExtras() != null) {
      localBundle = paramIntent.getExtras();
    } else {
      localBundle = new Bundle();
    }
    localBundle.putBinder("android.support.customtabs.extra.SESSION", null);
    localBundle.putString("com.android.browser.application_id", paramContext.getPackageName());
    paramIntent.putExtras(localBundle);
  }
  
  public static final String zzn(Context paramContext)
  {
    Context localContext = paramContext;
    if (paramContext.getApplicationContext() != null) {
      localContext = paramContext.getApplicationContext();
    }
    return zzV(zzU(localContext));
  }
  
  static final String zzo()
  {
    StringBuilder localStringBuilder = new StringBuilder(256);
    localStringBuilder.append("Mozilla/5.0 (Linux; U; Android");
    if (Build.VERSION.RELEASE != null)
    {
      localStringBuilder.append(" ");
      localStringBuilder.append(Build.VERSION.RELEASE);
    }
    localStringBuilder.append("; ");
    localStringBuilder.append(Locale.getDefault());
    if (Build.DEVICE != null)
    {
      localStringBuilder.append("; ");
      localStringBuilder.append(Build.DEVICE);
      if (Build.DISPLAY != null)
      {
        localStringBuilder.append(" Build/");
        localStringBuilder.append(Build.DISPLAY);
      }
    }
    localStringBuilder.append(") AppleWebKit/533 Version/4.0 Safari/533");
    return localStringBuilder.toString();
  }
  
  public static final String zzp()
  {
    String str2 = Build.MANUFACTURER;
    String str1 = Build.MODEL;
    if (str1.startsWith(str2)) {
      return str1;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(str2);
    localStringBuilder.append(" ");
    localStringBuilder.append(str1);
    return localStringBuilder.toString();
  }
  
  public static final DisplayMetrics zzq(WindowManager paramWindowManager)
  {
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    paramWindowManager.getDefaultDisplay().getMetrics(localDisplayMetrics);
    return localDisplayMetrics;
  }
  
  protected static final int[] zzr()
  {
    return new int[] { 0, 0 };
  }
  
  public static final long zzs(View paramView)
  {
    float f1 = Float.MAX_VALUE;
    float f3;
    float f2;
    do
    {
      boolean bool = paramView instanceof View;
      f3 = 0.0F;
      f2 = f1;
      if (!bool) {
        break;
      }
      paramView = (View)paramView;
      f2 = Math.min(f1, paramView.getAlpha());
      paramView = paramView.getParent();
      f1 = f2;
    } while (f2 > 0.0F);
    if (f2 < 0.0F) {
      f2 = f3;
    }
    return Math.round(f2 * 100.0F);
  }
  
  public static final WebResourceResponse zzt(Context paramContext, String paramString1, String paramString2)
  {
    try
    {
      HashMap localHashMap = new java/util/HashMap;
      localHashMap.<init>();
      localHashMap.put("User-Agent", zzt.zzp().zzc(paramContext, paramString1));
      localHashMap.put("Cache-Control", "max-stale=3600");
      paramString1 = new com/google/android/gms/ads/internal/util/zzbo;
      paramString1.<init>(paramContext);
      paramContext = (String)paramString1.zzb(0, paramString2, localHashMap, null).get(60L, TimeUnit.SECONDS);
      if (paramContext == null) {
        break label127;
      }
      paramString1 = new java/io/ByteArrayInputStream;
      paramString1.<init>(paramContext.getBytes("UTF-8"));
      paramContext = new WebResourceResponse("application/javascript", "UTF-8", paramString1);
      return paramContext;
    }
    catch (TimeoutException paramContext) {}catch (InterruptedException paramContext) {}catch (ExecutionException paramContext) {}catch (IOException paramContext) {}
    zzbzt.zzk("Could not fetch MRAID JS.", paramContext);
    label127:
    return null;
  }
  
  public static final String zzu()
  {
    Object localObject = zzt.zzo().zzd();
    if (localObject != null) {
      localObject = ((Resources)localObject).getString(R.string.s7);
    } else {
      localObject = "Test Ad";
    }
    return (String)localObject;
  }
  
  public static final zzbr zzv(Context paramContext)
  {
    IInterface localIInterface = null;
    try
    {
      paramContext = paramContext.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
      if (!(paramContext instanceof IBinder))
      {
        zzbzt.zzg("Instantiated WorkManagerUtil not instance of IBinder.");
        return null;
      }
      paramContext = (IBinder)paramContext;
      if (paramContext == null)
      {
        paramContext = localIInterface;
      }
      else
      {
        localIInterface = paramContext.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
        if ((localIInterface instanceof zzbr)) {
          paramContext = (zzbr)localIInterface;
        } else {
          paramContext = new zzbp(paramContext);
        }
      }
      return paramContext;
    }
    catch (Exception paramContext)
    {
      zzt.zzo().zzu(paramContext, "Failed to instantiate WorkManagerUtil");
    }
    return null;
  }
  
  public static final boolean zzw(Context paramContext, String paramString)
  {
    paramContext = zzbuu.zza(paramContext);
    String str = paramContext.getPackageName();
    return Wrappers.packageManager(paramContext).checkPermission(paramString, str) == 0;
  }
  
  public static final boolean zzx(Context paramContext)
  {
    boolean bool;
    try
    {
      bool = DeviceProperties.isBstar(paramContext);
    }
    catch (NoSuchMethodError paramContext)
    {
      bool = false;
    }
    return bool;
  }
  
  public static final boolean zzy(String paramString)
  {
    if (!zzbzs.zzk()) {
      return false;
    }
    Object localObject = zzbbk.zzeG;
    if (!((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue()) {
      return false;
    }
    localObject = zzbbk.zzeI;
    localObject = (String)zzba.zzc().zzb((zzbbc)localObject);
    if (!((String)localObject).isEmpty())
    {
      localObject = ((String)localObject).split(";");
      j = localObject.length;
      for (i = 0; i < j; i++) {
        if (localObject[i].equals(paramString)) {
          return false;
        }
      }
    }
    localObject = zzbbk.zzeH;
    localObject = (String)zzba.zzc().zzb((zzbbc)localObject);
    if (((String)localObject).isEmpty()) {
      return true;
    }
    localObject = ((String)localObject).split(";");
    int j = localObject.length;
    for (int i = 0; i < j; i++) {
      if (localObject[i].equals(paramString)) {
        return true;
      }
    }
    return false;
  }
  
  public static final boolean zzz(Context paramContext)
  {
    if (paramContext == null) {
      return false;
    }
    paramContext = zzT(paramContext);
    return (paramContext != null) && (paramContext.isKeyguardLocked());
  }
  
  public final zzfwb zzb(Uri paramUri)
  {
    return zzfvr.zzj(new zzl(paramUri), this.zzi);
  }
  
  public final String zzc(Context paramContext, String paramString)
  {
    synchronized (this.zze)
    {
      Object localObject1 = this.zzf;
      if (localObject1 != null) {
        return (String)localObject1;
      }
      if (paramString == null)
      {
        paramContext = zzo();
        return paramContext;
      }
      try
      {
        localObject3 = zzce.zza();
        if (TextUtils.isEmpty(((zzce)localObject3).zza))
        {
          if (ClientLibraryUtils.isPackageSide())
          {
            localObject1 = new com/google/android/gms/ads/internal/util/zzcc;
            ((zzcc)localObject1).<init>(paramContext);
            localObject1 = (String)zzcb.zza(paramContext, (Callable)localObject1);
          }
          else
          {
            localObject1 = GooglePlayServicesUtilLight.getRemoteContext(paramContext);
            zzcd localzzcd = new com/google/android/gms/ads/internal/util/zzcd;
            localzzcd.<init>((Context)localObject1, paramContext);
            localObject1 = (String)zzcb.zza(paramContext, localzzcd);
          }
          ((zzce)localObject3).zza = ((String)localObject1);
        }
        this.zzf = ((zzce)localObject3).zza;
      }
      catch (Exception localException)
      {
        Object localObject3;
        for (;;) {}
      }
      if (TextUtils.isEmpty(this.zzf)) {
        this.zzf = WebSettings.getDefaultUserAgent(paramContext);
      }
      if (TextUtils.isEmpty(this.zzf)) {
        this.zzf = zzo();
      }
      localObject3 = this.zzf;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      ((StringBuilder)localObject1).append((String)localObject3);
      ((StringBuilder)localObject1).append(" (Mobile; ");
      ((StringBuilder)localObject1).append(paramString);
      this.zzf = ((StringBuilder)localObject1).toString();
      try
      {
        if (Wrappers.packageManager(paramContext).isCallerInstantApp())
        {
          paramString = this.zzf;
          paramContext = new java/lang/StringBuilder;
          paramContext.<init>();
          paramContext.append(paramString);
          paramContext.append(";aia");
          this.zzf = paramContext.toString();
        }
      }
      catch (Exception paramContext)
      {
        zzt.zzo().zzu(paramContext, "AdUtil.getUserAgent");
      }
      paramString = this.zzf;
      paramContext = new java/lang/StringBuilder;
      paramContext.<init>();
      paramContext.append(paramString);
      paramContext.append(")");
      paramContext = paramContext.toString();
      this.zzf = paramContext;
      return paramContext;
    }
  }
  
  public final void zzf(Context paramContext, String paramString, boolean paramBoolean1, HttpURLConnection paramHttpURLConnection, boolean paramBoolean2, int paramInt)
  {
    paramInt = zza(paramInt);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("HTTP timeout: ");
    localStringBuilder.append(paramInt);
    localStringBuilder.append(" milliseconds.");
    zzbzt.zzi(localStringBuilder.toString());
    paramHttpURLConnection.setConnectTimeout(paramInt);
    paramHttpURLConnection.setInstanceFollowRedirects(false);
    paramHttpURLConnection.setReadTimeout(paramInt);
    if (TextUtils.isEmpty(paramHttpURLConnection.getRequestProperty("User-Agent"))) {
      paramHttpURLConnection.setRequestProperty("User-Agent", zzc(paramContext, paramString));
    }
    paramHttpURLConnection.setUseCaches(false);
  }
  
  public final boolean zzg(String paramString)
  {
    AtomicReference localAtomicReference = this.zzb;
    zzbbc localzzbbc = zzbbk.zzac;
    return zzW(paramString, localAtomicReference, (String)zzba.zzc().zzb(localzzbbc));
  }
  
  public final boolean zzh(String paramString)
  {
    AtomicReference localAtomicReference = this.zzc;
    zzbbc localzzbbc = zzbbk.zzad;
    return zzW(paramString, localAtomicReference, (String)zzba.zzc().zzb(localzzbbc));
  }
  
  public final boolean zzi(Context paramContext)
  {
    if (this.zzh) {
      return false;
    }
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
    zzbbk.zza(paramContext);
    zzbbc localzzbbc = zzbbk.zzjx;
    if ((((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) && (Build.VERSION.SDK_INT >= 33)) {
      paramContext.getApplicationContext().registerReceiver(new zzp(this, null), localIntentFilter, 4);
    } else {
      paramContext.getApplicationContext().registerReceiver(new zzp(this, null), localIntentFilter);
    }
    this.zzh = true;
    return true;
  }
  
  public final boolean zzj(Context paramContext)
  {
    if (this.zzg) {
      return false;
    }
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.intent.action.USER_PRESENT");
    localIntentFilter.addAction("android.intent.action.SCREEN_OFF");
    zzbbk.zza(paramContext);
    zzbbc localzzbbc = zzbbk.zzjx;
    if ((((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) && (Build.VERSION.SDK_INT >= 33)) {
      paramContext.getApplicationContext().registerReceiver(new zzr(this, null), localIntentFilter, 4);
    } else {
      paramContext.getApplicationContext().registerReceiver(new zzr(this, null), localIntentFilter);
    }
    this.zzg = true;
    return true;
  }
  
  public final int zzk(Context paramContext, Uri paramUri)
  {
    if (paramContext == null)
    {
      zze.zza("Trying to open chrome custom tab on a null context");
      return 3;
    }
    int i;
    if (!(paramContext instanceof Activity))
    {
      zze.zza("Chrome Custom Tabs can only work with Activity context.");
      i = 2;
    }
    else
    {
      i = 0;
    }
    Object localObject = zzbbk.zzem;
    Boolean localBoolean = (Boolean)zzba.zzc().zzb((zzbbc)localObject);
    localObject = zzbbk.zzen;
    if (true == localBoolean.equals(zzba.zzc().zzb((zzbbc)localObject))) {
      i = 9;
    }
    if (i != 0)
    {
      localObject = new Intent("android.intent.action.VIEW");
      ((Intent)localObject).setData(paramUri);
      ((Intent)localObject).addFlags(268435456);
      paramContext.startActivity((Intent)localObject);
      return i;
    }
    localObject = zzbbk.zzem;
    if (((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue())
    {
      localObject = new zzbcl();
      ((zzbcl)localObject).zze(new zzn(this, (zzbcl)localObject, paramContext, paramUri));
      ((zzbcl)localObject).zzb((Activity)paramContext);
    }
    localObject = zzbbk.zzen;
    if (((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue())
    {
      localObject = new CustomTabsIntent.Builder().build();
      ((CustomTabsIntent)localObject).intent.setPackage(zzgwc.zza(paramContext));
      ((CustomTabsIntent)localObject).launchUrl(paramContext, paramUri);
    }
    return 5;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\interna\\util\zzs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */