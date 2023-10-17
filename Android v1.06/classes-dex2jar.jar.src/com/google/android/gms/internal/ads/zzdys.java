package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zzaz;
import com.google.android.gms.ads.internal.util.zze;

final class zzdys
  implements zzfvn
{
  zzdys(zzdyt paramzzdyt, zzbtz paramzzbtz) {}
  
  public final void zza(Throwable paramThrowable)
  {
    try
    {
      this.zza.zze(zzaz.zzb(paramThrowable));
      return;
    }
    catch (RemoteException paramThrowable)
    {
      zze.zzb("Ad service can't call client", paramThrowable);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdys.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */