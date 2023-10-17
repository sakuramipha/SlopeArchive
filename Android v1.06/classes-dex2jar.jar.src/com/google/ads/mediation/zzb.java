package com.google.ads.mediation;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.mediation.MediationBannerListener;

final class zzb
  extends AdListener
  implements AppEventListener, zza
{
  final AbstractAdViewAdapter zza;
  final MediationBannerListener zzb;
  
  public zzb(AbstractAdViewAdapter paramAbstractAdViewAdapter, MediationBannerListener paramMediationBannerListener)
  {
    this.zza = paramAbstractAdViewAdapter;
    this.zzb = paramMediationBannerListener;
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
  
  public final void onAdLoaded()
  {
    this.zzb.onAdLoaded(this.zza);
  }
  
  public final void onAdOpened()
  {
    this.zzb.onAdOpened(this.zza);
  }
  
  public final void onAppEvent(String paramString1, String paramString2)
  {
    this.zzb.zzd(this.zza, paramString1, paramString2);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\ads\mediation\zzb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */