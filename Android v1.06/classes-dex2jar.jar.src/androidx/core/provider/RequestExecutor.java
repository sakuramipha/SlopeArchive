package androidx.core.provider;

import android.os.Handler;
import android.os.Process;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

class RequestExecutor
{
  static ThreadPoolExecutor createDefaultExecutor(String paramString, int paramInt1, int paramInt2)
  {
    paramString = new DefaultThreadFactory(paramString, paramInt1);
    paramString = new ThreadPoolExecutor(0, 1, paramInt2, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), paramString);
    paramString.allowCoreThreadTimeOut(true);
    return paramString;
  }
  
  static Executor createHandlerExecutor(Handler paramHandler)
  {
    return new HandlerExecutor(paramHandler);
  }
  
  static <T> void execute(Executor paramExecutor, Callable<T> paramCallable, Consumer<T> paramConsumer)
  {
    paramExecutor.execute(new ReplyRunnable(CalleeHandler.create(), paramCallable, paramConsumer));
  }
  
  static <T> T submit(ExecutorService paramExecutorService, Callable<T> paramCallable, int paramInt)
    throws InterruptedException
  {
    paramExecutorService = paramExecutorService.submit(paramCallable);
    long l = paramInt;
    try
    {
      paramExecutorService = paramExecutorService.get(l, TimeUnit.MILLISECONDS);
      return paramExecutorService;
    }
    catch (TimeoutException paramExecutorService)
    {
      throw new InterruptedException("timeout");
    }
    catch (InterruptedException paramExecutorService)
    {
      throw paramExecutorService;
    }
    catch (ExecutionException paramExecutorService)
    {
      throw new RuntimeException(paramExecutorService);
    }
  }
  
  private static class DefaultThreadFactory
    implements ThreadFactory
  {
    private int mPriority;
    private String mThreadName;
    
    DefaultThreadFactory(String paramString, int paramInt)
    {
      this.mThreadName = paramString;
      this.mPriority = paramInt;
    }
    
    public Thread newThread(Runnable paramRunnable)
    {
      return new ProcessPriorityThread(paramRunnable, this.mThreadName, this.mPriority);
    }
    
    private static class ProcessPriorityThread
      extends Thread
    {
      private final int mPriority;
      
      ProcessPriorityThread(Runnable paramRunnable, String paramString, int paramInt)
      {
        super(paramString);
        this.mPriority = paramInt;
      }
      
      public void run()
      {
        Process.setThreadPriority(this.mPriority);
        super.run();
      }
    }
  }
  
  private static class HandlerExecutor
    implements Executor
  {
    private final Handler mHandler;
    
    HandlerExecutor(Handler paramHandler)
    {
      this.mHandler = ((Handler)Preconditions.checkNotNull(paramHandler));
    }
    
    public void execute(Runnable paramRunnable)
    {
      if (this.mHandler.post((Runnable)Preconditions.checkNotNull(paramRunnable))) {
        return;
      }
      paramRunnable = new StringBuilder();
      paramRunnable.append(this.mHandler);
      paramRunnable.append(" is shutting down");
      throw new RejectedExecutionException(paramRunnable.toString());
    }
  }
  
  private static class ReplyRunnable<T>
    implements Runnable
  {
    private Callable<T> mCallable;
    private Consumer<T> mConsumer;
    private Handler mHandler;
    
    ReplyRunnable(Handler paramHandler, Callable<T> paramCallable, Consumer<T> paramConsumer)
    {
      this.mCallable = paramCallable;
      this.mConsumer = paramConsumer;
      this.mHandler = paramHandler;
    }
    
    public void run()
    {
      final Object localObject2;
      try
      {
        Object localObject1 = this.mCallable.call();
      }
      catch (Exception localException)
      {
        localObject2 = null;
      }
      final Consumer localConsumer = this.mConsumer;
      this.mHandler.post(new Runnable()
      {
        public void run()
        {
          localConsumer.accept(localObject2);
        }
      });
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\provider\RequestExecutor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */