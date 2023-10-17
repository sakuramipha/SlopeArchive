package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.DriveId;

public final class zzgj
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzgj> CREATOR = new zzgk();
  private final int mode;
  private final DriveId zzdd;
  private final int zzip;
  
  public zzgj(DriveId paramDriveId, int paramInt1, int paramInt2)
  {
    this.zzdd = paramDriveId;
    this.mode = paramInt1;
    this.zzip = paramInt2;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeParcelable(paramParcel, 2, this.zzdd, paramInt, false);
    SafeParcelWriter.writeInt(paramParcel, 3, this.mode);
    SafeParcelWriter.writeInt(paramParcel, 4, this.zzip);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzgj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */