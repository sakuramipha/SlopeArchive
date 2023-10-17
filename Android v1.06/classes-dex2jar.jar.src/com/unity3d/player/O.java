package com.unity3d.player;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;

class O
  implements K
{
  final P a;
  
  O(P paramP) {}
  
  public void a(int paramInt)
  {
    U.-$$Nest$fgete(this.a.h).lock();
    U localU = this.a.h;
    U.-$$Nest$fputg(localU, paramInt);
    if ((paramInt == 3) && (U.-$$Nest$fgeti(localU))) {
      localU.runOnUiThread(new N(this));
    }
    if (paramInt != 0) {
      U.-$$Nest$fgetd(this.a.h).release();
    }
    U.-$$Nest$fgete(this.a.h).unlock();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\co\\unity3d\player\O.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */