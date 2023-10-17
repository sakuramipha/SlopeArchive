package com.google.android.gms.ads.mediation;

public abstract interface MediationAdCallback
{
  public abstract void onAdClosed();
  
  public abstract void onAdOpened();
  
  public abstract void reportAdClicked();
  
  public abstract void reportAdImpression();
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\mediation\MediationAdCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */