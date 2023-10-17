package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzbfq
  extends zzatp
  implements zzbfr
{
  public static zzbfr zzb(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    if ((localIInterface instanceof zzbfr)) {
      return (zzbfr)localIInterface;
    }
    return new zzbfp(paramIBinder);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbfq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */