package androidx.work;

import android.os.Build.VERSION;
import androidx.work.impl.model.WorkSpec;
import java.time.Duration;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public abstract class WorkRequest
{
  public static final long DEFAULT_BACKOFF_DELAY_MILLIS = 30000L;
  public static final long MAX_BACKOFF_MILLIS = 18000000L;
  public static final long MIN_BACKOFF_MILLIS = 10000L;
  private UUID mId;
  private Set<String> mTags;
  private WorkSpec mWorkSpec;
  
  protected WorkRequest(UUID paramUUID, WorkSpec paramWorkSpec, Set<String> paramSet)
  {
    this.mId = paramUUID;
    this.mWorkSpec = paramWorkSpec;
    this.mTags = paramSet;
  }
  
  public UUID getId()
  {
    return this.mId;
  }
  
  public String getStringId()
  {
    return this.mId.toString();
  }
  
  public Set<String> getTags()
  {
    return this.mTags;
  }
  
  public WorkSpec getWorkSpec()
  {
    return this.mWorkSpec;
  }
  
  public static abstract class Builder<B extends Builder<?, ?>, W extends WorkRequest>
  {
    boolean mBackoffCriteriaSet = false;
    UUID mId = UUID.randomUUID();
    Set<String> mTags = new HashSet();
    WorkSpec mWorkSpec;
    Class<? extends ListenableWorker> mWorkerClass;
    
    Builder(Class<? extends ListenableWorker> paramClass)
    {
      this.mWorkerClass = paramClass;
      this.mWorkSpec = new WorkSpec(this.mId.toString(), paramClass.getName());
      addTag(paramClass.getName());
    }
    
    public final B addTag(String paramString)
    {
      this.mTags.add(paramString);
      return getThis();
    }
    
    public final W build()
    {
      WorkRequest localWorkRequest = buildInternal();
      Object localObject = this.mWorkSpec.constraints;
      int i;
      if (((Build.VERSION.SDK_INT < 24) || (!((Constraints)localObject).hasContentUriTriggers())) && (!((Constraints)localObject).requiresBatteryNotLow()) && (!((Constraints)localObject).requiresCharging()) && ((Build.VERSION.SDK_INT < 23) || (!((Constraints)localObject).requiresDeviceIdle()))) {
        i = 0;
      } else {
        i = 1;
      }
      if ((this.mWorkSpec.expedited) && (i != 0)) {
        throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
      }
      this.mId = UUID.randomUUID();
      localObject = new WorkSpec(this.mWorkSpec);
      this.mWorkSpec = ((WorkSpec)localObject);
      ((WorkSpec)localObject).id = this.mId.toString();
      return localWorkRequest;
    }
    
    abstract W buildInternal();
    
    abstract B getThis();
    
    public final B keepResultsForAtLeast(long paramLong, TimeUnit paramTimeUnit)
    {
      this.mWorkSpec.minimumRetentionDuration = paramTimeUnit.toMillis(paramLong);
      return getThis();
    }
    
    public final B keepResultsForAtLeast(Duration paramDuration)
    {
      this.mWorkSpec.minimumRetentionDuration = paramDuration.toMillis();
      return getThis();
    }
    
    public final B setBackoffCriteria(BackoffPolicy paramBackoffPolicy, long paramLong, TimeUnit paramTimeUnit)
    {
      this.mBackoffCriteriaSet = true;
      this.mWorkSpec.backoffPolicy = paramBackoffPolicy;
      this.mWorkSpec.setBackoffDelayDuration(paramTimeUnit.toMillis(paramLong));
      return getThis();
    }
    
    public final B setBackoffCriteria(BackoffPolicy paramBackoffPolicy, Duration paramDuration)
    {
      this.mBackoffCriteriaSet = true;
      this.mWorkSpec.backoffPolicy = paramBackoffPolicy;
      this.mWorkSpec.setBackoffDelayDuration(paramDuration.toMillis());
      return getThis();
    }
    
    public final B setConstraints(Constraints paramConstraints)
    {
      this.mWorkSpec.constraints = paramConstraints;
      return getThis();
    }
    
    public B setExpedited(OutOfQuotaPolicy paramOutOfQuotaPolicy)
    {
      this.mWorkSpec.expedited = true;
      this.mWorkSpec.outOfQuotaPolicy = paramOutOfQuotaPolicy;
      return getThis();
    }
    
    public B setInitialDelay(long paramLong, TimeUnit paramTimeUnit)
    {
      this.mWorkSpec.initialDelay = paramTimeUnit.toMillis(paramLong);
      if (Long.MAX_VALUE - System.currentTimeMillis() > this.mWorkSpec.initialDelay) {
        return getThis();
      }
      throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
    }
    
    public B setInitialDelay(Duration paramDuration)
    {
      this.mWorkSpec.initialDelay = paramDuration.toMillis();
      if (Long.MAX_VALUE - System.currentTimeMillis() > this.mWorkSpec.initialDelay) {
        return getThis();
      }
      throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
    }
    
    public final B setInitialRunAttemptCount(int paramInt)
    {
      this.mWorkSpec.runAttemptCount = paramInt;
      return getThis();
    }
    
    public final B setInitialState(WorkInfo.State paramState)
    {
      this.mWorkSpec.state = paramState;
      return getThis();
    }
    
    public final B setInputData(Data paramData)
    {
      this.mWorkSpec.input = paramData;
      return getThis();
    }
    
    public final B setPeriodStartTime(long paramLong, TimeUnit paramTimeUnit)
    {
      this.mWorkSpec.periodStartTime = paramTimeUnit.toMillis(paramLong);
      return getThis();
    }
    
    public final B setScheduleRequestedAt(long paramLong, TimeUnit paramTimeUnit)
    {
      this.mWorkSpec.scheduleRequestedAt = paramTimeUnit.toMillis(paramLong);
      return getThis();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\WorkRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */