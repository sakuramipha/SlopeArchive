package androidx.lifecycle;

import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.arch.core.internal.SafeIterableMap.IteratorWithAdditions;
import java.util.Iterator;
import java.util.Map.Entry;

public abstract class LiveData<T>
{
  static final Object NOT_SET = new Object();
  static final int START_VERSION = -1;
  int mActiveCount = 0;
  private volatile Object mData;
  final Object mDataLock = new Object();
  private boolean mDispatchInvalidated;
  private boolean mDispatchingValue;
  private SafeIterableMap<Observer<? super T>, LiveData<T>.ObserverWrapper> mObservers = new SafeIterableMap();
  volatile Object mPendingData;
  private final Runnable mPostValueRunnable;
  private int mVersion;
  
  public LiveData()
  {
    Object localObject = NOT_SET;
    this.mPendingData = localObject;
    this.mPostValueRunnable = new Runnable()
    {
      public void run()
      {
        synchronized (LiveData.this.mDataLock)
        {
          Object localObject2 = LiveData.this.mPendingData;
          LiveData.this.mPendingData = LiveData.NOT_SET;
          LiveData.this.setValue(localObject2);
          return;
        }
      }
    };
    this.mData = localObject;
    this.mVersion = -1;
  }
  
  public LiveData(T paramT)
  {
    this.mPendingData = NOT_SET;
    this.mPostValueRunnable = new Runnable()
    {
      public void run()
      {
        synchronized (LiveData.this.mDataLock)
        {
          Object localObject2 = LiveData.this.mPendingData;
          LiveData.this.mPendingData = LiveData.NOT_SET;
          LiveData.this.setValue(localObject2);
          return;
        }
      }
    };
    this.mData = paramT;
    this.mVersion = 0;
  }
  
  static void assertMainThread(String paramString)
  {
    if (ArchTaskExecutor.getInstance().isMainThread()) {
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Cannot invoke ");
    localStringBuilder.append(paramString);
    localStringBuilder.append(" on a background thread");
    throw new IllegalStateException(localStringBuilder.toString());
  }
  
  private void considerNotify(LiveData<T>.ObserverWrapper paramLiveData)
  {
    if (!paramLiveData.mActive) {
      return;
    }
    if (!paramLiveData.shouldBeActive())
    {
      paramLiveData.activeStateChanged(false);
      return;
    }
    int i = paramLiveData.mLastVersion;
    int j = this.mVersion;
    if (i >= j) {
      return;
    }
    paramLiveData.mLastVersion = j;
    paramLiveData.mObserver.onChanged(this.mData);
  }
  
  void dispatchingValue(LiveData<T>.ObserverWrapper paramLiveData)
  {
    if (this.mDispatchingValue)
    {
      this.mDispatchInvalidated = true;
      return;
    }
    this.mDispatchingValue = true;
    do
    {
      this.mDispatchInvalidated = false;
      LiveData<T>.ObserverWrapper localLiveData;
      if (paramLiveData != null)
      {
        considerNotify(paramLiveData);
        localLiveData = null;
      }
      else
      {
        SafeIterableMap.IteratorWithAdditions localIteratorWithAdditions = this.mObservers.iteratorWithAdditions();
        do
        {
          localLiveData = paramLiveData;
          if (!localIteratorWithAdditions.hasNext()) {
            break;
          }
          considerNotify((ObserverWrapper)((Map.Entry)localIteratorWithAdditions.next()).getValue());
        } while (!this.mDispatchInvalidated);
        localLiveData = paramLiveData;
      }
      paramLiveData = localLiveData;
    } while (this.mDispatchInvalidated);
    this.mDispatchingValue = false;
  }
  
  public T getValue()
  {
    Object localObject = this.mData;
    if (localObject != NOT_SET) {
      return (T)localObject;
    }
    return null;
  }
  
  int getVersion()
  {
    return this.mVersion;
  }
  
  public boolean hasActiveObservers()
  {
    boolean bool;
    if (this.mActiveCount > 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean hasObservers()
  {
    boolean bool;
    if (this.mObservers.size() > 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void observe(LifecycleOwner paramLifecycleOwner, Observer<? super T> paramObserver)
  {
    assertMainThread("observe");
    if (paramLifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
      return;
    }
    LifecycleBoundObserver localLifecycleBoundObserver = new LifecycleBoundObserver(paramLifecycleOwner, paramObserver);
    paramObserver = (ObserverWrapper)this.mObservers.putIfAbsent(paramObserver, localLifecycleBoundObserver);
    if ((paramObserver != null) && (!paramObserver.isAttachedTo(paramLifecycleOwner))) {
      throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
    }
    if (paramObserver != null) {
      return;
    }
    paramLifecycleOwner.getLifecycle().addObserver(localLifecycleBoundObserver);
  }
  
  public void observeForever(Observer<? super T> paramObserver)
  {
    assertMainThread("observeForever");
    AlwaysActiveObserver localAlwaysActiveObserver = new AlwaysActiveObserver(paramObserver);
    paramObserver = (ObserverWrapper)this.mObservers.putIfAbsent(paramObserver, localAlwaysActiveObserver);
    if (!(paramObserver instanceof LifecycleBoundObserver))
    {
      if (paramObserver != null) {
        return;
      }
      localAlwaysActiveObserver.activeStateChanged(true);
      return;
    }
    throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
  }
  
  protected void onActive() {}
  
  protected void onInactive() {}
  
  protected void postValue(T paramT)
  {
    synchronized (this.mDataLock)
    {
      int i;
      if (this.mPendingData == NOT_SET) {
        i = 1;
      } else {
        i = 0;
      }
      this.mPendingData = paramT;
      if (i == 0) {
        return;
      }
      ArchTaskExecutor.getInstance().postToMainThread(this.mPostValueRunnable);
      return;
    }
  }
  
  public void removeObserver(Observer<? super T> paramObserver)
  {
    assertMainThread("removeObserver");
    paramObserver = (ObserverWrapper)this.mObservers.remove(paramObserver);
    if (paramObserver == null) {
      return;
    }
    paramObserver.detachObserver();
    paramObserver.activeStateChanged(false);
  }
  
  public void removeObservers(LifecycleOwner paramLifecycleOwner)
  {
    assertMainThread("removeObservers");
    Iterator localIterator = this.mObservers.iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if (((ObserverWrapper)localEntry.getValue()).isAttachedTo(paramLifecycleOwner)) {
        removeObserver((Observer)localEntry.getKey());
      }
    }
  }
  
  protected void setValue(T paramT)
  {
    assertMainThread("setValue");
    this.mVersion += 1;
    this.mData = paramT;
    dispatchingValue(null);
  }
  
  private class AlwaysActiveObserver
    extends LiveData<T>.ObserverWrapper
  {
    AlwaysActiveObserver()
    {
      super(localObserver);
    }
    
    boolean shouldBeActive()
    {
      return true;
    }
  }
  
  class LifecycleBoundObserver
    extends LiveData<T>.ObserverWrapper
    implements LifecycleEventObserver
  {
    final LifecycleOwner mOwner;
    
    LifecycleBoundObserver(Observer<? super T> paramObserver)
    {
      super(localObserver);
      this.mOwner = paramObserver;
    }
    
    void detachObserver()
    {
      this.mOwner.getLifecycle().removeObserver(this);
    }
    
    boolean isAttachedTo(LifecycleOwner paramLifecycleOwner)
    {
      boolean bool;
      if (this.mOwner == paramLifecycleOwner) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public void onStateChanged(LifecycleOwner paramLifecycleOwner, Lifecycle.Event paramEvent)
    {
      if (this.mOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED)
      {
        LiveData.this.removeObserver(this.mObserver);
        return;
      }
      activeStateChanged(shouldBeActive());
    }
    
    boolean shouldBeActive()
    {
      return this.mOwner.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED);
    }
  }
  
  private abstract class ObserverWrapper
  {
    boolean mActive;
    int mLastVersion = -1;
    final Observer<? super T> mObserver;
    
    ObserverWrapper()
    {
      Observer localObserver;
      this.mObserver = localObserver;
    }
    
    void activeStateChanged(boolean paramBoolean)
    {
      if (paramBoolean == this.mActive) {
        return;
      }
      this.mActive = paramBoolean;
      int i = LiveData.this.mActiveCount;
      int j = 1;
      if (i == 0) {
        i = 1;
      } else {
        i = 0;
      }
      LiveData localLiveData = LiveData.this;
      int k = localLiveData.mActiveCount;
      if (!this.mActive) {
        j = -1;
      }
      localLiveData.mActiveCount = (k + j);
      if ((i != 0) && (this.mActive)) {
        LiveData.this.onActive();
      }
      if ((LiveData.this.mActiveCount == 0) && (!this.mActive)) {
        LiveData.this.onInactive();
      }
      if (this.mActive) {
        LiveData.this.dispatchingValue(this);
      }
    }
    
    void detachObserver() {}
    
    boolean isAttachedTo(LifecycleOwner paramLifecycleOwner)
    {
      return false;
    }
    
    abstract boolean shouldBeActive();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\lifecycle\LiveData.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */