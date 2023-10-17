package com.google.android.gms.internal.drive;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzew
  extends zza
  implements zzeu
{
  zzew(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.drive.internal.IEventReleaseCallback");
  }
  
  public final void zza(boolean paramBoolean)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzc.writeBoolean(localParcel, paramBoolean);
    zzc(1, localParcel);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzew.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */