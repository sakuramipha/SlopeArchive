package com.google.android.gms.ads.formats;

import android.view.View;
import com.google.android.gms.ads.VideoController;
import java.util.List;

@Deprecated
public abstract interface NativeCustomTemplateAd
{
  public static final String ASSET_NAME_VIDEO = "_videoMediaView";
  
  public abstract void destroy();
  
  public abstract List<String> getAvailableAssetNames();
  
  public abstract String getCustomTemplateId();
  
  public abstract DisplayOpenMeasurement getDisplayOpenMeasurement();
  
  public abstract NativeAd.Image getImage(String paramString);
  
  public abstract CharSequence getText(String paramString);
  
  public abstract VideoController getVideoController();
  
  public abstract MediaView getVideoMediaView();
  
  public abstract void performClick(String paramString);
  
  public abstract void recordImpression();
  
  public static abstract interface DisplayOpenMeasurement
  {
    public abstract void setView(View paramView);
    
    public abstract boolean start();
  }
  
  public static abstract interface OnCustomClickListener
  {
    public abstract void onCustomClick(NativeCustomTemplateAd paramNativeCustomTemplateAd, String paramString);
  }
  
  public static abstract interface OnCustomTemplateAdLoadedListener
  {
    public abstract void onCustomTemplateAdLoaded(NativeCustomTemplateAd paramNativeCustomTemplateAd);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\formats\NativeCustomTemplateAd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */