package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class zzfwf
  extends zzfvl
  implements ScheduledFuture, zzfwb
{
  private final ScheduledFuture zza;
  
  public zzfwf(zzfwb paramzzfwb, ScheduledFuture paramScheduledFuture)
  {
    super(paramzzfwb);
    this.zza = paramScheduledFuture;
  }
  
  public final boolean cancel(boolean paramBoolean)
  {
    boolean bool = zzb().cancel(paramBoolean);
    if (bool) {
      this.zza.cancel(paramBoolean);
    }
    return bool;
  }
  
  public final long getDelay(TimeUnit paramTimeUnit)
  {
    return this.zza.getDelay(paramTimeUnit);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfwf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */