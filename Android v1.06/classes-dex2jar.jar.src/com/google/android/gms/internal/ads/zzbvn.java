package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdd;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdm;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzbvn
  extends zzato
  implements zzbvp
{
  zzbvn(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
  }
  
  public final Bundle zzb()
    throws RemoteException
  {
    Parcel localParcel = zzbg(9, zza());
    Bundle localBundle = (Bundle)zzatq.zza(localParcel, Bundle.CREATOR);
    localParcel.recycle();
    return localBundle;
  }
  
  public final zzdn zzc()
    throws RemoteException
  {
    Parcel localParcel = zzbg(12, zza());
    zzdn localzzdn = zzdm.zzb(localParcel.readStrongBinder());
    localParcel.recycle();
    return localzzdn;
  }
  
  public final zzbvm zzd()
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
      localObject = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
      if ((localObject instanceof zzbvm)) {
        localObject = (zzbvm)localObject;
      } else {
        localObject = new zzbvk(localIBinder);
      }
    }
    localParcel.recycle();
    return (zzbvm)localObject;
  }
  
  public final String zze()
    throws RemoteException
  {
    throw null;
  }
  
  public final void zzf(zzl paramzzl, zzbvw paramzzbvw)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzd(localParcel, paramzzl);
    zzatq.zzf(localParcel, paramzzbvw);
    zzbh(1, localParcel);
  }
  
  public final void zzg(zzl paramzzl, zzbvw paramzzbvw)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzd(localParcel, paramzzl);
    zzatq.zzf(localParcel, paramzzbvw);
    zzbh(14, localParcel);
  }
  
  public final void zzh(boolean paramBoolean)
    throws RemoteException
  {
    Parcel localParcel = zza();
    int i = zzatq.zza;
    localParcel.writeInt(paramBoolean);
    zzbh(15, localParcel);
  }
  
  public final void zzi(zzdd paramzzdd)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramzzdd);
    zzbh(8, localParcel);
  }
  
  public final void zzj(zzdg paramzzdg)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramzzdg);
    zzbh(13, localParcel);
  }
  
  public final void zzk(zzbvs paramzzbvs)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramzzbvs);
    zzbh(2, localParcel);
  }
  
  public final void zzl(zzbwd paramzzbwd)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzd(localParcel, paramzzbwd);
    zzbh(7, localParcel);
  }
  
  public final void zzm(IObjectWrapper paramIObjectWrapper)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper);
    zzbh(5, localParcel);
  }
  
  public final void zzn(IObjectWrapper paramIObjectWrapper, boolean paramBoolean)
    throws RemoteException
  {
    throw null;
  }
  
  public final boolean zzo()
    throws RemoteException
  {
    throw null;
  }
  
  public final void zzp(zzbvx paramzzbvx)
    throws RemoteException
  {
    throw null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbvn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */