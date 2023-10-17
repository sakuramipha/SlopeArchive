package com.google.android.gms.internal.base;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

final class zao
  implements zam
{
  public final ExecutorService zaa(ThreadFactory paramThreadFactory, int paramInt)
  {
    return zac(1, paramThreadFactory, 1);
  }
  
  public final ExecutorService zab(int paramInt1, int paramInt2)
  {
    return zac(4, Executors.defaultThreadFactory(), 2);
  }
  
  public final ExecutorService zac(int paramInt1, ThreadFactory paramThreadFactory, int paramInt2)
  {
    paramThreadFactory = new ThreadPoolExecutor(paramInt1, paramInt1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), paramThreadFactory);
    paramThreadFactory.allowCoreThreadTimeOut(true);
    return Executors.unconfigurableExecutorService(paramThreadFactory);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\base\zao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */