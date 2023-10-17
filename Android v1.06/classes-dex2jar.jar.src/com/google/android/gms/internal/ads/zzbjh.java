package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class zzbjh
  extends zzatp
  implements zzbji
{
  public zzbjh()
  {
    super("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
  }
  
  public static zzbji zzb(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
    if ((localIInterface instanceof zzbji)) {
      return (zzbji)localIInterface;
    }
    return new zzbjg(paramIBinder);
  }
  
  protected final boolean zzbE(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if (paramInt1 != 1)
    {
      if (paramInt1 != 2) {
        return false;
      }
      zze();
    }
    else
    {
      String str = paramParcel1.readString();
      zzatq.zzc(paramParcel1);
      zzf(str);
    }
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbjh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */