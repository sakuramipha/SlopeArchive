package androidx.work.impl;

import android.text.TextUtils;
import androidx.lifecycle.LiveData;
import androidx.work.ArrayCreatingInputMerger;
import androidx.work.ExistingWorkPolicy;
import androidx.work.Logger;
import androidx.work.OneTimeWorkRequest;
import androidx.work.OneTimeWorkRequest.Builder;
import androidx.work.Operation;
import androidx.work.WorkContinuation;
import androidx.work.WorkInfo;
import androidx.work.WorkRequest;
import androidx.work.impl.utils.EnqueueRunnable;
import androidx.work.impl.utils.StatusRunnable;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import androidx.work.impl.workers.CombineContinuationsWorker;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class WorkContinuationImpl
  extends WorkContinuation
{
  private static final String TAG = Logger.tagWithPrefix("WorkContinuationImpl");
  private final List<String> mAllIds;
  private boolean mEnqueued;
  private final ExistingWorkPolicy mExistingWorkPolicy;
  private final List<String> mIds;
  private final String mName;
  private Operation mOperation;
  private final List<WorkContinuationImpl> mParents;
  private final List<? extends WorkRequest> mWork;
  private final WorkManagerImpl mWorkManagerImpl;
  
  public WorkContinuationImpl(WorkManagerImpl paramWorkManagerImpl, String paramString, ExistingWorkPolicy paramExistingWorkPolicy, List<? extends WorkRequest> paramList)
  {
    this(paramWorkManagerImpl, paramString, paramExistingWorkPolicy, paramList, null);
  }
  
  public WorkContinuationImpl(WorkManagerImpl paramWorkManagerImpl, String paramString, ExistingWorkPolicy paramExistingWorkPolicy, List<? extends WorkRequest> paramList, List<WorkContinuationImpl> paramList1)
  {
    this.mWorkManagerImpl = paramWorkManagerImpl;
    this.mName = paramString;
    this.mExistingWorkPolicy = paramExistingWorkPolicy;
    this.mWork = paramList;
    this.mParents = paramList1;
    this.mIds = new ArrayList(paramList.size());
    this.mAllIds = new ArrayList();
    if (paramList1 != null)
    {
      paramString = paramList1.iterator();
      while (paramString.hasNext())
      {
        paramWorkManagerImpl = (WorkContinuationImpl)paramString.next();
        this.mAllIds.addAll(paramWorkManagerImpl.mAllIds);
      }
    }
    for (int i = 0; i < paramList.size(); i++)
    {
      paramWorkManagerImpl = ((WorkRequest)paramList.get(i)).getStringId();
      this.mIds.add(paramWorkManagerImpl);
      this.mAllIds.add(paramWorkManagerImpl);
    }
  }
  
  public WorkContinuationImpl(WorkManagerImpl paramWorkManagerImpl, List<? extends WorkRequest> paramList)
  {
    this(paramWorkManagerImpl, null, ExistingWorkPolicy.KEEP, paramList, null);
  }
  
  private static boolean hasCycles(WorkContinuationImpl paramWorkContinuationImpl, Set<String> paramSet)
  {
    paramSet.addAll(paramWorkContinuationImpl.getIds());
    Set localSet = prerequisitesFor(paramWorkContinuationImpl);
    Object localObject = paramSet.iterator();
    while (((Iterator)localObject).hasNext()) {
      if (localSet.contains((String)((Iterator)localObject).next())) {
        return true;
      }
    }
    localObject = paramWorkContinuationImpl.getParents();
    if ((localObject != null) && (!((List)localObject).isEmpty()))
    {
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext()) {
        if (hasCycles((WorkContinuationImpl)((Iterator)localObject).next(), paramSet)) {
          return true;
        }
      }
    }
    paramSet.removeAll(paramWorkContinuationImpl.getIds());
    return false;
  }
  
  public static Set<String> prerequisitesFor(WorkContinuationImpl paramWorkContinuationImpl)
  {
    HashSet localHashSet = new HashSet();
    paramWorkContinuationImpl = paramWorkContinuationImpl.getParents();
    if ((paramWorkContinuationImpl != null) && (!paramWorkContinuationImpl.isEmpty()))
    {
      paramWorkContinuationImpl = paramWorkContinuationImpl.iterator();
      while (paramWorkContinuationImpl.hasNext()) {
        localHashSet.addAll(((WorkContinuationImpl)paramWorkContinuationImpl.next()).getIds());
      }
    }
    return localHashSet;
  }
  
  protected WorkContinuation combineInternal(List<WorkContinuation> paramList)
  {
    OneTimeWorkRequest localOneTimeWorkRequest = (OneTimeWorkRequest)new OneTimeWorkRequest.Builder(CombineContinuationsWorker.class).setInputMerger(ArrayCreatingInputMerger.class).build();
    ArrayList localArrayList = new ArrayList(paramList.size());
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      localArrayList.add((WorkContinuationImpl)paramList.next());
    }
    return new WorkContinuationImpl(this.mWorkManagerImpl, null, ExistingWorkPolicy.KEEP, Collections.singletonList(localOneTimeWorkRequest), localArrayList);
  }
  
  public Operation enqueue()
  {
    if (!this.mEnqueued)
    {
      EnqueueRunnable localEnqueueRunnable = new EnqueueRunnable(this);
      this.mWorkManagerImpl.getWorkTaskExecutor().executeOnBackgroundThread(localEnqueueRunnable);
      this.mOperation = localEnqueueRunnable.getOperation();
    }
    else
    {
      Logger.get().warning(TAG, String.format("Already enqueued work ids (%s)", new Object[] { TextUtils.join(", ", this.mIds) }), new Throwable[0]);
    }
    return this.mOperation;
  }
  
  public List<String> getAllIds()
  {
    return this.mAllIds;
  }
  
  public ExistingWorkPolicy getExistingWorkPolicy()
  {
    return this.mExistingWorkPolicy;
  }
  
  public List<String> getIds()
  {
    return this.mIds;
  }
  
  public String getName()
  {
    return this.mName;
  }
  
  public List<WorkContinuationImpl> getParents()
  {
    return this.mParents;
  }
  
  public List<? extends WorkRequest> getWork()
  {
    return this.mWork;
  }
  
  public ListenableFuture<List<WorkInfo>> getWorkInfos()
  {
    StatusRunnable localStatusRunnable = StatusRunnable.forStringIds(this.mWorkManagerImpl, this.mAllIds);
    this.mWorkManagerImpl.getWorkTaskExecutor().executeOnBackgroundThread(localStatusRunnable);
    return localStatusRunnable.getFuture();
  }
  
  public LiveData<List<WorkInfo>> getWorkInfosLiveData()
  {
    return this.mWorkManagerImpl.getWorkInfosById(this.mAllIds);
  }
  
  public WorkManagerImpl getWorkManagerImpl()
  {
    return this.mWorkManagerImpl;
  }
  
  public boolean hasCycles()
  {
    return hasCycles(this, new HashSet());
  }
  
  public boolean isEnqueued()
  {
    return this.mEnqueued;
  }
  
  public void markEnqueued()
  {
    this.mEnqueued = true;
  }
  
  public WorkContinuation then(List<OneTimeWorkRequest> paramList)
  {
    if (paramList.isEmpty()) {
      return this;
    }
    return new WorkContinuationImpl(this.mWorkManagerImpl, this.mName, ExistingWorkPolicy.KEEP, paramList, Collections.singletonList(this));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\impl\WorkContinuationImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */