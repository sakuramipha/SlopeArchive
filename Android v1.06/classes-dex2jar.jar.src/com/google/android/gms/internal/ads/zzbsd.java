package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public final class zzbsd
  extends zzatp
  implements zzbse
{
  public static zzbse zzb(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
    if ((localIInterface instanceof zzbse)) {
      return (zzbse)localIInterface;
    }
    return new zzbsc(paramIBinder);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbsd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */