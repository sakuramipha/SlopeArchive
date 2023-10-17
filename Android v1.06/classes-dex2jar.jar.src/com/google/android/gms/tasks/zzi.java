package com.google.android.gms.tasks;

final class zzi
  implements Runnable
{
  final zzj zzb;
  
  zzi(zzj paramzzj, Task paramTask) {}
  
  public final void run()
  {
    synchronized (zzj.zzb(this.zzb))
    {
      zzj localzzj = this.zzb;
      if (zzj.zza(localzzj) != null) {
        zzj.zza(localzzj).onComplete(this.zza);
      }
      return;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\tasks\zzi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */