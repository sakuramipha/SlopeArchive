package androidx.work.impl.background.greedy;

import androidx.work.Logger;
import androidx.work.RunnableScheduler;
import androidx.work.impl.model.WorkSpec;
import java.util.HashMap;
import java.util.Map;

public class DelayedWorkTracker
{
  static final String TAG = Logger.tagWithPrefix("DelayedWorkTracker");
  final GreedyScheduler mGreedyScheduler;
  private final RunnableScheduler mRunnableScheduler;
  private final Map<String, Runnable> mRunnables;
  
  public DelayedWorkTracker(GreedyScheduler paramGreedyScheduler, RunnableScheduler paramRunnableScheduler)
  {
    this.mGreedyScheduler = paramGreedyScheduler;
    this.mRunnableScheduler = paramRunnableScheduler;
    this.mRunnables = new HashMap();
  }
  
  public void schedule(final WorkSpec paramWorkSpec)
  {
    Object localObject = (Runnable)this.mRunnables.remove(paramWorkSpec.id);
    if (localObject != null) {
      this.mRunnableScheduler.cancel((Runnable)localObject);
    }
    localObject = new Runnable()
    {
      public void run()
      {
        Logger.get().debug(DelayedWorkTracker.TAG, String.format("Scheduling work %s", new Object[] { paramWorkSpec.id }), new Throwable[0]);
        DelayedWorkTracker.this.mGreedyScheduler.schedule(new WorkSpec[] { paramWorkSpec });
      }
    };
    this.mRunnables.put(paramWorkSpec.id, localObject);
    long l2 = System.currentTimeMillis();
    long l1 = paramWorkSpec.calculateNextRunTime();
    this.mRunnableScheduler.scheduleWithDelay(l1 - l2, (Runnable)localObject);
  }
  
  public void unschedule(String paramString)
  {
    paramString = (Runnable)this.mRunnables.remove(paramString);
    if (paramString != null) {
      this.mRunnableScheduler.cancel(paramString);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\impl\background\greedy\DelayedWorkTracker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */