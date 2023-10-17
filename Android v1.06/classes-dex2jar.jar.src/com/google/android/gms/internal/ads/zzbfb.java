package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzbfb
  extends zzato
  implements zzbfd
{
  zzbfb(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
  }
  
  public final IBinder zze(IObjectWrapper paramIObjectWrapper1, IObjectWrapper paramIObjectWrapper2, IObjectWrapper paramIObjectWrapper3)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper1);
    zzatq.zzf(localParcel, paramIObjectWrapper2);
    zzatq.zzf(localParcel, paramIObjectWrapper3);
    paramIObjectWrapper2 = zzbg(1, localParcel);
    paramIObjectWrapper1 = paramIObjectWrapper2.readStrongBinder();
    paramIObjectWrapper2.recycle();
    return paramIObjectWrapper1;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbfb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */