package com.unity3d.player;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.unity3d.player.a.d;

public class UnityPermissions
{
  private static final String SKIP_DIALOG_METADATA_NAME = "unityplayer.SkipPermissionsDialog";
  
  private static boolean checkInfoForMetadata(PackageItemInfo paramPackageItemInfo)
  {
    try
    {
      boolean bool = paramPackageItemInfo.metaData.getBoolean("unityplayer.SkipPermissionsDialog");
      return bool;
    }
    catch (Exception paramPackageItemInfo) {}
    return false;
  }
  
  public static boolean hasUserAuthorizedPermission(Activity paramActivity, String paramString)
  {
    boolean bool;
    if (paramActivity.checkCallingOrSelfPermission(paramString) == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static void requestUserPermissions(Activity paramActivity, String[] paramArrayOfString, IPermissionRequestCallbacks paramIPermissionRequestCallbacks)
  {
    if (!PlatformSupport.MARSHMALLOW_SUPPORT) {
      return;
    }
    if ((paramActivity != null) && (paramArrayOfString != null))
    {
      FragmentManager localFragmentManager = paramActivity.getFragmentManager();
      String str = String.valueOf(96489);
      if (localFragmentManager.findFragmentByTag(str) == null)
      {
        paramActivity = new d(paramActivity, paramIPermissionRequestCallbacks);
        paramIPermissionRequestCallbacks = new Bundle();
        paramIPermissionRequestCallbacks.putStringArray("PermissionNames", paramArrayOfString);
        paramActivity.setArguments(paramIPermissionRequestCallbacks);
        paramArrayOfString = localFragmentManager.beginTransaction();
        paramArrayOfString.add(0, paramActivity, str);
        paramArrayOfString.commit();
      }
    }
  }
  
  public static boolean skipPermissionsDialog(Activity paramActivity)
  {
    if (!PlatformSupport.MARSHMALLOW_SUPPORT) {
      return false;
    }
    try
    {
      PackageManager localPackageManager = paramActivity.getPackageManager();
      ActivityInfo localActivityInfo = localPackageManager.getActivityInfo(paramActivity.getComponentName(), 128);
      paramActivity = localPackageManager.getApplicationInfo(paramActivity.getPackageName(), 128);
      if (!checkInfoForMetadata(localActivityInfo))
      {
        boolean bool = checkInfoForMetadata(paramActivity);
        if (!bool) {}
      }
      else
      {
        return true;
      }
    }
    catch (Exception paramActivity)
    {
      for (;;) {}
    }
    return false;
  }
  
  public static class ModalWaitForPermissionResponse
    implements IPermissionRequestCallbacks
  {
    private boolean haveResponse = false;
    
    public void onPermissionDenied(String paramString)
    {
      try
      {
        this.haveResponse = true;
        notify();
        return;
      }
      finally
      {
        paramString = finally;
        throw paramString;
      }
    }
    
    public void onPermissionDeniedAndDontAskAgain(String paramString)
    {
      try
      {
        this.haveResponse = true;
        notify();
        return;
      }
      finally
      {
        paramString = finally;
        throw paramString;
      }
    }
    
    public void onPermissionGranted(String paramString)
    {
      try
      {
        this.haveResponse = true;
        notify();
        return;
      }
      finally
      {
        paramString = finally;
        throw paramString;
      }
    }
    
    public void waitForResponse()
    {
      try
      {
        try
        {
          boolean bool = this.haveResponse;
          if (bool) {
            return;
          }
          wait();
        }
        finally {}
      }
      catch (InterruptedException localInterruptedException)
      {
        for (;;) {}
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\co\\unity3d\player\UnityPermissions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */