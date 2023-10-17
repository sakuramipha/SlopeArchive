package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdLoadCallback;
import com.google.android.gms.ads.appopen.AppOpenAd.AppOpenAdLoadCallback;
import com.google.android.gms.ads.internal.client.zze;

public final class zzavm
  extends zzavt
{
  private final AppOpenAd.AppOpenAdLoadCallback zza;
  private final String zzb;
  
  public zzavm(AppOpenAd.AppOpenAdLoadCallback paramAppOpenAdLoadCallback, String paramString)
  {
    this.zza = paramAppOpenAdLoadCallback;
    this.zzb = paramString;
  }
  
  public final void zzb(int paramInt) {}
  
  public final void zzc(zze paramzze)
  {
    if (this.zza != null)
    {
      paramzze = paramzze.zzb();
      this.zza.onAdFailedToLoad(paramzze);
    }
  }
  
  public final void zzd(zzavr paramzzavr)
  {
    if (this.zza != null)
    {
      paramzzavr = new zzavn(paramzzavr, this.zzb);
      this.zza.onAdLoaded(paramzzavr);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzavm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */