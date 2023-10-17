package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.appopen.AppOpenAd.AppOpenAdLoadCallback;

final class zzdtl
  extends AppOpenAd.AppOpenAdLoadCallback
{
  final zzdtt zzc;
  
  zzdtl(zzdtt paramzzdtt, String paramString1, String paramString2) {}
  
  public final void onAdFailedToLoad(LoadAdError paramLoadAdError)
  {
    zzdtt.zzd(this.zzc, zzdtt.zzc(paramLoadAdError), this.zzb);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdtl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */