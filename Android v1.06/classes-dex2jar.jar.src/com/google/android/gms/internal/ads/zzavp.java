package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdm;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzavp
  extends zzato
  implements zzavr
{
  zzavp(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
  }
  
  public final zzbu zze()
    throws RemoteException
  {
    throw null;
  }
  
  public final zzdn zzf()
    throws RemoteException
  {
    Parcel localParcel = zzbg(5, zza());
    zzdn localzzdn = zzdm.zzb(localParcel.readStrongBinder());
    localParcel.recycle();
    return localzzdn;
  }
  
  public final void zzg(boolean paramBoolean)
    throws RemoteException
  {
    Parcel localParcel = zza();
    int i = zzatq.zza;
    localParcel.writeInt(paramBoolean);
    zzbh(6, localParcel);
  }
  
  public final void zzh(zzdg paramzzdg)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramzzdg);
    zzbh(7, localParcel);
  }
  
  public final void zzi(IObjectWrapper paramIObjectWrapper, zzavy paramzzavy)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper);
    zzatq.zzf(localParcel, paramzzavy);
    zzbh(4, localParcel);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzavp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */