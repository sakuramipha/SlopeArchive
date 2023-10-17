package com.unity3d.player;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Handler;
import android.os.Looper;
import android.view.PixelCopy;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;

class H
  implements SurfaceHolder.Callback
{
  final I a;
  
  H(I paramI) {}
  
  public void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3)
  {
    I.-$$Nest$fgetb(this.a).updateGLDisplay(0, paramSurfaceHolder.getSurface());
    I.-$$Nest$fgetb(this.a).sendSurfaceChangedEvent();
  }
  
  public void surfaceCreated(SurfaceHolder paramSurfaceHolder)
  {
    I.-$$Nest$fgetb(this.a).updateGLDisplay(0, paramSurfaceHolder.getSurface());
    Object localObject = this.a;
    paramSurfaceHolder = I.-$$Nest$fgetc((I)localObject);
    UnityPlayer localUnityPlayer = I.-$$Nest$fgetb((I)localObject);
    localObject = paramSurfaceHolder.b;
    if ((localObject != null) && (((View)localObject).getParent() == null))
    {
      localUnityPlayer.addView(paramSurfaceHolder.b);
      localUnityPlayer.bringChildToFront(paramSurfaceHolder.b);
    }
  }
  
  public void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
  {
    paramSurfaceHolder = this.a;
    Object localObject = I.-$$Nest$fgetc(paramSurfaceHolder);
    paramSurfaceHolder = I.-$$Nest$fgeta(paramSurfaceHolder);
    localObject.getClass();
    if (PlatformSupport.NOUGAT_SUPPORT)
    {
      if (((w)localObject).b == null) {
        ((w)localObject).b = new v((w)localObject, ((w)localObject).a);
      }
      v localv = ((w)localObject).b;
      localv.getClass();
      localObject = Bitmap.createBitmap(paramSurfaceHolder.getWidth(), paramSurfaceHolder.getHeight(), Bitmap.Config.ARGB_8888);
      localv.a = ((Bitmap)localObject);
      PixelCopy.request(paramSurfaceHolder, (Bitmap)localObject, localv, new Handler(Looper.getMainLooper()));
    }
    I.-$$Nest$fgetb(this.a).updateGLDisplay(0, null);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\co\\unity3d\player\H.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */