package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzbtu
  extends zzato
  implements zzbtw
{
  zzbtu(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.request.IAdsService");
  }
  
  public final void zze(zzbto paramzzbto, zzbtz paramzzbtz)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzd(localParcel, paramzzbto);
    zzatq.zzf(localParcel, paramzzbtz);
    zzbh(3, localParcel);
  }
  
  public final void zzf(zzbtk paramzzbtk, zzbtz paramzzbtz)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzd(localParcel, paramzzbtk);
    zzatq.zzf(localParcel, paramzzbtz);
    zzbh(1, localParcel);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbtu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */