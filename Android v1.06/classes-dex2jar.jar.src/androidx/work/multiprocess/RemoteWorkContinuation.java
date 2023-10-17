package androidx.work.multiprocess;

import androidx.work.OneTimeWorkRequest;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;

public abstract class RemoteWorkContinuation
{
  public static RemoteWorkContinuation combine(List<RemoteWorkContinuation> paramList)
  {
    return ((RemoteWorkContinuation)paramList.get(0)).combineInternal(paramList);
  }
  
  protected abstract RemoteWorkContinuation combineInternal(List<RemoteWorkContinuation> paramList);
  
  public abstract ListenableFuture<Void> enqueue();
  
  public final RemoteWorkContinuation then(OneTimeWorkRequest paramOneTimeWorkRequest)
  {
    return then(Collections.singletonList(paramOneTimeWorkRequest));
  }
  
  public abstract RemoteWorkContinuation then(List<OneTimeWorkRequest> paramList);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\multiprocess\RemoteWorkContinuation.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */