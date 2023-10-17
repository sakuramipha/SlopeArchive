package com.google.unity.ads;

import com.google.android.gms.ads.LoadAdError;

public abstract interface UnityAppOpenAdCallback
  extends UnityFullScreenContentCallback, UnityPaidEventListener
{
  public abstract void onAppOpenAdFailedToLoad(LoadAdError paramLoadAdError);
  
  public abstract void onAppOpenAdLoaded();
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\googl\\unity\ads\UnityAppOpenAdCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */