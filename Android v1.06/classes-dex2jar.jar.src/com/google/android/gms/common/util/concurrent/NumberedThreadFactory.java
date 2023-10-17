package com.google.android.gms.common.util.concurrent;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class NumberedThreadFactory
  implements ThreadFactory
{
  private final String zza;
  private final AtomicInteger zzb = new AtomicInteger();
  private final ThreadFactory zzc = Executors.defaultThreadFactory();
  
  public NumberedThreadFactory(String paramString)
  {
    Preconditions.checkNotNull(paramString, "Name must not be null");
    this.zza = paramString;
  }
  
  public final Thread newThread(Runnable paramRunnable)
  {
    Thread localThread = this.zzc.newThread(new zza(paramRunnable, 0));
    String str = this.zza;
    int i = this.zzb.getAndIncrement();
    paramRunnable = new StringBuilder(str.length() + 13);
    paramRunnable.append(str);
    paramRunnable.append("[");
    paramRunnable.append(i);
    paramRunnable.append("]");
    localThread.setName(paramRunnable.toString());
    return localThread;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\commo\\util\concurrent\NumberedThreadFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */