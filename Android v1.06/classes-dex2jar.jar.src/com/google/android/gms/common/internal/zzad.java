package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.zzn;
import com.google.android.gms.common.zzq;
import com.google.android.gms.common.zzs;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

public final class zzad
  extends zza
  implements zzaf
{
  zzad(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
  }
  
  public final zzq zze(zzn paramzzn)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzc.zzc(localParcel, paramzzn);
    localParcel = zzB(6, localParcel);
    paramzzn = (zzq)zzc.zza(localParcel, zzq.CREATOR);
    localParcel.recycle();
    return paramzzn;
  }
  
  public final boolean zzf(zzs paramzzs, IObjectWrapper paramIObjectWrapper)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzc.zzc(localParcel, paramzzs);
    zzc.zze(localParcel, paramIObjectWrapper);
    paramzzs = zzB(5, localParcel);
    boolean bool = zzc.zzf(paramzzs);
    paramzzs.recycle();
    return bool;
  }
  
  public final boolean zzg()
    throws RemoteException
  {
    Parcel localParcel = zzB(7, zza());
    boolean bool = zzc.zzf(localParcel);
    localParcel.recycle();
    return bool;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\zzad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */