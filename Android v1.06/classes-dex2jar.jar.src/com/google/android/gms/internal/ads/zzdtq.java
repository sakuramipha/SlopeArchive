package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

final class zzdtq
  extends AdListener
{
  final zzdtt zzb;
  
  zzdtq(zzdtt paramzzdtt, String paramString) {}
  
  public final void onAdFailedToLoad(LoadAdError paramLoadAdError)
  {
    zzdtt.zzd(this.zzb, zzdtt.zzc(paramLoadAdError), this.zza);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdtq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */