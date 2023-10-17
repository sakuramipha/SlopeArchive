package androidx.concurrent.futures;

import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class CallbackToFutureAdapter
{
  public static <T> ListenableFuture<T> getFuture(Resolver<T> paramResolver)
  {
    Completer localCompleter = new Completer();
    SafeFuture localSafeFuture = new SafeFuture(localCompleter);
    localCompleter.future = localSafeFuture;
    localCompleter.tag = paramResolver.getClass();
    try
    {
      paramResolver = paramResolver.attachCompleter(localCompleter);
      if (paramResolver != null) {
        localCompleter.tag = paramResolver;
      }
    }
    catch (Exception paramResolver)
    {
      localSafeFuture.setException(paramResolver);
    }
    return localSafeFuture;
  }
  
  public static final class Completer<T>
  {
    private boolean attemptedSetting;
    private ResolvableFuture<Void> cancellationFuture = ResolvableFuture.create();
    CallbackToFutureAdapter.SafeFuture<T> future;
    Object tag;
    
    private void setCompletedNormally()
    {
      this.tag = null;
      this.future = null;
      this.cancellationFuture = null;
    }
    
    public void addCancellationListener(Runnable paramRunnable, Executor paramExecutor)
    {
      ResolvableFuture localResolvableFuture = this.cancellationFuture;
      if (localResolvableFuture != null) {
        localResolvableFuture.addListener(paramRunnable, paramExecutor);
      }
    }
    
    protected void finalize()
    {
      CallbackToFutureAdapter.SafeFuture localSafeFuture = this.future;
      Object localObject;
      if ((localSafeFuture != null) && (!localSafeFuture.isDone()))
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("The completer object was garbage collected - this future would otherwise never complete. The tag was: ");
        ((StringBuilder)localObject).append(this.tag);
        localSafeFuture.setException(new CallbackToFutureAdapter.FutureGarbageCollectedException(((StringBuilder)localObject).toString()));
      }
      if (!this.attemptedSetting)
      {
        localObject = this.cancellationFuture;
        if (localObject != null) {
          ((ResolvableFuture)localObject).set(null);
        }
      }
    }
    
    void fireCancellationListeners()
    {
      this.tag = null;
      this.future = null;
      this.cancellationFuture.set(null);
    }
    
    public boolean set(T paramT)
    {
      boolean bool = true;
      this.attemptedSetting = true;
      CallbackToFutureAdapter.SafeFuture localSafeFuture = this.future;
      if ((localSafeFuture == null) || (!localSafeFuture.set(paramT))) {
        bool = false;
      }
      if (bool) {
        setCompletedNormally();
      }
      return bool;
    }
    
    public boolean setCancelled()
    {
      boolean bool = true;
      this.attemptedSetting = true;
      CallbackToFutureAdapter.SafeFuture localSafeFuture = this.future;
      if ((localSafeFuture == null) || (!localSafeFuture.cancelWithoutNotifyingCompleter(true))) {
        bool = false;
      }
      if (bool) {
        setCompletedNormally();
      }
      return bool;
    }
    
    public boolean setException(Throwable paramThrowable)
    {
      boolean bool = true;
      this.attemptedSetting = true;
      CallbackToFutureAdapter.SafeFuture localSafeFuture = this.future;
      if ((localSafeFuture == null) || (!localSafeFuture.setException(paramThrowable))) {
        bool = false;
      }
      if (bool) {
        setCompletedNormally();
      }
      return bool;
    }
  }
  
  static final class FutureGarbageCollectedException
    extends Throwable
  {
    FutureGarbageCollectedException(String paramString)
    {
      super();
    }
    
    public Throwable fillInStackTrace()
    {
      return this;
    }
  }
  
  public static abstract interface Resolver<T>
  {
    public abstract Object attachCompleter(CallbackToFutureAdapter.Completer<T> paramCompleter)
      throws Exception;
  }
  
  private static final class SafeFuture<T>
    implements ListenableFuture<T>
  {
    final WeakReference<CallbackToFutureAdapter.Completer<T>> completerWeakReference;
    private final AbstractResolvableFuture<T> delegate = new AbstractResolvableFuture()
    {
      protected String pendingToString()
      {
        CallbackToFutureAdapter.Completer localCompleter = (CallbackToFutureAdapter.Completer)CallbackToFutureAdapter.SafeFuture.this.completerWeakReference.get();
        if (localCompleter == null) {
          return "Completer object has been garbage collected, future will fail soon";
        }
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("tag=[");
        localStringBuilder.append(localCompleter.tag);
        localStringBuilder.append("]");
        return localStringBuilder.toString();
      }
    };
    
    SafeFuture(CallbackToFutureAdapter.Completer<T> paramCompleter)
    {
      this.completerWeakReference = new WeakReference(paramCompleter);
    }
    
    public void addListener(Runnable paramRunnable, Executor paramExecutor)
    {
      this.delegate.addListener(paramRunnable, paramExecutor);
    }
    
    public boolean cancel(boolean paramBoolean)
    {
      CallbackToFutureAdapter.Completer localCompleter = (CallbackToFutureAdapter.Completer)this.completerWeakReference.get();
      paramBoolean = this.delegate.cancel(paramBoolean);
      if ((paramBoolean) && (localCompleter != null)) {
        localCompleter.fireCancellationListeners();
      }
      return paramBoolean;
    }
    
    boolean cancelWithoutNotifyingCompleter(boolean paramBoolean)
    {
      return this.delegate.cancel(paramBoolean);
    }
    
    public T get()
      throws InterruptedException, ExecutionException
    {
      return (T)this.delegate.get();
    }
    
    public T get(long paramLong, TimeUnit paramTimeUnit)
      throws InterruptedException, ExecutionException, TimeoutException
    {
      return (T)this.delegate.get(paramLong, paramTimeUnit);
    }
    
    public boolean isCancelled()
    {
      return this.delegate.isCancelled();
    }
    
    public boolean isDone()
    {
      return this.delegate.isDone();
    }
    
    boolean set(T paramT)
    {
      return this.delegate.set(paramT);
    }
    
    boolean setException(Throwable paramThrowable)
    {
      return this.delegate.setException(paramThrowable);
    }
    
    public String toString()
    {
      return this.delegate.toString();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\concurrent\futures\CallbackToFutureAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */