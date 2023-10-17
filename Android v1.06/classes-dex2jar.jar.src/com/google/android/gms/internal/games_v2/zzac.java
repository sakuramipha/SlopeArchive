package com.google.android.gms.internal.games_v2;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public abstract class zzac
  extends zzb
  implements zzad
{
  public zzac()
  {
    super("com.google.android.gms.games.internal.connect.IGamesConnectCallbacks");
  }
  
  protected final boolean zza(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if (paramInt1 == 2)
    {
      Status localStatus = (Status)zzc.zza(paramParcel1, Status.CREATOR);
      paramParcel2 = (zzaa)zzc.zza(paramParcel1, zzaa.CREATOR);
      zzc.zzb(paramParcel1);
      zzb(localStatus, paramParcel2);
      return true;
    }
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\games_v2\zzac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */