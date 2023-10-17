package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzato;
import com.google.android.gms.internal.ads.zzatq;
import com.google.android.gms.internal.ads.zzbny;

public final class zzbv
  extends zzato
  implements IInterface
{
  zzbv(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
  }
  
  public final IBinder zze(IObjectWrapper paramIObjectWrapper, zzq paramzzq, String paramString, zzbny paramzzbny, int paramInt1, int paramInt2)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper);
    zzatq.zzd(localParcel, paramzzq);
    localParcel.writeString(paramString);
    zzatq.zzf(localParcel, paramzzbny);
    localParcel.writeInt(231700000);
    localParcel.writeInt(paramInt2);
    paramIObjectWrapper = zzbg(2, localParcel);
    paramzzq = paramIObjectWrapper.readStrongBinder();
    paramIObjectWrapper.recycle();
    return paramzzq;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzbv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */