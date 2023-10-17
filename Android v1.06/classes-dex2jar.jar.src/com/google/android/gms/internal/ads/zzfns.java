package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicInteger;

final class zzfns
  extends zzfnp
{
  final zzfnz zzc;
  
  zzfns(zzfnz paramzzfnz, TaskCompletionSource paramTaskCompletionSource1, TaskCompletionSource paramTaskCompletionSource2, zzfnp paramzzfnp)
  {
    super(paramTaskCompletionSource1);
  }
  
  public final void zza()
  {
    synchronized (zzfnz.zzg(this.zzc))
    {
      zzfnz.zzn(this.zzc, this.zza);
      if (zzfnz.zzi(this.zzc).getAndIncrement() > 0) {
        zzfnz.zzf(this.zzc).zzc("Already connected to the service.", new Object[0]);
      }
      zzfnz.zzp(this.zzc, this.zzb);
      return;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfns.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */