package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener;

final class zzawe
  implements BaseGmsClient.BaseOnConnectionFailedListener
{
  final zzawf zza;
  
  zzawe(zzawf paramzzawf) {}
  
  public final void onConnectionFailed(ConnectionResult arg1)
  {
    synchronized (zzawf.zze(this.zza))
    {
      zzawf.zzk(this.zza, null);
      zzawf localzzawf = this.zza;
      if (zzawf.zzc(localzzawf) != null) {
        zzawf.zzf(localzzawf, null);
      }
      zzawf.zze(this.zza).notifyAll();
      return;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzawe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */