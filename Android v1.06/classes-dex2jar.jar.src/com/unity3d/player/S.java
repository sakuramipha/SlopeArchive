package com.unity3d.player;

import android.view.View;
import android.widget.FrameLayout;

class S
  implements Runnable
{
  final U a;
  
  S(U paramU) {}
  
  public void run()
  {
    U localU = this.a;
    Object localObject = U.-$$Nest$fgetf(localU);
    if (localObject != null)
    {
      U.-$$Nest$fgeta(localU).addViewToPlayer((View)localObject, true);
      localObject = this.a;
      U.-$$Nest$fputi((U)localObject, true);
      U.-$$Nest$fgetf((U)localObject).requestFocus();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\co\\unity3d\player\S.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */