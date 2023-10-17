package com.google.android.gms.internal.games_v2;

import java.util.concurrent.Executor;

 enum zzfd
  implements Executor
{
  private static final zzfd[] zzb;
  
  static
  {
    zzfd localzzfd = new zzfd("INSTANCE", 0);
    zza = localzzfd;
    zzb = new zzfd[] { localzzfd };
  }
  
  public final void execute(Runnable paramRunnable)
  {
    paramRunnable.run();
  }
  
  public final String toString()
  {
    return "MoreExecutors.directExecutor()";
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\games_v2\zzfd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */