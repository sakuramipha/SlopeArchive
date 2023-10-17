package androidx.core.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class AppLaunchChecker
{
  private static final String KEY_STARTED_FROM_LAUNCHER = "startedFromLauncher";
  private static final String SHARED_PREFS_NAME = "android.support.AppLaunchChecker";
  
  public static boolean hasStartedFromLauncher(Context paramContext)
  {
    return paramContext.getSharedPreferences("android.support.AppLaunchChecker", 0).getBoolean("startedFromLauncher", false);
  }
  
  public static void onActivityCreate(Activity paramActivity)
  {
    SharedPreferences localSharedPreferences = paramActivity.getSharedPreferences("android.support.AppLaunchChecker", 0);
    if (localSharedPreferences.getBoolean("startedFromLauncher", false)) {
      return;
    }
    paramActivity = paramActivity.getIntent();
    if (paramActivity == null) {
      return;
    }
    if (("android.intent.action.MAIN".equals(paramActivity.getAction())) && ((paramActivity.hasCategory("android.intent.category.LAUNCHER")) || (paramActivity.hasCategory("android.intent.category.LEANBACK_LAUNCHER")))) {
      localSharedPreferences.edit().putBoolean("startedFromLauncher", true).apply();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\app\AppLaunchChecker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */