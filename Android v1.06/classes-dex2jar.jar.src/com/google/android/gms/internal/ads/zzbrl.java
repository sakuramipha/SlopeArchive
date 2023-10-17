package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd.UnconfirmedClickListener;

public final class zzbrl
  extends zzbgj
{
  private final NativeAd.UnconfirmedClickListener zza;
  
  public zzbrl(NativeAd.UnconfirmedClickListener paramUnconfirmedClickListener)
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


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbrl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */