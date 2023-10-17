package com.google.androidgamesdk;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.hardware.display.DisplayManager;
import android.hardware.display.DisplayManager.DisplayListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Display;
import android.view.Display.Mode;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SwappyDisplayManager
  implements DisplayManager.DisplayListener
{
  private final boolean DEBUG = false;
  private final String LOG_TAG = "SwappyDisplayManager";
  private final long ONE_MS_IN_NS = 1000000L;
  private final long ONE_S_IN_NS = 1000000000L;
  private Activity mActivity;
  private long mCookie;
  private Display.Mode mCurrentMode;
  private b mLooper;
  private WindowManager mWindowManager;
  
  public SwappyDisplayManager(long paramLong, Activity paramActivity)
  {
    try
    {
      Object localObject1 = paramActivity.getPackageManager().getActivityInfo(paramActivity.getIntent().getComponent(), 128).metaData;
      if (localObject1 != null)
      {
        localObject1 = ((Bundle)localObject1).getString("android.app.lib_name");
        if (localObject1 != null) {
          System.loadLibrary((String)localObject1);
        }
      }
    }
    finally
    {
      Log.e("SwappyDisplayManager", ((Throwable)localObject2).getMessage());
    }
    this.mCookie = paramLong;
    this.mActivity = paramActivity;
    paramActivity = (WindowManager)paramActivity.getSystemService(WindowManager.class);
    this.mWindowManager = paramActivity;
    paramActivity = paramActivity.getDefaultDisplay();
    this.mCurrentMode = paramActivity.getMode();
    updateSupportedRefreshRates(paramActivity);
    DisplayManager localDisplayManager = (DisplayManager)this.mActivity.getSystemService(DisplayManager.class);
    try
    {
      paramActivity = new com/google/androidgamesdk/SwappyDisplayManager$b;
      paramActivity.<init>(this, null);
      this.mLooper = paramActivity;
      paramActivity.start();
      localDisplayManager.registerDisplayListener(this, this.mLooper.a);
      return;
    }
    finally {}
  }
  
  private boolean modeMatchesCurrentResolution(Display.Mode paramMode)
  {
    boolean bool;
    if ((paramMode.getPhysicalHeight() == this.mCurrentMode.getPhysicalHeight()) && (paramMode.getPhysicalWidth() == this.mCurrentMode.getPhysicalWidth())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private native void nOnRefreshPeriodChanged(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
  
  private native void nSetSupportedRefreshPeriods(long paramLong, long[] paramArrayOfLong, int[] paramArrayOfInt);
  
  private void updateSupportedRefreshRates(Display paramDisplay)
  {
    Display.Mode[] arrayOfMode = paramDisplay.getSupportedModes();
    int k = 0;
    int i = 0;
    int j = 0;
    while (i < arrayOfMode.length)
    {
      if (modeMatchesCurrentResolution(arrayOfMode[i])) {
        j++;
      }
      i++;
    }
    paramDisplay = new long[j];
    int[] arrayOfInt = new int[j];
    j = 0;
    for (i = k; i < arrayOfMode.length; i++) {
      if (modeMatchesCurrentResolution(arrayOfMode[i]))
      {
        paramDisplay[j] = ((1.0E9F / arrayOfMode[i].getRefreshRate()));
        arrayOfInt[j] = arrayOfMode[i].getModeId();
        j++;
      }
    }
    nSetSupportedRefreshPeriods(this.mCookie, paramDisplay, arrayOfInt);
  }
  
  public void onDisplayAdded(int paramInt) {}
  
  public void onDisplayChanged(int paramInt)
  {
    try
    {
      Display localDisplay = this.mWindowManager.getDefaultDisplay();
      float f = localDisplay.getRefreshRate();
      Display.Mode localMode = localDisplay.getMode();
      int i = localMode.getPhysicalWidth();
      paramInt = this.mCurrentMode.getPhysicalWidth();
      int j = 1;
      if (i != paramInt) {
        paramInt = 1;
      } else {
        paramInt = 0;
      }
      if (localMode.getPhysicalHeight() != this.mCurrentMode.getPhysicalHeight()) {
        i = 1;
      } else {
        i = 0;
      }
      if (f == this.mCurrentMode.getRefreshRate()) {
        j = 0;
      }
      this.mCurrentMode = localMode;
      if ((paramInt | i) != 0) {
        updateSupportedRefreshRates(localDisplay);
      }
      if (j != 0)
      {
        long l1 = localDisplay.getAppVsyncOffsetNanos();
        long l2 = this.mWindowManager.getDefaultDisplay().getPresentationDeadlineNanos();
        long l3 = (1.0E9F / f);
        nOnRefreshPeriodChanged(this.mCookie, l3, l1, l3 - (l2 - 1000000L));
      }
      return;
    }
    finally {}
  }
  
  public void onDisplayRemoved(int paramInt) {}
  
  public void setPreferredDisplayModeId(final int paramInt)
  {
    this.mActivity.runOnUiThread(new a(paramInt));
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
    a(int paramInt) {}
    
    public void run()
    {
      Window localWindow = SwappyDisplayManager.-$$Nest$fgetmActivity(SwappyDisplayManager.this).getWindow();
      WindowManager.LayoutParams localLayoutParams = localWindow.getAttributes();
      localLayoutParams.preferredDisplayModeId = paramInt;
      localWindow.setAttributes(localLayoutParams);
    }
  }
  
  private class b
    extends Thread
  {
    public Handler a;
    private Condition c;
    
    private b()
    {
      this$1 = new ReentrantLock();
      this.c = SwappyDisplayManager.this.newCondition();
    }
    
    public void run()
    {
      Log.i("SwappyDisplayManager", "Starting looper thread");
      SwappyDisplayManager.this.lock();
      Looper.prepare();
      this.a = new Handler();
      this.c.signal();
      SwappyDisplayManager.this.unlock();
      Looper.loop();
      Log.i("SwappyDisplayManager", "Terminating looper thread");
    }
    
    public void start()
    {
      SwappyDisplayManager.this.lock();
      super.start();
      try
      {
        this.c.await();
      }
      catch (InterruptedException localInterruptedException)
      {
        localInterruptedException.printStackTrace();
      }
      SwappyDisplayManager.this.unlock();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\androidgamesdk\SwappyDisplayManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */