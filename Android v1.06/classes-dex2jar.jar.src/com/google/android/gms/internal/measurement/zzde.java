package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

final class zzde
  extends zzdt
{
  final zzee zzb;
  
  zzde(zzee paramzzee, zzbz paramzzbz)
  {
    super(paramzzee, true);
  }
  
  final void zza()
    throws RemoteException
  {
    ((zzcc)Preconditions.checkNotNull(zzee.zze(this.zzb))).getCurrentScreenClass(this.zza);
  }
  
  protected final void zzb()
  {
    this.zza.zzd(null);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzde.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */