package com.google.android.gms.internal.drive;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.OnChangeListener;
import com.google.android.gms.drive.events.zzj;

final class zzdi
{
  private OnChangeListener zzgg;
  private zzee zzgh;
  private DriveId zzk;
  
  zzdi(zzch paramzzch, OnChangeListener paramOnChangeListener, DriveId paramDriveId)
  {
    Preconditions.checkState(zzj.zza(1, paramDriveId));
    this.zzgg = paramOnChangeListener;
    this.zzk = paramDriveId;
    paramDriveId = paramzzch.getLooper();
    paramzzch = paramzzch.getApplicationContext();
    paramOnChangeListener.getClass();
    paramzzch = new zzee(paramDriveId, paramzzch, 1, zzdj.zza(paramOnChangeListener));
    this.zzgh = paramzzch;
    paramzzch.zzf(1);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzdi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */