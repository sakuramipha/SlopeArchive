package androidx.work.impl.utils;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

public class SerialExecutor
  implements Executor
{
  private volatile Runnable mActive;
  private final Executor mExecutor;
  private final Object mLock;
  private final ArrayDeque<Task> mTasks;
  
  public SerialExecutor(Executor paramExecutor)
  {
    this.mExecutor = paramExecutor;
    this.mTasks = new ArrayDeque();
    this.mLock = new Object();
  }
  
  public void execute(Runnable paramRunnable)
  {
    synchronized (this.mLock)
    {
      ArrayDeque localArrayDeque = this.mTasks;
      Task localTask = new androidx/work/impl/utils/SerialExecutor$Task;
      localTask.<init>(this, paramRunnable);
      localArrayDeque.add(localTask);
      if (this.mActive == null) {
        scheduleNext();
      }
      return;
    }
  }
  
  public Executor getDelegatedExecutor()
  {
    return this.mExecutor;
  }
  
  public boolean hasPendingTasks()
  {
    synchronized (this.mLock)
    {
      boolean bool;
      if (!this.mTasks.isEmpty()) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
  
  void scheduleNext()
  {
    synchronized (this.mLock)
    {
      Runnable localRunnable = (Runnable)this.mTasks.poll();
      this.mActive = localRunnable;
      if (localRunnable != null) {
        this.mExecutor.execute(this.mActive);
      }
      return;
    }
  }
  
  static class Task
    implements Runnable
  {
    final Runnable mRunnable;
    final SerialExecutor mSerialExecutor;
    
    Task(SerialExecutor paramSerialExecutor, Runnable paramRunnable)
    {
      this.mSerialExecutor = paramSerialExecutor;
      this.mRunnable = paramRunnable;
    }
    
    public void run()
    {
      try
      {
        this.mRunnable.run();
        return;
      }
      finally
      {
        this.mSerialExecutor.scheduleNext();
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\imp\\utils\SerialExecutor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */