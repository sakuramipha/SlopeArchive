package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class zzarn
  implements ThreadFactory
{
  private final ThreadFactory zza = Executors.defaultThreadFactory();
  private final AtomicInteger zzb = new AtomicInteger(1);
  
  public final Thread newThread(Runnable paramRunnable)
  {
    Thread localThread = this.zza.newThread(paramRunnable);
    int i = this.zzb.getAndIncrement();
    paramRunnable = new StringBuilder();
    paramRunnable.append("gads-");
    paramRunnable.append(i);
    localThread.setName(paramRunnable.toString());
    return localThread;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzarn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */