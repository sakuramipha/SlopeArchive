package com.google.android.gms.common.wrappers;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Process;
import androidx.core.util.Pair;
import com.google.android.gms.common.util.PlatformVersion;

public class PackageManagerWrapper
{
  protected final Context zza;
  
  public PackageManagerWrapper(Context paramContext)
  {
    this.zza = paramContext;
  }
  
  public int checkCallingOrSelfPermission(String paramString)
  {
    return this.zza.checkCallingOrSelfPermission(paramString);
  }
  
  public int checkPermission(String paramString1, String paramString2)
  {
    return this.zza.getPackageManager().checkPermission(paramString1, paramString2);
  }
  
  public ApplicationInfo getApplicationInfo(String paramString, int paramInt)
    throws PackageManager.NameNotFoundException
  {
    return this.zza.getPackageManager().getApplicationInfo(paramString, paramInt);
  }
  
  public CharSequence getApplicationLabel(String paramString)
    throws PackageManager.NameNotFoundException
  {
    return this.zza.getPackageManager().getApplicationLabel(this.zza.getPackageManager().getApplicationInfo(paramString, 0));
  }
  
  public Pair<CharSequence, Drawable> getApplicationLabelAndIcon(String paramString)
    throws PackageManager.NameNotFoundException
  {
    paramString = this.zza.getPackageManager().getApplicationInfo(paramString, 0);
    return Pair.create(this.zza.getPackageManager().getApplicationLabel(paramString), this.zza.getPackageManager().getApplicationIcon(paramString));
  }
  
  public PackageInfo getPackageInfo(String paramString, int paramInt)
    throws PackageManager.NameNotFoundException
  {
    return this.zza.getPackageManager().getPackageInfo(paramString, paramInt);
  }
  
  public boolean isCallerInstantApp()
  {
    if (Binder.getCallingUid() == Process.myUid()) {
      return InstantApps.isInstantApp(this.zza);
    }
    if (PlatformVersion.isAtLeastO())
    {
      String str = this.zza.getPackageManager().getNameForUid(Binder.getCallingUid());
      if (str != null) {
        return this.zza.getPackageManager().isInstantApp(str);
      }
    }
    return false;
  }
  
  public final boolean zza(int paramInt, String paramString)
  {
    if (PlatformVersion.isAtLeastKitKat()) {
      try
      {
        localObject = (AppOpsManager)this.zza.getSystemService("appops");
        if (localObject != null)
        {
          ((AppOpsManager)localObject).checkPackage(paramInt, paramString);
          return true;
        }
        paramString = new java/lang/NullPointerException;
        paramString.<init>("context.getSystemService(Context.APP_OPS_SERVICE) is null");
        throw paramString;
      }
      catch (SecurityException paramString)
      {
        return false;
      }
    }
    Object localObject = this.zza.getPackageManager().getPackagesForUid(paramInt);
    if ((paramString != null) && (localObject != null)) {
      for (paramInt = 0; paramInt < localObject.length; paramInt++) {
        if (paramString.equals(localObject[paramInt])) {
          return true;
        }
      }
    }
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\wrappers\PackageManagerWrapper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */