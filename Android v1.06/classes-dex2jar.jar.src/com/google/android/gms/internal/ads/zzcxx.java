package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class zzcxx
  extends zzdas
{
  private final ScheduledExecutorService zzb;
  private final Clock zzc;
  private long zzd = -1L;
  private long zze = -1L;
  private boolean zzf = false;
  private ScheduledFuture zzg;
  
  public zzcxx(ScheduledExecutorService paramScheduledExecutorService, Clock paramClock)
  {
    super(Collections.emptySet());
    this.zzb = paramScheduledExecutorService;
    this.zzc = paramClock;
  }
  
  private final void zze(long paramLong)
  {
    try
    {
      Object localObject1 = this.zzg;
      if ((localObject1 != null) && (!((ScheduledFuture)localObject1).isDone())) {
        this.zzg.cancel(true);
      }
      this.zzd = (this.zzc.elapsedRealtime() + paramLong);
      ScheduledExecutorService localScheduledExecutorService = this.zzb;
      localObject1 = new com/google/android/gms/internal/ads/zzcxw;
      ((zzcxw)localObject1).<init>(this, null);
      this.zzg = localScheduledExecutorService.schedule((Runnable)localObject1, paramLong, TimeUnit.MILLISECONDS);
      return;
    }
    finally {}
  }
  
  public final void zza()
  {
    try
    {
      this.zzf = false;
      zze(0L);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void zzb()
  {
    try
    {
      if (!this.zzf)
      {
        ScheduledFuture localScheduledFuture = this.zzg;
        if ((localScheduledFuture != null) && (!localScheduledFuture.isCancelled()))
        {
          this.zzg.cancel(true);
          this.zze = (this.zzd - this.zzc.elapsedRealtime());
        }
        else
        {
          this.zze = -1L;
        }
        this.zzf = true;
        return;
      }
      return;
    }
    finally {}
  }
  
  public final void zzc()
  {
    try
    {
      if (this.zzf)
      {
        if ((this.zze > 0L) && (this.zzg.isCancelled())) {
          zze(this.zze);
        }
        this.zzf = false;
        return;
      }
      return;
    }
    finally {}
  }
  
  public final void zzd(int paramInt)
  {
    if (paramInt <= 0) {
      return;
    }
    try
    {
      long l1 = TimeUnit.SECONDS.toMillis(paramInt);
      if (this.zzf)
      {
        l2 = this.zze;
        if ((l2 <= 0L) || (l1 >= l2)) {
          l1 = l2;
        }
        this.zze = l1;
        return;
      }
      long l3 = this.zzc.elapsedRealtime();
      long l2 = this.zzd;
      if (l3 <= l2)
      {
        l3 = this.zzc.elapsedRealtime();
        if (l2 - l3 <= l1) {
          return;
        }
      }
      zze(l1);
      return;
    }
    finally {}
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcxx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */