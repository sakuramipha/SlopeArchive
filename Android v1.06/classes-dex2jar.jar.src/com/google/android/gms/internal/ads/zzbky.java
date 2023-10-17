package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzbky
  extends zzatp
  implements zzbkz
{
  public static zzbkz zzb(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    if ((localIInterface instanceof zzbkz)) {
      return (zzbkz)localIInterface;
    }
    return new zzbkx(paramIBinder);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbky.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */