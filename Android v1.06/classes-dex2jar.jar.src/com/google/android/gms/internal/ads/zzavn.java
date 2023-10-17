package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzfe;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzavn
  extends AppOpenAd
{
  FullScreenContentCallback zza;
  private final zzavr zzb;
  private final String zzc;
  private final zzavo zzd = new zzavo();
  private OnPaidEventListener zze;
  
  public zzavn(zzavr paramzzavr, String paramString)
  {
    this.zzb = paramzzavr;
    this.zzc = paramString;
  }
  
  public final String getAdUnitId()
  {
    return this.zzc;
  }
  
  public final FullScreenContentCallback getFullScreenContentCallback()
  {
    return this.zza;
  }
  
  public final OnPaidEventListener getOnPaidEventListener()
  {
    return this.zze;
  }
  
  public final ResponseInfo getResponseInfo()
  {
    zzdn localzzdn2;
    try
    {
      zzdn localzzdn1 = this.zzb.zzf();
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzl("#007 Could not call remote method.", localRemoteException);
      localzzdn2 = null;
    }
    return ResponseInfo.zzb(localzzdn2);
  }
  
  public final void setFullScreenContentCallback(FullScreenContentCallback paramFullScreenContentCallback)
  {
    this.zza = paramFullScreenContentCallback;
    this.zzd.zzg(paramFullScreenContentCallback);
  }
  
  public final void setImmersiveMode(boolean paramBoolean)
  {
    try
    {
      this.zzb.zzg(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzl("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void setOnPaidEventListener(OnPaidEventListener paramOnPaidEventListener)
  {
    this.zze = paramOnPaidEventListener;
    try
    {
      zzavr localzzavr = this.zzb;
      zzfe localzzfe = new com/google/android/gms/ads/internal/client/zzfe;
      localzzfe.<init>(paramOnPaidEventListener);
      localzzavr.zzh(localzzfe);
      return;
    }
    catch (RemoteException paramOnPaidEventListener)
    {
      zzbzt.zzl("#007 Could not call remote method.", paramOnPaidEventListener);
    }
  }
  
  public final void show(Activity paramActivity)
  {
    try
    {
      this.zzb.zzi(ObjectWrapper.wrap(paramActivity), this.zzd);
      return;
    }
    catch (RemoteException paramActivity)
    {
      zzbzt.zzl("#007 Could not call remote method.", paramActivity);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzavn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */