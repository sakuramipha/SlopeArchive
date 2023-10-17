package androidx.work.impl.utils.taskexecutor;

import android.os.Handler;
import android.os.Looper;
import androidx.work.impl.utils.SerialExecutor;
import java.util.concurrent.Executor;

public class WorkManagerTaskExecutor
  implements TaskExecutor
{
  private final SerialExecutor mBackgroundExecutor;
  private final Executor mMainThreadExecutor = new Executor()
  {
    public void execute(Runnable paramAnonymousRunnable)
    {
      WorkManagerTaskExecutor.this.postToMainThread(paramAnonymousRunnable);
    }
  };
  private final Handler mMainThreadHandler = new Handler(Looper.getMainLooper());
  
  public WorkManagerTaskExecutor(Executor paramExecutor)
  {
    this.mBackgroundExecutor = new SerialExecutor(paramExecutor);
  }
  
  public void executeOnBackgroundThread(Runnable paramRunnable)
  {
    this.mBackgroundExecutor.execute(paramRunnable);
  }
  
  public SerialExecutor getBackgroundExecutor()
  {
    return this.mBackgroundExecutor;
  }
  
  public Executor getMainThreadExecutor()
  {
    return this.mMainThreadExecutor;
  }
  
  public void postToMainThread(Runnable paramRunnable)
  {
    this.mMainThreadHandler.post(paramRunnable);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\imp\\utils\taskexecutor\WorkManagerTaskExecutor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */