package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;

class I
  extends FrameLayout
{
  private a a;
  private UnityPlayer b;
  private w c;
  
  public I(Context paramContext, UnityPlayer paramUnityPlayer)
  {
    super(paramContext);
    this.c = new w(paramContext);
    this.b = paramUnityPlayer;
    paramUnityPlayer = new a(paramContext, paramUnityPlayer);
    this.a = paramUnityPlayer;
    paramUnityPlayer.setId(paramContext.getResources().getIdentifier("unitySurfaceView", "id", paramContext.getPackageName()));
    if (a())
    {
      this.a.getHolder().setFormat(-3);
      this.a.setZOrderOnTop(true);
    }
    else
    {
      this.a.getHolder().setFormat(-1);
    }
    this.a.getHolder().addCallback(new H(this));
    this.a.setFocusable(true);
    this.a.setFocusableInTouchMode(true);
    this.a.setContentDescription(a(paramContext));
    setBackgroundColor(-16777216);
    addView(this.a, new FrameLayout.LayoutParams(-1, -1, 17));
  }
  
  private String a(Context paramContext)
  {
    return paramContext.getResources().getString(paramContext.getResources().getIdentifier("game_view_content_description", "string", paramContext.getPackageName()));
  }
  
  private boolean a()
  {
    Object localObject = UnityPlayer.currentActivity;
    if (localObject == null) {
      return false;
    }
    localObject = ((Activity)localObject).getTheme().obtainStyledAttributes(new int[] { 16842840 });
    boolean bool = ((TypedArray)localObject).getBoolean(0, false);
    ((TypedArray)localObject).recycle();
    return bool;
  }
  
  void a(float paramFloat)
  {
    this.a.a(paramFloat);
  }
  
  public void b()
  {
    w localw = this.c;
    UnityPlayer localUnityPlayer = this.b;
    v localv = localw.b;
    if ((localv != null) && (localv.getParent() != null)) {
      localUnityPlayer.removeView(localw.b);
    }
    this.c.b = null;
  }
  
  public boolean c()
  {
    a locala = this.a;
    boolean bool;
    if ((locala != null) && (locala.a())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\co\\unity3d\player\I.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */