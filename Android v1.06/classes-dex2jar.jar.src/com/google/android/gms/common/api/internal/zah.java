package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

public final class zah
  extends zad<Boolean>
{
  public final ListenerHolder.ListenerKey<?> zab;
  
  public zah(ListenerHolder.ListenerKey<?> paramListenerKey, TaskCompletionSource<Boolean> paramTaskCompletionSource)
  {
    super(4, paramTaskCompletionSource);
    this.zab = paramListenerKey;
  }
  
  public final boolean zaa(zabq<?> paramzabq)
  {
    paramzabq = (zaci)paramzabq.zah().get(this.zab);
    return (paramzabq != null) && (paramzabq.zaa.zab());
  }
  
  public final Feature[] zab(zabq<?> paramzabq)
  {
    paramzabq = (zaci)paramzabq.zah().get(this.zab);
    if (paramzabq == null) {
      return null;
    }
    return paramzabq.zaa.getRequiredFeatures();
  }
  
  public final void zac(zabq<?> paramzabq)
    throws RemoteException
  {
    zaci localzaci = (zaci)paramzabq.zah().remove(this.zab);
    if (localzaci != null)
    {
      localzaci.zab.unregisterListener(paramzabq.zaf(), this.zaa);
      localzaci.zaa.clearListener();
      return;
    }
    this.zaa.trySetResult(Boolean.valueOf(false));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\zah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */