package com.google.android.gms.internal.drive;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.drive.DriveApi.DriveContentsResult;
import com.google.android.gms.drive.DriveFile;
import com.google.android.gms.drive.DriveFile.DownloadProgressListener;
import com.google.android.gms.drive.DriveId;

public final class zzbn
  extends zzdp
  implements DriveFile
{
  public zzbn(DriveId paramDriveId)
  {
    super(paramDriveId);
  }
  
  public final PendingResult<DriveApi.DriveContentsResult> open(GoogleApiClient paramGoogleApiClient, int paramInt, DriveFile.DownloadProgressListener paramDownloadProgressListener)
  {
    if ((paramInt != 268435456) && (paramInt != 536870912) && (paramInt != 805306368)) {
      throw new IllegalArgumentException("Invalid mode provided.");
    }
    if (paramDownloadProgressListener == null) {
      paramDownloadProgressListener = null;
    } else {
      paramDownloadProgressListener = new zzbp(paramGoogleApiClient.registerListener(paramDownloadProgressListener));
    }
    return paramGoogleApiClient.enqueue(new zzbo(this, paramGoogleApiClient, paramInt, paramDownloadProgressListener));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzbn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */