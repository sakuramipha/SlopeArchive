package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;

final class zzdtm
  extends AdListener
{
  final zzdtt zzd;
  
  zzdtm(zzdtt paramzzdtt, String paramString1, AdView paramAdView, String paramString2) {}
  
  public final void onAdFailedToLoad(LoadAdError paramLoadAdError)
  {
    zzdtt.zzd(this.zzd, zzdtt.zzc(paramLoadAdError), this.zzc);
  }
  
  public final void onAdLoaded()
  {
    this.zzd.zzg(this.zza, this.zzb, this.zzc);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdtm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */