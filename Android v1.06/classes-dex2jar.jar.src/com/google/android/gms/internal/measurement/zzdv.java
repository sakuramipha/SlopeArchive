package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzhj;

final class zzdv
  extends zzch
{
  private final zzhj zza;
  
  zzdv(zzhj paramzzhj)
  {
    this.zza = paramzzhj;
  }
  
  public final int zzd()
  {
    return System.identityHashCode(this.zza);
  }
  
  public final void zze(String paramString1, String paramString2, Bundle paramBundle, long paramLong)
  {
    this.zza.onEvent(paramString1, paramString2, paramBundle, paramLong);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzdv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */