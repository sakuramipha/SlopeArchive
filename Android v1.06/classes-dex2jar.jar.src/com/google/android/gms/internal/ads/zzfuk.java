package com.google.android.gms.internal.ads;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

public abstract class zzfuk
  extends AbstractExecutorService
  implements zzfwc
{
  protected final RunnableFuture newTaskFor(Runnable paramRunnable, Object paramObject)
  {
    return zzfwr.zzf(paramRunnable, paramObject);
  }
  
  protected final RunnableFuture newTaskFor(Callable paramCallable)
  {
    return new zzfwr(paramCallable);
  }
  
  public final zzfwb zza(Runnable paramRunnable)
  {
    return (zzfwb)super.submit(paramRunnable);
  }
  
  public final zzfwb zzb(Callable paramCallable)
  {
    return (zzfwb)super.submit(paramCallable);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfuk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */