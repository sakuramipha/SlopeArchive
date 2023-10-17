package com.google.android.gms.ads.mediation;

import android.content.Context;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.VersionInfo;
import java.util.List;

public abstract class Adapter
  implements MediationExtrasReceiver
{
  public abstract VersionInfo getSDKVersionInfo();
  
  public abstract VersionInfo getVersionInfo();
  
  public abstract void initialize(Context paramContext, InitializationCompleteCallback paramInitializationCompleteCallback, List<MediationConfiguration> paramList);
  
  public void loadAppOpenAd(MediationAppOpenAdConfiguration paramMediationAppOpenAdConfiguration, MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> paramMediationAdLoadCallback)
  {
    paramMediationAdLoadCallback.onFailure(new AdError(7, String.valueOf(getClass().getSimpleName()).concat(" does not support app open ads."), "com.google.android.gms.ads"));
  }
  
  public void loadBannerAd(MediationBannerAdConfiguration paramMediationBannerAdConfiguration, MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> paramMediationAdLoadCallback)
  {
    paramMediationAdLoadCallback.onFailure(new AdError(7, String.valueOf(getClass().getSimpleName()).concat(" does not support banner ads."), "com.google.android.gms.ads"));
  }
  
  public void loadInterscrollerAd(MediationBannerAdConfiguration paramMediationBannerAdConfiguration, MediationAdLoadCallback<MediationInterscrollerAd, MediationBannerAdCallback> paramMediationAdLoadCallback)
  {
    paramMediationAdLoadCallback.onFailure(new AdError(7, String.valueOf(getClass().getSimpleName()).concat(" does not support interscroller ads."), "com.google.android.gms.ads"));
  }
  
  public void loadInterstitialAd(MediationInterstitialAdConfiguration paramMediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> paramMediationAdLoadCallback)
  {
    paramMediationAdLoadCallback.onFailure(new AdError(7, String.valueOf(getClass().getSimpleName()).concat(" does not support interstitial ads."), "com.google.android.gms.ads"));
  }
  
  public void loadNativeAd(MediationNativeAdConfiguration paramMediationNativeAdConfiguration, MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> paramMediationAdLoadCallback)
  {
    paramMediationAdLoadCallback.onFailure(new AdError(7, String.valueOf(getClass().getSimpleName()).concat(" does not support native ads."), "com.google.android.gms.ads"));
  }
  
  public void loadRewardedAd(MediationRewardedAdConfiguration paramMediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> paramMediationAdLoadCallback)
  {
    paramMediationAdLoadCallback.onFailure(new AdError(7, String.valueOf(getClass().getSimpleName()).concat(" does not support rewarded ads."), "com.google.android.gms.ads"));
  }
  
  public void loadRewardedInterstitialAd(MediationRewardedAdConfiguration paramMediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> paramMediationAdLoadCallback)
  {
    paramMediationAdLoadCallback.onFailure(new AdError(7, String.valueOf(getClass().getSimpleName()).concat(" does not support rewarded interstitial ads."), "com.google.android.gms.ads"));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\mediation\Adapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */