package com.google.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdLoader.Builder;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.internal.ads.zzbzm;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class AbstractAdViewAdapter
  implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter, OnImmersiveModeUpdatedListener, zza
{
  public static final String AD_UNIT_ID_PARAMETER = "pubid";
  private AdLoader adLoader;
  protected AdView mAdView;
  protected InterstitialAd mInterstitialAd;
  
  AdRequest buildAdRequest(Context paramContext, MediationAdRequest paramMediationAdRequest, Bundle paramBundle1, Bundle paramBundle2)
  {
    AdRequest.Builder localBuilder = new AdRequest.Builder();
    Object localObject = paramMediationAdRequest.getBirthday();
    if (localObject != null) {
      localBuilder.zzb((Date)localObject);
    }
    int i = paramMediationAdRequest.getGender();
    if (i != 0) {
      localBuilder.zzc(i);
    }
    localObject = paramMediationAdRequest.getKeywords();
    if (localObject != null)
    {
      localObject = ((Set)localObject).iterator();
      while (((Iterator)localObject).hasNext()) {
        localBuilder.addKeyword((String)((Iterator)localObject).next());
      }
    }
    if (paramMediationAdRequest.isTesting())
    {
      zzay.zzb();
      localBuilder.zza(zzbzm.zzy(paramContext));
    }
    if (paramMediationAdRequest.taggedForChildDirectedTreatment() != -1)
    {
      i = paramMediationAdRequest.taggedForChildDirectedTreatment();
      boolean bool = true;
      if (i != 1) {
        bool = false;
      }
      localBuilder.zze(bool);
    }
    localBuilder.zzd(paramMediationAdRequest.isDesignedForFamilies());
    localBuilder.addNetworkExtrasBundle(AdMobAdapter.class, buildExtrasBundle(paramBundle1, paramBundle2));
    return localBuilder.build();
  }
  
  protected abstract Bundle buildExtrasBundle(Bundle paramBundle1, Bundle paramBundle2);
  
  public String getAdUnitId(Bundle paramBundle)
  {
    return paramBundle.getString("pubid");
  }
  
  public View getBannerView()
  {
    return this.mAdView;
  }
  
  InterstitialAd getInterstitialAd()
  {
    return this.mInterstitialAd;
  }
  
  public zzdq getVideoController()
  {
    AdView localAdView = this.mAdView;
    if (localAdView != null) {
      return localAdView.zza().zza();
    }
    return null;
  }
  
  AdLoader.Builder newAdLoader(Context paramContext, String paramString)
  {
    return new AdLoader.Builder(paramContext, paramString);
  }
  
  public void onDestroy()
  {
    AdView localAdView = this.mAdView;
    if (localAdView != null)
    {
      localAdView.destroy();
      this.mAdView = null;
    }
    if (this.mInterstitialAd != null) {
      this.mInterstitialAd = null;
    }
    if (this.adLoader != null) {
      this.adLoader = null;
    }
  }
  
  public void onImmersiveModeUpdated(boolean paramBoolean)
  {
    InterstitialAd localInterstitialAd = this.mInterstitialAd;
    if (localInterstitialAd != null) {
      localInterstitialAd.setImmersiveMode(paramBoolean);
    }
  }
  
  public void onPause()
  {
    AdView localAdView = this.mAdView;
    if (localAdView != null) {
      localAdView.pause();
    }
  }
  
  public void onResume()
  {
    AdView localAdView = this.mAdView;
    if (localAdView != null) {
      localAdView.resume();
    }
  }
  
  public void requestBannerAd(Context paramContext, MediationBannerListener paramMediationBannerListener, Bundle paramBundle1, AdSize paramAdSize, MediationAdRequest paramMediationAdRequest, Bundle paramBundle2)
  {
    AdView localAdView = new AdView(paramContext);
    this.mAdView = localAdView;
    localAdView.setAdSize(new AdSize(paramAdSize.getWidth(), paramAdSize.getHeight()));
    this.mAdView.setAdUnitId(getAdUnitId(paramBundle1));
    this.mAdView.setAdListener(new zzb(this, paramMediationBannerListener));
    this.mAdView.loadAd(buildAdRequest(paramContext, paramMediationAdRequest, paramBundle2, paramBundle1));
  }
  
  public void requestInterstitialAd(Context paramContext, MediationInterstitialListener paramMediationInterstitialListener, Bundle paramBundle1, MediationAdRequest paramMediationAdRequest, Bundle paramBundle2)
  {
    InterstitialAd.load(paramContext, getAdUnitId(paramBundle1), buildAdRequest(paramContext, paramMediationAdRequest, paramBundle2, paramBundle1), new zzc(this, paramMediationInterstitialListener));
  }
  
  public void requestNativeAd(Context paramContext, MediationNativeListener paramMediationNativeListener, Bundle paramBundle1, NativeMediationAdRequest paramNativeMediationAdRequest, Bundle paramBundle2)
  {
    zze localzze = new zze(this, paramMediationNativeListener);
    AdLoader.Builder localBuilder = newAdLoader(paramContext, paramBundle1.getString("pubid")).withAdListener(localzze);
    localBuilder.withNativeAdOptions(paramNativeMediationAdRequest.getNativeAdOptions());
    localBuilder.withNativeAdOptions(paramNativeMediationAdRequest.getNativeAdRequestOptions());
    if (paramNativeMediationAdRequest.isUnifiedNativeAdRequested()) {
      localBuilder.forUnifiedNativeAd(localzze);
    }
    if (paramNativeMediationAdRequest.zzb())
    {
      Iterator localIterator = paramNativeMediationAdRequest.zza().keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        if (true != ((Boolean)paramNativeMediationAdRequest.zza().get(str)).booleanValue()) {
          paramMediationNativeListener = null;
        } else {
          paramMediationNativeListener = localzze;
        }
        localBuilder.forCustomTemplateAd(str, localzze, paramMediationNativeListener);
      }
    }
    paramMediationNativeListener = localBuilder.build();
    this.adLoader = paramMediationNativeListener;
    paramMediationNativeListener.loadAd(buildAdRequest(paramContext, paramNativeMediationAdRequest, paramBundle2, paramBundle1));
  }
  
  public void showInterstitial()
  {
    InterstitialAd localInterstitialAd = this.mInterstitialAd;
    if (localInterstitialAd != null) {
      localInterstitialAd.show(null);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\ads\mediation\AbstractAdViewAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */