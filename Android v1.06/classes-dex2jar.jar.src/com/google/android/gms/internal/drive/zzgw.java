package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.DriveId;
import java.util.List;

public final class zzgw
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzgw> CREATOR = new zzgx();
  private final DriveId zzis;
  private final List<DriveId> zzit;
  
  public zzgw(DriveId paramDriveId, List<DriveId> paramList)
  {
    this.zzis = paramDriveId;
    this.zzit = paramList;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeParcelable(paramParcel, 2, this.zzis, paramInt, false);
    SafeParcelWriter.writeTypedList(paramParcel, 3, this.zzit, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzgw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */