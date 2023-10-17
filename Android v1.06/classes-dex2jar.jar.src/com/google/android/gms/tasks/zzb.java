package com.google.android.gms.tasks;

final class zzb
  extends CancellationToken
{
  private final zzw<Void> zza = new zzw();
  
  public final boolean isCancellationRequested()
  {
    return this.zza.isComplete();
  }
  
  public final CancellationToken onCanceledRequested(OnTokenCanceledListener paramOnTokenCanceledListener)
  {
    zzw localzzw = this.zza;
    paramOnTokenCanceledListener = new zza(this, paramOnTokenCanceledListener);
    localzzw.addOnSuccessListener(TaskExecutors.MAIN_THREAD, paramOnTokenCanceledListener);
    return this;
  }
  
  public final void zza()
  {
    this.zza.zze(null);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\tasks\zzb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */