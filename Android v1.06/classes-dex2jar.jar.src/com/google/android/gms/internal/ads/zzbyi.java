package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

public final class zzbyi
  extends zzato
  implements zzbyk
{
  zzbyi(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
  }
  
  public final void zze(IObjectWrapper paramIObjectWrapper, zzbyo paramzzbyo, zzbyh paramzzbyh)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper);
    zzatq.zzd(localParcel, paramzzbyo);
    zzatq.zzf(localParcel, paramzzbyh);
    zzbh(1, localParcel);
  }
  
  public final void zzf(zzbst paramzzbst)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzd(localParcel, paramzzbst);
    zzbh(7, localParcel);
  }
  
  public final void zzg(List paramList, IObjectWrapper paramIObjectWrapper, zzbsk paramzzbsk)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeTypedList(paramList);
    zzatq.zzf(localParcel, paramIObjectWrapper);
    zzatq.zzf(localParcel, paramzzbsk);
    zzbh(10, localParcel);
  }
  
  public final void zzh(List paramList, IObjectWrapper paramIObjectWrapper, zzbsk paramzzbsk)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeTypedList(paramList);
    zzatq.zzf(localParcel, paramIObjectWrapper);
    zzatq.zzf(localParcel, paramzzbsk);
    zzbh(9, localParcel);
  }
  
  public final void zzi(IObjectWrapper paramIObjectWrapper)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper);
    zzbh(8, localParcel);
  }
  
  public final void zzj(IObjectWrapper paramIObjectWrapper)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper);
    zzbh(2, localParcel);
  }
  
  public final void zzk(List paramList, IObjectWrapper paramIObjectWrapper, zzbsk paramzzbsk)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeTypedList(paramList);
    zzatq.zzf(localParcel, paramIObjectWrapper);
    zzatq.zzf(localParcel, paramzzbsk);
    zzbh(6, localParcel);
  }
  
  public final void zzl(List paramList, IObjectWrapper paramIObjectWrapper, zzbsk paramzzbsk)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeTypedList(paramList);
    zzatq.zzf(localParcel, paramIObjectWrapper);
    zzatq.zzf(localParcel, paramzzbsk);
    zzbh(5, localParcel);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbyi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */