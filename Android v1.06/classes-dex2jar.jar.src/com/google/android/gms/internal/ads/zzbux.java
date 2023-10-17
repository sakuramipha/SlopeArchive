package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzbux
  extends zzato
  implements IInterface
{
  zzbux(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
  }
  
  public final void zze(zzbuw paramzzbuw, String paramString1, String paramString2)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramzzbuw);
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    zzbh(2, localParcel);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbux.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */