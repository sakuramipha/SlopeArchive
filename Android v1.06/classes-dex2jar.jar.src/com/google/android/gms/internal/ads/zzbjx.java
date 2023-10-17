package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzbjx
  extends zzato
  implements IInterface
{
  zzbjx(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
  }
  
  public final void zze(zzbjr paramzzbjr, zzbjw paramzzbjw)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzd(localParcel, paramzzbjr);
    zzatq.zzf(localParcel, paramzzbjw);
    zzbi(2, localParcel);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbjx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */