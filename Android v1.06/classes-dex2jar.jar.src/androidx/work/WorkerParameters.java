package androidx.work;

import android.net.Network;
import android.net.Uri;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

public final class WorkerParameters
{
  private Executor mBackgroundExecutor;
  private ForegroundUpdater mForegroundUpdater;
  private UUID mId;
  private Data mInputData;
  private ProgressUpdater mProgressUpdater;
  private int mRunAttemptCount;
  private RuntimeExtras mRuntimeExtras;
  private Set<String> mTags;
  private TaskExecutor mWorkTaskExecutor;
  private WorkerFactory mWorkerFactory;
  
  public WorkerParameters(UUID paramUUID, Data paramData, Collection<String> paramCollection, RuntimeExtras paramRuntimeExtras, int paramInt, Executor paramExecutor, TaskExecutor paramTaskExecutor, WorkerFactory paramWorkerFactory, ProgressUpdater paramProgressUpdater, ForegroundUpdater paramForegroundUpdater)
  {
    this.mId = paramUUID;
    this.mInputData = paramData;
    this.mTags = new HashSet(paramCollection);
    this.mRuntimeExtras = paramRuntimeExtras;
    this.mRunAttemptCount = paramInt;
    this.mBackgroundExecutor = paramExecutor;
    this.mWorkTaskExecutor = paramTaskExecutor;
    this.mWorkerFactory = paramWorkerFactory;
    this.mProgressUpdater = paramProgressUpdater;
    this.mForegroundUpdater = paramForegroundUpdater;
  }
  
  public Executor getBackgroundExecutor()
  {
    return this.mBackgroundExecutor;
  }
  
  public ForegroundUpdater getForegroundUpdater()
  {
    return this.mForegroundUpdater;
  }
  
  public UUID getId()
  {
    return this.mId;
  }
  
  public Data getInputData()
  {
    return this.mInputData;
  }
  
  public Network getNetwork()
  {
    return this.mRuntimeExtras.network;
  }
  
  public ProgressUpdater getProgressUpdater()
  {
    return this.mProgressUpdater;
  }
  
  public int getRunAttemptCount()
  {
    return this.mRunAttemptCount;
  }
  
  public RuntimeExtras getRuntimeExtras()
  {
    return this.mRuntimeExtras;
  }
  
  public Set<String> getTags()
  {
    return this.mTags;
  }
  
  public TaskExecutor getTaskExecutor()
  {
    return this.mWorkTaskExecutor;
  }
  
  public List<String> getTriggeredContentAuthorities()
  {
    return this.mRuntimeExtras.triggeredContentAuthorities;
  }
  
  public List<Uri> getTriggeredContentUris()
  {
    return this.mRuntimeExtras.triggeredContentUris;
  }
  
  public WorkerFactory getWorkerFactory()
  {
    return this.mWorkerFactory;
  }
  
  public static class RuntimeExtras
  {
    public Network network;
    public List<String> triggeredContentAuthorities = Collections.emptyList();
    public List<Uri> triggeredContentUris = Collections.emptyList();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\WorkerParameters.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */