package com.unity3d.player.a;

import com.unity3d.player.IPermissionRequestCallbacks;

class b
  implements Runnable
{
  final d b;
  
  b(d paramd, String[] paramArrayOfString) {}
  
  public void run()
  {
    d locald = this.b;
    String[] arrayOfString = this.a;
    locald.getClass();
    int j = arrayOfString.length;
    for (int i = 0; i < j; i++)
    {
      String str = arrayOfString[i];
      d.-$$Nest$fgeta(locald).onPermissionDenied(str);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\co\\unity3d\player\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */