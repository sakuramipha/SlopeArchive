package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks;

final class zzawd
  implements BaseGmsClient.BaseConnectionCallbacks
{
  final zzawf zza;
  
  zzawd(zzawf paramzzawf) {}
  
  public final void onConnected(Bundle arg1)
  {
    try
    {
      synchronized (zzawf.zze(this.zza))
      {
        zzawf localzzawf = this.zza;
        if (zzawf.zzc(localzzawf) != null) {
          zzawf.zzk(localzzawf, zzawf.zzc(localzzawf).zzq());
        }
      }
    }
    catch (DeadObjectException localDeadObjectException)
    {
      zzbzt.zzh("Unable to obtain a cache service instance.", localDeadObjectException);
      zzawf.zzh(this.zza);
      zzawf.zze(this.zza).notifyAll();
      return;
    }
  }
  
  public final void onConnectionSuspended(int paramInt)
  {
    synchronized (zzawf.zze(this.zza))
    {
      zzawf.zzk(this.zza, null);
      zzawf.zze(this.zza).notifyAll();
      return;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzawd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */