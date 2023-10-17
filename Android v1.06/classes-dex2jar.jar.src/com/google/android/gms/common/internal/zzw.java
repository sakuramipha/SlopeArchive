package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.common.zza;

public final class zzw
  extends zza
  implements ICancelToken
{
  zzw(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.common.internal.ICancelToken");
  }
  
  public final void cancel()
    throws RemoteException
  {
    zzD(2, zza());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\zzw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */