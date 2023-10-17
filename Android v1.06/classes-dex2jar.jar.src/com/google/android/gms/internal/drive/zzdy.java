package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;
import com.google.android.gms.drive.DriveResource.MetadataResult;

final class zzdy
  extends zzl
{
  private final BaseImplementation.ResultHolder<DriveResource.MetadataResult> zzdx;
  
  public zzdy(BaseImplementation.ResultHolder<DriveResource.MetadataResult> paramResultHolder)
  {
    this.zzdx = paramResultHolder;
  }
  
  public final void zza(Status paramStatus)
    throws RemoteException
  {
    this.zzdx.setResult(new zzdz(paramStatus, null));
  }
  
  public final void zza(zzfy paramzzfy)
    throws RemoteException
  {
    this.zzdx.setResult(new zzdz(Status.RESULT_SUCCESS, new zzaa(paramzzfy.zzdn)));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzdy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */