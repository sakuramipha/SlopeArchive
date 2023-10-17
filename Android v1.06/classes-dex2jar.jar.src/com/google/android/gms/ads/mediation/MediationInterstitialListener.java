package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.AdError;

@Deprecated
public abstract interface MediationInterstitialListener
{
  public abstract void onAdClicked(MediationInterstitialAdapter paramMediationInterstitialAdapter);
  
  public abstract void onAdClosed(MediationInterstitialAdapter paramMediationInterstitialAdapter);
  
  @Deprecated
  public abstract void onAdFailedToLoad(MediationInterstitialAdapter paramMediationInterstitialAdapter, int paramInt);
  
  public abstract void onAdFailedToLoad(MediationInterstitialAdapter paramMediationInterstitialAdapter, AdError paramAdError);
  
  public abstract void onAdLeftApplication(MediationInterstitialAdapter paramMediationInterstitialAdapter);
  
  public abstract void onAdLoaded(MediationInterstitialAdapter paramMediationInterstitialAdapter);
  
  public abstract void onAdOpened(MediationInterstitialAdapter paramMediationInterstitialAdapter);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\mediation\MediationInterstitialListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */