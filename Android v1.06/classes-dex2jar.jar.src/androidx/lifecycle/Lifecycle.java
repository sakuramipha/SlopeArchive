package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

public abstract class Lifecycle
{
  AtomicReference<Object> mInternalScopeRef = new AtomicReference();
  
  public abstract void addObserver(LifecycleObserver paramLifecycleObserver);
  
  public abstract State getCurrentState();
  
  public abstract void removeObserver(LifecycleObserver paramLifecycleObserver);
  
  public static enum Event
  {
    private static final Event[] $VALUES;
    
    static
    {
      Event localEvent7 = new Event("ON_CREATE", 0);
      ON_CREATE = localEvent7;
      Event localEvent1 = new Event("ON_START", 1);
      ON_START = localEvent1;
      Event localEvent5 = new Event("ON_RESUME", 2);
      ON_RESUME = localEvent5;
      Event localEvent2 = new Event("ON_PAUSE", 3);
      ON_PAUSE = localEvent2;
      Event localEvent4 = new Event("ON_STOP", 4);
      ON_STOP = localEvent4;
      Event localEvent3 = new Event("ON_DESTROY", 5);
      ON_DESTROY = localEvent3;
      Event localEvent6 = new Event("ON_ANY", 6);
      ON_ANY = localEvent6;
      $VALUES = new Event[] { localEvent7, localEvent1, localEvent5, localEvent2, localEvent4, localEvent3, localEvent6 };
    }
    
    private Event() {}
  }
  
  public static enum State
  {
    private static final State[] $VALUES;
    
    static
    {
      State localState1 = new State("DESTROYED", 0);
      DESTROYED = localState1;
      State localState4 = new State("INITIALIZED", 1);
      INITIALIZED = localState4;
      State localState3 = new State("CREATED", 2);
      CREATED = localState3;
      State localState2 = new State("STARTED", 3);
      STARTED = localState2;
      State localState5 = new State("RESUMED", 4);
      RESUMED = localState5;
      $VALUES = new State[] { localState1, localState4, localState3, localState2, localState5 };
    }
    
    private State() {}
    
    public boolean isAtLeast(State paramState)
    {
      boolean bool;
      if (compareTo(paramState) >= 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\lifecycle\Lifecycle.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */