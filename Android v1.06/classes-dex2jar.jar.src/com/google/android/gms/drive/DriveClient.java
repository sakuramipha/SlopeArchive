package com.google.android.gms.drive;

import android.app.Activity;
import android.content.Context;
import android.content.IntentSender;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApi.Settings;
import com.google.android.gms.tasks.Task;

@Deprecated
public abstract class DriveClient
  extends GoogleApi<Drive.zza>
{
  public DriveClient(Activity paramActivity, Drive.zza paramzza)
  {
    super(paramActivity, Drive.zzw, paramzza, GoogleApi.Settings.DEFAULT_SETTINGS);
  }
  
  public DriveClient(Context paramContext, Drive.zza paramzza)
  {
    super(paramContext, Drive.zzw, paramzza, GoogleApi.Settings.DEFAULT_SETTINGS);
  }
  
  @Deprecated
  public abstract Task<DriveId> getDriveId(String paramString);
  
  @Deprecated
  public abstract Task<TransferPreferences> getUploadPreferences();
  
  @Deprecated
  public abstract Task<IntentSender> newCreateFileActivityIntentSender(CreateFileActivityOptions paramCreateFileActivityOptions);
  
  @Deprecated
  public abstract Task<IntentSender> newOpenFileActivityIntentSender(OpenFileActivityOptions paramOpenFileActivityOptions);
  
  @Deprecated
  public abstract Task<Void> requestSync();
  
  @Deprecated
  public abstract Task<Void> setUploadPreferences(TransferPreferences paramTransferPreferences);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\DriveClient.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */