package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

final class zzflt
  implements zzflr
{
  public final ExecutorService zza(int paramInt)
  {
    return zzc(1, Executors.defaultThreadFactory(), 2);
  }
  
  public final ExecutorService zzb(ThreadFactory paramThreadFactory, int paramInt)
  {
    return zzc(1, paramThreadFactory, 1);
  }
  
  public final ExecutorService zzc(int paramInt1, ThreadFactory paramThreadFactory, int paramInt2)
  {
    paramThreadFactory = new ThreadPoolExecutor(paramInt1, paramInt1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), paramThreadFactory);
    paramThreadFactory.allowCoreThreadTimeOut(true);
    return Executors.unconfigurableExecutorService(paramThreadFactory);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzflt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */