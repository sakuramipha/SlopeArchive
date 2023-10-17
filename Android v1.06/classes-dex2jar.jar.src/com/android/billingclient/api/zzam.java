package com.android.billingclient.api;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class zzam
  implements ThreadFactory
{
  private final ThreadFactory zza = Executors.defaultThreadFactory();
  private final AtomicInteger zzb = new AtomicInteger(1);
  
  zzam(BillingClientImpl paramBillingClientImpl) {}
  
  public final Thread newThread(Runnable paramRunnable)
  {
    paramRunnable = this.zza.newThread(paramRunnable);
    int i = this.zzb.getAndIncrement();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("PlayBillingLibrary-");
    localStringBuilder.append(i);
    paramRunnable.setName(localStringBuilder.toString());
    return paramRunnable;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\android\billingclient\api\zzam.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */