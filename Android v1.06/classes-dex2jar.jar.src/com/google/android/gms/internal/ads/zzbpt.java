package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzbpt
  extends zzato
  implements zzbpv
{
  zzbpt(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
  }
  
  public final zzdq zze()
    throws RemoteException
  {
    Parcel localParcel = zzbg(5, zza());
    zzdq localzzdq = zzdp.zzb(localParcel.readStrongBinder());
    localParcel.recycle();
    return localzzdq;
  }
  
  public final zzbqj zzf()
    throws RemoteException
  {
    Parcel localParcel = zzbg(2, zza());
    zzbqj localzzbqj = (zzbqj)zzatq.zza(localParcel, zzbqj.CREATOR);
    localParcel.recycle();
    return localzzbqj;
  }
  
  public final zzbqj zzg()
    throws RemoteException
  {
    Parcel localParcel = zzbg(3, zza());
    zzbqj localzzbqj = (zzbqj)zzatq.zza(localParcel, zzbqj.CREATOR);
    localParcel.recycle();
    return localzzbqj;
  }
  
  public final void zzh(IObjectWrapper paramIObjectWrapper, String paramString, Bundle paramBundle1, Bundle paramBundle2, zzq paramzzq, zzbpy paramzzbpy)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper);
    localParcel.writeString(paramString);
    zzatq.zzd(localParcel, paramBundle1);
    zzatq.zzd(localParcel, paramBundle2);
    zzatq.zzd(localParcel, paramzzq);
    zzatq.zzf(localParcel, paramzzbpy);
    zzbh(1, localParcel);
  }
  
  public final void zzi(String paramString1, String paramString2, zzl paramzzl, IObjectWrapper paramIObjectWrapper, zzbpg paramzzbpg, zzboe paramzzboe)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    zzatq.zzd(localParcel, paramzzl);
    zzatq.zzf(localParcel, paramIObjectWrapper);
    zzatq.zzf(localParcel, paramzzbpg);
    zzatq.zzf(localParcel, paramzzboe);
    zzbh(23, localParcel);
  }
  
  public final void zzj(String paramString1, String paramString2, zzl paramzzl, IObjectWrapper paramIObjectWrapper, zzbpj paramzzbpj, zzboe paramzzboe, zzq paramzzq)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    zzatq.zzd(localParcel, paramzzl);
    zzatq.zzf(localParcel, paramIObjectWrapper);
    zzatq.zzf(localParcel, paramzzbpj);
    zzatq.zzf(localParcel, paramzzboe);
    zzatq.zzd(localParcel, paramzzq);
    zzbh(13, localParcel);
  }
  
  public final void zzk(String paramString1, String paramString2, zzl paramzzl, IObjectWrapper paramIObjectWrapper, zzbpj paramzzbpj, zzboe paramzzboe, zzq paramzzq)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    zzatq.zzd(localParcel, paramzzl);
    zzatq.zzf(localParcel, paramIObjectWrapper);
    zzatq.zzf(localParcel, paramzzbpj);
    zzatq.zzf(localParcel, paramzzboe);
    zzatq.zzd(localParcel, paramzzq);
    zzbh(21, localParcel);
  }
  
  public final void zzl(String paramString1, String paramString2, zzl paramzzl, IObjectWrapper paramIObjectWrapper, zzbpm paramzzbpm, zzboe paramzzboe)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    zzatq.zzd(localParcel, paramzzl);
    zzatq.zzf(localParcel, paramIObjectWrapper);
    zzatq.zzf(localParcel, paramzzbpm);
    zzatq.zzf(localParcel, paramzzboe);
    zzbh(14, localParcel);
  }
  
  public final void zzm(String paramString1, String paramString2, zzl paramzzl, IObjectWrapper paramIObjectWrapper, zzbpp paramzzbpp, zzboe paramzzboe)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    zzatq.zzd(localParcel, paramzzl);
    zzatq.zzf(localParcel, paramIObjectWrapper);
    zzatq.zzf(localParcel, paramzzbpp);
    zzatq.zzf(localParcel, paramzzboe);
    zzbh(18, localParcel);
  }
  
  public final void zzn(String paramString1, String paramString2, zzl paramzzl, IObjectWrapper paramIObjectWrapper, zzbpp paramzzbpp, zzboe paramzzboe, zzbee paramzzbee)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    zzatq.zzd(localParcel, paramzzl);
    zzatq.zzf(localParcel, paramIObjectWrapper);
    zzatq.zzf(localParcel, paramzzbpp);
    zzatq.zzf(localParcel, paramzzboe);
    zzatq.zzd(localParcel, paramzzbee);
    zzbh(22, localParcel);
  }
  
  public final void zzo(String paramString1, String paramString2, zzl paramzzl, IObjectWrapper paramIObjectWrapper, zzbps paramzzbps, zzboe paramzzboe)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    zzatq.zzd(localParcel, paramzzl);
    zzatq.zzf(localParcel, paramIObjectWrapper);
    zzatq.zzf(localParcel, paramzzbps);
    zzatq.zzf(localParcel, paramzzboe);
    zzbh(20, localParcel);
  }
  
  public final void zzp(String paramString1, String paramString2, zzl paramzzl, IObjectWrapper paramIObjectWrapper, zzbps paramzzbps, zzboe paramzzboe)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    zzatq.zzd(localParcel, paramzzl);
    zzatq.zzf(localParcel, paramIObjectWrapper);
    zzatq.zzf(localParcel, paramzzbps);
    zzatq.zzf(localParcel, paramzzboe);
    zzbh(16, localParcel);
  }
  
  public final void zzq(String paramString)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeString(paramString);
    zzbh(19, localParcel);
  }
  
  public final boolean zzr(IObjectWrapper paramIObjectWrapper)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper);
    paramIObjectWrapper = zzbg(24, localParcel);
    boolean bool = zzatq.zzg(paramIObjectWrapper);
    paramIObjectWrapper.recycle();
    return bool;
  }
  
  public final boolean zzs(IObjectWrapper paramIObjectWrapper)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper);
    paramIObjectWrapper = zzbg(15, localParcel);
    boolean bool = zzatq.zzg(paramIObjectWrapper);
    paramIObjectWrapper.recycle();
    return bool;
  }
  
  public final boolean zzt(IObjectWrapper paramIObjectWrapper)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper);
    paramIObjectWrapper = zzbg(17, localParcel);
    boolean bool = zzatq.zzg(paramIObjectWrapper);
    paramIObjectWrapper.recycle();
    return bool;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbpt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */