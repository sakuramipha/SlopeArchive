package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzd
  extends zzi
  implements zze
{
  public static zze zzo(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
    if ((localIInterface instanceof zze)) {
      return (zze)localIInterface;
    }
    return new zzc(paramIBinder);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\play_billing\zzd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */