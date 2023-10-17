package com.google.android.gms.ads.admanager;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbbc;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbcp;
import com.google.android.gms.internal.ads.zzbdb;
import com.google.android.gms.internal.ads.zzbla;
import com.google.android.gms.internal.ads.zzbzi;
import java.util.concurrent.ExecutorService;

public abstract class AdManagerInterstitialAd
  extends InterstitialAd
{
  public static void load(Context paramContext, String paramString, AdManagerAdRequest paramAdManagerAdRequest, AdManagerInterstitialAdLoadCallback paramAdManagerInterstitialAdLoadCallback)
  {
    Preconditions.checkNotNull(paramContext, "Context cannot be null.");
    Preconditions.checkNotNull(paramString, "AdUnitId cannot be null.");
    Preconditions.checkNotNull(paramAdManagerAdRequest, "AdManagerAdRequest cannot be null.");
    Preconditions.checkNotNull(paramAdManagerInterstitialAdLoadCallback, "LoadCallback cannot be null.");
    Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
    zzbbk.zza(paramContext);
    if (((Boolean)zzbdb.zzi.zze()).booleanValue())
    {
      zzbbc localzzbbc = zzbbk.zzjG;
      if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue())
      {
        zzbzi.zzb.execute(new zzc(paramContext, paramString, paramAdManagerAdRequest, paramAdManagerInterstitialAdLoadCallback));
        return;
      }
    }
    new zzbla(paramContext, paramString).zza(paramAdManagerAdRequest.zza(), paramAdManagerInterstitialAdLoadCallback);
  }
  
  public abstract AppEventListener getAppEventListener();
  
  public abstract void setAppEventListener(AppEventListener paramAppEventListener);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\admanager\AdManagerInterstitialAd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */