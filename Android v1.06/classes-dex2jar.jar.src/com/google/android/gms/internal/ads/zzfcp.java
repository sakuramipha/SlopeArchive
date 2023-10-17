package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class zzfcp
  implements ThreadFactory
{
  private final AtomicInteger zza = new AtomicInteger(1);
  
  public final Thread newThread(Runnable paramRunnable)
  {
    int i = this.zza.getAndIncrement();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("AdWorker(NG) #");
    localStringBuilder.append(i);
    return new Thread(paramRunnable, localStringBuilder.toString());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfcp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */