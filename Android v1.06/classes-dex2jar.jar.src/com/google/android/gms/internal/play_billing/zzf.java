package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class zzf
  extends zzi
  implements zzg
{
  public zzf()
  {
    super("com.android.vending.billing.IInAppBillingServiceCallback");
  }
  
  protected final boolean zzb(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if (paramInt1 == 1)
    {
      Bundle localBundle = (Bundle)zzj.zza(paramParcel1, Bundle.CREATOR);
      zzj.zzb(paramParcel1);
      zza(localBundle);
      paramParcel2.writeNoException();
      return true;
    }
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\play_billing\zzf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */