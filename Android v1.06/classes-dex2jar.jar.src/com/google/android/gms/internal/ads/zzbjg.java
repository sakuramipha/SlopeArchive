package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzbjg
  extends zzato
  implements zzbji
{
  zzbjg(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
  }
  
  public final void zze()
    throws RemoteException
  {
    zzbh(2, zza());
  }
  
  public final void zzf(String paramString)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeString(paramString);
    zzbh(1, localParcel);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbjg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */