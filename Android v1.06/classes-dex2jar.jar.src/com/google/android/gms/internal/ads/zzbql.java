package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

final class zzbql
  implements zzo
{
  final zzbqn zza;
  
  zzbql(zzbqn paramzzbqn) {}
  
  public final void zzb()
  {
    zzbzt.zze("Opening AdMobCustomTabsAdapter overlay.");
    zzbqn localzzbqn = this.zza;
    zzbqn.zzb(localzzbqn).onAdOpened(localzzbqn);
  }
  
  public final void zzbF()
  {
    zzbzt.zze("AdMobCustomTabsAdapter overlay is resumed.");
  }
  
  public final void zzbo()
  {
    zzbzt.zze("AdMobCustomTabsAdapter overlay is paused.");
  }
  
  public final void zzby()
  {
    zzbzt.zze("Delay close AdMobCustomTabsAdapter overlay.");
  }
  
  public final void zze() {}
  
  public final void zzf(int paramInt)
  {
    zzbzt.zze("AdMobCustomTabsAdapter overlay is closed.");
    zzbqn localzzbqn = this.zza;
    zzbqn.zzb(localzzbqn).onAdClosed(localzzbqn);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbql.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */