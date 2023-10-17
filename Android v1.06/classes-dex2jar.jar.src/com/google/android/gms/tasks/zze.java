package com.google.android.gms.tasks;

final class zze
  implements Runnable
{
  final zzf zzb;
  
  zze(zzf paramzzf, Task paramTask) {}
  
  public final void run()
  {
    try
    {
      Task localTask = (Task)zzf.zza(this.zzb).then(this.zza);
      if (localTask == null)
      {
        this.zzb.onFailure(new NullPointerException("Continuation returned null"));
        return;
      }
      localTask.addOnSuccessListener(TaskExecutors.zza, this.zzb);
      localTask.addOnFailureListener(TaskExecutors.zza, this.zzb);
      localTask.addOnCanceledListener(TaskExecutors.zza, this.zzb);
      return;
    }
    catch (Exception localException)
    {
      zzf.zzb(this.zzb).zza(localException);
      return;
    }
    catch (RuntimeExecutionException localRuntimeExecutionException)
    {
      if ((localRuntimeExecutionException.getCause() instanceof Exception))
      {
        zzf.zzb(this.zzb).zza((Exception)localRuntimeExecutionException.getCause());
        return;
      }
      zzf.zzb(this.zzb).zza(localRuntimeExecutionException);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\tasks\zze.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */