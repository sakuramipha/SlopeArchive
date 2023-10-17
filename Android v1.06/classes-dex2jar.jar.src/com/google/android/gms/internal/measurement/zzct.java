package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

final class zzct
  extends zzdt
{
  final zzee zzb;
  
  zzct(zzee paramzzee, Bundle paramBundle)
  {
    super(paramzzee, true);
  }
  
  final void zza()
    throws RemoteException
  {
    ((zzcc)Preconditions.checkNotNull(zzee.zze(this.zzb))).setConsent(this.zza, this.zzh);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzct.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */