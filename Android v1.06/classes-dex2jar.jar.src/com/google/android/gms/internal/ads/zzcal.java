package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public class zzcal
  implements zzfwb
{
  private final zzfwk zza = zzfwk.zzf();
  
  private static final boolean zza(boolean paramBoolean)
  {
    if (!paramBoolean) {
      zzt.zzo().zzt(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
    }
    return paramBoolean;
  }
  
  public boolean cancel(boolean paramBoolean)
  {
    return this.zza.cancel(paramBoolean);
  }
  
  public final Object get()
    throws ExecutionException, InterruptedException
  {
    return this.zza.get();
  }
  
  public final Object get(long paramLong, TimeUnit paramTimeUnit)
    throws ExecutionException, InterruptedException, TimeoutException
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
  
  public final void zzc(Runnable paramRunnable, Executor paramExecutor)
  {
    this.zza.zzc(paramRunnable, paramExecutor);
  }
  
  public final boolean zzd(Object paramObject)
  {
    boolean bool = this.zza.zzd(paramObject);
    zza(bool);
    return bool;
  }
  
  public final boolean zze(Throwable paramThrowable)
  {
    boolean bool = this.zza.zze(paramThrowable);
    zza(bool);
    return bool;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcal.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */