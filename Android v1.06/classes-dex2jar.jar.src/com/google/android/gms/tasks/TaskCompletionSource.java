package com.google.android.gms.tasks;

public class TaskCompletionSource<TResult>
{
  private final zzw<TResult> zza = new zzw();
  
  public TaskCompletionSource() {}
  
  public TaskCompletionSource(CancellationToken paramCancellationToken)
  {
    paramCancellationToken.onCanceledRequested(new zzs(this));
  }
  
  public Task<TResult> getTask()
  {
    return this.zza;
  }
  
  public void setException(Exception paramException)
  {
    this.zza.zza(paramException);
  }
  
  public void setResult(TResult paramTResult)
  {
    this.zza.zzb(paramTResult);
  }
  
  public boolean trySetException(Exception paramException)
  {
    return this.zza.zzd(paramException);
  }
  
  public boolean trySetResult(TResult paramTResult)
  {
    return this.zza.zze(paramTResult);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\tasks\TaskCompletionSource.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */