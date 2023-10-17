package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class zzbje
  extends zzatp
  implements zzbjf
{
  public zzbje()
  {
    super("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
  }
  
  public static zzbjf zzc(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
    if ((localIInterface instanceof zzbjf)) {
      return (zzbjf)localIInterface;
    }
    return new zzbjd(paramIBinder);
  }
  
  protected final boolean zzbE(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if (paramInt1 == 1)
    {
      String str = paramParcel1.readString();
      zzatq.zzc(paramParcel1);
      zzb(str);
      paramParcel2.writeNoException();
      return true;
    }
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbje.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */