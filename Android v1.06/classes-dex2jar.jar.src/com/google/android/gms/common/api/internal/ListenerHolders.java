package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

public class ListenerHolders
{
  private final Set<ListenerHolder<?>> zaa = Collections.newSetFromMap(new WeakHashMap());
  
  public static <L> ListenerHolder<L> createListenerHolder(L paramL, Looper paramLooper, String paramString)
  {
    Preconditions.checkNotNull(paramL, "Listener must not be null");
    Preconditions.checkNotNull(paramLooper, "Looper must not be null");
    Preconditions.checkNotNull(paramString, "Listener type must not be null");
    return new ListenerHolder(paramLooper, paramL, paramString);
  }
  
  public static <L> ListenerHolder<L> createListenerHolder(L paramL, Executor paramExecutor, String paramString)
  {
    Preconditions.checkNotNull(paramL, "Listener must not be null");
    Preconditions.checkNotNull(paramExecutor, "Executor must not be null");
    Preconditions.checkNotNull(paramString, "Listener type must not be null");
    return new ListenerHolder(paramExecutor, paramL, paramString);
  }
  
  public static <L> ListenerHolder.ListenerKey<L> createListenerKey(L paramL, String paramString)
  {
    Preconditions.checkNotNull(paramL, "Listener must not be null");
    Preconditions.checkNotNull(paramString, "Listener type must not be null");
    Preconditions.checkNotEmpty(paramString, "Listener type must not be empty");
    return new ListenerHolder.ListenerKey(paramL, paramString);
  }
  
  public final <L> ListenerHolder<L> zaa(L paramL, Looper paramLooper, String paramString)
  {
    paramL = createListenerHolder(paramL, paramLooper, "NO_TYPE");
    this.zaa.add(paramL);
    return paramL;
  }
  
  public final void zab()
  {
    Iterator localIterator = this.zaa.iterator();
    while (localIterator.hasNext()) {
      ((ListenerHolder)localIterator.next()).clear();
    }
    this.zaa.clear();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\ListenerHolders.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */