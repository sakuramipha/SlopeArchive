package com.unity3d.player;

import android.content.Context;
import android.graphics.Rect;
import android.view.Surface;
import com.unity3d.player.a.a;

public class Camera2Wrapper
  implements a
{
  private Context a;
  private s b = null;
  
  public Camera2Wrapper(Context paramContext)
  {
    this.a = paramContext;
    initCamera2Jni();
  }
  
  private final native void deinitCamera2Jni();
  
  private final native void initCamera2Jni();
  
  private final native void nativeFrameReady(Object paramObject1, Object paramObject2, Object paramObject3, int paramInt1, int paramInt2, int paramInt3);
  
  private final native void nativeSurfaceTextureReady(Object paramObject);
  
  public void a()
  {
    deinitCamera2Jni();
    closeCamera2();
  }
  
  public void a(Object paramObject)
  {
    nativeSurfaceTextureReady(paramObject);
  }
  
  public void a(Object paramObject1, Object paramObject2, Object paramObject3, int paramInt1, int paramInt2, int paramInt3)
  {
    nativeFrameReady(paramObject1, paramObject2, paramObject3, paramInt1, paramInt2, paramInt3);
  }
  
  protected void closeCamera2()
  {
    s locals = this.b;
    if (locals != null) {
      locals.a();
    }
    this.b = null;
  }
  
  protected int getCamera2Count()
  {
    return s.a(this.a);
  }
  
  protected int getCamera2FocalLengthEquivalent(int paramInt)
  {
    return s.a(this.a, paramInt);
  }
  
  protected int[] getCamera2Resolutions(int paramInt)
  {
    return s.b(this.a, paramInt);
  }
  
  protected int getCamera2SensorOrientation(int paramInt)
  {
    return s.c(this.a, paramInt);
  }
  
  protected Rect getFrameSizeCamera2()
  {
    Object localObject = this.b;
    if (localObject != null) {
      localObject = ((s)localObject).b();
    } else {
      localObject = new Rect();
    }
    return (Rect)localObject;
  }
  
  protected boolean initializeCamera2(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, Surface paramSurface)
  {
    if ((this.b == null) && (UnityPlayer.currentActivity != null))
    {
      s locals = new s(this);
      this.b = locals;
      return locals.a(this.a, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramSurface);
    }
    return false;
  }
  
  protected boolean isCamera2AutoFocusPointSupported(int paramInt)
  {
    return s.d(this.a, paramInt);
  }
  
  protected boolean isCamera2FrontFacing(int paramInt)
  {
    return s.e(this.a, paramInt);
  }
  
  protected void pauseCamera2()
  {
    s locals = this.b;
    if (locals != null) {
      locals.c();
    }
  }
  
  protected boolean setAutoFocusPoint(float paramFloat1, float paramFloat2)
  {
    s locals = this.b;
    if (locals != null) {
      return locals.a(paramFloat1, paramFloat2);
    }
    return false;
  }
  
  protected void startCamera2()
  {
    s locals = this.b;
    if (locals != null) {
      locals.g();
    }
  }
  
  protected void stopCamera2()
  {
    s locals = this.b;
    if (locals != null) {
      locals.h();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\co\\unity3d\player\Camera2Wrapper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */