package com.google.android.gms.drive;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.drive.query.Query;

public abstract interface DriveFolder
  extends DriveResource
{
  public static final String MIME_TYPE = "application/vnd.google-apps.folder";
  
  @Deprecated
  public abstract PendingResult<DriveFileResult> createFile(GoogleApiClient paramGoogleApiClient, MetadataChangeSet paramMetadataChangeSet, DriveContents paramDriveContents);
  
  @Deprecated
  public abstract PendingResult<DriveFileResult> createFile(GoogleApiClient paramGoogleApiClient, MetadataChangeSet paramMetadataChangeSet, DriveContents paramDriveContents, ExecutionOptions paramExecutionOptions);
  
  @Deprecated
  public abstract PendingResult<DriveFolderResult> createFolder(GoogleApiClient paramGoogleApiClient, MetadataChangeSet paramMetadataChangeSet);
  
  @Deprecated
  public abstract PendingResult<DriveApi.MetadataBufferResult> listChildren(GoogleApiClient paramGoogleApiClient);
  
  @Deprecated
  public abstract PendingResult<DriveApi.MetadataBufferResult> queryChildren(GoogleApiClient paramGoogleApiClient, Query paramQuery);
  
  @Deprecated
  public static abstract interface DriveFileResult
    extends Result
  {
    public abstract DriveFile getDriveFile();
  }
  
  @Deprecated
  public static abstract interface DriveFolderResult
    extends Result
  {
    public abstract DriveFolder getDriveFolder();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\DriveFolder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */