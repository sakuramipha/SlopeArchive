package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzcgu
  extends zzatp
  implements zzcgv
{
  public static zzcgv zzb(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.measurement.IMeasurementManager");
    if ((localIInterface instanceof zzcgv)) {
      return (zzcgv)localIInterface;
    }
    return new zzcgt(paramIBinder);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcgu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */