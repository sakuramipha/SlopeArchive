package com.google.android.gms.tasks;

import android.app.Activity;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

final class zzw<TResult>
  extends Task<TResult>
{
  private final Object zza = new Object();
  private final zzr<TResult> zzb = new zzr();
  private boolean zzc;
  private volatile boolean zzd;
  private TResult zze;
  private Exception zzf;
  
  private final void zzf()
  {
    Preconditions.checkState(this.zzc, "Task is not yet complete");
  }
  
  private final void zzg()
  {
    if (!this.zzd) {
      return;
    }
    throw new CancellationException("Task is already canceled.");
  }
  
  private final void zzh()
  {
    if (!this.zzc) {
      return;
    }
    throw DuplicateTaskCompletionException.of(this);
  }
  
  private final void zzi()
  {
    synchronized (this.zza)
    {
      if (!this.zzc) {
        return;
      }
      this.zzb.zzb(this);
      return;
    }
  }
  
  public final Task<TResult> addOnCanceledListener(Activity paramActivity, OnCanceledListener paramOnCanceledListener)
  {
    paramOnCanceledListener = new zzh(TaskExecutors.MAIN_THREAD, paramOnCanceledListener);
    this.zzb.zza(paramOnCanceledListener);
    zzv.zza(paramActivity).zzb(paramOnCanceledListener);
    zzi();
    return this;
  }
  
  public final Task<TResult> addOnCanceledListener(OnCanceledListener paramOnCanceledListener)
  {
    addOnCanceledListener(TaskExecutors.MAIN_THREAD, paramOnCanceledListener);
    return this;
  }
  
  public final Task<TResult> addOnCanceledListener(Executor paramExecutor, OnCanceledListener paramOnCanceledListener)
  {
    this.zzb.zza(new zzh(paramExecutor, paramOnCanceledListener));
    zzi();
    return this;
  }
  
  public final Task<TResult> addOnCompleteListener(Activity paramActivity, OnCompleteListener<TResult> paramOnCompleteListener)
  {
    paramOnCompleteListener = new zzj(TaskExecutors.MAIN_THREAD, paramOnCompleteListener);
    this.zzb.zza(paramOnCompleteListener);
    zzv.zza(paramActivity).zzb(paramOnCompleteListener);
    zzi();
    return this;
  }
  
  public final Task<TResult> addOnCompleteListener(OnCompleteListener<TResult> paramOnCompleteListener)
  {
    Executor localExecutor = TaskExecutors.MAIN_THREAD;
    this.zzb.zza(new zzj(localExecutor, paramOnCompleteListener));
    zzi();
    return this;
  }
  
  public final Task<TResult> addOnCompleteListener(Executor paramExecutor, OnCompleteListener<TResult> paramOnCompleteListener)
  {
    this.zzb.zza(new zzj(paramExecutor, paramOnCompleteListener));
    zzi();
    return this;
  }
  
  public final Task<TResult> addOnFailureListener(Activity paramActivity, OnFailureListener paramOnFailureListener)
  {
    paramOnFailureListener = new zzl(TaskExecutors.MAIN_THREAD, paramOnFailureListener);
    this.zzb.zza(paramOnFailureListener);
    zzv.zza(paramActivity).zzb(paramOnFailureListener);
    zzi();
    return this;
  }
  
  public final Task<TResult> addOnFailureListener(OnFailureListener paramOnFailureListener)
  {
    addOnFailureListener(TaskExecutors.MAIN_THREAD, paramOnFailureListener);
    return this;
  }
  
  public final Task<TResult> addOnFailureListener(Executor paramExecutor, OnFailureListener paramOnFailureListener)
  {
    this.zzb.zza(new zzl(paramExecutor, paramOnFailureListener));
    zzi();
    return this;
  }
  
  public final Task<TResult> addOnSuccessListener(Activity paramActivity, OnSuccessListener<? super TResult> paramOnSuccessListener)
  {
    paramOnSuccessListener = new zzn(TaskExecutors.MAIN_THREAD, paramOnSuccessListener);
    this.zzb.zza(paramOnSuccessListener);
    zzv.zza(paramActivity).zzb(paramOnSuccessListener);
    zzi();
    return this;
  }
  
  public final Task<TResult> addOnSuccessListener(OnSuccessListener<? super TResult> paramOnSuccessListener)
  {
    addOnSuccessListener(TaskExecutors.MAIN_THREAD, paramOnSuccessListener);
    return this;
  }
  
  public final Task<TResult> addOnSuccessListener(Executor paramExecutor, OnSuccessListener<? super TResult> paramOnSuccessListener)
  {
    this.zzb.zza(new zzn(paramExecutor, paramOnSuccessListener));
    zzi();
    return this;
  }
  
  public final <TContinuationResult> Task<TContinuationResult> continueWith(Continuation<TResult, TContinuationResult> paramContinuation)
  {
    return continueWith(TaskExecutors.MAIN_THREAD, paramContinuation);
  }
  
  public final <TContinuationResult> Task<TContinuationResult> continueWith(Executor paramExecutor, Continuation<TResult, TContinuationResult> paramContinuation)
  {
    zzw localzzw = new zzw();
    this.zzb.zza(new zzd(paramExecutor, paramContinuation, localzzw));
    zzi();
    return localzzw;
  }
  
  public final <TContinuationResult> Task<TContinuationResult> continueWithTask(Continuation<TResult, Task<TContinuationResult>> paramContinuation)
  {
    return continueWithTask(TaskExecutors.MAIN_THREAD, paramContinuation);
  }
  
  public final <TContinuationResult> Task<TContinuationResult> continueWithTask(Executor paramExecutor, Continuation<TResult, Task<TContinuationResult>> paramContinuation)
  {
    zzw localzzw = new zzw();
    this.zzb.zza(new zzf(paramExecutor, paramContinuation, localzzw));
    zzi();
    return localzzw;
  }
  
  public final Exception getException()
  {
    synchronized (this.zza)
    {
      Exception localException = this.zzf;
      return localException;
    }
  }
  
  public final TResult getResult()
  {
    synchronized (this.zza)
    {
      zzf();
      zzg();
      Exception localException = this.zzf;
      if (localException == null)
      {
        localObject2 = this.zze;
        return (TResult)localObject2;
      }
      Object localObject2 = new com/google/android/gms/tasks/RuntimeExecutionException;
      ((RuntimeExecutionException)localObject2).<init>(localException);
      throw ((Throwable)localObject2);
    }
  }
  
  public final <X extends Throwable> TResult getResult(Class<X> paramClass)
    throws Throwable
  {
    synchronized (this.zza)
    {
      zzf();
      zzg();
      if (!paramClass.isInstance(this.zzf))
      {
        paramClass = this.zzf;
        if (paramClass == null)
        {
          paramClass = this.zze;
          return paramClass;
        }
        RuntimeExecutionException localRuntimeExecutionException = new com/google/android/gms/tasks/RuntimeExecutionException;
        localRuntimeExecutionException.<init>(paramClass);
        throw localRuntimeExecutionException;
      }
      throw ((Throwable)paramClass.cast(this.zzf));
    }
  }
  
  public final boolean isCanceled()
  {
    return this.zzd;
  }
  
  public final boolean isComplete()
  {
    synchronized (this.zza)
    {
      boolean bool = this.zzc;
      return bool;
    }
  }
  
  public final boolean isSuccessful()
  {
    synchronized (this.zza)
    {
      boolean bool3 = this.zzc;
      boolean bool2 = false;
      boolean bool1 = bool2;
      if (bool3)
      {
        bool1 = bool2;
        if (!this.zzd)
        {
          bool1 = bool2;
          if (this.zzf == null) {
            bool1 = true;
          }
        }
      }
      return bool1;
    }
  }
  
  public final <TContinuationResult> Task<TContinuationResult> onSuccessTask(SuccessContinuation<TResult, TContinuationResult> paramSuccessContinuation)
  {
    Executor localExecutor = TaskExecutors.MAIN_THREAD;
    zzw localzzw = new zzw();
    this.zzb.zza(new zzp(localExecutor, paramSuccessContinuation, localzzw));
    zzi();
    return localzzw;
  }
  
  public final <TContinuationResult> Task<TContinuationResult> onSuccessTask(Executor paramExecutor, SuccessContinuation<TResult, TContinuationResult> paramSuccessContinuation)
  {
    zzw localzzw = new zzw();
    this.zzb.zza(new zzp(paramExecutor, paramSuccessContinuation, localzzw));
    zzi();
    return localzzw;
  }
  
  public final void zza(Exception paramException)
  {
    Preconditions.checkNotNull(paramException, "Exception must not be null");
    synchronized (this.zza)
    {
      zzh();
      this.zzc = true;
      this.zzf = paramException;
      this.zzb.zzb(this);
      return;
    }
  }
  
  public final void zzb(TResult paramTResult)
  {
    synchronized (this.zza)
    {
      zzh();
      this.zzc = true;
      this.zze = paramTResult;
      this.zzb.zzb(this);
      return;
    }
  }
  
  public final boolean zzc()
  {
    synchronized (this.zza)
    {
      if (this.zzc) {
        return false;
      }
      this.zzc = true;
      this.zzd = true;
      this.zzb.zzb(this);
      return true;
    }
  }
  
  public final boolean zzd(Exception paramException)
  {
    Preconditions.checkNotNull(paramException, "Exception must not be null");
    synchronized (this.zza)
    {
      if (this.zzc) {
        return false;
      }
      this.zzc = true;
      this.zzf = paramException;
      this.zzb.zzb(this);
      return true;
    }
  }
  
  public final boolean zze(TResult paramTResult)
  {
    synchronized (this.zza)
    {
      if (this.zzc) {
        return false;
      }
      this.zzc = true;
      this.zze = paramTResult;
      this.zzb.zzb(this);
      return true;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\tasks\zzw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */