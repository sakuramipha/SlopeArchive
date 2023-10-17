package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

final class zzd<TResult, TContinuationResult>
  implements zzq<TResult>
{
  private final Executor zza;
  private final Continuation<TResult, TContinuationResult> zzb;
  private final zzw<TContinuationResult> zzc;
  
  public zzd(Executor paramExecutor, Continuation<TResult, TContinuationResult> paramContinuation, zzw<TContinuationResult> paramzzw)
  {
    this.zza = paramExecutor;
    this.zzb = paramContinuation;
    this.zzc = paramzzw;
  }
  
  public final void zzc()
  {
    throw new UnsupportedOperationException();
  }
  
  public final void zzd(Task<TResult> paramTask)
  {
    this.zza.execute(new zzc(this, paramTask));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\tasks\zzd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */