package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzcgt
  extends zzato
  implements zzcgv
{
  zzcgt(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.measurement.IMeasurementManager");
  }
  
  public final void zze(IObjectWrapper paramIObjectWrapper, zzcgs paramzzcgs)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper);
    zzatq.zzf(localParcel, paramzzcgs);
    zzbh(2, localParcel);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcgt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */