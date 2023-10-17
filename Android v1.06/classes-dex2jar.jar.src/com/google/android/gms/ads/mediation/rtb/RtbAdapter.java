package com.google.android.gms.ads.mediation.rtb;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public abstract class RtbAdapter
  extends Adapter
{
  public abstract void collectSignals(RtbSignalData paramRtbSignalData, SignalCallbacks paramSignalCallbacks);
  
  public void loadRtbAppOpenAd(MediationAppOpenAdConfiguration paramMediationAppOpenAdConfiguration, MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> paramMediationAdLoadCallback)
  {
    loadAppOpenAd(paramMediationAppOpenAdConfiguration, paramMediationAdLoadCallback);
  }
  
  public void loadRtbBannerAd(MediationBannerAdConfiguration paramMediationBannerAdConfiguration, MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> paramMediationAdLoadCallback)
  {
    loadBannerAd(paramMediationBannerAdConfiguration, paramMediationAdLoadCallback);
  }
  
  public void loadRtbInterscrollerAd(MediationBannerAdConfiguration paramMediationBannerAdConfiguration, MediationAdLoadCallback<MediationInterscrollerAd, MediationBannerAdCallback> paramMediationAdLoadCallback)
  {
    paramMediationAdLoadCallback.onFailure(new AdError(7, String.valueOf(getClass().getSimpleName()).concat(" does not support interscroller ads."), "com.google.android.gms.ads"));
  }
  
  public void loadRtbInterstitialAd(MediationInterstitialAdConfiguration paramMediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> paramMediationAdLoadCallback)
  {
    loadInterstitialAd(paramMediationInterstitialAdConfiguration, paramMediationAdLoadCallback);
  }
  
  public void loadRtbNativeAd(MediationNativeAdConfiguration paramMediationNativeAdConfiguration, MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> paramMediationAdLoadCallback)
  {
    loadNativeAd(paramMediationNativeAdConfiguration, paramMediationAdLoadCallback);
  }
  
  public void loadRtbRewardedAd(MediationRewardedAdConfiguration paramMediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> paramMediationAdLoadCallback)
  {
    loadRewardedAd(paramMediationRewardedAdConfiguration, paramMediationAdLoadCallback);
  }
  
  public void loadRtbRewardedInterstitialAd(MediationRewardedAdConfiguration paramMediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> paramMediationAdLoadCallback)
  {
    loadRewardedInterstitialAd(paramMediationRewardedAdConfiguration, paramMediationAdLoadCallback);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\mediation\rtb\RtbAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */