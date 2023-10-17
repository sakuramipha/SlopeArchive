package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zzaz;

public final class zzbtx
  extends zzato
  implements zzbtz
{
  zzbtx(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
  }
  
  public final void zze(zzaz paramzzaz)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzd(localParcel, paramzzaz);
    zzbh(2, localParcel);
  }
  
  public final void zzf(ParcelFileDescriptor paramParcelFileDescriptor)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzd(localParcel, paramParcelFileDescriptor);
    zzbh(1, localParcel);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbtx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */