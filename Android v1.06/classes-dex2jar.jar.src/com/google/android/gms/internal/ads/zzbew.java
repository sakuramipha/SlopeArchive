package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzbew
  extends zzatp
  implements zzbex
{
  public static zzbex zzb(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
    if ((localIInterface instanceof zzbex)) {
      return (zzbex)localIInterface;
    }
    return new zzbev(paramIBinder);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbew.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */