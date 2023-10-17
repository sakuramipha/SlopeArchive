package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

final class zzco
  extends zzdt
{
  final zzee zzd;
  
  zzco(zzee paramzzee, String paramString1, String paramString2, Bundle paramBundle)
  {
    super(paramzzee, true);
  }
  
  final void zza()
    throws RemoteException
  {
    ((zzcc)Preconditions.checkNotNull(zzee.zze(this.zzd))).clearConditionalUserProperty(this.zza, this.zzb, this.zzc);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzco.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */