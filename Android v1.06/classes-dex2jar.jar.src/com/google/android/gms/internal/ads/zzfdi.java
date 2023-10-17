package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class zzfdi
  implements zzfwb
{
  private final Object zza;
  private final String zzb;
  private final zzfwb zzc;
  
  public zzfdi(Object paramObject, String paramString, zzfwb paramzzfwb)
  {
    this.zza = paramObject;
    this.zzb = paramString;
    this.zzc = paramzzfwb;
  }
  
  public final boolean cancel(boolean paramBoolean)
  {
    return this.zzc.cancel(paramBoolean);
  }
  
  public final Object get()
    throws InterruptedException, ExecutionException
  {
    return this.zzc.get();
  }
  
  public final Object get(long paramLong, TimeUnit paramTimeUnit)
    throws InterruptedException, ExecutionException, TimeoutException
  {
    return this.zzc.get(paramLong, paramTimeUnit);
  }
  
  public final boolean isCancelled()
  {
    return this.zzc.isCancelled();
  }
  
  public final boolean isDone()
  {
    return this.zzc.isDone();
  }
  
  public final String toString()
  {
    String str = this.zzb;
    int i = System.identityHashCode(this);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(str);
    localStringBuilder.append("@");
    localStringBuilder.append(i);
    return localStringBuilder.toString();
  }
  
  public final Object zza()
  {
    return this.zza;
  }
  
  public final String zzb()
  {
    return this.zzb;
  }
  
  public final void zzc(Runnable paramRunnable, Executor paramExecutor)
  {
    this.zzc.zzc(paramRunnable, paramExecutor);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfdi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */