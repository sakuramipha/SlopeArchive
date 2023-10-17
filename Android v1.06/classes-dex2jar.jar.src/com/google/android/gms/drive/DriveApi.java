package com.google.android.gms.drive;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.query.Query;

@Deprecated
public abstract interface DriveApi
{
  @Deprecated
  public abstract PendingResult<DriveIdResult> fetchDriveId(GoogleApiClient paramGoogleApiClient, String paramString);
  
  @Deprecated
  public abstract DriveFolder getAppFolder(GoogleApiClient paramGoogleApiClient);
  
  @Deprecated
  public abstract DriveFolder getRootFolder(GoogleApiClient paramGoogleApiClient);
  
  @Deprecated
  public abstract CreateFileActivityBuilder newCreateFileActivityBuilder();
  
  @Deprecated
  public abstract PendingResult<DriveContentsResult> newDriveContents(GoogleApiClient paramGoogleApiClient);
  
  @Deprecated
  public abstract OpenFileActivityBuilder newOpenFileActivityBuilder();
  
  @Deprecated
  public abstract PendingResult<MetadataBufferResult> query(GoogleApiClient paramGoogleApiClient, Query paramQuery);
  
  @Deprecated
  public abstract PendingResult<Status> requestSync(GoogleApiClient paramGoogleApiClient);
  
  @Deprecated
  public static abstract interface DriveContentsResult
    extends Result
  {
    public abstract DriveContents getDriveContents();
  }
  
  @Deprecated
  public static abstract interface DriveIdResult
    extends Result
  {
    public abstract DriveId getDriveId();
  }
  
  @Deprecated
  public static abstract interface MetadataBufferResult
    extends Releasable, Result
  {
    public abstract MetadataBuffer getMetadataBuffer();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\DriveApi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */