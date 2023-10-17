package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.internal.client.zzej;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbsm;
import com.google.android.gms.internal.ads.zzbyk;
import com.google.android.gms.internal.ads.zzbzt;

public class MobileAds
{
  public static final String ERROR_DOMAIN = "com.google.android.gms.ads";
  
  public static void disableMediationAdapterInitialization(Context paramContext)
  {
    zzej.zzf().zzl(paramContext);
  }
  
  public static void enableSameAppKey(boolean paramBoolean)
  {
    zzej.zzf().zzm(paramBoolean);
  }
  
  public static InitializationStatus getInitializationStatus()
  {
    return zzej.zzf().zze();
  }
  
  private static String getInternalVersion()
  {
    return zzej.zzf().zzh();
  }
  
  public static RequestConfiguration getRequestConfiguration()
  {
    return zzej.zzf().zzc();
  }
  
  public static VersionInfo getVersion()
  {
    zzej.zzf();
    String[] arrayOfString = TextUtils.split("22.2.0", "\\.");
    VersionInfo localVersionInfo1;
    VersionInfo localVersionInfo2;
    if (arrayOfString.length != 3) {
      localVersionInfo1 = new VersionInfo(0, 0, 0);
    } else {
      try
      {
        localVersionInfo1 = new com/google/android/gms/ads/VersionInfo;
        localVersionInfo1.<init>(Integer.parseInt(arrayOfString[0]), Integer.parseInt(arrayOfString[1]), Integer.parseInt(arrayOfString[2]));
      }
      catch (NumberFormatException localNumberFormatException)
      {
        localVersionInfo2 = new VersionInfo(0, 0, 0);
      }
    }
    return localVersionInfo2;
  }
  
  public static void initialize(Context paramContext)
  {
    zzej.zzf().zzn(paramContext, null, null);
  }
  
  public static void initialize(Context paramContext, OnInitializationCompleteListener paramOnInitializationCompleteListener)
  {
    zzej.zzf().zzn(paramContext, null, paramOnInitializationCompleteListener);
  }
  
  public static void openAdInspector(Context paramContext, OnAdInspectorClosedListener paramOnAdInspectorClosedListener)
  {
    zzej.zzf().zzq(paramContext, paramOnAdInspectorClosedListener);
  }
  
  public static void openDebugMenu(Context paramContext, String paramString)
  {
    zzej.zzf().zzr(paramContext, paramString);
  }
  
  public static void registerRtbAdapter(Class<? extends RtbAdapter> paramClass)
  {
    zzej.zzf().zzs(paramClass);
  }
  
  public static void registerWebView(WebView paramWebView)
  {
    zzej.zzf();
    Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
    if (paramWebView == null)
    {
      zzbzt.zzg("The webview to be registered cannot be null.");
      return;
    }
    zzbyk localzzbyk = zzbsm.zza(paramWebView.getContext());
    if (localzzbyk == null)
    {
      zzbzt.zzj("Internal error, query info generator is null.");
      return;
    }
    try
    {
      localzzbyk.zzi(ObjectWrapper.wrap(paramWebView));
      return;
    }
    catch (RemoteException paramWebView)
    {
      zzbzt.zzh("", paramWebView);
    }
  }
  
  public static void setAppMuted(boolean paramBoolean)
  {
    zzej.zzf().zzt(paramBoolean);
  }
  
  public static void setAppVolume(float paramFloat)
  {
    zzej.zzf().zzu(paramFloat);
  }
  
  private static void setPlugin(String paramString)
  {
    zzej.zzf().zzv(paramString);
  }
  
  public static void setRequestConfiguration(RequestConfiguration paramRequestConfiguration)
  {
    zzej.zzf().zzw(paramRequestConfiguration);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\MobileAds.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */