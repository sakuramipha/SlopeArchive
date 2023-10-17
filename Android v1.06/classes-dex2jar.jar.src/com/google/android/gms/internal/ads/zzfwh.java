package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;

final class zzfwh
  extends zzfwe
  implements ScheduledExecutorService, zzfwc
{
  final ScheduledExecutorService zza;
  
  zzfwh(ScheduledExecutorService paramScheduledExecutorService)
  {
    super(paramScheduledExecutorService);
    Objects.requireNonNull(paramScheduledExecutorService);
    this.zza = paramScheduledExecutorService;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfwh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */