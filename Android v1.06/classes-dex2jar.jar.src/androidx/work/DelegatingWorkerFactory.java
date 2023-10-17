package androidx.work;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class DelegatingWorkerFactory
  extends WorkerFactory
{
  private static final String TAG = Logger.tagWithPrefix("DelegatingWkrFctry");
  private final List<WorkerFactory> mFactories = new CopyOnWriteArrayList();
  
  public final void addFactory(WorkerFactory paramWorkerFactory)
  {
    this.mFactories.add(paramWorkerFactory);
  }
  
  public final ListenableWorker createWorker(Context paramContext, String paramString, WorkerParameters paramWorkerParameters)
  {
    Iterator localIterator = this.mFactories.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (WorkerFactory)localIterator.next();
      try
      {
        localObject = ((WorkerFactory)localObject).createWorker(paramContext, paramString, paramWorkerParameters);
        if (localObject != null) {
          return (ListenableWorker)localObject;
        }
      }
      finally
      {
        paramString = String.format("Unable to instantiate a ListenableWorker (%s)", new Object[] { paramString });
        Logger.get().error(TAG, paramString, new Throwable[] { paramContext });
      }
    }
    return null;
  }
  
  List<WorkerFactory> getFactories()
  {
    return this.mFactories;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\DelegatingWorkerFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */