package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zac;

public final class zam
  extends zaa
  implements IInterface
{
  zam(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
  }
  
  public final IObjectWrapper zae(IObjectWrapper paramIObjectWrapper, zax paramzax)
    throws RemoteException
  {
    Parcel localParcel = zaa();
    zac.zad(localParcel, paramIObjectWrapper);
    zac.zac(localParcel, paramzax);
    paramzax = zab(2, localParcel);
    paramIObjectWrapper = IObjectWrapper.Stub.asInterface(paramzax.readStrongBinder());
    paramzax.recycle();
    return paramIObjectWrapper;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\zam.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */