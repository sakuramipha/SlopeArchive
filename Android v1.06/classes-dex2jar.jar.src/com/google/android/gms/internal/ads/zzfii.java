package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class zzfii
{
  private final BlockingQueue zza;
  private final ThreadPoolExecutor zzb;
  private final ArrayDeque zzc = new ArrayDeque();
  private zzfih zzd = null;
  
  public zzfii()
  {
    LinkedBlockingQueue localLinkedBlockingQueue = new LinkedBlockingQueue();
    this.zza = localLinkedBlockingQueue;
    this.zzb = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, localLinkedBlockingQueue);
  }
  
  private final void zzc()
  {
    zzfih localzzfih = (zzfih)this.zzc.poll();
    this.zzd = localzzfih;
    if (localzzfih != null) {
      localzzfih.executeOnExecutor(this.zzb, new Object[0]);
    }
  }
  
  public final void zza(zzfih paramzzfih)
  {
    this.zzd = null;
    zzc();
  }
  
  public final void zzb(zzfih paramzzfih)
  {
    paramzzfih.zzb(this);
    this.zzc.add(paramzzfih);
    if (this.zzd == null) {
      zzc();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfii.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */