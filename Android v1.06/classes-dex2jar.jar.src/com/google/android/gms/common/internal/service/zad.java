package com.google.android.gms.common.internal.service;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;

final class zad
  extends zaa
{
  private final BaseImplementation.ResultHolder<Status> zaa;
  
  public zad(BaseImplementation.ResultHolder<Status> paramResultHolder)
  {
    this.zaa = paramResultHolder;
  }
  
  public final void zab(int paramInt)
    throws RemoteException
  {
    this.zaa.setResult(new Status(paramInt));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\service\zad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */