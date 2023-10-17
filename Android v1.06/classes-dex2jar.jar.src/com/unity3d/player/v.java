package com.unity3d.player;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.PixelCopy.OnPixelCopyFinishedListener;
import android.view.View;

class v
  extends View
  implements PixelCopy.OnPixelCopyFinishedListener
{
  Bitmap a;
  
  v(w paramw, Context paramContext)
  {
    super(paramContext);
  }
  
  public void onPixelCopyFinished(int paramInt)
  {
    if (paramInt == 0) {
      setBackground(new LayerDrawable(new Drawable[] { new ColorDrawable(-16777216), new BitmapDrawable(getResources(), this.a) }));
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\co\\unity3d\player\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */