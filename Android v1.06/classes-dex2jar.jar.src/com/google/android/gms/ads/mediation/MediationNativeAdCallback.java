package com.google.android.gms.ads.mediation;

public abstract interface MediationNativeAdCallback
  extends MediationAdCallback
{
  public abstract void onAdLeftApplication();
  
  public abstract void onVideoComplete();
  
  public abstract void onVideoMute();
  
  public abstract void onVideoPause();
  
  public abstract void onVideoPlay();
  
  public abstract void onVideoUnmute();
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\mediation\MediationNativeAdCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */