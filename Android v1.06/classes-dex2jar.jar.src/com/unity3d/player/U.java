package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class U
{
  private UnityPlayer a = null;
  private Context b = null;
  private a c;
  private final Semaphore d = new Semaphore(0);
  private final Lock e = new ReentrantLock();
  private M f = null;
  private int g = 2;
  private boolean h = false;
  private boolean i = false;
  
  U(UnityPlayer paramUnityPlayer)
  {
    this.a = paramUnityPlayer;
  }
  
  private void a()
  {
    Object localObject = this.f;
    if (localObject != null)
    {
      this.a.removeViewFromPlayer((View)localObject);
      this.i = false;
      this.f.destroyPlayer();
      this.f = null;
      localObject = this.c;
      if (localObject != null) {
        ((UnityPlayer.m)localObject).a();
      }
    }
  }
  
  public boolean a(Context paramContext, String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, long paramLong1, long paramLong2, a parama)
  {
    this.e.lock();
    this.c = parama;
    this.b = paramContext;
    this.d.drainPermits();
    this.g = 2;
    runOnUiThread(new P(this, paramString, paramInt1, paramInt2, paramInt3, paramBoolean, paramLong1, paramLong2));
    paramBoolean = false;
    try
    {
      this.e.unlock();
      this.d.acquire();
      this.e.lock();
      paramInt1 = this.g;
      if (paramInt1 != 2) {
        paramBoolean = true;
      }
    }
    catch (InterruptedException paramContext) {}
    runOnUiThread(new Q(this));
    if ((paramBoolean) && (this.g != 3)) {
      paramContext = new S(this);
    } else {
      paramContext = new T(this);
    }
    runOnUiThread(paramContext);
    this.e.unlock();
    return paramBoolean;
  }
  
  public void b()
  {
    this.e.lock();
    M localM = this.f;
    if (localM != null) {
      localM.updateVideoLayout();
    }
    this.e.unlock();
  }
  
  public void c()
  {
    this.e.lock();
    M localM = this.f;
    if (localM != null) {
      if (this.g == 0)
      {
        localM.cancelOnPrepare();
      }
      else if (this.i)
      {
        boolean bool = localM.a();
        this.h = bool;
        if (!bool) {
          this.f.pause();
        }
      }
    }
    this.e.unlock();
  }
  
  public void d()
  {
    this.e.lock();
    M localM = this.f;
    if ((localM != null) && (this.i) && (!this.h)) {
      localM.start();
    }
    this.e.unlock();
  }
  
  protected void runOnUiThread(Runnable paramRunnable)
  {
    Context localContext = this.b;
    if ((localContext instanceof Activity)) {
      ((Activity)localContext).runOnUiThread(paramRunnable);
    } else {
      u.Log(5, "Not running from an Activity; Ignoring execution request...");
    }
  }
  
  public static abstract interface a {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\co\\unity3d\player\U.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */