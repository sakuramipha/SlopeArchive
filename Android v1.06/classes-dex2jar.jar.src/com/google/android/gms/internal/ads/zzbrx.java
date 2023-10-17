package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzbrx
  extends zzatp
  implements zzbry
{
  public static zzbry zzb(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
    if ((localIInterface instanceof zzbry)) {
      return (zzbry)localIInterface;
    }
    return new zzbrw(paramIBinder);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbrx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */