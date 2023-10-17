package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

public final class zzbkj
  extends zzato
  implements zzbkl
{
  zzbkj(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback");
  }
  
  public final void zzb(List paramList)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeTypedList(paramList);
    zzbh(1, localParcel);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbkj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */