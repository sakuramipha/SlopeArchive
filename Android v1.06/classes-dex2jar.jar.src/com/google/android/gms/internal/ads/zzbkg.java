package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzbkg
  extends zzato
  implements zzbki
{
  zzbkg(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
  }
  
  public final void zze(String paramString)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeString(paramString);
    zzbh(3, localParcel);
  }
  
  public final void zzf()
    throws RemoteException
  {
    zzbh(2, zza());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbkg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */