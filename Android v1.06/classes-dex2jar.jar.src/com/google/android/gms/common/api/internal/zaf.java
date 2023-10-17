package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

public final class zaf
  extends zad<Void>
{
  public final zaci zab;
  
  public zaf(zaci paramzaci, TaskCompletionSource<Void> paramTaskCompletionSource)
  {
    super(3, paramTaskCompletionSource);
    this.zab = paramzaci;
  }
  
  public final boolean zaa(zabq<?> paramzabq)
  {
    return this.zab.zaa.zab();
  }
  
  public final Feature[] zab(zabq<?> paramzabq)
  {
    return this.zab.zaa.getRequiredFeatures();
  }
  
  public final void zac(zabq<?> paramzabq)
    throws RemoteException
  {
    this.zab.zaa.registerListener(paramzabq.zaf(), this.zaa);
    ListenerHolder.ListenerKey localListenerKey = this.zab.zaa.getListenerKey();
    if (localListenerKey != null) {
      paramzabq.zah().put(localListenerKey, this.zab);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\zaf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */