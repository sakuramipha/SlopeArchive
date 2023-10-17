package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzats
  extends zzatp
  implements zzatt
{
  public static zzatt zzb(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
    if ((localIInterface instanceof zzatt)) {
      return (zzatt)localIInterface;
    }
    return new zzatr(paramIBinder);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzats.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */