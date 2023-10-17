package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.zzatp;

public abstract class zzbx
  extends zzatp
  implements zzby
{
  public static zzby zzb(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
    if ((localIInterface instanceof zzby)) {
      return (zzby)localIInterface;
    }
    return new zzbw(paramIBinder);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzbx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */