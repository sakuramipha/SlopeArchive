package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

public final class zzaku
  extends Thread
{
  private static final boolean zza = zzalu.zzb;
  private final BlockingQueue zzb;
  private final BlockingQueue zzc;
  private final zzaks zzd;
  private volatile boolean zze = false;
  private final zzalv zzf;
  private final zzakz zzg;
  
  public zzaku(BlockingQueue paramBlockingQueue1, BlockingQueue paramBlockingQueue2, zzaks paramzzaks, zzakz paramzzakz)
  {
    this.zzb = paramBlockingQueue1;
    this.zzc = paramBlockingQueue2;
    this.zzd = paramzzaks;
    this.zzg = paramzzakz;
    this.zzf = new zzalv(this, paramBlockingQueue2, paramzzakz);
  }
  
  private void zzc()
    throws InterruptedException
  {
    zzali localzzali = (zzali)this.zzb.take();
    localzzali.zzm("cache-queue-take");
    localzzali.zzt(1);
    try
    {
      localzzali.zzw();
      Object localObject3 = this.zzd.zza(localzzali.zzj());
      if (localObject3 == null)
      {
        localzzali.zzm("cache-miss");
        if (!this.zzf.zzc(localzzali)) {
          this.zzc.put(localzzali);
        }
        return;
      }
      long l = System.currentTimeMillis();
      if (((zzakr)localObject3).zza(l))
      {
        localzzali.zzm("cache-hit-expired");
        localzzali.zze((zzakr)localObject3);
        if (!this.zzf.zzc(localzzali)) {
          this.zzc.put(localzzali);
        }
        return;
      }
      localzzali.zzm("cache-hit");
      Object localObject1 = new com/google/android/gms/internal/ads/zzale;
      ((zzale)localObject1).<init>(((zzakr)localObject3).zza, ((zzakr)localObject3).zzg);
      localObject1 = localzzali.zzh((zzale)localObject1);
      localzzali.zzm("cache-hit-parsed");
      if (!((zzalo)localObject1).zzc())
      {
        localzzali.zzm("cache-parsing-failed");
        this.zzd.zzc(localzzali.zzj(), true);
        localzzali.zze(null);
        if (!this.zzf.zzc(localzzali)) {
          this.zzc.put(localzzali);
        }
        return;
      }
      if (((zzakr)localObject3).zzf < l)
      {
        localzzali.zzm("cache-hit-refresh-needed");
        localzzali.zze((zzakr)localObject3);
        ((zzalo)localObject1).zzd = true;
        if (!this.zzf.zzc(localzzali))
        {
          localObject3 = this.zzg;
          zzakt localzzakt = new com/google/android/gms/internal/ads/zzakt;
          localzzakt.<init>(this, localzzali);
          ((zzakz)localObject3).zzb(localzzali, (zzalo)localObject1, localzzakt);
        }
        else
        {
          this.zzg.zzb(localzzali, (zzalo)localObject1, null);
        }
      }
      else
      {
        this.zzg.zzb(localzzali, (zzalo)localObject1, null);
      }
      return;
    }
    finally
    {
      localzzali.zzt(2);
    }
  }
  
  public final void run()
  {
    if (zza) {
      zzalu.zzd("start new dispatcher", new Object[0]);
    }
    Process.setThreadPriority(10);
    this.zzd.zzb();
    try
    {
      for (;;)
      {
        zzc();
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      if (this.zze)
      {
        Thread.currentThread().interrupt();
        return;
      }
      zzalu.zzb("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
    }
  }
  
  public final void zzb()
  {
    this.zze = true;
    interrupt();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaku.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */