package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzhi;

final class zzdu
  extends zzch
{
  private final zzhi zza;
  
  zzdu(zzhi paramzzhi)
  {
    this.zza = paramzzhi;
  }
  
  public final int zzd()
  {
    return System.identityHashCode(this.zza);
  }
  
  public final void zze(String paramString1, String paramString2, Bundle paramBundle, long paramLong)
  {
    this.zza.interceptEvent(paramString1, paramString2, paramBundle, paramLong);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzdu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */