package androidx.arch.core.executor;

import java.util.concurrent.Executor;

public class ArchTaskExecutor
  extends TaskExecutor
{
  private static final Executor sIOThreadExecutor = new Executor()
  {
    public void execute(Runnable paramAnonymousRunnable)
    {
      ArchTaskExecutor.getInstance().executeOnDiskIO(paramAnonymousRunnable);
    }
  };
  private static volatile ArchTaskExecutor sInstance;
  private static final Executor sMainThreadExecutor = new Executor()
  {
    public void execute(Runnable paramAnonymousRunnable)
    {
      ArchTaskExecutor.getInstance().postToMainThread(paramAnonymousRunnable);
    }
  };
  private TaskExecutor mDefaultTaskExecutor;
  private TaskExecutor mDelegate;
  
  private ArchTaskExecutor()
  {
    DefaultTaskExecutor localDefaultTaskExecutor = new DefaultTaskExecutor();
    this.mDefaultTaskExecutor = localDefaultTaskExecutor;
    this.mDelegate = localDefaultTaskExecutor;
  }
  
  public static Executor getIOThreadExecutor()
  {
    return sIOThreadExecutor;
  }
  
  public static ArchTaskExecutor getInstance()
  {
    if (sInstance != null) {
      return sInstance;
    }
    try
    {
      if (sInstance == null)
      {
        ArchTaskExecutor localArchTaskExecutor = new androidx/arch/core/executor/ArchTaskExecutor;
        localArchTaskExecutor.<init>();
        sInstance = localArchTaskExecutor;
      }
      return sInstance;
    }
    finally {}
  }
  
  public static Executor getMainThreadExecutor()
  {
    return sMainThreadExecutor;
  }
  
  public void executeOnDiskIO(Runnable paramRunnable)
  {
    this.mDelegate.executeOnDiskIO(paramRunnable);
  }
  
  public boolean isMainThread()
  {
    return this.mDelegate.isMainThread();
  }
  
  public void postToMainThread(Runnable paramRunnable)
  {
    this.mDelegate.postToMainThread(paramRunnable);
  }
  
  public void setDelegate(TaskExecutor paramTaskExecutor)
  {
    TaskExecutor localTaskExecutor = paramTaskExecutor;
    if (paramTaskExecutor == null) {
      localTaskExecutor = this.mDefaultTaskExecutor;
    }
    this.mDelegate = localTaskExecutor;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\arch\core\executor\ArchTaskExecutor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */