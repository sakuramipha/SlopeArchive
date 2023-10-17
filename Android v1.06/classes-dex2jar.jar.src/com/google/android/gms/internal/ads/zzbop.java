package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.common.internal.Preconditions;

public final class zzbop
  implements MediationBannerAdCallback, MediationInterstitialAdCallback, MediationNativeAdCallback, MediationAppOpenAdCallback
{
  private final zzboe zza;
  
  public zzbop(zzboe paramzzboe)
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
    String str1 = paramAdError.getMessage();
    String str2 = paramAdError.getDomain();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Mediation ad failed to show: Error Code = ");
    localStringBuilder.append(i);
    localStringBuilder.append(". Error Message = ");
    localStringBuilder.append(str1);
    localStringBuilder.append(" Error Domain = ");
    localStringBuilder.append(str2);
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
  
  public final void onAdLeftApplication()
  {
    Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
    zzbzt.zze("Adapter called onAdLeftApplication.");
    try
    {
      this.zza.zzn();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzl("#007 Could not call remote method.", localRemoteException);
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
  
  public final void onVideoMute() {}
  
  public final void onVideoPause()
  {
    Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
    zzbzt.zze("Adapter called onVideoPause.");
    try
    {
      this.zza.zzw();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzl("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void onVideoPlay()
  {
    Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
    zzbzt.zze("Adapter called onVideoPlay.");
    try
    {
      this.zza.zzx();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzl("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void onVideoUnmute() {}
  
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


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbop.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */