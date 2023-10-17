package androidx.work.impl.utils;

import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;

public class LiveDataUtils
{
  public static <In, Out> LiveData<Out> dedupedMappedLiveDataFor(LiveData<In> paramLiveData, final Function<In, Out> paramFunction, TaskExecutor paramTaskExecutor)
  {
    final Object localObject = new Object();
    final MediatorLiveData localMediatorLiveData = new MediatorLiveData();
    localMediatorLiveData.addSource(paramLiveData, new Observer()
    {
      Out mCurrentOutput = null;
      
      public void onChanged(final In paramAnonymousIn)
      {
        LiveDataUtils.this.executeOnBackgroundThread(new Runnable()
        {
          public void run()
          {
            synchronized (LiveDataUtils.1.this.val$lock)
            {
              Object localObject2 = LiveDataUtils.1.this.val$mappingMethod.apply(paramAnonymousIn);
              if ((LiveDataUtils.1.this.mCurrentOutput == null) && (localObject2 != null))
              {
                LiveDataUtils.1.this.mCurrentOutput = localObject2;
                LiveDataUtils.1.this.val$outputLiveData.postValue(localObject2);
              }
              else if ((LiveDataUtils.1.this.mCurrentOutput != null) && (!LiveDataUtils.1.this.mCurrentOutput.equals(localObject2)))
              {
                LiveDataUtils.1.this.mCurrentOutput = localObject2;
                LiveDataUtils.1.this.val$outputLiveData.postValue(localObject2);
              }
              return;
            }
          }
        });
      }
    });
    return localMediatorLiveData;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\imp\\utils\LiveDataUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */