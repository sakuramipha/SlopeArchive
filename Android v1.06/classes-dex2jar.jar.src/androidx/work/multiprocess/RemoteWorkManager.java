package androidx.work.multiprocess;

import android.content.Context;
import androidx.work.Data;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ExistingWorkPolicy;
import androidx.work.OneTimeWorkRequest;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkContinuation;
import androidx.work.WorkInfo;
import androidx.work.WorkQuery;
import androidx.work.WorkRequest;
import androidx.work.impl.WorkManagerImpl;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public abstract class RemoteWorkManager
{
  public static RemoteWorkManager getInstance(Context paramContext)
  {
    paramContext = WorkManagerImpl.getInstance(paramContext).getRemoteWorkManager();
    if (paramContext != null) {
      return paramContext;
    }
    throw new IllegalStateException("Unable to initialize RemoteWorkManager");
  }
  
  public final RemoteWorkContinuation beginUniqueWork(String paramString, ExistingWorkPolicy paramExistingWorkPolicy, OneTimeWorkRequest paramOneTimeWorkRequest)
  {
    return beginUniqueWork(paramString, paramExistingWorkPolicy, Collections.singletonList(paramOneTimeWorkRequest));
  }
  
  public abstract RemoteWorkContinuation beginUniqueWork(String paramString, ExistingWorkPolicy paramExistingWorkPolicy, List<OneTimeWorkRequest> paramList);
  
  public final RemoteWorkContinuation beginWith(OneTimeWorkRequest paramOneTimeWorkRequest)
  {
    return beginWith(Collections.singletonList(paramOneTimeWorkRequest));
  }
  
  public abstract RemoteWorkContinuation beginWith(List<OneTimeWorkRequest> paramList);
  
  public abstract ListenableFuture<Void> cancelAllWork();
  
  public abstract ListenableFuture<Void> cancelAllWorkByTag(String paramString);
  
  public abstract ListenableFuture<Void> cancelUniqueWork(String paramString);
  
  public abstract ListenableFuture<Void> cancelWorkById(UUID paramUUID);
  
  public abstract ListenableFuture<Void> enqueue(WorkContinuation paramWorkContinuation);
  
  public abstract ListenableFuture<Void> enqueue(WorkRequest paramWorkRequest);
  
  public abstract ListenableFuture<Void> enqueue(List<WorkRequest> paramList);
  
  public abstract ListenableFuture<Void> enqueueUniquePeriodicWork(String paramString, ExistingPeriodicWorkPolicy paramExistingPeriodicWorkPolicy, PeriodicWorkRequest paramPeriodicWorkRequest);
  
  public final ListenableFuture<Void> enqueueUniqueWork(String paramString, ExistingWorkPolicy paramExistingWorkPolicy, OneTimeWorkRequest paramOneTimeWorkRequest)
  {
    return enqueueUniqueWork(paramString, paramExistingWorkPolicy, Collections.singletonList(paramOneTimeWorkRequest));
  }
  
  public abstract ListenableFuture<Void> enqueueUniqueWork(String paramString, ExistingWorkPolicy paramExistingWorkPolicy, List<OneTimeWorkRequest> paramList);
  
  public abstract ListenableFuture<List<WorkInfo>> getWorkInfos(WorkQuery paramWorkQuery);
  
  public abstract ListenableFuture<Void> setProgress(UUID paramUUID, Data paramData);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\multiprocess\RemoteWorkManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */