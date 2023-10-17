package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.h5.OnH5AdsEventListener;

public final class zzbjc
  extends zzbje
{
  private final OnH5AdsEventListener zza;
  
  public zzbjc(OnH5AdsEventListener paramOnH5AdsEventListener)
  {
    this.zza = paramOnH5AdsEventListener;
  }
  
  public final void zzb(String paramString)
  {
    this.zza.onH5AdsEvent(paramString);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbjc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */