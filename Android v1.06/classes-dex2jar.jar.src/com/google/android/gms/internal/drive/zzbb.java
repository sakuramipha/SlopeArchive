package com.google.android.gms.internal.drive;

import android.app.Activity;
import android.content.Context;
import android.content.IntentSender;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.drive.CreateFileActivityOptions;
import com.google.android.gms.drive.Drive.zza;
import com.google.android.gms.drive.DriveClient;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.OpenFileActivityOptions;
import com.google.android.gms.drive.TransferPreferences;
import com.google.android.gms.tasks.Task;

public final class zzbb
  extends DriveClient
{
  public zzbb(Activity paramActivity, Drive.zza paramzza)
  {
    super(paramActivity, paramzza);
  }
  
  public zzbb(Context paramContext, Drive.zza paramzza)
  {
    super(paramContext, paramzza);
  }
  
  public final Task<DriveId> getDriveId(String paramString)
  {
    Preconditions.checkNotNull(paramString, "resourceId must not be null");
    return doRead(new zzbc(this, paramString));
  }
  
  public final Task<TransferPreferences> getUploadPreferences()
  {
    return doRead(new zzbd(this));
  }
  
  public final Task<IntentSender> newCreateFileActivityIntentSender(CreateFileActivityOptions paramCreateFileActivityOptions)
  {
    return doRead(new zzbg(this, paramCreateFileActivityOptions));
  }
  
  public final Task<IntentSender> newOpenFileActivityIntentSender(OpenFileActivityOptions paramOpenFileActivityOptions)
  {
    return doRead(new zzbf(this, paramOpenFileActivityOptions));
  }
  
  public final Task<Void> requestSync()
  {
    return doWrite(new zzbh(this));
  }
  
  public final Task<Void> setUploadPreferences(TransferPreferences paramTransferPreferences)
  {
    Preconditions.checkNotNull(paramTransferPreferences, "transferPreferences cannot be null.");
    return doWrite(new zzbe(this, paramTransferPreferences));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzbb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */