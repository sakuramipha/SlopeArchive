package com.google.android.gms.ads.mediation.customevent;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.internal.ads.zzbzt;

final class zzc
  implements CustomEventNativeListener
{
  private final CustomEventAdapter zza;
  private final MediationNativeListener zzb;
  
  public zzc(CustomEventAdapter paramCustomEventAdapter, MediationNativeListener paramMediationNativeListener)
  {
    this.zza = paramCustomEventAdapter;
    this.zzb = paramMediationNativeListener;
  }
  
  public final void onAdClicked()
  {
    zzbzt.zze("Custom event adapter called onAdClicked.");
    this.zzb.onAdClicked(this.zza);
  }
  
  public final void onAdClosed()
  {
    zzbzt.zze("Custom event adapter called onAdClosed.");
    this.zzb.onAdClosed(this.zza);
  }
  
  public final void onAdFailedToLoad(int paramInt)
  {
    zzbzt.zze("Custom event adapter called onAdFailedToLoad.");
    this.zzb.onAdFailedToLoad(this.zza, paramInt);
  }
  
  public final void onAdFailedToLoad(AdError paramAdError)
  {
    zzbzt.zze("Custom event adapter called onAdFailedToLoad.");
    this.zzb.onAdFailedToLoad(this.zza, paramAdError);
  }
  
  public final void onAdImpression()
  {
    zzbzt.zze("Custom event adapter called onAdImpression.");
    this.zzb.onAdImpression(this.zza);
  }
  
  public final void onAdLeftApplication()
  {
    zzbzt.zze("Custom event adapter called onAdLeftApplication.");
    this.zzb.onAdLeftApplication(this.zza);
  }
  
  public final void onAdLoaded(UnifiedNativeAdMapper paramUnifiedNativeAdMapper)
  {
    zzbzt.zze("Custom event adapter called onAdLoaded.");
    this.zzb.onAdLoaded(this.zza, paramUnifiedNativeAdMapper);
  }
  
  public final void onAdOpened()
  {
    zzbzt.zze("Custom event adapter called onAdOpened.");
    this.zzb.onAdOpened(this.zza);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\mediation\customevent\zzc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */