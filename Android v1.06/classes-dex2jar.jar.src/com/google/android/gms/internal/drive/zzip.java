package com.google.android.gms.internal.drive;

import android.os.IBinder;
import android.os.IInterface;

public final class zzip
  extends zzb
  implements zzio
{
  public static zzio zzb(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
    if ((localIInterface instanceof zzio)) {
      return (zzio)localIInterface;
    }
    return new zziq(paramIBinder);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzip.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */