package com.google.android.gms.internal.games_v2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzae
  extends zza
  implements IInterface
{
  zzae(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.games.internal.connect.IGamesConnectService");
  }
  
  public final void zzd(zzad paramzzad, zzy paramzzy)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzc.zzf(localParcel, paramzzad);
    zzc.zzd(localParcel, paramzzy);
    zzc(2, localParcel);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\games_v2\zzae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */