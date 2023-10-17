package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.internal.ads.zzbzt;
import java.lang.reflect.Constructor;
import java.util.Objects;

public final class CustomEventAdapter
  implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter
{
  static final AdError zza = new AdError(0, "Could not instantiate custom event adapter", "com.google.android.gms.ads");
  CustomEventBanner zzb;
  CustomEventInterstitial zzc;
  CustomEventNative zzd;
  private View zze;
  
  private static Object zzb(Class paramClass, String paramString)
  {
    Objects.requireNonNull(paramString);
    try
    {
      paramClass = paramClass.cast(Class.forName(paramString).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
      return paramClass;
    }
    finally
    {
      String str = paramClass.getMessage();
      paramClass = new StringBuilder();
      paramClass.append("Could not instantiate custom event adapter: ");
      paramClass.append(paramString);
      paramClass.append(". ");
      paramClass.append(str);
      zzbzt.zzj(paramClass.toString());
    }
    return null;
  }
  
  public View getBannerView()
  {
    return this.zze;
  }
  
  public void onDestroy()
  {
    Object localObject = this.zzb;
    if (localObject != null) {
      ((CustomEventBanner)localObject).onDestroy();
    }
    localObject = this.zzc;
    if (localObject != null) {
      ((CustomEventInterstitial)localObject).onDestroy();
    }
    localObject = this.zzd;
    if (localObject != null) {
      ((CustomEventNative)localObject).onDestroy();
    }
  }
  
  public void onPause()
  {
    Object localObject = this.zzb;
    if (localObject != null) {
      ((CustomEventBanner)localObject).onPause();
    }
    localObject = this.zzc;
    if (localObject != null) {
      ((CustomEventInterstitial)localObject).onPause();
    }
    localObject = this.zzd;
    if (localObject != null) {
      ((CustomEventNative)localObject).onPause();
    }
  }
  
  public void onResume()
  {
    Object localObject = this.zzb;
    if (localObject != null) {
      ((CustomEventBanner)localObject).onResume();
    }
    localObject = this.zzc;
    if (localObject != null) {
      ((CustomEventInterstitial)localObject).onResume();
    }
    localObject = this.zzd;
    if (localObject != null) {
      ((CustomEventNative)localObject).onResume();
    }
  }
  
  public void requestBannerAd(Context paramContext, MediationBannerListener paramMediationBannerListener, Bundle paramBundle1, AdSize paramAdSize, MediationAdRequest paramMediationAdRequest, Bundle paramBundle2)
  {
    CustomEventBanner localCustomEventBanner = (CustomEventBanner)zzb(CustomEventBanner.class, paramBundle1.getString("class_name"));
    this.zzb = localCustomEventBanner;
    if (localCustomEventBanner == null)
    {
      paramMediationBannerListener.onAdFailedToLoad(this, zza);
      return;
    }
    if (paramBundle2 == null) {
      paramBundle2 = null;
    } else {
      paramBundle2 = paramBundle2.getBundle(paramBundle1.getString("class_name"));
    }
    localCustomEventBanner = this.zzb;
    Objects.requireNonNull(localCustomEventBanner);
    localCustomEventBanner.requestBannerAd(paramContext, new zza(this, paramMediationBannerListener), paramBundle1.getString("parameter"), paramAdSize, paramMediationAdRequest, paramBundle2);
  }
  
  public void requestInterstitialAd(Context paramContext, MediationInterstitialListener paramMediationInterstitialListener, Bundle paramBundle1, MediationAdRequest paramMediationAdRequest, Bundle paramBundle2)
  {
    CustomEventInterstitial localCustomEventInterstitial = (CustomEventInterstitial)zzb(CustomEventInterstitial.class, paramBundle1.getString("class_name"));
    this.zzc = localCustomEventInterstitial;
    if (localCustomEventInterstitial == null)
    {
      paramMediationInterstitialListener.onAdFailedToLoad(this, zza);
      return;
    }
    if (paramBundle2 == null) {
      paramBundle2 = null;
    } else {
      paramBundle2 = paramBundle2.getBundle(paramBundle1.getString("class_name"));
    }
    localCustomEventInterstitial = this.zzc;
    Objects.requireNonNull(localCustomEventInterstitial);
    localCustomEventInterstitial.requestInterstitialAd(paramContext, new zzb(this, this, paramMediationInterstitialListener), paramBundle1.getString("parameter"), paramMediationAdRequest, paramBundle2);
  }
  
  public void requestNativeAd(Context paramContext, MediationNativeListener paramMediationNativeListener, Bundle paramBundle1, NativeMediationAdRequest paramNativeMediationAdRequest, Bundle paramBundle2)
  {
    CustomEventNative localCustomEventNative = (CustomEventNative)zzb(CustomEventNative.class, paramBundle1.getString("class_name"));
    this.zzd = localCustomEventNative;
    if (localCustomEventNative == null)
    {
      paramMediationNativeListener.onAdFailedToLoad(this, zza);
      return;
    }
    if (paramBundle2 == null) {
      paramBundle2 = null;
    } else {
      paramBundle2 = paramBundle2.getBundle(paramBundle1.getString("class_name"));
    }
    localCustomEventNative = this.zzd;
    Objects.requireNonNull(localCustomEventNative);
    localCustomEventNative.requestNativeAd(paramContext, new zzc(this, paramMediationNativeListener), paramBundle1.getString("parameter"), paramNativeMediationAdRequest, paramBundle2);
  }
  
  public void showInterstitial()
  {
    CustomEventInterstitial localCustomEventInterstitial = this.zzc;
    if (localCustomEventInterstitial != null) {
      localCustomEventInterstitial.showInterstitial();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\mediation\customevent\CustomEventAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */