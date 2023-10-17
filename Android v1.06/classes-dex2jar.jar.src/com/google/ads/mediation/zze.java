package com.google.ads.mediation;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomClickListener;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAd.OnUnifiedNativeAdLoadedListener;
import com.google.android.gms.ads.mediation.MediationNativeListener;

final class zze
  extends AdListener
  implements UnifiedNativeAd.OnUnifiedNativeAdLoadedListener, NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener, NativeCustomTemplateAd.OnCustomClickListener
{
  final AbstractAdViewAdapter zza;
  final MediationNativeListener zzb;
  
  public zze(AbstractAdViewAdapter paramAbstractAdViewAdapter, MediationNativeListener paramMediationNativeListener)
  {
    this.zza = paramAbstractAdViewAdapter;
    this.zzb = paramMediationNativeListener;
  }
  
  public final void onAdClicked()
  {
    this.zzb.onAdClicked(this.zza);
  }
  
  public final void onAdClosed()
  {
    this.zzb.onAdClosed(this.zza);
  }
  
  public final void onAdFailedToLoad(LoadAdError paramLoadAdError)
  {
    this.zzb.onAdFailedToLoad(this.zza, paramLoadAdError);
  }
  
  public final void onAdImpression()
  {
    this.zzb.onAdImpression(this.zza);
  }
  
  public final void onAdLoaded() {}
  
  public final void onAdOpened()
  {
    this.zzb.onAdOpened(this.zza);
  }
  
  public final void onCustomClick(NativeCustomTemplateAd paramNativeCustomTemplateAd, String paramString)
  {
    this.zzb.zze(this.zza, paramNativeCustomTemplateAd, paramString);
  }
  
  public final void onCustomTemplateAdLoaded(NativeCustomTemplateAd paramNativeCustomTemplateAd)
  {
    this.zzb.zzc(this.zza, paramNativeCustomTemplateAd);
  }
  
  public final void onUnifiedNativeAdLoaded(UnifiedNativeAd paramUnifiedNativeAd)
  {
    this.zzb.onAdLoaded(this.zza, new zza(paramUnifiedNativeAd));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\ads\mediation\zze.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */