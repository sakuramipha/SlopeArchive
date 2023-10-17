package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzbfz
  extends zzato
  implements zzbgb
{
  zzbfz(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
  }
  
  public final void zze(zzbu paramzzbu, IObjectWrapper paramIObjectWrapper)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramzzbu);
    zzatq.zzf(localParcel, paramIObjectWrapper);
    zzbh(1, localParcel);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbfz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */