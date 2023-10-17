package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;

public abstract class zzbks
  extends zzatp
  implements zzbkt
{
  public zzbks()
  {
    super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
  }
  
  protected final boolean zzbE(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if (paramInt1 != 3)
    {
      if (paramInt1 != 4)
      {
        Object localObject;
        if (paramInt1 != 5)
        {
          if (paramInt1 != 6)
          {
            if (paramInt1 != 7) {
              return false;
            }
            paramParcel1 = zzc();
            paramParcel2.writeNoException();
            zzatq.zzf(paramParcel2, paramParcel1);
          }
          else
          {
            localObject = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
            zzatq.zzc(paramParcel1);
            zze((IObjectWrapper)localObject);
            paramParcel2.writeNoException();
          }
        }
        else
        {
          IObjectWrapper localIObjectWrapper = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
          localObject = paramParcel1.readStrongBinder();
          if (localObject == null)
          {
            localObject = null;
          }
          else
          {
            IInterface localIInterface = ((IBinder)localObject).queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
            if ((localIInterface instanceof zzbkw)) {
              localObject = (zzbkw)localIInterface;
            } else {
              localObject = new zzbku((IBinder)localObject);
            }
          }
          zzatq.zzc(paramParcel1);
          zzf(localIObjectWrapper, (zzbkw)localObject);
          paramParcel2.writeNoException();
        }
      }
      else
      {
        zzd();
        paramParcel2.writeNoException();
      }
    }
    else
    {
      paramParcel1 = zzb();
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, paramParcel1);
    }
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbks.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */