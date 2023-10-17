package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class zzdv
  extends zzb
  implements zzdw
{
  public zzdv()
  {
    super("com.google.android.gms.nearby.internal.connection.IConnectionEventListener");
  }
  
  protected final boolean zza(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if (paramInt1 != 2)
    {
      if (paramInt1 != 3)
      {
        if (paramInt1 != 4) {
          return false;
        }
        paramParcel1 = (zzfo)zzc.zzb(paramParcel1, zzfo.CREATOR);
      }
      else
      {
        zzc((zzfe)zzc.zzb(paramParcel1, zzfe.CREATOR));
      }
    }
    else {
      zzb((zzfm)zzc.zzb(paramParcel1, zzfm.CREATOR));
    }
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzdv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */