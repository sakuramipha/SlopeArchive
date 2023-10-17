package com.google.ads.mediation;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

final class zzc
  extends InterstitialAdLoadCallback
{
  final AbstractAdViewAdapter zza;
  final MediationInterstitialListener zzb;
  
  public zzc(AbstractAdViewAdapter paramAbstractAdViewAdapter, MediationInterstitialListener paramMediationInterstitialListener)
  {
    this.zza = paramAbstractAdViewAdapter;
    this.zzb = paramMediationInterstitialListener;
  }
  
  public final void onAdFailedToLoad(LoadAdError paramLoadAdError)
  {
    this.zzb.onAdFailedToLoad(this.zza, paramLoadAdError);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\ads\mediation\zzc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */