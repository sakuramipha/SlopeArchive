package com.google.unity.ads;

import com.google.android.gms.ads.AdError;

public abstract interface UnityFullScreenContentCallback
{
  public abstract void onAdClicked();
  
  public abstract void onAdDismissedFullScreenContent();
  
  public abstract void onAdFailedToShowFullScreenContent(AdError paramAdError);
  
  public abstract void onAdImpression();
  
  public abstract void onAdShowedFullScreenContent();
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\googl\\unity\ads\UnityFullScreenContentCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */