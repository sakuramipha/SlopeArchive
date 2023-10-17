package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.TaskCompletionSource;

public abstract class zzfnp
  implements Runnable
{
  private final TaskCompletionSource zza;
  
  zzfnp()
  {
    this.zza = null;
  }
  
  public zzfnp(TaskCompletionSource paramTaskCompletionSource)
  {
    this.zza = paramTaskCompletionSource;
  }
  
  public final void run()
  {
    try
    {
      zza();
      return;
    }
    catch (Exception localException)
    {
      zzc(localException);
    }
  }
  
  protected abstract void zza();
  
  final TaskCompletionSource zzb()
  {
    return this.zza;
  }
  
  public final void zzc(Exception paramException)
  {
    TaskCompletionSource localTaskCompletionSource = this.zza;
    if (localTaskCompletionSource != null) {
      localTaskCompletionSource.trySetException(paramException);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfnp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */