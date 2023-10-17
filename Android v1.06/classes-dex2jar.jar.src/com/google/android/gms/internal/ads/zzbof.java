package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;

public final class zzbof
  extends zzato
  implements zzboh
{
  zzbof(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
  }
  
  public final IObjectWrapper zze()
    throws RemoteException
  {
    Parcel localParcel = zzbg(1, zza());
    IObjectWrapper localIObjectWrapper = IObjectWrapper.Stub.asInterface(localParcel.readStrongBinder());
    localParcel.recycle();
    return localIObjectWrapper;
  }
  
  public final boolean zzf()
    throws RemoteException
  {
    Parcel localParcel = zzbg(2, zza());
    boolean bool = zzatq.zzg(localParcel);
    localParcel.recycle();
    return bool;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbof.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */