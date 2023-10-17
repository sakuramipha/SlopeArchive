package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public abstract class zzfvk
  extends zzfri
  implements Future
{
  public boolean cancel(boolean paramBoolean)
  {
    return zzb().cancel(paramBoolean);
  }
  
  public final Object get()
    throws InterruptedException, ExecutionException
  {
    return zzb().get();
  }
  
  public final Object get(long paramLong, TimeUnit paramTimeUnit)
    throws InterruptedException, ExecutionException, TimeoutException
  {
    return zzb().get(paramLong, paramTimeUnit);
  }
  
  public final boolean isCancelled()
  {
    return zzb().isCancelled();
  }
  
  public final boolean isDone()
  {
    return zzb().isDone();
  }
  
  protected abstract Future zzb();
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfvk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */