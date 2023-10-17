package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.DriveId;

public final class zzek
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzek> CREATOR = new zzel();
  private final DriveId zzdd;
  private final boolean zzha;
  
  public zzek(DriveId paramDriveId, boolean paramBoolean)
  {
    this.zzdd = paramDriveId;
    this.zzha = paramBoolean;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeParcelable(paramParcel, 2, this.zzdd, paramInt, false);
    SafeParcelWriter.writeBoolean(paramParcel, 3, this.zzha);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzek.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */