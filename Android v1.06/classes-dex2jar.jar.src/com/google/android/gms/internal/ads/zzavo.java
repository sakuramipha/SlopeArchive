package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.internal.client.zze;

public final class zzavo
  extends zzavx
{
  private FullScreenContentCallback zza;
  
  public final void zzb()
  {
    FullScreenContentCallback localFullScreenContentCallback = this.zza;
    if (localFullScreenContentCallback != null) {
      localFullScreenContentCallback.onAdClicked();
    }
  }
  
  public final void zzc()
  {
    FullScreenContentCallback localFullScreenContentCallback = this.zza;
    if (localFullScreenContentCallback != null) {
      localFullScreenContentCallback.onAdDismissedFullScreenContent();
    }
  }
  
  public final void zzd(zze paramzze)
  {
    FullScreenContentCallback localFullScreenContentCallback = this.zza;
    if (localFullScreenContentCallback != null) {
      localFullScreenContentCallback.onAdFailedToShowFullScreenContent(paramzze.zza());
    }
  }
  
  public final void zze()
  {
    FullScreenContentCallback localFullScreenContentCallback = this.zza;
    if (localFullScreenContentCallback != null) {
      localFullScreenContentCallback.onAdImpression();
    }
  }
  
  public final void zzf()
  {
    FullScreenContentCallback localFullScreenContentCallback = this.zza;
    if (localFullScreenContentCallback != null) {
      localFullScreenContentCallback.onAdShowedFullScreenContent();
    }
  }
  
  public final void zzg(FullScreenContentCallback paramFullScreenContentCallback)
  {
    this.zza = paramFullScreenContentCallback;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzavo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */