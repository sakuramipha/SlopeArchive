package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;

public class ClientLibraryUtils
{
  public static int getClientVersion(Context paramContext, String paramString)
  {
    paramContext = getPackageInfo(paramContext, paramString);
    if ((paramContext != null) && (paramContext.applicationInfo != null))
    {
      paramContext = paramContext.applicationInfo.metaData;
      if (paramContext != null) {
        return paramContext.getInt("com.google.android.gms.version", -1);
      }
    }
    return -1;
  }
  
  public static PackageInfo getPackageInfo(Context paramContext, String paramString)
  {
    try
    {
      paramContext = Wrappers.packageManager(paramContext).getPackageInfo(paramString, 128);
      return paramContext;
    }
    catch (PackageManager.NameNotFoundException paramContext) {}
    return null;
  }
  
  public static boolean isPackageSide()
  {
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\commo\\util\ClientLibraryUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */