package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;

public final class zzgy
  extends zzl
{
  private final BaseImplementation.ResultHolder<Status> zzdx;
  
  public zzgy(BaseImplementation.ResultHolder<Status> paramResultHolder)
  {
    this.zzdx = paramResultHolder;
  }
  
  public final void onSuccess()
    throws RemoteException
  {
    this.zzdx.setResult(Status.RESULT_SUCCESS);
  }
  
  public final void zza(Status paramStatus)
    throws RemoteException
  {
    this.zzdx.setResult(paramStatus);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzgy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */