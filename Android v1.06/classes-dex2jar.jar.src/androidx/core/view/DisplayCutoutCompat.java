package androidx.core.view;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.DisplayCutout;
import androidx.core.graphics.Insets;
import androidx.core.os.BuildCompat;
import androidx.core.util.ObjectsCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class DisplayCutoutCompat
{
  private final Object mDisplayCutout;
  
  public DisplayCutoutCompat(Rect paramRect, List<Rect> paramList)
  {
    this(paramRect);
  }
  
  public DisplayCutoutCompat(Insets paramInsets1, Rect paramRect1, Rect paramRect2, Rect paramRect3, Rect paramRect4, Insets paramInsets2)
  {
    this(constructDisplayCutout(paramInsets1, paramRect1, paramRect2, paramRect3, paramRect4, paramInsets2));
  }
  
  private DisplayCutoutCompat(Object paramObject)
  {
    this.mDisplayCutout = paramObject;
  }
  
  private static DisplayCutout constructDisplayCutout(Insets paramInsets1, Rect paramRect1, Rect paramRect2, Rect paramRect3, Rect paramRect4, Insets paramInsets2)
  {
    if (BuildCompat.isAtLeastR()) {
      return new DisplayCutout(paramInsets1.toPlatformInsets(), paramRect1, paramRect2, paramRect3, paramRect4, paramInsets2.toPlatformInsets());
    }
    if (Build.VERSION.SDK_INT >= 29) {
      return new DisplayCutout(paramInsets1.toPlatformInsets(), paramRect1, paramRect2, paramRect3, paramRect4);
    }
    if (Build.VERSION.SDK_INT >= 28)
    {
      paramInsets2 = new Rect(paramInsets1.left, paramInsets1.top, paramInsets1.right, paramInsets1.bottom);
      paramInsets1 = new ArrayList();
      if (paramRect1 != null) {
        paramInsets1.add(paramRect1);
      }
      if (paramRect2 != null) {
        paramInsets1.add(paramRect2);
      }
      if (paramRect3 != null) {
        paramInsets1.add(paramRect3);
      }
      if (paramRect4 != null) {
        paramInsets1.add(paramRect4);
      }
      return new DisplayCutout(paramInsets2, paramInsets1);
    }
    return null;
  }
  
  static DisplayCutoutCompat wrap(Object paramObject)
  {
    if (paramObject == null) {
      paramObject = null;
    } else {
      paramObject = new DisplayCutoutCompat(paramObject);
    }
    return (DisplayCutoutCompat)paramObject;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (DisplayCutoutCompat)paramObject;
      return ObjectsCompat.equals(this.mDisplayCutout, ((DisplayCutoutCompat)paramObject).mDisplayCutout);
    }
    return false;
  }
  
  public List<Rect> getBoundingRects()
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return ((DisplayCutout)this.mDisplayCutout).getBoundingRects();
    }
    return Collections.emptyList();
  }
  
  public int getSafeInsetBottom()
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return ((DisplayCutout)this.mDisplayCutout).getSafeInsetBottom();
    }
    return 0;
  }
  
  public int getSafeInsetLeft()
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return ((DisplayCutout)this.mDisplayCutout).getSafeInsetLeft();
    }
    return 0;
  }
  
  public int getSafeInsetRight()
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return ((DisplayCutout)this.mDisplayCutout).getSafeInsetRight();
    }
    return 0;
  }
  
  public int getSafeInsetTop()
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return ((DisplayCutout)this.mDisplayCutout).getSafeInsetTop();
    }
    return 0;
  }
  
  public Insets getWaterfallInsets()
  {
    if (BuildCompat.isAtLeastR()) {
      return Insets.toCompatInsets(((DisplayCutout)this.mDisplayCutout).getWaterfallInsets());
    }
    return Insets.NONE;
  }
  
  public int hashCode()
  {
    Object localObject = this.mDisplayCutout;
    int i;
    if (localObject == null) {
      i = 0;
    } else {
      i = localObject.hashCode();
    }
    return i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("DisplayCutoutCompat{");
    localStringBuilder.append(this.mDisplayCutout);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  DisplayCutout unwrap()
  {
    return (DisplayCutout)this.mDisplayCutout;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\view\DisplayCutoutCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */