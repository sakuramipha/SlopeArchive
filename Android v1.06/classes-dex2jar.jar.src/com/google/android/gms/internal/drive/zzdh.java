package com.google.android.gms.internal.drive;

import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.drive.DriveContents;
import com.google.android.gms.drive.DriveFile;
import com.google.android.gms.drive.DriveFolder;
import com.google.android.gms.drive.ExecutionOptions;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.drive.metadata.internal.zzk;

final class zzdh
  extends TaskApiCall<zzaw, DriveFile>
{
  private final DriveFolder zzfj;
  private final MetadataChangeSet zzgc;
  private ExecutionOptions zzgd;
  private String zzge;
  private zzk zzgf;
  private final DriveContents zzo;
  
  zzdh(DriveFolder paramDriveFolder, MetadataChangeSet paramMetadataChangeSet, DriveContents paramDriveContents, ExecutionOptions paramExecutionOptions, String paramString)
  {
    this.zzfj = paramDriveFolder;
    this.zzgc = paramMetadataChangeSet;
    this.zzo = paramDriveContents;
    this.zzgd = paramExecutionOptions;
    this.zzge = null;
    Preconditions.checkNotNull(paramDriveFolder, "DriveFolder must not be null");
    Preconditions.checkNotNull(paramDriveFolder.getDriveId(), "Folder's DriveId must not be null");
    Preconditions.checkNotNull(paramMetadataChangeSet, "MetadataChangeSet must not be null");
    Preconditions.checkNotNull(paramExecutionOptions, "ExecutionOptions must not be null");
    paramDriveFolder = zzk.zzg(paramMetadataChangeSet.getMimeType());
    this.zzgf = paramDriveFolder;
    if ((paramDriveFolder != null) && (paramDriveFolder.isFolder())) {
      throw new IllegalArgumentException("May not create folders using this method. Use DriveFolderManagerClient#createFolder() instead of mime type application/vnd.google-apps.folder");
    }
    if (paramDriveContents != null) {
      if ((paramDriveContents instanceof zzbi))
      {
        if (paramDriveContents.getDriveId() == null)
        {
          if (paramDriveContents.zzk()) {
            throw new IllegalArgumentException("DriveContents are already closed.");
          }
        }
        else {
          throw new IllegalArgumentException("Only DriveContents obtained through DriveApi.newDriveContents are accepted for file creation.");
        }
      }
      else {
        throw new IllegalArgumentException("Only DriveContents obtained from the Drive API are accepted.");
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzdh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */