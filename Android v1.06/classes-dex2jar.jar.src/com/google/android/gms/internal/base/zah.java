package com.google.android.gms.internal.base;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

final class zah
  extends Drawable.ConstantState
{
  int zaa;
  int zab;
  
  zah(zah paramzah)
  {
    if (paramzah != null)
    {
      this.zaa = paramzah.zaa;
      this.zab = paramzah.zab;
    }
  }
  
  public final int getChangingConfigurations()
  {
    return this.zaa;
  }
  
  public final Drawable newDrawable()
  {
    return new zai(this);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\base\zah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */