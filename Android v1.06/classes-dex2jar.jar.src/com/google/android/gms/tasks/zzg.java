package com.google.android.gms.tasks;

final class zzg
  implements Runnable
{
  final zzh zza;
  
  zzg(zzh paramzzh) {}
  
  public final void run()
  {
    synchronized (zzh.zzb(this.zza))
    {
      zzh localzzh = this.zza;
      if (zzh.zza(localzzh) != null) {
        zzh.zza(localzzh).onCanceled();
      }
      return;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\tasks\zzg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */