package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.drive.events.ListenerToken;

public final class zzg
  implements ListenerToken
{
  private final ListenerHolder.ListenerKey zzcy;
  private ICancelToken zzcz = null;
  
  public zzg(ListenerHolder.ListenerKey paramListenerKey)
  {
    this.zzcy = paramListenerKey;
  }
  
  public final boolean cancel()
  {
    ICancelToken localICancelToken = this.zzcz;
    if (localICancelToken != null) {}
    try
    {
      localICancelToken.cancel();
      return true;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;) {}
    }
    return false;
  }
  
  public final void setCancelToken(ICancelToken paramICancelToken)
  {
    this.zzcz = paramICancelToken;
  }
  
  public final ListenerHolder.ListenerKey zzad()
  {
    return this.zzcy;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */