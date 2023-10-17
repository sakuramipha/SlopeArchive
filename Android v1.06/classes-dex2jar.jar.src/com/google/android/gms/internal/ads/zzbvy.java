package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzfd;
import com.google.android.gms.ads.internal.client.zzfe;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.dynamic.ObjectWrapper;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class zzbvy
  extends RewardedAd
{
  private final String zza;
  private final zzbvp zzb;
  private final Context zzc;
  private final zzbwh zzd;
  private OnAdMetadataChangedListener zze;
  private OnPaidEventListener zzf;
  private FullScreenContentCallback zzg;
  
  public zzbvy(Context paramContext, String paramString)
  {
    this.zzc = paramContext.getApplicationContext();
    this.zza = paramString;
    this.zzb = zzay.zza().zzq(paramContext, paramString, new zzbnv());
    this.zzd = new zzbwh();
  }
  
  public final Bundle getAdMetadata()
  {
    try
    {
      Object localObject = this.zzb;
      if (localObject != null)
      {
        localObject = ((zzbvp)localObject).zzb();
        return (Bundle)localObject;
      }
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzl("#007 Could not call remote method.", localRemoteException);
    }
    return new Bundle();
  }
  
  public final String getAdUnitId()
  {
    return this.zza;
  }
  
  public final FullScreenContentCallback getFullScreenContentCallback()
  {
    return this.zzg;
  }
  
  public final OnAdMetadataChangedListener getOnAdMetadataChangedListener()
  {
    return this.zze;
  }
  
  public final OnPaidEventListener getOnPaidEventListener()
  {
    return this.zzf;
  }
  
  public final ResponseInfo getResponseInfo()
  {
    Object localObject3 = null;
    Object localObject2;
    try
    {
      zzbvp localzzbvp = this.zzb;
      Object localObject1 = localObject3;
      if (localzzbvp != null) {
        localObject1 = localzzbvp.zzc();
      }
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzl("#007 Could not call remote method.", localRemoteException);
      localObject2 = localObject3;
    }
    return ResponseInfo.zzb((zzdn)localObject2);
  }
  
  public final RewardItem getRewardItem()
  {
    try
    {
      Object localObject = this.zzb;
      if (localObject != null) {
        localObject = ((zzbvp)localObject).zzd();
      } else {
        localObject = null;
      }
      if (localObject == null) {
        localObject = RewardItem.DEFAULT_REWARD;
      } else {
        localObject = new zzbvz((zzbvm)localObject);
      }
      return (RewardItem)localObject;
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzl("#007 Could not call remote method.", localRemoteException);
    }
    return RewardItem.DEFAULT_REWARD;
  }
  
  public final void setFullScreenContentCallback(FullScreenContentCallback paramFullScreenContentCallback)
  {
    this.zzg = paramFullScreenContentCallback;
    this.zzd.zzb(paramFullScreenContentCallback);
  }
  
  public final void setImmersiveMode(boolean paramBoolean)
  {
    try
    {
      zzbvp localzzbvp = this.zzb;
      if (localzzbvp != null) {
        localzzbvp.zzh(paramBoolean);
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzl("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void setOnAdMetadataChangedListener(OnAdMetadataChangedListener paramOnAdMetadataChangedListener)
  {
    try
    {
      this.zze = paramOnAdMetadataChangedListener;
      zzbvp localzzbvp = this.zzb;
      if (localzzbvp != null)
      {
        zzfd localzzfd = new com/google/android/gms/ads/internal/client/zzfd;
        localzzfd.<init>(paramOnAdMetadataChangedListener);
        localzzbvp.zzi(localzzfd);
      }
      return;
    }
    catch (RemoteException paramOnAdMetadataChangedListener)
    {
      zzbzt.zzl("#007 Could not call remote method.", paramOnAdMetadataChangedListener);
    }
  }
  
  public final void setOnPaidEventListener(OnPaidEventListener paramOnPaidEventListener)
  {
    try
    {
      this.zzf = paramOnPaidEventListener;
      zzbvp localzzbvp = this.zzb;
      if (localzzbvp != null)
      {
        zzfe localzzfe = new com/google/android/gms/ads/internal/client/zzfe;
        localzzfe.<init>(paramOnPaidEventListener);
        localzzbvp.zzj(localzzfe);
      }
      return;
    }
    catch (RemoteException paramOnPaidEventListener)
    {
      zzbzt.zzl("#007 Could not call remote method.", paramOnPaidEventListener);
    }
  }
  
  public final void setServerSideVerificationOptions(ServerSideVerificationOptions paramServerSideVerificationOptions)
  {
    if (paramServerSideVerificationOptions != null) {
      try
      {
        zzbvp localzzbvp = this.zzb;
        if (localzzbvp != null)
        {
          zzbwd localzzbwd = new com/google/android/gms/internal/ads/zzbwd;
          localzzbwd.<init>(paramServerSideVerificationOptions);
          localzzbvp.zzl(localzzbwd);
          return;
        }
      }
      catch (RemoteException paramServerSideVerificationOptions)
      {
        zzbzt.zzl("#007 Could not call remote method.", paramServerSideVerificationOptions);
      }
    }
  }
  
  public final void show(Activity paramActivity, OnUserEarnedRewardListener paramOnUserEarnedRewardListener)
  {
    this.zzd.zzc(paramOnUserEarnedRewardListener);
    if (paramActivity == null) {
      zzbzt.zzj("The activity for show is null, will proceed with show using the context provided when loading the ad.");
    }
    try
    {
      paramOnUserEarnedRewardListener = this.zzb;
      if (paramOnUserEarnedRewardListener != null)
      {
        paramOnUserEarnedRewardListener.zzk(this.zzd);
        this.zzb.zzm(ObjectWrapper.wrap(paramActivity));
      }
      return;
    }
    catch (RemoteException paramActivity)
    {
      zzbzt.zzl("#007 Could not call remote method.", paramActivity);
    }
  }
  
  public final void zza(zzdx paramzzdx, RewardedAdLoadCallback paramRewardedAdLoadCallback)
  {
    try
    {
      zzbvp localzzbvp = this.zzb;
      if (localzzbvp != null)
      {
        paramzzdx = zzp.zza.zza(this.zzc, paramzzdx);
        zzbwc localzzbwc = new com/google/android/gms/internal/ads/zzbwc;
        localzzbwc.<init>(paramRewardedAdLoadCallback, this);
        localzzbvp.zzf(paramzzdx, localzzbwc);
      }
      return;
    }
    catch (RemoteException paramzzdx)
    {
      zzbzt.zzl("#007 Could not call remote method.", paramzzdx);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbvy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */