package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdLoadCallback;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;

public final class zzbwi
  extends zzbvv
{
  private final RewardedInterstitialAdLoadCallback zza;
  private final zzbwj zzb;
  
  public zzbwi(RewardedInterstitialAdLoadCallback paramRewardedInterstitialAdLoadCallback, zzbwj paramzzbwj)
  {
    this.zza = paramRewardedInterstitialAdLoadCallback;
    this.zzb = paramzzbwj;
  }
  
  public final void zze(int paramInt) {}
  
  public final void zzf(zze paramzze)
  {
    RewardedInterstitialAdLoadCallback localRewardedInterstitialAdLoadCallback = this.zza;
    if (localRewardedInterstitialAdLoadCallback != null) {
      localRewardedInterstitialAdLoadCallback.onAdFailedToLoad(paramzze.zzb());
    }
  }
  
  public final void zzg()
  {
    RewardedInterstitialAdLoadCallback localRewardedInterstitialAdLoadCallback = this.zza;
    if (localRewardedInterstitialAdLoadCallback != null)
    {
      zzbwj localzzbwj = this.zzb;
      if (localzzbwj != null) {
        localRewardedInterstitialAdLoadCallback.onAdLoaded(localzzbwj);
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbwi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */