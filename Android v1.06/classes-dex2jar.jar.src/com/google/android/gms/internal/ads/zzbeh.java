package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class zzbeh
  extends zzatp
  implements zzbei
{
  public zzbeh()
  {
    super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
  }
  
  public static zzbei zzj(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    if ((localIInterface instanceof zzbei)) {
      return (zzbei)localIInterface;
    }
    return new zzbeg(paramIBinder);
  }
  
  protected final boolean zzbE(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if (paramInt1 != 2)
    {
      if (paramInt1 != 3) {
        return false;
      }
      paramParcel1 = zzh();
      paramParcel2.writeNoException();
      paramParcel2.writeList(paramParcel1);
    }
    else
    {
      paramParcel1 = zzg();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
    }
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbeh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */