package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzato;

public final class zzcu
  extends zzato
  implements zzcw
{
  zzcu(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason");
  }
  
  public final String zze()
    throws RemoteException
  {
    Parcel localParcel = zzbg(1, zza());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final String zzf()
    throws RemoteException
  {
    Parcel localParcel = zzbg(2, zza());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzcu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */