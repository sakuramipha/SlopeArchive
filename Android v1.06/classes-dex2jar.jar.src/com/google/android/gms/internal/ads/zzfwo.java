package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;

final class zzfwo
  extends zzfvh
{
  @CheckForNull
  private zzfwb zza;
  @CheckForNull
  private ScheduledFuture zzb;
  
  private zzfwo(zzfwb paramzzfwb)
  {
    Objects.requireNonNull(paramzzfwb);
    this.zza = paramzzfwb;
  }
  
  static zzfwb zzg(zzfwb paramzzfwb, long paramLong, TimeUnit paramTimeUnit, ScheduledExecutorService paramScheduledExecutorService)
  {
    zzfwo localzzfwo = new zzfwo(paramzzfwb);
    zzfwl localzzfwl = new zzfwl(localzzfwo);
    localzzfwo.zzb = paramScheduledExecutorService.schedule(localzzfwl, paramLong, paramTimeUnit);
    paramzzfwb.zzc(localzzfwl, zzfvf.zza);
    return localzzfwo;
  }
  
  @CheckForNull
  protected final String zza()
  {
    Object localObject = this.zza;
    ScheduledFuture localScheduledFuture = this.zzb;
    if (localObject != null)
    {
      String str = localObject.toString();
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("inputFuture=[");
      ((StringBuilder)localObject).append(str);
      ((StringBuilder)localObject).append("]");
      str = ((StringBuilder)localObject).toString();
      localObject = str;
      if (localScheduledFuture != null)
      {
        long l = localScheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        localObject = str;
        if (l > 0L)
        {
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append(str);
          ((StringBuilder)localObject).append(", remaining delay=[");
          ((StringBuilder)localObject).append(l);
          ((StringBuilder)localObject).append(" ms]");
          localObject = ((StringBuilder)localObject).toString();
        }
      }
      return (String)localObject;
    }
    return null;
  }
  
  protected final void zzb()
  {
    zzs(this.zza);
    ScheduledFuture localScheduledFuture = this.zzb;
    if (localScheduledFuture != null) {
      localScheduledFuture.cancel(false);
    }
    this.zza = null;
    this.zzb = null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfwo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */