package androidx.browser.customtabs;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import androidx.core.app.BundleCompat;
import androidx.core.content.FileProvider;
import java.io.File;

public class TrustedWebUtils
{
  public static final String ACTION_MANAGE_TRUSTED_WEB_ACTIVITY_DATA = "android.support.customtabs.action.ACTION_MANAGE_TRUSTED_WEB_ACTIVITY_DATA";
  public static final String EXTRA_LAUNCH_AS_TRUSTED_WEB_ACTIVITY = "android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY";
  
  public static boolean areSplashScreensSupported(Context paramContext, String paramString1, String paramString2)
  {
    paramString1 = new Intent().setAction("android.support.customtabs.action.CustomTabsService").setPackage(paramString1);
    paramContext = paramContext.getPackageManager().resolveService(paramString1, 64);
    if ((paramContext != null) && (paramContext.filter != null)) {
      return paramContext.filter.hasCategory(paramString2);
    }
    return false;
  }
  
  @Deprecated
  public static void launchAsTrustedWebActivity(Context paramContext, CustomTabsIntent paramCustomTabsIntent, Uri paramUri)
  {
    if (BundleCompat.getBinder(paramCustomTabsIntent.intent.getExtras(), "android.support.customtabs.extra.SESSION") != null)
    {
      paramCustomTabsIntent.intent.putExtra("android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY", true);
      paramCustomTabsIntent.launchUrl(paramContext, paramUri);
      return;
    }
    throw new IllegalArgumentException("Given CustomTabsIntent should be associated with a valid CustomTabsSession");
  }
  
  public static void launchBrowserSiteSettings(Context paramContext, CustomTabsSession paramCustomTabsSession, Uri paramUri)
  {
    Intent localIntent = new Intent("android.support.customtabs.action.ACTION_MANAGE_TRUSTED_WEB_ACTIVITY_DATA");
    localIntent.setPackage(paramCustomTabsSession.getComponentName().getPackageName());
    localIntent.setData(paramUri);
    paramUri = new Bundle();
    BundleCompat.putBinder(paramUri, "android.support.customtabs.extra.SESSION", paramCustomTabsSession.getBinder());
    localIntent.putExtras(paramUri);
    paramCustomTabsSession = paramCustomTabsSession.getId();
    if (paramCustomTabsSession != null) {
      localIntent.putExtra("android.support.customtabs.extra.SESSION_ID", paramCustomTabsSession);
    }
    paramContext.startActivity(localIntent);
  }
  
  public static boolean transferSplashImage(Context paramContext, File paramFile, String paramString1, String paramString2, CustomTabsSession paramCustomTabsSession)
  {
    paramFile = FileProvider.getUriForFile(paramContext, paramString1, paramFile);
    paramContext.grantUriPermission(paramString2, paramFile, 1);
    return paramCustomTabsSession.receiveFile(paramFile, 1, null);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\browser\customtabs\TrustedWebUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */