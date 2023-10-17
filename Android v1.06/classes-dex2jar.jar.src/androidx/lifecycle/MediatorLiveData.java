package androidx.lifecycle;

import androidx.arch.core.internal.SafeIterableMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class MediatorLiveData<T>
  extends MutableLiveData<T>
{
  private SafeIterableMap<LiveData<?>, Source<?>> mSources = new SafeIterableMap();
  
  public <S> void addSource(LiveData<S> paramLiveData, Observer<? super S> paramObserver)
  {
    Source localSource = new Source(paramLiveData, paramObserver);
    paramLiveData = (Source)this.mSources.putIfAbsent(paramLiveData, localSource);
    if ((paramLiveData != null) && (paramLiveData.mObserver != paramObserver)) {
      throw new IllegalArgumentException("This source was already added with the different observer");
    }
    if (paramLiveData != null) {
      return;
    }
    if (hasActiveObservers()) {
      localSource.plug();
    }
  }
  
  protected void onActive()
  {
    Iterator localIterator = this.mSources.iterator();
    while (localIterator.hasNext()) {
      ((Source)((Map.Entry)localIterator.next()).getValue()).plug();
    }
  }
  
  protected void onInactive()
  {
    Iterator localIterator = this.mSources.iterator();
    while (localIterator.hasNext()) {
      ((Source)((Map.Entry)localIterator.next()).getValue()).unplug();
    }
  }
  
  public <S> void removeSource(LiveData<S> paramLiveData)
  {
    paramLiveData = (Source)this.mSources.remove(paramLiveData);
    if (paramLiveData != null) {
      paramLiveData.unplug();
    }
  }
  
  private static class Source<V>
    implements Observer<V>
  {
    final LiveData<V> mLiveData;
    final Observer<? super V> mObserver;
    int mVersion = -1;
    
    Source(LiveData<V> paramLiveData, Observer<? super V> paramObserver)
    {
      this.mLiveData = paramLiveData;
      this.mObserver = paramObserver;
    }
    
    public void onChanged(V paramV)
    {
      if (this.mVersion != this.mLiveData.getVersion())
      {
        this.mVersion = this.mLiveData.getVersion();
        this.mObserver.onChanged(paramV);
      }
    }
    
    void plug()
    {
      this.mLiveData.observeForever(this);
    }
    
    void unplug()
    {
      this.mLiveData.removeObserver(this);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\lifecycle\MediatorLiveData.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */