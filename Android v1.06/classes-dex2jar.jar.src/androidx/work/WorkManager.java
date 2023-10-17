package androidx.work;

import android.app.PendingIntent;
import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.work.impl.WorkManagerImpl;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public abstract class WorkManager
{
  @Deprecated
  public static WorkManager getInstance()
  {
    WorkManagerImpl localWorkManagerImpl = WorkManagerImpl.getInstance();
    if (localWorkManagerImpl != null) {
      return localWorkManagerImpl;
    }
    throw new IllegalStateException("WorkManager is not initialized properly.  The most likely cause is that you disabled WorkManagerInitializer in your manifest but forgot to call WorkManager#initialize in your Application#onCreate or a ContentProvider.");
  }
  
  public static WorkManager getInstance(Context paramContext)
  {
    return WorkManagerImpl.getInstance(paramContext);
  }
  
  public static void initialize(Context paramContext, Configuration paramConfiguration)
  {
    WorkManagerImpl.initialize(paramContext, paramConfiguration);
  }
  
  public final WorkContinuation beginUniqueWork(String paramString, ExistingWorkPolicy paramExistingWorkPolicy, OneTimeWorkRequest paramOneTimeWorkRequest)
  {
    return beginUniqueWork(paramString, paramExistingWorkPolicy, Collections.singletonList(paramOneTimeWorkRequest));
  }
  
  public abstract WorkContinuation beginUniqueWork(String paramString, ExistingWorkPolicy paramExistingWorkPolicy, List<OneTimeWorkRequest> paramList);
  
  public final WorkContinuation beginWith(OneTimeWorkRequest paramOneTimeWorkRequest)
  {
    return beginWith(Collections.singletonList(paramOneTimeWorkRequest));
  }
  
  public abstract WorkContinuation beginWith(List<OneTimeWorkRequest> paramList);
  
  public abstract Operation cancelAllWork();
  
  public abstract Operation cancelAllWorkByTag(String paramString);
  
  public abstract Operation cancelUniqueWork(String paramString);
  
  public abstract Operation cancelWorkById(UUID paramUUID);
  
  public abstract PendingIntent createCancelPendingIntent(UUID paramUUID);
  
  public final Operation enqueue(WorkRequest paramWorkRequest)
  {
    return enqueue(Collections.singletonList(paramWorkRequest));
  }
  
  public abstract Operation enqueue(List<? extends WorkRequest> paramList);
  
  public abstract Operation enqueueUniquePeriodicWork(String paramString, ExistingPeriodicWorkPolicy paramExistingPeriodicWorkPolicy, PeriodicWorkRequest paramPeriodicWorkRequest);
  
  public Operation enqueueUniqueWork(String paramString, ExistingWorkPolicy paramExistingWorkPolicy, OneTimeWorkRequest paramOneTimeWorkRequest)
  {
    return enqueueUniqueWork(paramString, paramExistingWorkPolicy, Collections.singletonList(paramOneTimeWorkRequest));
  }
  
  public abstract Operation enqueueUniqueWork(String paramString, ExistingWorkPolicy paramExistingWorkPolicy, List<OneTimeWorkRequest> paramList);
  
  public abstract ListenableFuture<Long> getLastCancelAllTimeMillis();
  
  public abstract LiveData<Long> getLastCancelAllTimeMillisLiveData();
  
  public abstract ListenableFuture<WorkInfo> getWorkInfoById(UUID paramUUID);
  
  public abstract LiveData<WorkInfo> getWorkInfoByIdLiveData(UUID paramUUID);
  
  public abstract ListenableFuture<List<WorkInfo>> getWorkInfos(WorkQuery paramWorkQuery);
  
  public abstract ListenableFuture<List<WorkInfo>> getWorkInfosByTag(String paramString);
  
  public abstract LiveData<List<WorkInfo>> getWorkInfosByTagLiveData(String paramString);
  
  public abstract ListenableFuture<List<WorkInfo>> getWorkInfosForUniqueWork(String paramString);
  
  public abstract LiveData<List<WorkInfo>> getWorkInfosForUniqueWorkLiveData(String paramString);
  
  public abstract LiveData<List<WorkInfo>> getWorkInfosLiveData(WorkQuery paramWorkQuery);
  
  public abstract Operation pruneWork();
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\WorkManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */