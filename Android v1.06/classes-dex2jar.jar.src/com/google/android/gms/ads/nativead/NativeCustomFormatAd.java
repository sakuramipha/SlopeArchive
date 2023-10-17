package com.google.android.gms.ads.nativead;

import android.view.View;
import com.google.android.gms.ads.MediaContent;
import java.util.List;

public abstract interface NativeCustomFormatAd
{
  public static final String ASSET_NAME_VIDEO = "_videoMediaView";
  
  public abstract void destroy();
  
  public abstract List<String> getAvailableAssetNames();
  
  public abstract String getCustomFormatId();
  
  public abstract DisplayOpenMeasurement getDisplayOpenMeasurement();
  
  public abstract NativeAd.Image getImage(String paramString);
  
  public abstract MediaContent getMediaContent();
  
  public abstract CharSequence getText(String paramString);
  
  public abstract void performClick(String paramString);
  
  public abstract void recordImpression();
  
  public static abstract interface DisplayOpenMeasurement
  {
    public abstract void setView(View paramView);
    
    public abstract boolean start();
  }
  
  public static abstract interface OnCustomClickListener
  {
    public abstract void onCustomClick(NativeCustomFormatAd paramNativeCustomFormatAd, String paramString);
  }
  
  public static abstract interface OnCustomFormatAdLoadedListener
  {
    public abstract void onCustomFormatAdLoaded(NativeCustomFormatAd paramNativeCustomFormatAd);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\nativead\NativeCustomFormatAd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */