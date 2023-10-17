package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;

final class zzbqc
  implements MediationAdLoadCallback
{
  final zzbqh zzc;
  
  zzbqc(zzbqh paramzzbqh, zzbpm paramzzbpm, zzboe paramzzboe) {}
  
  public final void onFailure(AdError paramAdError)
  {
    try
    {
      this.zza.zzf(paramAdError.zza());
      return;
    }
    catch (RemoteException paramAdError)
    {
      zzbzt.zzh("", paramAdError);
    }
  }
  
  public final void onFailure(String paramString)
  {
    onFailure(new AdError(0, paramString, "undefined"));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbqc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */