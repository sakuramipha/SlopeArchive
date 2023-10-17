package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzbfs
  extends zzato
  implements zzbfu
{
  zzbfs(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
  }
  
  public final void zze(zzbfk paramzzbfk, String paramString)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramzzbfk);
    localParcel.writeString(paramString);
    zzbh(1, localParcel);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbfs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */