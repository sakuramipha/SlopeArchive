package com.google.android.gms.drive;

import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.drive.zzq;

public final class CreateFileActivityOptions
  extends zzq
{
  public static final String EXTRA_RESPONSE_DRIVE_ID = "response_drive_id";
  
  private CreateFileActivityOptions(MetadataBundle paramMetadataBundle, Integer paramInteger, String paramString, DriveId paramDriveId, int paramInt)
  {
    super(paramMetadataBundle, paramInteger, paramString, paramDriveId, paramInt);
  }
  
  public static class Builder
  {
    protected final CreateFileActivityBuilder builder = new CreateFileActivityBuilder();
    
    public CreateFileActivityOptions build()
    {
      this.builder.zzg();
      return new CreateFileActivityOptions(this.builder.zzc().zzq(), Integer.valueOf(this.builder.getRequestId()), this.builder.zze(), this.builder.zzd(), this.builder.zzf(), null);
    }
    
    public Builder setActivityStartFolder(DriveId paramDriveId)
    {
      this.builder.setActivityStartFolder(paramDriveId);
      return this;
    }
    
    public Builder setActivityTitle(String paramString)
    {
      this.builder.setActivityTitle(paramString);
      return this;
    }
    
    public Builder setInitialDriveContents(DriveContents paramDriveContents)
    {
      this.builder.setInitialDriveContents(paramDriveContents);
      return this;
    }
    
    public Builder setInitialMetadata(MetadataChangeSet paramMetadataChangeSet)
    {
      this.builder.setInitialMetadata(paramMetadataChangeSet);
      return this;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\CreateFileActivityOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */