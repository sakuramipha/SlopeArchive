package com.google.android.gms.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zac;

public final class zaf
  extends zaa
  implements IInterface
{
  zaf(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.signin.internal.ISignInService");
  }
  
  public final void zae(int paramInt)
    throws RemoteException
  {
    Parcel localParcel = zaa();
    localParcel.writeInt(paramInt);
    zac(7, localParcel);
  }
  
  public final void zaf(IAccountAccessor paramIAccountAccessor, int paramInt, boolean paramBoolean)
    throws RemoteException
  {
    Parcel localParcel = zaa();
    zac.zad(localParcel, paramIAccountAccessor);
    localParcel.writeInt(paramInt);
    zac.zab(localParcel, paramBoolean);
    zac(9, localParcel);
  }
  
  public final void zag(zai paramzai, zae paramzae)
    throws RemoteException
  {
    Parcel localParcel = zaa();
    zac.zac(localParcel, paramzai);
    zac.zad(localParcel, paramzae);
    zac(12, localParcel);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\signin\internal\zaf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */