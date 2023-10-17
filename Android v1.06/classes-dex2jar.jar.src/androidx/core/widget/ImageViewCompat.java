package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.widget.ImageView;

public class ImageViewCompat
{
  public static ColorStateList getImageTintList(ImageView paramImageView)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      return paramImageView.getImageTintList();
    }
    if ((paramImageView instanceof TintableImageSourceView)) {
      paramImageView = ((TintableImageSourceView)paramImageView).getSupportImageTintList();
    } else {
      paramImageView = null;
    }
    return paramImageView;
  }
  
  public static PorterDuff.Mode getImageTintMode(ImageView paramImageView)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      return paramImageView.getImageTintMode();
    }
    if ((paramImageView instanceof TintableImageSourceView)) {
      paramImageView = ((TintableImageSourceView)paramImageView).getSupportImageTintMode();
    } else {
      paramImageView = null;
    }
    return paramImageView;
  }
  
  public static void setImageTintList(ImageView paramImageView, ColorStateList paramColorStateList)
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramImageView.setImageTintList(paramColorStateList);
      if (Build.VERSION.SDK_INT == 21)
      {
        paramColorStateList = paramImageView.getDrawable();
        if ((paramColorStateList != null) && (paramImageView.getImageTintList() != null))
        {
          if (paramColorStateList.isStateful()) {
            paramColorStateList.setState(paramImageView.getDrawableState());
          }
          paramImageView.setImageDrawable(paramColorStateList);
        }
      }
    }
    else if ((paramImageView instanceof TintableImageSourceView))
    {
      ((TintableImageSourceView)paramImageView).setSupportImageTintList(paramColorStateList);
    }
  }
  
  public static void setImageTintMode(ImageView paramImageView, PorterDuff.Mode paramMode)
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramImageView.setImageTintMode(paramMode);
      if (Build.VERSION.SDK_INT == 21)
      {
        paramMode = paramImageView.getDrawable();
        if ((paramMode != null) && (paramImageView.getImageTintList() != null))
        {
          if (paramMode.isStateful()) {
            paramMode.setState(paramImageView.getDrawableState());
          }
          paramImageView.setImageDrawable(paramMode);
        }
      }
    }
    else if ((paramImageView instanceof TintableImageSourceView))
    {
      ((TintableImageSourceView)paramImageView).setSupportImageTintMode(paramMode);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\widget\ImageViewCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */