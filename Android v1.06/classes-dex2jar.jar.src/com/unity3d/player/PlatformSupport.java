package com.unity3d.player;

import android.os.Build.VERSION;

public class PlatformSupport
{
  static final boolean MARSHMALLOW_SUPPORT;
  static final boolean NOUGAT_SUPPORT;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    boolean bool2 = true;
    boolean bool1;
    if (i >= 23) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    MARSHMALLOW_SUPPORT = bool1;
    if (i >= 24) {
      bool1 = bool2;
    } else {
      bool1 = false;
    }
    NOUGAT_SUPPORT = bool1;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\co\\unity3d\player\PlatformSupport.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */