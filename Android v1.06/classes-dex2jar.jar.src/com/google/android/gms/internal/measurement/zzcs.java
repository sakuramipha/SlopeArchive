package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

final class zzcs
  extends zzdt
{
  final zzee zzb;
  
  zzcs(zzee paramzzee, Boolean paramBoolean)
  {
    super(paramzzee, true);
  }
  
  final void zza()
    throws RemoteException
  {
    if (this.zza != null)
    {
      ((zzcc)Preconditions.checkNotNull(zzee.zze(this.zzb))).setMeasurementEnabled(this.zza.booleanValue(), this.zzh);
      return;
    }
    ((zzcc)Preconditions.checkNotNull(zzee.zze(this.zzb))).clearMeasurementEnabled(this.zzh);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzcs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */