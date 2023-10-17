package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

final class zzac
  implements IGmsServiceBroker
{
  private final IBinder zza;
  
  zzac(IBinder paramIBinder)
  {
    this.zza = paramIBinder;
  }
  
  public final IBinder asBinder()
  {
    return this.zza;
  }
  
  public final void getService(IGmsCallbacks paramIGmsCallbacks, GetServiceRequest paramGetServiceRequest)
    throws RemoteException
  {
    Parcel localParcel2 = Parcel.obtain();
    Parcel localParcel1 = Parcel.obtain();
    try
    {
      localParcel2.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      if (paramIGmsCallbacks != null) {
        paramIGmsCallbacks = paramIGmsCallbacks.asBinder();
      } else {
        paramIGmsCallbacks = null;
      }
      localParcel2.writeStrongBinder(paramIGmsCallbacks);
      if (paramGetServiceRequest != null)
      {
        localParcel2.writeInt(1);
        zzm.zza(paramGetServiceRequest, localParcel2, 0);
      }
      else
      {
        localParcel2.writeInt(0);
      }
      this.zza.transact(46, localParcel2, localParcel1, 0);
      localParcel1.readException();
      return;
    }
    finally
    {
      localParcel1.recycle();
      localParcel2.recycle();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\zzac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */