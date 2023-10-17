package com.google.android.gms.internal.drive;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveFolder;
import com.google.android.gms.drive.DriveFolder.DriveFolderResult;

final class zzbz
  implements DriveFolder.DriveFolderResult
{
  private final Status zzdy;
  private final DriveFolder zzfj;
  
  public zzbz(Status paramStatus, DriveFolder paramDriveFolder)
  {
    this.zzdy = paramStatus;
    this.zzfj = paramDriveFolder;
  }
  
  public final DriveFolder getDriveFolder()
  {
    return this.zzfj;
  }
  
  public final Status getStatus()
  {
    return this.zzdy;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzbz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */