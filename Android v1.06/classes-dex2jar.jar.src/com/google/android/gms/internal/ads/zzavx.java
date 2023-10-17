package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

public abstract class zzavx
  extends zzatp
  implements zzavy
{
  public zzavx()
  {
    super("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
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
            zzb();
          }
          else
          {
            zze();
          }
        }
        else
        {
          zze localzze = (zze)zzatq.zza(paramParcel1, zze.CREATOR);
          zzatq.zzc(paramParcel1);
          zzd(localzze);
        }
      }
      else {
        zzc();
      }
    }
    else {
      zzf();
    }
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzavx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */