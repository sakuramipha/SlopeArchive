package com.google.unity.ads;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.AdSize;

public class UnityAdSize
{
  private static final int FULL_WIDTH = -1;
  
  public static AdSize getCurrentOrientationAnchoredAdaptiveBannerAdSize(Activity paramActivity, int paramInt)
  {
    int i = paramInt;
    if (paramInt == -1) {
      i = getScreenWidth(paramActivity);
    }
    return AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(paramActivity, i);
  }
  
  public static AdSize getLandscapeAnchoredAdaptiveBannerAdSize(Activity paramActivity, int paramInt)
  {
    int i = paramInt;
    if (paramInt == -1) {
      i = getScreenWidth(paramActivity);
    }
    return AdSize.getLandscapeAnchoredAdaptiveBannerAdSize(paramActivity, i);
  }
  
  public static AdSize getPortraitAnchoredAdaptiveBannerAdSize(Activity paramActivity, int paramInt)
  {
    int i = paramInt;
    if (paramInt == -1) {
      i = getScreenWidth(paramActivity);
    }
    return AdSize.getPortraitAnchoredAdaptiveBannerAdSize(paramActivity, i);
  }
  
  private static int getScreenWidth(Activity paramActivity)
  {
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    paramActivity.getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
    return (int)(localDisplayMetrics.widthPixels / localDisplayMetrics.density);
  }
  
  public static AdSize getSmartBannerAdSize()
  {
    return AdSize.SMART_BANNER;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\googl\\unity\ads\UnityAdSize.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */