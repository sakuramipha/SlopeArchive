package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzbvk
  extends zzato
  implements zzbvm
{
  zzbvk(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
  }
  
  public final int zze()
    throws RemoteException
  {
    Parcel localParcel = zzbg(2, zza());
    int i = localParcel.readInt();
    localParcel.recycle();
    return i;
  }
  
  public final String zzf()
    throws RemoteException
  {
    Parcel localParcel = zzbg(1, zza());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbvk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */