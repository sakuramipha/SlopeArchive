package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.internal.ads.zzato;
import com.google.android.gms.internal.ads.zzatq;
import com.google.android.gms.internal.ads.zzavu;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbse;
import com.google.android.gms.internal.ads.zzbsh;
import com.google.android.gms.internal.ads.zzbvc;

public final class zzbs
  extends zzato
  implements zzbu
{
  zzbs(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.client.IAdManager");
  }
  
  public final void zzA()
    throws RemoteException
  {
    zzbh(11, zza());
  }
  
  public final void zzB()
    throws RemoteException
  {
    zzbh(6, zza());
  }
  
  public final void zzC(zzbe paramzzbe)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramzzbe);
    zzbh(20, localParcel);
  }
  
  public final void zzD(zzbh paramzzbh)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramzzbh);
    zzbh(7, localParcel);
  }
  
  public final void zzE(zzby paramzzby)
    throws RemoteException
  {
    throw null;
  }
  
  public final void zzF(zzq paramzzq)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzd(localParcel, paramzzq);
    zzbh(13, localParcel);
  }
  
  public final void zzG(zzcb paramzzcb)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramzzcb);
    zzbh(8, localParcel);
  }
  
  public final void zzH(zzavu paramzzavu)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramzzavu);
    zzbh(40, localParcel);
  }
  
  public final void zzI(zzw paramzzw)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzd(localParcel, paramzzw);
    zzbh(39, localParcel);
  }
  
  public final void zzJ(zzci paramzzci)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramzzci);
    zzbh(45, localParcel);
  }
  
  public final void zzK(zzdu paramzzdu)
    throws RemoteException
  {
    throw null;
  }
  
  public final void zzL(boolean paramBoolean)
    throws RemoteException
  {
    Parcel localParcel = zza();
    int i = zzatq.zza;
    localParcel.writeInt(paramBoolean);
    zzbh(34, localParcel);
  }
  
  public final void zzM(zzbse paramzzbse)
    throws RemoteException
  {
    throw null;
  }
  
  public final void zzN(boolean paramBoolean)
    throws RemoteException
  {
    Parcel localParcel = zza();
    int i = zzatq.zza;
    localParcel.writeInt(paramBoolean);
    zzbh(22, localParcel);
  }
  
  public final void zzO(zzbci paramzzbci)
    throws RemoteException
  {
    throw null;
  }
  
  public final void zzP(zzdg paramzzdg)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramzzdg);
    zzbh(42, localParcel);
  }
  
  public final void zzQ(zzbsh paramzzbsh, String paramString)
    throws RemoteException
  {
    throw null;
  }
  
  public final void zzR(String paramString)
    throws RemoteException
  {
    throw null;
  }
  
  public final void zzS(zzbvc paramzzbvc)
    throws RemoteException
  {
    throw null;
  }
  
  public final void zzT(String paramString)
    throws RemoteException
  {
    throw null;
  }
  
  public final void zzU(zzfl paramzzfl)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzd(localParcel, paramzzfl);
    zzbh(29, localParcel);
  }
  
  public final void zzW(IObjectWrapper paramIObjectWrapper)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper);
    zzbh(44, localParcel);
  }
  
  public final void zzX()
    throws RemoteException
  {
    throw null;
  }
  
  public final boolean zzY()
    throws RemoteException
  {
    Parcel localParcel = zzbg(23, zza());
    boolean bool = zzatq.zzg(localParcel);
    localParcel.recycle();
    return bool;
  }
  
  public final boolean zzZ()
    throws RemoteException
  {
    throw null;
  }
  
  public final boolean zzaa(zzl paramzzl)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzd(localParcel, paramzzl);
    paramzzl = zzbg(4, localParcel);
    boolean bool = zzatq.zzg(paramzzl);
    paramzzl.recycle();
    return bool;
  }
  
  public final void zzab(zzcf paramzzcf)
    throws RemoteException
  {
    throw null;
  }
  
  public final Bundle zzd()
    throws RemoteException
  {
    throw null;
  }
  
  public final zzq zzg()
    throws RemoteException
  {
    Parcel localParcel = zzbg(12, zza());
    zzq localzzq = (zzq)zzatq.zza(localParcel, zzq.CREATOR);
    localParcel.recycle();
    return localzzq;
  }
  
  public final zzbh zzi()
    throws RemoteException
  {
    Parcel localParcel = zzbg(33, zza());
    IBinder localIBinder = localParcel.readStrongBinder();
    Object localObject;
    if (localIBinder == null)
    {
      localObject = null;
    }
    else
    {
      localObject = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
      if ((localObject instanceof zzbh)) {
        localObject = (zzbh)localObject;
      } else {
        localObject = new zzbf(localIBinder);
      }
    }
    localParcel.recycle();
    return (zzbh)localObject;
  }
  
  public final zzcb zzj()
    throws RemoteException
  {
    Parcel localParcel = zzbg(32, zza());
    Object localObject = localParcel.readStrongBinder();
    if (localObject == null)
    {
      localObject = null;
    }
    else
    {
      IInterface localIInterface = ((IBinder)localObject).queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
      if ((localIInterface instanceof zzcb)) {
        localObject = (zzcb)localIInterface;
      } else {
        localObject = new zzbz((IBinder)localObject);
      }
    }
    localParcel.recycle();
    return (zzcb)localObject;
  }
  
  public final zzdn zzk()
    throws RemoteException
  {
    Parcel localParcel = zzbg(41, zza());
    Object localObject = localParcel.readStrongBinder();
    if (localObject == null)
    {
      localObject = null;
    }
    else
    {
      IInterface localIInterface = ((IBinder)localObject).queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
      if ((localIInterface instanceof zzdn)) {
        localObject = (zzdn)localIInterface;
      } else {
        localObject = new zzdl((IBinder)localObject);
      }
    }
    localParcel.recycle();
    return (zzdn)localObject;
  }
  
  public final zzdq zzl()
    throws RemoteException
  {
    Parcel localParcel = zzbg(26, zza());
    IBinder localIBinder = localParcel.readStrongBinder();
    Object localObject;
    if (localIBinder == null)
    {
      localObject = null;
    }
    else
    {
      localObject = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
      if ((localObject instanceof zzdq)) {
        localObject = (zzdq)localObject;
      } else {
        localObject = new zzdo(localIBinder);
      }
    }
    localParcel.recycle();
    return (zzdq)localObject;
  }
  
  public final IObjectWrapper zzn()
    throws RemoteException
  {
    Parcel localParcel = zzbg(1, zza());
    IObjectWrapper localIObjectWrapper = IObjectWrapper.Stub.asInterface(localParcel.readStrongBinder());
    localParcel.recycle();
    return localIObjectWrapper;
  }
  
  public final String zzr()
    throws RemoteException
  {
    Parcel localParcel = zzbg(31, zza());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final String zzs()
    throws RemoteException
  {
    throw null;
  }
  
  public final String zzt()
    throws RemoteException
  {
    throw null;
  }
  
  public final void zzx()
    throws RemoteException
  {
    zzbh(2, zza());
  }
  
  public final void zzy(zzl paramzzl, zzbk paramzzbk)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzd(localParcel, paramzzl);
    zzatq.zzf(localParcel, paramzzbk);
    zzbh(43, localParcel);
  }
  
  public final void zzz()
    throws RemoteException
  {
    zzbh(5, zza());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzbs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */