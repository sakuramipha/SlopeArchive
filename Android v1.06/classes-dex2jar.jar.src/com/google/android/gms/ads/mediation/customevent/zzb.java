package com.google.android.gms.ads.mediation.customevent;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.internal.ads.zzbzt;

final class zzb
  implements CustomEventInterstitialListener
{
  final CustomEventAdapter zza;
  private final CustomEventAdapter zzb;
  private final MediationInterstitialListener zzc;
  
  public zzb(CustomEventAdapter paramCustomEventAdapter1, CustomEventAdapter paramCustomEventAdapter2, MediationInterstitialListener paramMediationInterstitialListener)
  {
    this.zzb = paramCustomEventAdapter2;
    this.zzc = paramMediationInterstitialListener;
  }
  
  public final void onAdClicked()
  {
    zzbzt.zze("Custom event adapter called onAdClicked.");
    this.zzc.onAdClicked(this.zzb);
  }
  
  public final void onAdClosed()
  {
    zzbzt.zze("Custom event adapter called onAdClosed.");
    this.zzc.onAdClosed(this.zzb);
  }
  
  public final void onAdFailedToLoad(int paramInt)
  {
    zzbzt.zze("Custom event adapter called onFailedToReceiveAd.");
    this.zzc.onAdFailedToLoad(this.zzb, paramInt);
  }
  
  public final void onAdFailedToLoad(AdError paramAdError)
  {
    zzbzt.zze("Custom event adapter called onFailedToReceiveAd.");
    this.zzc.onAdFailedToLoad(this.zzb, paramAdError);
  }
  
  public final void onAdLeftApplication()
  {
    zzbzt.zze("Custom event adapter called onAdLeftApplication.");
    this.zzc.onAdLeftApplication(this.zzb);
  }
  
  public final void onAdLoaded()
  {
    zzbzt.zze("Custom event adapter called onReceivedAd.");
    this.zzc.onAdLoaded(this.zza);
  }
  
  public final void onAdOpened()
  {
    zzbzt.zze("Custom event adapter called onAdOpened.");
    this.zzc.onAdOpened(this.zzb);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\mediation\customevent\zzb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */