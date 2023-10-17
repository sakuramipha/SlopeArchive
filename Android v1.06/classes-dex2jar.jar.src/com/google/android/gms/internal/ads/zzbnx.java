package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class zzbnx
  extends zzatp
  implements zzbny
{
  public zzbnx()
  {
    super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
  }
  
  public static zzbny zzf(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    if ((localIInterface instanceof zzbny)) {
      return (zzbny)localIInterface;
    }
    return new zzbnw(paramIBinder);
  }
  
  protected final boolean zzbE(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    String str;
    if (paramInt1 != 1)
    {
      if (paramInt1 != 2)
      {
        if (paramInt1 != 3)
        {
          if (paramInt1 != 4) {
            return false;
          }
          str = paramParcel1.readString();
          zzatq.zzc(paramParcel1);
          paramInt1 = zzd(str);
          paramParcel2.writeNoException();
          paramParcel2.writeInt(paramInt1);
        }
        else
        {
          str = paramParcel1.readString();
          zzatq.zzc(paramParcel1);
          paramParcel1 = zzc(str);
          paramParcel2.writeNoException();
          zzatq.zzf(paramParcel2, paramParcel1);
        }
      }
      else
      {
        str = paramParcel1.readString();
        zzatq.zzc(paramParcel1);
        paramInt1 = zze(str);
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
      }
    }
    else
    {
      str = paramParcel1.readString();
      zzatq.zzc(paramParcel1);
      paramParcel1 = zzb(str);
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, paramParcel1);
    }
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbnx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */