package androidx.work.impl;

import android.os.Handler;
import android.os.Looper;
import androidx.core.os.HandlerCompat;
import androidx.work.RunnableScheduler;

public class DefaultRunnableScheduler
  implements RunnableScheduler
{
  private final Handler mHandler;
  
  public DefaultRunnableScheduler()
  {
    this.mHandler = HandlerCompat.createAsync(Looper.getMainLooper());
  }
  
  public DefaultRunnableScheduler(Handler paramHandler)
  {
    this.mHandler = paramHandler;
  }
  
  public void cancel(Runnable paramRunnable)
  {
    this.mHandler.removeCallbacks(paramRunnable);
  }
  
  public Handler getHandler()
  {
    return this.mHandler;
  }
  
  public void scheduleWithDelay(long paramLong, Runnable paramRunnable)
  {
    this.mHandler.postDelayed(paramRunnable, paramLong);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\impl\DefaultRunnableScheduler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */