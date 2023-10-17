package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;

@Deprecated
public abstract interface MediationNativeListener
{
  public abstract void onAdClicked(MediationNativeAdapter paramMediationNativeAdapter);
  
  public abstract void onAdClosed(MediationNativeAdapter paramMediationNativeAdapter);
  
  @Deprecated
  public abstract void onAdFailedToLoad(MediationNativeAdapter paramMediationNativeAdapter, int paramInt);
  
  public abstract void onAdFailedToLoad(MediationNativeAdapter paramMediationNativeAdapter, AdError paramAdError);
  
  public abstract void onAdImpression(MediationNativeAdapter paramMediationNativeAdapter);
  
  public abstract void onAdLeftApplication(MediationNativeAdapter paramMediationNativeAdapter);
  
  public abstract void onAdLoaded(MediationNativeAdapter paramMediationNativeAdapter, UnifiedNativeAdMapper paramUnifiedNativeAdMapper);
  
  public abstract void onAdOpened(MediationNativeAdapter paramMediationNativeAdapter);
  
  public abstract void onVideoEnd(MediationNativeAdapter paramMediationNativeAdapter);
  
  public abstract void zzc(MediationNativeAdapter paramMediationNativeAdapter, NativeCustomTemplateAd paramNativeCustomTemplateAd);
  
  public abstract void zze(MediationNativeAdapter paramMediationNativeAdapter, NativeCustomTemplateAd paramNativeCustomTemplateAd, String paramString);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\mediation\MediationNativeListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */