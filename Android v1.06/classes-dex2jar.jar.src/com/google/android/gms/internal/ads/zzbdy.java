package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzbdy
  extends zzato
  implements IInterface
{
  zzbdy(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
  }
  
  public final void zze(zzbtf paramzzbtf)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramzzbtf);
    zzbh(1, localParcel);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbdy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */