package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

public class zzaz
  extends AdListener
{
  private final Object zza = new Object();
  private AdListener zzb;
  
  public final void onAdClicked()
  {
    synchronized (this.zza)
    {
      AdListener localAdListener = this.zzb;
      if (localAdListener != null) {
        localAdListener.onAdClicked();
      }
      return;
    }
  }
  
  public final void onAdClosed()
  {
    synchronized (this.zza)
    {
      AdListener localAdListener = this.zzb;
      if (localAdListener != null) {
        localAdListener.onAdClosed();
      }
      return;
    }
  }
  
  public void onAdFailedToLoad(LoadAdError paramLoadAdError)
  {
    synchronized (this.zza)
    {
      AdListener localAdListener = this.zzb;
      if (localAdListener != null) {
        localAdListener.onAdFailedToLoad(paramLoadAdError);
      }
      return;
    }
  }
  
  public final void onAdImpression()
  {
    synchronized (this.zza)
    {
      AdListener localAdListener = this.zzb;
      if (localAdListener != null) {
        localAdListener.onAdImpression();
      }
      return;
    }
  }
  
  public void onAdLoaded()
  {
    synchronized (this.zza)
    {
      AdListener localAdListener = this.zzb;
      if (localAdListener != null) {
        localAdListener.onAdLoaded();
      }
      return;
    }
  }
  
  public final void onAdOpened()
  {
    synchronized (this.zza)
    {
      AdListener localAdListener = this.zzb;
      if (localAdListener != null) {
        localAdListener.onAdOpened();
      }
      return;
    }
  }
  
  public final void zza(AdListener paramAdListener)
  {
    synchronized (this.zza)
    {
      this.zzb = paramAdListener;
      return;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzaz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */