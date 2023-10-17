package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;
import com.google.android.gms.drive.DriveApi.DriveContentsResult;

final class zzak
  extends zzl
{
  private final BaseImplementation.ResultHolder<DriveApi.DriveContentsResult> zzdx;
  
  zzak(BaseImplementation.ResultHolder<DriveApi.DriveContentsResult> paramResultHolder)
  {
    this.zzdx = paramResultHolder;
  }
  
  public final void zza(Status paramStatus)
    throws RemoteException
  {
    this.zzdx.setResult(new zzal(paramStatus, null));
  }
  
  public final void zza(zzfh paramzzfh)
    throws RemoteException
  {
    this.zzdx.setResult(new zzal(Status.RESULT_SUCCESS, new zzbi(paramzzfh.zzes)));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */