package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardItem;

final class zzbqi
  implements MediationBannerAdCallback, MediationInterstitialAdCallback, MediationRewardedAdCallback, MediationNativeAdCallback, MediationAppOpenAdCallback
{
  final zzboe zza;
  
  zzbqi(zzboe paramzzboe)
  {
    this.zza = paramzzboe;
  }
  
  public final void onAdClosed()
  {
    try
    {
      this.zza.zzf();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;) {}
    }
  }
  
  public final void onAdFailedToShow(AdError paramAdError)
  {
    try
    {
      int i = paramAdError.getCode();
      String str1 = paramAdError.getMessage();
      String str2 = paramAdError.getDomain();
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append("Mediated ad failed to show: Error Code = ");
      localStringBuilder.append(i);
      localStringBuilder.append(". Error Message = ");
      localStringBuilder.append(str1);
      localStringBuilder.append(" Error Domain = ");
      localStringBuilder.append(str2);
      zzbzt.zzj(localStringBuilder.toString());
      this.zza.zzk(paramAdError.zza());
      return;
    }
    catch (RemoteException paramAdError)
    {
      for (;;) {}
    }
  }
  
  public final void onAdFailedToShow(String paramString)
  {
    try
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append("Mediated ad failed to show: ");
      localStringBuilder.append(paramString);
      zzbzt.zzj(localStringBuilder.toString());
      this.zza.zzl(paramString);
      return;
    }
    catch (RemoteException paramString)
    {
      for (;;) {}
    }
  }
  
  public final void onAdLeftApplication()
  {
    try
    {
      this.zza.zzn();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;) {}
    }
  }
  
  public final void onAdOpened()
  {
    try
    {
      this.zza.zzp();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;) {}
    }
  }
  
  public final void onUserEarnedReward(RewardItem paramRewardItem)
  {
    try
    {
      zzboe localzzboe = this.zza;
      zzbwg localzzbwg = new com/google/android/gms/internal/ads/zzbwg;
      localzzbwg.<init>(paramRewardItem);
      localzzboe.zzt(localzzbwg);
      return;
    }
    catch (RemoteException paramRewardItem)
    {
      for (;;) {}
    }
  }
  
  public final void onVideoComplete()
  {
    try
    {
      this.zza.zzv();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;) {}
    }
  }
  
  public final void onVideoMute() {}
  
  public final void onVideoPause()
  {
    try
    {
      this.zza.zzw();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;) {}
    }
  }
  
  public final void onVideoPlay()
  {
    try
    {
      this.zza.zzx();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;) {}
    }
  }
  
  public final void onVideoStart()
  {
    try
    {
      this.zza.zzy();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;) {}
    }
  }
  
  public final void onVideoUnmute() {}
  
  public final void reportAdClicked()
  {
    try
    {
      this.zza.zze();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;) {}
    }
  }
  
  public final void reportAdImpression()
  {
    try
    {
      this.zza.zzm();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;) {}
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbqi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */