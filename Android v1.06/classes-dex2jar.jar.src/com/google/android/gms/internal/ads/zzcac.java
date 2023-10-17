package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class zzcac
  implements ThreadFactory
{
  final String zza;
  private final AtomicInteger zzb = new AtomicInteger(1);
  
  zzcac(String paramString) {}
  
  public final Thread newThread(Runnable paramRunnable)
  {
    String str = this.zza;
    int i = this.zzb.getAndIncrement();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("AdWorker(");
    localStringBuilder.append(str);
    localStringBuilder.append(") #");
    localStringBuilder.append(i);
    return new Thread(paramRunnable, localStringBuilder.toString());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */