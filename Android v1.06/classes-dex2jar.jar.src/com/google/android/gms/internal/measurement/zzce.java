package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class zzce
  extends zzbn
  implements zzcf
{
  public zzce()
  {
    super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
  }
  
  protected final boolean zza(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if (paramInt1 == 1)
    {
      Bundle localBundle = (Bundle)zzbo.zza(paramParcel1, Bundle.CREATOR);
      zzbo.zzc(paramParcel1);
      zzd(localBundle);
      paramParcel2.writeNoException();
      return true;
    }
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzce.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */