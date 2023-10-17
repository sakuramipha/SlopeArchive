package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.internal.client.zze;

public final class zzbwh
  extends zzbvr
{
  private FullScreenContentCallback zza;
  private OnUserEarnedRewardListener zzb;
  
  public final void zzb(FullScreenContentCallback paramFullScreenContentCallback)
  {
    this.zza = paramFullScreenContentCallback;
  }
  
  public final void zzc(OnUserEarnedRewardListener paramOnUserEarnedRewardListener)
  {
    this.zzb = paramOnUserEarnedRewardListener;
  }
  
  public final void zze()
  {
    FullScreenContentCallback localFullScreenContentCallback = this.zza;
    if (localFullScreenContentCallback != null) {
      localFullScreenContentCallback.onAdClicked();
    }
  }
  
  public final void zzf()
  {
    FullScreenContentCallback localFullScreenContentCallback = this.zza;
    if (localFullScreenContentCallback != null) {
      localFullScreenContentCallback.onAdImpression();
    }
  }
  
  public final void zzg()
  {
    FullScreenContentCallback localFullScreenContentCallback = this.zza;
    if (localFullScreenContentCallback != null) {
      localFullScreenContentCallback.onAdDismissedFullScreenContent();
    }
  }
  
  public final void zzh(int paramInt) {}
  
  public final void zzi(zze paramzze)
  {
    FullScreenContentCallback localFullScreenContentCallback = this.zza;
    if (localFullScreenContentCallback != null) {
      localFullScreenContentCallback.onAdFailedToShowFullScreenContent(paramzze.zza());
    }
  }
  
  public final void zzj()
  {
    FullScreenContentCallback localFullScreenContentCallback = this.zza;
    if (localFullScreenContentCallback != null) {
      localFullScreenContentCallback.onAdShowedFullScreenContent();
    }
  }
  
  public final void zzk(zzbvm paramzzbvm)
  {
    OnUserEarnedRewardListener localOnUserEarnedRewardListener = this.zzb;
    if (localOnUserEarnedRewardListener != null) {
      localOnUserEarnedRewardListener.onUserEarnedReward(new zzbvz(paramzzbvm));
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbwh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */