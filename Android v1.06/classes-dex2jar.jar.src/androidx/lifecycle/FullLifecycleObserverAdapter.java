package androidx.lifecycle;

class FullLifecycleObserverAdapter
  implements LifecycleEventObserver
{
  private final FullLifecycleObserver mFullLifecycleObserver;
  private final LifecycleEventObserver mLifecycleEventObserver;
  
  FullLifecycleObserverAdapter(FullLifecycleObserver paramFullLifecycleObserver, LifecycleEventObserver paramLifecycleEventObserver)
  {
    this.mFullLifecycleObserver = paramFullLifecycleObserver;
    this.mLifecycleEventObserver = paramLifecycleEventObserver;
  }
  
  public void onStateChanged(LifecycleOwner paramLifecycleOwner, Lifecycle.Event paramEvent)
  {
    switch (1.$SwitchMap$androidx$lifecycle$Lifecycle$Event[paramEvent.ordinal()])
    {
    default: 
      break;
    case 7: 
      throw new IllegalArgumentException("ON_ANY must not been send by anybody");
    case 6: 
      this.mFullLifecycleObserver.onDestroy(paramLifecycleOwner);
      break;
    case 5: 
      this.mFullLifecycleObserver.onStop(paramLifecycleOwner);
      break;
    case 4: 
      this.mFullLifecycleObserver.onPause(paramLifecycleOwner);
      break;
    case 3: 
      this.mFullLifecycleObserver.onResume(paramLifecycleOwner);
      break;
    case 2: 
      this.mFullLifecycleObserver.onStart(paramLifecycleOwner);
      break;
    case 1: 
      this.mFullLifecycleObserver.onCreate(paramLifecycleOwner);
    }
    LifecycleEventObserver localLifecycleEventObserver = this.mLifecycleEventObserver;
    if (localLifecycleEventObserver != null) {
      localLifecycleEventObserver.onStateChanged(paramLifecycleOwner, paramEvent);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\lifecycle\FullLifecycleObserverAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */