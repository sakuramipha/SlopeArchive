package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;
import com.google.android.gms.drive.DriveApi.DriveIdResult;
import com.google.android.gms.drive.Metadata;

final class zzan
  extends zzl
{
  private final BaseImplementation.ResultHolder<DriveApi.DriveIdResult> zzdx;
  
  public zzan(BaseImplementation.ResultHolder<DriveApi.DriveIdResult> paramResultHolder)
  {
    this.zzdx = paramResultHolder;
  }
  
  public final void zza(Status paramStatus)
    throws RemoteException
  {
    this.zzdx.setResult(new zzao(paramStatus, null));
  }
  
  public final void zza(zzfn paramzzfn)
    throws RemoteException
  {
    this.zzdx.setResult(new zzao(Status.RESULT_SUCCESS, paramzzfn.zzdd));
  }
  
  public final void zza(zzfy paramzzfy)
    throws RemoteException
  {
    this.zzdx.setResult(new zzao(Status.RESULT_SUCCESS, new zzaa(paramzzfy.zzdn).getDriveId()));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzan.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */