package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class zzbog
  extends zzatp
  implements zzboh
{
  public zzbog()
  {
    super("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
  }
  
  public static zzboh zzb(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    if ((localIInterface instanceof zzboh)) {
      return (zzboh)localIInterface;
    }
    return new zzbof(paramIBinder);
  }
  
  protected final boolean zzbE(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if (paramInt1 != 1)
    {
      if (paramInt1 != 2) {
        return false;
      }
      paramInt2 = zzf();
      paramParcel2.writeNoException();
      paramInt1 = zzatq.zza;
      paramParcel2.writeInt(paramInt2);
    }
    else
    {
      paramParcel1 = zze();
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, paramParcel1);
    }
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */