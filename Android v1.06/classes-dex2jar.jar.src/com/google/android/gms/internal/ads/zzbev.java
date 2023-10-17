package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzbev
  extends zzato
  implements zzbex
{
  zzbev(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
  }
  
  public final IBinder zze(IObjectWrapper paramIObjectWrapper1, IObjectWrapper paramIObjectWrapper2, IObjectWrapper paramIObjectWrapper3, int paramInt)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper1);
    zzatq.zzf(localParcel, paramIObjectWrapper2);
    zzatq.zzf(localParcel, paramIObjectWrapper3);
    localParcel.writeInt(231700000);
    paramIObjectWrapper1 = zzbg(1, localParcel);
    paramIObjectWrapper2 = paramIObjectWrapper1.readStrongBinder();
    paramIObjectWrapper1.recycle();
    return paramIObjectWrapper2;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbev.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */