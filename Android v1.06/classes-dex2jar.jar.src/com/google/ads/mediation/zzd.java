package com.google.ads.mediation;

import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

final class zzd
  extends FullScreenContentCallback
{
  final AbstractAdViewAdapter zza;
  final MediationInterstitialListener zzb;
  
  public zzd(AbstractAdViewAdapter paramAbstractAdViewAdapter, MediationInterstitialListener paramMediationInterstitialListener)
  {
    this.zza = paramAbstractAdViewAdapter;
    this.zzb = paramMediationInterstitialListener;
  }
  
  public final void onAdDismissedFullScreenContent()
  {
    this.zzb.onAdClosed(this.zza);
  }
  
  public final void onAdShowedFullScreenContent()
  {
    this.zzb.onAdOpened(this.zza);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\ads\mediation\zzd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */