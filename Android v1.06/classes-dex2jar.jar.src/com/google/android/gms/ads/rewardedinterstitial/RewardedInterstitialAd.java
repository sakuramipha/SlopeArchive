package com.google.android.gms.ads.rewardedinterstitial;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbbc;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbcp;
import com.google.android.gms.internal.ads.zzbdb;
import com.google.android.gms.internal.ads.zzbwj;
import com.google.android.gms.internal.ads.zzbzi;
import java.util.concurrent.ExecutorService;

public abstract class RewardedInterstitialAd
{
  public static void load(Context paramContext, String paramString, AdRequest paramAdRequest, RewardedInterstitialAdLoadCallback paramRewardedInterstitialAdLoadCallback)
  {
    Preconditions.checkNotNull(paramContext, "Context cannot be null.");
    Preconditions.checkNotNull(paramString, "AdUnitId cannot be null.");
    Preconditions.checkNotNull(paramAdRequest, "AdRequest cannot be null.");
    Preconditions.checkNotNull(paramRewardedInterstitialAdLoadCallback, "LoadCallback cannot be null.");
    Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
    zzbbk.zza(paramContext);
    if (((Boolean)zzbdb.zzl.zze()).booleanValue())
    {
      zzbbc localzzbbc = zzbbk.zzjG;
      if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue())
      {
        zzbzi.zzb.execute(new zza(paramContext, paramString, paramAdRequest, paramRewardedInterstitialAdLoadCallback));
        return;
      }
    }
    new zzbwj(paramContext, paramString).zza(paramAdRequest.zza(), paramRewardedInterstitialAdLoadCallback);
  }
  
  public static void load(Context paramContext, String paramString, AdManagerAdRequest paramAdManagerAdRequest, RewardedInterstitialAdLoadCallback paramRewardedInterstitialAdLoadCallback)
  {
    Preconditions.checkNotNull(paramContext, "Context cannot be null.");
    Preconditions.checkNotNull(paramString, "AdUnitId cannot be null.");
    Preconditions.checkNotNull(paramAdManagerAdRequest, "AdManagerAdRequest cannot be null.");
    Preconditions.checkNotNull(paramRewardedInterstitialAdLoadCallback, "LoadCallback cannot be null.");
    Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
    zzbbk.zza(paramContext);
    if (((Boolean)zzbdb.zzl.zze()).booleanValue())
    {
      zzbbc localzzbbc = zzbbk.zzjG;
      if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue())
      {
        zzbzi.zzb.execute(new zzb(paramContext, paramString, paramAdManagerAdRequest, paramRewardedInterstitialAdLoadCallback));
        return;
      }
    }
    new zzbwj(paramContext, paramString).zza(paramAdManagerAdRequest.zza(), paramRewardedInterstitialAdLoadCallback);
  }
  
  public abstract Bundle getAdMetadata();
  
  public abstract String getAdUnitId();
  
  public abstract FullScreenContentCallback getFullScreenContentCallback();
  
  public abstract OnAdMetadataChangedListener getOnAdMetadataChangedListener();
  
  public abstract OnPaidEventListener getOnPaidEventListener();
  
  public abstract ResponseInfo getResponseInfo();
  
  public abstract RewardItem getRewardItem();
  
  public abstract void setFullScreenContentCallback(FullScreenContentCallback paramFullScreenContentCallback);
  
  public abstract void setImmersiveMode(boolean paramBoolean);
  
  public abstract void setOnAdMetadataChangedListener(OnAdMetadataChangedListener paramOnAdMetadataChangedListener);
  
  public abstract void setOnPaidEventListener(OnPaidEventListener paramOnPaidEventListener);
  
  public abstract void setServerSideVerificationOptions(ServerSideVerificationOptions paramServerSideVerificationOptions);
  
  public abstract void show(Activity paramActivity, OnUserEarnedRewardListener paramOnUserEarnedRewardListener);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\rewardedinterstitial\RewardedInterstitialAd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */