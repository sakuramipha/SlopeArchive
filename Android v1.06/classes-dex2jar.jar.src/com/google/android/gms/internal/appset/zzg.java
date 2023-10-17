package com.google.android.gms.internal.appset;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzg
  extends zza
  implements IInterface
{
  zzg(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.appset.internal.IAppSetService");
  }
  
  public final void zzc(com.google.android.gms.appset.zza paramzza, zzf paramzzf)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzc.zzb(localParcel, paramzza);
    zzc.zzc(localParcel, paramzzf);
    zzb(1, localParcel);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\appset\zzg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */