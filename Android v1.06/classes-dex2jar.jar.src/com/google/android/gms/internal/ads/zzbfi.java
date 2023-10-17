package com.google.android.gms.internal.ads;

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

public final class zzbfi
  extends zzato
  implements zzbfk
{
  zzbfi(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
  }
  
  public final zzdq zze()
    throws RemoteException
  {
    Parcel localParcel = zzbg(7, zza());
    zzdq localzzdq = zzdp.zzb(localParcel.readStrongBinder());
    localParcel.recycle();
    return localzzdq;
  }
  
  public final zzben zzf()
    throws RemoteException
  {
    Parcel localParcel = zzbg(16, zza());
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
  
  public final zzbeq zzg(String paramString)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeString(paramString);
    localParcel = zzbg(2, localParcel);
    IBinder localIBinder = localParcel.readStrongBinder();
    if (localIBinder == null)
    {
      paramString = null;
    }
    else
    {
      paramString = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
      if ((paramString instanceof zzbeq)) {
        paramString = (zzbeq)paramString;
      } else {
        paramString = new zzbeo(localIBinder);
      }
    }
    localParcel.recycle();
    return paramString;
  }
  
  public final IObjectWrapper zzh()
    throws RemoteException
  {
    Parcel localParcel = zzbg(9, zza());
    IObjectWrapper localIObjectWrapper = IObjectWrapper.Stub.asInterface(localParcel.readStrongBinder());
    localParcel.recycle();
    return localIObjectWrapper;
  }
  
  public final String zzi()
    throws RemoteException
  {
    Parcel localParcel = zzbg(4, zza());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final String zzj(String paramString)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeString(paramString);
    localParcel = zzbg(1, localParcel);
    paramString = localParcel.readString();
    localParcel.recycle();
    return paramString;
  }
  
  public final List zzk()
    throws RemoteException
  {
    Parcel localParcel = zzbg(3, zza());
    ArrayList localArrayList = localParcel.createStringArrayList();
    localParcel.recycle();
    return localArrayList;
  }
  
  public final void zzl()
    throws RemoteException
  {
    zzbh(8, zza());
  }
  
  public final void zzm()
    throws RemoteException
  {
    zzbh(15, zza());
  }
  
  public final void zzn(String paramString)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeString(paramString);
    zzbh(5, localParcel);
  }
  
  public final void zzo()
    throws RemoteException
  {
    zzbh(6, zza());
  }
  
  public final void zzp(IObjectWrapper paramIObjectWrapper)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper);
    zzbh(14, localParcel);
  }
  
  public final boolean zzq()
    throws RemoteException
  {
    Parcel localParcel = zzbg(12, zza());
    boolean bool = zzatq.zzg(localParcel);
    localParcel.recycle();
    return bool;
  }
  
  public final boolean zzr(IObjectWrapper paramIObjectWrapper)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper);
    paramIObjectWrapper = zzbg(17, localParcel);
    boolean bool = zzatq.zzg(paramIObjectWrapper);
    paramIObjectWrapper.recycle();
    return bool;
  }
  
  public final boolean zzs(IObjectWrapper paramIObjectWrapper)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper);
    paramIObjectWrapper = zzbg(10, localParcel);
    boolean bool = zzatq.zzg(paramIObjectWrapper);
    paramIObjectWrapper.recycle();
    return bool;
  }
  
  public final boolean zzt()
    throws RemoteException
  {
    Parcel localParcel = zzbg(13, zza());
    boolean bool = zzatq.zzg(localParcel);
    localParcel.recycle();
    return bool;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbfi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */