package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.common.internal.Preconditions;

public final class zzbpa
  implements MediationBannerListener, MediationInterstitialListener, MediationNativeListener
{
  private final zzboe zza;
  private UnifiedNativeAdMapper zzb;
  private NativeCustomTemplateAd zzc;
  
  public zzbpa(zzboe paramzzboe)
  {
    this.zza = paramzzboe;
  }
  
  public final void onAdClicked(MediationBannerAdapter paramMediationBannerAdapter)
  {
    Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
    zzbzt.zze("Adapter called onAdClicked.");
    try
    {
      this.zza.zze();
      return;
    }
    catch (RemoteException paramMediationBannerAdapter)
    {
      zzbzt.zzl("#007 Could not call remote method.", paramMediationBannerAdapter);
    }
  }
  
  public final void onAdClicked(MediationInterstitialAdapter paramMediationInterstitialAdapter)
  {
    Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
    zzbzt.zze("Adapter called onAdClicked.");
    try
    {
      this.zza.zze();
      return;
    }
    catch (RemoteException paramMediationInterstitialAdapter)
    {
      zzbzt.zzl("#007 Could not call remote method.", paramMediationInterstitialAdapter);
    }
  }
  
  public final void onAdClicked(MediationNativeAdapter paramMediationNativeAdapter)
  {
    Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
    paramMediationNativeAdapter = this.zzb;
    if (this.zzc == null)
    {
      if (paramMediationNativeAdapter == null)
      {
        zzbzt.zzl("#007 Could not call remote method.", null);
        return;
      }
      if (!paramMediationNativeAdapter.getOverrideClickHandling())
      {
        zzbzt.zze("Could not call onAdClicked since setOverrideClickHandling is not set to true");
        return;
      }
    }
    zzbzt.zze("Adapter called onAdClicked.");
    try
    {
      this.zza.zze();
      return;
    }
    catch (RemoteException paramMediationNativeAdapter)
    {
      zzbzt.zzl("#007 Could not call remote method.", paramMediationNativeAdapter);
    }
  }
  
  public final void onAdClosed(MediationBannerAdapter paramMediationBannerAdapter)
  {
    Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
    zzbzt.zze("Adapter called onAdClosed.");
    try
    {
      this.zza.zzf();
      return;
    }
    catch (RemoteException paramMediationBannerAdapter)
    {
      zzbzt.zzl("#007 Could not call remote method.", paramMediationBannerAdapter);
    }
  }
  
  public final void onAdClosed(MediationInterstitialAdapter paramMediationInterstitialAdapter)
  {
    Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
    zzbzt.zze("Adapter called onAdClosed.");
    try
    {
      this.zza.zzf();
      return;
    }
    catch (RemoteException paramMediationInterstitialAdapter)
    {
      zzbzt.zzl("#007 Could not call remote method.", paramMediationInterstitialAdapter);
    }
  }
  
  public final void onAdClosed(MediationNativeAdapter paramMediationNativeAdapter)
  {
    Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
    zzbzt.zze("Adapter called onAdClosed.");
    try
    {
      this.zza.zzf();
      return;
    }
    catch (RemoteException paramMediationNativeAdapter)
    {
      zzbzt.zzl("#007 Could not call remote method.", paramMediationNativeAdapter);
    }
  }
  
  public final void onAdFailedToLoad(MediationBannerAdapter paramMediationBannerAdapter, int paramInt)
  {
    Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
    paramMediationBannerAdapter = new StringBuilder();
    paramMediationBannerAdapter.append("Adapter called onAdFailedToLoad with error. ");
    paramMediationBannerAdapter.append(paramInt);
    zzbzt.zze(paramMediationBannerAdapter.toString());
    try
    {
      this.zza.zzg(paramInt);
      return;
    }
    catch (RemoteException paramMediationBannerAdapter)
    {
      zzbzt.zzl("#007 Could not call remote method.", paramMediationBannerAdapter);
    }
  }
  
  public final void onAdFailedToLoad(MediationBannerAdapter paramMediationBannerAdapter, AdError paramAdError)
  {
    Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
    int i = paramAdError.getCode();
    String str = paramAdError.getMessage();
    paramMediationBannerAdapter = paramAdError.getDomain();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
    localStringBuilder.append(i);
    localStringBuilder.append(". ErrorMessage: ");
    localStringBuilder.append(str);
    localStringBuilder.append(". ErrorDomain: ");
    localStringBuilder.append(paramMediationBannerAdapter);
    zzbzt.zze(localStringBuilder.toString());
    try
    {
      this.zza.zzh(paramAdError.zza());
      return;
    }
    catch (RemoteException paramMediationBannerAdapter)
    {
      zzbzt.zzl("#007 Could not call remote method.", paramMediationBannerAdapter);
    }
  }
  
  public final void onAdFailedToLoad(MediationInterstitialAdapter paramMediationInterstitialAdapter, int paramInt)
  {
    Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
    paramMediationInterstitialAdapter = new StringBuilder();
    paramMediationInterstitialAdapter.append("Adapter called onAdFailedToLoad with error ");
    paramMediationInterstitialAdapter.append(paramInt);
    paramMediationInterstitialAdapter.append(".");
    zzbzt.zze(paramMediationInterstitialAdapter.toString());
    try
    {
      this.zza.zzg(paramInt);
      return;
    }
    catch (RemoteException paramMediationInterstitialAdapter)
    {
      zzbzt.zzl("#007 Could not call remote method.", paramMediationInterstitialAdapter);
    }
  }
  
  public final void onAdFailedToLoad(MediationInterstitialAdapter paramMediationInterstitialAdapter, AdError paramAdError)
  {
    Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
    int i = paramAdError.getCode();
    paramMediationInterstitialAdapter = paramAdError.getMessage();
    String str = paramAdError.getDomain();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
    localStringBuilder.append(i);
    localStringBuilder.append(". ErrorMessage: ");
    localStringBuilder.append(paramMediationInterstitialAdapter);
    localStringBuilder.append(". ErrorDomain: ");
    localStringBuilder.append(str);
    zzbzt.zze(localStringBuilder.toString());
    try
    {
      this.zza.zzh(paramAdError.zza());
      return;
    }
    catch (RemoteException paramMediationInterstitialAdapter)
    {
      zzbzt.zzl("#007 Could not call remote method.", paramMediationInterstitialAdapter);
    }
  }
  
  public final void onAdFailedToLoad(MediationNativeAdapter paramMediationNativeAdapter, int paramInt)
  {
    Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
    paramMediationNativeAdapter = new StringBuilder();
    paramMediationNativeAdapter.append("Adapter called onAdFailedToLoad with error ");
    paramMediationNativeAdapter.append(paramInt);
    paramMediationNativeAdapter.append(".");
    zzbzt.zze(paramMediationNativeAdapter.toString());
    try
    {
      this.zza.zzg(paramInt);
      return;
    }
    catch (RemoteException paramMediationNativeAdapter)
    {
      zzbzt.zzl("#007 Could not call remote method.", paramMediationNativeAdapter);
    }
  }
  
  public final void onAdFailedToLoad(MediationNativeAdapter paramMediationNativeAdapter, AdError paramAdError)
  {
    Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
    int i = paramAdError.getCode();
    String str2 = paramAdError.getMessage();
    String str1 = paramAdError.getDomain();
    paramMediationNativeAdapter = new StringBuilder();
    paramMediationNativeAdapter.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
    paramMediationNativeAdapter.append(i);
    paramMediationNativeAdapter.append(". ErrorMessage: ");
    paramMediationNativeAdapter.append(str2);
    paramMediationNativeAdapter.append(". ErrorDomain: ");
    paramMediationNativeAdapter.append(str1);
    zzbzt.zze(paramMediationNativeAdapter.toString());
    try
    {
      this.zza.zzh(paramAdError.zza());
      return;
    }
    catch (RemoteException paramMediationNativeAdapter)
    {
      zzbzt.zzl("#007 Could not call remote method.", paramMediationNativeAdapter);
    }
  }
  
  public final void onAdImpression(MediationNativeAdapter paramMediationNativeAdapter)
  {
    Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
    paramMediationNativeAdapter = this.zzb;
    if (this.zzc == null)
    {
      if (paramMediationNativeAdapter == null)
      {
        zzbzt.zzl("#007 Could not call remote method.", null);
        return;
      }
      if (!paramMediationNativeAdapter.getOverrideImpressionRecording())
      {
        zzbzt.zze("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
        return;
      }
    }
    zzbzt.zze("Adapter called onAdImpression.");
    try
    {
      this.zza.zzm();
      return;
    }
    catch (RemoteException paramMediationNativeAdapter)
    {
      zzbzt.zzl("#007 Could not call remote method.", paramMediationNativeAdapter);
    }
  }
  
  public final void onAdLeftApplication(MediationBannerAdapter paramMediationBannerAdapter)
  {
    Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
    zzbzt.zze("Adapter called onAdLeftApplication.");
    try
    {
      this.zza.zzn();
      return;
    }
    catch (RemoteException paramMediationBannerAdapter)
    {
      zzbzt.zzl("#007 Could not call remote method.", paramMediationBannerAdapter);
    }
  }
  
  public final void onAdLeftApplication(MediationInterstitialAdapter paramMediationInterstitialAdapter)
  {
    Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
    zzbzt.zze("Adapter called onAdLeftApplication.");
    try
    {
      this.zza.zzn();
      return;
    }
    catch (RemoteException paramMediationInterstitialAdapter)
    {
      zzbzt.zzl("#007 Could not call remote method.", paramMediationInterstitialAdapter);
    }
  }
  
  public final void onAdLeftApplication(MediationNativeAdapter paramMediationNativeAdapter)
  {
    Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
    zzbzt.zze("Adapter called onAdLeftApplication.");
    try
    {
      this.zza.zzn();
      return;
    }
    catch (RemoteException paramMediationNativeAdapter)
    {
      zzbzt.zzl("#007 Could not call remote method.", paramMediationNativeAdapter);
    }
  }
  
  public final void onAdLoaded(MediationBannerAdapter paramMediationBannerAdapter)
  {
    Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
    zzbzt.zze("Adapter called onAdLoaded.");
    try
    {
      this.zza.zzo();
      return;
    }
    catch (RemoteException paramMediationBannerAdapter)
    {
      zzbzt.zzl("#007 Could not call remote method.", paramMediationBannerAdapter);
    }
  }
  
  public final void onAdLoaded(MediationInterstitialAdapter paramMediationInterstitialAdapter)
  {
    Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
    zzbzt.zze("Adapter called onAdLoaded.");
    try
    {
      this.zza.zzo();
      return;
    }
    catch (RemoteException paramMediationInterstitialAdapter)
    {
      zzbzt.zzl("#007 Could not call remote method.", paramMediationInterstitialAdapter);
    }
  }
  
  public final void onAdLoaded(MediationNativeAdapter paramMediationNativeAdapter, UnifiedNativeAdMapper paramUnifiedNativeAdMapper)
  {
    Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
    zzbzt.zze("Adapter called onAdLoaded.");
    this.zzb = paramUnifiedNativeAdMapper;
    if (!(paramMediationNativeAdapter instanceof AdMobAdapter))
    {
      paramMediationNativeAdapter = new VideoController();
      paramMediationNativeAdapter.zzb(new zzboo());
      if ((paramUnifiedNativeAdMapper != null) && (paramUnifiedNativeAdMapper.hasVideoContent())) {
        paramUnifiedNativeAdMapper.zze(paramMediationNativeAdapter);
      }
    }
    try
    {
      this.zza.zzo();
      return;
    }
    catch (RemoteException paramMediationNativeAdapter)
    {
      zzbzt.zzl("#007 Could not call remote method.", paramMediationNativeAdapter);
    }
  }
  
  public final void onAdOpened(MediationBannerAdapter paramMediationBannerAdapter)
  {
    Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
    zzbzt.zze("Adapter called onAdOpened.");
    try
    {
      this.zza.zzp();
      return;
    }
    catch (RemoteException paramMediationBannerAdapter)
    {
      zzbzt.zzl("#007 Could not call remote method.", paramMediationBannerAdapter);
    }
  }
  
  public final void onAdOpened(MediationInterstitialAdapter paramMediationInterstitialAdapter)
  {
    Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
    zzbzt.zze("Adapter called onAdOpened.");
    try
    {
      this.zza.zzp();
      return;
    }
    catch (RemoteException paramMediationInterstitialAdapter)
    {
      zzbzt.zzl("#007 Could not call remote method.", paramMediationInterstitialAdapter);
    }
  }
  
  public final void onAdOpened(MediationNativeAdapter paramMediationNativeAdapter)
  {
    Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
    zzbzt.zze("Adapter called onAdOpened.");
    try
    {
      this.zza.zzp();
      return;
    }
    catch (RemoteException paramMediationNativeAdapter)
    {
      zzbzt.zzl("#007 Could not call remote method.", paramMediationNativeAdapter);
    }
  }
  
  public final void onVideoEnd(MediationNativeAdapter paramMediationNativeAdapter)
  {
    Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
    zzbzt.zze("Adapter called onVideoEnd.");
    try
    {
      this.zza.zzv();
      return;
    }
    catch (RemoteException paramMediationNativeAdapter)
    {
      zzbzt.zzl("#007 Could not call remote method.", paramMediationNativeAdapter);
    }
  }
  
  public final NativeCustomTemplateAd zza()
  {
    return this.zzc;
  }
  
  public final UnifiedNativeAdMapper zzb()
  {
    return this.zzb;
  }
  
  public final void zzc(MediationNativeAdapter paramMediationNativeAdapter, NativeCustomTemplateAd paramNativeCustomTemplateAd)
  {
    Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
    zzbzt.zze("Adapter called onAdLoaded with template id ".concat(String.valueOf(paramNativeCustomTemplateAd.getCustomTemplateId())));
    this.zzc = paramNativeCustomTemplateAd;
    try
    {
      this.zza.zzo();
      return;
    }
    catch (RemoteException paramMediationNativeAdapter)
    {
      zzbzt.zzl("#007 Could not call remote method.", paramMediationNativeAdapter);
    }
  }
  
  public final void zzd(MediationBannerAdapter paramMediationBannerAdapter, String paramString1, String paramString2)
  {
    Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
    zzbzt.zze("Adapter called onAppEvent.");
    try
    {
      this.zza.zzq(paramString1, paramString2);
      return;
    }
    catch (RemoteException paramMediationBannerAdapter)
    {
      zzbzt.zzl("#007 Could not call remote method.", paramMediationBannerAdapter);
    }
  }
  
  public final void zze(MediationNativeAdapter paramMediationNativeAdapter, NativeCustomTemplateAd paramNativeCustomTemplateAd, String paramString)
  {
    if ((paramNativeCustomTemplateAd instanceof zzbfl)) {
      try
      {
        this.zza.zzr(((zzbfl)paramNativeCustomTemplateAd).zza(), paramString);
        return;
      }
      catch (RemoteException paramMediationNativeAdapter)
      {
        zzbzt.zzl("#007 Could not call remote method.", paramMediationNativeAdapter);
        return;
      }
    }
    zzbzt.zzj("Unexpected native custom template ad type.");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbpa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */