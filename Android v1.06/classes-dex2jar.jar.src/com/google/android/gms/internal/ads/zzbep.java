package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class zzbep
  extends zzatp
  implements zzbeq
{
  public zzbep()
  {
    super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
  }
  
  public static zzbeq zzg(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    if ((localIInterface instanceof zzbeq)) {
      return (zzbeq)localIInterface;
    }
    return new zzbeo(paramIBinder);
  }
  
  protected final boolean zzbE(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if (paramInt1 != 1)
    {
      if (paramInt1 != 2)
      {
        if (paramInt1 != 3)
        {
          if (paramInt1 != 4)
          {
            if (paramInt1 != 5) {
              return false;
            }
            paramInt1 = zzc();
            paramParcel2.writeNoException();
            paramParcel2.writeInt(paramInt1);
          }
          else
          {
            paramInt1 = zzd();
            paramParcel2.writeNoException();
            paramParcel2.writeInt(paramInt1);
          }
        }
        else
        {
          double d = zzb();
          paramParcel2.writeNoException();
          paramParcel2.writeDouble(d);
        }
      }
      else
      {
        paramParcel1 = zze();
        paramParcel2.writeNoException();
        zzatq.zze(paramParcel2, paramParcel1);
      }
    }
    else
    {
      paramParcel1 = zzf();
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, paramParcel1);
    }
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbep.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */