package com.google.android.gms.tasks;

import com.google.android.gms.common.internal.Preconditions;

final class zzk
  implements Runnable
{
  final zzl zzb;
  
  zzk(zzl paramzzl, Task paramTask) {}
  
  public final void run()
  {
    synchronized (zzl.zzb(this.zzb))
    {
      zzl localzzl = this.zzb;
      if (zzl.zza(localzzl) != null) {
        zzl.zza(localzzl).onFailure((Exception)Preconditions.checkNotNull(this.zza.getException()));
      }
      return;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\tasks\zzk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */