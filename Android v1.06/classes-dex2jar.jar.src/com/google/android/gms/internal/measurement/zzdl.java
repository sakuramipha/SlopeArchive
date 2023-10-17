package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

final class zzdl
  extends zzdt
{
  final zzee zzc;
  
  zzdl(zzee paramzzee, zzbz paramzzbz, int paramInt)
  {
    super(paramzzee, true);
  }
  
  final void zza()
    throws RemoteException
  {
    ((zzcc)Preconditions.checkNotNull(zzee.zze(this.zzc))).getTestFlag(this.zza, this.zzb);
  }
  
  protected final void zzb()
  {
    this.zza.zzd(null);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzdl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */