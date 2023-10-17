package com.google.android.gms.tasks;

import java.util.ArrayDeque;
import java.util.Queue;

final class zzr<TResult>
{
  private final Object zza = new Object();
  private Queue<zzq<TResult>> zzb;
  private boolean zzc;
  
  public final void zza(zzq<TResult> paramzzq)
  {
    synchronized (this.zza)
    {
      if (this.zzb == null)
      {
        ArrayDeque localArrayDeque = new java/util/ArrayDeque;
        localArrayDeque.<init>();
        this.zzb = localArrayDeque;
      }
      this.zzb.add(paramzzq);
      return;
    }
  }
  
  public final void zzb(Task<TResult> paramTask)
  {
    synchronized (this.zza)
    {
      if ((this.zzb != null) && (!this.zzc))
      {
        this.zzc = true;
        synchronized (this.zza)
        {
          zzq localzzq = (zzq)this.zzb.poll();
          if (localzzq == null)
          {
            this.zzc = false;
            return;
          }
          localzzq.zzd(paramTask);
        }
      }
      return;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\tasks\zzr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */