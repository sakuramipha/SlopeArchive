package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzbfc
  extends zzatp
  implements zzbfd
{
  public static zzbfd zzb(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
    if ((localIInterface instanceof zzbfd)) {
      return (zzbfd)localIInterface;
    }
    return new zzbfb(paramIBinder);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbfc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */