package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzawl
  extends zzato
  implements IInterface
{
  zzawl(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
  }
  
  public final long zze(zzawj paramzzawj)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzd(localParcel, paramzzawj);
    paramzzawj = zzbg(3, localParcel);
    long l = paramzzawj.readLong();
    paramzzawj.recycle();
    return l;
  }
  
  public final zzawg zzf(zzawj paramzzawj)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzd(localParcel, paramzzawj);
    localParcel = zzbg(1, localParcel);
    paramzzawj = (zzawg)zzatq.zza(localParcel, zzawg.CREATOR);
    localParcel.recycle();
    return paramzzawj;
  }
  
  public final zzawg zzg(zzawj paramzzawj)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzd(localParcel, paramzzawj);
    localParcel = zzbg(2, localParcel);
    paramzzawj = (zzawg)zzatq.zza(localParcel, zzawg.CREATOR);
    localParcel.recycle();
    return paramzzawj;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzawl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */