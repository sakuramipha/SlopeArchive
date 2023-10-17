package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdListener;

public final class zzg
  extends zzbg
{
  private final AdListener zza;
  
  public zzg(AdListener paramAdListener)
  {
    this.zza = paramAdListener;
  }
  
  public final AdListener zzb()
  {
    return this.zza;
  }
  
  public final void zzc()
  {
    AdListener localAdListener = this.zza;
    if (localAdListener != null) {
      localAdListener.onAdClicked();
    }
  }
  
  public final void zzd()
  {
    AdListener localAdListener = this.zza;
    if (localAdListener != null) {
      localAdListener.onAdClosed();
    }
  }
  
  public final void zze(int paramInt) {}
  
  public final void zzf(zze paramzze)
  {
    AdListener localAdListener = this.zza;
    if (localAdListener != null) {
      localAdListener.onAdFailedToLoad(paramzze.zzb());
    }
  }
  
  public final void zzg()
  {
    AdListener localAdListener = this.zza;
    if (localAdListener != null) {
      localAdListener.onAdImpression();
    }
  }
  
  public final void zzh() {}
  
  public final void zzi()
  {
    AdListener localAdListener = this.zza;
    if (localAdListener != null) {
      localAdListener.onAdLoaded();
    }
  }
  
  public final void zzj()
  {
    AdListener localAdListener = this.zza;
    if (localAdListener != null) {
      localAdListener.onAdOpened();
    }
  }
  
  public final void zzk()
  {
    AdListener localAdListener = this.zza;
    if (localAdListener != null) {
      localAdListener.onAdSwipeGestureClicked();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */