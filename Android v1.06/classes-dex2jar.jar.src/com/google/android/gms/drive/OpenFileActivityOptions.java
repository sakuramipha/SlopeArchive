package com.google.android.gms.drive;

import com.google.android.gms.drive.query.Filter;
import com.google.android.gms.drive.query.internal.FilterHolder;
import java.util.List;

public final class OpenFileActivityOptions
{
  public static final String EXTRA_RESPONSE_DRIVE_ID = "response_drive_id";
  public final String zzba;
  public final String[] zzbb;
  public final DriveId zzbd;
  public final FilterHolder zzbe;
  
  private OpenFileActivityOptions(String paramString, String[] paramArrayOfString, Filter paramFilter, DriveId paramDriveId)
  {
    this.zzba = paramString;
    this.zzbb = paramArrayOfString;
    if (paramFilter == null) {
      paramString = null;
    } else {
      paramString = new FilterHolder(paramFilter);
    }
    this.zzbe = paramString;
    this.zzbd = paramDriveId;
  }
  
  public static class Builder
  {
    private final OpenFileActivityBuilder zzbf = new OpenFileActivityBuilder();
    
    public OpenFileActivityOptions build()
    {
      this.zzbf.zzg();
      return new OpenFileActivityOptions(this.zzbf.getTitle(), this.zzbf.zzs(), this.zzbf.zzt(), this.zzbf.zzu(), null);
    }
    
    public Builder setActivityStartFolder(DriveId paramDriveId)
    {
      this.zzbf.setActivityStartFolder(paramDriveId);
      return this;
    }
    
    public Builder setActivityTitle(String paramString)
    {
      this.zzbf.setActivityTitle(paramString);
      return this;
    }
    
    public Builder setMimeType(List<String> paramList)
    {
      this.zzbf.setMimeType((String[])paramList.toArray(new String[0]));
      return this;
    }
    
    public Builder setSelectionFilter(Filter paramFilter)
    {
      this.zzbf.setSelectionFilter(paramFilter);
      return this;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\OpenFileActivityOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */