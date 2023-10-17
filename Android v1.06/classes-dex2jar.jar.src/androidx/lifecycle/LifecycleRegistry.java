package androidx.lifecycle;

import androidx.arch.core.internal.FastSafeIterableMap;
import androidx.arch.core.internal.SafeIterableMap.IteratorWithAdditions;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;

public class LifecycleRegistry
  extends Lifecycle
{
  private int mAddingObserverCounter = 0;
  private boolean mHandlingEvent = false;
  private final WeakReference<LifecycleOwner> mLifecycleOwner;
  private boolean mNewEventOccurred = false;
  private FastSafeIterableMap<LifecycleObserver, ObserverWithState> mObserverMap = new FastSafeIterableMap();
  private ArrayList<Lifecycle.State> mParentStates = new ArrayList();
  private Lifecycle.State mState;
  
  public LifecycleRegistry(LifecycleOwner paramLifecycleOwner)
  {
    this.mLifecycleOwner = new WeakReference(paramLifecycleOwner);
    this.mState = Lifecycle.State.INITIALIZED;
  }
  
  private void backwardPass(LifecycleOwner paramLifecycleOwner)
  {
    Iterator localIterator = this.mObserverMap.descendingIterator();
    while ((localIterator.hasNext()) && (!this.mNewEventOccurred))
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      ObserverWithState localObserverWithState = (ObserverWithState)localEntry.getValue();
      while ((localObserverWithState.mState.compareTo(this.mState) > 0) && (!this.mNewEventOccurred) && (this.mObserverMap.contains(localEntry.getKey())))
      {
        Lifecycle.Event localEvent = downEvent(localObserverWithState.mState);
        pushParentState(getStateAfter(localEvent));
        localObserverWithState.dispatchEvent(paramLifecycleOwner, localEvent);
        popParentState();
      }
    }
  }
  
  private Lifecycle.State calculateTargetState(LifecycleObserver paramLifecycleObserver)
  {
    paramLifecycleObserver = this.mObserverMap.ceil(paramLifecycleObserver);
    Object localObject = null;
    if (paramLifecycleObserver != null) {
      paramLifecycleObserver = ((ObserverWithState)paramLifecycleObserver.getValue()).mState;
    } else {
      paramLifecycleObserver = null;
    }
    if (!this.mParentStates.isEmpty())
    {
      localObject = this.mParentStates;
      localObject = (Lifecycle.State)((ArrayList)localObject).get(((ArrayList)localObject).size() - 1);
    }
    return min(min(this.mState, paramLifecycleObserver), (Lifecycle.State)localObject);
  }
  
  private static Lifecycle.Event downEvent(Lifecycle.State paramState)
  {
    int i = 1.$SwitchMap$androidx$lifecycle$Lifecycle$State[paramState.ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3)
        {
          if (i != 4)
          {
            if (i != 5)
            {
              StringBuilder localStringBuilder = new StringBuilder();
              localStringBuilder.append("Unexpected state value ");
              localStringBuilder.append(paramState);
              throw new IllegalArgumentException(localStringBuilder.toString());
            }
            throw new IllegalArgumentException();
          }
          return Lifecycle.Event.ON_PAUSE;
        }
        return Lifecycle.Event.ON_STOP;
      }
      return Lifecycle.Event.ON_DESTROY;
    }
    throw new IllegalArgumentException();
  }
  
  private void forwardPass(LifecycleOwner paramLifecycleOwner)
  {
    SafeIterableMap.IteratorWithAdditions localIteratorWithAdditions = this.mObserverMap.iteratorWithAdditions();
    while ((localIteratorWithAdditions.hasNext()) && (!this.mNewEventOccurred))
    {
      Map.Entry localEntry = (Map.Entry)localIteratorWithAdditions.next();
      ObserverWithState localObserverWithState = (ObserverWithState)localEntry.getValue();
      while ((localObserverWithState.mState.compareTo(this.mState) < 0) && (!this.mNewEventOccurred) && (this.mObserverMap.contains(localEntry.getKey())))
      {
        pushParentState(localObserverWithState.mState);
        localObserverWithState.dispatchEvent(paramLifecycleOwner, upEvent(localObserverWithState.mState));
        popParentState();
      }
    }
  }
  
  static Lifecycle.State getStateAfter(Lifecycle.Event paramEvent)
  {
    switch (1.$SwitchMap$androidx$lifecycle$Lifecycle$Event[paramEvent.ordinal()])
    {
    default: 
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Unexpected event value ");
      localStringBuilder.append(paramEvent);
      throw new IllegalArgumentException(localStringBuilder.toString());
    case 6: 
      return Lifecycle.State.DESTROYED;
    case 5: 
      return Lifecycle.State.RESUMED;
    case 3: 
    case 4: 
      return Lifecycle.State.STARTED;
    }
    return Lifecycle.State.CREATED;
  }
  
  private boolean isSynced()
  {
    int i = this.mObserverMap.size();
    boolean bool = true;
    if (i == 0) {
      return true;
    }
    Lifecycle.State localState2 = ((ObserverWithState)this.mObserverMap.eldest().getValue()).mState;
    Lifecycle.State localState1 = ((ObserverWithState)this.mObserverMap.newest().getValue()).mState;
    if ((localState2 != localState1) || (this.mState != localState1)) {
      bool = false;
    }
    return bool;
  }
  
  static Lifecycle.State min(Lifecycle.State paramState1, Lifecycle.State paramState2)
  {
    Lifecycle.State localState = paramState1;
    if (paramState2 != null)
    {
      localState = paramState1;
      if (paramState2.compareTo(paramState1) < 0) {
        localState = paramState2;
      }
    }
    return localState;
  }
  
  private void moveToState(Lifecycle.State paramState)
  {
    if (this.mState == paramState) {
      return;
    }
    this.mState = paramState;
    if ((!this.mHandlingEvent) && (this.mAddingObserverCounter == 0))
    {
      this.mHandlingEvent = true;
      sync();
      this.mHandlingEvent = false;
      return;
    }
    this.mNewEventOccurred = true;
  }
  
  private void popParentState()
  {
    ArrayList localArrayList = this.mParentStates;
    localArrayList.remove(localArrayList.size() - 1);
  }
  
  private void pushParentState(Lifecycle.State paramState)
  {
    this.mParentStates.add(paramState);
  }
  
  private void sync()
  {
    LifecycleOwner localLifecycleOwner = (LifecycleOwner)this.mLifecycleOwner.get();
    if (localLifecycleOwner != null)
    {
      while (!isSynced())
      {
        this.mNewEventOccurred = false;
        if (this.mState.compareTo(((ObserverWithState)this.mObserverMap.eldest().getValue()).mState) < 0) {
          backwardPass(localLifecycleOwner);
        }
        Map.Entry localEntry = this.mObserverMap.newest();
        if ((!this.mNewEventOccurred) && (localEntry != null) && (this.mState.compareTo(((ObserverWithState)localEntry.getValue()).mState) > 0)) {
          forwardPass(localLifecycleOwner);
        }
      }
      this.mNewEventOccurred = false;
      return;
    }
    throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
  }
  
  private static Lifecycle.Event upEvent(Lifecycle.State paramState)
  {
    int i = 1.$SwitchMap$androidx$lifecycle$Lifecycle$State[paramState.ordinal()];
    if (i != 1) {
      if (i != 2)
      {
        if (i != 3)
        {
          if (i != 4)
          {
            if (i != 5)
            {
              StringBuilder localStringBuilder = new StringBuilder();
              localStringBuilder.append("Unexpected state value ");
              localStringBuilder.append(paramState);
              throw new IllegalArgumentException(localStringBuilder.toString());
            }
          }
          else {
            throw new IllegalArgumentException();
          }
        }
        else {
          return Lifecycle.Event.ON_RESUME;
        }
      }
      else {
        return Lifecycle.Event.ON_START;
      }
    }
    return Lifecycle.Event.ON_CREATE;
  }
  
  public void addObserver(LifecycleObserver paramLifecycleObserver)
  {
    if (this.mState == Lifecycle.State.DESTROYED) {
      localState = Lifecycle.State.DESTROYED;
    } else {
      localState = Lifecycle.State.INITIALIZED;
    }
    ObserverWithState localObserverWithState = new ObserverWithState(paramLifecycleObserver, localState);
    if ((ObserverWithState)this.mObserverMap.putIfAbsent(paramLifecycleObserver, localObserverWithState) != null) {
      return;
    }
    LifecycleOwner localLifecycleOwner = (LifecycleOwner)this.mLifecycleOwner.get();
    if (localLifecycleOwner == null) {
      return;
    }
    int i;
    if ((this.mAddingObserverCounter == 0) && (!this.mHandlingEvent)) {
      i = 0;
    } else {
      i = 1;
    }
    Lifecycle.State localState = calculateTargetState(paramLifecycleObserver);
    this.mAddingObserverCounter += 1;
    while ((localObserverWithState.mState.compareTo(localState) < 0) && (this.mObserverMap.contains(paramLifecycleObserver)))
    {
      pushParentState(localObserverWithState.mState);
      localObserverWithState.dispatchEvent(localLifecycleOwner, upEvent(localObserverWithState.mState));
      popParentState();
      localState = calculateTargetState(paramLifecycleObserver);
    }
    if (i == 0) {
      sync();
    }
    this.mAddingObserverCounter -= 1;
  }
  
  public Lifecycle.State getCurrentState()
  {
    return this.mState;
  }
  
  public int getObserverCount()
  {
    return this.mObserverMap.size();
  }
  
  public void handleLifecycleEvent(Lifecycle.Event paramEvent)
  {
    moveToState(getStateAfter(paramEvent));
  }
  
  @Deprecated
  public void markState(Lifecycle.State paramState)
  {
    setCurrentState(paramState);
  }
  
  public void removeObserver(LifecycleObserver paramLifecycleObserver)
  {
    this.mObserverMap.remove(paramLifecycleObserver);
  }
  
  public void setCurrentState(Lifecycle.State paramState)
  {
    moveToState(paramState);
  }
  
  static class ObserverWithState
  {
    LifecycleEventObserver mLifecycleObserver;
    Lifecycle.State mState;
    
    ObserverWithState(LifecycleObserver paramLifecycleObserver, Lifecycle.State paramState)
    {
      this.mLifecycleObserver = Lifecycling.lifecycleEventObserver(paramLifecycleObserver);
      this.mState = paramState;
    }
    
    void dispatchEvent(LifecycleOwner paramLifecycleOwner, Lifecycle.Event paramEvent)
    {
      Lifecycle.State localState = LifecycleRegistry.getStateAfter(paramEvent);
      this.mState = LifecycleRegistry.min(this.mState, localState);
      this.mLifecycleObserver.onStateChanged(paramLifecycleOwner, paramEvent);
      this.mState = localState;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\lifecycle\LifecycleRegistry.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */