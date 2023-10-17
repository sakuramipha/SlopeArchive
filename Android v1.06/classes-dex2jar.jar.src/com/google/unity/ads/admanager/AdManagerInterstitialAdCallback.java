package com.google.unity.ads.admanager;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAdLoadCallback;
import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AdManagerInterstitialAdCallback
  extends AdManagerInterstitialAdLoadCallback
{
  private AdManagerInterstitialAd adManagerInterstitialAd;
  private UnityAdManagerInterstitialAdCallback callback;
  
  AdManagerInterstitialAdCallback(AdManagerInterstitialAd paramAdManagerInterstitialAd, UnityAdManagerInterstitialAdCallback paramUnityAdManagerInterstitialAdCallback)
  {
    this.adManagerInterstitialAd = paramAdManagerInterstitialAd;
    this.callback = paramUnityAdManagerInterstitialAdCallback;
  }
  
  public void onAdLoaded(AdManagerInterstitialAd paramAdManagerInterstitialAd)
  {
    final ExecutorService localExecutorService = Executors.newSingleThreadExecutor();
    this.adManagerInterstitialAd = paramAdManagerInterstitialAd;
    paramAdManagerInterstitialAd.setOnPaidEventListener(new OnPaidEventListener()
    {
      final AdManagerInterstitialAdCallback this$0;
      
      public void onPaidEvent(AdValue paramAnonymousAdValue)
      {
        localExecutorService.execute(new AdManagerInterstitialAdCallback.1..ExternalSyntheticLambda0(this, paramAnonymousAdValue));
      }
    });
    this.adManagerInterstitialAd.setAppEventListener(new AppEventListener()
    {
      final AdManagerInterstitialAdCallback this$0;
      
      public void onAppEvent(String paramAnonymousString1, String paramAnonymousString2)
      {
        localExecutorService.execute(new AdManagerInterstitialAdCallback.2..ExternalSyntheticLambda0(this, paramAnonymousString1, paramAnonymousString2));
      }
    });
    this.adManagerInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback()
    {
      public void onAdClicked()
      {
        localExecutorService.execute(new AdManagerInterstitialAdCallback.3..ExternalSyntheticLambda0(this));
      }
      
      public void onAdDismissedFullScreenContent()
      {
        localExecutorService.execute(new AdManagerInterstitialAdCallback.3..ExternalSyntheticLambda1(this));
      }
      
      public void onAdFailedToShowFullScreenContent(AdError paramAnonymousAdError)
      {
        localExecutorService.execute(new AdManagerInterstitialAdCallback.3..ExternalSyntheticLambda4(this, paramAnonymousAdError));
      }
      
      public void onAdImpression()
      {
        localExecutorService.execute(new AdManagerInterstitialAdCallback.3..ExternalSyntheticLambda2(this));
      }
      
      public void onAdShowedFullScreenContent()
      {
        localExecutorService.execute(new AdManagerInterstitialAdCallback.3..ExternalSyntheticLambda3(this));
      }
    });
    localExecutorService.execute(new AdManagerInterstitialAdCallback..ExternalSyntheticLambda0(this));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\googl\\unity\ads\admanager\AdManagerInterstitialAdCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */