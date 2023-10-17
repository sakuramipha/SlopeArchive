package com.google.android.gms.ads.formats;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import java.util.List;

@Deprecated
public abstract class NativeAd
{
  public static final String ASSET_ADCHOICES_CONTAINER_VIEW = "1098";
  
  @Deprecated
  public abstract void performClick(Bundle paramBundle);
  
  @Deprecated
  public abstract boolean recordImpression(Bundle paramBundle);
  
  @Deprecated
  public abstract void reportTouchEvent(Bundle paramBundle);
  
  @Deprecated
  public static abstract class AdChoicesInfo
  {
    public abstract List<NativeAd.Image> getImages();
    
    public abstract CharSequence getText();
  }
  
  @Deprecated
  public static abstract class Image
  {
    public abstract Drawable getDrawable();
    
    public abstract double getScale();
    
    public abstract Uri getUri();
    
    public int zza()
    {
      return -1;
    }
    
    public int zzb()
    {
      return -1;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\formats\NativeAd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */