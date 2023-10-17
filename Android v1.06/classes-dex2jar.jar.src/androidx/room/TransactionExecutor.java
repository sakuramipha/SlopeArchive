package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

class TransactionExecutor
  implements Executor
{
  private Runnable mActive;
  private final Executor mExecutor;
  private final ArrayDeque<Runnable> mTasks = new ArrayDeque();
  
  TransactionExecutor(Executor paramExecutor)
  {
    this.mExecutor = paramExecutor;
  }
  
  public void execute(Runnable paramRunnable)
  {
    try
    {
      ArrayDeque localArrayDeque = this.mTasks;
      Runnable local1 = new androidx/room/TransactionExecutor$1;
      local1.<init>(this, paramRunnable);
      localArrayDeque.offer(local1);
      if (this.mActive == null) {
        scheduleNext();
      }
      return;
    }
    finally
    {
      paramRunnable = finally;
      throw paramRunnable;
    }
  }
  
  void scheduleNext()
  {
    try
    {
      Runnable localRunnable = (Runnable)this.mTasks.poll();
      this.mActive = localRunnable;
      if (localRunnable != null) {
        this.mExecutor.execute(localRunnable);
      }
      return;
    }
    finally {}
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\room\TransactionExecutor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */