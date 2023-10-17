package com.google.unity.ads;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.Log;

public class PluginUtils
{
  public static final String LOGTAG = "AdsUnity";
  public static final int POSITION_BOTTOM = 1;
  public static final int POSITION_BOTTOM_LEFT = 4;
  public static final int POSITION_BOTTOM_RIGHT = 5;
  public static final int POSITION_CENTER = 6;
  public static final int POSITION_CUSTOM = -1;
  public static final int POSITION_TOP = 0;
  public static final int POSITION_TOP_LEFT = 2;
  public static final int POSITION_TOP_RIGHT = 3;
  
  public static float convertDpToPixel(float paramFloat)
  {
    return paramFloat * Resources.getSystem().getDisplayMetrics().density;
  }
  
  public static float convertPixelsToDp(float paramFloat)
  {
    return paramFloat / Resources.getSystem().getDisplayMetrics().density;
  }
  
  public static String getErrorReason(int paramInt)
  {
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2)
        {
          if (paramInt != 3)
          {
            Log.w("AdsUnity", String.format("Unexpected error code: %s", new Object[] { Integer.valueOf(paramInt) }));
            return "";
          }
          return "No fill";
        }
        return "Network Error";
      }
      return "Invalid request";
    }
    return "Internal error";
  }
  
  public static int getLayoutGravityForPositionCode(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      throw new IllegalArgumentException("Attempted to position ad with invalid ad position.");
    case 6: 
      paramInt = 17;
      break;
    case 5: 
      paramInt = 85;
      break;
    case 4: 
      paramInt = 83;
      break;
    case 3: 
      paramInt = 53;
      break;
    case 1: 
      paramInt = 81;
      break;
    case 0: 
      paramInt = 49;
      break;
    case -1: 
    case 2: 
      paramInt = 51;
    }
    return paramInt;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\googl\\unity\ads\PluginUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */