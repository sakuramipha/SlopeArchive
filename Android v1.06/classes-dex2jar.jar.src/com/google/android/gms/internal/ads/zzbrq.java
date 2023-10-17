package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzbrq
  extends zzatp
  implements zzbrr
{
  public static zzbrr zzb(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
    if ((localIInterface instanceof zzbrr)) {
      return (zzbrr)localIInterface;
    }
    return new zzbrp(paramIBinder);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbrq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */