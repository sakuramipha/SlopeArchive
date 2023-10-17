package androidx.work;

import android.os.Build.VERSION;
import androidx.work.impl.model.WorkSpec;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public final class PeriodicWorkRequest
  extends WorkRequest
{
  public static final long MIN_PERIODIC_FLEX_MILLIS = 300000L;
  public static final long MIN_PERIODIC_INTERVAL_MILLIS = 900000L;
  
  PeriodicWorkRequest(Builder paramBuilder)
  {
    super(paramBuilder.mId, paramBuilder.mWorkSpec, paramBuilder.mTags);
  }
  
  public static final class Builder
    extends WorkRequest.Builder<Builder, PeriodicWorkRequest>
  {
    public Builder(Class<? extends ListenableWorker> paramClass, long paramLong, TimeUnit paramTimeUnit)
    {
      super();
      this.mWorkSpec.setPeriodic(paramTimeUnit.toMillis(paramLong));
    }
    
    public Builder(Class<? extends ListenableWorker> paramClass, long paramLong1, TimeUnit paramTimeUnit1, long paramLong2, TimeUnit paramTimeUnit2)
    {
      super();
      this.mWorkSpec.setPeriodic(paramTimeUnit1.toMillis(paramLong1), paramTimeUnit2.toMillis(paramLong2));
    }
    
    public Builder(Class<? extends ListenableWorker> paramClass, Duration paramDuration)
    {
      super();
      this.mWorkSpec.setPeriodic(paramDuration.toMillis());
    }
    
    public Builder(Class<? extends ListenableWorker> paramClass, Duration paramDuration1, Duration paramDuration2)
    {
      super();
      this.mWorkSpec.setPeriodic(paramDuration1.toMillis(), paramDuration2.toMillis());
    }
    
    PeriodicWorkRequest buildInternal()
    {
      if ((this.mBackoffCriteriaSet) && (Build.VERSION.SDK_INT >= 23) && (this.mWorkSpec.constraints.requiresDeviceIdle())) {
        throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
      }
      return new PeriodicWorkRequest(this);
    }
    
    Builder getThis()
    {
      return this;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\PeriodicWorkRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */