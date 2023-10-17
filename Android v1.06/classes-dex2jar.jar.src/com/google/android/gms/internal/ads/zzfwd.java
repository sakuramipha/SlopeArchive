package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

final class zzfwd
  implements Executor
{
  final Executor zza;
  
  zzfwd(Executor paramExecutor, zzfuf paramzzfuf) {}
  
  public final void execute(Runnable paramRunnable)
  {
    try
    {
      this.zza.execute(paramRunnable);
      return;
    }
    catch (RejectedExecutionException paramRunnable)
    {
      this.zzb.zze(paramRunnable);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfwd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */