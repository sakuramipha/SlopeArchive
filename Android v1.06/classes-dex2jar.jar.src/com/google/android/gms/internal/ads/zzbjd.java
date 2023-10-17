package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzbjd
  extends zzato
  implements zzbjf
{
  zzbjd(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
  }
  
  public final void zzb(String paramString)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeString(paramString);
    zzbh(1, localParcel);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbjd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */