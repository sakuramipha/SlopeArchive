package com.google.android.gms.ads.mediation.customevent;

import com.google.android.gms.ads.AdError;

@Deprecated
public abstract interface CustomEventListener
{
  public abstract void onAdClicked();
  
  public abstract void onAdClosed();
  
  @Deprecated
  public abstract void onAdFailedToLoad(int paramInt);
  
  public abstract void onAdFailedToLoad(AdError paramAdError);
  
  public abstract void onAdLeftApplication();
  
  public abstract void onAdOpened();
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\mediation\customevent\CustomEventListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */