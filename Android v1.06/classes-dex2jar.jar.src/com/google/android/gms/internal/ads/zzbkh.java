package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class zzbkh
  extends zzatp
  implements zzbki
{
  public zzbkh()
  {
    super("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
  }
  
  public static zzbki zzb(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    if ((localIInterface instanceof zzbki)) {
      return (zzbki)localIInterface;
    }
    return new zzbkg(paramIBinder);
  }
  
  protected final boolean zzbE(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if (paramInt1 != 2)
    {
      if (paramInt1 != 3) {
        return false;
      }
      String str = paramParcel1.readString();
      zzatq.zzc(paramParcel1);
      zze(str);
    }
    else
    {
      zzf();
    }
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbkh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */