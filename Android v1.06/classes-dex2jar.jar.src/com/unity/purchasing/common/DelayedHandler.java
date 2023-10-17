package com.unity.purchasing.common;

import android.os.Handler;
import android.os.Looper;

public class DelayedHandler
  implements IDelayedExecutor
{
  private Handler handler = new Handler(Looper.getMainLooper());
  
  public void ExecuteDelayed(Runnable paramRunnable, long paramLong)
  {
    this.handler.postDelayed(paramRunnable, paramLong);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\co\\unity\purchasing\common\DelayedHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */