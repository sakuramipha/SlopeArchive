package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

final class zzfvj
  extends zzfvi
{
  private final zzfwb zza;
  
  zzfvj(zzfwb paramzzfwb)
  {
    Objects.requireNonNull(paramzzfwb);
    this.zza = paramzzfwb;
  }
  
  public final boolean cancel(boolean paramBoolean)
  {
    return this.zza.cancel(paramBoolean);
  }
  
  public final Object get()
    throws InterruptedException, ExecutionException
  {
    return this.zza.get();
  }
  
  public final Object get(long paramLong, TimeUnit paramTimeUnit)
    throws InterruptedException, ExecutionException, TimeoutException
  {
    return this.zza.get(paramLong, paramTimeUnit);
  }
  
  public final boolean isCancelled()
  {
    return this.zza.isCancelled();
  }
  
  public final boolean isDone()
  {
    return this.zza.isDone();
  }
  
  public final String toString()
  {
    return this.zza.toString();
  }
  
  public final void zzc(Runnable paramRunnable, Executor paramExecutor)
  {
    this.zza.zzc(paramRunnable, paramExecutor);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfvj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */