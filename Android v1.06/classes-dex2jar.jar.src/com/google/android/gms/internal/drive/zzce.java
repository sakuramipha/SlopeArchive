package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;
import com.google.android.gms.drive.DrivePreferencesApi.FileUploadPreferencesResult;

final class zzce
  extends zzl
{
  private final BaseImplementation.ResultHolder<DrivePreferencesApi.FileUploadPreferencesResult> zzdx;
  private final zzcb zzfk;
  
  private zzce(BaseImplementation.ResultHolder<DrivePreferencesApi.FileUploadPreferencesResult> paramResultHolder)
  {
    BaseImplementation.ResultHolder localResultHolder;
    this.zzdx = localResultHolder;
  }
  
  public final void zza(Status paramStatus)
    throws RemoteException
  {
    this.zzdx.setResult(new zzcf(this.zzfk, paramStatus, null, null));
  }
  
  public final void zza(zzfj paramzzfj)
    throws RemoteException
  {
    this.zzdx.setResult(new zzcf(this.zzfk, Status.RESULT_SUCCESS, paramzzfj.zzhw, null));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzce.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */