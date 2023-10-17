package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzbch
  extends zzatp
  implements zzbci
{
  public static zzbci zzb(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    if ((localIInterface instanceof zzbci)) {
      return (zzbci)localIInterface;
    }
    return new zzbcg(paramIBinder);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbch.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */