package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import java.util.List;

public final class zzbnz
  extends zzato
  implements zzbob
{
  zzbnz(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
  }
  
  public final void zzA(IObjectWrapper paramIObjectWrapper, zzl paramzzl, String paramString, zzboe paramzzboe)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper);
    zzatq.zzd(localParcel, paramzzl);
    localParcel.writeString(paramString);
    zzatq.zzf(localParcel, paramzzboe);
    zzbh(28, localParcel);
  }
  
  public final void zzB(zzl paramzzl, String paramString1, String paramString2)
    throws RemoteException
  {
    throw null;
  }
  
  public final void zzC(IObjectWrapper paramIObjectWrapper, zzl paramzzl, String paramString, zzboe paramzzboe)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper);
    zzatq.zzd(localParcel, paramzzl);
    localParcel.writeString(paramString);
    zzatq.zzf(localParcel, paramzzboe);
    zzbh(32, localParcel);
  }
  
  public final void zzD(IObjectWrapper paramIObjectWrapper)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper);
    zzbh(21, localParcel);
  }
  
  public final void zzE()
    throws RemoteException
  {
    zzbh(8, zza());
  }
  
  public final void zzF()
    throws RemoteException
  {
    zzbh(9, zza());
  }
  
  public final void zzG(boolean paramBoolean)
    throws RemoteException
  {
    Parcel localParcel = zza();
    int i = zzatq.zza;
    localParcel.writeInt(paramBoolean);
    zzbh(25, localParcel);
  }
  
  public final void zzH(IObjectWrapper paramIObjectWrapper)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper);
    zzbh(39, localParcel);
  }
  
  public final void zzI()
    throws RemoteException
  {
    zzbh(4, zza());
  }
  
  public final void zzJ(IObjectWrapper paramIObjectWrapper)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper);
    zzbh(37, localParcel);
  }
  
  public final void zzK(IObjectWrapper paramIObjectWrapper)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper);
    zzbh(30, localParcel);
  }
  
  public final void zzL()
    throws RemoteException
  {
    zzbh(12, zza());
  }
  
  public final boolean zzM()
    throws RemoteException
  {
    Parcel localParcel = zzbg(22, zza());
    boolean bool = zzatq.zzg(localParcel);
    localParcel.recycle();
    return bool;
  }
  
  public final boolean zzN()
    throws RemoteException
  {
    Parcel localParcel = zzbg(13, zza());
    boolean bool = zzatq.zzg(localParcel);
    localParcel.recycle();
    return bool;
  }
  
  public final zzboj zzO()
    throws RemoteException
  {
    Parcel localParcel = zzbg(15, zza());
    Object localObject = localParcel.readStrongBinder();
    if (localObject == null)
    {
      localObject = null;
    }
    else
    {
      IInterface localIInterface = ((IBinder)localObject).queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
      if ((localIInterface instanceof zzboj)) {
        localObject = (zzboj)localIInterface;
      } else {
        localObject = new zzboj((IBinder)localObject);
      }
    }
    localParcel.recycle();
    return (zzboj)localObject;
  }
  
  public final zzbok zzP()
    throws RemoteException
  {
    Parcel localParcel = zzbg(16, zza());
    IBinder localIBinder = localParcel.readStrongBinder();
    Object localObject;
    if (localIBinder == null)
    {
      localObject = null;
    }
    else
    {
      localObject = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
      if ((localObject instanceof zzbok)) {
        localObject = (zzbok)localObject;
      } else {
        localObject = new zzbok(localIBinder);
      }
    }
    localParcel.recycle();
    return (zzbok)localObject;
  }
  
  public final Bundle zze()
    throws RemoteException
  {
    throw null;
  }
  
  public final Bundle zzf()
    throws RemoteException
  {
    throw null;
  }
  
  public final Bundle zzg()
    throws RemoteException
  {
    throw null;
  }
  
  public final zzdq zzh()
    throws RemoteException
  {
    Parcel localParcel = zzbg(26, zza());
    zzdq localzzdq = zzdp.zzb(localParcel.readStrongBinder());
    localParcel.recycle();
    return localzzdq;
  }
  
  public final zzbfk zzi()
    throws RemoteException
  {
    throw null;
  }
  
  public final zzboh zzj()
    throws RemoteException
  {
    Parcel localParcel = zzbg(36, zza());
    IBinder localIBinder = localParcel.readStrongBinder();
    Object localObject;
    if (localIBinder == null)
    {
      localObject = null;
    }
    else
    {
      localObject = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
      if ((localObject instanceof zzboh)) {
        localObject = (zzboh)localObject;
      } else {
        localObject = new zzbof(localIBinder);
      }
    }
    localParcel.recycle();
    return (zzboh)localObject;
  }
  
  public final zzbon zzk()
    throws RemoteException
  {
    Parcel localParcel = zzbg(27, zza());
    IBinder localIBinder = localParcel.readStrongBinder();
    Object localObject;
    if (localIBinder == null)
    {
      localObject = null;
    }
    else
    {
      localObject = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
      if ((localObject instanceof zzbon)) {
        localObject = (zzbon)localObject;
      } else {
        localObject = new zzbol(localIBinder);
      }
    }
    localParcel.recycle();
    return (zzbon)localObject;
  }
  
  public final zzbqj zzl()
    throws RemoteException
  {
    Parcel localParcel = zzbg(33, zza());
    zzbqj localzzbqj = (zzbqj)zzatq.zza(localParcel, zzbqj.CREATOR);
    localParcel.recycle();
    return localzzbqj;
  }
  
  public final zzbqj zzm()
    throws RemoteException
  {
    Parcel localParcel = zzbg(34, zza());
    zzbqj localzzbqj = (zzbqj)zzatq.zza(localParcel, zzbqj.CREATOR);
    localParcel.recycle();
    return localzzbqj;
  }
  
  public final IObjectWrapper zzn()
    throws RemoteException
  {
    Parcel localParcel = zzbg(2, zza());
    IObjectWrapper localIObjectWrapper = IObjectWrapper.Stub.asInterface(localParcel.readStrongBinder());
    localParcel.recycle();
    return localIObjectWrapper;
  }
  
  public final void zzo()
    throws RemoteException
  {
    zzbh(5, zza());
  }
  
  public final void zzp(IObjectWrapper paramIObjectWrapper, zzl paramzzl, String paramString1, zzbvh paramzzbvh, String paramString2)
    throws RemoteException
  {
    paramString1 = zza();
    zzatq.zzf(paramString1, paramIObjectWrapper);
    zzatq.zzd(paramString1, paramzzl);
    paramString1.writeString(null);
    zzatq.zzf(paramString1, paramzzbvh);
    paramString1.writeString(paramString2);
    zzbh(10, paramString1);
  }
  
  public final void zzq(IObjectWrapper paramIObjectWrapper, zzbki paramzzbki, List paramList)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper);
    zzatq.zzf(localParcel, paramzzbki);
    localParcel.writeTypedList(paramList);
    zzbh(31, localParcel);
  }
  
  public final void zzr(IObjectWrapper paramIObjectWrapper, zzbvh paramzzbvh, List paramList)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper);
    zzatq.zzf(localParcel, paramzzbvh);
    localParcel.writeStringList(paramList);
    zzbh(23, localParcel);
  }
  
  public final void zzs(zzl paramzzl, String paramString)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzd(localParcel, paramzzl);
    localParcel.writeString(paramString);
    zzbh(11, localParcel);
  }
  
  public final void zzt(IObjectWrapper paramIObjectWrapper, zzl paramzzl, String paramString, zzboe paramzzboe)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper);
    zzatq.zzd(localParcel, paramzzl);
    localParcel.writeString(paramString);
    zzatq.zzf(localParcel, paramzzboe);
    zzbh(38, localParcel);
  }
  
  public final void zzu(IObjectWrapper paramIObjectWrapper, zzq paramzzq, zzl paramzzl, String paramString, zzboe paramzzboe)
    throws RemoteException
  {
    throw null;
  }
  
  public final void zzv(IObjectWrapper paramIObjectWrapper, zzq paramzzq, zzl paramzzl, String paramString1, String paramString2, zzboe paramzzboe)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper);
    zzatq.zzd(localParcel, paramzzq);
    zzatq.zzd(localParcel, paramzzl);
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    zzatq.zzf(localParcel, paramzzboe);
    zzbh(6, localParcel);
  }
  
  public final void zzw(IObjectWrapper paramIObjectWrapper, zzq paramzzq, zzl paramzzl, String paramString1, String paramString2, zzboe paramzzboe)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper);
    zzatq.zzd(localParcel, paramzzq);
    zzatq.zzd(localParcel, paramzzl);
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    zzatq.zzf(localParcel, paramzzboe);
    zzbh(35, localParcel);
  }
  
  public final void zzx(IObjectWrapper paramIObjectWrapper, zzl paramzzl, String paramString, zzboe paramzzboe)
    throws RemoteException
  {
    throw null;
  }
  
  public final void zzy(IObjectWrapper paramIObjectWrapper, zzl paramzzl, String paramString1, String paramString2, zzboe paramzzboe)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper);
    zzatq.zzd(localParcel, paramzzl);
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    zzatq.zzf(localParcel, paramzzboe);
    zzbh(7, localParcel);
  }
  
  public final void zzz(IObjectWrapper paramIObjectWrapper, zzl paramzzl, String paramString1, String paramString2, zzboe paramzzboe, zzbee paramzzbee, List paramList)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper);
    zzatq.zzd(localParcel, paramzzl);
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    zzatq.zzf(localParcel, paramzzboe);
    zzatq.zzd(localParcel, paramzzbee);
    localParcel.writeStringList(paramList);
    zzbh(14, localParcel);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbnz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */