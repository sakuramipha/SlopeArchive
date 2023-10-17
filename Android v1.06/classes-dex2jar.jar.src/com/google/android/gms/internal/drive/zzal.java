package com.google.android.gms.internal.drive;

import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveApi.DriveContentsResult;
import com.google.android.gms.drive.DriveContents;

final class zzal
  implements Releasable, DriveApi.DriveContentsResult
{
  private final Status zzdy;
  private final DriveContents zzo;
  
  public zzal(Status paramStatus, DriveContents paramDriveContents)
  {
    this.zzdy = paramStatus;
    this.zzo = paramDriveContents;
  }
  
  public final DriveContents getDriveContents()
  {
    return this.zzo;
  }
  
  public final Status getStatus()
  {
    return this.zzdy;
  }
  
  public final void release()
  {
    DriveContents localDriveContents = this.zzo;
    if (localDriveContents != null) {
      localDriveContents.zzj();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzal.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */