package androidx.work;

import androidx.lifecycle.LiveData;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;

public abstract class WorkContinuation
{
  public static WorkContinuation combine(List<WorkContinuation> paramList)
  {
    return ((WorkContinuation)paramList.get(0)).combineInternal(paramList);
  }
  
  protected abstract WorkContinuation combineInternal(List<WorkContinuation> paramList);
  
  public abstract Operation enqueue();
  
  public abstract ListenableFuture<List<WorkInfo>> getWorkInfos();
  
  public abstract LiveData<List<WorkInfo>> getWorkInfosLiveData();
  
  public final WorkContinuation then(OneTimeWorkRequest paramOneTimeWorkRequest)
  {
    return then(Collections.singletonList(paramOneTimeWorkRequest));
  }
  
  public abstract WorkContinuation then(List<OneTimeWorkRequest> paramList);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\WorkContinuation.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */