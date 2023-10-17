package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class zzdy
  extends zzb
  implements zzdz
{
  public zzdy()
  {
    super("com.google.android.gms.nearby.internal.connection.IConnectionLifecycleListener");
  }
  
  protected final boolean zza(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if (paramInt1 != 2)
    {
      if (paramInt1 != 3)
      {
        if (paramInt1 != 4)
        {
          if (paramInt1 != 5) {
            return false;
          }
          zze((zzeu)zzc.zzb(paramParcel1, zzeu.CREATOR));
        }
        else
        {
          zzd((zzfe)zzc.zzb(paramParcel1, zzfe.CREATOR));
        }
      }
      else {
        zzc((zzfc)zzc.zzb(paramParcel1, zzfc.CREATOR));
      }
    }
    else {
      zzb((zzew)zzc.zzb(paramParcel1, zzew.CREATOR));
    }
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzdy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */