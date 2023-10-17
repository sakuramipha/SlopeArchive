package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzbcg
  extends zzato
  implements zzbci
{
  zzbcg(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
  }
  
  public final void zze(zzbcf paramzzbcf)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramzzbcf);
    zzbh(1, localParcel);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbcg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */