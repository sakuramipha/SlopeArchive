package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

public abstract class zzbvv
  extends zzatp
  implements zzbvw
{
  public zzbvv()
  {
    super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
  }
  
  protected final boolean zzbE(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if (paramInt1 != 1)
    {
      if (paramInt1 != 2)
      {
        if (paramInt1 != 3) {
          return false;
        }
        zze localzze = (zze)zzatq.zza(paramParcel1, zze.CREATOR);
        zzatq.zzc(paramParcel1);
        zzf(localzze);
      }
      else
      {
        paramInt1 = paramParcel1.readInt();
        zzatq.zzc(paramParcel1);
        zze(paramInt1);
      }
    }
    else {
      zzg();
    }
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbvv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */