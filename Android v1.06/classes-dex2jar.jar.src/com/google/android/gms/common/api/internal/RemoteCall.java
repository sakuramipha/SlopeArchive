package com.google.android.gms.common.api.internal;

import android.os.RemoteException;

public abstract interface RemoteCall<T, U>
{
  public abstract void accept(T paramT, U paramU)
    throws RemoteException;
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\RemoteCall.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */