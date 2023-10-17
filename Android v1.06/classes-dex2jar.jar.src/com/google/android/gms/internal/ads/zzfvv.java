package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

final class zzfvv
  implements zzfwb
{
  static final zzfwb zza = new zzfvv(null);
  private static final Logger zzb = Logger.getLogger(zzfvv.class.getName());
  private final Object zzc;
  
  zzfvv(Object paramObject)
  {
    this.zzc = paramObject;
  }
  
  public final boolean cancel(boolean paramBoolean)
  {
    return false;
  }
  
  public final Object get()
  {
    return this.zzc;
  }
  
  public final Object get(long paramLong, TimeUnit paramTimeUnit)
    throws ExecutionException
  {
    Objects.requireNonNull(paramTimeUnit);
    return this.zzc;
  }
  
  public final boolean isCancelled()
  {
    return false;
  }
  
  public final boolean isDone()
  {
    return true;
  }
  
  public final String toString()
  {
    String str2 = super.toString();
    String str1 = String.valueOf(this.zzc);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(str2);
    localStringBuilder.append("[status=SUCCESS, result=[");
    localStringBuilder.append(str1);
    localStringBuilder.append("]]");
    return localStringBuilder.toString();
  }
  
  public final void zzc(Runnable paramRunnable, Executor paramExecutor)
  {
    zzfoz.zzc(paramRunnable, "Runnable was null.");
    zzfoz.zzc(paramExecutor, "Executor was null.");
    try
    {
      paramExecutor.execute(paramRunnable);
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      Logger localLogger = zzb;
      Level localLevel = Level.SEVERE;
      paramRunnable = String.valueOf(paramRunnable);
      paramExecutor = String.valueOf(paramExecutor);
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("RuntimeException while executing runnable ");
      localStringBuilder.append(paramRunnable);
      localStringBuilder.append(" with executor ");
      localStringBuilder.append(paramExecutor);
      localLogger.logp(localLevel, "com.google.common.util.concurrent.ImmediateFuture", "addListener", localStringBuilder.toString(), localRuntimeException);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfvv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */