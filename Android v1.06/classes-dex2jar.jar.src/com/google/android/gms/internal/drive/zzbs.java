package com.google.android.gms.internal.drive;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveApi.MetadataBufferResult;
import com.google.android.gms.drive.DriveContents;
import com.google.android.gms.drive.DriveFolder;
import com.google.android.gms.drive.DriveFolder.DriveFileResult;
import com.google.android.gms.drive.DriveFolder.DriveFolderResult;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.ExecutionOptions;
import com.google.android.gms.drive.ExecutionOptions.Builder;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.drive.metadata.internal.zzk;
import com.google.android.gms.drive.query.Filters;
import com.google.android.gms.drive.query.Query;
import com.google.android.gms.drive.query.Query.Builder;
import com.google.android.gms.drive.query.SearchableField;

public final class zzbs
  extends zzdp
  implements DriveFolder
{
  public zzbs(DriveId paramDriveId)
  {
    super(paramDriveId);
  }
  
  static int zza(DriveContents paramDriveContents, zzk paramzzk)
  {
    int i;
    if (paramDriveContents == null)
    {
      if ((paramzzk != null) && (paramzzk.zzbh())) {
        i = 0;
      } else {
        i = 1;
      }
    }
    else
    {
      i = paramDriveContents.zzi().getRequestId();
      paramDriveContents.zzj();
    }
    return i;
  }
  
  static Query zza(Query paramQuery, DriveId paramDriveId)
  {
    paramDriveId = new Query.Builder().addFilter(Filters.in(SearchableField.PARENTS, paramDriveId));
    if (paramQuery != null)
    {
      if (paramQuery.getFilter() != null) {
        paramDriveId.addFilter(paramQuery.getFilter());
      }
      paramDriveId.setPageToken(paramQuery.getPageToken());
      paramDriveId.setSortOrder(paramQuery.getSortOrder());
    }
    return paramDriveId.build();
  }
  
  static void zzb(MetadataChangeSet paramMetadataChangeSet)
  {
    if (paramMetadataChangeSet != null)
    {
      paramMetadataChangeSet = zzk.zzg(paramMetadataChangeSet.getMimeType());
      if (paramMetadataChangeSet != null)
      {
        int i;
        if ((!paramMetadataChangeSet.zzbh()) && (!paramMetadataChangeSet.isFolder())) {
          i = 1;
        } else {
          i = 0;
        }
        if (i == 0) {
          throw new IllegalArgumentException("May not create shortcut files using this method. Use DriveFolder.createShortcutFile() instead.");
        }
      }
      return;
    }
    throw new IllegalArgumentException("MetadataChangeSet must be provided.");
  }
  
  public final PendingResult<DriveFolder.DriveFileResult> createFile(GoogleApiClient paramGoogleApiClient, MetadataChangeSet paramMetadataChangeSet, DriveContents paramDriveContents)
  {
    return createFile(paramGoogleApiClient, paramMetadataChangeSet, paramDriveContents, null);
  }
  
  public final PendingResult<DriveFolder.DriveFileResult> createFile(GoogleApiClient paramGoogleApiClient, MetadataChangeSet paramMetadataChangeSet, DriveContents paramDriveContents, ExecutionOptions paramExecutionOptions)
  {
    ExecutionOptions localExecutionOptions = paramExecutionOptions;
    if (paramExecutionOptions == null) {
      localExecutionOptions = new ExecutionOptions.Builder().build();
    }
    if (localExecutionOptions.zzn() == 0)
    {
      if (paramMetadataChangeSet != null)
      {
        paramExecutionOptions = zzk.zzg(paramMetadataChangeSet.getMimeType());
        if ((paramExecutionOptions != null) && (paramExecutionOptions.isFolder())) {
          throw new IllegalArgumentException("May not create folders using this method. Use DriveFolder.createFolder() instead of mime type application/vnd.google-apps.folder");
        }
        if (localExecutionOptions != null)
        {
          localExecutionOptions.zza(paramGoogleApiClient);
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
          zzb(paramMetadataChangeSet);
          int j = zza(paramDriveContents, zzk.zzg(paramMetadataChangeSet.getMimeType()));
          paramDriveContents = zzk.zzg(paramMetadataChangeSet.getMimeType());
          int i;
          if ((paramDriveContents != null) && (paramDriveContents.zzbh())) {
            i = 1;
          } else {
            i = 0;
          }
          return paramGoogleApiClient.execute(new zzbt(this, paramGoogleApiClient, paramMetadataChangeSet, j, i, localExecutionOptions));
        }
        throw new IllegalArgumentException("ExecutionOptions must be provided");
      }
      throw new IllegalArgumentException("MetadataChangeSet must be provided.");
    }
    throw new IllegalStateException("May not set a conflict strategy for new file creation.");
  }
  
  public final PendingResult<DriveFolder.DriveFolderResult> createFolder(GoogleApiClient paramGoogleApiClient, MetadataChangeSet paramMetadataChangeSet)
  {
    if (paramMetadataChangeSet != null)
    {
      if ((paramMetadataChangeSet.getMimeType() != null) && (!paramMetadataChangeSet.getMimeType().equals("application/vnd.google-apps.folder"))) {
        throw new IllegalArgumentException("The mimetype must be of type application/vnd.google-apps.folder");
      }
      return paramGoogleApiClient.execute(new zzbu(this, paramGoogleApiClient, paramMetadataChangeSet));
    }
    throw new IllegalArgumentException("MetadataChangeSet must be provided.");
  }
  
  public final PendingResult<DriveApi.MetadataBufferResult> listChildren(GoogleApiClient paramGoogleApiClient)
  {
    return queryChildren(paramGoogleApiClient, null);
  }
  
  public final PendingResult<DriveApi.MetadataBufferResult> queryChildren(GoogleApiClient paramGoogleApiClient, Query paramQuery)
  {
    return new zzaf().query(paramGoogleApiClient, zza(paramQuery, getDriveId()));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzbs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */