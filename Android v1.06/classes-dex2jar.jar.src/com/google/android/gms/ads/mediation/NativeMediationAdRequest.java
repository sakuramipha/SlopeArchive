package com.google.android.gms.ads.mediation;

import java.util.Map;

@Deprecated
public abstract interface NativeMediationAdRequest
  extends MediationAdRequest
{
  public abstract float getAdVolume();
  
  @Deprecated
  public abstract com.google.android.gms.ads.formats.NativeAdOptions getNativeAdOptions();
  
  public abstract com.google.android.gms.ads.nativead.NativeAdOptions getNativeAdRequestOptions();
  
  public abstract boolean isAdMuted();
  
  public abstract boolean isUnifiedNativeAdRequested();
  
  public abstract Map zza();
  
  public abstract boolean zzb();
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\mediation\NativeMediationAdRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */