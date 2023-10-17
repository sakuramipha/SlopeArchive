package androidx.core.accessibilityservice;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;

public final class AccessibilityServiceInfoCompat
{
  public static final int CAPABILITY_CAN_FILTER_KEY_EVENTS = 8;
  public static final int CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY = 4;
  public static final int CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION = 2;
  public static final int CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT = 1;
  public static final int FEEDBACK_ALL_MASK = -1;
  public static final int FEEDBACK_BRAILLE = 32;
  public static final int FLAG_INCLUDE_NOT_IMPORTANT_VIEWS = 2;
  public static final int FLAG_REPORT_VIEW_IDS = 16;
  public static final int FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY = 8;
  public static final int FLAG_REQUEST_FILTER_KEY_EVENTS = 32;
  public static final int FLAG_REQUEST_TOUCH_EXPLORATION_MODE = 4;
  
  public static String capabilityToString(int paramInt)
  {
    if (paramInt != 1)
    {
      if (paramInt != 2)
      {
        if (paramInt != 4)
        {
          if (paramInt != 8) {
            return "UNKNOWN";
          }
          return "CAPABILITY_CAN_FILTER_KEY_EVENTS";
        }
        return "CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY";
      }
      return "CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION";
    }
    return "CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT";
  }
  
  public static String feedbackTypeToString(int paramInt)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("[");
    while (paramInt > 0)
    {
      int i = 1 << Integer.numberOfTrailingZeros(paramInt);
      paramInt &= (i ^ 0xFFFFFFFF);
      if (localStringBuilder.length() > 1) {
        localStringBuilder.append(", ");
      }
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 4)
          {
            if (i != 8)
            {
              if (i == 16) {
                localStringBuilder.append("FEEDBACK_GENERIC");
              }
            }
            else {
              localStringBuilder.append("FEEDBACK_VISUAL");
            }
          }
          else {
            localStringBuilder.append("FEEDBACK_AUDIBLE");
          }
        }
        else {
          localStringBuilder.append("FEEDBACK_HAPTIC");
        }
      }
      else {
        localStringBuilder.append("FEEDBACK_SPOKEN");
      }
    }
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public static String flagToString(int paramInt)
  {
    if (paramInt != 1)
    {
      if (paramInt != 2)
      {
        if (paramInt != 4)
        {
          if (paramInt != 8)
          {
            if (paramInt != 16)
            {
              if (paramInt != 32) {
                return null;
              }
              return "FLAG_REQUEST_FILTER_KEY_EVENTS";
            }
            return "FLAG_REPORT_VIEW_IDS";
          }
          return "FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY";
        }
        return "FLAG_REQUEST_TOUCH_EXPLORATION_MODE";
      }
      return "FLAG_INCLUDE_NOT_IMPORTANT_VIEWS";
    }
    return "DEFAULT";
  }
  
  public static int getCapabilities(AccessibilityServiceInfo paramAccessibilityServiceInfo)
  {
    if (Build.VERSION.SDK_INT >= 18) {
      return paramAccessibilityServiceInfo.getCapabilities();
    }
    if (paramAccessibilityServiceInfo.getCanRetrieveWindowContent()) {
      return 1;
    }
    return 0;
  }
  
  public static String loadDescription(AccessibilityServiceInfo paramAccessibilityServiceInfo, PackageManager paramPackageManager)
  {
    if (Build.VERSION.SDK_INT >= 16) {
      return paramAccessibilityServiceInfo.loadDescription(paramPackageManager);
    }
    return paramAccessibilityServiceInfo.getDescription();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\accessibilityservice\AccessibilityServiceInfoCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */