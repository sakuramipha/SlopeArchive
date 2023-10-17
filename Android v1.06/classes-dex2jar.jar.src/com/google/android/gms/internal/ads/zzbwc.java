package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdLoadCallback;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

public final class zzbwc
  extends zzbvv
{
  private final RewardedAdLoadCallback zza;
  private final RewardedAd zzb;
  
  public zzbwc(RewardedAdLoadCallback paramRewardedAdLoadCallback, RewardedAd paramRewardedAd)
  {
    this.zza = paramRewardedAdLoadCallback;
    this.zzb = paramRewardedAd;
  }
  
  public final void zze(int paramInt) {}
  
  public final void zzf(zze paramzze)
  {
    if (this.zza != null)
    {
      paramzze = paramzze.zzb();
      this.zza.onAdFailedToLoad(paramzze);
    }
  }
  
  public final void zzg()
  {
    RewardedAdLoadCallback localRewardedAdLoadCallback = this.zza;
    if (localRewardedAdLoadCallback != null) {
      localRewardedAdLoadCallback.onAdLoaded(this.zzb);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbwc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */