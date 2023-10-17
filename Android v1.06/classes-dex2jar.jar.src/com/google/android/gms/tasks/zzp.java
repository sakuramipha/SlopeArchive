package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

final class zzp<TResult, TContinuationResult>
  implements OnSuccessListener<TContinuationResult>, OnFailureListener, OnCanceledListener, zzq
{
  private final Executor zza;
  private final SuccessContinuation<TResult, TContinuationResult> zzb;
  private final zzw<TContinuationResult> zzc;
  
  public zzp(Executor paramExecutor, SuccessContinuation<TResult, TContinuationResult> paramSuccessContinuation, zzw<TContinuationResult> paramzzw)
  {
    this.zza = paramExecutor;
    this.zzb = paramSuccessContinuation;
    this.zzc = paramzzw;
  }
  
  public final void onCanceled()
  {
    this.zzc.zzc();
  }
  
  public final void onFailure(Exception paramException)
  {
    this.zzc.zza(paramException);
  }
  
  public final void onSuccess(TContinuationResult paramTContinuationResult)
  {
    this.zzc.zzb(paramTContinuationResult);
  }
  
  public final void zzc()
  {
    throw new UnsupportedOperationException();
  }
  
  public final void zzd(Task<TResult> paramTask)
  {
    this.zza.execute(new zzo(this, paramTask));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\tasks\zzp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */