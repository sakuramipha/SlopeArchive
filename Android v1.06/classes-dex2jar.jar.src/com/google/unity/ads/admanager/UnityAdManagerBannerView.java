package com.google.unity.ads.admanager;

import android.app.Activity;
import android.util.Log;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.unity.ads.Banner;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class UnityAdManagerBannerView
  extends Banner
{
  private final ExecutorService service;
  
  public UnityAdManagerBannerView(Activity paramActivity, UnityAdManagerAdListener paramUnityAdManagerAdListener)
  {
    this.unityPlayerActivity = paramActivity;
    this.unityListener = paramUnityAdManagerAdListener;
    this.service = Executors.newSingleThreadExecutor();
  }
  
  protected void createAdView(String paramString, AdSize paramAdSize)
  {
    this.adView = new AdManagerAdView(this.unityPlayerActivity);
    this.adView.setBackgroundColor(0);
    this.adView.setAdUnitId(paramString);
    this.adView.setAdSize(paramAdSize);
    this.adView.setVisibility(8);
    this.adView.setDescendantFocusability(393216);
    this.unityPlayerActivity.addContentView(this.adView, getLayoutParams());
    this.adView.setAdListener(new AdListener()
    {
      public void onAdClicked()
      {
        UnityAdManagerBannerView.-$$Nest$fgetservice(UnityAdManagerBannerView.this).execute(new UnityAdManagerBannerView.1..ExternalSyntheticLambda0(this));
      }
      
      public void onAdClosed()
      {
        UnityAdManagerBannerView.-$$Nest$fgetservice(UnityAdManagerBannerView.this).execute(new UnityAdManagerBannerView.1..ExternalSyntheticLambda1(this));
      }
      
      public void onAdFailedToLoad(LoadAdError paramAnonymousLoadAdError)
      {
        UnityAdManagerBannerView.-$$Nest$fgetservice(UnityAdManagerBannerView.this).execute(new UnityAdManagerBannerView.1..ExternalSyntheticLambda5(this, paramAnonymousLoadAdError));
      }
      
      public void onAdImpression()
      {
        UnityAdManagerBannerView.-$$Nest$fgetservice(UnityAdManagerBannerView.this).execute(new UnityAdManagerBannerView.1..ExternalSyntheticLambda2(this));
      }
      
      public void onAdLoaded()
      {
        if (!UnityAdManagerBannerView.this.hidden) {
          UnityAdManagerBannerView.this.show();
        }
        UnityAdManagerBannerView.-$$Nest$fgetservice(UnityAdManagerBannerView.this).execute(new UnityAdManagerBannerView.1..ExternalSyntheticLambda3(this));
      }
      
      public void onAdOpened()
      {
        UnityAdManagerBannerView.-$$Nest$fgetservice(UnityAdManagerBannerView.this).execute(new UnityAdManagerBannerView.1..ExternalSyntheticLambda4(this));
      }
    });
    this.adView.setOnPaidEventListener(new OnPaidEventListener()
    {
      public void onPaidEvent(AdValue paramAnonymousAdValue)
      {
        UnityAdManagerBannerView.-$$Nest$fgetservice(UnityAdManagerBannerView.this).execute(new UnityAdManagerBannerView.2..ExternalSyntheticLambda0(this, paramAnonymousAdValue));
      }
    });
    ((AdManagerAdView)this.adView).setAppEventListener(new AppEventListener()
    {
      public void onAppEvent(String paramAnonymousString1, String paramAnonymousString2)
      {
        UnityAdManagerBannerView.-$$Nest$fgetservice(UnityAdManagerBannerView.this).execute(new UnityAdManagerBannerView.3..ExternalSyntheticLambda0(this, paramAnonymousString1, paramAnonymousString2));
      }
    });
    setLayoutChangeListener();
  }
  
  public List<AdSize> getAdSizes()
  {
    Object localObject1 = new FutureTask(new UnityAdManagerBannerView..ExternalSyntheticLambda2(this));
    this.unityPlayerActivity.runOnUiThread((Runnable)localObject1);
    AdSize[] arrayOfAdSize = new AdSize[0];
    try
    {
      localObject1 = (AdSize[])((FutureTask)localObject1).get();
    }
    catch (ExecutionException localExecutionException) {}catch (InterruptedException localInterruptedException) {}
    Log.e("AdsUnity", String.format("Failed to get ad sizes: %s", new Object[] { localInterruptedException.getLocalizedMessage() }));
    Object localObject2 = arrayOfAdSize;
    return Arrays.asList((Object[])localObject2);
  }
  
  public void loadAd(AdManagerAdRequest paramAdManagerAdRequest)
  {
    this.unityPlayerActivity.runOnUiThread(new UnityAdManagerBannerView..ExternalSyntheticLambda0(this, paramAdManagerAdRequest));
  }
  
  public void setAdSizes(List<AdSize> paramList)
  {
    if ((paramList != null) && (paramList.size() >= 1))
    {
      this.unityPlayerActivity.runOnUiThread(new UnityAdManagerBannerView..ExternalSyntheticLambda1(this, paramList));
      return;
    }
    throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\googl\\unity\ads\admanager\UnityAdManagerBannerView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */