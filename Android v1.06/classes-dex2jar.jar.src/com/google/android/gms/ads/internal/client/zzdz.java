package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.VideoController;

final class zzdz
  extends zzaz
{
  final zzea zza;
  
  zzdz(zzea paramzzea) {}
  
  public final void onAdFailedToLoad(LoadAdError paramLoadAdError)
  {
    zzea localzzea = this.zza;
    zzea.zze(localzzea).zzb(localzzea.zzi());
    super.onAdFailedToLoad(paramLoadAdError);
  }
  
  public final void onAdLoaded()
  {
    zzea localzzea = this.zza;
    zzea.zze(localzzea).zzb(localzzea.zzi());
    super.onAdLoaded();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzdz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */