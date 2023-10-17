package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.ListenableWorker.Result;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class CombineContinuationsWorker
  extends Worker
{
  public CombineContinuationsWorker(Context paramContext, WorkerParameters paramWorkerParameters)
  {
    super(paramContext, paramWorkerParameters);
  }
  
  public ListenableWorker.Result doWork()
  {
    return ListenableWorker.Result.success(getInputData());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\impl\workers\CombineContinuationsWorker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */