package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;

final class zzbqf
  implements SignalCallbacks
{
  zzbqf(zzbqh paramzzbqh, zzbpy paramzzbpy) {}
  
  public final void onFailure(AdError paramAdError)
  {
    try
    {
      this.zza.zzg(paramAdError.zza());
      return;
    }
    catch (RemoteException paramAdError)
    {
      zzbzt.zzh("", paramAdError);
    }
  }
  
  public final void onFailure(String paramString)
  {
    try
    {
      this.zza.zzf(paramString);
      return;
    }
    catch (RemoteException paramString)
    {
      zzbzt.zzh("", paramString);
    }
  }
  
  public final void onSuccess(String paramString)
  {
    try
    {
      this.zza.zze(paramString);
      return;
    }
    catch (RemoteException paramString)
    {
      zzbzt.zzh("", paramString);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbqf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */