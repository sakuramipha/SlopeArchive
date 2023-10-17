package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;

public final class zzfe
  extends zzdf
{
  private final OnPaidEventListener zza;
  
  public zzfe(OnPaidEventListener paramOnPaidEventListener)
  {
    this.zza = paramOnPaidEventListener;
  }
  
  public final void zze(zzs paramzzs)
  {
    OnPaidEventListener localOnPaidEventListener = this.zza;
    if (localOnPaidEventListener != null) {
      localOnPaidEventListener.onPaidEvent(AdValue.zza(paramzzs.zzb, paramzzs.zzc, paramzzs.zzd));
    }
  }
  
  public final boolean zzf()
  {
    return this.zza == null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzfe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */