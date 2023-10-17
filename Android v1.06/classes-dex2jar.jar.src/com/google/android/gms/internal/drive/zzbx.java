package com.google.android.gms.internal.drive;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveFile;
import com.google.android.gms.drive.DriveFolder.DriveFileResult;

final class zzbx
  implements DriveFolder.DriveFileResult
{
  private final Status zzdy;
  private final DriveFile zzfi;
  
  public zzbx(Status paramStatus, DriveFile paramDriveFile)
  {
    this.zzdy = paramStatus;
    this.zzfi = paramDriveFile;
  }
  
  public final DriveFile getDriveFile()
  {
    return this.zzfi;
  }
  
  public final Status getStatus()
  {
    return this.zzdy;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzbx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */