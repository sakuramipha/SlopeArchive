package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzfkf
  extends zzato
  implements IInterface
{
  zzfkf(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.gass.internal.IGassService");
  }
  
  public final zzfkd zze(zzfkb paramzzfkb)
    throws RemoteException
  {
    Object localObject = zza();
    zzatq.zzd((Parcel)localObject, paramzzfkb);
    paramzzfkb = zzbg(1, (Parcel)localObject);
    localObject = (zzfkd)zzatq.zza(paramzzfkb, zzfkd.CREATOR);
    paramzzfkb.recycle();
    return (zzfkd)localObject;
  }
  
  public final zzfkm zzf(zzfkk paramzzfkk)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzd(localParcel, paramzzfkk);
    localParcel = zzbg(3, localParcel);
    paramzzfkk = (zzfkm)zzatq.zza(localParcel, zzfkm.CREATOR);
    localParcel.recycle();
    return paramzzfkk;
  }
  
  public final void zzg(zzfjy paramzzfjy)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzd(localParcel, paramzzfjy);
    zzbh(2, localParcel);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfkf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */