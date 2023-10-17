package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbe;

public final class zzejj
  implements zza, zzdcw
{
  private zzbe zza;
  
  public final void onAdClicked()
  {
    try
    {
      zzbe localzzbe = this.zza;
      if (localzzbe != null) {
        try
        {
          localzzbe.zzb();
          return;
        }
        catch (RemoteException localRemoteException)
        {
          zzbzt.zzk("Remote Exception at onAdClicked.", localRemoteException);
          return;
        }
      }
      return;
    }
    finally {}
  }
  
  public final void zza(zzbe paramzzbe)
  {
    try
    {
      this.zza = paramzzbe;
      return;
    }
    finally
    {
      paramzzbe = finally;
      throw paramzzbe;
    }
  }
  
  public final void zzr()
  {
    try
    {
      zzbe localzzbe = this.zza;
      if (localzzbe != null) {
        try
        {
          localzzbe.zzb();
          return;
        }
        catch (RemoteException localRemoteException)
        {
          zzbzt.zzk("Remote Exception at onPhysicalClick.", localRemoteException);
          return;
        }
      }
      return;
    }
    finally {}
  }
  
  public final void zzs() {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzejj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */