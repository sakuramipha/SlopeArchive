package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.UnifiedNativeAd.UnconfirmedClickListener;

public final class zzbgz
  extends zzbgj
{
  private final UnifiedNativeAd.UnconfirmedClickListener zza;
  
  public zzbgz(UnifiedNativeAd.UnconfirmedClickListener paramUnconfirmedClickListener)
  {
    this.zza = paramUnconfirmedClickListener;
  }
  
  public final void zze()
  {
    this.zza.onUnconfirmedClickCancelled();
  }
  
  public final void zzf(String paramString)
  {
    this.zza.onUnconfirmedClickReceived(paramString);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbgz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */