package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzcg
  extends zzbm
  implements zzci
{
  zzcg(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
  }
  
  public final int zzd()
    throws RemoteException
  {
    Parcel localParcel = zzb(2, zza());
    int i = localParcel.readInt();
    localParcel.recycle();
    return i;
  }
  
  public final void zze(String paramString1, String paramString2, Bundle paramBundle, long paramLong)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    zzbo.zze(localParcel, paramBundle);
    localParcel.writeLong(paramLong);
    zzc(1, localParcel);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzcg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */