package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzfnk
  extends zzatp
  implements zzfnl
{
  public static zzfnl zzb(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    if ((localIInterface instanceof zzfnl)) {
      return (zzfnl)localIInterface;
    }
    return new zzfnj(paramIBinder);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfnk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */