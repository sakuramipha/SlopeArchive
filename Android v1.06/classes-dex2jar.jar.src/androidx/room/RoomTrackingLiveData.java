package androidx.room;

import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.lifecycle.LiveData;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

class RoomTrackingLiveData<T>
  extends LiveData<T>
{
  final Callable<T> mComputeFunction;
  final AtomicBoolean mComputing = new AtomicBoolean(false);
  private final InvalidationLiveDataContainer mContainer;
  final RoomDatabase mDatabase;
  final boolean mInTransaction;
  final AtomicBoolean mInvalid = new AtomicBoolean(true);
  final Runnable mInvalidationRunnable = new Runnable()
  {
    public void run()
    {
      boolean bool = RoomTrackingLiveData.this.hasActiveObservers();
      if ((RoomTrackingLiveData.this.mInvalid.compareAndSet(false, true)) && (bool)) {
        RoomTrackingLiveData.this.getQueryExecutor().execute(RoomTrackingLiveData.this.mRefreshRunnable);
      }
    }
  };
  final InvalidationTracker.Observer mObserver;
  final Runnable mRefreshRunnable = new Runnable()
  {
    public void run()
    {
      if (RoomTrackingLiveData.this.mRegisteredObserver.compareAndSet(false, true)) {
        RoomTrackingLiveData.this.mDatabase.getInvalidationTracker().addWeakObserver(RoomTrackingLiveData.this.mObserver);
      }
      int i;
      do
      {
        if (RoomTrackingLiveData.this.mComputing.compareAndSet(false, true))
        {
          Object localObject1 = null;
          i = 0;
          try
          {
            for (;;)
            {
              boolean bool = RoomTrackingLiveData.this.mInvalid.compareAndSet(true, false);
              if (bool) {
                try
                {
                  localObject1 = RoomTrackingLiveData.this.mComputeFunction.call();
                  i = 1;
                }
                catch (Exception localException)
                {
                  localObject1 = new java/lang/RuntimeException;
                  ((RuntimeException)localObject1).<init>("Exception while computing database live data.", localException);
                  throw ((Throwable)localObject1);
                }
              }
            }
            if (i != 0) {
              RoomTrackingLiveData.this.postValue(localObject1);
            }
          }
          finally
          {
            RoomTrackingLiveData.this.mComputing.set(false);
          }
        }
        i = 0;
      } while ((i != 0) && (RoomTrackingLiveData.this.mInvalid.get()));
    }
  };
  final AtomicBoolean mRegisteredObserver = new AtomicBoolean(false);
  
  RoomTrackingLiveData(RoomDatabase paramRoomDatabase, InvalidationLiveDataContainer paramInvalidationLiveDataContainer, boolean paramBoolean, Callable<T> paramCallable, String[] paramArrayOfString)
  {
    this.mDatabase = paramRoomDatabase;
    this.mInTransaction = paramBoolean;
    this.mComputeFunction = paramCallable;
    this.mContainer = paramInvalidationLiveDataContainer;
    this.mObserver = new InvalidationTracker.Observer(paramArrayOfString)
    {
      public void onInvalidated(Set<String> paramAnonymousSet)
      {
        ArchTaskExecutor.getInstance().executeOnMainThread(RoomTrackingLiveData.this.mInvalidationRunnable);
      }
    };
  }
  
  Executor getQueryExecutor()
  {
    if (this.mInTransaction) {
      return this.mDatabase.getTransactionExecutor();
    }
    return this.mDatabase.getQueryExecutor();
  }
  
  protected void onActive()
  {
    super.onActive();
    this.mContainer.onActive(this);
    getQueryExecutor().execute(this.mRefreshRunnable);
  }
  
  protected void onInactive()
  {
    super.onInactive();
    this.mContainer.onInactive(this);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\room\RoomTrackingLiveData.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */