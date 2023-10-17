package androidx.work;

import android.os.Build.VERSION;
import androidx.work.impl.DefaultRunnableScheduler;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class Configuration
{
  public static final int MIN_SCHEDULER_LIMIT = 20;
  final String mDefaultProcessName;
  final InitializationExceptionHandler mExceptionHandler;
  final Executor mExecutor;
  final InputMergerFactory mInputMergerFactory;
  private final boolean mIsUsingDefaultTaskExecutor;
  final int mLoggingLevel;
  final int mMaxJobSchedulerId;
  final int mMaxSchedulerLimit;
  final int mMinJobSchedulerId;
  final RunnableScheduler mRunnableScheduler;
  final Executor mTaskExecutor;
  final WorkerFactory mWorkerFactory;
  
  Configuration(Builder paramBuilder)
  {
    if (paramBuilder.mExecutor == null) {
      this.mExecutor = createDefaultExecutor(false);
    } else {
      this.mExecutor = paramBuilder.mExecutor;
    }
    if (paramBuilder.mTaskExecutor == null)
    {
      this.mIsUsingDefaultTaskExecutor = true;
      this.mTaskExecutor = createDefaultExecutor(true);
    }
    else
    {
      this.mIsUsingDefaultTaskExecutor = false;
      this.mTaskExecutor = paramBuilder.mTaskExecutor;
    }
    if (paramBuilder.mWorkerFactory == null) {
      this.mWorkerFactory = WorkerFactory.getDefaultWorkerFactory();
    } else {
      this.mWorkerFactory = paramBuilder.mWorkerFactory;
    }
    if (paramBuilder.mInputMergerFactory == null) {
      this.mInputMergerFactory = InputMergerFactory.getDefaultInputMergerFactory();
    } else {
      this.mInputMergerFactory = paramBuilder.mInputMergerFactory;
    }
    if (paramBuilder.mRunnableScheduler == null) {
      this.mRunnableScheduler = new DefaultRunnableScheduler();
    } else {
      this.mRunnableScheduler = paramBuilder.mRunnableScheduler;
    }
    this.mLoggingLevel = paramBuilder.mLoggingLevel;
    this.mMinJobSchedulerId = paramBuilder.mMinJobSchedulerId;
    this.mMaxJobSchedulerId = paramBuilder.mMaxJobSchedulerId;
    this.mMaxSchedulerLimit = paramBuilder.mMaxSchedulerLimit;
    this.mExceptionHandler = paramBuilder.mExceptionHandler;
    this.mDefaultProcessName = paramBuilder.mDefaultProcessName;
  }
  
  private Executor createDefaultExecutor(boolean paramBoolean)
  {
    return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), createDefaultThreadFactory(paramBoolean));
  }
  
  private ThreadFactory createDefaultThreadFactory(final boolean paramBoolean)
  {
    new ThreadFactory()
    {
      private final AtomicInteger mThreadCount = new AtomicInteger(0);
      
      public Thread newThread(Runnable paramAnonymousRunnable)
      {
        String str;
        if (paramBoolean) {
          str = "WM.task-";
        } else {
          str = "androidx.work-";
        }
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(str);
        localStringBuilder.append(this.mThreadCount.incrementAndGet());
        return new Thread(paramAnonymousRunnable, localStringBuilder.toString());
      }
    };
  }
  
  public String getDefaultProcessName()
  {
    return this.mDefaultProcessName;
  }
  
  public InitializationExceptionHandler getExceptionHandler()
  {
    return this.mExceptionHandler;
  }
  
  public Executor getExecutor()
  {
    return this.mExecutor;
  }
  
  public InputMergerFactory getInputMergerFactory()
  {
    return this.mInputMergerFactory;
  }
  
  public int getMaxJobSchedulerId()
  {
    return this.mMaxJobSchedulerId;
  }
  
  public int getMaxSchedulerLimit()
  {
    if (Build.VERSION.SDK_INT == 23) {
      return this.mMaxSchedulerLimit / 2;
    }
    return this.mMaxSchedulerLimit;
  }
  
  public int getMinJobSchedulerId()
  {
    return this.mMinJobSchedulerId;
  }
  
  public int getMinimumLoggingLevel()
  {
    return this.mLoggingLevel;
  }
  
  public RunnableScheduler getRunnableScheduler()
  {
    return this.mRunnableScheduler;
  }
  
  public Executor getTaskExecutor()
  {
    return this.mTaskExecutor;
  }
  
  public WorkerFactory getWorkerFactory()
  {
    return this.mWorkerFactory;
  }
  
  public boolean isUsingDefaultTaskExecutor()
  {
    return this.mIsUsingDefaultTaskExecutor;
  }
  
  public static final class Builder
  {
    String mDefaultProcessName;
    InitializationExceptionHandler mExceptionHandler;
    Executor mExecutor;
    InputMergerFactory mInputMergerFactory;
    int mLoggingLevel;
    int mMaxJobSchedulerId;
    int mMaxSchedulerLimit;
    int mMinJobSchedulerId;
    RunnableScheduler mRunnableScheduler;
    Executor mTaskExecutor;
    WorkerFactory mWorkerFactory;
    
    public Builder()
    {
      this.mLoggingLevel = 4;
      this.mMinJobSchedulerId = 0;
      this.mMaxJobSchedulerId = Integer.MAX_VALUE;
      this.mMaxSchedulerLimit = 20;
    }
    
    public Builder(Configuration paramConfiguration)
    {
      this.mExecutor = paramConfiguration.mExecutor;
      this.mWorkerFactory = paramConfiguration.mWorkerFactory;
      this.mInputMergerFactory = paramConfiguration.mInputMergerFactory;
      this.mTaskExecutor = paramConfiguration.mTaskExecutor;
      this.mLoggingLevel = paramConfiguration.mLoggingLevel;
      this.mMinJobSchedulerId = paramConfiguration.mMinJobSchedulerId;
      this.mMaxJobSchedulerId = paramConfiguration.mMaxJobSchedulerId;
      this.mMaxSchedulerLimit = paramConfiguration.mMaxSchedulerLimit;
      this.mRunnableScheduler = paramConfiguration.mRunnableScheduler;
      this.mExceptionHandler = paramConfiguration.mExceptionHandler;
      this.mDefaultProcessName = paramConfiguration.mDefaultProcessName;
    }
    
    public Configuration build()
    {
      return new Configuration(this);
    }
    
    public Builder setDefaultProcessName(String paramString)
    {
      this.mDefaultProcessName = paramString;
      return this;
    }
    
    public Builder setExecutor(Executor paramExecutor)
    {
      this.mExecutor = paramExecutor;
      return this;
    }
    
    public Builder setInitializationExceptionHandler(InitializationExceptionHandler paramInitializationExceptionHandler)
    {
      this.mExceptionHandler = paramInitializationExceptionHandler;
      return this;
    }
    
    public Builder setInputMergerFactory(InputMergerFactory paramInputMergerFactory)
    {
      this.mInputMergerFactory = paramInputMergerFactory;
      return this;
    }
    
    public Builder setJobSchedulerJobIdRange(int paramInt1, int paramInt2)
    {
      if (paramInt2 - paramInt1 >= 1000)
      {
        this.mMinJobSchedulerId = paramInt1;
        this.mMaxJobSchedulerId = paramInt2;
        return this;
      }
      throw new IllegalArgumentException("WorkManager needs a range of at least 1000 job ids.");
    }
    
    public Builder setMaxSchedulerLimit(int paramInt)
    {
      if (paramInt >= 20)
      {
        this.mMaxSchedulerLimit = Math.min(paramInt, 50);
        return this;
      }
      throw new IllegalArgumentException("WorkManager needs to be able to schedule at least 20 jobs in JobScheduler.");
    }
    
    public Builder setMinimumLoggingLevel(int paramInt)
    {
      this.mLoggingLevel = paramInt;
      return this;
    }
    
    public Builder setRunnableScheduler(RunnableScheduler paramRunnableScheduler)
    {
      this.mRunnableScheduler = paramRunnableScheduler;
      return this;
    }
    
    public Builder setTaskExecutor(Executor paramExecutor)
    {
      this.mTaskExecutor = paramExecutor;
      return this;
    }
    
    public Builder setWorkerFactory(WorkerFactory paramWorkerFactory)
    {
      this.mWorkerFactory = paramWorkerFactory;
      return this;
    }
  }
  
  public static abstract interface Provider
  {
    public abstract Configuration getWorkManagerConfiguration();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\Configuration.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */