package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzbvb
  extends zzatp
  implements zzbvc
{
  public static zzbvc zzb(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    if ((localIInterface instanceof zzbvc)) {
      return (zzbvc)localIInterface;
    }
    return new zzbva(paramIBinder);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbvb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */