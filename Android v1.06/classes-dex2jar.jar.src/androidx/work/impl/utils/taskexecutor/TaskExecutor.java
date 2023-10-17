package androidx.work.impl.utils.taskexecutor;

import androidx.work.impl.utils.SerialExecutor;
import java.util.concurrent.Executor;

public abstract interface TaskExecutor
{
  public abstract void executeOnBackgroundThread(Runnable paramRunnable);
  
  public abstract SerialExecutor getBackgroundExecutor();
  
  public abstract Executor getMainThreadExecutor();
  
  public abstract void postToMainThread(Runnable paramRunnable);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\imp\\utils\taskexecutor\TaskExecutor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */