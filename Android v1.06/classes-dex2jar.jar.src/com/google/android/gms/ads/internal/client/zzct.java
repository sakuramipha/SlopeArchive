package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.MuteThisAdListener;

public final class zzct
  extends zzcr
{
  private final MuteThisAdListener zza;
  
  public zzct(MuteThisAdListener paramMuteThisAdListener)
  {
    this.zza = paramMuteThisAdListener;
  }
  
  public final void zze()
  {
    this.zza.onAdMuted();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzct.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */