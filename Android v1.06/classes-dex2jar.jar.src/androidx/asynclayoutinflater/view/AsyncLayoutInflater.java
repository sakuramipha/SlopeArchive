package androidx.asynclayoutinflater.view;

import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.util.Pools.SynchronizedPool;
import java.util.Objects;
import java.util.concurrent.ArrayBlockingQueue;

public final class AsyncLayoutInflater
{
  private static final String TAG = "AsyncLayoutInflater";
  Handler mHandler;
  private Handler.Callback mHandlerCallback = new Handler.Callback()
  {
    public boolean handleMessage(Message paramAnonymousMessage)
    {
      paramAnonymousMessage = (AsyncLayoutInflater.InflateRequest)paramAnonymousMessage.obj;
      if (paramAnonymousMessage.view == null) {
        paramAnonymousMessage.view = AsyncLayoutInflater.this.mInflater.inflate(paramAnonymousMessage.resid, paramAnonymousMessage.parent, false);
      }
      paramAnonymousMessage.callback.onInflateFinished(paramAnonymousMessage.view, paramAnonymousMessage.resid, paramAnonymousMessage.parent);
      AsyncLayoutInflater.this.mInflateThread.releaseRequest(paramAnonymousMessage);
      return true;
    }
  };
  InflateThread mInflateThread;
  LayoutInflater mInflater;
  
  public AsyncLayoutInflater(Context paramContext)
  {
    this.mInflater = new BasicInflater(paramContext);
    this.mHandler = new Handler(this.mHandlerCallback);
    this.mInflateThread = InflateThread.getInstance();
  }
  
  public void inflate(int paramInt, ViewGroup paramViewGroup, OnInflateFinishedListener paramOnInflateFinishedListener)
  {
    Objects.requireNonNull(paramOnInflateFinishedListener, "callback argument may not be null!");
    InflateRequest localInflateRequest = this.mInflateThread.obtainRequest();
    localInflateRequest.inflater = this;
    localInflateRequest.resid = paramInt;
    localInflateRequest.parent = paramViewGroup;
    localInflateRequest.callback = paramOnInflateFinishedListener;
    this.mInflateThread.enqueue(localInflateRequest);
  }
  
  private static class BasicInflater
    extends LayoutInflater
  {
    private static final String[] sClassPrefixList = { "android.widget.", "android.webkit.", "android.app." };
    
    BasicInflater(Context paramContext)
    {
      super();
    }
    
    public LayoutInflater cloneInContext(Context paramContext)
    {
      return new BasicInflater(paramContext);
    }
    
    protected View onCreateView(String paramString, AttributeSet paramAttributeSet)
      throws ClassNotFoundException
    {
      for (Object localObject : sClassPrefixList) {
        try
        {
          localObject = createView(paramString, (String)localObject, paramAttributeSet);
          if (localObject != null) {
            return (View)localObject;
          }
        }
        catch (ClassNotFoundException localClassNotFoundException)
        {
          for (;;) {}
        }
      }
      return super.onCreateView(paramString, paramAttributeSet);
    }
  }
  
  private static class InflateRequest
  {
    AsyncLayoutInflater.OnInflateFinishedListener callback;
    AsyncLayoutInflater inflater;
    ViewGroup parent;
    int resid;
    View view;
  }
  
  private static class InflateThread
    extends Thread
  {
    private static final InflateThread sInstance;
    private ArrayBlockingQueue<AsyncLayoutInflater.InflateRequest> mQueue = new ArrayBlockingQueue(10);
    private Pools.SynchronizedPool<AsyncLayoutInflater.InflateRequest> mRequestPool = new Pools.SynchronizedPool(10);
    
    static
    {
      InflateThread localInflateThread = new InflateThread();
      sInstance = localInflateThread;
      localInflateThread.start();
    }
    
    public static InflateThread getInstance()
    {
      return sInstance;
    }
    
    public void enqueue(AsyncLayoutInflater.InflateRequest paramInflateRequest)
    {
      try
      {
        this.mQueue.put(paramInflateRequest);
        return;
      }
      catch (InterruptedException paramInflateRequest)
      {
        throw new RuntimeException("Failed to enqueue async inflate request", paramInflateRequest);
      }
    }
    
    public AsyncLayoutInflater.InflateRequest obtainRequest()
    {
      AsyncLayoutInflater.InflateRequest localInflateRequest2 = (AsyncLayoutInflater.InflateRequest)this.mRequestPool.acquire();
      AsyncLayoutInflater.InflateRequest localInflateRequest1 = localInflateRequest2;
      if (localInflateRequest2 == null) {
        localInflateRequest1 = new AsyncLayoutInflater.InflateRequest();
      }
      return localInflateRequest1;
    }
    
    public void releaseRequest(AsyncLayoutInflater.InflateRequest paramInflateRequest)
    {
      paramInflateRequest.callback = null;
      paramInflateRequest.inflater = null;
      paramInflateRequest.parent = null;
      paramInflateRequest.resid = 0;
      paramInflateRequest.view = null;
      this.mRequestPool.release(paramInflateRequest);
    }
    
    public void run()
    {
      for (;;)
      {
        runInner();
      }
    }
    
    public void runInner()
    {
      try
      {
        AsyncLayoutInflater.InflateRequest localInflateRequest = (AsyncLayoutInflater.InflateRequest)this.mQueue.take();
        try
        {
          localInflateRequest.view = localInflateRequest.inflater.mInflater.inflate(localInflateRequest.resid, localInflateRequest.parent, false);
        }
        catch (RuntimeException localRuntimeException)
        {
          Log.w("AsyncLayoutInflater", "Failed to inflate resource in the background! Retrying on the UI thread", localRuntimeException);
        }
        Message.obtain(localInflateRequest.inflater.mHandler, 0, localInflateRequest).sendToTarget();
        return;
      }
      catch (InterruptedException localInterruptedException)
      {
        Log.w("AsyncLayoutInflater", localInterruptedException);
      }
    }
  }
  
  public static abstract interface OnInflateFinishedListener
  {
    public abstract void onInflateFinished(View paramView, int paramInt, ViewGroup paramViewGroup);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\asynclayoutinflater\view\AsyncLayoutInflater.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */