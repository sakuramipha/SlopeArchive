package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

public class MultiWindowSupport
{
  private static final String RESIZABLE_WINDOW = "unity.allow-resizable-window";
  private static boolean s_LastMultiWindowMode = false;
  
  public static boolean getAllowResizableWindow(Activity paramActivity)
  {
    bool2 = false;
    try
    {
      ApplicationInfo localApplicationInfo = paramActivity.getPackageManager().getApplicationInfo(paramActivity.getPackageName(), 128);
      bool1 = bool2;
      if (isInMultiWindowMode(paramActivity))
      {
        boolean bool3 = localApplicationInfo.metaData.getBoolean("unity.allow-resizable-window");
        bool1 = bool2;
        if (bool3) {
          bool1 = true;
        }
      }
    }
    catch (Exception paramActivity)
    {
      for (;;)
      {
        boolean bool1 = bool2;
      }
    }
    return bool1;
  }
  
  static boolean isInMultiWindowMode(Activity paramActivity)
  {
    if (PlatformSupport.NOUGAT_SUPPORT) {
      return paramActivity.isInMultiWindowMode();
    }
    return false;
  }
  
  public static boolean isMultiWindowModeChangedToTrue(Activity paramActivity)
  {
    boolean bool;
    if ((!s_LastMultiWindowMode) && (isInMultiWindowMode(paramActivity))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static void saveMultiWindowMode(Activity paramActivity)
  {
    s_LastMultiWindowMode = isInMultiWindowMode(paramActivity);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\co\\unity3d\player\MultiWindowSupport.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */