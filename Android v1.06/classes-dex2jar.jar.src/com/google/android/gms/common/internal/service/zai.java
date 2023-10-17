package com.google.android.gms.common.internal.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zac;

public final class zai
  extends zaa
  implements IInterface
{
  zai(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
  }
  
  public final void zae(TelemetryData paramTelemetryData)
    throws RemoteException
  {
    Parcel localParcel = zaa();
    zac.zac(localParcel, paramTelemetryData);
    zad(1, localParcel);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\service\zai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */