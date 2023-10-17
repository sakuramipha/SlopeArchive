package com.google.android.gms.tasks;

final class zzm
  implements Runnable
{
  final zzn zzb;
  
  zzm(zzn paramzzn, Task paramTask) {}
  
  public final void run()
  {
    synchronized (zzn.zzb(this.zzb))
    {
      zzn localzzn = this.zzb;
      if (zzn.zza(localzzn) != null) {
        zzn.zza(localzzn).onSuccess(this.zza.getResult());
      }
      return;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\tasks\zzm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */