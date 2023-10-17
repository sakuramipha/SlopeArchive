package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzato;
import com.google.android.gms.internal.ads.zzatq;

public final class zzde
  extends zzato
  implements zzdg
{
  zzde(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
  }
  
  public final void zze(zzs paramzzs)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzd(localParcel, paramzzs);
    zzbh(1, localParcel);
  }
  
  public final boolean zzf()
    throws RemoteException
  {
    Parcel localParcel = zzbg(2, zza());
    boolean bool = zzatq.zzg(localParcel);
    localParcel.recycle();
    return bool;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzde.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */