package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzatq;

public abstract class zzds
  extends zzatp
  implements zzdt
{
  public zzds()
  {
    super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
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
            boolean bool = zzatq.zzg(paramParcel1);
            zzatq.zzc(paramParcel1);
            zzf(bool);
          }
          else
          {
            zze();
          }
        }
        else {
          zzg();
        }
      }
      else {
        zzh();
      }
    }
    else {
      zzi();
    }
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzds.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */