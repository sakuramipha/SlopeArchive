package com.unity3d.player;

import android.database.ContentObserver;
import android.os.Handler;

class E
  extends ContentObserver
{
  private D a;
  
  public E(F paramF, Handler paramHandler, D paramD)
  {
    super(paramHandler);
    this.a = paramD;
  }
  
  public boolean deliverSelfNotifications()
  {
    return super.deliverSelfNotifications();
  }
  
  public void onChange(boolean paramBoolean)
  {
    D localD = this.a;
    if (localD != null) {
      ((OrientationLockListener)localD).a(paramBoolean);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\co\\unity3d\player\E.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */