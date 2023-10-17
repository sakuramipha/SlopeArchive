package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzato;
import com.google.android.gms.internal.ads.zzatq;
import com.google.android.gms.internal.ads.zzbny;

public final class zzbr
  extends zzato
  implements IInterface
{
  zzbr(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
  }
  
  public final IBinder zze(IObjectWrapper paramIObjectWrapper, String paramString, zzbny paramzzbny, int paramInt)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper);
    localParcel.writeString(paramString);
    zzatq.zzf(localParcel, paramzzbny);
    localParcel.writeInt(231700000);
    paramString = zzbg(1, localParcel);
    paramIObjectWrapper = paramString.readStrongBinder();
    paramString.recycle();
    return paramIObjectWrapper;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzbr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */