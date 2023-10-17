package com.google.unity.ads;

import com.google.android.gms.ads.LoadAdError;

public abstract interface UnityRewardedAdCallback
  extends UnityPaidEventListener, UnityFullScreenContentCallback
{
  public abstract void onRewardedAdFailedToLoad(LoadAdError paramLoadAdError);
  
  public abstract void onRewardedAdLoaded();
  
  public abstract void onUserEarnedReward(String paramString, float paramFloat);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\googl\\unity\ads\UnityRewardedAdCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */