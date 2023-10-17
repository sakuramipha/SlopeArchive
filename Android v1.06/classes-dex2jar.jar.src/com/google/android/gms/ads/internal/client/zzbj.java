package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzatq;

public abstract class zzbj
  extends zzatp
  implements zzbk
{
  public zzbj()
  {
    super("com.google.android.gms.ads.internal.client.IAdLoadCallback");
  }
  
  protected final boolean zzbE(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if (paramInt1 != 1)
    {
      if (paramInt1 != 2) {
        return false;
      }
      zze localzze = (zze)zzatq.zza(paramParcel1, zze.CREATOR);
      zzatq.zzc(paramParcel1);
      zzb(localzze);
    }
    else
    {
      zzc();
    }
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzbj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */