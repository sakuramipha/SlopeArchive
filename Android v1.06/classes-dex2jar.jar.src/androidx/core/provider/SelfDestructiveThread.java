package androidx.core.provider;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

@Deprecated
public class SelfDestructiveThread
{
  private static final int MSG_DESTRUCTION = 0;
  private static final int MSG_INVOKE_RUNNABLE = 1;
  private Handler.Callback mCallback = new Handler.Callback()
  {
    public boolean handleMessage(Message paramAnonymousMessage)
    {
      int i = paramAnonymousMessage.what;
      if (i != 0)
      {
        if (i != 1) {
          return true;
        }
        SelfDestructiveThread.this.onInvokeRunnable((Runnable)paramAnonymousMessage.obj);
        return true;
      }
      SelfDestructiveThread.this.onDestruction();
      return true;
    }
  };
  private final int mDestructAfterMillisec;
  private int mGeneration;
  private Handler mHandler;
  private final Object mLock = new Object();
  private final int mPriority;
  private HandlerThread mThread;
  private final String mThreadName;
  
  public SelfDestructiveThread(String paramString, int paramInt1, int paramInt2)
  {
    this.mThreadName = paramString;
    this.mPriority = paramInt1;
    this.mDestructAfterMillisec = paramInt2;
    this.mGeneration = 0;
  }
  
  private void post(Runnable paramRunnable)
  {
    synchronized (this.mLock)
    {
      if (this.mThread == null)
      {
        localObject2 = new android/os/HandlerThread;
        ((HandlerThread)localObject2).<init>(this.mThreadName, this.mPriority);
        this.mThread = ((HandlerThread)localObject2);
        ((HandlerThread)localObject2).start();
        localObject2 = new android/os/Handler;
        ((Handler)localObject2).<init>(this.mThread.getLooper(), this.mCallback);
        this.mHandler = ((Handler)localObject2);
        this.mGeneration += 1;
      }
      this.mHandler.removeMessages(0);
      Object localObject2 = this.mHandler;
      ((Handler)localObject2).sendMessage(((Handler)localObject2).obtainMessage(1, paramRunnable));
      return;
    }
  }
  
  public int getGeneration()
  {
    synchronized (this.mLock)
    {
      int i = this.mGeneration;
      return i;
    }
  }
  
  public boolean isRunning()
  {
    synchronized (this.mLock)
    {
      boolean bool;
      if (this.mThread != null) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
  
  void onDestruction()
  {
    synchronized (this.mLock)
    {
      if (this.mHandler.hasMessages(1)) {
        return;
      }
      this.mThread.quit();
      this.mThread = null;
      this.mHandler = null;
      return;
    }
  }
  
  void onInvokeRunnable(Runnable arg1)
  {
    ???.run();
    synchronized (this.mLock)
    {
      this.mHandler.removeMessages(0);
      Handler localHandler = this.mHandler;
      localHandler.sendMessageDelayed(localHandler.obtainMessage(0), this.mDestructAfterMillisec);
      return;
    }
  }
  
  public <T> void postAndReply(final Callable<T> paramCallable, final ReplyCallback<T> paramReplyCallback)
  {
    post(new Runnable()
    {
      public void run()
      {
        final Object localObject2;
        try
        {
          Object localObject1 = paramCallable.call();
        }
        catch (Exception localException)
        {
          localObject2 = null;
        }
        this.val$calleeHandler.post(new Runnable()
        {
          public void run()
          {
            SelfDestructiveThread.2.this.val$reply.onReply(localObject2);
          }
        });
      }
    });
  }
  
  public <T> T postAndWait(final Callable<T> paramCallable, int paramInt)
    throws InterruptedException
  {
    localReentrantLock = new ReentrantLock();
    final Condition localCondition = localReentrantLock.newCondition();
    final AtomicReference localAtomicReference = new AtomicReference();
    final AtomicBoolean localAtomicBoolean = new AtomicBoolean(true);
    post(new Runnable()
    {
      public void run()
      {
        try
        {
          localAtomicReference.set(paramCallable.call());
          localReentrantLock.lock();
          try
          {
            localAtomicBoolean.set(false);
            localCondition.signal();
            return;
          }
          finally
          {
            localReentrantLock.unlock();
          }
        }
        catch (Exception localException)
        {
          for (;;) {}
        }
      }
    });
    localReentrantLock.lock();
    label104:
    do
    {
      try
      {
        if (!localAtomicBoolean.get())
        {
          paramCallable = localAtomicReference.get();
          return paramCallable;
        }
        l1 = TimeUnit.MILLISECONDS.toNanos(paramInt);
      }
      finally
      {
        long l1;
        long l2;
        localReentrantLock.unlock();
      }
      try
      {
        l2 = localCondition.awaitNanos(l1);
        l1 = l2;
      }
      catch (InterruptedException paramCallable)
      {
        break label104;
      }
      if (!localAtomicBoolean.get())
      {
        paramCallable = localAtomicReference.get();
        localReentrantLock.unlock();
        return paramCallable;
      }
    } while (l1 > 0L);
    paramCallable = new java/lang/InterruptedException;
    paramCallable.<init>("timeout");
    throw paramCallable;
  }
  
  public static abstract interface ReplyCallback<T>
  {
    public abstract void onReply(T paramT);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\provider\SelfDestructiveThread.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */