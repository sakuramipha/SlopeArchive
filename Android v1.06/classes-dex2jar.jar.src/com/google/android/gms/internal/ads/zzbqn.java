package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsIntent.Builder;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

public final class zzbqn
  implements MediationInterstitialAdapter
{
  private Activity zza;
  private MediationInterstitialListener zzb;
  private Uri zzc;
  
  public final void onDestroy()
  {
    zzbzt.zze("Destroying AdMobCustomTabsAdapter adapter.");
  }
  
  public final void onPause()
  {
    zzbzt.zze("Pausing AdMobCustomTabsAdapter adapter.");
  }
  
  public final void onResume()
  {
    zzbzt.zze("Resuming AdMobCustomTabsAdapter adapter.");
  }
  
  public final void requestInterstitialAd(Context paramContext, MediationInterstitialListener paramMediationInterstitialListener, Bundle paramBundle1, MediationAdRequest paramMediationAdRequest, Bundle paramBundle2)
  {
    this.zzb = paramMediationInterstitialListener;
    if (paramMediationInterstitialListener == null)
    {
      zzbzt.zzj("Listener not set for mediation. Returning.");
      return;
    }
    if ((paramContext instanceof Activity))
    {
      if (!zzbcl.zzg(paramContext))
      {
        zzbzt.zzj("Default browser does not support custom tabs. Bailing out.");
        this.zzb.onAdFailedToLoad(this, 0);
        return;
      }
      paramMediationInterstitialListener = paramBundle1.getString("tab_url");
      if (TextUtils.isEmpty(paramMediationInterstitialListener))
      {
        zzbzt.zzj("The tab_url retrieved from mediation metadata is empty. Bailing out.");
        this.zzb.onAdFailedToLoad(this, 0);
        return;
      }
      this.zza = ((Activity)paramContext);
      this.zzc = Uri.parse(paramMediationInterstitialListener);
      this.zzb.onAdLoaded(this);
      return;
    }
    zzbzt.zzj("AdMobCustomTabs can only work with Activity context. Bailing out.");
    this.zzb.onAdFailedToLoad(this, 0);
  }
  
  public final void showInterstitial()
  {
    Object localObject = new CustomTabsIntent.Builder().build();
    ((CustomTabsIntent)localObject).intent.setData(this.zzc);
    localObject = new AdOverlayInfoParcel(new zzc(((CustomTabsIntent)localObject).intent, null), null, new zzbql(this), null, new zzbzz(0, 0, false, false, false), null, null);
    zzs.zza.post(new zzbqm(this, (AdOverlayInfoParcel)localObject));
    zzt.zzo().zzp();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbqn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */