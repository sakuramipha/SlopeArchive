package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;

final class zzbos
  implements InitializationCompleteCallback
{
  zzbos(zzboy paramzzboy, zzbki paramzzbki) {}
  
  public final void onInitializationFailed(String paramString)
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
  
  public final void onInitializationSucceeded()
  {
    try
    {
      this.zza.zzf();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzh("", localRemoteException);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbos.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */