package com.google.android.gms.drive.events;

import com.google.android.gms.drive.DriveContents;

public abstract class OpenFileCallback
{
  public abstract void onContents(DriveContents paramDriveContents);
  
  public abstract void onError(Exception paramException);
  
  public abstract void onProgress(long paramLong1, long paramLong2);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\events\OpenFileCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */