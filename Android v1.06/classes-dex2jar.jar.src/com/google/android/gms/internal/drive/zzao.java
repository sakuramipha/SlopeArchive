package com.google.android.gms.internal.drive;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveApi.DriveIdResult;
import com.google.android.gms.drive.DriveId;

final class zzao
  implements DriveApi.DriveIdResult
{
  private final Status zzdy;
  private final DriveId zzk;
  
  public zzao(Status paramStatus, DriveId paramDriveId)
  {
    this.zzdy = paramStatus;
    this.zzk = paramDriveId;
  }
  
  public final DriveId getDriveId()
  {
    return this.zzk;
  }
  
  public final Status getStatus()
  {
    return this.zzdy;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */