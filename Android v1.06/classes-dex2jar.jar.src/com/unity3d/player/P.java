package com.unity3d.player;

import android.view.View;
import android.widget.FrameLayout;
import java.util.concurrent.Semaphore;

class P
  implements Runnable
{
  final U h;
  
  P(U paramU, String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, long paramLong1, long paramLong2) {}
  
  public void run()
  {
    Object localObject = this.h;
    if (U.-$$Nest$fgetf((U)localObject) != null)
    {
      u.Log(5, "Video already playing");
      localObject = this.h;
      U.-$$Nest$fputg((U)localObject, 2);
      U.-$$Nest$fgetd((U)localObject).release();
      return;
    }
    U.-$$Nest$fputf((U)localObject, new M(U.-$$Nest$fgetb(this.h), this.a, this.b, this.c, this.d, this.e, this.f, this.g, new O(this)));
    U localU = this.h;
    localObject = U.-$$Nest$fgetf(localU);
    if (localObject != null) {
      U.-$$Nest$fgeta(localU).addView((View)localObject);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\co\\unity3d\player\P.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */