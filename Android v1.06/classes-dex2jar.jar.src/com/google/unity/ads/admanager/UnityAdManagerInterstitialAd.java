package com.google.unity.ads.admanager;

import android.app.Activity;
import android.util.Log;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class UnityAdManagerInterstitialAd
{
  private final Activity activity;
  private AdManagerInterstitialAd adManagerInterstitialAd;
  private final UnityAdManagerInterstitialAdCallback callback;
  
  public UnityAdManagerInterstitialAd(Activity paramActivity, UnityAdManagerInterstitialAdCallback paramUnityAdManagerInterstitialAdCallback)
  {
    this.activity = paramActivity;
    this.callback = paramUnityAdManagerInterstitialAdCallback;
  }
  
  public void destroy() {}
  
  public ResponseInfo getResponseInfo()
  {
    Object localObject = new FutureTask(new UnityAdManagerInterstitialAd..ExternalSyntheticLambda2(this));
    this.activity.runOnUiThread((Runnable)localObject);
    try
    {
      localObject = (ResponseInfo)((FutureTask)localObject).get();
    }
    catch (ExecutionException localExecutionException) {}catch (InterruptedException localInterruptedException) {}
    Log.e("AdsUnity", String.format("Unable to check Ad Manager interstitial response info: %s", new Object[] { localInterruptedException.getLocalizedMessage() }));
    ResponseInfo localResponseInfo = null;
    return localResponseInfo;
  }
  
  public void loadAd(String paramString, AdManagerAdRequest paramAdManagerAdRequest)
  {
    AdManagerInterstitialAdCallback localAdManagerInterstitialAdCallback = new AdManagerInterstitialAdCallback(this.adManagerInterstitialAd, this.callback);
    this.activity.runOnUiThread(new UnityAdManagerInterstitialAd..ExternalSyntheticLambda1(this, paramString, paramAdManagerAdRequest, localAdManagerInterstitialAdCallback));
  }
  
  public void show()
  {
    if (this.adManagerInterstitialAd == null)
    {
      Log.e("AdsUnity", "Tried to show Ad Manager interstitial ad before it was ready. This should in theory never happen. If it does, please contact the plugin owners.");
      return;
    }
    this.activity.runOnUiThread(new UnityAdManagerInterstitialAd..ExternalSyntheticLambda0(this));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\googl\\unity\ads\admanager\UnityAdManagerInterstitialAd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */