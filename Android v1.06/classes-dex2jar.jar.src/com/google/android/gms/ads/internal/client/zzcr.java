package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzatp;

public abstract class zzcr
  extends zzatp
  implements zzcs
{
  public zzcr()
  {
    super("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
  }
  
  public static zzcs zzb(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
    if ((localIInterface instanceof zzcs)) {
      return (zzcs)localIInterface;
    }
    return new zzcq(paramIBinder);
  }
  
  protected final boolean zzbE(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if (paramInt1 == 1)
    {
      zze();
      paramParcel2.writeNoException();
      return true;
    }
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzcr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */