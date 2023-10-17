package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzato;
import com.google.android.gms.internal.ads.zzatq;

public final class zzcp
  extends zzato
  implements IInterface
{
  zzcp(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
  }
  
  public final IBinder zze(IObjectWrapper paramIObjectWrapper, int paramInt)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper);
    localParcel.writeInt(231700000);
    localParcel = zzbg(1, localParcel);
    paramIObjectWrapper = localParcel.readStrongBinder();
    localParcel.recycle();
    return paramIObjectWrapper;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzcp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */