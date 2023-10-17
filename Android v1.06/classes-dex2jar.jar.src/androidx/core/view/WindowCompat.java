package androidx.core.view;

import android.os.Build.VERSION;
import android.view.View;
import android.view.Window;

public final class WindowCompat
{
  public static final int FEATURE_ACTION_BAR = 8;
  public static final int FEATURE_ACTION_BAR_OVERLAY = 9;
  public static final int FEATURE_ACTION_MODE_OVERLAY = 10;
  
  public static WindowInsetsControllerCompat getInsetsController(Window paramWindow, View paramView)
  {
    if (Build.VERSION.SDK_INT >= 30) {
      return Impl30.getInsetsController(paramWindow);
    }
    return new WindowInsetsControllerCompat(paramWindow, paramView);
  }
  
  public static <T extends View> T requireViewById(Window paramWindow, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return paramWindow.requireViewById(paramInt);
    }
    paramWindow = paramWindow.findViewById(paramInt);
    if (paramWindow != null) {
      return paramWindow;
    }
    throw new IllegalArgumentException("ID does not reference a View inside this Window");
  }
  
  public static void setDecorFitsSystemWindows(Window paramWindow, boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT >= 30) {
      Impl30.setDecorFitsSystemWindows(paramWindow, paramBoolean);
    } else if (Build.VERSION.SDK_INT >= 16) {
      Impl16.setDecorFitsSystemWindows(paramWindow, paramBoolean);
    }
  }
  
  private static class Impl16
  {
    static void setDecorFitsSystemWindows(Window paramWindow, boolean paramBoolean)
    {
      paramWindow = paramWindow.getDecorView();
      int i = paramWindow.getSystemUiVisibility();
      if (paramBoolean) {
        i &= 0xF8FF;
      } else {
        i |= 0x700;
      }
      paramWindow.setSystemUiVisibility(i);
    }
  }
  
  private static class Impl30
  {
    static WindowInsetsControllerCompat getInsetsController(Window paramWindow)
    {
      paramWindow = paramWindow.getInsetsController();
      if (paramWindow != null) {
        return WindowInsetsControllerCompat.toWindowInsetsControllerCompat(paramWindow);
      }
      return null;
    }
    
    static void setDecorFitsSystemWindows(Window paramWindow, boolean paramBoolean)
    {
      paramWindow.setDecorFitsSystemWindows(paramBoolean);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\view\WindowCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */