package com.google.android.gms.drive;

import android.content.IntentSender;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.drive.zzbi;
import com.google.android.gms.internal.drive.zzt;

@Deprecated
public class CreateFileActivityBuilder
{
  public static final String EXTRA_RESPONSE_DRIVE_ID = "response_drive_id";
  private final zzt zzn = new zzt(0);
  private DriveContents zzo;
  private boolean zzp;
  
  public IntentSender build(GoogleApiClient paramGoogleApiClient)
  {
    Preconditions.checkState(paramGoogleApiClient.isConnected(), "Client must be connected");
    zzg();
    return this.zzn.build(paramGoogleApiClient);
  }
  
  final int getRequestId()
  {
    return this.zzn.getRequestId();
  }
  
  public CreateFileActivityBuilder setActivityStartFolder(DriveId paramDriveId)
  {
    this.zzn.zza(paramDriveId);
    return this;
  }
  
  public CreateFileActivityBuilder setActivityTitle(String paramString)
  {
    this.zzn.zzc(paramString);
    return this;
  }
  
  public CreateFileActivityBuilder setInitialDriveContents(DriveContents paramDriveContents)
  {
    if (paramDriveContents != null)
    {
      if ((paramDriveContents instanceof zzbi))
      {
        if (paramDriveContents.getDriveId() == null)
        {
          if (!paramDriveContents.zzk())
          {
            this.zzn.zzd(paramDriveContents.zzi().zzj);
            this.zzo = paramDriveContents;
          }
          else
          {
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
    else {
      this.zzn.zzd(1);
    }
    this.zzp = true;
    return this;
  }
  
  public CreateFileActivityBuilder setInitialMetadata(MetadataChangeSet paramMetadataChangeSet)
  {
    this.zzn.zza(paramMetadataChangeSet);
    return this;
  }
  
  final MetadataChangeSet zzc()
  {
    return this.zzn.zzc();
  }
  
  final DriveId zzd()
  {
    return this.zzn.zzd();
  }
  
  final String zze()
  {
    return this.zzn.zze();
  }
  
  final int zzf()
  {
    return 0;
  }
  
  final void zzg()
  {
    Preconditions.checkState(this.zzp, "Must call setInitialDriveContents.");
    DriveContents localDriveContents = this.zzo;
    if (localDriveContents != null) {
      localDriveContents.zzj();
    }
    this.zzn.zzg();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\CreateFileActivityBuilder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */