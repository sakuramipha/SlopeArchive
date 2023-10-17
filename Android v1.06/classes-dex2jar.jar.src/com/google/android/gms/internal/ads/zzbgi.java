package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzbgi
  extends zzato
  implements zzbgk
{
  zzbgi(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
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


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbgi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */