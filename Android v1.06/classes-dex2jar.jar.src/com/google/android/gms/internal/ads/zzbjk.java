package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzbjk
  extends zzatp
  implements zzbjl
{
  public static zzbjl zzb(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
    if ((localIInterface instanceof zzbjl)) {
      return (zzbjl)localIInterface;
    }
    return new zzbjj(paramIBinder);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbjk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */