package com.unity3d.player.a;

import android.os.Build.VERSION;
import com.unity3d.player.IPermissionRequestCallbacks;

class c
  implements Runnable
{
  private IPermissionRequestCallbacks a;
  private String b;
  private int c;
  private boolean d;
  
  c(d paramd, IPermissionRequestCallbacks paramIPermissionRequestCallbacks, String paramString, int paramInt, boolean paramBoolean)
  {
    this.a = paramIPermissionRequestCallbacks;
    this.b = paramString;
    this.c = paramInt;
    this.d = paramBoolean;
  }
  
  public void run()
  {
    int i = this.c;
    if (i == -1)
    {
      if ((Build.VERSION.SDK_INT < 30) && (!this.d)) {
        this.a.onPermissionDeniedAndDontAskAgain(this.b);
      } else {
        this.a.onPermissionDenied(this.b);
      }
    }
    else if (i == 0) {
      this.a.onPermissionGranted(this.b);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\co\\unity3d\player\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */