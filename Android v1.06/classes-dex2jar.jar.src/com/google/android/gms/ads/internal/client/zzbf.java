package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzato;
import com.google.android.gms.internal.ads.zzatq;

public final class zzbf
  extends zzato
  implements zzbh
{
  zzbf(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.client.IAdListener");
  }
  
  public final void zzc()
    throws RemoteException
  {
    zzbh(6, zza());
  }
  
  public final void zzd()
    throws RemoteException
  {
    zzbh(1, zza());
  }
  
  public final void zze(int paramInt)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeInt(paramInt);
    zzbh(2, localParcel);
  }
  
  public final void zzf(zze paramzze)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzd(localParcel, paramzze);
    zzbh(8, localParcel);
  }
  
  public final void zzg()
    throws RemoteException
  {
    zzbh(7, zza());
  }
  
  public final void zzh()
    throws RemoteException
  {
    zzbh(3, zza());
  }
  
  public final void zzi()
    throws RemoteException
  {
    zzbh(4, zza());
  }
  
  public final void zzj()
    throws RemoteException
  {
    zzbh(5, zza());
  }
  
  public final void zzk()
    throws RemoteException
  {
    zzbh(9, zza());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzbf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */