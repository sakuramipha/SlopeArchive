package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.DriveId;

public final class zzfn
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzfn> CREATOR = new zzfo();
  DriveId zzdd;
  
  public zzfn(DriveId paramDriveId)
  {
    this.zzdd = paramDriveId;
  }
  
  public final DriveId getDriveId()
  {
    return this.zzdd;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeParcelable(paramParcel, 2, this.zzdd, paramInt, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzfn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */