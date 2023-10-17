package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzatq;

public abstract class zzck
  extends zzatp
  implements zzcl
{
  public zzck()
  {
    super("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
  }
  
  public static zzcl asInterface(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    if ((localIInterface instanceof zzcl)) {
      return (zzcl)localIInterface;
    }
    return new zzcj(paramIBinder);
  }
  
  protected final boolean zzbE(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if (paramInt1 != 1)
    {
      if (paramInt1 != 2) {
        return false;
      }
      paramParcel1 = getAdapterCreator();
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, paramParcel1);
    }
    else
    {
      paramParcel1 = getLiteSdkVersion();
      paramParcel2.writeNoException();
      zzatq.zze(paramParcel2, paramParcel1);
    }
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzck.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */