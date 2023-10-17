package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

final class zzdto
  extends RewardedAdLoadCallback
{
  final zzdtt zzc;
  
  zzdto(zzdtt paramzzdtt, String paramString1, String paramString2) {}
  
  public final void onAdFailedToLoad(LoadAdError paramLoadAdError)
  {
    zzdtt.zzd(this.zzc, zzdtt.zzc(paramLoadAdError), this.zzb);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdto.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */