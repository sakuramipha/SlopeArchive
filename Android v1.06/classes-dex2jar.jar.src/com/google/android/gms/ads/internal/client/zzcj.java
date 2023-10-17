package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzato;
import com.google.android.gms.internal.ads.zzatq;
import com.google.android.gms.internal.ads.zzbnx;
import com.google.android.gms.internal.ads.zzbny;

public final class zzcj
  extends zzato
  implements zzcl
{
  zzcj(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
  }
  
  public final zzbny getAdapterCreator()
    throws RemoteException
  {
    Parcel localParcel = zzbg(2, zza());
    zzbny localzzbny = zzbnx.zzf(localParcel.readStrongBinder());
    localParcel.recycle();
    return localzzbny;
  }
  
  public final zzen getLiteSdkVersion()
    throws RemoteException
  {
    Parcel localParcel = zzbg(1, zza());
    zzen localzzen = (zzen)zzatq.zza(localParcel, zzen.CREATOR);
    localParcel.recycle();
    return localzzen;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzcj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */