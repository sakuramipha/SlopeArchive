package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzato;
import com.google.android.gms.internal.ads.zzatq;
import com.google.android.gms.internal.ads.zzbke;
import com.google.android.gms.internal.ads.zzbkl;
import com.google.android.gms.internal.ads.zzbny;
import java.util.ArrayList;
import java.util.List;

public final class zzcm
  extends zzato
  implements zzco
{
  zzcm(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
  }
  
  public final float zze()
    throws RemoteException
  {
    Parcel localParcel = zzbg(7, zza());
    float f = localParcel.readFloat();
    localParcel.recycle();
    return f;
  }
  
  public final String zzf()
    throws RemoteException
  {
    Parcel localParcel = zzbg(9, zza());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final List zzg()
    throws RemoteException
  {
    Parcel localParcel = zzbg(13, zza());
    ArrayList localArrayList = localParcel.createTypedArrayList(zzbke.CREATOR);
    localParcel.recycle();
    return localArrayList;
  }
  
  public final void zzh(String paramString)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeString(paramString);
    zzbh(10, localParcel);
  }
  
  public final void zzi()
    throws RemoteException
  {
    zzbh(15, zza());
  }
  
  public final void zzj(boolean paramBoolean)
    throws RemoteException
  {
    Parcel localParcel = zza();
    int i = zzatq.zza;
    localParcel.writeInt(paramBoolean);
    zzbh(17, localParcel);
  }
  
  public final void zzk()
    throws RemoteException
  {
    zzbh(1, zza());
  }
  
  public final void zzl(String paramString, IObjectWrapper paramIObjectWrapper)
    throws RemoteException
  {
    paramString = zza();
    paramString.writeString(null);
    zzatq.zzf(paramString, paramIObjectWrapper);
    zzbh(6, paramString);
  }
  
  public final void zzm(zzda paramzzda)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramzzda);
    zzbh(16, localParcel);
  }
  
  public final void zzn(IObjectWrapper paramIObjectWrapper, String paramString)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper);
    localParcel.writeString(paramString);
    zzbh(5, localParcel);
  }
  
  public final void zzo(zzbny paramzzbny)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramzzbny);
    zzbh(11, localParcel);
  }
  
  public final void zzp(boolean paramBoolean)
    throws RemoteException
  {
    Parcel localParcel = zza();
    int i = zzatq.zza;
    localParcel.writeInt(paramBoolean);
    zzbh(4, localParcel);
  }
  
  public final void zzq(float paramFloat)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeFloat(paramFloat);
    zzbh(2, localParcel);
  }
  
  public final void zzr(String paramString)
    throws RemoteException
  {
    throw null;
  }
  
  public final void zzs(zzbkl paramzzbkl)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramzzbkl);
    zzbh(12, localParcel);
  }
  
  public final void zzt(String paramString)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeString(paramString);
    zzbh(18, localParcel);
  }
  
  public final void zzu(zzff paramzzff)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzd(localParcel, paramzzff);
    zzbh(14, localParcel);
  }
  
  public final boolean zzv()
    throws RemoteException
  {
    Parcel localParcel = zzbg(8, zza());
    boolean bool = zzatq.zzg(localParcel);
    localParcel.recycle();
    return bool;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzcm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */