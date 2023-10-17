package androidx.work.impl.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.work.Logger;

public class PackageManagerHelper
{
  private static final String TAG = Logger.tagWithPrefix("PackageManagerHelper");
  
  public static boolean isComponentExplicitlyEnabled(Context paramContext, Class<?> paramClass)
  {
    return isComponentExplicitlyEnabled(paramContext, paramClass.getName());
  }
  
  public static boolean isComponentExplicitlyEnabled(Context paramContext, String paramString)
  {
    int i = paramContext.getPackageManager().getComponentEnabledSetting(new ComponentName(paramContext, paramString));
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    return bool;
  }
  
  public static void setComponentEnabled(Context paramContext, Class<?> paramClass, boolean paramBoolean)
  {
    String str1 = "enabled";
    try
    {
      localObject2 = paramContext.getPackageManager();
      localObject1 = new android/content/ComponentName;
      ((ComponentName)localObject1).<init>(paramContext, paramClass.getName());
      int i;
      if (paramBoolean) {
        i = 1;
      } else {
        i = 2;
      }
      ((PackageManager)localObject2).setComponentEnabledSetting((ComponentName)localObject1, i, 1);
      localObject1 = Logger.get();
      String str2 = TAG;
      localObject2 = paramClass.getName();
      if (paramBoolean) {
        paramContext = "enabled";
      } else {
        paramContext = "disabled";
      }
      ((Logger)localObject1).debug(str2, String.format("%s %s", new Object[] { localObject2, paramContext }), new Throwable[0]);
    }
    catch (Exception localException)
    {
      Object localObject2 = Logger.get();
      Object localObject1 = TAG;
      paramClass = paramClass.getName();
      if (paramBoolean) {
        paramContext = str1;
      } else {
        paramContext = "disabled";
      }
      ((Logger)localObject2).debug((String)localObject1, String.format("%s could not be %s", new Object[] { paramClass, paramContext }), new Throwable[] { localException });
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\imp\\utils\PackageManagerHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */