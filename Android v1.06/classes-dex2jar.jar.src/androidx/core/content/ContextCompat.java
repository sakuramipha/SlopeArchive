package androidx.core.content;

import android.accounts.AccountManager;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.AppOpsManager;
import android.app.DownloadManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.SearchManager;
import android.app.UiModeManager;
import android.app.WallpaperManager;
import android.app.admin.DevicePolicyManager;
import android.app.job.JobScheduler;
import android.app.usage.UsageStatsManager;
import android.appwidget.AppWidgetManager;
import android.bluetooth.BluetoothManager;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.RestrictionsManager;
import android.content.pm.ApplicationInfo;
import android.content.pm.LauncherApps;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.hardware.ConsumerIrManager;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.hardware.input.InputManager;
import android.hardware.usb.UsbManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.media.MediaRouter;
import android.media.projection.MediaProjectionManager;
import android.media.session.MediaSessionManager;
import android.media.tv.TvInputManager;
import android.net.ConnectivityManager;
import android.net.nsd.NsdManager;
import android.net.wifi.WifiManager;
import android.net.wifi.p2p.WifiP2pManager;
import android.nfc.NfcManager;
import android.os.BatteryManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.DropBoxManager;
import android.os.Handler;
import android.os.PowerManager;
import android.os.Process;
import android.os.UserManager;
import android.os.Vibrator;
import android.os.storage.StorageManager;
import android.print.PrintManager;
import android.telecom.TelecomManager;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import android.view.inputmethod.InputMethodManager;
import android.view.textservice.TextServicesManager;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.os.ExecutorCompat;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.Executor;

public class ContextCompat
{
  private static final String TAG = "ContextCompat";
  private static final Object sLock = new Object();
  private static final Object sSync = new Object();
  private static TypedValue sTempValue;
  
  public static int checkSelfPermission(Context paramContext, String paramString)
  {
    if (paramString != null) {
      return paramContext.checkPermission(paramString, Process.myPid(), Process.myUid());
    }
    throw new IllegalArgumentException("permission is null");
  }
  
  public static Context createDeviceProtectedStorageContext(Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 24) {
      return Api24Impl.createDeviceProtectedStorageContext(paramContext);
    }
    return null;
  }
  
  private static File createFilesDir(File paramFile)
  {
    synchronized (sSync)
    {
      if (!paramFile.exists())
      {
        if (paramFile.mkdirs()) {
          return paramFile;
        }
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder.append("Unable to create files subdir ");
        localStringBuilder.append(paramFile.getPath());
        Log.w("ContextCompat", localStringBuilder.toString());
      }
      return paramFile;
    }
  }
  
  public static String getAttributionTag(Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 30) {
      return Api30Impl.getAttributionTag(paramContext);
    }
    return null;
  }
  
  public static File getCodeCacheDir(Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      return Api21Impl.getCodeCacheDir(paramContext);
    }
    return createFilesDir(new File(paramContext.getApplicationInfo().dataDir, "code_cache"));
  }
  
  public static int getColor(Context paramContext, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 23) {
      return Api23Impl.getColor(paramContext, paramInt);
    }
    return paramContext.getResources().getColor(paramInt);
  }
  
  public static ColorStateList getColorStateList(Context paramContext, int paramInt)
  {
    return ResourcesCompat.getColorStateList(paramContext.getResources(), paramInt, paramContext.getTheme());
  }
  
  public static File getDataDir(Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 24) {
      return Api24Impl.getDataDir(paramContext);
    }
    paramContext = paramContext.getApplicationInfo().dataDir;
    if (paramContext != null) {
      paramContext = new File(paramContext);
    } else {
      paramContext = null;
    }
    return paramContext;
  }
  
  public static Drawable getDrawable(Context paramContext, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      return Api21Impl.getDrawable(paramContext, paramInt);
    }
    if (Build.VERSION.SDK_INT >= 16) {
      return paramContext.getResources().getDrawable(paramInt);
    }
    synchronized (sLock)
    {
      if (sTempValue == null)
      {
        TypedValue localTypedValue = new android/util/TypedValue;
        localTypedValue.<init>();
        sTempValue = localTypedValue;
      }
      paramContext.getResources().getValue(paramInt, sTempValue, true);
      paramInt = sTempValue.resourceId;
      return paramContext.getResources().getDrawable(paramInt);
    }
  }
  
  public static File[] getExternalCacheDirs(Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 19) {
      return Api19Impl.getExternalCacheDirs(paramContext);
    }
    return new File[] { paramContext.getExternalCacheDir() };
  }
  
  public static File[] getExternalFilesDirs(Context paramContext, String paramString)
  {
    if (Build.VERSION.SDK_INT >= 19) {
      return Api19Impl.getExternalFilesDirs(paramContext, paramString);
    }
    return new File[] { paramContext.getExternalFilesDir(paramString) };
  }
  
  public static Executor getMainExecutor(Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return Api28Impl.getMainExecutor(paramContext);
    }
    return ExecutorCompat.create(new Handler(paramContext.getMainLooper()));
  }
  
  public static File getNoBackupFilesDir(Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      return Api21Impl.getNoBackupFilesDir(paramContext);
    }
    return createFilesDir(new File(paramContext.getApplicationInfo().dataDir, "no_backup"));
  }
  
  public static File[] getObbDirs(Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 19) {
      return Api19Impl.getObbDirs(paramContext);
    }
    return new File[] { paramContext.getObbDir() };
  }
  
  public static <T> T getSystemService(Context paramContext, Class<T> paramClass)
  {
    if (Build.VERSION.SDK_INT >= 23) {
      return (T)Api23Impl.getSystemService(paramContext, paramClass);
    }
    paramClass = getSystemServiceName(paramContext, paramClass);
    if (paramClass != null) {
      paramContext = paramContext.getSystemService(paramClass);
    } else {
      paramContext = null;
    }
    return paramContext;
  }
  
  public static String getSystemServiceName(Context paramContext, Class<?> paramClass)
  {
    if (Build.VERSION.SDK_INT >= 23) {
      return Api23Impl.getSystemServiceName(paramContext, paramClass);
    }
    return (String)LegacyServiceMapHolder.SERVICES.get(paramClass);
  }
  
  public static boolean isDeviceProtectedStorage(Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 24) {
      return Api24Impl.isDeviceProtectedStorage(paramContext);
    }
    return false;
  }
  
  public static boolean startActivities(Context paramContext, Intent[] paramArrayOfIntent)
  {
    return startActivities(paramContext, paramArrayOfIntent, null);
  }
  
  public static boolean startActivities(Context paramContext, Intent[] paramArrayOfIntent, Bundle paramBundle)
  {
    if (Build.VERSION.SDK_INT >= 16) {
      Api16Impl.startActivities(paramContext, paramArrayOfIntent, paramBundle);
    } else {
      paramContext.startActivities(paramArrayOfIntent);
    }
    return true;
  }
  
  public static void startActivity(Context paramContext, Intent paramIntent, Bundle paramBundle)
  {
    if (Build.VERSION.SDK_INT >= 16) {
      Api16Impl.startActivity(paramContext, paramIntent, paramBundle);
    } else {
      paramContext.startActivity(paramIntent);
    }
  }
  
  public static void startForegroundService(Context paramContext, Intent paramIntent)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      Api26Impl.startForegroundService(paramContext, paramIntent);
    } else {
      paramContext.startService(paramIntent);
    }
  }
  
  static class Api16Impl
  {
    static void startActivities(Context paramContext, Intent[] paramArrayOfIntent, Bundle paramBundle)
    {
      paramContext.startActivities(paramArrayOfIntent, paramBundle);
    }
    
    static void startActivity(Context paramContext, Intent paramIntent, Bundle paramBundle)
    {
      paramContext.startActivity(paramIntent, paramBundle);
    }
  }
  
  static class Api19Impl
  {
    static File[] getExternalCacheDirs(Context paramContext)
    {
      return paramContext.getExternalCacheDirs();
    }
    
    static File[] getExternalFilesDirs(Context paramContext, String paramString)
    {
      return paramContext.getExternalFilesDirs(paramString);
    }
    
    static File[] getObbDirs(Context paramContext)
    {
      return paramContext.getObbDirs();
    }
  }
  
  static class Api21Impl
  {
    static File getCodeCacheDir(Context paramContext)
    {
      return paramContext.getCodeCacheDir();
    }
    
    static Drawable getDrawable(Context paramContext, int paramInt)
    {
      return paramContext.getDrawable(paramInt);
    }
    
    static File getNoBackupFilesDir(Context paramContext)
    {
      return paramContext.getNoBackupFilesDir();
    }
  }
  
  static class Api23Impl
  {
    static int getColor(Context paramContext, int paramInt)
    {
      return paramContext.getColor(paramInt);
    }
    
    static ColorStateList getColorStateList(Context paramContext, int paramInt)
    {
      return paramContext.getColorStateList(paramInt);
    }
    
    static <T> T getSystemService(Context paramContext, Class<T> paramClass)
    {
      return (T)paramContext.getSystemService(paramClass);
    }
    
    static String getSystemServiceName(Context paramContext, Class<?> paramClass)
    {
      return paramContext.getSystemServiceName(paramClass);
    }
  }
  
  static class Api24Impl
  {
    static Context createDeviceProtectedStorageContext(Context paramContext)
    {
      return paramContext.createDeviceProtectedStorageContext();
    }
    
    static File getDataDir(Context paramContext)
    {
      return paramContext.getDataDir();
    }
    
    static boolean isDeviceProtectedStorage(Context paramContext)
    {
      return paramContext.isDeviceProtectedStorage();
    }
  }
  
  static class Api26Impl
  {
    static ComponentName startForegroundService(Context paramContext, Intent paramIntent)
    {
      return paramContext.startForegroundService(paramIntent);
    }
  }
  
  static class Api28Impl
  {
    static Executor getMainExecutor(Context paramContext)
    {
      return paramContext.getMainExecutor();
    }
  }
  
  static class Api30Impl
  {
    static String getAttributionTag(Context paramContext)
    {
      return paramContext.getAttributionTag();
    }
  }
  
  private static final class LegacyServiceMapHolder
  {
    static final HashMap<Class<?>, String> SERVICES;
    
    static
    {
      HashMap localHashMap = new HashMap();
      SERVICES = localHashMap;
      if (Build.VERSION.SDK_INT >= 22)
      {
        localHashMap.put(SubscriptionManager.class, "telephony_subscription_service");
        localHashMap.put(UsageStatsManager.class, "usagestats");
      }
      if (Build.VERSION.SDK_INT >= 21)
      {
        localHashMap.put(AppWidgetManager.class, "appwidget");
        localHashMap.put(BatteryManager.class, "batterymanager");
        localHashMap.put(CameraManager.class, "camera");
        localHashMap.put(JobScheduler.class, "jobscheduler");
        localHashMap.put(LauncherApps.class, "launcherapps");
        localHashMap.put(MediaProjectionManager.class, "media_projection");
        localHashMap.put(MediaSessionManager.class, "media_session");
        localHashMap.put(RestrictionsManager.class, "restrictions");
        localHashMap.put(TelecomManager.class, "telecom");
        localHashMap.put(TvInputManager.class, "tv_input");
      }
      if (Build.VERSION.SDK_INT >= 19)
      {
        localHashMap.put(AppOpsManager.class, "appops");
        localHashMap.put(CaptioningManager.class, "captioning");
        localHashMap.put(ConsumerIrManager.class, "consumer_ir");
        localHashMap.put(PrintManager.class, "print");
      }
      if (Build.VERSION.SDK_INT >= 18) {
        localHashMap.put(BluetoothManager.class, "bluetooth");
      }
      if (Build.VERSION.SDK_INT >= 17)
      {
        localHashMap.put(DisplayManager.class, "display");
        localHashMap.put(UserManager.class, "user");
      }
      if (Build.VERSION.SDK_INT >= 16)
      {
        localHashMap.put(InputManager.class, "input");
        localHashMap.put(MediaRouter.class, "media_router");
        localHashMap.put(NsdManager.class, "servicediscovery");
      }
      localHashMap.put(AccessibilityManager.class, "accessibility");
      localHashMap.put(AccountManager.class, "account");
      localHashMap.put(ActivityManager.class, "activity");
      localHashMap.put(AlarmManager.class, "alarm");
      localHashMap.put(AudioManager.class, "audio");
      localHashMap.put(ClipboardManager.class, "clipboard");
      localHashMap.put(ConnectivityManager.class, "connectivity");
      localHashMap.put(DevicePolicyManager.class, "device_policy");
      localHashMap.put(DownloadManager.class, "download");
      localHashMap.put(DropBoxManager.class, "dropbox");
      localHashMap.put(InputMethodManager.class, "input_method");
      localHashMap.put(KeyguardManager.class, "keyguard");
      localHashMap.put(LayoutInflater.class, "layout_inflater");
      localHashMap.put(LocationManager.class, "location");
      localHashMap.put(NfcManager.class, "nfc");
      localHashMap.put(NotificationManager.class, "notification");
      localHashMap.put(PowerManager.class, "power");
      localHashMap.put(SearchManager.class, "search");
      localHashMap.put(SensorManager.class, "sensor");
      localHashMap.put(StorageManager.class, "storage");
      localHashMap.put(TelephonyManager.class, "phone");
      localHashMap.put(TextServicesManager.class, "textservices");
      localHashMap.put(UiModeManager.class, "uimode");
      localHashMap.put(UsbManager.class, "usb");
      localHashMap.put(Vibrator.class, "vibrator");
      localHashMap.put(WallpaperManager.class, "wallpaper");
      localHashMap.put(WifiP2pManager.class, "wifip2p");
      localHashMap.put(WifiManager.class, "wifi");
      localHashMap.put(WindowManager.class, "window");
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\content\ContextCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */