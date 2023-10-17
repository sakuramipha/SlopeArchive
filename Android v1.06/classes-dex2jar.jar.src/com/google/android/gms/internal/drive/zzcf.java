package com.google.android.gms.internal.drive;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DrivePreferencesApi.FileUploadPreferencesResult;
import com.google.android.gms.drive.FileUploadPreferences;

final class zzcf
  implements DrivePreferencesApi.FileUploadPreferencesResult
{
  private final Status zzdy;
  private final FileUploadPreferences zzfm;
  
  private zzcf(zzcb paramzzcb, Status paramStatus, FileUploadPreferences paramFileUploadPreferences)
  {
    this.zzdy = paramStatus;
    this.zzfm = paramFileUploadPreferences;
  }
  
  public final FileUploadPreferences getFileUploadPreferences()
  {
    return this.zzfm;
  }
  
  public final Status getStatus()
  {
    return this.zzdy;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzcf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */