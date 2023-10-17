package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;
import com.google.android.gms.drive.DriveApi.DriveContentsResult;
import com.google.android.gms.drive.DriveFile.DownloadProgressListener;

final class zzgl
  extends zzl
{
  private final BaseImplementation.ResultHolder<DriveApi.DriveContentsResult> zzdx;
  private final DriveFile.DownloadProgressListener zziq;
  
  zzgl(BaseImplementation.ResultHolder<DriveApi.DriveContentsResult> paramResultHolder, DriveFile.DownloadProgressListener paramDownloadProgressListener)
  {
    this.zzdx = paramResultHolder;
    this.zziq = paramDownloadProgressListener;
  }
  
  public final void zza(Status paramStatus)
    throws RemoteException
  {
    this.zzdx.setResult(new zzal(paramStatus, null));
  }
  
  public final void zza(zzfh paramzzfh)
    throws RemoteException
  {
    Status localStatus;
    if (paramzzfh.zzhv) {
      localStatus = new Status(-1);
    } else {
      localStatus = Status.RESULT_SUCCESS;
    }
    this.zzdx.setResult(new zzal(localStatus, new zzbi(paramzzfh.zzes)));
  }
  
  public final void zza(zzfl paramzzfl)
    throws RemoteException
  {
    DriveFile.DownloadProgressListener localDownloadProgressListener = this.zziq;
    if (localDownloadProgressListener != null) {
      localDownloadProgressListener.onProgress(paramzzfl.zzhy, paramzzfl.zzhz);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzgl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */