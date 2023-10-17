package com.google.android.gms.common.internal.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zac;

public final class zal
  extends zaa
  implements IInterface
{
  zal(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.common.internal.service.ICommonService");
  }
  
  public final void zae(zak paramzak)
    throws RemoteException
  {
    Parcel localParcel = zaa();
    zac.zad(localParcel, paramzak);
    zad(1, localParcel);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\service\zal.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */