package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzbku
  extends zzato
  implements zzbkw
{
  zzbku(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
  }
  
  public final void zze(int paramInt)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeInt(paramInt);
    zzbh(2, localParcel);
  }
  
  public final void zzf()
    throws RemoteException
  {
    zzbh(1, zza());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbku.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */