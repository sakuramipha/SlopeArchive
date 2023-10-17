package com.unity3d.player;

import android.content.Context;
import android.provider.Settings.System;

public class OrientationLockListener
  implements D
{
  private F a;
  private Context b;
  
  OrientationLockListener(Context paramContext)
  {
    this.b = paramContext;
    this.a = new F(paramContext);
    nativeUpdateOrientationLockState(Settings.System.getInt(paramContext.getContentResolver(), "accelerometer_rotation", 0));
    this.a.a(this, "accelerometer_rotation");
  }
  
  public void a()
  {
    this.a.a();
    this.a = null;
  }
  
  public void a(boolean paramBoolean)
  {
    nativeUpdateOrientationLockState(Settings.System.getInt(this.b.getContentResolver(), "accelerometer_rotation", 0));
  }
  
  public final native void nativeUpdateOrientationLockState(int paramInt);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\co\\unity3d\player\OrientationLockListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */