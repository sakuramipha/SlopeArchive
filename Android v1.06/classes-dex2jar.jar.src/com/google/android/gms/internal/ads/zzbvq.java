package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

public final class zzbvq
  extends zzato
  implements zzbvs
{
  zzbvq(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
  }
  
  public final void zze()
    throws RemoteException
  {
    zzbh(7, zza());
  }
  
  public final void zzf()
    throws RemoteException
  {
    zzbh(6, zza());
  }
  
  public final void zzg()
    throws RemoteException
  {
    zzbh(2, zza());
  }
  
  public final void zzh(int paramInt)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeInt(paramInt);
    zzbh(4, localParcel);
  }
  
  public final void zzi(zze paramzze)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzd(localParcel, paramzze);
    zzbh(5, localParcel);
  }
  
  public final void zzj()
    throws RemoteException
  {
    zzbh(1, zza());
  }
  
  public final void zzk(zzbvm paramzzbvm)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramzzbvm);
    zzbh(3, localParcel);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbvq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */