package com.google.android.gms.ads.formats;

import android.os.Bundle;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.MuteThisAdListener;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoController;
import java.util.List;

@Deprecated
public abstract class UnifiedNativeAd
{
  public abstract void cancelUnconfirmedClick();
  
  public abstract void destroy();
  
  public abstract void enableCustomClickGesture();
  
  public abstract NativeAd.AdChoicesInfo getAdChoicesInfo();
  
  public abstract String getAdvertiser();
  
  public abstract String getBody();
  
  public abstract String getCallToAction();
  
  public abstract Bundle getExtras();
  
  public abstract String getHeadline();
  
  public abstract NativeAd.Image getIcon();
  
  public abstract List<NativeAd.Image> getImages();
  
  public abstract MediaContent getMediaContent();
  
  @Deprecated
  public abstract String getMediationAdapterClassName();
  
  public abstract List<MuteThisAdReason> getMuteThisAdReasons();
  
  public abstract String getPrice();
  
  public abstract ResponseInfo getResponseInfo();
  
  public abstract Double getStarRating();
  
  public abstract String getStore();
  
  @Deprecated
  public abstract VideoController getVideoController();
  
  public abstract boolean isCustomClickGestureEnabled();
  
  public abstract boolean isCustomMuteThisAdEnabled();
  
  public abstract void muteThisAd(MuteThisAdReason paramMuteThisAdReason);
  
  public abstract void performClick(Bundle paramBundle);
  
  public abstract void recordCustomClickGesture();
  
  public abstract boolean recordImpression(Bundle paramBundle);
  
  public abstract void reportTouchEvent(Bundle paramBundle);
  
  public abstract void setMuteThisAdListener(MuteThisAdListener paramMuteThisAdListener);
  
  public abstract void setOnPaidEventListener(OnPaidEventListener paramOnPaidEventListener);
  
  public abstract void setUnconfirmedClickListener(UnconfirmedClickListener paramUnconfirmedClickListener);
  
  public abstract Object zza();
  
  @Deprecated
  public static abstract interface OnUnifiedNativeAdLoadedListener
  {
    public abstract void onUnifiedNativeAdLoaded(UnifiedNativeAd paramUnifiedNativeAd);
  }
  
  @Deprecated
  public static abstract interface UnconfirmedClickListener
  {
    public abstract void onUnconfirmedClickCancelled();
    
    public abstract void onUnconfirmedClickReceived(String paramString);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\formats\UnifiedNativeAd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */