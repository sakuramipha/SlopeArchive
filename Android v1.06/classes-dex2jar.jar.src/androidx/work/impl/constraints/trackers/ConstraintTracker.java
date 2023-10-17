package androidx.work.impl.constraints.trackers;

import android.content.Context;
import androidx.work.Logger;
import androidx.work.impl.constraints.ConstraintListener;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

public abstract class ConstraintTracker<T>
{
  private static final String TAG = Logger.tagWithPrefix("ConstraintTracker");
  protected final Context mAppContext;
  T mCurrentState;
  private final Set<ConstraintListener<T>> mListeners = new LinkedHashSet();
  private final Object mLock = new Object();
  protected final TaskExecutor mTaskExecutor;
  
  ConstraintTracker(Context paramContext, TaskExecutor paramTaskExecutor)
  {
    this.mAppContext = paramContext.getApplicationContext();
    this.mTaskExecutor = paramTaskExecutor;
  }
  
  public void addListener(ConstraintListener<T> paramConstraintListener)
  {
    synchronized (this.mLock)
    {
      if (this.mListeners.add(paramConstraintListener))
      {
        if (this.mListeners.size() == 1)
        {
          this.mCurrentState = getInitialState();
          Logger.get().debug(TAG, String.format("%s: initial state = %s", new Object[] { getClass().getSimpleName(), this.mCurrentState }), new Throwable[0]);
          startTracking();
        }
        paramConstraintListener.onConstraintChanged(this.mCurrentState);
      }
      return;
    }
  }
  
  public abstract T getInitialState();
  
  public void removeListener(ConstraintListener<T> paramConstraintListener)
  {
    synchronized (this.mLock)
    {
      if ((this.mListeners.remove(paramConstraintListener)) && (this.mListeners.isEmpty())) {
        stopTracking();
      }
      return;
    }
  }
  
  public void setState(T paramT)
  {
    synchronized (this.mLock)
    {
      Object localObject2 = this.mCurrentState;
      if ((localObject2 != paramT) && ((localObject2 == null) || (!localObject2.equals(paramT))))
      {
        this.mCurrentState = paramT;
        paramT = new java/util/ArrayList;
        paramT.<init>(this.mListeners);
        localObject2 = this.mTaskExecutor.getMainThreadExecutor();
        Runnable local1 = new androidx/work/impl/constraints/trackers/ConstraintTracker$1;
        local1.<init>(this, paramT);
        ((Executor)localObject2).execute(local1);
        return;
      }
      return;
    }
  }
  
  public abstract void startTracking();
  
  public abstract void stopTracking();
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\impl\constraints\trackers\ConstraintTracker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */