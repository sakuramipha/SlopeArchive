package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdm;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import java.util.ArrayList;
import java.util.List;

public final class zzbgl
  extends zzato
  implements zzbgn
{
  zzbgl(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
  }
  
  public final void zzA()
    throws RemoteException
  {
    zzbh(28, zza());
  }
  
  public final void zzB(Bundle paramBundle)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzd(localParcel, paramBundle);
    zzbh(17, localParcel);
  }
  
  public final void zzC()
    throws RemoteException
  {
    zzbh(27, zza());
  }
  
  public final void zzD(zzcs paramzzcs)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramzzcs);
    zzbh(26, localParcel);
  }
  
  public final void zzE(zzdg paramzzdg)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramzzdg);
    zzbh(32, localParcel);
  }
  
  public final void zzF(zzbgk paramzzbgk)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramzzbgk);
    zzbh(21, localParcel);
  }
  
  public final boolean zzG()
    throws RemoteException
  {
    Parcel localParcel = zzbg(30, zza());
    boolean bool = zzatq.zzg(localParcel);
    localParcel.recycle();
    return bool;
  }
  
  public final boolean zzH()
    throws RemoteException
  {
    Parcel localParcel = zzbg(24, zza());
    boolean bool = zzatq.zzg(localParcel);
    localParcel.recycle();
    return bool;
  }
  
  public final boolean zzI(Bundle paramBundle)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzd(localParcel, paramBundle);
    paramBundle = zzbg(16, localParcel);
    boolean bool = zzatq.zzg(paramBundle);
    paramBundle.recycle();
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
  
  public final Bundle zzf()
    throws RemoteException
  {
    Parcel localParcel = zzbg(20, zza());
    Bundle localBundle = (Bundle)zzatq.zza(localParcel, Bundle.CREATOR);
    localParcel.recycle();
    return localBundle;
  }
  
  public final zzdn zzg()
    throws RemoteException
  {
    Parcel localParcel = zzbg(31, zza());
    zzdn localzzdn = zzdm.zzb(localParcel.readStrongBinder());
    localParcel.recycle();
    return localzzdn;
  }
  
  public final zzdq zzh()
    throws RemoteException
  {
    Parcel localParcel = zzbg(11, zza());
    zzdq localzzdq = zzdp.zzb(localParcel.readStrongBinder());
    localParcel.recycle();
    return localzzdq;
  }
  
  public final zzbei zzi()
    throws RemoteException
  {
    Parcel localParcel = zzbg(14, zza());
    IBinder localIBinder = localParcel.readStrongBinder();
    Object localObject;
    if (localIBinder == null)
    {
      localObject = null;
    }
    else
    {
      localObject = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
      if ((localObject instanceof zzbei)) {
        localObject = (zzbei)localObject;
      } else {
        localObject = new zzbeg(localIBinder);
      }
    }
    localParcel.recycle();
    return (zzbei)localObject;
  }
  
  public final zzben zzj()
    throws RemoteException
  {
    Parcel localParcel = zzbg(29, zza());
    Object localObject = localParcel.readStrongBinder();
    if (localObject == null)
    {
      localObject = null;
    }
    else
    {
      IInterface localIInterface = ((IBinder)localObject).queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
      if ((localIInterface instanceof zzben)) {
        localObject = (zzben)localIInterface;
      } else {
        localObject = new zzbel((IBinder)localObject);
      }
    }
    localParcel.recycle();
    return (zzben)localObject;
  }
  
  public final zzbeq zzk()
    throws RemoteException
  {
    Parcel localParcel = zzbg(5, zza());
    Object localObject = localParcel.readStrongBinder();
    if (localObject == null)
    {
      localObject = null;
    }
    else
    {
      IInterface localIInterface = ((IBinder)localObject).queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
      if ((localIInterface instanceof zzbeq)) {
        localObject = (zzbeq)localIInterface;
      } else {
        localObject = new zzbeo((IBinder)localObject);
      }
    }
    localParcel.recycle();
    return (zzbeq)localObject;
  }
  
  public final IObjectWrapper zzl()
    throws RemoteException
  {
    Parcel localParcel = zzbg(19, zza());
    IObjectWrapper localIObjectWrapper = IObjectWrapper.Stub.asInterface(localParcel.readStrongBinder());
    localParcel.recycle();
    return localIObjectWrapper;
  }
  
  public final IObjectWrapper zzm()
    throws RemoteException
  {
    Parcel localParcel = zzbg(18, zza());
    IObjectWrapper localIObjectWrapper = IObjectWrapper.Stub.asInterface(localParcel.readStrongBinder());
    localParcel.recycle();
    return localIObjectWrapper;
  }
  
  public final String zzn()
    throws RemoteException
  {
    Parcel localParcel = zzbg(7, zza());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final String zzo()
    throws RemoteException
  {
    Parcel localParcel = zzbg(4, zza());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final String zzp()
    throws RemoteException
  {
    Parcel localParcel = zzbg(6, zza());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final String zzq()
    throws RemoteException
  {
    Parcel localParcel = zzbg(2, zza());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final String zzr()
    throws RemoteException
  {
    Parcel localParcel = zzbg(12, zza());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final String zzs()
    throws RemoteException
  {
    Parcel localParcel = zzbg(10, zza());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final String zzt()
    throws RemoteException
  {
    Parcel localParcel = zzbg(9, zza());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final List zzu()
    throws RemoteException
  {
    Parcel localParcel = zzbg(3, zza());
    ArrayList localArrayList = zzatq.zzb(localParcel);
    localParcel.recycle();
    return localArrayList;
  }
  
  public final List zzv()
    throws RemoteException
  {
    Parcel localParcel = zzbg(23, zza());
    ArrayList localArrayList = zzatq.zzb(localParcel);
    localParcel.recycle();
    return localArrayList;
  }
  
  public final void zzw()
    throws RemoteException
  {
    zzbh(22, zza());
  }
  
  public final void zzx()
    throws RemoteException
  {
    zzbh(13, zza());
  }
  
  public final void zzy(zzcw paramzzcw)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramzzcw);
    zzbh(25, localParcel);
  }
  
  public final void zzz(Bundle paramBundle)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzd(localParcel, paramBundle);
    zzbh(15, localParcel);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbgl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */