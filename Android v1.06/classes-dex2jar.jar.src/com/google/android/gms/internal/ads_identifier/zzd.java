package com.google.android.gms.internal.ads_identifier;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzd
  extends zza
  implements zzf
{
  zzd(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
  }
  
  public final String zzc()
    throws RemoteException
  {
    Parcel localParcel = zzb(1, zza());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final boolean zzd()
    throws RemoteException
  {
    Parcel localParcel = zzb(6, zza());
    boolean bool = zzc.zzb(localParcel);
    localParcel.recycle();
    return bool;
  }
  
  public final boolean zze(boolean paramBoolean)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzc.zza(localParcel, true);
    localParcel = zzb(2, localParcel);
    paramBoolean = zzc.zzb(localParcel);
    localParcel.recycle();
    return paramBoolean;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads_identifier\zzd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */