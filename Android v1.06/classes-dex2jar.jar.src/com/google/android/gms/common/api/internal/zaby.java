package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zaa;

public final class zaby
  extends zaa
  implements IStatusCallback
{
  zaby(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.common.api.internal.IStatusCallback");
  }
  
  public final void onResult(Status paramStatus)
    throws RemoteException
  {
    throw null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\zaby.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */