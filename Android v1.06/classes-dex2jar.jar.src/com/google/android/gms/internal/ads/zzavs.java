package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

public final class zzavs
  extends zzato
  implements zzavu
{
  zzavs(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
  }
  
  public final void zzb(int paramInt)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeInt(paramInt);
    zzbh(2, localParcel);
  }
  
  public final void zzc(zze paramzze)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzd(localParcel, paramzze);
    zzbh(3, localParcel);
  }
  
  public final void zzd(zzavr paramzzavr)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramzzavr);
    zzbh(1, localParcel);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzavs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */