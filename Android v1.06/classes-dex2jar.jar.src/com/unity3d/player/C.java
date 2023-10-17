package com.unity3d.player;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.DisplayMetrics;
import android.view.View;

public class C
  extends View
{
  final a a;
  final int b;
  Bitmap c;
  Bitmap d;
  
  public C(Context paramContext, a parama)
  {
    super(paramContext);
    this.a = parama;
    int i = getResources().getIdentifier("unity_static_splash", "drawable", getContext().getPackageName());
    this.b = i;
    if (i != 0) {
      forceLayout();
    }
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    Bitmap localBitmap = this.c;
    if (localBitmap != null)
    {
      localBitmap.recycle();
      this.c = null;
    }
    localBitmap = this.d;
    if (localBitmap != null)
    {
      localBitmap.recycle();
      this.d = null;
    }
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.b == 0) {
      return;
    }
    Object localObject;
    if (this.c == null)
    {
      localObject = new BitmapFactory.Options();
      ((BitmapFactory.Options)localObject).inScaled = false;
      this.c = BitmapFactory.decodeResource(getResources(), this.b, (BitmapFactory.Options)localObject);
    }
    paramInt4 = this.c.getWidth();
    paramInt3 = this.c.getHeight();
    paramInt2 = getWidth();
    int i = getHeight();
    if ((paramInt2 != 0) && (i != 0))
    {
      float f2 = paramInt4 / paramInt3;
      float f3 = paramInt2;
      float f1 = i;
      if (f3 / f1 <= f2) {
        paramInt1 = 1;
      } else {
        paramInt1 = 0;
      }
      int j = this.a.ordinal();
      if (j != 0)
      {
        if ((j != 1) && (j != 2))
        {
          paramInt1 = paramInt4;
          paramInt2 = paramInt3;
          break label240;
        }
        if (this.a == a.a) {
          paramInt3 = 1;
        } else {
          paramInt3 = 0;
        }
        if ((paramInt3 ^ paramInt1) != 0)
        {
          paramInt3 = (int)(f3 / f2);
          paramInt1 = paramInt2;
          paramInt2 = paramInt3;
          break label240;
        }
      }
      else
      {
        paramInt1 = paramInt4;
        if (paramInt2 < paramInt4)
        {
          paramInt3 = (int)(f3 / f2);
          paramInt1 = paramInt2;
        }
        paramInt2 = paramInt3;
        if (i >= paramInt3) {
          break label240;
        }
      }
      paramInt1 = (int)(f1 * f2);
      paramInt2 = i;
      label240:
      localObject = this.d;
      if (localObject != null)
      {
        if ((((Bitmap)localObject).getWidth() == paramInt1) && (this.d.getHeight() == paramInt2)) {
          return;
        }
        localObject = this.d;
        if (localObject != this.c)
        {
          ((Bitmap)localObject).recycle();
          this.d = null;
        }
      }
      localObject = Bitmap.createScaledBitmap(this.c, paramInt1, paramInt2, true);
      this.d = ((Bitmap)localObject);
      ((Bitmap)localObject).setDensity(getResources().getDisplayMetrics().densityDpi);
      ColorDrawable localColorDrawable = new ColorDrawable(-16777216);
      localObject = new BitmapDrawable(getResources(), this.d);
      ((BitmapDrawable)localObject).setGravity(17);
      setBackground(new LayerDrawable(new Drawable[] { localColorDrawable, localObject }));
    }
  }
  
  static enum a
  {
    private static final a[] b;
    
    static
    {
      a locala2 = new a("Center", 0);
      a locala1 = new a("Fit", 1);
      a locala3 = new a("Fill", 2);
      a = locala3;
      b = new a[] { locala2, locala1, locala3 };
    }
    
    public static a[] a()
    {
      return (a[])b.clone();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\co\\unity3d\player\C.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */