package com.google.android.gms.drive;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.events.ChangeListener;
import java.util.Set;

public abstract interface DriveResource
{
  @Deprecated
  public abstract PendingResult<Status> addChangeListener(GoogleApiClient paramGoogleApiClient, ChangeListener paramChangeListener);
  
  @Deprecated
  public abstract PendingResult<Status> addChangeSubscription(GoogleApiClient paramGoogleApiClient);
  
  @Deprecated
  public abstract PendingResult<Status> delete(GoogleApiClient paramGoogleApiClient);
  
  public abstract DriveId getDriveId();
  
  @Deprecated
  public abstract PendingResult<MetadataResult> getMetadata(GoogleApiClient paramGoogleApiClient);
  
  @Deprecated
  public abstract PendingResult<DriveApi.MetadataBufferResult> listParents(GoogleApiClient paramGoogleApiClient);
  
  @Deprecated
  public abstract PendingResult<Status> removeChangeListener(GoogleApiClient paramGoogleApiClient, ChangeListener paramChangeListener);
  
  @Deprecated
  public abstract PendingResult<Status> removeChangeSubscription(GoogleApiClient paramGoogleApiClient);
  
  @Deprecated
  public abstract PendingResult<Status> setParents(GoogleApiClient paramGoogleApiClient, Set<DriveId> paramSet);
  
  @Deprecated
  public abstract PendingResult<Status> trash(GoogleApiClient paramGoogleApiClient);
  
  @Deprecated
  public abstract PendingResult<Status> untrash(GoogleApiClient paramGoogleApiClient);
  
  @Deprecated
  public abstract PendingResult<MetadataResult> updateMetadata(GoogleApiClient paramGoogleApiClient, MetadataChangeSet paramMetadataChangeSet);
  
  @Deprecated
  public static abstract interface MetadataResult
    extends Result
  {
    public abstract Metadata getMetadata();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\DriveResource.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */