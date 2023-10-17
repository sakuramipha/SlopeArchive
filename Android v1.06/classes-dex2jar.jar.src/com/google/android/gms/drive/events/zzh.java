package com.google.android.gms.drive.events;

import android.os.Looper;
import java.util.concurrent.CountDownLatch;

final class zzh
  extends Thread
{
  private final DriveEventService zzco;
  
  zzh(DriveEventService paramDriveEventService, CountDownLatch paramCountDownLatch) {}
  
  public final void run()
  {
    try
    {
      Looper.prepare();
      DriveEventService localDriveEventService = this.zzco;
      DriveEventService.zza localzza = new com/google/android/gms/drive/events/DriveEventService$zza;
      localzza.<init>(this.zzco, null);
      localDriveEventService.zzck = localzza;
      this.zzco.zzcl = false;
      this.zzcn.countDown();
      Looper.loop();
      return;
    }
    finally
    {
      if (DriveEventService.zzb(this.zzco) != null) {
        DriveEventService.zzb(this.zzco).countDown();
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\events\zzh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */