package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzcd
  extends zzbm
  implements zzcf
{
  zzcd(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
  }
  
  public final void zzd(Bundle paramBundle)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzbo.zze(localParcel, paramBundle);
    zzc(1, localParcel);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzcd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */