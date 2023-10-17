package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener;

public final class zzbrk
  extends zzbgd
{
  private final NativeAd.OnNativeAdLoadedListener zza;
  
  public zzbrk(NativeAd.OnNativeAdLoadedListener paramOnNativeAdLoadedListener)
  {
    this.zza = paramOnNativeAdLoadedListener;
  }
  
  public final void zze(zzbgn paramzzbgn)
  {
    this.zza.onNativeAdLoaded(new zzbrd(paramzzbgn));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbrk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */