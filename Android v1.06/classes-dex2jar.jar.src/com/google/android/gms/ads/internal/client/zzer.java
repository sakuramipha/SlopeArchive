package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbzt;

final class zzer
  implements Runnable
{
  final zzet zza;
  
  zzer(zzet paramzzet) {}
  
  public final void run()
  {
    zzeu localzzeu = this.zza.zza;
    if (zzeu.zzb(localzzeu) != null) {
      try
      {
        zzeu.zzb(localzzeu).zze(1);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        zzbzt.zzk("Could not notify onAdFailedToLoad event.", localRemoteException);
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */