package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;

public final class zzbes
  extends zzato
  implements zzbeu
{
  zzbes(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
  }
  
  public final IObjectWrapper zzb(String paramString)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeString(paramString);
    localParcel = zzbg(2, localParcel);
    paramString = IObjectWrapper.Stub.asInterface(localParcel.readStrongBinder());
    localParcel.recycle();
    return paramString;
  }
  
  public final void zzbs(String paramString, IObjectWrapper paramIObjectWrapper)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeString(paramString);
    zzatq.zzf(localParcel, paramIObjectWrapper);
    zzbh(1, localParcel);
  }
  
  public final void zzbt(IObjectWrapper paramIObjectWrapper)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper);
    zzbh(6, localParcel);
  }
  
  public final void zzbu(zzben paramzzben)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramzzben);
    zzbh(8, localParcel);
  }
  
  public final void zzbv(IObjectWrapper paramIObjectWrapper)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper);
    zzbh(9, localParcel);
  }
  
  public final void zzbw(IObjectWrapper paramIObjectWrapper)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper);
    zzbh(3, localParcel);
  }
  
  public final void zzc()
    throws RemoteException
  {
    zzbh(4, zza());
  }
  
  public final void zzd(IObjectWrapper paramIObjectWrapper)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper);
    zzbh(7, localParcel);
  }
  
  public final void zze(IObjectWrapper paramIObjectWrapper, int paramInt)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper);
    localParcel.writeInt(paramInt);
    zzbh(5, localParcel);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbes.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */