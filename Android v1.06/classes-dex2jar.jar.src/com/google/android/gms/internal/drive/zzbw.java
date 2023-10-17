package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;
import com.google.android.gms.drive.DriveFolder.DriveFolderResult;

final class zzbw
  extends zzl
{
  private final BaseImplementation.ResultHolder<DriveFolder.DriveFolderResult> zzdx;
  
  public zzbw(BaseImplementation.ResultHolder<DriveFolder.DriveFolderResult> paramResultHolder)
  {
    this.zzdx = paramResultHolder;
  }
  
  public final void zza(Status paramStatus)
    throws RemoteException
  {
    this.zzdx.setResult(new zzbz(paramStatus, null));
  }
  
  public final void zza(zzfn paramzzfn)
    throws RemoteException
  {
    this.zzdx.setResult(new zzbz(Status.RESULT_SUCCESS, new zzbs(paramzzfn.zzdd)));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzbw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */