package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzbfn
  extends zzatp
  implements zzbfo
{
  public static zzbfo zzb(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    if ((localIInterface instanceof zzbfo)) {
      return (zzbfo)localIInterface;
    }
    return new zzbfm(paramIBinder);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbfn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */