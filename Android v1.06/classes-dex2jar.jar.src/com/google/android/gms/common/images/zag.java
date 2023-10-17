package com.google.android.gms.common.images;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.internal.base.zak;

public abstract class zag
{
  final zad zaa;
  protected int zab = 0;
  
  public zag(Uri paramUri, int paramInt)
  {
    this.zaa = new zad(paramUri);
    this.zab = paramInt;
  }
  
  protected abstract void zaa(Drawable paramDrawable, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3);
  
  final void zab(Context paramContext, zak paramzak, boolean paramBoolean)
  {
    int i = this.zab;
    if (i != 0) {
      paramContext = paramContext.getResources().getDrawable(i);
    } else {
      paramContext = null;
    }
    zaa(paramContext, paramBoolean, false, false);
  }
  
  final void zac(Context paramContext, Bitmap paramBitmap, boolean paramBoolean)
  {
    Asserts.checkNotNull(paramBitmap);
    zaa(new BitmapDrawable(paramContext.getResources(), paramBitmap), false, false, true);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\images\zag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */