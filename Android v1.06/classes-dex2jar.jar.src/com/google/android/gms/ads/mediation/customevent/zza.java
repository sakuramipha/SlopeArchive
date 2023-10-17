package com.google.android.gms.ads.mediation.customevent;

import android.view.View;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.internal.ads.zzbzt;

final class zza
  implements CustomEventBannerListener
{
  private final CustomEventAdapter zza;
  private final MediationBannerListener zzb;
  
  public zza(CustomEventAdapter paramCustomEventAdapter, MediationBannerListener paramMediationBannerListener)
  {
    this.zza = paramCustomEventAdapter;
    this.zzb = paramMediationBannerListener;
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
  
  public final void onAdLeftApplication()
  {
    zzbzt.zze("Custom event adapter called onAdLeftApplication.");
    this.zzb.onAdLeftApplication(this.zza);
  }
  
  public final void onAdLoaded(View paramView)
  {
    zzbzt.zze("Custom event adapter called onAdLoaded.");
    CustomEventAdapter.zza(this.zza, paramView);
    this.zzb.onAdLoaded(this.zza);
  }
  
  public final void onAdOpened()
  {
    zzbzt.zze("Custom event adapter called onAdOpened.");
    this.zzb.onAdOpened(this.zza);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\mediation\customevent\zza.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */