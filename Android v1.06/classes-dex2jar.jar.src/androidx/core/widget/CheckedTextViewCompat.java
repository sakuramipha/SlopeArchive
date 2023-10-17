package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Log;
import android.widget.CheckedTextView;
import java.lang.reflect.Field;

public final class CheckedTextViewCompat
{
  private static final String TAG = "CheckedTextViewCompat";
  
  public static Drawable getCheckMarkDrawable(CheckedTextView paramCheckedTextView)
  {
    if (Build.VERSION.SDK_INT >= 16) {
      return Api16Impl.getCheckMarkDrawable(paramCheckedTextView);
    }
    return Api14Impl.getCheckMarkDrawable(paramCheckedTextView);
  }
  
  public static ColorStateList getCheckMarkTintList(CheckedTextView paramCheckedTextView)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      return Api21Impl.getCheckMarkTintList(paramCheckedTextView);
    }
    if ((paramCheckedTextView instanceof TintableCheckedTextView)) {
      return ((TintableCheckedTextView)paramCheckedTextView).getSupportCheckMarkTintList();
    }
    return null;
  }
  
  public static PorterDuff.Mode getCheckMarkTintMode(CheckedTextView paramCheckedTextView)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      return Api21Impl.getCheckMarkTintMode(paramCheckedTextView);
    }
    if ((paramCheckedTextView instanceof TintableCheckedTextView)) {
      return ((TintableCheckedTextView)paramCheckedTextView).getSupportCheckMarkTintMode();
    }
    return null;
  }
  
  public static void setCheckMarkTintList(CheckedTextView paramCheckedTextView, ColorStateList paramColorStateList)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      Api21Impl.setCheckMarkTintList(paramCheckedTextView, paramColorStateList);
    } else if ((paramCheckedTextView instanceof TintableCheckedTextView)) {
      ((TintableCheckedTextView)paramCheckedTextView).setSupportCheckMarkTintList(paramColorStateList);
    }
  }
  
  public static void setCheckMarkTintMode(CheckedTextView paramCheckedTextView, PorterDuff.Mode paramMode)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      Api21Impl.setCheckMarkTintMode(paramCheckedTextView, paramMode);
    } else if ((paramCheckedTextView instanceof TintableCheckedTextView)) {
      ((TintableCheckedTextView)paramCheckedTextView).setSupportCheckMarkTintMode(paramMode);
    }
  }
  
  private static class Api14Impl
  {
    private static Field sCheckMarkDrawableField;
    private static boolean sResolved;
    
    static Drawable getCheckMarkDrawable(CheckedTextView paramCheckedTextView)
    {
      if (!sResolved)
      {
        try
        {
          Field localField1 = CheckedTextView.class.getDeclaredField("mCheckMarkDrawable");
          sCheckMarkDrawableField = localField1;
          localField1.setAccessible(true);
        }
        catch (NoSuchFieldException localNoSuchFieldException)
        {
          Log.i("CheckedTextViewCompat", "Failed to retrieve mCheckMarkDrawable field", localNoSuchFieldException);
        }
        sResolved = true;
      }
      Field localField2 = sCheckMarkDrawableField;
      if (localField2 != null) {
        try
        {
          paramCheckedTextView = (Drawable)localField2.get(paramCheckedTextView);
          return paramCheckedTextView;
        }
        catch (IllegalAccessException paramCheckedTextView)
        {
          Log.i("CheckedTextViewCompat", "Failed to get check mark drawable via reflection", paramCheckedTextView);
          sCheckMarkDrawableField = null;
        }
      }
      return null;
    }
  }
  
  private static class Api16Impl
  {
    static Drawable getCheckMarkDrawable(CheckedTextView paramCheckedTextView)
    {
      return paramCheckedTextView.getCheckMarkDrawable();
    }
  }
  
  private static class Api21Impl
  {
    static ColorStateList getCheckMarkTintList(CheckedTextView paramCheckedTextView)
    {
      return paramCheckedTextView.getCheckMarkTintList();
    }
    
    static PorterDuff.Mode getCheckMarkTintMode(CheckedTextView paramCheckedTextView)
    {
      return paramCheckedTextView.getCheckMarkTintMode();
    }
    
    static void setCheckMarkTintList(CheckedTextView paramCheckedTextView, ColorStateList paramColorStateList)
    {
      paramCheckedTextView.setCheckMarkTintList(paramColorStateList);
    }
    
    static void setCheckMarkTintMode(CheckedTextView paramCheckedTextView, PorterDuff.Mode paramMode)
    {
      paramCheckedTextView.setCheckMarkTintMode(paramMode);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\widget\CheckedTextViewCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */