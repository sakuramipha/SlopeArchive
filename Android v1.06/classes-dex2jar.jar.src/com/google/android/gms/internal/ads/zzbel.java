package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;

public final class zzbel
  extends zzato
  implements zzben
{
  zzbel(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
  }
  
  public final float zze()
    throws RemoteException
  {
    Parcel localParcel = zzbg(2, zza());
    float f = localParcel.readFloat();
    localParcel.recycle();
    return f;
  }
  
  public final float zzf()
    throws RemoteException
  {
    Parcel localParcel = zzbg(6, zza());
    float f = localParcel.readFloat();
    localParcel.recycle();
    return f;
  }
  
  public final float zzg()
    throws RemoteException
  {
    Parcel localParcel = zzbg(5, zza());
    float f = localParcel.readFloat();
    localParcel.recycle();
    return f;
  }
  
  public final zzdq zzh()
    throws RemoteException
  {
    Parcel localParcel = zzbg(7, zza());
    zzdq localzzdq = zzdp.zzb(localParcel.readStrongBinder());
    localParcel.recycle();
    return localzzdq;
  }
  
  public final IObjectWrapper zzi()
    throws RemoteException
  {
    Parcel localParcel = zzbg(4, zza());
    IObjectWrapper localIObjectWrapper = IObjectWrapper.Stub.asInterface(localParcel.readStrongBinder());
    localParcel.recycle();
    return localIObjectWrapper;
  }
  
  public final void zzj(IObjectWrapper paramIObjectWrapper)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper);
    zzbh(3, localParcel);
  }
  
  public final boolean zzk()
    throws RemoteException
  {
    Parcel localParcel = zzbg(10, zza());
    boolean bool = zzatq.zzg(localParcel);
    localParcel.recycle();
    return bool;
  }
  
  public final boolean zzl()
    throws RemoteException
  {
    Parcel localParcel = zzbg(8, zza());
    boolean bool = zzatq.zzg(localParcel);
    localParcel.recycle();
    return bool;
  }
  
  public final void zzm(zzbfy paramzzbfy)
    throws RemoteException
  {
    throw null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */