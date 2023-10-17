package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

public final class zzboc
  extends zzato
  implements zzboe
{
  zzboc(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
  }
  
  public final void zze()
    throws RemoteException
  {
    zzbh(1, zza());
  }
  
  public final void zzf()
    throws RemoteException
  {
    zzbh(2, zza());
  }
  
  public final void zzg(int paramInt)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeInt(paramInt);
    zzbh(3, localParcel);
  }
  
  public final void zzh(zze paramzze)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzd(localParcel, paramzze);
    zzbh(23, localParcel);
  }
  
  public final void zzi(int paramInt, String paramString)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeInt(paramInt);
    localParcel.writeString(paramString);
    zzbh(22, localParcel);
  }
  
  public final void zzj(int paramInt)
    throws RemoteException
  {
    throw null;
  }
  
  public final void zzk(zze paramzze)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzd(localParcel, paramzze);
    zzbh(24, localParcel);
  }
  
  public final void zzl(String paramString)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeString(paramString);
    zzbh(21, localParcel);
  }
  
  public final void zzm()
    throws RemoteException
  {
    zzbh(8, zza());
  }
  
  public final void zzn()
    throws RemoteException
  {
    zzbh(4, zza());
  }
  
  public final void zzo()
    throws RemoteException
  {
    zzbh(6, zza());
  }
  
  public final void zzp()
    throws RemoteException
  {
    zzbh(5, zza());
  }
  
  public final void zzq(String paramString1, String paramString2)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    zzbh(9, localParcel);
  }
  
  public final void zzr(zzbfk paramzzbfk, String paramString)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramzzbfk);
    localParcel.writeString(paramString);
    zzbh(10, localParcel);
  }
  
  public final void zzs(zzbvi paramzzbvi)
    throws RemoteException
  {
    throw null;
  }
  
  public final void zzt(zzbvm paramzzbvm)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramzzbvm);
    zzbh(16, localParcel);
  }
  
  public final void zzu()
    throws RemoteException
  {
    zzbh(18, zza());
  }
  
  public final void zzv()
    throws RemoteException
  {
    zzbh(11, zza());
  }
  
  public final void zzw()
    throws RemoteException
  {
    zzbh(15, zza());
  }
  
  public final void zzx()
    throws RemoteException
  {
    zzbh(20, zza());
  }
  
  public final void zzy()
    throws RemoteException
  {
    zzbh(13, zza());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzboc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */