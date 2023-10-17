package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzato;
import com.google.android.gms.internal.ads.zzatq;

public final class zzdo
  extends zzato
  implements zzdq
{
  zzdo(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.client.IVideoController");
  }
  
  public final float zze()
    throws RemoteException
  {
    throw null;
  }
  
  public final float zzf()
    throws RemoteException
  {
    throw null;
  }
  
  public final float zzg()
    throws RemoteException
  {
    throw null;
  }
  
  public final int zzh()
    throws RemoteException
  {
    Parcel localParcel = zzbg(5, zza());
    int i = localParcel.readInt();
    localParcel.recycle();
    return i;
  }
  
  public final zzdt zzi()
    throws RemoteException
  {
    Parcel localParcel = zzbg(11, zza());
    IBinder localIBinder = localParcel.readStrongBinder();
    Object localObject;
    if (localIBinder == null)
    {
      localObject = null;
    }
    else
    {
      localObject = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
      if ((localObject instanceof zzdt)) {
        localObject = (zzdt)localObject;
      } else {
        localObject = new zzdr(localIBinder);
      }
    }
    localParcel.recycle();
    return (zzdt)localObject;
  }
  
  public final void zzj(boolean paramBoolean)
    throws RemoteException
  {
    Parcel localParcel = zza();
    int i = zzatq.zza;
    localParcel.writeInt(paramBoolean);
    zzbh(3, localParcel);
  }
  
  public final void zzk()
    throws RemoteException
  {
    zzbh(2, zza());
  }
  
  public final void zzl()
    throws RemoteException
  {
    zzbh(1, zza());
  }
  
  public final void zzm(zzdt paramzzdt)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramzzdt);
    zzbh(8, localParcel);
  }
  
  public final void zzn()
    throws RemoteException
  {
    zzbh(13, zza());
  }
  
  public final boolean zzo()
    throws RemoteException
  {
    Parcel localParcel = zzbg(12, zza());
    boolean bool = zzatq.zzg(localParcel);
    localParcel.recycle();
    return bool;
  }
  
  public final boolean zzp()
    throws RemoteException
  {
    Parcel localParcel = zzbg(10, zza());
    boolean bool = zzatq.zzg(localParcel);
    localParcel.recycle();
    return bool;
  }
  
  public final boolean zzq()
    throws RemoteException
  {
    Parcel localParcel = zzbg(4, zza());
    boolean bool = zzatq.zzg(localParcel);
    localParcel.recycle();
    return bool;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzdo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */