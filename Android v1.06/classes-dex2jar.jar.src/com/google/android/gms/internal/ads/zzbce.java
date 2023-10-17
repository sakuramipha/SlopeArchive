package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;

public abstract class zzbce
  extends zzatp
  implements zzbcf
{
  public zzbce()
  {
    super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
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
            zzf();
            paramParcel2.writeNoException();
          }
          else
          {
            zze();
            paramParcel2.writeNoException();
          }
        }
        else
        {
          IObjectWrapper localIObjectWrapper = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
          zzatq.zzc(paramParcel1);
          zzd(localIObjectWrapper);
          paramParcel2.writeNoException();
        }
      }
      else
      {
        paramParcel1 = zzc();
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
      }
    }
    else
    {
      paramParcel1 = zzb();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
    }
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbce.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */