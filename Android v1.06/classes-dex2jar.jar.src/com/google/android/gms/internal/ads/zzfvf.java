package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

 enum zzfvf
  implements Executor
{
  private static final zzfvf[] zzb;
  
  static
  {
    zzfvf localzzfvf = new zzfvf("INSTANCE", 0);
    zza = localzzfvf;
    zzb = new zzfvf[] { localzzfvf };
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


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfvf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */