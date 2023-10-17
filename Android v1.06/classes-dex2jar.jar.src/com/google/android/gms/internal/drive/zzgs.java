package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.zzt;

public final class zzgs
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzgs> CREATOR = new zzgt();
  private final int zzda;
  private final zzt zzdc;
  private final DriveId zzk;
  
  public zzgs(DriveId paramDriveId, int paramInt)
  {
    this(paramDriveId, paramInt, null);
  }
  
  zzgs(DriveId paramDriveId, int paramInt, zzt paramzzt)
  {
    this.zzk = paramDriveId;
    this.zzda = paramInt;
    this.zzdc = paramzzt;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeParcelable(paramParcel, 2, this.zzk, paramInt, false);
    SafeParcelWriter.writeInt(paramParcel, 3, this.zzda);
    SafeParcelWriter.writeParcelable(paramParcel, 4, this.zzdc, paramInt, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzgs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */