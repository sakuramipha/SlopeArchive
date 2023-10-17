package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class zzef
  extends zzb
  implements zzeg
{
  public zzef()
  {
    super("com.google.android.gms.nearby.internal.connection.IDiscoveryListener");
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
          zzb((zzfg)zzc.zzb(paramParcel1, zzfg.CREATOR));
        }
        else
        {
          paramParcel1 = (zzfu)zzc.zzb(paramParcel1, zzfu.CREATOR);
        }
      }
      else {
        zzd((zzfk)zzc.zzb(paramParcel1, zzfk.CREATOR));
      }
    }
    else {
      zzc((zzfi)zzc.zzb(paramParcel1, zzfi.CREATOR));
    }
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzef.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */