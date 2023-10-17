package com.google.android.gms.ads.interstitial;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbbc;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbcp;
import com.google.android.gms.internal.ads.zzbdb;
import com.google.android.gms.internal.ads.zzbla;
import com.google.android.gms.internal.ads.zzbzi;
import java.util.concurrent.ExecutorService;

public abstract class InterstitialAd
{
  public static void load(Context paramContext, String paramString, AdRequest paramAdRequest, InterstitialAdLoadCallback paramInterstitialAdLoadCallback)
  {
    Preconditions.checkNotNull(paramContext, "Context cannot be null.");
    Preconditions.checkNotNull(paramString, "AdUnitId cannot be null.");
    Preconditions.checkNotNull(paramAdRequest, "AdRequest cannot be null.");
    Preconditions.checkNotNull(paramInterstitialAdLoadCallback, "LoadCallback cannot be null.");
    Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
    zzbbk.zza(paramContext);
    if (((Boolean)zzbdb.zzi.zze()).booleanValue())
    {
      zzbbc localzzbbc = zzbbk.zzjG;
      if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue())
      {
        zzbzi.zzb.execute(new zza(paramContext, paramString, paramAdRequest, paramInterstitialAdLoadCallback));
        return;
      }
    }
    new zzbla(paramContext, paramString).zza(paramAdRequest.zza(), paramInterstitialAdLoadCallback);
  }
  
  public abstract String getAdUnitId();
  
  public abstract FullScreenContentCallback getFullScreenContentCallback();
  
  public abstract OnPaidEventListener getOnPaidEventListener();
  
  public abstract ResponseInfo getResponseInfo();
  
  public abstract void setFullScreenContentCallback(FullScreenContentCallback paramFullScreenContentCallback);
  
  public abstract void setImmersiveMode(boolean paramBoolean);
  
  public abstract void setOnPaidEventListener(OnPaidEventListener paramOnPaidEventListener);
  
  public abstract void show(Activity paramActivity);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\interstitial\InterstitialAd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */