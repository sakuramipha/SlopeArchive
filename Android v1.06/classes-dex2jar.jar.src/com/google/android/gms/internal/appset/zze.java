package com.google.android.gms.internal.appset;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public abstract class zze
  extends zzb
  implements zzf
{
  public zze()
  {
    super("com.google.android.gms.appset.internal.IAppSetIdCallback");
  }
  
  protected final boolean zza(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if (paramInt1 == 1)
    {
      zzb((Status)zzc.zza(paramParcel1, Status.CREATOR), (com.google.android.gms.appset.zzc)zzc.zza(paramParcel1, com.google.android.gms.appset.zzc.CREATOR));
      return true;
    }
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\appset\zze.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */