package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import java.util.ArrayList;
import java.util.List;

public final class zzbok
  extends zzato
  implements IInterface
{
  zzbok(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
  }
  
  public final Bundle zze()
    throws RemoteException
  {
    Parcel localParcel = zzbg(13, zza());
    Bundle localBundle = (Bundle)zzatq.zza(localParcel, Bundle.CREATOR);
    localParcel.recycle();
    return localBundle;
  }
  
  public final zzdq zzf()
    throws RemoteException
  {
    Parcel localParcel = zzbg(16, zza());
    zzdq localzzdq = zzdp.zzb(localParcel.readStrongBinder());
    localParcel.recycle();
    return localzzdq;
  }
  
  public final zzbei zzg()
    throws RemoteException
  {
    Parcel localParcel = zzbg(19, zza());
    zzbei localzzbei = zzbeh.zzj(localParcel.readStrongBinder());
    localParcel.recycle();
    return localzzbei;
  }
  
  public final zzbeq zzh()
    throws RemoteException
  {
    Parcel localParcel = zzbg(5, zza());
    zzbeq localzzbeq = zzbep.zzg(localParcel.readStrongBinder());
    localParcel.recycle();
    return localzzbeq;
  }
  
  public final IObjectWrapper zzi()
    throws RemoteException
  {
    Parcel localParcel = zzbg(15, zza());
    IObjectWrapper localIObjectWrapper = IObjectWrapper.Stub.asInterface(localParcel.readStrongBinder());
    localParcel.recycle();
    return localIObjectWrapper;
  }
  
  public final IObjectWrapper zzj()
    throws RemoteException
  {
    Parcel localParcel = zzbg(20, zza());
    IObjectWrapper localIObjectWrapper = IObjectWrapper.Stub.asInterface(localParcel.readStrongBinder());
    localParcel.recycle();
    return localIObjectWrapper;
  }
  
  public final IObjectWrapper zzk()
    throws RemoteException
  {
    Parcel localParcel = zzbg(21, zza());
    IObjectWrapper localIObjectWrapper = IObjectWrapper.Stub.asInterface(localParcel.readStrongBinder());
    localParcel.recycle();
    return localIObjectWrapper;
  }
  
  public final String zzl()
    throws RemoteException
  {
    Parcel localParcel = zzbg(7, zza());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final String zzm()
    throws RemoteException
  {
    Parcel localParcel = zzbg(4, zza());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final String zzn()
    throws RemoteException
  {
    Parcel localParcel = zzbg(6, zza());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final String zzo()
    throws RemoteException
  {
    Parcel localParcel = zzbg(2, zza());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final List zzp()
    throws RemoteException
  {
    Parcel localParcel = zzbg(3, zza());
    ArrayList localArrayList = zzatq.zzb(localParcel);
    localParcel.recycle();
    return localArrayList;
  }
  
  public final void zzq(IObjectWrapper paramIObjectWrapper)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper);
    zzbh(9, localParcel);
  }
  
  public final void zzr()
    throws RemoteException
  {
    zzbh(8, zza());
  }
  
  public final void zzs(IObjectWrapper paramIObjectWrapper)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper);
    zzbh(10, localParcel);
  }
  
  public final void zzt(IObjectWrapper paramIObjectWrapper1, IObjectWrapper paramIObjectWrapper2, IObjectWrapper paramIObjectWrapper3)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper1);
    zzatq.zzf(localParcel, paramIObjectWrapper2);
    zzatq.zzf(localParcel, paramIObjectWrapper3);
    zzbh(22, localParcel);
  }
  
  public final void zzu(IObjectWrapper paramIObjectWrapper)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper);
    zzbh(14, localParcel);
  }
  
  public final boolean zzv()
    throws RemoteException
  {
    Parcel localParcel = zzbg(12, zza());
    boolean bool = zzatq.zzg(localParcel);
    localParcel.recycle();
    return bool;
  }
  
  public final boolean zzw()
    throws RemoteException
  {
    Parcel localParcel = zzbg(11, zza());
    boolean bool = zzatq.zzg(localParcel);
    localParcel.recycle();
    return bool;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbok.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */