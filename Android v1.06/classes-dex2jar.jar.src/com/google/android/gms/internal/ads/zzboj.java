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

public final class zzboj
  extends zzato
  implements IInterface
{
  zzboj(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
  }
  
  public final double zze()
    throws RemoteException
  {
    Parcel localParcel = zzbg(7, zza());
    double d = localParcel.readDouble();
    localParcel.recycle();
    return d;
  }
  
  public final Bundle zzf()
    throws RemoteException
  {
    Parcel localParcel = zzbg(15, zza());
    Bundle localBundle = (Bundle)zzatq.zza(localParcel, Bundle.CREATOR);
    localParcel.recycle();
    return localBundle;
  }
  
  public final zzdq zzg()
    throws RemoteException
  {
    Parcel localParcel = zzbg(17, zza());
    zzdq localzzdq = zzdp.zzb(localParcel.readStrongBinder());
    localParcel.recycle();
    return localzzdq;
  }
  
  public final zzbei zzh()
    throws RemoteException
  {
    Parcel localParcel = zzbg(19, zza());
    zzbei localzzbei = zzbeh.zzj(localParcel.readStrongBinder());
    localParcel.recycle();
    return localzzbei;
  }
  
  public final zzbeq zzi()
    throws RemoteException
  {
    Parcel localParcel = zzbg(5, zza());
    zzbeq localzzbeq = zzbep.zzg(localParcel.readStrongBinder());
    localParcel.recycle();
    return localzzbeq;
  }
  
  public final IObjectWrapper zzj()
    throws RemoteException
  {
    Parcel localParcel = zzbg(18, zza());
    IObjectWrapper localIObjectWrapper = IObjectWrapper.Stub.asInterface(localParcel.readStrongBinder());
    localParcel.recycle();
    return localIObjectWrapper;
  }
  
  public final IObjectWrapper zzk()
    throws RemoteException
  {
    Parcel localParcel = zzbg(20, zza());
    IObjectWrapper localIObjectWrapper = IObjectWrapper.Stub.asInterface(localParcel.readStrongBinder());
    localParcel.recycle();
    return localIObjectWrapper;
  }
  
  public final IObjectWrapper zzl()
    throws RemoteException
  {
    Parcel localParcel = zzbg(21, zza());
    IObjectWrapper localIObjectWrapper = IObjectWrapper.Stub.asInterface(localParcel.readStrongBinder());
    localParcel.recycle();
    return localIObjectWrapper;
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
  
  public final String zzp()
    throws RemoteException
  {
    Parcel localParcel = zzbg(9, zza());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final String zzq()
    throws RemoteException
  {
    Parcel localParcel = zzbg(8, zza());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final List zzr()
    throws RemoteException
  {
    Parcel localParcel = zzbg(3, zza());
    ArrayList localArrayList = zzatq.zzb(localParcel);
    localParcel.recycle();
    return localArrayList;
  }
  
  public final void zzs(IObjectWrapper paramIObjectWrapper)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper);
    zzbh(11, localParcel);
  }
  
  public final void zzt()
    throws RemoteException
  {
    zzbh(10, zza());
  }
  
  public final void zzu(IObjectWrapper paramIObjectWrapper)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper);
    zzbh(12, localParcel);
  }
  
  public final void zzv(IObjectWrapper paramIObjectWrapper1, IObjectWrapper paramIObjectWrapper2, IObjectWrapper paramIObjectWrapper3)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper1);
    zzatq.zzf(localParcel, paramIObjectWrapper2);
    zzatq.zzf(localParcel, paramIObjectWrapper3);
    zzbh(22, localParcel);
  }
  
  public final void zzw(IObjectWrapper paramIObjectWrapper)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper);
    zzbh(16, localParcel);
  }
  
  public final boolean zzx()
    throws RemoteException
  {
    Parcel localParcel = zzbg(14, zza());
    boolean bool = zzatq.zzg(localParcel);
    localParcel.recycle();
    return bool;
  }
  
  public final boolean zzy()
    throws RemoteException
  {
    Parcel localParcel = zzbg(13, zza());
    boolean bool = zzatq.zzg(localParcel);
    localParcel.recycle();
    return bool;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzboj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */