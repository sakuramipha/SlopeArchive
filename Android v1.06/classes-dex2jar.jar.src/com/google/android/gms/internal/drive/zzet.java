package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class zzet
  extends zzb
  implements zzes
{
  public zzet()
  {
    super("com.google.android.gms.drive.internal.IEventCallback");
  }
  
  protected final boolean dispatchTransaction(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if (paramInt1 == 1)
    {
      zzc((zzfp)zzc.zza(paramParcel1, zzfp.CREATOR));
      paramParcel2.writeNoException();
      return true;
    }
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzet.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */