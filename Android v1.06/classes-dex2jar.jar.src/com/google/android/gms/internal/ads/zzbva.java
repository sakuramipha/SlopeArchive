package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzbva
  extends zzato
  implements zzbvc
{
  zzbva(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
  }
  
  public final void zze(zzbuw paramzzbuw)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramzzbuw);
    zzbh(5, localParcel);
  }
  
  public final void zzf()
    throws RemoteException
  {
    zzbh(4, zza());
  }
  
  public final void zzg(int paramInt)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeInt(paramInt);
    zzbh(7, localParcel);
  }
  
  public final void zzh()
    throws RemoteException
  {
    zzbh(6, zza());
  }
  
  public final void zzi()
    throws RemoteException
  {
    zzbh(1, zza());
  }
  
  public final void zzj()
    throws RemoteException
  {
    zzbh(2, zza());
  }
  
  public final void zzk()
    throws RemoteException
  {
    zzbh(8, zza());
  }
  
  public final void zzl()
    throws RemoteException
  {
    zzbh(3, zza());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbva.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */