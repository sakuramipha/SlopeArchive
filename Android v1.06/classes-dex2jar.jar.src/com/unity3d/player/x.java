package com.unity3d.player;

import android.app.Dialog;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;

class x
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  final B b;
  
  x(B paramB, View paramView) {}
  
  public void onGlobalLayout()
  {
    if (this.a.isShown())
    {
      Object localObject2 = new Rect();
      B.-$$Nest$fgetb(this.b).getWindowVisibleDisplayFrame((Rect)localObject2);
      Object localObject1 = new int[2];
      B.-$$Nest$fgetb(this.b).getLocationOnScreen((int[])localObject1);
      localObject1 = new Point(((Rect)localObject2).left - localObject1[0], ((Rect)localObject2).height() - this.a.getHeight());
      localObject2 = new Point();
      this.b.getWindow().getWindowManager().getDefaultDisplay().getSize((Point)localObject2);
      int j = B.-$$Nest$fgetb(this.b).getHeight();
      int k = ((Point)localObject2).y;
      int i = B.-$$Nest$fgetb(this.b).getHeight() - ((Point)localObject1).y;
      if (i != j - k + this.a.getHeight()) {
        B.-$$Nest$fgetb(this.b).reportSoftInputIsVisible(true);
      } else {
        B.-$$Nest$fgetb(this.b).reportSoftInputIsVisible(false);
      }
      localObject1 = new Rect(((Point)localObject1).x, ((Point)localObject1).y, this.a.getWidth(), i);
      B.-$$Nest$fgetb(this.b).reportSoftInputArea((Rect)localObject1);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\co\\unity3d\player\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */