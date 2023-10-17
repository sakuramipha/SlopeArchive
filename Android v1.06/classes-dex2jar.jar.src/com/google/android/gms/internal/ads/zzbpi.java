package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;

public abstract class zzbpi
  extends zzatp
  implements zzbpj
{
  public zzbpi()
  {
    super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
  }
  
  protected final boolean zzbE(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    Object localObject;
    if (paramInt1 != 1)
    {
      if (paramInt1 != 2)
      {
        if (paramInt1 != 3)
        {
          if (paramInt1 != 4) {
            return false;
          }
          localObject = zzbog.zzb(paramParcel1.readStrongBinder());
          zzatq.zzc(paramParcel1);
          zzh((zzboh)localObject);
        }
        else
        {
          localObject = (zze)zzatq.zza(paramParcel1, zze.CREATOR);
          zzatq.zzc(paramParcel1);
          zzf((zze)localObject);
        }
      }
      else
      {
        localObject = paramParcel1.readString();
        zzatq.zzc(paramParcel1);
        zze((String)localObject);
      }
    }
    else
    {
      localObject = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      zzg((IObjectWrapper)localObject);
    }
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbpi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */