package com.google.android.gms.internal.appset;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;

final class zzj
  implements Runnable
{
  final zzl zza;
  
  public final void run()
  {
    long l = this.zza.zza();
    if ((l != -1L) && (DefaultClock.getInstance().currentTimeMillis() > l)) {
      zzl.zze(zzl.zzb(this.zza));
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\appset\zzj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */