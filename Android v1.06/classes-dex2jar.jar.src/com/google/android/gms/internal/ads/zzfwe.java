package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

class zzfwe
  extends zzfuk
{
  private final ExecutorService zza;
  
  zzfwe(ExecutorService paramExecutorService)
  {
    Objects.requireNonNull(paramExecutorService);
    this.zza = paramExecutorService;
  }
  
  public final boolean awaitTermination(long paramLong, TimeUnit paramTimeUnit)
    throws InterruptedException
  {
    return this.zza.awaitTermination(paramLong, paramTimeUnit);
  }
  
  public final void execute(Runnable paramRunnable)
  {
    this.zza.execute(paramRunnable);
  }
  
  public final boolean isShutdown()
  {
    return this.zza.isShutdown();
  }
  
  public final boolean isTerminated()
  {
    return this.zza.isTerminated();
  }
  
  public final void shutdown()
  {
    this.zza.shutdown();
  }
  
  public final List shutdownNow()
  {
    return this.zza.shutdownNow();
  }
  
  public final String toString()
  {
    String str1 = super.toString();
    String str2 = String.valueOf(this.zza);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(str1);
    localStringBuilder.append("[");
    localStringBuilder.append(str2);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfwe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */