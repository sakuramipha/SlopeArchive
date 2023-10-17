package com.google.android.gms.internal.drive;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.CreateFileActivityBuilder;
import com.google.android.gms.drive.Drive;
import com.google.android.gms.drive.DriveApi;
import com.google.android.gms.drive.DriveApi.DriveContentsResult;
import com.google.android.gms.drive.DriveApi.DriveIdResult;
import com.google.android.gms.drive.DriveApi.MetadataBufferResult;
import com.google.android.gms.drive.DriveFolder;
import com.google.android.gms.drive.OpenFileActivityBuilder;
import com.google.android.gms.drive.query.Query;

@Deprecated
public final class zzaf
  implements DriveApi
{
  public final PendingResult<DriveApi.DriveIdResult> fetchDriveId(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    return paramGoogleApiClient.enqueue(new zzai(this, paramGoogleApiClient, paramString));
  }
  
  public final DriveFolder getAppFolder(GoogleApiClient paramGoogleApiClient)
  {
    paramGoogleApiClient = (zzaw)paramGoogleApiClient.getClient(Drive.CLIENT_KEY);
    if (paramGoogleApiClient.zzag())
    {
      paramGoogleApiClient = paramGoogleApiClient.zzaf();
      if (paramGoogleApiClient != null) {
        return new zzbs(paramGoogleApiClient);
      }
      return null;
    }
    throw new IllegalStateException("Client is not yet connected");
  }
  
  public final DriveFolder getRootFolder(GoogleApiClient paramGoogleApiClient)
  {
    paramGoogleApiClient = (zzaw)paramGoogleApiClient.getClient(Drive.CLIENT_KEY);
    if (paramGoogleApiClient.zzag())
    {
      paramGoogleApiClient = paramGoogleApiClient.zzae();
      if (paramGoogleApiClient != null) {
        return new zzbs(paramGoogleApiClient);
      }
      return null;
    }
    throw new IllegalStateException("Client is not yet connected");
  }
  
  public final CreateFileActivityBuilder newCreateFileActivityBuilder()
  {
    return new CreateFileActivityBuilder();
  }
  
  public final PendingResult<DriveApi.DriveContentsResult> newDriveContents(GoogleApiClient paramGoogleApiClient)
  {
    return paramGoogleApiClient.enqueue(new zzah(this, paramGoogleApiClient, 536870912));
  }
  
  public final OpenFileActivityBuilder newOpenFileActivityBuilder()
  {
    return new OpenFileActivityBuilder();
  }
  
  public final PendingResult<DriveApi.MetadataBufferResult> query(GoogleApiClient paramGoogleApiClient, Query paramQuery)
  {
    if (paramQuery != null) {
      return paramGoogleApiClient.enqueue(new zzag(this, paramGoogleApiClient, paramQuery));
    }
    throw new IllegalArgumentException("Query must be provided.");
  }
  
  public final PendingResult<Status> requestSync(GoogleApiClient paramGoogleApiClient)
  {
    return paramGoogleApiClient.execute(new zzaj(this, paramGoogleApiClient));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzaf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */