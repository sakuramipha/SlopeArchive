package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;

final class WrappedDrawableState
  extends Drawable.ConstantState
{
  int mChangingConfigurations;
  Drawable.ConstantState mDrawableState;
  ColorStateList mTint = null;
  PorterDuff.Mode mTintMode = WrappedDrawableApi14.DEFAULT_TINT_MODE;
  
  WrappedDrawableState(WrappedDrawableState paramWrappedDrawableState)
  {
    if (paramWrappedDrawableState != null)
    {
      this.mChangingConfigurations = paramWrappedDrawableState.mChangingConfigurations;
      this.mDrawableState = paramWrappedDrawableState.mDrawableState;
      this.mTint = paramWrappedDrawableState.mTint;
      this.mTintMode = paramWrappedDrawableState.mTintMode;
    }
  }
  
  boolean canConstantState()
  {
    boolean bool;
    if (this.mDrawableState != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int getChangingConfigurations()
  {
    int j = this.mChangingConfigurations;
    Drawable.ConstantState localConstantState = this.mDrawableState;
    int i;
    if (localConstantState != null) {
      i = localConstantState.getChangingConfigurations();
    } else {
      i = 0;
    }
    return j | i;
  }
  
  public Drawable newDrawable()
  {
    return newDrawable(null);
  }
  
  public Drawable newDrawable(Resources paramResources)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      return new WrappedDrawableApi21(this, paramResources);
    }
    return new WrappedDrawableApi14(this, paramResources);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\graphics\drawable\WrappedDrawableState.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */