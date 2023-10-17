package com.google.unity.ads;

import android.app.Activity;
import android.util.Log;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class UnityRewardedInterstitialAd
{
  private Activity activity;
  private UnityRewardedInterstitialAdCallback callback;
  private RewardedInterstitialAd rewardedInterstitialAd;
  
  public UnityRewardedInterstitialAd(Activity paramActivity, UnityRewardedInterstitialAdCallback paramUnityRewardedInterstitialAdCallback)
  {
    this.activity = paramActivity;
    this.callback = paramUnityRewardedInterstitialAdCallback;
  }
  
  public void destroy() {}
  
  public ResponseInfo getResponseInfo()
  {
    Object localObject2 = this.rewardedInterstitialAd;
    Object localObject1 = null;
    if (localObject2 == null) {
      return null;
    }
    localObject2 = new FutureTask(new Callable()
    {
      public ResponseInfo call()
      {
        return UnityRewardedInterstitialAd.-$$Nest$fgetrewardedInterstitialAd(UnityRewardedInterstitialAd.this).getResponseInfo();
      }
    });
    this.activity.runOnUiThread((Runnable)localObject2);
    try
    {
      localObject2 = (ResponseInfo)((FutureTask)localObject2).get();
      localObject1 = localObject2;
    }
    catch (ExecutionException localExecutionException)
    {
      Log.e("AdsUnity", String.format("Unable to check unity rewarded interstitial ad response info: %s", new Object[] { localExecutionException.getLocalizedMessage() }));
    }
    catch (InterruptedException localInterruptedException)
    {
      Log.e("AdsUnity", String.format("Unable to check unity rewarded interstitial ad response info: %s", new Object[] { localInterruptedException.getLocalizedMessage() }));
    }
    return (ResponseInfo)localObject1;
  }
  
  public RewardItem getRewardItem()
  {
    Object localObject2 = this.rewardedInterstitialAd;
    Object localObject1 = null;
    if (localObject2 == null)
    {
      Log.e("AdsUnity", "Tried to get reward item before it was ready. This should in theory never happen. If it does, please contact the plugin owners.");
      return null;
    }
    localObject2 = new FutureTask(new Callable()
    {
      public RewardItem call()
      {
        return UnityRewardedInterstitialAd.-$$Nest$fgetrewardedInterstitialAd(UnityRewardedInterstitialAd.this).getRewardItem();
      }
    });
    this.activity.runOnUiThread((Runnable)localObject2);
    try
    {
      localObject2 = (RewardItem)((FutureTask)localObject2).get();
      localObject1 = localObject2;
    }
    catch (ExecutionException localExecutionException)
    {
      Log.e("AdsUnity", String.format("Unable to get reward item: %s", new Object[] { localExecutionException.getLocalizedMessage() }));
    }
    catch (InterruptedException localInterruptedException)
    {
      Log.e("AdsUnity", String.format("Unable to get reward item: %s", new Object[] { localInterruptedException.getLocalizedMessage() }));
    }
    return (RewardItem)localObject1;
  }
  
  public void loadAd(final String paramString, final AdRequest paramAdRequest)
  {
    this.activity.runOnUiThread(new Runnable()
    {
      final UnityRewardedInterstitialAd this$0;
      
      public void run()
      {
        RewardedInterstitialAd.load(UnityRewardedInterstitialAd.-$$Nest$fgetactivity(this.this$0), paramString, paramAdRequest, new RewardedInterstitialAdLoadCallback()
        {
          public void onAdFailedToLoad(final LoadAdError paramAnonymous2LoadAdError)
          {
            new Thread(new Runnable()
            {
              final UnityRewardedInterstitialAd.1.1 this$2;
              
              public void run()
              {
                if (UnityRewardedInterstitialAd.-$$Nest$fgetcallback(this.this$2.this$1.this$0) != null) {
                  UnityRewardedInterstitialAd.-$$Nest$fgetcallback(this.this$2.this$1.this$0).onRewardedInterstitialAdFailedToLoad(paramAnonymous2LoadAdError);
                }
              }
            }).start();
          }
          
          public void onAdLoaded(RewardedInterstitialAd paramAnonymous2RewardedInterstitialAd)
          {
            UnityRewardedInterstitialAd.-$$Nest$fputrewardedInterstitialAd(UnityRewardedInterstitialAd.1.this.this$0, paramAnonymous2RewardedInterstitialAd);
            UnityRewardedInterstitialAd.-$$Nest$fgetrewardedInterstitialAd(UnityRewardedInterstitialAd.1.this.this$0).setOnPaidEventListener(new OnPaidEventListener()
            {
              public void onPaidEvent(final AdValue paramAnonymous3AdValue)
              {
                new Thread(new Runnable()
                {
                  final UnityRewardedInterstitialAd.1.1.1 this$3;
                  
                  public void run()
                  {
                    if (UnityRewardedInterstitialAd.-$$Nest$fgetcallback(this.this$3.this$2.this$1.this$0) != null) {
                      UnityRewardedInterstitialAd.-$$Nest$fgetcallback(this.this$3.this$2.this$1.this$0).onPaidEvent(paramAnonymous3AdValue.getPrecisionType(), paramAnonymous3AdValue.getValueMicros(), paramAnonymous3AdValue.getCurrencyCode());
                    }
                  }
                }).start();
              }
            });
            UnityRewardedInterstitialAd.-$$Nest$fgetrewardedInterstitialAd(UnityRewardedInterstitialAd.1.this.this$0).setFullScreenContentCallback(new FullScreenContentCallback()
            {
              public void onAdClicked()
              {
                new Thread(new Runnable()
                {
                  public void run()
                  {
                    if (UnityRewardedInterstitialAd.-$$Nest$fgetcallback(UnityRewardedInterstitialAd.1.this.this$0) != null) {
                      UnityRewardedInterstitialAd.-$$Nest$fgetcallback(UnityRewardedInterstitialAd.1.this.this$0).onAdClicked();
                    }
                  }
                }).start();
              }
              
              public void onAdDismissedFullScreenContent()
              {
                new Thread(new Runnable()
                {
                  public void run()
                  {
                    if (UnityRewardedInterstitialAd.-$$Nest$fgetcallback(UnityRewardedInterstitialAd.1.this.this$0) != null) {
                      UnityRewardedInterstitialAd.-$$Nest$fgetcallback(UnityRewardedInterstitialAd.1.this.this$0).onAdDismissedFullScreenContent();
                    }
                  }
                }).start();
              }
              
              public void onAdFailedToShowFullScreenContent(final AdError paramAnonymous3AdError)
              {
                new Thread(new Runnable()
                {
                  final UnityRewardedInterstitialAd.1.1.2 this$3;
                  
                  public void run()
                  {
                    if (UnityRewardedInterstitialAd.-$$Nest$fgetcallback(this.this$3.this$2.this$1.this$0) != null) {
                      UnityRewardedInterstitialAd.-$$Nest$fgetcallback(this.this$3.this$2.this$1.this$0).onAdFailedToShowFullScreenContent(paramAnonymous3AdError);
                    }
                  }
                }).start();
              }
              
              public void onAdImpression()
              {
                new Thread(new Runnable()
                {
                  public void run()
                  {
                    if (UnityRewardedInterstitialAd.-$$Nest$fgetcallback(UnityRewardedInterstitialAd.1.this.this$0) != null) {
                      UnityRewardedInterstitialAd.-$$Nest$fgetcallback(UnityRewardedInterstitialAd.1.this.this$0).onAdImpression();
                    }
                  }
                }).start();
              }
              
              public void onAdShowedFullScreenContent()
              {
                new Thread(new Runnable()
                {
                  public void run()
                  {
                    if (UnityRewardedInterstitialAd.-$$Nest$fgetcallback(UnityRewardedInterstitialAd.1.this.this$0) != null) {
                      UnityRewardedInterstitialAd.-$$Nest$fgetcallback(UnityRewardedInterstitialAd.1.this.this$0).onAdShowedFullScreenContent();
                    }
                  }
                }).start();
              }
            });
            new Thread(new Runnable()
            {
              public void run()
              {
                if (UnityRewardedInterstitialAd.-$$Nest$fgetcallback(UnityRewardedInterstitialAd.1.this.this$0) != null) {
                  UnityRewardedInterstitialAd.-$$Nest$fgetcallback(UnityRewardedInterstitialAd.1.this.this$0).onRewardedInterstitialAdLoaded();
                }
              }
            }).start();
          }
        });
      }
    });
  }
  
  public void setServerSideVerificationOptions(final ServerSideVerificationOptions paramServerSideVerificationOptions)
  {
    if (this.rewardedInterstitialAd == null)
    {
      Log.e("AdsUnity", "Tried set server side verification before it was ready. This should in theory never happen. If it does, please contact the plugin owners.");
      return;
    }
    this.activity.runOnUiThread(new Runnable()
    {
      final UnityRewardedInterstitialAd this$0;
      
      public void run()
      {
        UnityRewardedInterstitialAd.-$$Nest$fgetrewardedInterstitialAd(this.this$0).setServerSideVerificationOptions(paramServerSideVerificationOptions);
      }
    });
  }
  
  public void show()
  {
    if (this.rewardedInterstitialAd == null)
    {
      Log.e("AdsUnity", "Tried to show rewarded interstitial ad before it was ready. This should in theory never happen. If it does, please contact the plugin owners.");
      return;
    }
    this.activity.runOnUiThread(new Runnable()
    {
      public void run()
      {
        UnityRewardedInterstitialAd.-$$Nest$fgetrewardedInterstitialAd(UnityRewardedInterstitialAd.this).show(UnityRewardedInterstitialAd.-$$Nest$fgetactivity(UnityRewardedInterstitialAd.this), new OnUserEarnedRewardListener()
        {
          public void onUserEarnedReward(final RewardItem paramAnonymous2RewardItem)
          {
            new Thread(new Runnable()
            {
              final UnityRewardedInterstitialAd.2.1 this$2;
              
              public void run()
              {
                if (UnityRewardedInterstitialAd.-$$Nest$fgetcallback(this.this$2.this$1.this$0) != null) {
                  UnityRewardedInterstitialAd.-$$Nest$fgetcallback(this.this$2.this$1.this$0).onUserEarnedReward(paramAnonymous2RewardItem.getType(), paramAnonymous2RewardItem.getAmount());
                }
              }
            }).start();
          }
        });
      }
    });
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\googl\\unity\ads\UnityRewardedInterstitialAd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */