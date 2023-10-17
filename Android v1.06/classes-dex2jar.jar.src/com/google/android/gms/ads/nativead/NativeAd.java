package com.google.android.gms.ads.nativead;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.MuteThisAdListener;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import java.util.List;

public abstract class NativeAd
{
  public abstract void cancelUnconfirmedClick();
  
  public abstract void destroy();
  
  @Deprecated
  public abstract void enableCustomClickGesture();
  
  public abstract AdChoicesInfo getAdChoicesInfo();
  
  public abstract String getAdvertiser();
  
  public abstract String getBody();
  
  public abstract String getCallToAction();
  
  public abstract Bundle getExtras();
  
  public abstract String getHeadline();
  
  public abstract Image getIcon();
  
  public abstract List<Image> getImages();
  
  public abstract MediaContent getMediaContent();
  
  public abstract List<MuteThisAdReason> getMuteThisAdReasons();
  
  public abstract String getPrice();
  
  public abstract ResponseInfo getResponseInfo();
  
  public abstract Double getStarRating();
  
  public abstract String getStore();
  
  @Deprecated
  public abstract boolean isCustomClickGestureEnabled();
  
  public abstract boolean isCustomMuteThisAdEnabled();
  
  public abstract void muteThisAd(MuteThisAdReason paramMuteThisAdReason);
  
  public abstract void performClick(Bundle paramBundle);
  
  @Deprecated
  public abstract void recordCustomClickGesture();
  
  public abstract boolean recordImpression(Bundle paramBundle);
  
  public abstract void reportTouchEvent(Bundle paramBundle);
  
  public abstract void setMuteThisAdListener(MuteThisAdListener paramMuteThisAdListener);
  
  public abstract void setOnPaidEventListener(OnPaidEventListener paramOnPaidEventListener);
  
  public abstract void setUnconfirmedClickListener(UnconfirmedClickListener paramUnconfirmedClickListener);
  
  protected abstract Object zza();
  
  public static abstract class AdChoicesInfo
  {
    public abstract List<NativeAd.Image> getImages();
    
    public abstract CharSequence getText();
  }
  
  public static abstract class Image
  {
    public abstract Drawable getDrawable();
    
    public abstract double getScale();
    
    public abstract Uri getUri();
  }
  
  public static abstract interface OnNativeAdLoadedListener
  {
    public abstract void onNativeAdLoaded(NativeAd paramNativeAd);
  }
  
  public static abstract interface UnconfirmedClickListener
  {
    public abstract void onUnconfirmedClickCancelled();
    
    public abstract void onUnconfirmedClickReceived(String paramString);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\nativead\NativeAd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */