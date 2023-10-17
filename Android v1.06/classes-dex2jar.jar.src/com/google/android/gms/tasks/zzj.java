package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;

final class zzj<TResult>
  implements zzq<TResult>
{
  private final Executor zza;
  private final Object zzb = new Object();
  @Nullable
  private OnCompleteListener<TResult> zzc;
  
  public zzj(Executor paramExecutor, OnCompleteListener<TResult> paramOnCompleteListener)
  {
    this.zza = paramExecutor;
    this.zzc = paramOnCompleteListener;
  }
  
  public final void zzc()
  {
    synchronized (this.zzb)
    {
      this.zzc = null;
      return;
    }
  }
  
  public final void zzd(Task<TResult> paramTask)
  {
    synchronized (this.zzb)
    {
      if (this.zzc == null) {
        return;
      }
      this.zza.execute(new zzi(this, paramTask));
      return;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\tasks\zzj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */