package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class zzcvv
  extends zzdas
  implements zzcvm
{
  private final ScheduledExecutorService zzb;
  private ScheduledFuture zzc;
  private boolean zzd = false;
  
  public zzcvv(zzcvu paramzzcvu, Set paramSet, Executor paramExecutor, ScheduledExecutorService paramScheduledExecutorService)
  {
    super(paramSet);
    this.zzb = paramScheduledExecutorService;
    zzm(paramzzcvu, paramExecutor);
  }
  
  public final void zza(zze paramzze)
  {
    zzp(new zzcvo(paramzze));
  }
  
  public final void zzb()
  {
    zzp(zzcvq.zza);
  }
  
  public final void zzc(zzdex paramzzdex)
  {
    if (this.zzd) {
      return;
    }
    ScheduledFuture localScheduledFuture = this.zzc;
    if (localScheduledFuture != null) {
      localScheduledFuture.cancel(true);
    }
    zzp(new zzcvn(paramzzdex));
  }
  
  public final void zze()
  {
    try
    {
      ScheduledFuture localScheduledFuture = this.zzc;
      if (localScheduledFuture != null)
      {
        localScheduledFuture.cancel(true);
        return;
      }
      return;
    }
    finally {}
  }
  
  public final void zzf()
  {
    zzbbc localzzbbc = zzbbk.zzjm;
    int i = ((Integer)zzba.zzc().zzb(localzzbbc)).intValue();
    this.zzc = this.zzb.schedule(new zzcvp(this), i, TimeUnit.MILLISECONDS);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcvv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */