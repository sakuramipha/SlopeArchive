package com.google.android.gms.drive;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import java.io.InputStream;
import java.io.OutputStream;

public abstract interface DriveContents
{
  @Deprecated
  public abstract PendingResult<Status> commit(GoogleApiClient paramGoogleApiClient, MetadataChangeSet paramMetadataChangeSet);
  
  @Deprecated
  public abstract PendingResult<Status> commit(GoogleApiClient paramGoogleApiClient, MetadataChangeSet paramMetadataChangeSet, ExecutionOptions paramExecutionOptions);
  
  @Deprecated
  public abstract void discard(GoogleApiClient paramGoogleApiClient);
  
  public abstract DriveId getDriveId();
  
  public abstract InputStream getInputStream();
  
  public abstract int getMode();
  
  public abstract OutputStream getOutputStream();
  
  public abstract ParcelFileDescriptor getParcelFileDescriptor();
  
  @Deprecated
  public abstract PendingResult<DriveApi.DriveContentsResult> reopenForWrite(GoogleApiClient paramGoogleApiClient);
  
  public abstract Contents zzi();
  
  public abstract void zzj();
  
  public abstract boolean zzk();
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\DriveContents.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */