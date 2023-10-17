package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzg;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzbgx
  extends zzbga
{
  private final OnAdManagerAdViewLoadedListener zza;
  
  public zzbgx(OnAdManagerAdViewLoadedListener paramOnAdManagerAdViewLoadedListener)
  {
    this.zza = paramOnAdManagerAdViewLoadedListener;
  }
  
  public final void zze(zzbu paramzzbu, IObjectWrapper paramIObjectWrapper)
  {
    if ((paramzzbu != null) && (paramIObjectWrapper != null))
    {
      AdManagerAdView localAdManagerAdView = new AdManagerAdView((Context)ObjectWrapper.unwrap(paramIObjectWrapper));
      Object localObject = null;
      try
      {
        if ((paramzzbu.zzi() instanceof zzg))
        {
          paramIObjectWrapper = (zzg)paramzzbu.zzi();
          if (paramIObjectWrapper != null) {
            paramIObjectWrapper = paramIObjectWrapper.zzb();
          } else {
            paramIObjectWrapper = null;
          }
          localAdManagerAdView.setAdListener(paramIObjectWrapper);
        }
      }
      catch (RemoteException paramIObjectWrapper)
      {
        zzbzt.zzh("", paramIObjectWrapper);
      }
      try
      {
        if ((paramzzbu.zzj() instanceof zzaum))
        {
          zzaum localzzaum = (zzaum)paramzzbu.zzj();
          paramIObjectWrapper = (IObjectWrapper)localObject;
          if (localzzaum != null) {
            paramIObjectWrapper = localzzaum.zzb();
          }
          localAdManagerAdView.setAppEventListener(paramIObjectWrapper);
        }
      }
      catch (RemoteException paramIObjectWrapper)
      {
        zzbzt.zzh("", paramIObjectWrapper);
      }
      zzbzm.zza.post(new zzbgw(this, localAdManagerAdView, paramzzbu));
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbgx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */