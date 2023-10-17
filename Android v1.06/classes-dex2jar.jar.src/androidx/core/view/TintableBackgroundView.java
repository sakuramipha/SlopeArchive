package androidx.core.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;

public abstract interface TintableBackgroundView
{
  public abstract ColorStateList getSupportBackgroundTintList();
  
  public abstract PorterDuff.Mode getSupportBackgroundTintMode();
  
  public abstract void setSupportBackgroundTintList(ColorStateList paramColorStateList);
  
  public abstract void setSupportBackgroundTintMode(PorterDuff.Mode paramMode);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\view\TintableBackgroundView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */