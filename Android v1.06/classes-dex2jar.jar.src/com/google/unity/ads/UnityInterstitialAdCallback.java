package com.google.unity.ads;

import com.google.android.gms.ads.LoadAdError;

public abstract interface UnityInterstitialAdCallback
  extends UnityPaidEventListener, UnityFullScreenContentCallback
{
  public abstract void onInterstitialAdFailedToLoad(LoadAdError paramLoadAdError);
  
  public abstract void onInterstitialAdLoaded();
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\googl\\unity\ads\UnityInterstitialAdCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */