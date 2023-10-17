package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.AdError;

public abstract interface MediationInterstitialAdCallback
  extends MediationAdCallback
{
  public abstract void onAdFailedToShow(AdError paramAdError);
  
  @Deprecated
  public abstract void onAdFailedToShow(String paramString);
  
  public abstract void onAdLeftApplication();
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\mediation\MediationInterstitialAdCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */