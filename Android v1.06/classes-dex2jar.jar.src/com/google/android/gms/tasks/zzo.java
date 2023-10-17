package com.google.android.gms.tasks;

import java.util.concurrent.CancellationException;

final class zzo
  implements Runnable
{
  final zzp zzb;
  
  zzo(zzp paramzzp, Task paramTask) {}
  
  public final void run()
  {
    try
    {
      Task localTask = zzp.zza(this.zzb).then(this.zza.getResult());
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
      this.zzb.onFailure(localException);
      return;
    }
    catch (CancellationException localCancellationException)
    {
      this.zzb.onCanceled();
      return;
    }
    catch (RuntimeExecutionException localRuntimeExecutionException)
    {
      if ((localRuntimeExecutionException.getCause() instanceof Exception))
      {
        this.zzb.onFailure((Exception)localRuntimeExecutionException.getCause());
        return;
      }
      this.zzb.onFailure(localRuntimeExecutionException);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\tasks\zzo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */