package com.google.unity.ads;

import android.app.Activity;
import android.util.Log;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Interstitial
{
  private Activity activity;
  private UnityInterstitialAdCallback callback;
  private InterstitialAd interstitialAd;
  
  public Interstitial(Activity paramActivity, UnityInterstitialAdCallback paramUnityInterstitialAdCallback)
  {
    this.activity = paramActivity;
    this.callback = paramUnityInterstitialAdCallback;
  }
  
  public void destroy() {}
  
  public ResponseInfo getResponseInfo()
  {
    Object localObject = new FutureTask(new Callable()
    {
      public ResponseInfo call()
      {
        return Interstitial.-$$Nest$fgetinterstitialAd(Interstitial.this).getResponseInfo();
      }
    });
    this.activity.runOnUiThread((Runnable)localObject);
    try
    {
      localObject = (ResponseInfo)((FutureTask)localObject).get();
    }
    catch (ExecutionException localExecutionException)
    {
      Log.e("AdsUnity", String.format("Unable to check interstitial response info: %s", new Object[] { localExecutionException.getLocalizedMessage() }));
    }
    catch (InterruptedException localInterruptedException)
    {
      Log.e("AdsUnity", String.format("Unable to check interstitial response info: %s", new Object[] { localInterruptedException.getLocalizedMessage() }));
    }
    ResponseInfo localResponseInfo = null;
    return localResponseInfo;
  }
  
  public void loadAd(final String paramString, final AdRequest paramAdRequest)
  {
    this.activity.runOnUiThread(new Runnable()
    {
      final Interstitial this$0;
      
      public void run()
      {
        InterstitialAd.load(Interstitial.-$$Nest$fgetactivity(this.this$0), paramString, paramAdRequest, new InterstitialAdLoadCallback()
        {
          public void onAdFailedToLoad(final LoadAdError paramAnonymous2LoadAdError)
          {
            new Thread(new Runnable()
            {
              final Interstitial.1.1 this$2;
              
              public void run()
              {
                if (Interstitial.-$$Nest$fgetcallback(this.this$2.this$1.this$0) != null) {
                  Interstitial.-$$Nest$fgetcallback(this.this$2.this$1.this$0).onInterstitialAdFailedToLoad(paramAnonymous2LoadAdError);
                }
              }
            }).start();
          }
          
          public void onAdLoaded(InterstitialAd paramAnonymous2InterstitialAd)
          {
            Interstitial.-$$Nest$fputinterstitialAd(Interstitial.1.this.this$0, paramAnonymous2InterstitialAd);
            Interstitial.-$$Nest$fgetinterstitialAd(Interstitial.1.this.this$0).setOnPaidEventListener(new OnPaidEventListener()
            {
              public void onPaidEvent(final AdValue paramAnonymous3AdValue)
              {
                new Thread(new Runnable()
                {
                  final Interstitial.1.1.1 this$3;
                  
                  public void run()
                  {
                    if (Interstitial.-$$Nest$fgetcallback(this.this$3.this$2.this$1.this$0) != null) {
                      Interstitial.-$$Nest$fgetcallback(this.this$3.this$2.this$1.this$0).onPaidEvent(paramAnonymous3AdValue.getPrecisionType(), paramAnonymous3AdValue.getValueMicros(), paramAnonymous3AdValue.getCurrencyCode());
                    }
                  }
                }).start();
              }
            });
            Interstitial.-$$Nest$fgetinterstitialAd(Interstitial.1.this.this$0).setFullScreenContentCallback(new FullScreenContentCallback()
            {
              public void onAdClicked()
              {
                new Thread(new Runnable()
                {
                  public void run()
                  {
                    if (Interstitial.-$$Nest$fgetcallback(Interstitial.1.this.this$0) != null) {
                      Interstitial.-$$Nest$fgetcallback(Interstitial.1.this.this$0).onAdClicked();
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
                    if (Interstitial.-$$Nest$fgetcallback(Interstitial.1.this.this$0) != null) {
                      Interstitial.-$$Nest$fgetcallback(Interstitial.1.this.this$0).onAdDismissedFullScreenContent();
                    }
                  }
                }).start();
              }
              
              public void onAdFailedToShowFullScreenContent(final AdError paramAnonymous3AdError)
              {
                new Thread(new Runnable()
                {
                  final Interstitial.1.1.2 this$3;
                  
                  public void run()
                  {
                    if (Interstitial.-$$Nest$fgetcallback(this.this$3.this$2.this$1.this$0) != null) {
                      Interstitial.-$$Nest$fgetcallback(this.this$3.this$2.this$1.this$0).onAdFailedToShowFullScreenContent(paramAnonymous3AdError);
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
                    if (Interstitial.-$$Nest$fgetcallback(Interstitial.1.this.this$0) != null) {
                      Interstitial.-$$Nest$fgetcallback(Interstitial.1.this.this$0).onAdImpression();
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
                    if (Interstitial.-$$Nest$fgetcallback(Interstitial.1.this.this$0) != null) {
                      Interstitial.-$$Nest$fgetcallback(Interstitial.1.this.this$0).onAdShowedFullScreenContent();
                    }
                  }
                }).start();
              }
            });
            new Thread(new Runnable()
            {
              public void run()
              {
                if (Interstitial.-$$Nest$fgetcallback(Interstitial.1.this.this$0) != null) {
                  Interstitial.-$$Nest$fgetcallback(Interstitial.1.this.this$0).onInterstitialAdLoaded();
                }
              }
            }).start();
          }
        });
      }
    });
  }
  
  public void show()
  {
    if (this.interstitialAd == null)
    {
      Log.e("AdsUnity", "Tried to show interstitial ad before it was ready. This should in theory never happen. If it does, please contact the plugin owners.");
      return;
    }
    this.activity.runOnUiThread(new Runnable()
    {
      public void run()
      {
        Interstitial.-$$Nest$fgetinterstitialAd(Interstitial.this).show(Interstitial.-$$Nest$fgetactivity(Interstitial.this));
      }
    });
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\googl\\unity\ads\Interstitial.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */