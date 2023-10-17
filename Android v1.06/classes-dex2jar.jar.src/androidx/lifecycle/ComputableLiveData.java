package androidx.lifecycle;

import androidx.arch.core.executor.ArchTaskExecutor;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class ComputableLiveData<T>
{
  final AtomicBoolean mComputing = new AtomicBoolean(false);
  final Executor mExecutor;
  final AtomicBoolean mInvalid = new AtomicBoolean(true);
  final Runnable mInvalidationRunnable = new Runnable()
  {
    public void run()
    {
      boolean bool = ComputableLiveData.this.mLiveData.hasActiveObservers();
      if ((ComputableLiveData.this.mInvalid.compareAndSet(false, true)) && (bool)) {
        ComputableLiveData.this.mExecutor.execute(ComputableLiveData.this.mRefreshRunnable);
      }
    }
  };
  final LiveData<T> mLiveData;
  final Runnable mRefreshRunnable = new Runnable()
  {
    public void run()
    {
      int i;
      do
      {
        Object localObject1 = ComputableLiveData.this.mComputing;
        i = 0;
        if (((AtomicBoolean)localObject1).compareAndSet(false, true))
        {
          localObject1 = null;
          i = 0;
          try
          {
            while (ComputableLiveData.this.mInvalid.compareAndSet(true, false))
            {
              localObject1 = ComputableLiveData.this.compute();
              i = 1;
            }
            if (i != 0) {
              ComputableLiveData.this.mLiveData.postValue(localObject1);
            }
          }
          finally
          {
            ComputableLiveData.this.mComputing.set(false);
          }
        }
      } while ((i != 0) && (ComputableLiveData.this.mInvalid.get()));
    }
  };
  
  public ComputableLiveData()
  {
    this(ArchTaskExecutor.getIOThreadExecutor());
  }
  
  public ComputableLiveData(Executor paramExecutor)
  {
    this.mExecutor = paramExecutor;
    this.mLiveData = new LiveData()
    {
      protected void onActive()
      {
        ComputableLiveData.this.mExecutor.execute(ComputableLiveData.this.mRefreshRunnable);
      }
    };
  }
  
  protected abstract T compute();
  
  public LiveData<T> getLiveData()
  {
    return this.mLiveData;
  }
  
  public void invalidate()
  {
    ArchTaskExecutor.getInstance().executeOnMainThread(this.mInvalidationRunnable);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\lifecycle\ComputableLiveData.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */