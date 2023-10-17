package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

final class zzcp
  extends zzdt
{
  final zzee zzd;
  
  zzcp(zzee paramzzee, String paramString1, String paramString2, zzbz paramzzbz)
  {
    super(paramzzee, true);
  }
  
  final void zza()
    throws RemoteException
  {
    ((zzcc)Preconditions.checkNotNull(zzee.zze(this.zzd))).getConditionalUserProperties(this.zza, this.zzb, this.zzc);
  }
  
  protected final void zzb()
  {
    this.zzc.zzd(null);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzcp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */