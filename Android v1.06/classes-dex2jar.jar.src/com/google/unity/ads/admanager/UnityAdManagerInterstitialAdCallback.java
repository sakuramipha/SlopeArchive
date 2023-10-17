package com.google.unity.ads.admanager;

import com.google.unity.ads.UnityFullScreenContentCallback;
import com.google.unity.ads.UnityInterstitialAdCallback;
import com.google.unity.ads.UnityPaidEventListener;

public abstract interface UnityAdManagerInterstitialAdCallback
  extends UnityInterstitialAdCallback, UnityPaidEventListener, UnityFullScreenContentCallback
{
  public abstract void onAppEvent(String paramString1, String paramString2);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\googl\\unity\ads\admanager\UnityAdManagerInterstitialAdCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */