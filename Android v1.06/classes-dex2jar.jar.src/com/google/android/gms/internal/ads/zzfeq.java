package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

final class zzfeq
  implements zzfen
{
  private final zzfen zza;
  private final Queue zzb;
  private final int zzc;
  private final AtomicBoolean zzd;
  
  public zzfeq(zzfen paramzzfen, ScheduledExecutorService paramScheduledExecutorService)
  {
    this.zza = paramzzfen;
    this.zzb = new LinkedBlockingQueue();
    paramzzfen = zzbbk.zzig;
    this.zzc = ((Integer)zzba.zzc().zzb(paramzzfen)).intValue();
    this.zzd = new AtomicBoolean(false);
    paramzzfen = zzbbk.zzif;
    int i = ((Integer)zzba.zzc().zzb(paramzzfen)).intValue();
    paramzzfen = new zzfep(this);
    long l = i;
    paramScheduledExecutorService.scheduleAtFixedRate(paramzzfen, l, l, TimeUnit.MILLISECONDS);
  }
  
  public final String zza(zzfem paramzzfem)
  {
    return this.zza.zza(paramzzfem);
  }
  
  public final void zzb(zzfem paramzzfem)
  {
    if (this.zzb.size() >= this.zzc)
    {
      if (!this.zzd.getAndSet(true))
      {
        Queue localQueue = this.zzb;
        zzfem localzzfem = zzfem.zzb("dropped_event");
        paramzzfem = paramzzfem.zzj();
        if (paramzzfem.containsKey("action")) {
          localzzfem.zza("dropped_action", (String)paramzzfem.get("action"));
        }
        localQueue.offer(localzzfem);
      }
      return;
    }
    this.zzb.offer(paramzzfem);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfeq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */