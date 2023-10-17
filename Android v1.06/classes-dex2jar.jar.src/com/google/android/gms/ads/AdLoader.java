package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomClickListener;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.ads.formats.UnifiedNativeAd.OnUnifiedNativeAdLoadedListener;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbn;
import com.google.android.gms.ads.internal.client.zzbq;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzeu;
import com.google.android.gms.ads.internal.client.zzfl;
import com.google.android.gms.ads.internal.client.zzg;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd.OnCustomClickListener;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd.OnCustomFormatAdLoadedListener;
import com.google.android.gms.internal.ads.zzbbc;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbcp;
import com.google.android.gms.internal.ads.zzbdb;
import com.google.android.gms.internal.ads.zzbee;
import com.google.android.gms.internal.ads.zzbgv;
import com.google.android.gms.internal.ads.zzbgx;
import com.google.android.gms.internal.ads.zzbgy;
import com.google.android.gms.internal.ads.zzbri;
import com.google.android.gms.internal.ads.zzbrk;
import com.google.android.gms.internal.ads.zzbzi;
import com.google.android.gms.internal.ads.zzbzt;
import java.util.concurrent.ExecutorService;

public class AdLoader
{
  private final zzp zza;
  private final Context zzb;
  private final zzbn zzc;
  
  AdLoader(Context paramContext, zzbn paramzzbn, zzp paramzzp)
  {
    this.zzb = paramContext;
    this.zzc = paramzzbn;
    this.zza = paramzzp;
  }
  
  private final void zzb(zzdx paramzzdx)
  {
    zzbbk.zza(this.zzb);
    if (((Boolean)zzbdb.zzc.zze()).booleanValue())
    {
      zzbbc localzzbbc = zzbbk.zzjG;
      if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue())
      {
        zzbzi.zzb.execute(new zza(this, paramzzdx));
        return;
      }
    }
    try
    {
      this.zzc.zzg(this.zza.zza(this.zzb, paramzzdx));
      return;
    }
    catch (RemoteException paramzzdx)
    {
      zzbzt.zzh("Failed to load ad.", paramzzdx);
    }
  }
  
  public boolean isLoading()
  {
    try
    {
      boolean bool = this.zzc.zzi();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzk("Failed to check if ad is loading.", localRemoteException);
    }
    return false;
  }
  
  public void loadAd(AdRequest paramAdRequest)
  {
    zzb(paramAdRequest.zza);
  }
  
  public void loadAd(AdManagerAdRequest paramAdManagerAdRequest)
  {
    zzb(paramAdManagerAdRequest.zza);
  }
  
  public void loadAds(AdRequest paramAdRequest, int paramInt)
  {
    paramAdRequest = paramAdRequest.zza;
    try
    {
      this.zzc.zzh(this.zza.zza(this.zzb, paramAdRequest), paramInt);
      return;
    }
    catch (RemoteException paramAdRequest)
    {
      zzbzt.zzh("Failed to load ads.", paramAdRequest);
    }
  }
  
  public static class Builder
  {
    private final Context zza;
    private final zzbq zzb;
    
    public Builder(Context paramContext, String paramString)
    {
      this.zza = localContext;
      this.zzb = paramContext;
    }
    
    public AdLoader build()
    {
      try
      {
        AdLoader localAdLoader = new AdLoader(this.zza, this.zzb.zze(), zzp.zza);
        return localAdLoader;
      }
      catch (RemoteException localRemoteException)
      {
        zzbzt.zzh("Failed to build AdLoader.", localRemoteException);
        zzeu localzzeu = new zzeu();
        return new AdLoader(this.zza, localzzeu.zzc(), zzp.zza);
      }
    }
    
    public Builder forAdManagerAdView(OnAdManagerAdViewLoadedListener paramOnAdManagerAdViewLoadedListener, AdSize... paramVarArgs)
    {
      if ((paramVarArgs != null) && (paramVarArgs.length > 0))
      {
        try
        {
          zzq localzzq = new com/google/android/gms/ads/internal/client/zzq;
          localzzq.<init>(this.zza, paramVarArgs);
          zzbq localzzbq = this.zzb;
          paramVarArgs = new com/google/android/gms/internal/ads/zzbgx;
          paramVarArgs.<init>(paramOnAdManagerAdViewLoadedListener);
          localzzbq.zzj(paramVarArgs, localzzq);
        }
        catch (RemoteException paramOnAdManagerAdViewLoadedListener)
        {
          zzbzt.zzk("Failed to add Google Ad Manager banner ad listener", paramOnAdManagerAdViewLoadedListener);
        }
        return this;
      }
      throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
    }
    
    public Builder forCustomFormatAd(String paramString, NativeCustomFormatAd.OnCustomFormatAdLoadedListener paramOnCustomFormatAdLoadedListener, NativeCustomFormatAd.OnCustomClickListener paramOnCustomClickListener)
    {
      paramOnCustomFormatAdLoadedListener = new zzbri(paramOnCustomFormatAdLoadedListener, paramOnCustomClickListener);
      try
      {
        this.zzb.zzh(paramString, paramOnCustomFormatAdLoadedListener.zzb(), paramOnCustomFormatAdLoadedListener.zza());
      }
      catch (RemoteException paramString)
      {
        zzbzt.zzk("Failed to add custom format ad listener", paramString);
      }
      return this;
    }
    
    @Deprecated
    public Builder forCustomTemplateAd(String paramString, NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener paramOnCustomTemplateAdLoadedListener, NativeCustomTemplateAd.OnCustomClickListener paramOnCustomClickListener)
    {
      paramOnCustomTemplateAdLoadedListener = new zzbgv(paramOnCustomTemplateAdLoadedListener, paramOnCustomClickListener);
      try
      {
        this.zzb.zzh(paramString, paramOnCustomTemplateAdLoadedListener.zze(), paramOnCustomTemplateAdLoadedListener.zzd());
      }
      catch (RemoteException paramString)
      {
        zzbzt.zzk("Failed to add custom template ad listener", paramString);
      }
      return this;
    }
    
    public Builder forNativeAd(NativeAd.OnNativeAdLoadedListener paramOnNativeAdLoadedListener)
    {
      try
      {
        zzbq localzzbq = this.zzb;
        zzbrk localzzbrk = new com/google/android/gms/internal/ads/zzbrk;
        localzzbrk.<init>(paramOnNativeAdLoadedListener);
        localzzbq.zzk(localzzbrk);
      }
      catch (RemoteException paramOnNativeAdLoadedListener)
      {
        zzbzt.zzk("Failed to add google native ad listener", paramOnNativeAdLoadedListener);
      }
      return this;
    }
    
    @Deprecated
    public Builder forUnifiedNativeAd(UnifiedNativeAd.OnUnifiedNativeAdLoadedListener paramOnUnifiedNativeAdLoadedListener)
    {
      try
      {
        zzbq localzzbq = this.zzb;
        zzbgy localzzbgy = new com/google/android/gms/internal/ads/zzbgy;
        localzzbgy.<init>(paramOnUnifiedNativeAdLoadedListener);
        localzzbq.zzk(localzzbgy);
      }
      catch (RemoteException paramOnUnifiedNativeAdLoadedListener)
      {
        zzbzt.zzk("Failed to add google native ad listener", paramOnUnifiedNativeAdLoadedListener);
      }
      return this;
    }
    
    public Builder withAdListener(AdListener paramAdListener)
    {
      try
      {
        zzbq localzzbq = this.zzb;
        zzg localzzg = new com/google/android/gms/ads/internal/client/zzg;
        localzzg.<init>(paramAdListener);
        localzzbq.zzl(localzzg);
      }
      catch (RemoteException paramAdListener)
      {
        zzbzt.zzk("Failed to set AdListener.", paramAdListener);
      }
      return this;
    }
    
    public Builder withAdManagerAdViewOptions(AdManagerAdViewOptions paramAdManagerAdViewOptions)
    {
      try
      {
        this.zzb.zzm(paramAdManagerAdViewOptions);
      }
      catch (RemoteException paramAdManagerAdViewOptions)
      {
        zzbzt.zzk("Failed to specify Ad Manager banner ad options", paramAdManagerAdViewOptions);
      }
      return this;
    }
    
    @Deprecated
    public Builder withNativeAdOptions(com.google.android.gms.ads.formats.NativeAdOptions paramNativeAdOptions)
    {
      try
      {
        zzbq localzzbq = this.zzb;
        zzbee localzzbee = new com/google/android/gms/internal/ads/zzbee;
        localzzbee.<init>(paramNativeAdOptions);
        localzzbq.zzo(localzzbee);
      }
      catch (RemoteException paramNativeAdOptions)
      {
        zzbzt.zzk("Failed to specify native ad options", paramNativeAdOptions);
      }
      return this;
    }
    
    public Builder withNativeAdOptions(com.google.android.gms.ads.nativead.NativeAdOptions paramNativeAdOptions)
    {
      try
      {
        zzbq localzzbq = this.zzb;
        zzbee localzzbee = new com/google/android/gms/internal/ads/zzbee;
        boolean bool2 = paramNativeAdOptions.shouldReturnUrlsForImageAssets();
        boolean bool1 = paramNativeAdOptions.shouldRequestMultipleImages();
        int i = paramNativeAdOptions.getAdChoicesPlacement();
        zzfl localzzfl;
        if (paramNativeAdOptions.getVideoOptions() != null)
        {
          localzzfl = new com/google/android/gms/ads/internal/client/zzfl;
          localzzfl.<init>(paramNativeAdOptions.getVideoOptions());
        }
        else
        {
          localzzfl = null;
        }
        localzzbee.<init>(4, bool2, -1, bool1, i, localzzfl, paramNativeAdOptions.zzc(), paramNativeAdOptions.getMediaAspectRatio(), paramNativeAdOptions.zza(), paramNativeAdOptions.zzb());
        localzzbq.zzo(localzzbee);
      }
      catch (RemoteException paramNativeAdOptions)
      {
        zzbzt.zzk("Failed to specify native ad options", paramNativeAdOptions);
      }
      return this;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\AdLoader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */