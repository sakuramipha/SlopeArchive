package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbzt;

final class zzev
  implements Runnable
{
  final zzew zza;
  
  zzev(zzew paramzzew) {}
  
  public final void run()
  {
    zzew localzzew = this.zza;
    if (zzew.zzb(localzzew) != null) {
      try
      {
        zzew.zzb(localzzew).zze(1);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        zzbzt.zzk("Could not notify onAdFailedToLoad event.", localRemoteException);
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzev.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */