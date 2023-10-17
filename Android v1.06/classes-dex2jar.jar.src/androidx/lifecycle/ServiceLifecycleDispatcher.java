package androidx.lifecycle;

import android.os.Handler;

public class ServiceLifecycleDispatcher
{
  private final Handler mHandler;
  private DispatchRunnable mLastDispatchRunnable;
  private final LifecycleRegistry mRegistry;
  
  public ServiceLifecycleDispatcher(LifecycleOwner paramLifecycleOwner)
  {
    this.mRegistry = new LifecycleRegistry(paramLifecycleOwner);
    this.mHandler = new Handler();
  }
  
  private void postDispatchRunnable(Lifecycle.Event paramEvent)
  {
    DispatchRunnable localDispatchRunnable = this.mLastDispatchRunnable;
    if (localDispatchRunnable != null) {
      localDispatchRunnable.run();
    }
    paramEvent = new DispatchRunnable(this.mRegistry, paramEvent);
    this.mLastDispatchRunnable = paramEvent;
    this.mHandler.postAtFrontOfQueue(paramEvent);
  }
  
  public Lifecycle getLifecycle()
  {
    return this.mRegistry;
  }
  
  public void onServicePreSuperOnBind()
  {
    postDispatchRunnable(Lifecycle.Event.ON_START);
  }
  
  public void onServicePreSuperOnCreate()
  {
    postDispatchRunnable(Lifecycle.Event.ON_CREATE);
  }
  
  public void onServicePreSuperOnDestroy()
  {
    postDispatchRunnable(Lifecycle.Event.ON_STOP);
    postDispatchRunnable(Lifecycle.Event.ON_DESTROY);
  }
  
  public void onServicePreSuperOnStart()
  {
    postDispatchRunnable(Lifecycle.Event.ON_START);
  }
  
  static class DispatchRunnable
    implements Runnable
  {
    final Lifecycle.Event mEvent;
    private final LifecycleRegistry mRegistry;
    private boolean mWasExecuted = false;
    
    DispatchRunnable(LifecycleRegistry paramLifecycleRegistry, Lifecycle.Event paramEvent)
    {
      this.mRegistry = paramLifecycleRegistry;
      this.mEvent = paramEvent;
    }
    
    public void run()
    {
      if (!this.mWasExecuted)
      {
        this.mRegistry.handleLifecycleEvent(this.mEvent);
        this.mWasExecuted = true;
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\lifecycle\ServiceLifecycleDispatcher.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */