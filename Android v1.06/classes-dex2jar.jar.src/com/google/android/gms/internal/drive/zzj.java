package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.zze;
import com.google.android.gms.drive.events.zzt;
import com.google.android.gms.drive.events.zzx;

public final class zzj
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzj> CREATOR = new zzk();
  private final zze zzbv;
  final int zzda;
  private final zzx zzdb;
  private final zzt zzdc;
  final DriveId zzk;
  
  public zzj(int paramInt, DriveId paramDriveId)
  {
    this((DriveId)Preconditions.checkNotNull(paramDriveId), 1, null, null, null);
  }
  
  zzj(DriveId paramDriveId, int paramInt, zze paramzze, zzx paramzzx, zzt paramzzt)
  {
    this.zzk = paramDriveId;
    this.zzda = paramInt;
    this.zzbv = paramzze;
    this.zzdb = paramzzx;
    this.zzdc = paramzzt;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeParcelable(paramParcel, 2, this.zzk, paramInt, false);
    SafeParcelWriter.writeInt(paramParcel, 3, this.zzda);
    SafeParcelWriter.writeParcelable(paramParcel, 4, this.zzbv, paramInt, false);
    SafeParcelWriter.writeParcelable(paramParcel, 5, this.zzdb, paramInt, false);
    SafeParcelWriter.writeParcelable(paramParcel, 6, this.zzdc, paramInt, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */