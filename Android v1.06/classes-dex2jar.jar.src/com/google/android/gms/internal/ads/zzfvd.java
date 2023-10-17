package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

abstract class zzfvd
  extends zzfwa
{
  private final Executor zza;
  final zzfve zzb;
  
  zzfvd(zzfve paramzzfve, Executor paramExecutor)
  {
    Objects.requireNonNull(paramExecutor);
    this.zza = paramExecutor;
  }
  
  abstract void zzc(Object paramObject);
  
  final void zzd(Throwable paramThrowable)
  {
    zzfve.zzH(this.zzb, null);
    if ((paramThrowable instanceof ExecutionException))
    {
      this.zzb.zze(((ExecutionException)paramThrowable).getCause());
      return;
    }
    if ((paramThrowable instanceof CancellationException))
    {
      this.zzb.cancel(false);
      return;
    }
    this.zzb.zze(paramThrowable);
  }
  
  final void zze(Object paramObject)
  {
    zzfve.zzH(this.zzb, null);
    zzc(paramObject);
  }
  
  final void zzf()
  {
    try
    {
      this.zza.execute(this);
      return;
    }
    catch (RejectedExecutionException localRejectedExecutionException)
    {
      this.zzb.zze(localRejectedExecutionException);
    }
  }
  
  final boolean zzg()
  {
    return this.zzb.isDone();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfvd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */