package com.google.android.gms.tasks;

import android.os.Looper;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.tasks.zza;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class Tasks
{
  public static <TResult> TResult await(Task<TResult> paramTask)
    throws ExecutionException, InterruptedException
  {
    Preconditions.checkNotMainThread();
    Preconditions.checkNotNull(paramTask, "Task must not be null");
    if (paramTask.isComplete()) {
      return (TResult)zza(paramTask);
    }
    zzad localzzad = new zzad(null);
    zzb(paramTask, localzzad);
    localzzad.zza();
    return (TResult)zza(paramTask);
  }
  
  public static <TResult> TResult await(Task<TResult> paramTask, long paramLong, TimeUnit paramTimeUnit)
    throws ExecutionException, InterruptedException, TimeoutException
  {
    Preconditions.checkNotMainThread();
    Preconditions.checkNotNull(paramTask, "Task must not be null");
    Preconditions.checkNotNull(paramTimeUnit, "TimeUnit must not be null");
    if (paramTask.isComplete()) {
      return (TResult)zza(paramTask);
    }
    zzad localzzad = new zzad(null);
    zzb(paramTask, localzzad);
    if (localzzad.zzb(paramLong, paramTimeUnit)) {
      return (TResult)zza(paramTask);
    }
    throw new TimeoutException("Timed out waiting for Task");
  }
  
  @Deprecated
  public static <TResult> Task<TResult> call(Callable<TResult> paramCallable)
  {
    return call(TaskExecutors.MAIN_THREAD, paramCallable);
  }
  
  @Deprecated
  public static <TResult> Task<TResult> call(Executor paramExecutor, Callable<TResult> paramCallable)
  {
    Preconditions.checkNotNull(paramExecutor, "Executor must not be null");
    Preconditions.checkNotNull(paramCallable, "Callback must not be null");
    zzw localzzw = new zzw();
    paramExecutor.execute(new zzz(localzzw, paramCallable));
    return localzzw;
  }
  
  public static <TResult> Task<TResult> forCanceled()
  {
    zzw localzzw = new zzw();
    localzzw.zzc();
    return localzzw;
  }
  
  public static <TResult> Task<TResult> forException(Exception paramException)
  {
    zzw localzzw = new zzw();
    localzzw.zza(paramException);
    return localzzw;
  }
  
  public static <TResult> Task<TResult> forResult(TResult paramTResult)
  {
    zzw localzzw = new zzw();
    localzzw.zzb(paramTResult);
    return localzzw;
  }
  
  public static Task<Void> whenAll(Collection<? extends Task<?>> paramCollection)
  {
    if ((paramCollection != null) && (!paramCollection.isEmpty()))
    {
      Object localObject = paramCollection.iterator();
      while (((Iterator)localObject).hasNext()) {
        Objects.requireNonNull((Task)((Iterator)localObject).next(), "null tasks are not accepted");
      }
      localObject = new zzw();
      zzaf localzzaf = new zzaf(paramCollection.size(), (zzw)localObject);
      paramCollection = paramCollection.iterator();
      while (paramCollection.hasNext()) {
        zzb((Task)paramCollection.next(), localzzaf);
      }
      return (Task<Void>)localObject;
    }
    return forResult(null);
  }
  
  public static Task<Void> whenAll(Task<?>... paramVarArgs)
  {
    if ((paramVarArgs != null) && (paramVarArgs.length != 0)) {
      return whenAll(Arrays.asList(paramVarArgs));
    }
    return forResult(null);
  }
  
  public static Task<List<Task<?>>> whenAllComplete(Collection<? extends Task<?>> paramCollection)
  {
    if ((paramCollection != null) && (!paramCollection.isEmpty()))
    {
      Task localTask = whenAll(paramCollection);
      paramCollection = new zzab(paramCollection);
      return localTask.continueWithTask(TaskExecutors.MAIN_THREAD, paramCollection);
    }
    return forResult(Collections.emptyList());
  }
  
  public static Task<List<Task<?>>> whenAllComplete(Task<?>... paramVarArgs)
  {
    if ((paramVarArgs != null) && (paramVarArgs.length != 0)) {
      return whenAllComplete(Arrays.asList(paramVarArgs));
    }
    return forResult(Collections.emptyList());
  }
  
  public static <TResult> Task<List<TResult>> whenAllSuccess(Collection<? extends Task> paramCollection)
  {
    if ((paramCollection != null) && (!paramCollection.isEmpty()))
    {
      Task localTask = whenAll(paramCollection);
      paramCollection = new zzaa(paramCollection);
      return localTask.continueWith(TaskExecutors.MAIN_THREAD, paramCollection);
    }
    return forResult(Collections.emptyList());
  }
  
  public static <TResult> Task<List<TResult>> whenAllSuccess(Task... paramVarArgs)
  {
    if ((paramVarArgs != null) && (paramVarArgs.length != 0)) {
      return whenAllSuccess(Arrays.asList(paramVarArgs));
    }
    return forResult(Collections.emptyList());
  }
  
  public static <T> Task<T> withTimeout(Task<T> paramTask, long paramLong, TimeUnit paramTimeUnit)
  {
    Preconditions.checkNotNull(paramTask, "Task must not be null");
    boolean bool;
    if (paramLong > 0L) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkArgument(bool, "Timeout must be positive");
    Preconditions.checkNotNull(paramTimeUnit, "TimeUnit must not be null");
    zzb localzzb = new zzb();
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource(localzzb);
    zza localzza = new zza(Looper.getMainLooper());
    localzza.postDelayed(new zzy(localTaskCompletionSource), paramTimeUnit.toMillis(paramLong));
    paramTask.addOnCompleteListener(new zzx(localzza, localTaskCompletionSource, localzzb));
    return localTaskCompletionSource.getTask();
  }
  
  private static <TResult> TResult zza(Task<TResult> paramTask)
    throws ExecutionException
  {
    if (paramTask.isSuccessful()) {
      return (TResult)paramTask.getResult();
    }
    if (paramTask.isCanceled()) {
      throw new CancellationException("Task is already canceled");
    }
    throw new ExecutionException(paramTask.getException());
  }
  
  private static <T> void zzb(Task<T> paramTask, zzae<? super T> paramzzae)
  {
    paramTask.addOnSuccessListener(TaskExecutors.zza, paramzzae);
    paramTask.addOnFailureListener(TaskExecutors.zza, paramzzae);
    paramTask.addOnCanceledListener(TaskExecutors.zza, paramzzae);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\tasks\Tasks.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */