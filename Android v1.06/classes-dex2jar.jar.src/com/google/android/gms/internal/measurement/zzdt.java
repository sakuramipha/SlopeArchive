package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.util.Clock;

abstract class zzdt
  implements Runnable
{
  final long zzh;
  final long zzi;
  final boolean zzj;
  final zzee zzk;
  
  zzdt(zzee paramzzee, boolean paramBoolean)
  {
    this.zzh = paramzzee.zza.currentTimeMillis();
    this.zzi = paramzzee.zza.elapsedRealtime();
    this.zzj = paramBoolean;
  }
  
  public final void run()
  {
    if (zzee.zzP(this.zzk))
    {
      zzb();
      return;
    }
    try
    {
      zza();
      return;
    }
    catch (Exception localException)
    {
      zzee.zzs(this.zzk, localException, false, this.zzj);
      zzb();
    }
  }
  
  abstract void zza()
    throws RemoteException;
  
  protected void zzb() {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzdt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */