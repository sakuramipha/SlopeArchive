package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzbtq
  extends zzato
  implements zzbts
{
  zzbtq(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
  }
  
  public final void zze(zzbug paramzzbug, zzbuc paramzzbuc)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzd(localParcel, paramzzbug);
    zzatq.zzf(localParcel, paramzzbuc);
    zzbh(6, localParcel);
  }
  
  public final void zzf(zzbug paramzzbug, zzbuc paramzzbuc)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzd(localParcel, paramzzbug);
    zzatq.zzf(localParcel, paramzzbuc);
    zzbh(5, localParcel);
  }
  
  public final void zzg(zzbug paramzzbug, zzbuc paramzzbuc)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzd(localParcel, paramzzbug);
    zzatq.zzf(localParcel, paramzzbuc);
    zzbh(4, localParcel);
  }
  
  public final void zzh(String paramString, zzbuc paramzzbuc)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeString(paramString);
    zzatq.zzf(localParcel, paramzzbuc);
    zzbh(7, localParcel);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbtq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */