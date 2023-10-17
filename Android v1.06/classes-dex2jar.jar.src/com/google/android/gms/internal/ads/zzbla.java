package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdLoadCallback;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzfe;
import com.google.android.gms.ads.internal.client.zzh;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzbla
  extends AdManagerInterstitialAd
{
  private final Context zza;
  private final zzp zzb;
  private final zzbu zzc;
  private final String zzd;
  private final zzbnv zze;
  private AppEventListener zzf;
  private FullScreenContentCallback zzg;
  private OnPaidEventListener zzh;
  
  public zzbla(Context paramContext, String paramString)
  {
    zzbnv localzzbnv = new zzbnv();
    this.zze = localzzbnv;
    this.zza = paramContext;
    this.zzd = paramString;
    this.zzb = zzp.zza;
    this.zzc = zzay.zza().zze(paramContext, new zzq(), paramString, localzzbnv);
  }
  
  public final String getAdUnitId()
  {
    return this.zzd;
  }
  
  public final AppEventListener getAppEventListener()
  {
    return this.zzf;
  }
  
  public final FullScreenContentCallback getFullScreenContentCallback()
  {
    return this.zzg;
  }
  
  public final OnPaidEventListener getOnPaidEventListener()
  {
    return this.zzh;
  }
  
  public final ResponseInfo getResponseInfo()
  {
    Object localObject3 = null;
    Object localObject2;
    try
    {
      zzbu localzzbu = this.zzc;
      Object localObject1 = localObject3;
      if (localzzbu != null) {
        localObject1 = localzzbu.zzk();
      }
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzl("#007 Could not call remote method.", localRemoteException);
      localObject2 = localObject3;
    }
    return ResponseInfo.zzb((zzdn)localObject2);
  }
  
  public final void setAppEventListener(AppEventListener paramAppEventListener)
  {
    try
    {
      this.zzf = paramAppEventListener;
      zzbu localzzbu = this.zzc;
      if (localzzbu != null)
      {
        if (paramAppEventListener != null)
        {
          zzaum localzzaum = new com/google/android/gms/internal/ads/zzaum;
          localzzaum.<init>(paramAppEventListener);
          paramAppEventListener = localzzaum;
        }
        else
        {
          paramAppEventListener = null;
        }
        localzzbu.zzG(paramAppEventListener);
      }
      return;
    }
    catch (RemoteException paramAppEventListener)
    {
      zzbzt.zzl("#007 Could not call remote method.", paramAppEventListener);
    }
  }
  
  public final void setFullScreenContentCallback(FullScreenContentCallback paramFullScreenContentCallback)
  {
    try
    {
      this.zzg = paramFullScreenContentCallback;
      zzbu localzzbu = this.zzc;
      if (localzzbu != null)
      {
        zzbb localzzbb = new com/google/android/gms/ads/internal/client/zzbb;
        localzzbb.<init>(paramFullScreenContentCallback);
        localzzbu.zzJ(localzzbb);
      }
      return;
    }
    catch (RemoteException paramFullScreenContentCallback)
    {
      zzbzt.zzl("#007 Could not call remote method.", paramFullScreenContentCallback);
    }
  }
  
  public final void setImmersiveMode(boolean paramBoolean)
  {
    try
    {
      zzbu localzzbu = this.zzc;
      if (localzzbu != null) {
        localzzbu.zzL(paramBoolean);
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzl("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void setOnPaidEventListener(OnPaidEventListener paramOnPaidEventListener)
  {
    try
    {
      this.zzh = paramOnPaidEventListener;
      zzbu localzzbu = this.zzc;
      if (localzzbu != null)
      {
        zzfe localzzfe = new com/google/android/gms/ads/internal/client/zzfe;
        localzzfe.<init>(paramOnPaidEventListener);
        localzzbu.zzP(localzzfe);
      }
      return;
    }
    catch (RemoteException paramOnPaidEventListener)
    {
      zzbzt.zzl("#007 Could not call remote method.", paramOnPaidEventListener);
    }
  }
  
  public final void show(Activity paramActivity)
  {
    if (paramActivity == null) {
      zzbzt.zzj("The activity for show is null, will proceed with show using the context provided when loading the ad.");
    }
    try
    {
      zzbu localzzbu = this.zzc;
      if (localzzbu != null) {
        localzzbu.zzW(ObjectWrapper.wrap(paramActivity));
      }
      return;
    }
    catch (RemoteException paramActivity)
    {
      zzbzt.zzl("#007 Could not call remote method.", paramActivity);
    }
  }
  
  public final void zza(zzdx paramzzdx, AdLoadCallback paramAdLoadCallback)
  {
    try
    {
      zzbu localzzbu = this.zzc;
      if (localzzbu != null)
      {
        paramzzdx = this.zzb.zza(this.zza, paramzzdx);
        zzh localzzh = new com/google/android/gms/ads/internal/client/zzh;
        localzzh.<init>(paramAdLoadCallback, this);
        localzzbu.zzy(paramzzdx, localzzh);
      }
      return;
    }
    catch (RemoteException paramzzdx)
    {
      zzbzt.zzl("#007 Could not call remote method.", paramzzdx);
      paramAdLoadCallback.onAdFailedToLoad(new LoadAdError(0, "Internal Error.", "com.google.android.gms.ads", null, null));
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbla.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */