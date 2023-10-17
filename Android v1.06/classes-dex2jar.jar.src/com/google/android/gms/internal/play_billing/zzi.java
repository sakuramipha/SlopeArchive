package com.google.android.gms.internal.play_billing;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class zzi
  extends Binder
  implements IInterface
{
  protected zzi(String paramString)
  {
    attachInterface(this, "com.android.vending.billing.IInAppBillingServiceCallback");
  }
  
  public final IBinder asBinder()
  {
    return this;
  }
  
  public final boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if (paramInt1 > 16777215)
    {
      if (super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2)) {
        return true;
      }
    }
    else {
      paramParcel1.enforceInterface(getInterfaceDescriptor());
    }
    return zzb(paramInt1, paramParcel1, paramParcel2, paramInt2);
  }
  
  protected boolean zzb(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    throw null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\play_billing\zzi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */