package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zzaz;
import com.google.android.gms.ads.internal.util.zze;

final class zzdyf
  implements zzfvn
{
  zzdyf(zzdyj paramzzdyj, zzbuc paramzzbuc) {}
  
  public final void zza(Throwable paramThrowable)
  {
    try
    {
      this.zza.zze(zzaz.zzb(paramThrowable));
      return;
    }
    catch (RemoteException paramThrowable)
    {
      zze.zzb("Service can't call client", paramThrowable);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdyf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */