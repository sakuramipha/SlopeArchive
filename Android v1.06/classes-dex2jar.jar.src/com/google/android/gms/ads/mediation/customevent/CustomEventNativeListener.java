package com.google.android.gms.ads.mediation.customevent;

import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;

@Deprecated
public abstract interface CustomEventNativeListener
  extends CustomEventListener
{
  public abstract void onAdImpression();
  
  public abstract void onAdLoaded(UnifiedNativeAdMapper paramUnifiedNativeAdMapper);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\mediation\customevent\CustomEventNativeListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */