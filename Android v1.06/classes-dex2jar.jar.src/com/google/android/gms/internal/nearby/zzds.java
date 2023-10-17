package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class zzds
  extends zzb
  implements zzdt
{
  public zzds()
  {
    super("com.google.android.gms.nearby.internal.connection.IAdvertisingCallback");
  }
  
  protected final boolean zza(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if (paramInt1 != 2)
    {
      if (paramInt1 != 3) {
        return false;
      }
      paramParcel1 = (zzfs)zzc.zzb(paramParcel1, zzfs.CREATOR);
    }
    else
    {
      zzb((zzey)zzc.zzb(paramParcel1, zzey.CREATOR));
    }
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzds.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */