package com.google.android.gms.internal.base;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.SystemClock;

public final class zai
  extends Drawable
  implements Drawable.Callback
{
  private int zaa = 0;
  private long zab;
  private int zac;
  private int zad = 255;
  private int zae;
  private int zaf = 0;
  private boolean zag = true;
  private boolean zah;
  private zah zai;
  private Drawable zaj;
  private Drawable zak;
  private boolean zal;
  private boolean zam;
  private boolean zan;
  private int zao;
  
  public zai(Drawable paramDrawable1, Drawable paramDrawable2)
  {
    this(null);
    Object localObject = paramDrawable1;
    if (paramDrawable1 == null) {
      localObject = zag.zaa();
    }
    this.zaj = ((Drawable)localObject);
    ((Drawable)localObject).setCallback(this);
    paramDrawable1 = this.zai;
    int i = paramDrawable1.zab;
    paramDrawable1.zab = (((Drawable)localObject).getChangingConfigurations() | i);
    paramDrawable1 = paramDrawable2;
    if (paramDrawable2 == null) {
      paramDrawable1 = zag.zaa();
    }
    this.zak = paramDrawable1;
    paramDrawable1.setCallback(this);
    paramDrawable2 = this.zai;
    i = paramDrawable2.zab;
    paramDrawable2.zab = (paramDrawable1.getChangingConfigurations() | i);
  }
  
  zai(zah paramzah)
  {
    this.zai = new zah(paramzah);
  }
  
  public final void draw(Canvas paramCanvas)
  {
    int m = this.zaa;
    int k = 0;
    int i = 1;
    int j = 1;
    if (m != 1)
    {
      if ((m == 2) && (this.zab >= 0L))
      {
        float f = (float)(SystemClock.uptimeMillis() - this.zab) / this.zae;
        if (f >= 1.0F) {
          i = j;
        } else {
          i = 0;
        }
        if (i != 0) {
          this.zaa = 0;
        }
        f = Math.min(f, 1.0F);
        this.zaf = ((int)(this.zac * f + 0.0F));
      }
    }
    else
    {
      this.zab = SystemClock.uptimeMillis();
      this.zaa = 2;
      i = 0;
    }
    j = this.zaf;
    boolean bool = this.zag;
    Drawable localDrawable1 = this.zaj;
    Drawable localDrawable2 = this.zak;
    if (i != 0)
    {
      if (bool)
      {
        i = j;
        if (j != 0) {
          break label170;
        }
        i = k;
      }
      else
      {
        i = j;
      }
      localDrawable1.draw(paramCanvas);
      label170:
      j = this.zad;
      if (i == j)
      {
        localDrawable2.setAlpha(j);
        localDrawable2.draw(paramCanvas);
      }
      return;
    }
    if (bool) {
      localDrawable1.setAlpha(this.zad - j);
    }
    localDrawable1.draw(paramCanvas);
    if (bool) {
      localDrawable1.setAlpha(this.zad);
    }
    if (j > 0)
    {
      localDrawable2.setAlpha(j);
      localDrawable2.draw(paramCanvas);
      localDrawable2.setAlpha(this.zad);
    }
    invalidateSelf();
  }
  
  public final int getChangingConfigurations()
  {
    int i = super.getChangingConfigurations();
    zah localzah = this.zai;
    return i | localzah.zaa | localzah.zab;
  }
  
  public final Drawable.ConstantState getConstantState()
  {
    if (zac())
    {
      this.zai.zaa = getChangingConfigurations();
      return this.zai;
    }
    return null;
  }
  
  public final int getIntrinsicHeight()
  {
    return Math.max(this.zaj.getIntrinsicHeight(), this.zak.getIntrinsicHeight());
  }
  
  public final int getIntrinsicWidth()
  {
    return Math.max(this.zaj.getIntrinsicWidth(), this.zak.getIntrinsicWidth());
  }
  
  public final int getOpacity()
  {
    if (!this.zan)
    {
      this.zao = Drawable.resolveOpacity(this.zaj.getOpacity(), this.zak.getOpacity());
      this.zan = true;
    }
    return this.zao;
  }
  
  public final void invalidateDrawable(Drawable paramDrawable)
  {
    paramDrawable = getCallback();
    if (paramDrawable != null) {
      paramDrawable.invalidateDrawable(this);
    }
  }
  
  public final Drawable mutate()
  {
    if ((!this.zah) && (super.mutate() == this)) {
      if (zac())
      {
        this.zaj.mutate();
        this.zak.mutate();
        this.zah = true;
      }
      else
      {
        throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
      }
    }
    return this;
  }
  
  protected final void onBoundsChange(Rect paramRect)
  {
    this.zaj.setBounds(paramRect);
    this.zak.setBounds(paramRect);
  }
  
  public final void scheduleDrawable(Drawable paramDrawable, Runnable paramRunnable, long paramLong)
  {
    paramDrawable = getCallback();
    if (paramDrawable != null) {
      paramDrawable.scheduleDrawable(this, paramRunnable, paramLong);
    }
  }
  
  public final void setAlpha(int paramInt)
  {
    if (this.zaf == this.zad) {
      this.zaf = paramInt;
    }
    this.zad = paramInt;
    invalidateSelf();
  }
  
  public final void setColorFilter(ColorFilter paramColorFilter)
  {
    this.zaj.setColorFilter(paramColorFilter);
    this.zak.setColorFilter(paramColorFilter);
  }
  
  public final void unscheduleDrawable(Drawable paramDrawable, Runnable paramRunnable)
  {
    paramDrawable = getCallback();
    if (paramDrawable != null) {
      paramDrawable.unscheduleDrawable(this, paramRunnable);
    }
  }
  
  public final Drawable zaa()
  {
    return this.zak;
  }
  
  public final void zab(int paramInt)
  {
    this.zac = this.zad;
    this.zaf = 0;
    this.zae = 250;
    this.zaa = 1;
    invalidateSelf();
  }
  
  public final boolean zac()
  {
    if (!this.zal)
    {
      Drawable.ConstantState localConstantState = this.zaj.getConstantState();
      boolean bool2 = false;
      boolean bool1 = bool2;
      if (localConstantState != null)
      {
        bool1 = bool2;
        if (this.zak.getConstantState() != null) {
          bool1 = true;
        }
      }
      this.zam = bool1;
      this.zal = true;
    }
    return this.zam;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\base\zai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */