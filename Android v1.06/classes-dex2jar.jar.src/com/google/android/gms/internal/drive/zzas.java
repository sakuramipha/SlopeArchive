package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;
import com.google.android.gms.drive.DriveApi.MetadataBufferResult;
import com.google.android.gms.drive.MetadataBuffer;

final class zzas
  extends zzl
{
  private final BaseImplementation.ResultHolder<DriveApi.MetadataBufferResult> zzdx;
  
  zzas(BaseImplementation.ResultHolder<DriveApi.MetadataBufferResult> paramResultHolder)
  {
    this.zzdx = paramResultHolder;
  }
  
  public final void zza(Status paramStatus)
    throws RemoteException
  {
    this.zzdx.setResult(new zzaq(paramStatus, null, false));
  }
  
  public final void zza(zzft paramzzft)
    throws RemoteException
  {
    MetadataBuffer localMetadataBuffer = new MetadataBuffer(paramzzft.zzii);
    this.zzdx.setResult(new zzaq(Status.RESULT_SUCCESS, localMetadataBuffer, paramzzft.zzea));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzas.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */