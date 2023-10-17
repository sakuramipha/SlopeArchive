package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class zzep
  extends zzb
  implements zzeq
{
  public zzep()
  {
    super("com.google.android.gms.nearby.internal.connection.IStartAdvertisingResultListener");
  }
  
  protected final boolean zza(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if (paramInt1 == 2)
    {
      zzb((zzfq)zzc.zzb(paramParcel1, zzfq.CREATOR));
      return true;
    }
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzep.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */