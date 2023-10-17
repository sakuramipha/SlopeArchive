package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.common.internal.Preconditions;

public final class zzbwf
  implements MediationRewardedAdCallback
{
  private final zzboe zza;
  
  public zzbwf(zzboe paramzzboe)
  {
    this.zza = paramzzboe;
  }
  
  public final void onAdClosed()
  {
    Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
    zzbzt.zze("Adapter called onAdClosed.");
    try
    {
      this.zza.zzf();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzl("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void onAdFailedToShow(AdError paramAdError)
  {
    Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
    zzbzt.zze("Adapter called onAdFailedToShow.");
    int i = paramAdError.getCode();
    String str2 = paramAdError.getMessage();
    String str1 = paramAdError.getDomain();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Mediation ad failed to show: Error Code = ");
    localStringBuilder.append(i);
    localStringBuilder.append(". Error Message = ");
    localStringBuilder.append(str2);
    localStringBuilder.append(" Error Domain = ");
    localStringBuilder.append(str1);
    zzbzt.zzj(localStringBuilder.toString());
    try
    {
      this.zza.zzk(paramAdError.zza());
      return;
    }
    catch (RemoteException paramAdError)
    {
      zzbzt.zzl("#007 Could not call remote method.", paramAdError);
    }
  }
  
  public final void onAdFailedToShow(String paramString)
  {
    Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
    zzbzt.zze("Adapter called onAdFailedToShow.");
    zzbzt.zzj("Mediation ad failed to show: ".concat(String.valueOf(paramString)));
    try
    {
      this.zza.zzl(paramString);
      return;
    }
    catch (RemoteException paramString)
    {
      zzbzt.zzl("#007 Could not call remote method.", paramString);
    }
  }
  
  public final void onAdOpened()
  {
    Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
    zzbzt.zze("Adapter called onAdOpened.");
    try
    {
      this.zza.zzp();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzl("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void onUserEarnedReward(RewardItem paramRewardItem)
  {
    Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
    zzbzt.zze("Adapter called onUserEarnedReward.");
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
      zzbzt.zzl("#007 Could not call remote method.", paramRewardItem);
    }
  }
  
  public final void onVideoComplete()
  {
    Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
    zzbzt.zze("Adapter called onVideoComplete.");
    try
    {
      this.zza.zzu();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzl("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void onVideoStart()
  {
    Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
    zzbzt.zze("Adapter called onVideoStart.");
    try
    {
      this.zza.zzy();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzl("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void reportAdClicked()
  {
    Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
    zzbzt.zze("Adapter called reportAdClicked.");
    try
    {
      this.zza.zze();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzl("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void reportAdImpression()
  {
    Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
    zzbzt.zze("Adapter called reportAdImpression.");
    try
    {
      this.zza.zzm();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzl("#007 Could not call remote method.", localRemoteException);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbwf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */