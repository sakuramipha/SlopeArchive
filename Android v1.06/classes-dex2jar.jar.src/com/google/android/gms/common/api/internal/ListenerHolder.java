package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.HandlerExecutor;
import java.util.concurrent.Executor;

public final class ListenerHolder<L>
{
  private final Executor zaa;
  private volatile L zab;
  private volatile ListenerKey<L> zac;
  
  ListenerHolder(Looper paramLooper, L paramL, String paramString)
  {
    this.zaa = new HandlerExecutor(paramLooper);
    this.zab = Preconditions.checkNotNull(paramL, "Listener must not be null");
    this.zac = new ListenerKey(paramL, Preconditions.checkNotEmpty(paramString));
  }
  
  ListenerHolder(Executor paramExecutor, L paramL, String paramString)
  {
    this.zaa = ((Executor)Preconditions.checkNotNull(paramExecutor, "Executor must not be null"));
    this.zab = Preconditions.checkNotNull(paramL, "Listener must not be null");
    this.zac = new ListenerKey(paramL, Preconditions.checkNotEmpty(paramString));
  }
  
  public void clear()
  {
    this.zab = null;
    this.zac = null;
  }
  
  public ListenerKey<L> getListenerKey()
  {
    return this.zac;
  }
  
  public boolean hasListener()
  {
    return this.zab != null;
  }
  
  public void notifyListener(Notifier<? super L> paramNotifier)
  {
    Preconditions.checkNotNull(paramNotifier, "Notifier must not be null");
    this.zaa.execute(new zacb(this, paramNotifier));
  }
  
  final void zaa(Notifier<? super L> paramNotifier)
  {
    Object localObject = this.zab;
    if (localObject == null)
    {
      paramNotifier.onNotifyListenerFailed();
      return;
    }
    try
    {
      paramNotifier.notifyListener(localObject);
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      paramNotifier.onNotifyListenerFailed();
      throw localRuntimeException;
    }
  }
  
  public static final class ListenerKey<L>
  {
    private final L zaa;
    private final String zab;
    
    ListenerKey(L paramL, String paramString)
    {
      this.zaa = paramL;
      this.zab = paramString;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this == paramObject) {
        return true;
      }
      if (!(paramObject instanceof ListenerKey)) {
        return false;
      }
      paramObject = (ListenerKey)paramObject;
      return (this.zaa == ((ListenerKey)paramObject).zaa) && (this.zab.equals(((ListenerKey)paramObject).zab));
    }
    
    public int hashCode()
    {
      return System.identityHashCode(this.zaa) * 31 + this.zab.hashCode();
    }
    
    public String toIdString()
    {
      String str = this.zab;
      int i = System.identityHashCode(this.zaa);
      StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 12);
      localStringBuilder.append(str);
      localStringBuilder.append("@");
      localStringBuilder.append(i);
      return localStringBuilder.toString();
    }
  }
  
  public static abstract interface Notifier<L>
  {
    public abstract void notifyListener(L paramL);
    
    public abstract void onNotifyListenerFailed();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\ListenerHolder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */