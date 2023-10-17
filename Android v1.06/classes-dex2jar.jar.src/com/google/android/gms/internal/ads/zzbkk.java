package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;

public abstract class zzbkk
  extends zzatp
  implements zzbkl
{
  public zzbkk()
  {
    super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
  }
  
  public static zzbkl zzc(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    if ((localIInterface instanceof zzbkl)) {
      return (zzbkl)localIInterface;
    }
    return new zzbkj(paramIBinder);
  }
  
  protected final boolean zzbE(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if (paramInt1 == 1)
    {
      ArrayList localArrayList = paramParcel1.createTypedArrayList(zzbke.CREATOR);
      zzatq.zzc(paramParcel1);
      zzb(localArrayList);
      paramParcel2.writeNoException();
      return true;
    }
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbkk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */