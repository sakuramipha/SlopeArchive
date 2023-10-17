package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

public abstract class zzbpr
  extends zzatp
  implements zzbps
{
  public zzbpr()
  {
    super("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
  }
  
  protected final boolean zzbE(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if (paramInt1 != 2)
    {
      Object localObject;
      if (paramInt1 != 3)
      {
        if (paramInt1 != 4) {
          return false;
        }
        localObject = (zze)zzatq.zza(paramParcel1, zze.CREATOR);
        zzatq.zzc(paramParcel1);
        zzf((zze)localObject);
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
      zzg();
    }
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbpr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */