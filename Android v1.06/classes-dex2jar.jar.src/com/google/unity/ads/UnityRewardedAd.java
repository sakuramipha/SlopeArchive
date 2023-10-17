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
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class UnityRewardedAd
{
  private Activity activity;
  private UnityRewardedAdCallback callback;
  private RewardedAd rewardedAd;
  
  public UnityRewardedAd(Activity paramActivity, UnityRewardedAdCallback paramUnityRewardedAdCallback)
  {
    this.activity = paramActivity;
    this.callback = paramUnityRewardedAdCallback;
  }
  
  public void destroy() {}
  
  public ResponseInfo getResponseInfo()
  {
    Object localObject = new FutureTask(new Callable()
    {
      public ResponseInfo call()
      {
        return UnityRewardedAd.-$$Nest$fgetrewardedAd(UnityRewardedAd.this).getResponseInfo();
      }
    });
    this.activity.runOnUiThread((Runnable)localObject);
    try
    {
      localObject = (ResponseInfo)((FutureTask)localObject).get();
    }
    catch (ExecutionException localExecutionException)
    {
      Log.e("AdsUnity", String.format("Unable to check unity rewarded ad response info: %s", new Object[] { localExecutionException.getLocalizedMessage() }));
    }
    catch (InterruptedException localInterruptedException)
    {
      Log.e("AdsUnity", String.format("Unable to check unity rewarded ad response info: %s", new Object[] { localInterruptedException.getLocalizedMessage() }));
    }
    ResponseInfo localResponseInfo = null;
    return localResponseInfo;
  }
  
  public RewardItem getRewardItem()
  {
    Object localObject2 = this.rewardedAd;
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
        return UnityRewardedAd.-$$Nest$fgetrewardedAd(UnityRewardedAd.this).getRewardItem();
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
      final UnityRewardedAd this$0;
      
      public void run()
      {
        RewardedAd.load(UnityRewardedAd.-$$Nest$fgetactivity(this.this$0), paramString, paramAdRequest, new RewardedAdLoadCallback()
        {
          public void onAdFailedToLoad(final LoadAdError paramAnonymous2LoadAdError)
          {
            new Thread(new Runnable()
            {
              final UnityRewardedAd.1.1 this$2;
              
              public void run()
              {
                if (UnityRewardedAd.-$$Nest$fgetcallback(this.this$2.this$1.this$0) != null) {
                  UnityRewardedAd.-$$Nest$fgetcallback(this.this$2.this$1.this$0).onRewardedAdFailedToLoad(paramAnonymous2LoadAdError);
                }
              }
            }).start();
          }
          
          public void onAdLoaded(RewardedAd paramAnonymous2RewardedAd)
          {
            UnityRewardedAd.-$$Nest$fputrewardedAd(UnityRewardedAd.1.this.this$0, paramAnonymous2RewardedAd);
            UnityRewardedAd.-$$Nest$fgetrewardedAd(UnityRewardedAd.1.this.this$0).setOnPaidEventListener(new OnPaidEventListener()
            {
              public void onPaidEvent(final AdValue paramAnonymous3AdValue)
              {
                new Thread(new Runnable()
                {
                  final UnityRewardedAd.1.1.1 this$3;
                  
                  public void run()
                  {
                    if (UnityRewardedAd.-$$Nest$fgetcallback(this.this$3.this$2.this$1.this$0) != null) {
                      UnityRewardedAd.-$$Nest$fgetcallback(this.this$3.this$2.this$1.this$0).onPaidEvent(paramAnonymous3AdValue.getPrecisionType(), paramAnonymous3AdValue.getValueMicros(), paramAnonymous3AdValue.getCurrencyCode());
                    }
                  }
                }).start();
              }
            });
            UnityRewardedAd.-$$Nest$fgetrewardedAd(UnityRewardedAd.1.this.this$0).setFullScreenContentCallback(new FullScreenContentCallback()
            {
              public void onAdClicked()
              {
                new Thread(new Runnable()
                {
                  public void run()
                  {
                    if (UnityRewardedAd.-$$Nest$fgetcallback(UnityRewardedAd.1.this.this$0) != null) {
                      UnityRewardedAd.-$$Nest$fgetcallback(UnityRewardedAd.1.this.this$0).onAdClicked();
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
                    if (UnityRewardedAd.-$$Nest$fgetcallback(UnityRewardedAd.1.this.this$0) != null) {
                      UnityRewardedAd.-$$Nest$fgetcallback(UnityRewardedAd.1.this.this$0).onAdDismissedFullScreenContent();
                    }
                  }
                }).start();
              }
              
              public void onAdFailedToShowFullScreenContent(final AdError paramAnonymous3AdError)
              {
                new Thread(new Runnable()
                {
                  final UnityRewardedAd.1.1.2 this$3;
                  
                  public void run()
                  {
                    if (UnityRewardedAd.-$$Nest$fgetcallback(this.this$3.this$2.this$1.this$0) != null) {
                      UnityRewardedAd.-$$Nest$fgetcallback(this.this$3.this$2.this$1.this$0).onAdFailedToShowFullScreenContent(paramAnonymous3AdError);
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
                    if (UnityRewardedAd.-$$Nest$fgetcallback(UnityRewardedAd.1.this.this$0) != null) {
                      UnityRewardedAd.-$$Nest$fgetcallback(UnityRewardedAd.1.this.this$0).onAdImpression();
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
                    if (UnityRewardedAd.-$$Nest$fgetcallback(UnityRewardedAd.1.this.this$0) != null) {
                      UnityRewardedAd.-$$Nest$fgetcallback(UnityRewardedAd.1.this.this$0).onAdShowedFullScreenContent();
                    }
                  }
                }).start();
              }
            });
            new Thread(new Runnable()
            {
              public void run()
              {
                if (UnityRewardedAd.-$$Nest$fgetcallback(UnityRewardedAd.1.this.this$0) != null) {
                  UnityRewardedAd.-$$Nest$fgetcallback(UnityRewardedAd.1.this.this$0).onRewardedAdLoaded();
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
    if (this.rewardedAd == null)
    {
      Log.e("AdsUnity", "Tried set server side verification before it was ready. This should in theory never happen. If it does, please contact the plugin owners.");
      return;
    }
    this.activity.runOnUiThread(new Runnable()
    {
      final UnityRewardedAd this$0;
      
      public void run()
      {
        UnityRewardedAd.-$$Nest$fgetrewardedAd(this.this$0).setServerSideVerificationOptions(paramServerSideVerificationOptions);
      }
    });
  }
  
  public void show()
  {
    if (this.rewardedAd == null)
    {
      Log.e("AdsUnity", "Tried to show rewarded ad before it was ready. This should in theory never happen. If it does, please contact the plugin owners.");
      return;
    }
    this.activity.runOnUiThread(new Runnable()
    {
      public void run()
      {
        UnityRewardedAd.-$$Nest$fgetrewardedAd(UnityRewardedAd.this).show(UnityRewardedAd.-$$Nest$fgetactivity(UnityRewardedAd.this), new OnUserEarnedRewardListener()
        {
          public void onUserEarnedReward(final RewardItem paramAnonymous2RewardItem)
          {
            new Thread(new Runnable()
            {
              final UnityRewardedAd.2.1 this$2;
              
              public void run()
              {
                if (UnityRewardedAd.-$$Nest$fgetcallback(this.this$2.this$1.this$0) != null) {
                  UnityRewardedAd.-$$Nest$fgetcallback(this.this$2.this$1.this$0).onUserEarnedReward(paramAnonymous2RewardItem.getType(), paramAnonymous2RewardItem.getAmount());
                }
              }
            }).start();
          }
        });
      }
    });
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\googl\\unity\ads\UnityRewardedAd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */