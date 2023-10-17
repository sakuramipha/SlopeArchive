package com.google.unity.ads;

import com.google.android.gms.ads.LoadAdError;

public abstract interface UnityAdListener
  extends UnityPaidEventListener
{
  public abstract void onAdClicked();
  
  public abstract void onAdClosed();
  
  public abstract void onAdFailedToLoad(LoadAdError paramLoadAdError);
  
  public abstract void onAdImpression();
  
  public abstract void onAdLeftApplication();
  
  public abstract void onAdLoaded();
  
  public abstract void onAdOpened();
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\googl\\unity\ads\UnityAdListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */