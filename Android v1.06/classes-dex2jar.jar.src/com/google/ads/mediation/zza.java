package com.google.ads.mediation;

import android.view.View;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.formats.zze;
import com.google.android.gms.ads.formats.zzg;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import java.util.Map;
import java.util.WeakHashMap;

final class zza
  extends UnifiedNativeAdMapper
{
  private final UnifiedNativeAd zza;
  
  public zza(UnifiedNativeAd paramUnifiedNativeAd)
  {
    this.zza = paramUnifiedNativeAd;
    setHeadline(paramUnifiedNativeAd.getHeadline());
    setImages(paramUnifiedNativeAd.getImages());
    setBody(paramUnifiedNativeAd.getBody());
    setIcon(paramUnifiedNativeAd.getIcon());
    setCallToAction(paramUnifiedNativeAd.getCallToAction());
    setAdvertiser(paramUnifiedNativeAd.getAdvertiser());
    setStarRating(paramUnifiedNativeAd.getStarRating());
    setStore(paramUnifiedNativeAd.getStore());
    setPrice(paramUnifiedNativeAd.getPrice());
    zzd(paramUnifiedNativeAd.zza());
    setOverrideImpressionRecording(true);
    setOverrideClickHandling(true);
    zze(paramUnifiedNativeAd.getVideoController());
  }
  
  public final void trackViews(View paramView, Map<String, View> paramMap1, Map<String, View> paramMap2)
  {
    if (!(paramView instanceof zzg))
    {
      if ((zze)zze.zza.get(paramView) == null) {
        return;
      }
      throw null;
    }
    paramView = (zzg)paramView;
    throw null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\ads\mediation\zza.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */