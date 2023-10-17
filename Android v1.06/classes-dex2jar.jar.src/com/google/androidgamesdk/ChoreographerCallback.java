package com.google.androidgamesdk;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;

public class ChoreographerCallback
  implements Choreographer.FrameCallback
{
  private static final String LOG_TAG = "ChoreographerCallback";
  private long mCookie;
  private b mLooper;
  
  public ChoreographerCallback(long paramLong)
  {
    this.mCookie = paramLong;
    b localb = new b(null);
    this.mLooper = localb;
    localb.start();
  }
  
  public void doFrame(long paramLong)
  {
    nOnChoreographer(this.mCookie, paramLong);
  }
  
  public native void nOnChoreographer(long paramLong1, long paramLong2);
  
  public void postFrameCallback()
  {
    this.mLooper.a.post(new a());
  }
  
  public void postFrameCallbackDelayed(long paramLong)
  {
    Choreographer.getInstance().postFrameCallbackDelayed(this, paramLong);
  }
  
  public void terminate()
  {
    this.mLooper.a.getLooper().quit();
    try
    {
      this.mLooper.join();
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;) {}
    }
  }
  
  class a
    implements Runnable
  {
    a() {}
    
    public void run()
    {
      Choreographer.getInstance().postFrameCallback(ChoreographerCallback.this);
    }
  }
  
  private class b
    extends Thread
  {
    public Handler a;
    
    private b() {}
    
    public void run()
    {
      Log.i("ChoreographerCallback", "Starting looper thread");
      Looper.prepare();
      this.a = new Handler();
      Looper.loop();
      Log.i("ChoreographerCallback", "Terminating looper thread");
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\androidgamesdk\ChoreographerCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */