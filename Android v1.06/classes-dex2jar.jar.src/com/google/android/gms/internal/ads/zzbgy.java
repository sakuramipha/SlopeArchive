package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.UnifiedNativeAd.OnUnifiedNativeAdLoadedListener;

public final class zzbgy
  extends zzbgd
{
  private final UnifiedNativeAd.OnUnifiedNativeAdLoadedListener zza;
  
  public zzbgy(UnifiedNativeAd.OnUnifiedNativeAdLoadedListener paramOnUnifiedNativeAdLoadedListener)
  {
    this.zza = paramOnUnifiedNativeAdLoadedListener;
  }
  
  public final void zze(zzbgn paramzzbgn)
  {
    this.zza.onUnifiedNativeAdLoaded(new zzbgo(paramzzbgn));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbgy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */