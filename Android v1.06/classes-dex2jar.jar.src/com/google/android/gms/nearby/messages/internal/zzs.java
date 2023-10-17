package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.nearby.zza;
import com.google.android.gms.internal.nearby.zzc;

public final class zzs
  extends zza
  implements IInterface
{
  zzs(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
  }
  
  public final void zzd(zzby paramzzby)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzc.zzc(localParcel, paramzzby);
    zzq(1, localParcel);
  }
  
  public final void zze(zzcd paramzzcd)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzc.zzc(localParcel, paramzzcd);
    zzq(2, localParcel);
  }
  
  public final void zzf(SubscribeRequest paramSubscribeRequest)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzc.zzc(localParcel, paramSubscribeRequest);
    zzq(3, localParcel);
  }
  
  public final void zzg(zzcf paramzzcf)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzc.zzc(localParcel, paramzzcf);
    zzq(4, localParcel);
  }
  
  public final void zzh(zzh paramzzh)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzc.zzc(localParcel, paramzzh);
    zzq(7, localParcel);
  }
  
  public final void zzi(zzca paramzzca)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzc.zzc(localParcel, paramzzca);
    zzq(8, localParcel);
  }
  
  public final void zzj(zzj paramzzj)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzc.zzc(localParcel, paramzzj);
    zzq(9, localParcel);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\nearby\messages\internal\zzs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */