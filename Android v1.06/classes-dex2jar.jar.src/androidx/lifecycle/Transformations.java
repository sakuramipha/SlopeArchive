package androidx.lifecycle;

import androidx.arch.core.util.Function;

public class Transformations
{
  public static <X> LiveData<X> distinctUntilChanged(LiveData<X> paramLiveData)
  {
    MediatorLiveData localMediatorLiveData = new MediatorLiveData();
    localMediatorLiveData.addSource(paramLiveData, new Observer()
    {
      boolean mFirstTime = true;
      final MediatorLiveData val$outputLiveData;
      
      public void onChanged(X paramAnonymousX)
      {
        Object localObject = this.val$outputLiveData.getValue();
        if ((this.mFirstTime) || ((localObject == null) && (paramAnonymousX != null)) || ((localObject != null) && (!localObject.equals(paramAnonymousX))))
        {
          this.mFirstTime = false;
          this.val$outputLiveData.setValue(paramAnonymousX);
        }
      }
    });
    return localMediatorLiveData;
  }
  
  public static <X, Y> LiveData<Y> map(LiveData<X> paramLiveData, final Function<X, Y> paramFunction)
  {
    MediatorLiveData localMediatorLiveData = new MediatorLiveData();
    localMediatorLiveData.addSource(paramLiveData, new Observer()
    {
      final MediatorLiveData val$result;
      
      public void onChanged(X paramAnonymousX)
      {
        this.val$result.setValue(paramFunction.apply(paramAnonymousX));
      }
    });
    return localMediatorLiveData;
  }
  
  public static <X, Y> LiveData<Y> switchMap(LiveData<X> paramLiveData, Function<X, LiveData<Y>> paramFunction)
  {
    final MediatorLiveData localMediatorLiveData = new MediatorLiveData();
    localMediatorLiveData.addSource(paramLiveData, new Observer()
    {
      LiveData<Y> mSource;
      final Function val$switchMapFunction;
      
      public void onChanged(X paramAnonymousX)
      {
        LiveData localLiveData = (LiveData)this.val$switchMapFunction.apply(paramAnonymousX);
        paramAnonymousX = this.mSource;
        if (paramAnonymousX == localLiveData) {
          return;
        }
        if (paramAnonymousX != null) {
          localMediatorLiveData.removeSource(paramAnonymousX);
        }
        this.mSource = localLiveData;
        if (localLiveData != null) {
          localMediatorLiveData.addSource(localLiveData, new Observer()
          {
            public void onChanged(Y paramAnonymous2Y)
            {
              Transformations.2.this.val$result.setValue(paramAnonymous2Y);
            }
          });
        }
      }
    });
    return localMediatorLiveData;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\lifecycle\Transformations.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */