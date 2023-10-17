package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.ads.internal.client.zzbu;

final class zzbgw
  implements Runnable
{
  final zzbgx zzc;
  
  zzbgw(zzbgx paramzzbgx, AdManagerAdView paramAdManagerAdView, zzbu paramzzbu) {}
  
  public final void run()
  {
    if (this.zza.zzb(this.zzb))
    {
      zzbgx.zzc(this.zzc).onAdManagerAdViewLoaded(this.zza);
      return;
    }
    zzbzt.zzj("Could not bind.");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbgw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */