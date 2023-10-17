package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzatp;

public abstract class zzcv
  extends zzatp
  implements zzcw
{
  public zzcv()
  {
    super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
  }
  
  public static zzcw zzb(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    if ((localIInterface instanceof zzcw)) {
      return (zzcw)localIInterface;
    }
    return new zzcu(paramIBinder);
  }
  
  protected final boolean zzbE(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if (paramInt1 != 1)
    {
      if (paramInt1 != 2) {
        return false;
      }
      paramParcel1 = zzf();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
    }
    else
    {
      paramParcel1 = zze();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
    }
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzcv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */