package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.RemoteException;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.internal.Preconditions;

public final class zzbjm
{
  private final Context zza;
  private final OnH5AdsEventListener zzb;
  private zzbji zzc;
  
  public zzbjm(Context paramContext, OnH5AdsEventListener paramOnH5AdsEventListener)
  {
    boolean bool;
    if (Build.VERSION.SDK_INT >= 21) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkState(bool, "Android version must be Lollipop or higher");
    Preconditions.checkNotNull(paramContext);
    Preconditions.checkNotNull(paramOnH5AdsEventListener);
    this.zza = paramContext;
    this.zzb = paramOnH5AdsEventListener;
    zzbbk.zza(paramContext);
  }
  
  public static final boolean zzc(String paramString)
  {
    zzbbc localzzbbc = zzbbk.zziY;
    if (!((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) {
      return false;
    }
    Preconditions.checkNotNull(paramString);
    int i = paramString.length();
    localzzbbc = zzbbk.zzja;
    if (i > ((Integer)zzba.zzc().zzb(localzzbbc)).intValue())
    {
      zzbzt.zze("H5 GMSG exceeds max length");
      return false;
    }
    paramString = Uri.parse(paramString);
    return ("gmsg".equals(paramString.getScheme())) && ("mobileads.google.com".equals(paramString.getHost())) && ("/h5ads".equals(paramString.getPath()));
  }
  
  private final void zzd()
  {
    if (this.zzc != null) {
      return;
    }
    this.zzc = zzay.zza().zzl(this.zza, new zzbnv(), this.zzb);
  }
  
  public final void zza()
  {
    Object localObject = zzbbk.zziY;
    if (!((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue()) {
      return;
    }
    zzd();
    localObject = this.zzc;
    if (localObject != null) {
      try
      {
        ((zzbji)localObject).zze();
        return;
      }
      catch (RemoteException localRemoteException)
      {
        zzbzt.zzl("#007 Could not call remote method.", localRemoteException);
      }
    }
  }
  
  public final boolean zzb(String paramString)
  {
    if (!zzc(paramString)) {
      return false;
    }
    zzd();
    zzbji localzzbji = this.zzc;
    if (localzzbji != null)
    {
      try
      {
        localzzbji.zzf(paramString);
      }
      catch (RemoteException paramString)
      {
        zzbzt.zzl("#007 Could not call remote method.", paramString);
      }
      return true;
    }
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbjm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */