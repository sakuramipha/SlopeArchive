package com.google.android.gms.internal.drive;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzev
  extends zzb
  implements zzeu
{
  public static zzeu zza(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.drive.internal.IEventReleaseCallback");
    if ((localIInterface instanceof zzeu)) {
      return (zzeu)localIInterface;
    }
    return new zzew(paramIBinder);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzev.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */