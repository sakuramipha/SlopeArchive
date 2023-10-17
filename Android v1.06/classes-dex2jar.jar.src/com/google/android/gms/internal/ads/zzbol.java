package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import java.util.ArrayList;
import java.util.List;

public final class zzbol
  extends zzato
  implements zzbon
{
  zzbol(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
  }
  
  public final boolean zzA()
    throws RemoteException
  {
    Parcel localParcel = zzbg(18, zza());
    boolean bool = zzatq.zzg(localParcel);
    localParcel.recycle();
    return bool;
  }
  
  public final boolean zzB()
    throws RemoteException
  {
    Parcel localParcel = zzbg(17, zza());
    boolean bool = zzatq.zzg(localParcel);
    localParcel.recycle();
    return bool;
  }
  
  public final double zze()
    throws RemoteException
  {
    Parcel localParcel = zzbg(8, zza());
    double d = localParcel.readDouble();
    localParcel.recycle();
    return d;
  }
  
  public final float zzf()
    throws RemoteException
  {
    Parcel localParcel = zzbg(23, zza());
    float f = localParcel.readFloat();
    localParcel.recycle();
    return f;
  }
  
  public final float zzg()
    throws RemoteException
  {
    Parcel localParcel = zzbg(25, zza());
    float f = localParcel.readFloat();
    localParcel.recycle();
    return f;
  }
  
  public final float zzh()
    throws RemoteException
  {
    Parcel localParcel = zzbg(24, zza());
    float f = localParcel.readFloat();
    localParcel.recycle();
    return f;
  }
  
  public final Bundle zzi()
    throws RemoteException
  {
    Parcel localParcel = zzbg(16, zza());
    Bundle localBundle = (Bundle)zzatq.zza(localParcel, Bundle.CREATOR);
    localParcel.recycle();
    return localBundle;
  }
  
  public final zzdq zzj()
    throws RemoteException
  {
    Parcel localParcel = zzbg(11, zza());
    zzdq localzzdq = zzdp.zzb(localParcel.readStrongBinder());
    localParcel.recycle();
    return localzzdq;
  }
  
  public final zzbei zzk()
    throws RemoteException
  {
    Parcel localParcel = zzbg(12, zza());
    zzbei localzzbei = zzbeh.zzj(localParcel.readStrongBinder());
    localParcel.recycle();
    return localzzbei;
  }
  
  public final zzbeq zzl()
    throws RemoteException
  {
    Parcel localParcel = zzbg(5, zza());
    zzbeq localzzbeq = zzbep.zzg(localParcel.readStrongBinder());
    localParcel.recycle();
    return localzzbeq;
  }
  
  public final IObjectWrapper zzm()
    throws RemoteException
  {
    Parcel localParcel = zzbg(13, zza());
    IObjectWrapper localIObjectWrapper = IObjectWrapper.Stub.asInterface(localParcel.readStrongBinder());
    localParcel.recycle();
    return localIObjectWrapper;
  }
  
  public final IObjectWrapper zzn()
    throws RemoteException
  {
    Parcel localParcel = zzbg(14, zza());
    IObjectWrapper localIObjectWrapper = IObjectWrapper.Stub.asInterface(localParcel.readStrongBinder());
    localParcel.recycle();
    return localIObjectWrapper;
  }
  
  public final IObjectWrapper zzo()
    throws RemoteException
  {
    Parcel localParcel = zzbg(15, zza());
    IObjectWrapper localIObjectWrapper = IObjectWrapper.Stub.asInterface(localParcel.readStrongBinder());
    localParcel.recycle();
    return localIObjectWrapper;
  }
  
  public final String zzp()
    throws RemoteException
  {
    Parcel localParcel = zzbg(7, zza());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final String zzq()
    throws RemoteException
  {
    Parcel localParcel = zzbg(4, zza());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final String zzr()
    throws RemoteException
  {
    Parcel localParcel = zzbg(6, zza());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final String zzs()
    throws RemoteException
  {
    Parcel localParcel = zzbg(2, zza());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final String zzt()
    throws RemoteException
  {
    Parcel localParcel = zzbg(10, zza());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final String zzu()
    throws RemoteException
  {
    Parcel localParcel = zzbg(9, zza());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final List zzv()
    throws RemoteException
  {
    Parcel localParcel = zzbg(3, zza());
    ArrayList localArrayList = zzatq.zzb(localParcel);
    localParcel.recycle();
    return localArrayList;
  }
  
  public final void zzw(IObjectWrapper paramIObjectWrapper)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper);
    zzbh(20, localParcel);
  }
  
  public final void zzx()
    throws RemoteException
  {
    zzbh(19, zza());
  }
  
  public final void zzy(IObjectWrapper paramIObjectWrapper1, IObjectWrapper paramIObjectWrapper2, IObjectWrapper paramIObjectWrapper3)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper1);
    zzatq.zzf(localParcel, paramIObjectWrapper2);
    zzatq.zzf(localParcel, paramIObjectWrapper3);
    zzbh(21, localParcel);
  }
  
  public final void zzz(IObjectWrapper paramIObjectWrapper)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper);
    zzbh(22, localParcel);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbol.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */