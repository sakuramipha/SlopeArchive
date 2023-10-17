package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;
import com.google.android.gms.drive.DriveFolder.DriveFileResult;

final class zzbv
  extends zzl
{
  private final BaseImplementation.ResultHolder<DriveFolder.DriveFileResult> zzdx;
  
  public zzbv(BaseImplementation.ResultHolder<DriveFolder.DriveFileResult> paramResultHolder)
  {
    this.zzdx = paramResultHolder;
  }
  
  public final void zza(Status paramStatus)
    throws RemoteException
  {
    this.zzdx.setResult(new zzbx(paramStatus, null));
  }
  
  public final void zza(zzfn paramzzfn)
    throws RemoteException
  {
    this.zzdx.setResult(new zzbx(Status.RESULT_SUCCESS, new zzbn(paramzzfn.zzdd)));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzbv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */