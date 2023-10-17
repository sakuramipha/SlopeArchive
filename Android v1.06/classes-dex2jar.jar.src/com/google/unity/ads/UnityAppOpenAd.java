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
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.appopen.AppOpenAd.AppOpenAdLoadCallback;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class UnityAppOpenAd
{
  private final Activity activity;
  private AppOpenAd appOpenAd;
  private final UnityAppOpenAdCallback callback;
  
  public UnityAppOpenAd(Activity paramActivity, UnityAppOpenAdCallback paramUnityAppOpenAdCallback)
  {
    this.activity = paramActivity;
    this.callback = paramUnityAppOpenAdCallback;
  }
  
  private void runOnNewThread(Runnable paramRunnable)
  {
    new Thread(paramRunnable).start();
  }
  
  public void destroy() {}
  
  public ResponseInfo getResponseInfo()
  {
    Object localObject1 = this.appOpenAd;
    Object localObject3 = null;
    if (localObject1 == null) {
      return null;
    }
    localObject1 = new FutureTask(new Callable()
    {
      public ResponseInfo call()
      {
        return UnityAppOpenAd.-$$Nest$fgetappOpenAd(UnityAppOpenAd.this).getResponseInfo();
      }
    });
    this.activity.runOnUiThread((Runnable)localObject1);
    try
    {
      localObject1 = (ResponseInfo)((FutureTask)localObject1).get();
    }
    catch (InterruptedException localInterruptedException) {}catch (ExecutionException localExecutionException) {}
    Log.e("AdsUnity", String.format("Unable to check unity app open ad response info: %s", new Object[] { localExecutionException.getLocalizedMessage() }));
    Object localObject2 = localObject3;
    return (ResponseInfo)localObject2;
  }
  
  public void loadAd(String paramString, AdRequest paramAdRequest)
  {
    this.activity.runOnUiThread(new UnityAppOpenAd..ExternalSyntheticLambda0(this, paramString, paramAdRequest));
  }
  
  public void loadAd(final String paramString, final AdRequest paramAdRequest, final int paramInt)
  {
    this.activity.runOnUiThread(new Runnable()
    {
      final UnityAppOpenAd this$0;
      
      public void run()
      {
        AppOpenAd.load(UnityAppOpenAd.-$$Nest$fgetactivity(this.this$0), paramString, paramAdRequest, paramInt, new AppOpenAd.AppOpenAdLoadCallback()
        {
          public void onAdFailedToLoad(final LoadAdError paramAnonymous2LoadAdError)
          {
            UnityAppOpenAd.-$$Nest$mrunOnNewThread(UnityAppOpenAd.2.this.this$0, new Runnable()
            {
              final UnityAppOpenAd.2.1 this$2;
              
              public void run()
              {
                if (UnityAppOpenAd.-$$Nest$fgetcallback(this.this$2.this$1.this$0) != null) {
                  UnityAppOpenAd.-$$Nest$fgetcallback(this.this$2.this$1.this$0).onAppOpenAdFailedToLoad(paramAnonymous2LoadAdError);
                }
              }
            });
          }
          
          public void onAdLoaded(AppOpenAd paramAnonymous2AppOpenAd)
          {
            UnityAppOpenAd.-$$Nest$fputappOpenAd(UnityAppOpenAd.2.this.this$0, paramAnonymous2AppOpenAd);
            UnityAppOpenAd.-$$Nest$fgetappOpenAd(UnityAppOpenAd.2.this.this$0).setOnPaidEventListener(new OnPaidEventListener()
            {
              public void onPaidEvent(final AdValue paramAnonymous3AdValue)
              {
                UnityAppOpenAd.-$$Nest$mrunOnNewThread(UnityAppOpenAd.2.this.this$0, new Runnable()
                {
                  final UnityAppOpenAd.2.1.1 this$3;
                  
                  public void run()
                  {
                    if (UnityAppOpenAd.-$$Nest$fgetcallback(this.this$3.this$2.this$1.this$0) != null) {
                      UnityAppOpenAd.-$$Nest$fgetcallback(this.this$3.this$2.this$1.this$0).onPaidEvent(paramAnonymous3AdValue.getPrecisionType(), paramAnonymous3AdValue.getValueMicros(), paramAnonymous3AdValue.getCurrencyCode());
                    }
                  }
                });
              }
            });
            UnityAppOpenAd.-$$Nest$fgetappOpenAd(UnityAppOpenAd.2.this.this$0).setFullScreenContentCallback(new FullScreenContentCallback()
            {
              public void onAdClicked()
              {
                UnityAppOpenAd.-$$Nest$mrunOnNewThread(UnityAppOpenAd.2.this.this$0, new Runnable()
                {
                  public void run()
                  {
                    if (UnityAppOpenAd.-$$Nest$fgetcallback(UnityAppOpenAd.2.this.this$0) != null) {
                      UnityAppOpenAd.-$$Nest$fgetcallback(UnityAppOpenAd.2.this.this$0).onAdClicked();
                    }
                  }
                });
              }
              
              public void onAdDismissedFullScreenContent()
              {
                UnityAppOpenAd.-$$Nest$mrunOnNewThread(UnityAppOpenAd.2.this.this$0, new Runnable()
                {
                  public void run()
                  {
                    if (UnityAppOpenAd.-$$Nest$fgetcallback(UnityAppOpenAd.2.this.this$0) != null) {
                      UnityAppOpenAd.-$$Nest$fgetcallback(UnityAppOpenAd.2.this.this$0).onAdDismissedFullScreenContent();
                    }
                  }
                });
              }
              
              public void onAdFailedToShowFullScreenContent(final AdError paramAnonymous3AdError)
              {
                UnityAppOpenAd.-$$Nest$mrunOnNewThread(UnityAppOpenAd.2.this.this$0, new Runnable()
                {
                  final UnityAppOpenAd.2.1.2 this$3;
                  
                  public void run()
                  {
                    if (UnityAppOpenAd.-$$Nest$fgetcallback(this.this$3.this$2.this$1.this$0) != null) {
                      UnityAppOpenAd.-$$Nest$fgetcallback(this.this$3.this$2.this$1.this$0).onAdFailedToShowFullScreenContent(paramAnonymous3AdError);
                    }
                  }
                });
              }
              
              public void onAdImpression()
              {
                UnityAppOpenAd.-$$Nest$mrunOnNewThread(UnityAppOpenAd.2.this.this$0, new Runnable()
                {
                  public void run()
                  {
                    if (UnityAppOpenAd.-$$Nest$fgetcallback(UnityAppOpenAd.2.this.this$0) != null) {
                      UnityAppOpenAd.-$$Nest$fgetcallback(UnityAppOpenAd.2.this.this$0).onAdImpression();
                    }
                  }
                });
              }
              
              public void onAdShowedFullScreenContent()
              {
                UnityAppOpenAd.-$$Nest$mrunOnNewThread(UnityAppOpenAd.2.this.this$0, new Runnable()
                {
                  public void run()
                  {
                    if (UnityAppOpenAd.-$$Nest$fgetcallback(UnityAppOpenAd.2.this.this$0) != null) {
                      UnityAppOpenAd.-$$Nest$fgetcallback(UnityAppOpenAd.2.this.this$0).onAdShowedFullScreenContent();
                    }
                  }
                });
              }
            });
            UnityAppOpenAd.-$$Nest$mrunOnNewThread(UnityAppOpenAd.2.this.this$0, new Runnable()
            {
              public void run()
              {
                if (UnityAppOpenAd.-$$Nest$fgetcallback(UnityAppOpenAd.2.this.this$0) != null) {
                  UnityAppOpenAd.-$$Nest$fgetcallback(UnityAppOpenAd.2.this.this$0).onAppOpenAdLoaded();
                }
              }
            });
          }
        });
      }
    });
  }
  
  public void show()
  {
    if (this.appOpenAd == null)
    {
      Log.e("AdsUnity", "Tried to show app open ad before it was ready. This should in theory never happen. If it does, please contact the plugin owners.");
      return;
    }
    this.activity.runOnUiThread(new Runnable()
    {
      public void run()
      {
        UnityAppOpenAd.-$$Nest$fgetappOpenAd(UnityAppOpenAd.this).show(UnityAppOpenAd.-$$Nest$fgetactivity(UnityAppOpenAd.this));
      }
    });
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\googl\\unity\ads\UnityAppOpenAd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */