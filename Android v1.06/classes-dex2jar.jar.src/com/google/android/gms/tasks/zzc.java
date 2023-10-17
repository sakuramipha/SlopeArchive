package com.google.android.gms.tasks;

final class zzc
  implements Runnable
{
  final zzd zzb;
  
  zzc(zzd paramzzd, Task paramTask) {}
  
  public final void run()
  {
    if (this.zza.isCanceled())
    {
      zzd.zzb(this.zzb).zzc();
      return;
    }
    try
    {
      Object localObject = zzd.zza(this.zzb).then(this.zza);
      zzd.zzb(this.zzb).zzb(localObject);
      return;
    }
    catch (Exception localException)
    {
      zzd.zzb(this.zzb).zza(localException);
      return;
    }
    catch (RuntimeExecutionException localRuntimeExecutionException)
    {
      if ((localRuntimeExecutionException.getCause() instanceof Exception))
      {
        zzd.zzb(this.zzb).zza((Exception)localRuntimeExecutionException.getCause());
        return;
      }
      zzd.zzb(this.zzb).zza(localRuntimeExecutionException);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\tasks\zzc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */