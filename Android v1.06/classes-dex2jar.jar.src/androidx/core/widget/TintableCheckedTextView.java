package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;

public abstract interface TintableCheckedTextView
{
  public abstract ColorStateList getSupportCheckMarkTintList();
  
  public abstract PorterDuff.Mode getSupportCheckMarkTintMode();
  
  public abstract void setSupportCheckMarkTintList(ColorStateList paramColorStateList);
  
  public abstract void setSupportCheckMarkTintMode(PorterDuff.Mode paramMode);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\widget\TintableCheckedTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */