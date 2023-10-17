package com.google.android.gms.ads.appopen;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdLoadCallback;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzavz;
import com.google.android.gms.internal.ads.zzbbc;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbcp;
import com.google.android.gms.internal.ads.zzbdb;
import com.google.android.gms.internal.ads.zzbzi;
import java.lang.annotation.Annotation;
import java.util.concurrent.ExecutorService;

public abstract class AppOpenAd
{
  public static final int APP_OPEN_AD_ORIENTATION_LANDSCAPE = 2;
  public static final int APP_OPEN_AD_ORIENTATION_PORTRAIT = 1;
  
  @Deprecated
  public static void load(Context paramContext, String paramString, AdRequest paramAdRequest, int paramInt, AppOpenAdLoadCallback paramAppOpenAdLoadCallback)
  {
    Preconditions.checkNotNull(paramContext, "Context cannot be null.");
    Preconditions.checkNotNull(paramString, "adUnitId cannot be null.");
    Preconditions.checkNotNull(paramAdRequest, "AdRequest cannot be null.");
    Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
    zzbbk.zza(paramContext);
    if (((Boolean)zzbdb.zzd.zze()).booleanValue())
    {
      zzbbc localzzbbc = zzbbk.zzjG;
      if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue())
      {
        zzbzi.zzb.execute(new zzc(paramContext, paramString, paramAdRequest, paramInt, paramAppOpenAdLoadCallback));
        return;
      }
    }
    new zzavz(paramContext, paramString, paramAdRequest.zza(), paramInt, paramAppOpenAdLoadCallback).zza();
  }
  
  public static void load(Context paramContext, String paramString, AdRequest paramAdRequest, AppOpenAdLoadCallback paramAppOpenAdLoadCallback)
  {
    Preconditions.checkNotNull(paramContext, "Context cannot be null.");
    Preconditions.checkNotNull(paramString, "adUnitId cannot be null.");
    Preconditions.checkNotNull(paramAdRequest, "AdRequest cannot be null.");
    Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
    zzbbk.zza(paramContext);
    if (((Boolean)zzbdb.zzd.zze()).booleanValue())
    {
      zzbbc localzzbbc = zzbbk.zzjG;
      if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue())
      {
        zzbzi.zzb.execute(new zzb(paramContext, paramString, paramAdRequest, paramAppOpenAdLoadCallback));
        return;
      }
    }
    new zzavz(paramContext, paramString, paramAdRequest.zza(), 3, paramAppOpenAdLoadCallback).zza();
  }
  
  @Deprecated
  public static void load(Context paramContext, String paramString, AdManagerAdRequest paramAdManagerAdRequest, int paramInt, AppOpenAdLoadCallback paramAppOpenAdLoadCallback)
  {
    Preconditions.checkNotNull(paramContext, "Context cannot be null.");
    Preconditions.checkNotNull(paramString, "adUnitId cannot be null.");
    Preconditions.checkNotNull(paramAdManagerAdRequest, "AdManagerAdRequest cannot be null.");
    Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
    zzbbk.zza(paramContext);
    if (((Boolean)zzbdb.zzd.zze()).booleanValue())
    {
      zzbbc localzzbbc = zzbbk.zzjG;
      if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue())
      {
        zzbzi.zzb.execute(new zza(paramContext, paramString, paramAdManagerAdRequest, paramInt, paramAppOpenAdLoadCallback));
        return;
      }
    }
    new zzavz(paramContext, paramString, paramAdManagerAdRequest.zza(), paramInt, paramAppOpenAdLoadCallback).zza();
  }
  
  public abstract String getAdUnitId();
  
  public abstract FullScreenContentCallback getFullScreenContentCallback();
  
  public abstract OnPaidEventListener getOnPaidEventListener();
  
  public abstract ResponseInfo getResponseInfo();
  
  public abstract void setFullScreenContentCallback(FullScreenContentCallback paramFullScreenContentCallback);
  
  public abstract void setImmersiveMode(boolean paramBoolean);
  
  public abstract void setOnPaidEventListener(OnPaidEventListener paramOnPaidEventListener);
  
  public abstract void show(Activity paramActivity);
  
  public static abstract class AppOpenAdLoadCallback
    extends AdLoadCallback<AppOpenAd>
  {}
  
  public static @interface AppOpenAdOrientation {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\appopen\AppOpenAd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */