package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class zzcol
  implements zzaur
{
  private final ScheduledExecutorService zza;
  private final Clock zzb;
  private ScheduledFuture zzc;
  private long zzd = -1L;
  private long zze = -1L;
  private Runnable zzf = null;
  private boolean zzg = false;
  
  public zzcol(ScheduledExecutorService paramScheduledExecutorService, Clock paramClock)
  {
    this.zza = paramScheduledExecutorService;
    this.zzb = paramClock;
    zzt.zzb().zzc(this);
  }
  
  public final void zza(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      zzc();
      return;
    }
    zzb();
  }
  
  final void zzb()
  {
    try
    {
      if (!this.zzg)
      {
        ScheduledFuture localScheduledFuture = this.zzc;
        if ((localScheduledFuture != null) && (!localScheduledFuture.isDone()))
        {
          this.zzc.cancel(true);
          this.zze = (this.zzd - this.zzb.elapsedRealtime());
        }
        else
        {
          this.zze = -1L;
        }
        this.zzg = true;
        return;
      }
      return;
    }
    finally {}
  }
  
  final void zzc()
  {
    try
    {
      if (this.zzg)
      {
        if (this.zze > 0L)
        {
          ScheduledFuture localScheduledFuture = this.zzc;
          if ((localScheduledFuture != null) && (localScheduledFuture.isCancelled())) {
            this.zzc = this.zza.schedule(this.zzf, this.zze, TimeUnit.MILLISECONDS);
          }
        }
        this.zzg = false;
        return;
      }
      return;
    }
    finally {}
  }
  
  public final void zzd(int paramInt, Runnable paramRunnable)
  {
    try
    {
      this.zzf = paramRunnable;
      long l1 = this.zzb.elapsedRealtime();
      long l2 = paramInt;
      this.zzd = (l1 + l2);
      this.zzc = this.zza.schedule(paramRunnable, l2, TimeUnit.MILLISECONDS);
      return;
    }
    finally {}
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcol.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */