package com.google.android.gms.internal.consent_sdk;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

final class zzcs
  implements Executor
{
  private final AtomicInteger zza = new AtomicInteger(1);
  private final ThreadPoolExecutor zzb;
  private WeakReference zzc = new WeakReference(null);
  
  zzcs(String paramString)
  {
    paramString = new zzcr(this, "Google consent worker");
    paramString = new ThreadPoolExecutor(1, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), paramString);
    this.zzb = paramString;
    paramString.allowCoreThreadTimeOut(true);
  }
  
  public final void execute(Runnable paramRunnable)
  {
    if (Thread.currentThread() == this.zzc.get())
    {
      paramRunnable.run();
      return;
    }
    this.zzb.execute(paramRunnable);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\consent_sdk\zzcs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */