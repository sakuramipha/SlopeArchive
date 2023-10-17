package com.google.android.gms.drive;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

@Deprecated
public abstract interface DrivePreferencesApi
{
  @Deprecated
  public abstract PendingResult<FileUploadPreferencesResult> getFileUploadPreferences(GoogleApiClient paramGoogleApiClient);
  
  @Deprecated
  public abstract PendingResult<Status> setFileUploadPreferences(GoogleApiClient paramGoogleApiClient, FileUploadPreferences paramFileUploadPreferences);
  
  @Deprecated
  public static abstract interface FileUploadPreferencesResult
    extends Result
  {
    public abstract FileUploadPreferences getFileUploadPreferences();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\DrivePreferencesApi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */